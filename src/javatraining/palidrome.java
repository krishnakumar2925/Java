package javatraining;

public class palidrome {
	public static void main(String[] args) {
        String input = "A man, a glan, a canal, Panama";
        boolean result = isPalindrome(input);
        System.out.println(result); // Expected Output: true
    }

    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove all non-alphanumeric characters
        String filteredString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(filteredString);
        
        int left = 0;
        int right = filteredString.length() - 1;
        
        // Compare characters from the beginning and the end
        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }


}
