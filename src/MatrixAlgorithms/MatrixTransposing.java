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

/**
 *
 * @author Paul Millar
 */
public class MatrixTransposing {
    
    public static void Run(){
                
        // TRANSFORM A 3X2 MATRIX INTO A 2X3 MATRIX        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("MATRIX TRANSPOSING");
        System.out.println("***************************************************");         
        
        int matrix1Rows = 2;
        int matrix1Columns = 3;
        
        int matrix2Rows = 3;
        int matrix2Columns = 2;
        
        int[][] matrix1 = MatrixFunctions.createMatrix(matrix1Rows,matrix1Columns, true);  // 2X3
        int[][] matrix2 = MatrixFunctions.createMatrix(matrix2Rows,matrix2Columns, true);  // 3X2
        
        
        // Iterate through each row in matrix 1
        for(int i = 0 ; i < matrix1Rows ; i++){
            // Now iterate through each element in each row of matrix 1
            for(int j = 0 ; j< matrix1Columns ; j++){
                // Assign it using column/row index (reveresed), instead of row/column index
                matrix2[j][i] = matrix1[i][j];
            }
        }
                
        
        System.out.println("Matrix 1");
        MatrixFunctions.print(matrix1);
        
        System.out.println("Matrix 2");
        MatrixFunctions.print(matrix2);        
    }
    
    
  
}
