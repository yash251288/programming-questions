import java.util.ArrayList;
import java.util.Collections;

public class MaxSubMatrixSum {

    public static void main(String[] s) {
              //  -1 -1 0 -9 -2 -2
              //  -2 -1 -6 -8 -2 -5
              //  -1 -1 -1 -2 -3 -4
              //  -1 -9 -2 -4 -4 -5
              //  -7 -3 -3 -2 -9 -9
              //  -1 -3 -1 -2 -4 -5
        int arr[][] = {{-1, -1, 0, -9, -2, -2}, {-2, -1, -6, -8, -2, -5}, {-1, -1, -1, -2, -3, -4}, { -1 ,-9, -2, -4, -4, -5}, {-7, -3, -3, -2, -9 ,-9}, {-1, -3, -1, -2, -4, -5}}; //new int[6][6];

        int sum = 0;
        //int sum_max = 0;
        ArrayList <Integer> list= new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if((k==i+1 && l==j+1 ) || k==i || k==i+2){
                            sum += arr[k][l];
                            System.out.print(arr[k][l]);
                        }
                        else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println("");
                }
                System.out.println(sum);
                list.add(sum);
                System.out.println("");
                sum=0;
            }
        }
        System.out.println("Max. sum of 3X3 matrix is : " + Collections.max(list));
    }
}
