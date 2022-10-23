import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tester {

    public static void main(String[] args){
        Student student = new Student("Podge Gaffney", 22, 18455202 , "14/05/2000");
        Lecturer lect = new Lecturer("Alan Watts", 62, 18455202, "20/12/1960");
        student.getUserName();
        System.out.println(student.getUserName());
        System.out.println(lect.getUserName());




    @Test
            String userName = student.getUserName();
            String obj2 = "Podge Gaffney18455202";
    public void testMethods()
    {
        assertEquals("Podge Gaffney18455202", userName);
    }

}
}