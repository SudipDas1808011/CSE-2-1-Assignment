public class threeClasses {


    static class Person {
            String sPerson = "This String is From Person Class";
    }

    static class Student extends Person {
          String sStudent = sPerson;
    }

    static class Teacher extends Person {
        String STeacher = sPerson;
    }
    public static void main(String[] args){
        Teacher t = new Teacher();
        Student std = new Student();
        System.out.println(t.STeacher+ " called from Teacher");
        System.out.println(std.sStudent+" called from Student");
    }

}