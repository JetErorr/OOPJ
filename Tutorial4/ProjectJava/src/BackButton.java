package Tutorial4.ProjectJava.src;

public class BackButton {
    public static void main(String[] args) {
        StrStack temp = new StrStack(3);

        temp.push("Google.com");
        System.out.println("The popped value is: "+temp.pop());
    }
}