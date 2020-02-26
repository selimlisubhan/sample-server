package interview.server.model;

import java.io.Serializable;

public class MessageModel implements Serializable {
    private static final long serialVersionUID = 1768516483070255834L;

    private int id;
    private String message;
    private int status;

    public MessageModel() {
        this.id = 0;
        this.message = "";
        this.status = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
