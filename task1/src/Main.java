// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
// Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
// Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(2002, 10, 19), 4.9f));
        listStudents.add(new Student("Петров", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Сидоров", LocalDate.of(1999, 1, 13), 3.1f));
        listStudents.add(new Student("Воробьёв", LocalDate.of(2002, 10, 19), 4.9f));
        listStudents.add(new Student("Душичев", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Таланов", LocalDate.of(1999, 1, 13), 3.1f));
        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup)
        {
            System.out.println(student);
        }
    }
}
