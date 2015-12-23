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
package javaalgorithms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paul Millar
 */
public class DataAccess {
    
    private static String fileName = "numbers.txt";
    
    public static ArrayList<Integer> readNumbers(){
        
        Scanner fileReader = null;                      // Scanner Object that reads each value within the file.
        int inputValue = 0;                             // Temporarily stores each value read from the file.
        ArrayList<Integer> nums = new ArrayList<Integer>();
                
        try{
            // Create Scanner object to read the file.
            fileReader = new Scanner(new File(fileName));

            // Read each entry in the file.
            while(fileReader.hasNextInt()){ 
                inputValue = fileReader.nextInt();
                nums.add(inputValue);		
            }
            
        }
        catch (IOException ioe){
            System.out.println("*** An Input/Output Exception Occured ***");
            ioe.printStackTrace();
        }
        finally{
            if (fileReader != null){fileReader.close();}
        }   
        
        return nums;
    }
    
    public static int[] readNumbers(int arraySize){
        
        Scanner fileReader = null;                      // Scanner Object that reads each value within the file.
        int inputValue = 0;                             // Temporarily stores each value read from the file.
        int[] nums = new int[arraySize];
        int count = 0;
        
        try{
            // Create Scanner object to read the file.
            fileReader = new Scanner(new File(fileName));

            // Read each entry in the file.
            while(fileReader.hasNextInt() && count < arraySize){ 
                inputValue = fileReader.nextInt();
                nums[count] = inputValue;
                count++;
            }
            
        }
        catch (IOException ioe){
            System.out.println("*** An Input/Output Exception Occured ***");
            ioe.printStackTrace();
        }
        finally{
            if (fileReader != null){fileReader.close();}
        }   
        
        return nums;
    }
    
}
