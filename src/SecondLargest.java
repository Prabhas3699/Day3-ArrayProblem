
public class SecondLargest {
	public static int getSecondLargest(int[] a, int total){
        int temp;
        //Sort the array 
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={1,2,5,6,7,9};
        //Displaying second largest
        System.out.println("Second Largest: "+getSecondLargest(a,a.length));
    }
}
