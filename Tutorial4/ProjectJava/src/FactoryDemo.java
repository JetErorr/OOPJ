public class FactoryDemo{
    public static void main(String[] args) {
        FactDesign obj = new FactDesign();
        StudentInfo stu1 = obj.getStudentInfo("C1");
        StudentInfo stu2 = obj.getStudentInfo("C2");
        stu2.displayInfo();
        stu1.displayInfo();
        Box stu3 = obj.getBox();
        stu3.display();
    }
}