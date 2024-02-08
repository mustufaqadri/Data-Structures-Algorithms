import basic.*;
import array.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        ReverseArray.solve(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(ReverseArray.solve(arr));
    }
}