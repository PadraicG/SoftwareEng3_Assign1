public class Lecturer {
    private String name;
    private int age;
    private String DOB;
    private String userName;
    private int id;
    private String[] modulesTaught;

    public Lecturer(String name, int age, int id, String DOB)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.userName = name + id;
        this.id = id;
    }

    public String getUserName()
    {
        return userName;
    }

}
