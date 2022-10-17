import org.joda.time.DateTime;

public class Course {
    private String name;
    private Module[] associatedModules;
    private Student[] associatedStudents;
    private DateTime endDate = new DateTime();
     private DateTime startDate = new DateTime();

     public Course(String name, DateTime startDate, DateTime endDate)
     {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;

     }

}
