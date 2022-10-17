import org.joda.time.DateTime;

public class Course {
    private String name;
    private Module[] associatedModules;
    private Student[] associatedStudents;
    private DateTime endDate = new DateTime();
     private DateTime startDate = new DateTime();

}
