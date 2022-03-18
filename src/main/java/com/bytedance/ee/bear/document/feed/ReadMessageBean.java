package com.bytedance.ee.bear.document.feed;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class ReadMessageBean implements NonProguard {
    private List<String> messageIds;

    public List<String> getMessageIds() {
        return this.messageIds;
    }

    public String toString() {
        return "ReadMessageBean{messageIds=" + this.messageIds + '}';
    }

    public void setMessageIds(List<String> list) {
        this.messageIds = list;
    }
}
