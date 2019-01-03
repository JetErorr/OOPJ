class multi extends Thread {
    public void run()

    {
        System.out.println("thread is creatin");
    }

    public void stop();

    {
        System.out.println("thread is stop");
    }

    public static void main(String[] args) {
        multi m1 = new multi();
        // multi m2 = new multi();
        m1.start();
        m1.end();

    }
}