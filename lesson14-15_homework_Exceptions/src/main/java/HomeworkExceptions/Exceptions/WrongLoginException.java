package HomeworkExceptions.Exceptions;

import java.io.IOException;

public class WrongLoginException extends IOException {

    public WrongLoginException(String message) {
        super(message);
    }

    private String title;

    public WrongLoginException(String message, String title) {
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


