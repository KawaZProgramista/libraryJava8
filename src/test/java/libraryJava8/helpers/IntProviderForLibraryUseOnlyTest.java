package libraryJava8.helpers;

import org.junit.Test;
import pl.kawazprogramista.libraryJava8.helpers.IntProviderForLibraryUseOnly;

import static org.junit.Assert.assertTrue;

public class IntProviderForLibraryUseOnlyTest {

    @Test
    public void testGetChar() {
        IntProviderForLibraryUseOnly subject = new IntProviderForLibraryUseOnly();
        assertTrue("method should return int < 10", subject.getInt() < 10);
    }

}
