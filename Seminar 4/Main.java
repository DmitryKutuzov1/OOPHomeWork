import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherControler teacherController = new TeacherControler();
        teacherController.create("aaba", "aaba", "aaba");
        teacherController.create("aaaa", "aaaa", "aaaa");
        teacherController.create("Aaaa", "Aaaa", "Aaaa");
        teacherController.create("bbbb", "bbbb", "bbbb");
        teacherController.sendOnConsole();

    //    Student student1 = new Student(4, "aab", "aab", "aab");
    //    Student student2 = new Student(2, "aaa", "aaa", "aaa");
    //    Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
    //    Student student4 = new Student(1, "bbb", "bbb", "bbb");
    //    List<Student> studentList = new ArrayList<>();
    //    StudentGroup studentGroup = new StudentGroup(studentList);
    //    studentGroup.addStudent(student1);
    //    studentGroup.addStudent(student2);
    //    studentGroup.addStudent(student3);
    //    studentGroup.addStudent(student4);
    //    StudentGroupService service = new StudentGroupService(studentGroup);
    //    for (Student student : studentGroup) {
    //        System.out.println(student);
    //    }
    //    System.out.println();
    //    for (Student student : service.getSortedStudentGroup()) {
    //        System.out.println(student);
    //    }
    //    System.out.println();
    //    for (Student student : service.getSortedStudentGroupByFIO()) {
    //        System.out.println(student);
    //    }
    //    StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
    //    while (iterator.hasNext())
    //        System.out.println(iterator.next());
    //    System.out.println();
    //    for(Student student : studentGroup){
    //        System.out.println(student);
    //    }
    //     StudentControler controller = new StudentControler();
    //     controller.create("aab", "aab", "aab");
    //     controller.create("aaa", "aaa", "aaa");
    //     controller.create("Aaa", "Aaa", "Aaa");
    //     controller.create("bbb", "bbb", "bbb");
    //     controller.sendOnConsole();
    }
}
