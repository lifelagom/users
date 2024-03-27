// Создать класс TeacherView с функцией создание и возвращения всех учителей
package Data;

import Data.view.StudentView;
import Data.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Василий", 32, "Информатика");
        Teacher teacher2 = new Teacher("Алексей", 27, "Математика");
    
        TeacherView view = new TeacherView();
        view.createTeacher(teacher1);
        view.createTeacher(teacher2);
        view.readTeacher();
    }

}
