package libraryJava8.mainpackage;

import org.junit.Test;
import pl.kawazprogramista.libraryJava8.mainpackage.StringProvider;

import static org.junit.Assert.assertTrue;

public class StringProviderTest {

    @Test
    public void getStringTest() {
        StringProvider subject = new StringProvider();
        String string = subject.getString();
        assertTrue("String " + string + " 20 chars", string.length() == 20);
    }
}
