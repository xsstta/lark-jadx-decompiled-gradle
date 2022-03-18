package com.bytedance.ee.bear.doc.follow.event;

import com.bytedance.ee.util.p700c.C13598b;

public class OpenLinkEvent implements ContentEvent {
    public final String title;
    public final String url;

    public String toString() {
        return "OpenLinkEvent{title='" + C13598b.m55197d(this.title) + '\'' + ", url='" + C13598b.m55197d(this.url) + '\'' + '}';
    }

    public OpenLinkEvent(String str) {
        this("", str);
    }

    public OpenLinkEvent(String str, String str2) {
        this.title = str;
        this.url = str2;
    }
}
