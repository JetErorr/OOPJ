package Tutorial2;

import java.util.Scanner;
class Vowel{
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Please enter a character.: \n");
        char x = 'a';
        // = var.nextLine().char();
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            System.out.println("The character you entered is a vowel.!");
        }
        var.close();
    }
}