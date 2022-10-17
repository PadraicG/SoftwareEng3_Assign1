public class Student {
    private String name;
    private int id;
    private int age;
    private String course;
    private int DOB;
    private String userName;
    private String[] modulesRegistered;


    public Student(String name, int id){
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

