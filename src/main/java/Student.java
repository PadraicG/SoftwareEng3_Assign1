public class Student {
    private String name;
    private int id;
    private int age;
    private String course;
    private String DOB;
    private String userName;
    private String[] modulesRegistered;


    public Student(String name, int age, int id, String DOB){
        this.name = name;
        this.id = id;
        this.course = course;
        this.DOB = DOB;
        this.age = age;
        this.userName = name + id;
    }

    public String getUserName(){
        return userName;
    }

}

