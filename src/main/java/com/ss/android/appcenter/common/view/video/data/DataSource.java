package com.ss.android.appcenter.common.view.video.data;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.firebase.messaging.Constants;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0004R\u001a\u0010*\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/data/DataSource;", "Ljava/io/Serializable;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/String;)V", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "assetFileDescriptor", "Landroid/content/res/AssetFileDescriptor;", "getAssetFileDescriptor", "()Landroid/content/res/AssetFileDescriptor;", "setAssetFileDescriptor", "(Landroid/content/res/AssetFileDescriptor;)V", "getData", "()Ljava/lang/String;", "setData", "extra", "Ljava/util/HashMap;", "getExtra", "()Ljava/util/HashMap;", "setExtra", "(Ljava/util/HashMap;)V", "fileDescriptor", "Ljava/io/FileDescriptor;", "getFileDescriptor", "()Ljava/io/FileDescriptor;", "setFileDescriptor", "(Ljava/io/FileDescriptor;)V", "id", "", "getId", "()J", "setId", "(J)V", "isLocal", "", "()Z", "setLocal", "(Z)V", "sid", "getSid", "setSid", "startPos", "getStartPos", "setStartPos", "getTag", "setTag", "title", "getTitle", "setTitle", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DataSource implements Serializable {
    private AssetFileDescriptor assetFileDescriptor;
    private String data;
    private HashMap<String, String> extra;
    private FileDescriptor fileDescriptor;
    private long id;
    private boolean isLocal;
    private String sid;
    private long startPos;
    private String tag;
    private String title;
    private Uri uri;

    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }

    public final String getData() {
        return this.data;
    }

    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    public final FileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    public final long getId() {
        return this.id;
    }

    public final String getSid() {
        return this.sid;
    }

    public final long getStartPos() {
        return this.startPos;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final void setAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor2) {
        this.assetFileDescriptor = assetFileDescriptor2;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setExtra(HashMap<String, String> hashMap) {
        this.extra = hashMap;
    }

    public final void setFileDescriptor(FileDescriptor fileDescriptor2) {
        this.fileDescriptor = fileDescriptor2;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocal(boolean z) {
        this.isLocal = z;
    }

    public final void setSid(String str) {
        this.sid = str;
    }

    public final void setStartPos(long j) {
        this.startPos = j;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUri(Uri uri2) {
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
