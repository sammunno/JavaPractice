/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Sam
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int makeChocolate(int small, int big, int goal) {
        while(goal >= 5 && large >= 1) {
            goal -= 5;
            large --;
        }
        if(goal < small)
             return goal;
        else if(goal == small)
        {
            return small;
        }
        else
        {
             return -1;
        }
    }
    
    public static int sumDigits(String str) {
        String allNums = s.replaceAll("[^0-9]","");
        int sum = 0;
        for(int i = 0; i < allNums.length(); i++){
            sum += Character.getNumericValue(allNums.charAt(i));
        }
        return sum;
    }
    public static boolean canBalance(int[] nums) {
        return false;
    }
    public static String noX(String str) {
        return "";
    }
    public static String withoutString(String base, String remove) {
        String remString = base.replace(remove, "");
        return remString;
    }
    public static  int[] squareUp(int n) {
        int sam[] = new int[1];
        
        return sam;
    }




}
