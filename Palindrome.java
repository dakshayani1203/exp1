/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author HP
 */
public class Palindrome {

    static int reverse(int n) 
        {
            int rem,rev=0;
            while(n>0)
            {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
            return rev;
        }
    public static void main(String[] args)
    {
     int n=1221;
     int reversenum=reverse(n);  
     System.out.println("reverse palindrome is"+reversenum);
    }
}
    
