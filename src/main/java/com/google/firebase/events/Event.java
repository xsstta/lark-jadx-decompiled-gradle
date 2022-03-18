package com.google.firebase.events;

import com.google.firebase.components.C22776n;

public class Event<T> {
    private final T payload;
    private final Class<T> type;

    public T getPayload() {
        return this.payload;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }

    public Event(Class<T> cls, T t) {
        this.type = (Class) C22776n.m82763a(cls);
        this.payload = (T) C22776n.m82763a(t);
    }
}
