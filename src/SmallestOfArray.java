
public class SmallestOfArray {
	public static void main(String[] args) {

        //Initialize array
        int [] arr = {2, 1, 3, 7, 5};
        //Initialize max with first element of array.
        int min = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Largest element in array: " + min);
    }
}
