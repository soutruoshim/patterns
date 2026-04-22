package patterns.factory;

class AdminOfficeCreator extends CourseCreator {
    @Override
    public Course createCourse(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        if (type.equalsIgnoreCase("Khmer")) {
            return new KhmerCourse();
        } else if (type.equalsIgnoreCase("English")) {
            return new EnglishCourse();
        }

        throw new IllegalArgumentException("Unknown course type: " + type);
    }
}
