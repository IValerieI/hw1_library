import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.LinkedList;

@RequiredArgsConstructor
@Getter
public class Library {

    private final @NonNull String libraryName;
    private final @NonNull HashMap<Author, LinkedList<Book>> archive;
    private final int size;
}
