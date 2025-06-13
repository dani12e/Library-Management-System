public class Exercise14 {

    public static class Student{
        
        private String name;
        private int age;
        private String matricnumber;

        public Student(String name, int age, String matricnumber) {
            this.name = name;
            this.age = age;
            this.matricnumber = matricnumber;
        }

        

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    } else {
        System.out.println("Age must be positive");
    }
}

public String getMatricnumber() {
    return matricnumber;
}

public void setMatricnumber(String matricnumber) {
    this.matricnumber = matricnumber;
}

public void displayinfo(){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("MatricNumber : " + matricnumber);
}
    }
    public static void main(String[] args) {
        Student student = new Student("Daniel",21, "ENG/MEE/200334");

        student.displayinfo();

        System.out.println("Updating info....");

        student.setName("Tolu");
        student.setAge(20);
        student.setMatricnumber("ENG/MEE/200334");

        student.displayinfo();
    }
}
