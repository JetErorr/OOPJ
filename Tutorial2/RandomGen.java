package Tutorial2;

import java.util.Random;
class RandomGen{
    public static void main(String[] args) {
        Random var = new Random();
        System.out.println("What would you like to have for breakfast today.?");
        System.out.println("1.Bhakhari\n2.Yogurt\n3.Paratha\n4.Waffles\n5.Sandwich\n6.Thepala\n  ");
        int a = var.nextInt(6);
        switch (a) {
            case 1:
            System.out.println("The system selected " +a +": Bhakhari.!");
            break;
            case 2:
            System.out.println("The system selected " +a +": Yogurt.!");
            break;
            case 3:
            System.out.println("The system selected " +a +": Paratha.!");
            break;
            case 4:
            System.out.println("The system selected " +a +": Waffles.!");
            break;
            case 5:
            System.out.println("The system selected " +a +": Sandwich.!");
            break;
            case 6:
            System.out.println("The system selected " +a +": Thepala.!");
            break;
            default:
            System.out.println("The system selected an invalid entry.!");
            break;
        }
    }
}