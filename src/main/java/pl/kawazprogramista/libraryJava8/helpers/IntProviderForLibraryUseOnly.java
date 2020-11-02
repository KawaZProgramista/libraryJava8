package pl.kawazprogramista.libraryJava8.helpers;

import java.util.Random;

public class IntProviderForLibraryUseOnly {
    public int getInt() {
        return new Random().nextInt(10);
    }
}
