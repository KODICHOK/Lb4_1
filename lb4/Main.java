package lb4;


    public class Main {
        public static boolean isPalindrome(String word) {
            if (word == null) {
                return false;
            }
    
            String cleanWord = word.replaceAll("\\s", "").toLowerCase();
    
            int length = cleanWord.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanWord.charAt(i) != cleanWord.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    
        public static void main(String[] args) {
            System.out.println(isPalindrome(null)); 
            System.out.println(isPalindrome("radar")); 
            System.out.println(isPalindrome("banana")); 
            System.out.println(isPalindrome("hannah"));
            System.out.println(isPalindrome("pup")); 
            System.out.println(isPalindrome("nan")); 
            System.out.println(isPalindrome("lollipop"));
            System.out.println(isPalindrome("eye"));
            System.out.println(isPalindrome("6543456"));
            System.out.println(isPalindrome("step on no pets"));
            System.out.println(isPalindrome("A man a plan a canal Panama")); 
        }
    }
    


