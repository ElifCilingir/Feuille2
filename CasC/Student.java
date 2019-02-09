package CasC;

import java.util.ArrayList;

public class Student {
    private String name;
    private String familyName;
    private int age;
    private char gender;
    ArrayList<Course> listCourse = new ArrayList<>();
    ArrayList<Result> listResult = new ArrayList<>();

    public Student(String name, String familyName, int age, char gender, ArrayList<Course> listCourse, ArrayList<Result> listResult) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.gender = gender;
        this.listCourse = listCourse;
        this.listResult = listResult;
    }

    public void addCourse(Course cours){
        listCourse.add(cours);
    }

    public void deleteCourse(Course cours){
        for(int i=0; i<listCourse.size(); i++){
            if(listCourse.get(i) == cours){
                listCourse.remove(listCourse.get(i));
            }
        }
    }

    public void addResult(Result res){
        listResult.add(res);
    }

    public void deleteResult(Result res){
        for(int i=0; i<listResult.size(); i++){
            if(listResult.get(i) == res){
                listResult.remove(listResult.get(i));
            }
        }
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

    public ArrayList<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(ArrayList<Course> listCourse) {
        this.listCourse = listCourse;
    }
}
