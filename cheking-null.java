/*
* UserTest class created several test users
* List<User> expected is a list of users which returned by the method getAllUsers()
* List<User> actual is a list of users which we expect to get
* Assert.assertEquals(actual, expected) method that testing two lists,
* comparing all field's objects (if any inheritance - testing inheritance)
*/

/* Tests failed because field allUsers was initialized in the constructor. When getAllUsers() was
*  called there any object has been created. 
* Next step to remove initialization from the constructor, than create it after field appers.
* In main we can check JUnit : main = 1 : 0.
* */

package junit;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void getAllUsers_NO_NULL() {
        //checking for null
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    } // test failed
    
    public void getAllUsers() {
        // create tested data
        User user = new User("John", 35, Gender.MALE);
        User user1 = new User("Mary", 34, Gender.FEMALE);
        User user2 = new User("Lisa", 7, Gender.FEMALE);

        // create list expected to fill it with our data
        List<User> expected = User.getAllUsers();

        //create list actual to fill it with data for comparison
        //data that method might return
        List<User> actual = new ArrayList<>();
        actual.add(new User("User1", 1, Gender.MALE));
        actual.add(new User("User2", 2, Gender.FEMALE));
        actual.add(new User("User3", 3, Gender.MALE));

        //start the test. If expected и actual will not be equel
        //test fails and result appear
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllUsers() {
    }

    @Test
    public void getHowManyUsers() {
    }

    @Test
    public void testGetHowManyUsers() {
    }

    @Test
    // data for testing
    public void getAllAgeUsers() {

    }

    @Test
    public void testGetAllAgeUsers() {
    }

    @Test
    public void getAverageAgeOfAllUsers() {
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
    }
}
