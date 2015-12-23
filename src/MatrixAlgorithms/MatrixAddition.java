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
package MatrixAlgorithms;

import java.util.Random;

/**
 *
 * @author Paul Millar
 */
public class MatrixAddition {
    
    public static void Run(){
                
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("MATRIX ADDITION");
        System.out.println("***************************************************"); 
        
        Random rand = new Random();
        
        int rows = 3;
        int columns = 3;
        
        int[][] matrix1 = new int[rows][columns];         
        int[][] matrix2 = new int[rows][columns];         
        int[][] sum = new int[rows][columns];
        
        // Fill matrix1
        for(int i = 0 ; i < rows ; i++){        
            for(int j = 0 ; j < columns ; j++){
                matrix1[i][j] = rand.nextInt(10);
            }
        }      
        
        // Fill matrix2
        for(int i = 0 ; i < rows ; i++){        
            for(int j = 0 ; j < columns ; j++){
                matrix2[i][j] = rand.nextInt(10);
            }
        }     
        
        // Fill matrix3 by adding matching element indexes from matrix1 & matrix 2
        for(int i = 0 ; i < rows ; i++){        
            for(int j = 0 ; j < columns ; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }  
        // The above could also be used for substraction, multiplication, etc ..
        
        
        
        System.out.println("Matrix 1");
        MatrixFunctions.print(matrix1);
        
        System.out.println("Matrix 2");
        MatrixFunctions.print(matrix2);
        
        System.out.println("Sum of Matrix 1 & Matrix 2");
        MatrixFunctions.print(sum);        
    }
    
}
