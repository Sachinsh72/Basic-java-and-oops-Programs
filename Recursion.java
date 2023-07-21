public class Recursion {

    public  static void print(int[]arr,int sIndex){
        //termination condition
        if(sIndex>= arr.length){
            //stop
            return;
        }

        //logic
        System.out.println(arr[sIndex]);

        //recursive case            - if recursive case after the logic it will print in forward direction, if before the logic it will print in reverse order.
        print(arr, sIndex+1);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        print(arr,0);
    }
}
