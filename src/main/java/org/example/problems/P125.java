package org.example.problems;

public class P125 {
    private String cleanString(String s){
        StringBuilder str = new StringBuilder();
        for(char i: s.toCharArray()){
            if((i>=65 && i<=90) || (i>=97 && i<=122) || (i>=48 && i<=57)){
                str.append(i);
            }
        }
        return str.toString().toLowerCase();
    }

    public boolean isPalindrome(String s) {
        String newStr = cleanString(s);
        return checkPalindrome(newStr);
    }

    private boolean checkPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
