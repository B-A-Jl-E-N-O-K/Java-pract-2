package pract2_1;
import java.lang.*;
public class TestAuthor {

    public static void main(String[] args) {
        System.out.println("Test task №2.1: Author");
        Author author1 = new Author("Jonathan", "niceauthor1200@ggmail.com", 'm');
        System.out.println(author1.toString());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        System.out.println(author1.getEmail());
        author1.setEmail("mymail@ggmail.com");
        System.out.println(author1.toString());


    }
}
