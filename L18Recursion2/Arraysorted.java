package L18Recursion2;

public class Arraysorted {
    public static boolean checkIfIncresing(int arr[],int idx){
        if (idx==arr.length-1) {
            return true;
        }
        if (!checkIfIncresing(arr, idx+1)) {
            return false;
        }

        return arr[idx]<arr[idx+1]

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,6,3,6,7,};
        if (checkIfIncresing(arr2, 0)) {
            System.out.println("Strictly Increasing");
            
        }else{
            System.out.println("Not strictly Incressing");
        }
    }
}
