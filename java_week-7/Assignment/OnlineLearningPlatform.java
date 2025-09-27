class Course {
    protected String title;
    protected String instructor;
    protected String enrollmentDate;

    public Course(String title, String instructor, String enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    public void showProgress() {
        System.out.println(title + " by " + instructor + " - progress not tracked");
    }
}

class VideoCourse extends Course {
    private int completionPercent;
    private int watchTime;

    public VideoCourse(String title, String instructor, String date, int completionPercent, int watchTime) {
        super(title, instructor, date);
        this.completionPercent = completionPercent;
        this.watchTime = watchTime;
    }

    @Override
    public void showProgress() {
        System.out.println("Video Course: " + title + " - " + completionPercent + "% completed, Watch Time: " + watchTime + " mins");
    }
}

class InteractiveCourse extends Course {
    private int quizzesCompleted;
    private int projectsCompleted;

    public InteractiveCourse(String title, String instructor, String date, int quizzes, int projects) {
        super(title, instructor, date);
        this.quizzesCompleted = quizzes;
        this.projectsCompleted = projects;
    }

    @Override
    public void showProgress() {
        System.out.println("Interactive Course: " + title + " - Quizzes: " + quizzesCompleted + ", Projects: " + projectsCompleted);
    }
}

class ReadingCourse extends Course {
    private int pagesRead;
    private int notesTaken;

    public ReadingCourse(String title, String instructor, String date, int pages, int notes) {
        super(title, instructor, date);
        this.pagesRead = pages;
        this.notesTaken = notes;
    }

    @Override
    public void showProgress() {
        System.out.println("Reading Course: " + title + " - Pages read: " + pagesRead + ", Notes: " + notesTaken);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course[] courses = {
            new VideoCourse("Java Basics", "Alice", "01-01-2025", 50, 120),
            new InteractiveCourse("Python Project", "Bob", "02-01-2025", 3, 1),
            new ReadingCourse("Data Science Book", "Carol", "03-01-2025", 100, 20)
        };

        for (Course c : courses) {
            c.showProgress(); // Runtime polymorphism
        }
    }
}
