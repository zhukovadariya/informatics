package HTML;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.setFio("Жукова Дария Сергеевна");
        student.setBirthDate("2004-21-12");
        student.setGender("Ж");
        student.setYear(2022);
        student.setGroup("11-205");
        teacher.setFio("Камиль Шамилевич");
        teacher.setBirthDate("1990-01-01");
        teacher.setGender("M");
        teacher.setPosition("Учитель");
        teacher.setCources(new String[]{"Информатика"});
        HTMLPersonWriter writer = new HTMLStudentWriter(student, "student.html");
        writer.print();
        writer = new HTMLTeacherWriter(teacher, "teacher.html");
        writer.print();
    }
}
