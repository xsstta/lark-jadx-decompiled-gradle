package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Map;

public class FileUploadModel implements NonProguard {
    private String contentType = "image";
    private String doc_url;
    private String fileName;
    private String file_url;
    private String from;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> multiparts;
    private String pencilKitToken;
    private int size;
    private String token;
    private String type;
    private Map<String, String> uploadParams;
    private int uploadType;
    private String url;
    private String[] uuids;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FILE_UPLOAD_TYPE {
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getDoc_url() {
        return this.doc_url;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFile_url() {
        return this.file_url;
    }

    public String getFrom() {
        return this.from;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, String> getMultiparts() {
        return this.multiparts;
    }

    public String getPencilKitToken() {
        return this.pencilKitToken;
    }

    public int getSize() {
        return this.size;
    }

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, String> getUploadParams() {
        return this.uploadParams;
    }

    public int getUploadType() {
        return this.uploadType;
    }

    public String getUrl() {
        return this.url;
    }

    public String[] getUuids() {
        return this.uuids;
    }

    public FileUploadModel() {
    }

    public String getDriveToken() {
        Map<String, String> map = this.uploadParams;
        if (map != null) {
            return map.get("drive_token");
        }
        return "";
    }

    public String fetchFirstUuid() {
        if (getUuids() == null || getUuids().length == 0) {
            return "";
        }
        return getUuids()[0];
    }

    public String getMountNodeToken() {
        String str;
        Map<String, String> map = this.uploadParams;
        if (map == null || (str = map.get("mount_node_token")) == null) {
            return "";
        }
        return str;
    }

    public String getMountPoint() {
        String str;
        Map<String, String> map = this.uploadParams;
        if (map == null || (str = map.get("mount_point")) == null) {
            return "";
        }
        return str;
    }

    public int getObjType() {
        int b = C8275a.f22371d.mo32555b();
        Map<String, String> map = this.uploadParams;
        if (map != null) {
            return C13721c.m55641a(map.get("obj_type"), C8275a.f22371d.mo32555b());
        }
        return b;
    }

    public String toString() {
        return "FileUploadModel{url='" + C13721c.m55650d(this.url) + '\'' + ", uuids=" + Arrays.toString(this.uuids) + ", method='" + this.method + '\'' + ", file_url='" + C13721c.m55650d(this.file_url) + '\'' + ", token='" + C13721c.m55650d(this.token) + '\'' + ", driveToken='" + C13721c.m55650d(getDriveToken()) + '\'' + ", pencilKitToken='" + C13721c.m55650d(this.pencilKitToken) + '\'' + ", doc_url='" + C13721c.m55650d(this.doc_url) + '\'' + ", type='" + this.type + '\'' + ", size=" + this.size + ", uploadType=" + this.uploadType + ", contentType=" + this.contentType + '}';
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setDoc_url(String str) {
        this.doc_url = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFile_url(String str) {
        this.file_url = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setMultiparts(Map<String, String> map) {
        this.multiparts = map;
    }

    public void setPencilKitToken(String str) {
        this.pencilKitToken = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUploadParams(Map<String, String> map) {
        this.uploadParams = map;
    }

    public void setUploadType(int i) {
        this.uploadType = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUuids(String[] strArr) {
        this.uuids = strArr;
    }

    public FileUploadModel(Map<String, String> map) {
        this.uploadParams = map;
    }
}
