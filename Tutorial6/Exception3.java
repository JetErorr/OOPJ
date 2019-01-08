package Tutorial6;

class DCheck extends RuntimeException {
    private static final long serialVersionUID = 1L;

    DCheck(String msg) {
        if(msg=="Invalid Year"){
            System.out.println(msg);
            System.out.println("Please enter the Year in range of 1990 to 2018.!");
        }
        if (msg=="Invalid Month"){
            System.out.println(msg);
            System.out.println("Please enter the Month in range of 1 to 12.!");
        }
        if (msg=="Invalid Date"){
            System.out.println(msg);
            System.out.println("Please enter the Date in range of 1 to 31.!");
        }
        if(msg=="Days of February exceded"){
            System.out.println(msg);
            System.out.println("Please enter the correct Date, keeping in mind the days in February.!");
        }
        if (msg=="Days of 30-day month exceded"){
            System.out.println(msg);
            System.out.println("Please enter the correct Date, keeping in mind the days in each Month.!");            
        }
    }
}
class Exception3{
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
            if( y<1990 || y>2018 ){
            throw new DCheck("Invalid Year");}
            if( m<=0 || m>12 ){
            throw new DCheck("Invalid Month");}
            if( d<=0 || d>31 ){
            throw new DCheck("Invalid Date");}
            if( y%4!=0 && m==2 && d>29 ){
            throw new DCheck("Days of February exceded");}
            if( y%4==0 && m==2 && d>30 ){
            throw new DCheck("Days of February exceded");}
            if((m==4 || m==6 || m==9 || m==11) && d>31){
            throw new DCheck("Days of 30-day month exceded");}
            else{
                System.out.println("The arguments you entered are correct and in-bounds.!");
            }
    }
}