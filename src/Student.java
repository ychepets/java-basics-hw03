public class Student {
    private int rating;
    private String name;
    private static int studentsCounter;
    private static double avgRating;

    // TODO implement Student class according to the instructions provided in the README.md file

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
        return avgRating;
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
        avgRating = avgRating + (rating - avgRating)/++studentsCounter;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        avgRating = (avgRating * studentsCounter - this.rating)/(studentsCounter - 1);
        avgRating = avgRating + (rating - avgRating) / studentsCounter;
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        student.name = null;
        student.rating = 0;
        studentsCounter = 0;
        avgRating = 0.0;
    }

    @Override
    public String toString() {
        return "Name is: " + name + " with the Rate: " + rating;
    }
}