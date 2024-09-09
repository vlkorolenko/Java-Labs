import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println("Student added: " + student.getId());
    }

    public void removeStudent(String id) {
        if(studentMap.containsKey(id)) {
            Student removedStudent = studentMap.remove(id);
            System.out.println("Student removed: " + id);
        } else {
            System.out.println("Student with id " + id + " not found");
        }
    }

    public Student findStudent(String id) {
        return studentMap.get(id);
    }

    public void displayAllStudents() {
        if(studentMap.isEmpty()) {
            System.out.println("No students found");
        } else {
            for(Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }
}
