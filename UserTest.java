/*
* UserTest class created several test users
* List<User> expected is a list of users which returned by the method getAllUsers()
* List<User> actual is a list of users which we expect to get
* Assert.assertEquals(actual, expected) method that testing two lists,
* comparing all field's objects (if any inheritance - testing inheritance)
* ***********
* Test passed successfully.
*/

package junit;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getAllUsers() {
        User user = new User("John", 35, Gender.MALE);
        User user1 = new User("Mary", 34, Gender.FEMALE);
        User user2 = new User("Lisa", 7, Gender.FEMALE);

        // create list expected to fill it with our data
        List<User> expected = User.getAllUsers();

        //create list actual to fill it with data for comparison
        //data that method might return
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        //start the test. If expected and actual will not be equel test fails
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
