public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("Trilokesh", "12345", "K");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Rajasekaran");
        controller.setStudentGrade("N");
        controller.updateView();
    }
}
