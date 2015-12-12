/*
 * Stringies.java
 *
 * created at 28.11.2015 ã. by admin <YOURMAILADDRESS>
 * 
 */
package test;


public class Stringies
{
    public static void main(String[] args)
    {
        String asd = "asd";
        System.out.println("*" + padString(asd, 10) + "*");
    }
    
    
    static String padString(String original, int length)
    {
        if (original.length() >= length)
        {
            return original;
        }
        
        
        int paddingsNeeded = length - original.length();
        for (int i = 0; i < paddingsNeeded; i++)
        {
            original = original + " ";
        }
        
        return original;
    }
}



