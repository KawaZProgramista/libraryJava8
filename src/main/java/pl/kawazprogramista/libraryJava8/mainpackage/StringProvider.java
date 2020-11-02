package pl.kawazprogramista.libraryJava8.mainpackage;

import pl.kawazprogramista.libraryJava8.helpers.IntProviderForLibraryUseOnly;

import java.util.stream.IntStream;

public class StringProvider {
    private final IntProviderForLibraryUseOnly intProviderForLibraryUseOnly = new IntProviderForLibraryUseOnly();

    public String getString() {
        return IntStream.range(0, 20)
                .mapToObj(i -> intProviderForLibraryUseOnly.getInt())
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
