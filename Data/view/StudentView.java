package Data.view;

import Data.Student;
import Data.controller.Controller;

public class StudentView {

    private Controller controller = new Controller();
    
    public void createStudent(Student stud) {
        controller.createUser(stud, stud.getDirection());
        System.out.println("Студент создан успешно!");   
    }

    public void readStudent() {
        System.out.println("Список студентов:");
        controller.read("student");
    }
}
