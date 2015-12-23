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
package NumberAlgorithms;

/**
 *
 * @author Paul Millar
 */
public class SumOfAllDigits {
    
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("SUM OF ALL DIGITS");
        System.out.println("***************************************************"); 
        
        System.out.println("nTest 1");
        sumAllDigits1(47862); 
        sumAllDigits1(416872); 
        sumAllDigits1(5674283); 
        sumAllDigits1(475496215);
        
        System.out.println("nTest 2");
        sumAllDigits2(47862); 
        sumAllDigits2(416872); 
        sumAllDigits2(5674283); 
        sumAllDigits2(475496215);        
    }
    
    public static void sumAllDigits1(int num){
        
        //Split numbers into an array
        char[] digits = String.valueOf(num).toCharArray();
        int sum = 0;
        
        for(char digit : digits){
            sum += Character.getNumericValue(digit);
        }
        // Print result
        System.out.println("The sum of " + num + "\t= " + sum);
    }
    
    public static void sumAllDigits2(int num){
        
        //Creating a copy of input number
        int copyOfNumber = num;
        //Initializing sum to 0
        int sum = 0;
        
        while(copyOfNumber != 0){
            //Get last digit of the input number
            int lastDigit = copyOfNumber%10;
            //Add last digit to sum
            sum = sum + lastDigit;
            //Remove last digit from the input number
            copyOfNumber = copyOfNumber/10;
        }
        // Print result
        System.out.println("The sum of " + num + "\t= " + sum);
    }
    
}
