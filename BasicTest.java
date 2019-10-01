import java.util.ArrayList;
import java.util.Arrays;
public class BasicTest {
    public static void main(String[] args) {
        int[] mixedArray = {-5, 6, 3, -10, 9, 4, 0};
        int[] negArray = {-10, -6, -108, -4, -9};
        int[] myArray = {1, 3, 5, 7, 9, 13};

        Basic basic = new Basic();

        basic.Print1To255();

        System.out.println();

        basic.PrintOdds1To255();

        System.out.println();

        System.out.println(basic.PrintSum());

        System.out.println();

        basic.IteratingArray(myArray);

        System.out.println();

        System.out.println(basic.FindMax(negArray));

        System.out.println();

        System.out.println(basic.FindAverage(mixedArray));

        System.out.println();

        System.out.println(basic.OddsArray());

        System.out.println();

        System.out.println(basic.GreaterThanY(mixedArray, 3));

        System.out.println();

        int[] squared = basic.SquaredValues(mixedArray);
        System.out.println(Arrays.toString(squared));

        System.out.println();

        int[] elimination = basic.EliminateNegatives(mixedArray);
        System.out.println(Arrays.toString(elimination));

        System.out.println();

        int[] maxMinAvg = basic.MaxMinAvg(mixedArray);
        System.out.println(Arrays.toString(maxMinAvg));

        System.out.println();

        int[] shifting = basic.ShiftingValues(mixedArray);
        System.out.println(Arrays.toString(shifting));
    }
}