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
 * Check whether a given number is Armstrong number or not. 
 * A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it. 
 * For example: 153, 9474, 54748 are some Armstrong numbers
 * @author Paul Millar
 */
public class ArmstrongNumbers {
    
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("ARMSTRONG NUMBERS");
        System.out.println("***************************************************"); 
        
        System.out.println("nTest 1");
        check1(153);
 
        check1(371);
 
        check1(9474);
 
        check1(54748);
 
        check1(407);
 
        check1(1674);
        
        
        System.out.println("\nTest 2");
        check2(153);
 
        check2(371);
 
        check2(9474);
 
        check2(54748);
 
        check2(407);
 
        check2(1674);
    }
    
    private static void check1(int number)
    {
        int copyOfNumber = number;
 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
 
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
 
            int lastDigitToThePowerOfNoOfDigits = 1;
 
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
 
            sum = sum + lastDigitToThePowerOfNoOfDigits;
 
            copyOfNumber = copyOfNumber / 10;
        }
 
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }
    
    private static void check2(int number){
        
        // Make a copy so we can compare later
        int copyOfNumber = number;
 
        char[] digits = String.valueOf(number).toCharArray();
        
        // Determine the number of digits there are
        int noOfDigits = digits.length;
                
        int sum = 0;
        
        for(char c : digits){
            int num = Character.getNumericValue(c) ;
            sum += Math.pow(num, noOfDigits);
        }
        
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
        
    }
}
