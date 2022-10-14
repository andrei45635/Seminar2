package org.example.seminar1.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private final String message;
    private final String from;
    private final String to;
    private final LocalDateTime date;

    public Message(String message, String from, String to, LocalDateTime date) {
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
