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
public class ReverseArray {
    
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("REVERSE ARRAY");
        System.out.println("***************************************************");    
        
        int[] nums = readNumbers(100);
        
        System.out.println("");
        System.out.println("Original");
        printArray(nums);
        
        System.out.println("Reversed");
        printArray(reverseArray(nums));
        
        System.out.println("Reversed In Place");
        printArray(reverseArrayInPlace(nums));
    }
    
    /**
     * Reverses the order of an array.
     * @param numArray int[] - The array to reverse.
     * @return int[] - The array reversed.
     */
	public static int[] reverseArray(int[] numArray){
            int[] tempArr = new int[numArray.length];

            for(int idx = 0 ; idx < numArray.length ; idx++){
                    // Assign last element in 'numArray' to first element in 'tempArr', and so on ...
                    tempArr[tempArr.length - (idx + 1)] = numArray[idx];
            }
            return tempArr;
	}
	
    /**
     * Reverses the order of an array.
     * @param numArray int[] - The array to reverse.
     * @return int[] - The array reversed.
     */
	public static int[] reverseArrayInPlace(int[] numArray){
            int temp = 0;
            int oppositeIdx = numArray.length - 1;

            // Iterate through the array up to it's midpoint only.
            for(int idx = 0 ; idx <= numArray.length / 2 ; idx++){
                    // Temporariyl store the current element value;
                    temp = numArray[idx];
                    // Swap the current element value withs it's opposite element value.
                    numArray[idx] = numArray[oppositeIdx];
                    // Swap the current element value into it's opposite element.
                    numArray[oppositeIdx] = temp;
                    // Move inwards from the end/right side.
                    oppositeIdx--;
            }
            return numArray;	
	}    
}
