// 2/5
class StringStream{
    public static void main(String[] args) {
        String n1 = args[0];
        int n = n1.length();
        for(int i=0;i<n;i++){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print(n1.charAt(k)+" ");
            }
        System.out.print("\n");
        }
    }
}