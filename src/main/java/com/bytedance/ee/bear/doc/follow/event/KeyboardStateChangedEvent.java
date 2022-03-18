package com.bytedance.ee.bear.doc.follow.event;

public class KeyboardStateChangedEvent implements ContentEvent {
    public final boolean shown;

    public String toString() {
        return "KeyboardStateChangedEvent{shown=" + this.shown + '}';
    }

    public KeyboardStateChangedEvent(boolean z) {
        this.shown = z;
    }
}
