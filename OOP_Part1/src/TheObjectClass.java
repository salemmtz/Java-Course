public class TheObjectClass extends Object{
    public static void main(String[] args) {
        StudentOb max = new StudentOb("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }

}

class StudentOb{
    private String name;
    private int age;

    StudentOb(String name, int age){
        this.name = name;
        this.age  = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends StudentOb{
    private  String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
