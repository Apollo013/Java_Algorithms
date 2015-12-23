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
package StringAlgorithms;

/**
 * This class demonstrates several ways in which to reverse a string
 * @author Paul Millar
 * @date 26/11/2015
 */
public class ReverseStringAlgorithms {
    
    public static void Run(){
        String reverseString = "ReverseString";
        
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("REVERSE STRING");
        System.out.println("***************************************************");
        
        
        /***************************************************
        REVERSE STRING: STRING BUILDER EXAMPLE
        ***************************************************/
        System.out.println("String Reversal Using String Builder");
        System.out.println(ReverseString_StringBuilder(reverseString));
        
        /***************************************************
        REVERSE STRING: STRING BUFFER EXAMPLE
        ***************************************************/
        System.out.println("\nString Reversal Using String Buffer");
        System.out.println(ReverseString_StringBuffer(reverseString));

        /***************************************************
        REVERSE STRING: ITERATION EXAMPLE
        ***************************************************/
        System.out.println("\nString Reversal Using Iteration");
        System.out.println(ReverseString_Iteration(reverseString));
        
        /***************************************************
        REVERSE STRING: RECURSION EXAMPLE
        ***************************************************/
        System.out.println("\nString Reversal Using Recursion");
        System.out.println(ReverseString_Recursive(reverseString));
        
    }
    
    private static String ReverseString_StringBuilder(String reverseString){
        StringBuilder sb = new StringBuilder(reverseString);        
        return sb.reverse().toString();
    }
    
    private static String ReverseString_StringBuffer(String reverseString){
        // StringBuffer not widely used anymore (use StringBuilder instead)
        StringBuffer sb = new StringBuffer(reverseString);
        return sb.reverse().toString();
    }
    
    private static String ReverseString_Iteration(String reverseString){        
        // Create a new StringBuilder object (rather than a String object)
        StringBuilder sb = new StringBuilder();

        // Place all the characters into a character array
        char[] charArray = reverseString.toCharArray();
        // Iterate through the array in reverse
        for(int i = charArray.length-1 ; i >= 0 ; i--){
            // and assign to new string
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
    
    private static String ReverseString_Recursive(String reverseString){
        
        if(reverseString == null || reverseString.length() <= 1){
            return reverseString;
        }
        
        return ReverseString_Recursive(reverseString.substring(1)) + reverseString.charAt(0);
        
        /*
        HOW IT WORKS
        1st Call —>  recursiveMethod("ReverseString")
        2nd Call —>  recursiveMethod("everseString") + "R"
        3rd Call —>  (recursiveMethod("verseString") + "e") + "R"
        4th call —>  ((recursiveMethod("erseString") + "v") + "e") + "R"
        5th Call —>  (((recursiveMethod("rseString") + "e") + "v") + "e") + "R"
        6th Call —>  ((((recursiveMethod("seString") + "r") + "e") + "v") + "e") + "R"
        ...
        last Call —> (((((((((((recursiveMethod("g") + "n") + "i") + "r") + "t") + "S") + "e") + "s") + "r") + "e") + "v") +"e") + "R"
        */
    }
}
