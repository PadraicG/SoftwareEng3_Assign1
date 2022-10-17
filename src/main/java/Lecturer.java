public class Lecturer {
    private String name;
    private int age;
    private int DOB;
    private String userName;
    private int id;
    private String[] modulesTaught;

    public Lecturer(String name, int id)
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
