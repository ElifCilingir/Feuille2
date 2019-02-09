package CasB;

public class Person {
    private String name;
    private String familyName;
    private int age;
    private char gender;
    Person parent1;
    Person parent2;

    public Person(String name, String familyName, int age, char gender) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person getParent1() {
        return parent1;
    }

    public void setParent1(Person parent1) {
        this.parent1 = parent1;
    }

    public Person getParent2() {
        return parent2;
    }

    public void setParent2(Person parent2) {
        this.parent2 = parent2;
    }
}
