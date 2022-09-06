import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int a =sc.nextInt();
		int [] array = new int[a];
		System.out.println();
		for(int i=0;i<a;i++) {
			System.out.println("Enter the "+i+" Element");
			array[i]=sc.nextInt();
		}
		for(int k=0;k<(a-1);k++) {
			for(int m=0;m<(a-k-1);m++) {
				if(array[m]>array[m+1]){
					int val = array[m];
					array[m]=array[m+1];
					array[m+1]=val;
					
				}
			}
		}
		System.out.println("\n The Elements in the array after sorting is: ");
		for(int k = 0;k<a;k++) {
			System.out.print(array[k]+" ");
		}
		

	}

}