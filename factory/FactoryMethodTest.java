package patterns.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseCreator admin = new AdminOfficeCreator();

        Course c1 = admin.createCourse("Khmer");
        c1.start();

        Course c2 = admin.createCourse("English");
        c2.start();
    }
}
