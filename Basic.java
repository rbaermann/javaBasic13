import java.util.ArrayList;
public class Basic {
    public void Print1To255() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void PrintOdds1To255() {
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public ArrayList<String> PrintSum() {
        ArrayList<String> sumArray = new ArrayList<String>();
        int sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
            sumArray.add("New number: " + i + " Sum: " + sum);
        }
        return sumArray;
    }

    public void IteratingArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int FindMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int FindAverage(int[] arr) {
        int sum = 0;
        if(arr.length == 1) {
            return arr[0];
        }
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }

    public ArrayList<Integer> OddsArray() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                oddArray.add(i);
            }
        }
        return oddArray;
    }

    public int GreaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                count++;
            }
        }
        return count;
    }

    public int[] SquaredValues(int[] arr) {
        int[] squaredArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            squaredArr[i] = (arr[i] * arr[i]);
        }
        return squaredArr;
    }

    public int[] EliminateNegatives(int[] arr) {
        int[] noNegs = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                noNegs[i] = 0;
            }
            else {
                noNegs[i] = arr[i];
            }
        }
        return noNegs;
    }

    public int[] MaxMinAvg(int[] arr) {
        int[] maxMinAvg = new int[3];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] < maxMinAvg[1]) {
                maxMinAvg[1] = arr[i];
            }
            else if(arr[i] > maxMinAvg[0]) {
                maxMinAvg[0] = arr[i];
            }
        }
        maxMinAvg[2] = (sum / arr.length);
        return maxMinAvg;
    }

    public int[] ShiftingValues(int[] arr) {
        int[] shifting = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if((i + 1) == arr.length) {
                shifting[i] = 0;
            }
            else {
                shifting[i] = arr[i + 1];
            }
        }
        return shifting;
    }
}