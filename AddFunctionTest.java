import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFunctionTest {
    // need to think of some tests for addfunction (specifically one that doesn't work)
    @Test
    public void testAdd() {
        assertEquals(5, AddFunction.add(1, 4));
        // should fail because 5 != 4
    }
} // switched the command line run command because I am on a windows machine
// one failure confirmed out of one test.
// time to push
// now its time to login with ssh
// had command saved with up key
// dont need to change commands because server runs linux
// time to fix code