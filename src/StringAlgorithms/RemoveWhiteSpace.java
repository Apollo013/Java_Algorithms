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
 *
 * @author Paul Millar
 */
public class RemoveWhiteSpace {
    
    public static void Run(){
        
        String str = "I'm a lumber-jack and i don't care, i sleep all night and i work all day";
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("REMOVE WHITESPACE");
        System.out.println("***************************************************");
                
        /***************************************************
        REMOVE WHITESPACE: WITH REPLACE ALL
        ***************************************************/
        System.out.println("Remove Whitespace With ReplaceAll");
        System.out.println(withReplaceAll(str));        
        
        /***************************************************
        REMOVE WHITESPACE: WITHOUT REPLACE ALL
        ***************************************************/
        System.out.println("\nRemove Whitespace Without ReplaceAll");
        System.out.println(withoutReplaceAll(str));   
        
    }
    
    private static String withReplaceAll(String str){
        return str.replaceAll("\\s", "");
    }
    
    private static String withoutReplaceAll(String str){
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            if( (arr[i] != ' ') && (arr[i] != '\t') )
            {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

}
