public class Student {
    private int rating;
    private String name;
    private static int studentsCounter;
    private static double avgRating;
    private static double generalRating;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rating) {
        this.rating = rating;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double getAvgRating() {
        if (studentsCounter > 0) {
            avgRating = generalRating / studentsCounter;
            return avgRating;
        } else
            return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        generalRating = generalRating + rating;
        studentsCounter++;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        generalRating = generalRating - this.rating;
        this.rating = rating;
        generalRating = generalRating + rating;
    }

    public static void removeStudent(Student student) {
        studentsCounter = studentsCounter - 1;
        generalRating = generalRating - student.rating;
    }

    @Override
    public String toString() {
        return "Name is: " + name + " with the Rate: " + rating;
    }
}