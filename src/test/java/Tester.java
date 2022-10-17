import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Tester {

    public static void main(String[] args){
        Student student = new Student("Podge Gaffney", 5);
        Lecturer lect = new Lecturer("Alan Watts", 8);
        student.getUserName();
        System.out.println(student.getUserName());
        System.out.println(lect.getUserName());


    }

    @Test
    void testMethods(){
        assertTrue(student.userName)
    }

}
