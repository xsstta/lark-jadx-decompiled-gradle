package com.ss.android.lark.player.entity;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.lifecycle.C1177w;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.util.HashMap;

public class DataSource implements Serializable {
    private AssetFileDescriptor assetFileDescriptor;
    private String data;
    private HashMap<String, String> extra;
    private FileDescriptor fileDescriptor;
    private long id;
    private boolean isLocal;
    private final C1177w<Boolean> showPreloading = new C1177w<>(false);
    private String sid;
    private long size;
    private int startPos;
    private String tag;
    private String title;
    private Uri uri;

    public AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }

    public String getData() {
        return this.data;
    }

    public HashMap<String, String> getExtra() {
        return this.extra;
    }

    public FileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    public long getId() {
        return this.id;
    }

    public C1177w<Boolean> getShowPreloading() {
        return this.showPreloading;
    }

    public String getSid() {
        return this.sid;
    }

    public long getSize() {
        return this.size;
    }

    public int getStartPos() {
        return this.startPos;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public DataSource() {
    }

    public void setAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor2) {
        this.assetFileDescriptor = assetFileDescriptor2;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setExtra(HashMap<String, String> hashMap) {
        this.extra = hashMap;
    }

    public void setFileDescriptor(FileDescriptor fileDescriptor2) {
        this.fileDescriptor = fileDescriptor2;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsLocal(boolean z) {
        this.isLocal = z;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setStartPos(int i) {
        this.startPos = i;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUri(Uri uri2) {
        this.uri = uri2;
    }

    public DataSource(String str) {
        this.data = str;
    }

    public DataSource(String str, String str2) {
        this.tag = str;
        this.data = str2;
    }
}
