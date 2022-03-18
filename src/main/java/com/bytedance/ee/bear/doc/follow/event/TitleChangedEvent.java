package com.bytedance.ee.bear.doc.follow.event;

import com.bytedance.ee.util.p700c.C13598b;

public class TitleChangedEvent implements ContentEvent {
    public String title;

    public TitleChangedEvent() {
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "TitleChangedEvent{title='" + C13598b.m55197d(this.title) + '\'' + '}';
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public TitleChangedEvent(String str) {
        this.title = str;
    }
}
