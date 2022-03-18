package com.bytedance.ee.bear.attachment.filereader;

import com.bytedance.ee.util.p700c.C13598b;
import java.io.Serializable;

public class FileClickData implements Serializable {
    private String downLoadPath;
    private String drive_file_key;
    private String file_id;
    private String file_mime_type;
    private String file_name;
    private long file_size;
    private String mount_node_token;
    private String mount_point;
    private String preview_from;
    private int type;

    public String getDownLoadPath() {
        return this.downLoadPath;
    }

    public String getDrive_file_key() {
        return this.drive_file_key;
    }

    public String getFile_id() {
        return this.file_id;
    }

    public String getFile_mime_type() {
        return this.file_mime_type;
    }

    public String getFile_name() {
        return this.file_name;
    }

    public long getFile_size() {
        return this.file_size;
    }

    public String getMount_node_token() {
        return this.mount_node_token;
    }

    public String getMount_point() {
        return this.mount_point;
    }

    public String getPreview_from() {
        return this.preview_from;
    }

    public int getType() {
        return this.type;
    }

    public FileClickData() {
        this.preview_from = "docs_attach";
    }

    public String toString() {
        return "FileClickModel{, file_mime_type='" + this.file_mime_type + '\'' + ", file_size=" + this.file_size + ", type=" + this.type + ", mount_node_token='" + C13598b.m55197d(this.mount_node_token) + '\'' + ", preview_from=" + this.preview_from + '}';
    }

    public void setDownLoadPath(String str) {
        this.downLoadPath = str;
    }

    public void setDrive_file_key(String str) {
        this.drive_file_key = str;
    }

    public void setFile_id(String str) {
        this.file_id = str;
    }

    public void setFile_mime_type(String str) {
        this.file_mime_type = str;
    }

    public void setFile_name(String str) {
        this.file_name = str;
    }

    public void setFile_size(long j) {
        this.file_size = j;
    }

    public void setMount_node_token(String str) {
        this.mount_node_token = str;
    }

    public void setMount_point(String str) {
        this.mount_point = str;
    }

    public void setPreview_from(String str) {
        this.preview_from = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public FileClickData(String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7) {
        this.preview_from = "docs_attach";
        this.file_id = str;
        this.drive_file_key = str2;
        this.file_name = str3;
        this.file_mime_type = str4;
        this.file_size = j;
        this.type = i;
        this.mount_node_token = str5;
        this.mount_point = str6;
        this.downLoadPath = str7;
    }

    public FileClickData(String str, String str2, String str3, String str4, long j, int i, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, j, i, str5, str6, str7);
        this.preview_from = str8;
    }
}
