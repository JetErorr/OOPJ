package Tutorial1;

class Byte {
    public static void main(String[] args) {
        byte a=1;
        int i=0;
        for(i=0;i<8;i++){
            a=(byte)(a*2);
            System.out.println("A: " +a +"\n");
        }
    }
}