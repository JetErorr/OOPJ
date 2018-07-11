// Method 1 (Simple but Longer):-
// class CLAAverage{
//     public static void main(String[] args) {
//         int arr[] = new int[args.length];
//         int sum = 0;
//         for (int i = 0; i < args.length; i++) {
//             arr[i] = Integer.parseInt(args[i]);
//             sum+=arr[i];
//         }
//         System.out.println("The average of the "+args.length+" entered marks is: "+sum/args.length+".!");
//     }
// }
// Method 2 (Complex but Short):-
class CLAAverage{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("The average of the "+args.length+" entered marks is: "+sum/args.length+".!");
    }
}