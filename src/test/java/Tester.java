import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Tester {

    public static void main(String[] args){
        Student student = new Student("Podge Gaffney", 5, 18455202 , "14/05/2000");
        Lecturer lect = new Lecturer("Alan Watts", 8, 18455202, "20/12/1940");
        student.getUserName();
        System.out.println(student.getUserName());
        System.out.println(lect.getUserName());


    }

    @Test
    void testMethods(){
        //assertTrue(student.userName)
    }

}
