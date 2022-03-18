package com.larksuite.component.blockit.entity;

public enum Domain {
    chat(1),
    message(2),
    event(3),
    calendar(4),
    docs(5),
    sheet(6),
    todo(7);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static Domain valueOf(int i) {
        return forNumber(i);
    }

    public static Domain forNumber(int i) {
        switch (i) {
            case 1:
                return chat;
            case 2:
                return message;
            case 3:
                return event;
            case 4:
                return calendar;
            case 5:
                return docs;
            case 6:
                return sheet;
            case 7:
                return todo;
            default:
                return null;
        }
    }

    private Domain(int i) {
        this.value = i;
    }
}
