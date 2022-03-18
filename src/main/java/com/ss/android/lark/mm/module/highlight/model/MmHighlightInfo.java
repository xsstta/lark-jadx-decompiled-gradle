package com.ss.android.lark.mm.module.highlight.model;

import java.io.Serializable;

public class MmHighlightInfo implements Serializable {
    private String comment_id;
    private String highlight_id;
    private int offset;
    private int offsetInPara;
    private int size;
    private int type;
    private String uuid;

    public String getComment_id() {
        return this.comment_id;
    }

    public String getHighlight_id() {
        return this.highlight_id;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getOffsetInPara() {
        return this.offsetInPara;
    }

    public int getSize() {
        return this.size;
    }

    public int getType() {
        return this.type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setHighlight_id(String str) {
        this.highlight_id = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setOffsetInPara(int i) {
        this.offsetInPara = i;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
