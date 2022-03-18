package com.ss.android.appcenter.business.net.pupups;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/appcenter/business/net/pupups/PopupsElement;", "Ljava/io/Serializable;", "()V", "fileKey", "", "getFileKey", "()Ljava/lang/String;", "setFileKey", "(Ljava/lang/String;)V", "imgKey", "getImgKey", "setImgKey", "tag", "getTag", "setTag", "url", "getUrl", "setUrl", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsElement implements Serializable {
    @SerializedName("file_key")
    private String fileKey;
    @SerializedName("img_key")
    private String imgKey;
    @SerializedName("tag")
    private String tag;
    @SerializedName("url")
    private String url;

    public final String getFileKey() {
        return this.fileKey;
    }

    public final String getImgKey() {
        return this.imgKey;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setFileKey(String str) {
        this.fileKey = str;
    }

    public final void setImgKey(String str) {
        this.imgKey = str;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
