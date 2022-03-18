package com.bytedance.ee.bear.document.feed;

import java.io.Serializable;

public class FeedDocInfo implements Serializable {
    private boolean isOwner;

    public boolean isIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(boolean z) {
        this.isOwner = z;
    }
}
