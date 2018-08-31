class DemoStatic{
    public static void main(String[] args) {
        System.out.println("This line is from the main block");
        System.out.println("Even the main block will give way to the static block.!");
    }
    static{
        System.out.println("This line is from the static block");
        System.out.println("The static block will be executed first, even before the main block.");
    }
}