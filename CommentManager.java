
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentManager {
    private Set<String> authors; 

    public CommentManager() {
        this.authors = new HashSet<>();
    }

    public boolean addComment(Comment comment) {
        if (authors.contains(comment.getAuthor())) {
            return false; 
        }
        authors.add(comment.getAuthor());
        return true;
    }
}

//public class CommentTest {
    //private CommentManager commentManager;

   // /**
    // * Default constructor for test class CommentTest
   //  */
    //public CommentTest() {
   // }

  //  /**
  //   * Sets up the test fixture.
   //  *
   //  * Called before every test case method.
   //  */
  //  @BeforeEach
   // public void setUp() {
   //     commentManager = new CommentManager();
  //  }

 //     * Tears down the test fixture.
  //   *
  //   * Called after every test case method.
 //    */
//    @AfterEach
   // public void tearDown() {
    //}

   // /**
 //    * Test that addComment returns false when a comment from the same author already exists.
 //    */
//    @Test
 //   public void testAddCommentFailsForDuplicateAuthor() {
    //    Comment comment1 = new Comment(":D", "Great product!", 5);
      //  Comment comment2 = new Comment("aw", "I changed my mind", 3);

    //    assertTrue(commentManager.addComment(comment1), "First comment should be added successfully.");
   //     assertFalse(commentManager.addComment(comment2), "Second comment from the same author should not be added.");
   

    

