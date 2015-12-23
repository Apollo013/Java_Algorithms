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
public class MatrixFunctions {
    
    public static void print(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        for(int i = 0 ; i < rows ; i++){        
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        } 
    }
    
    public static int[][] createMatrix(int rows, int columns, boolean load){
        
        int[][] matrix = new int[rows][columns];
        Random rand = new Random();
        
        // Fill matrix
        if(load){
            matrix = loadMatrix(matrix, rows, columns);
        }
        
        return matrix;
    }
    
    public static int[][] loadMatrix(int[][] matrix,int rows, int columns){
        Random rand = new Random();
        
        // Fill matrix
        for(int i = 0 ; i < rows ; i++){        
            for(int j = 0 ; j < columns ; j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        
        return matrix;        
    }  
    
}
