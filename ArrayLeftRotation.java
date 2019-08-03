import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayLeftRotation {
    public static void main(String[] s){
        int[] a ={5,2,4,3,1};
        System.out.print(Arrays.toString(leftRotate(a,3))); // here the second parameter specifies the no. of left rotates
    }

    public static int[] leftRotate(int[] a, int d){
        int[] subarray = IntStream.range(0, d).map(i -> a[i]).toArray();
        int[] subarray2 = IntStream.range(d, a.length).map(i -> a[i]).toArray();
        IntStream rotatedStream = IntStream.concat(Arrays.stream(subarray2), Arrays.stream(subarray));
       return rotatedStream.toArray();
    }
}
