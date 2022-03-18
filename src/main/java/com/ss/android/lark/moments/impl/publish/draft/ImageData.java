package com.ss.android.lark.moments.impl.publish.draft;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "Ljava/io/Serializable;", "()V", "localPath", "", "width", "", "height", "token", "(Ljava/lang/String;IILjava/lang/String;)V", "getHeight", "()I", "setHeight", "(I)V", "getLocalPath", "()Ljava/lang/String;", "setLocalPath", "(Ljava/lang/String;)V", "getToken", "setToken", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageData implements Serializable {
    private int height;
    private String localPath;
    private String token;
    private int width;

    public static /* synthetic */ ImageData copy$default(ImageData imageData, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageData.localPath;
        }
        if ((i3 & 2) != 0) {
            i = imageData.width;
        }
        if ((i3 & 4) != 0) {
            i2 = imageData.height;
        }
        if ((i3 & 8) != 0) {
            str2 = imageData.token;
        }
        return imageData.copy(str, i, i2, str2);
    }

    public final String component1() {
        return this.localPath;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final String component4() {
        return this.token;
    }

    public final ImageData copy(String str, int i, int i2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPath");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        return new ImageData(str, i, i2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) obj;
        return Intrinsics.areEqual(this.localPath, imageData.localPath) && this.width == imageData.width && this.height == imageData.height && Intrinsics.areEqual(this.token, imageData.token);
    }

    public int hashCode() {
        String str = this.localPath;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height) * 31;
        String str2 = this.token;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ImageData(localPath=" + this.localPath + ", width=" + this.width + ", height=" + this.height + ", token=" + this.token + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getToken() {
        return this.token;
    }

    public final int getWidth() {
        return this.width;
    }

    public ImageData() {
        this("", 0, 0, "");
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setLocalPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.localPath = str;
    }

    public final void setToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.token = str;
    }

    public ImageData(String str, int i, int i2, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPath");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.localPath = str;
        this.width = i;
        this.height = i2;
        this.token = str2;
    }
}
