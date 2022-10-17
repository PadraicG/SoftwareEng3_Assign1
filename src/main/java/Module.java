public class Module {
    private String name;
    private String id;
    private Student[] students;
    private Course[] associatedCourses;
    private Lecturer associatedLecturer;

    public Module(String name, String id){

        this.name = name;
        this.id = id;
    }
}
