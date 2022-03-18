package com.ss.android.lark.biz.im.api;

import com.alibaba.fastjson.annotation.JSONType;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

@JSONType(typeName = "StickerContent")
public class StickerContent implements AbstractC26248b<StickerContent>, Serializable {
    private int height;
    private boolean isAdded;
    private String key;
    private int width;

    public boolean isContentSame(StickerContent stickerContent) {
        return true;
    }

    public StickerContent() {
    }

    public int getHeight() {
        return this.height;
    }

    public String getKey() {
        return this.key;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAdded() {
        return this.isAdded;
    }

    public void setAdded(boolean z) {
        this.isAdded = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean isItemSame(StickerContent stickerContent) {
        return equals(stickerContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != StickerContent.class) {
            return false;
        }
        return this.key.equals(((StickerContent) obj).getKey());
    }

    public StickerContent(String str, int i, int i2) {
        this.key = str;
        this.width = i;
        this.height = i2;
    }
}
