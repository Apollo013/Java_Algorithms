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

import java.util.Arrays;

/**
 * Check whether two given strings are anagram or not. 
 * Two strings are said to be anagram if they contain same set of characters but in different order. 
 * For example, “Mother In Law” and “Hitler Woman” are anagrams.
 * @author Paul Millar
 */
public class StringAnagrams {
    
    public static void Run(){
        
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("STRING ANAGRAMS");
        System.out.println("***************************************************"); 
        
        check("Mother In Law", "Hitler Woman");
 
        check("keEp", "peeK");
 
        check("SiLeNt CAT", "LisTen AcT");
 
        check("Debit Card", "Bad Credit");
 
        check("School MASTER", "The ClassROOM");
 
        check("DORMITORY", "Dirty Room");
 
        check("ASTRONOMERS", "NO MORE STARS");
 
        check("Toss", "Shot");
 
        check("joy", "enjoy");
    }
    
    
    private static boolean check(String s1, String s2){
        
        boolean rv = true;
        
        // Remove white spaces
        String s1Copy = s1.replaceAll("\\s", "");
        String s2Copy = s2.replaceAll("\\s", "");
        
        // Check the lengths
        if(s1Copy.length() != s2Copy.length()){
            rv = false;
        }
        else{
            char[] s1Array  = s1Copy.toCharArray();
            char[] s2Array  = s2Copy.toCharArray();
            
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            rv = Arrays.equals(s1Array, s2Array);
        }
        
        //Output results
        if(rv)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else{
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
        
        return rv;
    }
}
