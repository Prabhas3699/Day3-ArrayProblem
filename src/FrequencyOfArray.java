
public class FrequencyOfArray {
	public static void main(String[] args) {
        //Initialize array
        int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array fq will store frequencies of element
        int [] fq = new int [arr.length];
        int temp = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fq[j] = temp;
                }
            }
            if(fq[i] != temp)
                fq[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println(" Element | Frequency");
        for(int i = 0; i < fq.length; i++){
            if(fq[i] != temp)
                System.out.println("    " + arr[i] + "    |    " + fq[i]);
        }
    }
}
