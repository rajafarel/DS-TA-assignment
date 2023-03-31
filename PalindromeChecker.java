import java.util.Stack;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter word ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Stack stacks = new Stack();

        for(int i = 0; i < input.length();i++){
            stacks.push(input.charAt(i));
        }
        String reverse = "";
        while(!stacks.isEmpty()){
            reverse = reverse+stacks.pop();

        }
        if(reverse.equals(input)){
            System.out.println("The word inserted is a palindrome ");
        } else
            System.out.println("The word inserted is not a palindrome");
    }
}
