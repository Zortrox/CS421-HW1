/**
 * Created by Zortrox on 9/6/2016.
 * */
public class MaxSubsetSum {

    public static void main(String[] args) {
    	//Run-time in comments
    	//all constant (1)
        int[] a = { -4, -20, -10, 19, -16, 1, 9, 2, -14, 13, 16, 18, -5, -20, -1, -2, -17, 18, -3, -4 };
        int indexStart= 0;
        int indexEnd = 0;
        int maxSum = 0;
		int tempSum = 0;

        for (int i = 0; i < a.length; i++) {	//n
			tempSum = tempSum + a[i];			//1

			if(tempSum < 0) {					//1
				tempSum = 0;					//worst(1), best(0)
				indexStart = i+1;				//worst(1), best(0)
			}

			if (maxSum < tempSum) {				//1
				maxSum = tempSum;				//worst(1), best(0)
				indexEnd = i;					//worst(1), best(0)
			}
        }

        System.out.println("The indices of the largest sum (" + maxSum + ") are:");	//1
        for (int i=indexStart; i<=indexEnd; i++) {	//worst(n), best(1)
			System.out.println(i);				//worst(1), best(0)
		}
    }
}