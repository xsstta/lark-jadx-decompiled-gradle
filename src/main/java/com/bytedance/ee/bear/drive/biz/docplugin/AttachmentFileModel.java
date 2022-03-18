package com.bytedance.ee.bear.drive.biz.docplugin;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;

public class AttachmentFileModel implements NonProguard {
    @JSONField(name = "bussinessId")
    private String bussinessId;
    @JSONField(name = "extra")
    private String extra;
    @JSONField(name = "file_mime_type")
    private String fileMimeType;
    @JSONField(name = "file_name")
    private String fileName;
    @JSONField(name = "file_size")
    private long fileSize;
    @JSONField(name = "file_token")
    private String fileToken;
    @JSONField(name = "mount_node_token")
    private String mountNodeToken;
    @JSONField(name = "mount_point")
    private String mountPoint;

    public String getBussinessId() {
        return this.bussinessId;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFileMmeType() {
        return this.fileMimeType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public String getMountNodeToken() {
        return this.mountNodeToken;
    }

    public String getMountPoint() {
        return this.mountPoint;
    }

    public String toString() {
        return "AttachmentFileModel{fileToken='" + C13598b.m55200g(this.fileToken) + '\'' + ", fileName='" + C13598b.m55197d(this.fileName) + '\'' + ", fileSize=" + this.fileSize + ", fileMimeType='" + this.fileMimeType + '\'' + ", mountNodeToken='" + C13598b.m55197d(this.mountNodeToken) + '\'' + ", mountPoint='" + this.mountPoint + '\'' + ", bussinessId='" + this.bussinessId + '\'' + '}';
    }

    public void setBussinessId(String str) {
        this.bussinessId = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFileMemeType(String str) {
        this.fileMimeType = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setMountNodeToken(String str) {
        this.mountNodeToken = str;
    }

    public void setMountPoint(String str) {
        this.mountPoint = str;
    }
}
