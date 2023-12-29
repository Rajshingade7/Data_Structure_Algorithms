package Sorting_Algorithms;

public class Sorting_Algorithms {

	void print_array(int a[]) {
		System.out.println("array has");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
			}
		}
	void bubblesort(int a[]) {
		for (int i=0;i<a.length-1;i++) {//Here we are providing the passes
			for(int j=0;j<a.length-1;j++) {//Here it is actually sorting the data
				if(a[j]>a[j+1]) {
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	void bubblesort_v2(int a[]) {
		for (int i=0;i<a.length-1;i++) {//Here we are providing the passes
			for(int j=0;j<a.length-1-i;j++) {//Here it is actually sorting the data but here in each pass it is decresing the value
				if(a[j]>a[j+1]) {
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	void bubblesort_v3(int a[]) {
		boolean flag=true;
		for (int i=0;i<a.length-1;i++) {//Here we are providing the passes
			for(int j=0;j<a.length-1;j++) {//Here it is actually sorting the data and flag is used for that data is already sorted
				if(a[j]>a[j+1]) {
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
				
			}
			if(flag==false) {
				System.out.println("Sorted and done");
			}
		}
	}
	void selectionsort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;

			for(int j=i+1;j<a.length-1;j++) {
				if(a[min]>a[j]) {
					
					min=j;
					
				}
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
				
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {66,11,33,99,88,22,44,55,77};
		int b[]= {11,22,44,33,55,66,77,88,99};
		Sorting_Algorithms obj=new Sorting_Algorithms();
//		obj.print_array(a);
		//obj.bubblesort_v3(b);
		obj.selectionsort(a);
		obj.print_array(a);
	}
}
