//Kevin R
public class SmallestLargest{
    public static void main(String[] args){
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * (100 - 1 + 1)) + 1;
        }
        System.out.println("The smallest value is: " + smallestValue(arr));
        System.out.println("The biggest value is: " + largestValue(arr));
    }
    
    public static int smallestValue(int[] l){
        int low = l[0];
        for (int i = 1; i < 10; i++){
            if (l[i] < low){
                low = l[i];
            }
        }
        return low;
    }
    
    public static int largestValue(int[] h){
        int high = h[0];
        for (int i = 1; i < 10; i++){
            if (h[i] > high){
                high = h[i];
            }
        }
        return high;
    }
}