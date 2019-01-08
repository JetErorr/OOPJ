package Tutorial4.ProjectJava.src;

public class FactDesign {
    Box getBox(){
        Box temp = new Box();
        return temp;
    }
    StudentInfo getStudentInfo(String name){
        StudentInfo temp = new StudentInfo();
        temp.setName(name);
        return temp;
    }
    // IntStack getIntStack(){
    //     IntStack temp = new IntStack();
    //     return temp;
    // }
}