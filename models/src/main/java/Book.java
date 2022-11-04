import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Book {

    private final @NonNull Author author;
    private final @NonNull String bookName;
    private final int numOfPages;

}
