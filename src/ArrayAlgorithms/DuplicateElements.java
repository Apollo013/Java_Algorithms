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

import java.util.HashSet;

/**
 *
 * @author Paul Millar
 */
public class DuplicateElements {
    
    public static void Run(){
                
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("DUPLICATE ELEMENTS");
        System.out.println("***************************************************"); 
        
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
        
        System.out.println(bruteForceCheck(strArray));
        System.out.println(hashSetCheck(strArray));
        
    }
    
    private static boolean bruteForceCheck(String[] strArray){        
        boolean rv = false;
        
        for(int i = 0 ; i < strArray.length - 1 ; i++){            
            for(int j = i+1 ; j < strArray.length ; j++){
                if((strArray[i].equals(strArray[j]) && (i != j))){
                    rv = true;
                    break;
                }
            }
        }
        return rv;
    }
    
    private static boolean hashSetCheck(String[] strArray){
        boolean rv = false;
        
        HashSet<String> set = new HashSet<String>();
        
        for(int i = 0 ; i < strArray.length ; i++){
            if(!set.add(strArray[i])){
                rv = true;
                break;
            }
        }
        return rv;
    }
    
}
