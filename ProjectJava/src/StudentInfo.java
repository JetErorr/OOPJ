class StudentInfo{
    String name,add;
    int rno;
    void setName(String n){
        name = n;
    }
    void setAddr(String n){
        add = n;
    }
    void setRoll(int n){
        rno = n;
    }
    void displayInfo(){
        System.out.println("Roll Number: "+rno);
        System.out.println("Is named: "+name+" &");
        System.out.println("Lives at the following address: "+add);
    }
}