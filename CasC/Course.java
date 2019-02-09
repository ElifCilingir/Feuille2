package CasC;

import java.util.ArrayList;

public class Course {
    private String name;
    private int numRoom;
    private String teacher;
    ArrayList<Student> listStudent = new ArrayList<Student>();

    public Course(String name, int numRoom, String teacher, ArrayList<Student> listStudent) {
        this.name = name;
        this.numRoom = numRoom;
        this.teacher = teacher;
        this.listStudent = listStudent;
    }

    public void add(Student stud){
        listStudent.add(stud);
    }

    public void delete(Student stud){
        for(int i=0; i<listStudent.size(); i++){
            if(listStudent.get(i) == stud){
                listStudent.remove(listStudent.get(i));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }


}
