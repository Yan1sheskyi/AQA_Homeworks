package HomeworkExceptions.Exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {

    public WrongPasswordException(String message) {
        super(message);
    }

    private String title;

    public WrongPasswordException(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
