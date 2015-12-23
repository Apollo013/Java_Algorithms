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

import java.util.Arrays;
import static javaalgorithms.DataAccess.readNumbers;

/**
 *
 * @author Paul Millar
 */
public class ArrayEquality {
    
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("ARRAY EQUALITY");
        System.out.println("***************************************************");      

        int[] hardCoreArray  = {10,20,10,20,10,5,60,60,5,60};
        int[] hardCoreArray2 = {10,20,10,20,60,10,5,60,5,60};
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} }; 
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} }; 
        
        int[] fileArray = readNumbers(100);
        
        System.out.println("\nTest 01");
        if(EqualityTest1(hardCoreArray, fileArray)){
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays differ.");
        }
        
        
        System.out.println("\nTest 02");
        if(Arrays.equals(hardCoreArray, fileArray)){
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays differ.");
        }      
        
        
        System.out.println("\nTest 03");
        Arrays.sort(hardCoreArray);
        Arrays.sort((hardCoreArray2));
        if(Arrays.equals(hardCoreArray, hardCoreArray2)){
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays differ.");
        }   
        
        
        System.out.println("\nTest 04");
        if(Arrays.deepEquals(s1, s2)){
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays differ.");
        }           
    }
    
    /**
     * Check array size and make sure that they have the same values in the same order
     * @param arrayA
     * @param arrayB
     * @return 
     */
    private static boolean EqualityTest1(int[] arrayA, int[] arrayB){
        // Check that both arrays are the same length.
        if(arrayA.length != arrayB.length){ return false; }

        // Compare the value of each element. (return false if there's a mismatch (even if the order is wrong))
        for(int idx = 0 ; idx < arrayA.length ; idx++){
            if(arrayA[idx] != arrayB[idx]){ return false; }			
        }
        // We've made it this far, so they must be the same.
        return true;        
    }
  
}
