public class Main {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Student student1 = new Student("Vlad","Programming","1");
        Student student2 = new Student("Oleksiy","Math","2");
        Student student3 = new Student("Ivan","Biology","3");
        Student student4 = new Student("Vadim","Chemistry","4");

        studentRegistry.addStudent(student1);
        studentRegistry.addStudent(student2);
        studentRegistry.addStudent(student3);
        studentRegistry.addStudent(student4);

        studentRegistry.displayAllStudents();

        System.out.println("Пошук за ID 3:");
        Student foundStudent = studentRegistry.findStudent("3");
        if(foundStudent != null) {
            System.out.println(foundStudent.toString());
        } else {
            System.out.println("Student not found");
        }

        // Видаляємо студента з реєстру
        studentRegistry.removeStudent("2");

        // Відображаємо всіх студентів після видалення
        studentRegistry.displayAllStudents();
    }
}
