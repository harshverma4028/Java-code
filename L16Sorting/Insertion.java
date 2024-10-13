package L16Sorting;

public class Insertion {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};

        //insertion sort
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
               while (j>=0 && arr[j]>current) {
                //keep swaping
                arr[j+1]=arr[j];
                j--;
               }
               arr[j+1]=current;
        }
        printArray(arr);
    }
}
