package com.ss.android.lark.chat.export.entity.message.content;

import java.io.Serializable;

public class ContentValue implements Serializable {
    private SystemMessageAction action;
    private int actionId;
    private ContentValueType contentValueType;
    private String id;
    private Boolean isAnonymous;
    private boolean isClickable;
    private String link;
    private String value;

    public SystemMessageAction getAction() {
        return this.action;
    }

    public int getActionId() {
        return this.actionId;
    }

    public ContentValueType getContentValueType() {
        return this.contentValueType;
    }

    public String getId() {
        return this.id;
    }

    public String getLink() {
        return this.link;
    }

    public String getValue() {
        return this.value;
    }

    public Boolean isAnonymous() {
        return this.isAnonymous;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public void setAction(SystemMessageAction systemMessageAction) {
        this.action = systemMessageAction;
    }

    public void setActionId(int i) {
        this.actionId = i;
    }

    public void setAnonymous(Boolean bool) {
        this.isAnonymous = bool;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setContentValueType(ContentValueType contentValueType2) {
        this.contentValueType = contentValueType2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
