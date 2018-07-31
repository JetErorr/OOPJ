class Finaliz{
    int i,j,k;
    Finaliz(){
        System.out.println("Def Constructor Called.");
    }
    public static void main(String[] args){
        for(;;){
            new Finaliz();
        }
    }
        protected void finalize(){
        System.out.println("Garbage Collector Called.");
        }
}