package BuilderPattern;

public class Client {
    public static void main(String[] args) {

        Student student = Student.getBuilder()
                     .setName("Pavan")
                .setAge(26)
                .setBatch("Sep")
                .setGradYear(2025)
                .setCourse("Eng")
                .build();

        System.out.println(student);
    }
}
