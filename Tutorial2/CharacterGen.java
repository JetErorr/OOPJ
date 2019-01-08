package Tutorial2;

import java.util.Random;
class CharacterGen{
    public static void main(String[] args) {
        Random var = new Random();
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            int a = var.nextInt(26);
            char c = (char)(a + 'A');
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                continue;
            }else{
                System.out.println("Character:["+i+"]:"+c);
            }
        }
    }
}     