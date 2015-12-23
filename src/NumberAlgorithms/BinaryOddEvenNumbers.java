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

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paul Millar
 */
public class BinaryOddEvenNumbers {
    
    public static void Run() {
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("ODD / EVEN NUMBERS");
        System.out.println("***************************************************"); 
        
        // Local variables.
        Scanner fileReader = null;                      // Scanner Object that reads each value within the file.
        int inputValue = 0;                             // Temporarily stores each value read from the file.
        int evenNums = 0;                               // Counter for number of even values.
        int oddNums = 0;                                // Counter for number of odd values.
             
        try{
            // Initialise Scanner object to read file. (First read in the name of the file.)
            fileReader = new Scanner(new File("numbers.txt"));
            
            // Grab the first number here as it maybe '-1', in which case we will need to exit the while loop immediately.
            inputValue = fileReader.nextInt();
            
            // Iterate through the file while there are values to read and have not encountered -1.            
            while(fileReader.hasNextInt() && inputValue != -1){
                // Check if inputValue is odd or even and increment appropriate variables.
                if(isOdd(inputValue)){
                    oddNums++;
                } else {
                    evenNums++;
                }
                // Read the next value.
                inputValue = fileReader.nextInt();
            }
        } 
        // Check for IO error.
        catch (IOException ioe){
            System.out.println("*** An Input/Output Exception Occured ***");
            ioe.printStackTrace();
        }
        // Close both scanner objects.
        finally{
            if (fileReader != null){fileReader.close();}
        }
        
        // Print result
        System.out.println("There are " + evenNums + " even and " + oddNums + " odd numbers");
    }

    /**
     * Determines if an int value is odd or even.
     * @param value The value to be checked.
     * @return boolean - 'true' if value is odd, otherwise 'false'.
     */
    public static boolean isOdd(int value){        
        // Binary Version.
        String binValue = Integer.toBinaryString(value);
        return (binValue.charAt(binValue.length()-1) != '0') ? true : false;    
        
        // Modulus Version when not working with binary.
        //return (value % 2 == 0) ? true : false;
    }       
}
