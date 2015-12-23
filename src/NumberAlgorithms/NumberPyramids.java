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
public class NumberPyramids {
    
    public static int numberOfRows = 9;
    public static int rowCount = 1;
        
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("NUMBER PYRAMIDS");
        System.out.println("***************************************************");      
        
        Pyramid1();
        Pyramid2();
        Pyramid3();
        Pyramid4();
        Pyramid5();
        Pyramid6();
        
    }
    
    private static void Pyramid1(){
        
        System.out.println("\nPyramid 1");

        for(int i = numberOfRows ; i > 0 ; i--){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            
            // Printing 'rowCount' value 'rowCount' times at the end of each row
            for(int k = 1 ; k <= rowCount ; k++){
                System.out.print(rowCount+" ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;
        }
    }
    
    private static void Pyramid2(){
        
        System.out.println("\nPyramid 2");

        // Reset 'rowCount'
        rowCount = 1;
        //System.out.println(rowCount);
        for(int i = numberOfRows ; i > 0 ; i--){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            
            //Printing numbers up to 'rowCount'
            for(int k = 1 ; k <= rowCount ; k++){
                System.out.print(k+" ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;            
        }
    }
    
    private static void Pyramid3(){
        
        System.out.println("\nPyramid 3");

        // Reset 'rowCount'
        rowCount = 1;
        //System.out.println(rowCount);
        for(int i = numberOfRows ; i > 0 ; i--){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            
            //Printing stars up to 'rowCount'
            for(int k = 1 ; k <= rowCount ; k++){
                System.out.print("* ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;            
        }
    }
    
    private static void Pyramid4(){
        
        System.out.println("\nPyramid 4");

        // Reset 'rowCount'
        rowCount = 1;
        //System.out.println(rowCount);
        for(int i = numberOfRows ; i > 0 ; i--){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i*2 ; j++){
                System.out.print(" ");
            }
            
            //Printing numbers up to 'rowCount'
            for(int k = 1 ; k <= rowCount ; k++){
                System.out.print(k+" ");
            }
            
            //Printing numbers down from 'rowCount' -1
            for(int l = rowCount-1 ; l > 0 ; l--){
                System.out.print(l+" ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;            
        }
    }
    
    private static void Pyramid5(){
        
        System.out.println("\nPyramid 5");

        // Reset 'rowCount'
        rowCount = 1;
        
        //System.out.println(rowCount);
        for(int i = 0 ; i <= numberOfRows ; i++){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i*2 ; j++){
                System.out.print(" ");
            }
            
            //Printing numbers up to 'rowCount'
            for(int k = 1 ; k <= numberOfRows - rowCount + 1 ; k++){
                System.out.print(k+" ");
            }
            
            //Printing numbers down from 'rowCount' -1
            for(int l = numberOfRows - rowCount ; l >= 1 ; l--){
                System.out.print(l+" ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;            
        }
    }
    
    private static void Pyramid6(){
        
        System.out.println("\nPyramid 6");

        // Reset 'rowCount'
        rowCount = 1;
        
        //System.out.println(rowCount);
        for(int i = numberOfRows ; i >= 1 ; i--){
            
            // Printing i spaces at the beginning of each row
            for(int j = 1 ; j <= i*2 ; j++){
                System.out.print(" ");
            }
            
            for(int k = i ; k <= numberOfRows ; k++){
                System.out.print(k+" ");
            }
            
            for(int l = numberOfRows - 1 ; l >= i ; l--){
                System.out.print(l+" ");
            }
            
            // New line
            System.out.println();
            
            //Incrementing the rowCount
            rowCount++;              
        }
    }
    
}
