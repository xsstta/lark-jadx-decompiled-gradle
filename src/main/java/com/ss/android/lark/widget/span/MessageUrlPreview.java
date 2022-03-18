package com.ss.android.lark.widget.span;

import java.io.Serializable;

public class MessageUrlPreview implements Serializable {
    private int count;
    private String description;
    private boolean isDeleted;
    private String messageId;
    private int offset;
    private int sequenceId;
    private String title;
    private String url;

    public int getCount() {
        return this.count;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSequenceId() {
        return this.sequenceId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setSequenceId(int i) {
        this.sequenceId = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
