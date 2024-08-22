package BuilderPattern;

public class Student {
    final String name;
    final int age;
    final String batch;
    final int gradYear;
     String course;
     int psp;


    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.batch =builder.batch;
        this.gradYear = builder.gradYear;
        this.course = builder.course;
        this.psp = builder.psp;
    }

    public String toString(){
        return name + " " + age + " " + batch + " " + gradYear + " " + course;
    }

    static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {
         String name;
         int age;
         String batch;
         int gradYear;
        String course;
        int psp;


        Student build() {

//            validation can be done in this build
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }
        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

    }
}
