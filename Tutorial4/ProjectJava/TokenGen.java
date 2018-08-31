class TokenGen {
    static int counter = 0;
    int copyNo;

    TokenGen() {
        counter++;
        copyNo = counter;
    }

    static void displayCount() {
        System.out.println("Total Copies generated: " + counter + "\n");
    }

    void display() {
        System.out.println("Sr. No. of the Object: " + copyNo + "\n");
    }

    public static void main(String[] args) {
        TokenGen obj1 = new TokenGen();
        obj1.display();
        TokenGen obj2 = new TokenGen();
        TokenGen obj3 = new TokenGen();
        System.out.println("Total No. of Objects created: "+counter);
        obj2.display();
        obj3.display();
        System.out.println("Total No. of Objects created: "+counter);
    }
}