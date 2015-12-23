/* 
 * Copyright (c) 2015, Paul Millar
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, 
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package ArrayAlgorithms;

import static javaalgorithms.DataAccess.readNumbers;
import static javaalgorithms.PrintService.printArray;

/**
 *
 * @author Paul Millar
 */
public class AvgMaxMinFrequencyNumbers {
 
        public static void Run() {
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("AVG MAX MIN FREQUENCIES");
        System.out.println("***************************************************"); 
        
        int[] nums = readNumbers(100);
          
        // Make sure we have something in our array. (prevents divide by zero errors).
        if (nums.length == 0){return;}
		
        System.out.println("The total number of elements input is: " + nums.length);
        printArray(nums);
        System.out.println("The average of the elements input is: " + getAverage(nums));
        System.out.println("The number of elements greater than the average is: " + numGreaterThanAverage(nums));
        System.out.println("The smallest element entered was: " + getMin(nums));
        System.out.println("The largest element entered was: " + getMax(nums));
        System.out.println("The number of times the maximum number was entered is: " + maxFrequency(nums));
        allElementsToTen(nums);
        printArray(nums);
    }

    
    /**
     * Calculates and returns the average of the elements in an int[] array.
     * @param numArray int[] - The array on which to base our calculations on.
     * @return double - The average of all legit elements in the array. 
     */
    private static double getAverage(int[] numArray){       
        double sum = 0;
        // Tally all element values.
        for(int i = 0 ; i < numArray.length ; i++){
            sum += numArray[i];
        }
        // Calculate and return the average.
        return (double)(sum / numArray.length);
    }
    
    /**
     * Determines the number of elements greater than the average and returns the count.
     * @param numArray int[] - The array on which to base our calculations on.
     * @return int - The number of values greater than the average value.
     */
    private static int numGreaterThanAverage(int[] numArray){
        
        int count = numArray.length;
        
        double average = getAverage(numArray);
        int greaterCount = 0;
        
        // Iterate through the array and count how many elements are greater than the average value.
        for(int i = 0 ; i < count ; i++){
            greaterCount = (numArray[i] > average) ? greaterCount + 1 : greaterCount;
        }
        
        return greaterCount;        
    }
    
    /**
     * Finds the next highest/maximum element in the array and returns it.
     * @param numArray int[] - The array to be searched.
     * @return int - The next highest/maximum value in the array.
     */
    public static int getNextHighest(int[] numArray){
        
        int max = getMax(numArray);
        
        int high2 = Integer.MIN_VALUE;

        for(int i : numArray){
            // Assign element value to 'high2' if it is greater than that value AND less than the maximum.
            high2 = (i > high2 && i < max) ? i : high2;
        }
        return high2;		
    }
    
    /**
     * Finds the largest element in the array and returns it.
     * @param numArray int[] - The array on which to search for highest/maximum value.
     * @return int - The highest/maximum value.
     */
    private static int getMax(int[] numArray){
        
        int count = numArray.length;
        
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array and swap element value into 'max' variable if greater.
        for(int i = 0 ; i < count ; i++){
            max = (numArray[i] > max) ? numArray[i] : max;
        }
        
        return max;
    }
    
    /**
     * Finds the smallest element in the array and returns it.
     * @param numArray int[] - The array on which to search for lowest/minimum value.
     * @return int - The lowest/minimum value.
     */
    private static int getMin(int[] numArray){
        int min = Integer.MAX_VALUE;
        
        // Iterate through the array and swap element value into 'min' variable if smaller.
        for(int i = 0 ; i < numArray.length ; i++){
            min = (numArray[i] < min) ? numArray[i] : min;
        }
        
        return min;
    }
    
    /**
     * Finds the number of times the largest element occurs in the array and returns it.
     * @param numArray int[] - The array on which to search for the frequency of the highest/maximum value.
     * @return int - The frequency of the highest/maximum value.
     */
    private static int maxFrequency(int[] numArray){
        int max = getMax(numArray);
        int freq = 0;
        
         // Iterate through the array and count the number of times the largest element occurs.
        for(int i = 0 ; i < numArray.length ; i++){
            freq = (numArray[i] == max) ? freq + 1 : freq;
        }

        return freq;
    }
    
    /**
     * Sets ALL (not just legit) elements in the array to 10.
     * @param numArray int[] - The array on which to search for the frequency of the highest/maximum value.
     */
    private static void allElementsToTen(int[] numArray){
        for(int i = 0 ; i < numArray.length ; i++){
            numArray[i] = 10;
        }        
    }        
}
