package Blind75.Easy;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        String s1 = "A man, a plan, a canal: Pama";
        System.out.println(isPalindrome(s1));
    }

    public static boolean isPalindrome(String s){
        for(int i=0, j=s.length()-1; i<j; i++,j--){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
