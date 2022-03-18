package com.bytedance.ee.bear.bitable.card.model.stmodel.cell;

import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;

public class AttachmentEntity implements NonProguard {
    private String attachmentToken;
    private int category;
    private String extra;
    private int height;
    private String id;
    private String mimeType;
    private String mountNodeToken;
    private String mountPointType;
    private String name;
    private long size;
    private int width;

    public AttachmentEntity() {
    }

    public String getAttachmentToken() {
        return this.attachmentToken;
    }

    public int getCategory() {
        return this.category;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMountNodeToken() {
        return this.mountNodeToken;
    }

    public String getMountPointType() {
        return this.mountPointType;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAttachmentToken(String str) {
        this.attachmentToken = str;
    }

    public void setCategory(int i) {
        this.category = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setMountNodeToken(String str) {
        this.mountNodeToken = str;
    }

    public void setMountPointType(String str) {
        this.mountPointType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @JSONCreator
    public AttachmentEntity(@JSONField(name = "category") int i, @JSONField(name = "attachmentToken") String str, @JSONField(name = "name") String str2, @JSONField(name = "id") String str3, @JSONField(name = "mountPointType") String str4, @JSONField(name = "mountNodeToken") String str5, @JSONField(name = "mimeType") String str6, @JSONField(name = "size") long j, @JSONField(name = "width") int i2, @JSONField(name = "height") int i3, @JSONField(name = "extra") String str7) {
        this.category = i;
        this.attachmentToken = str;
        this.name = str2;
        this.id = str3;
        this.mountPointType = str4;
        this.mountNodeToken = str5;
        this.mimeType = str6;
        this.size = j;
        this.width = i2;
        this.height = i3;
        this.extra = str7;
    }
}
