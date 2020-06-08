package chapter8;

public class Student implements Comparable<Student>{

    private int enrollmentId;
    private String name;
    private String familyName;
    private int age;

    public Student(int enrollmentId, String name, String familyName, int age){
        this.setEnrollmentId(enrollmentId);
        this.setName(name);
        this.setFamilyName(familyName);
        this.setAge(age);
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    private void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {

        if(this.getEnrollmentId() != o.getEnrollmentId()){
            return this.getEnrollmentId() - o.getEnrollmentId();
        }

        if(!this.getFamilyName().equals(o.getFamilyName())){
            return this.getFamilyName().compareTo(o.getFamilyName());
        }

        return this.getName().compareTo(o.getName());
    }
}
