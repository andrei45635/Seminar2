package org.example.seminar1.models;

public class MessageTask extends Task {
    private final Message message;

    public MessageTask(String taskID, String description, Message message) {
        super(taskID, description);
        this.message = message;
    }

    @Override
    public void execute() {
        //TODO: use dateTime formatter to format date
        System.out.println(message.getMessage() + " " + message.getDate().toString());
    }
}
