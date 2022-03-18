package com.ss.android.lark.mail.impl.mailtoolbar.plugins.image;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mail/impl/mailtoolbar/plugins/image/ImageItem;", "Ljava/io/Serializable;", "uuid", "", "src", "width", "", "height", "name", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getHeight", "()I", "setHeight", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSrc", "setSrc", "getUuid", "setUuid", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageItem implements Serializable {
    private int height;
    private String name;
    private String src;
    private String uuid;
    private int width;

    public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageItem.uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = imageItem.src;
        }
        if ((i3 & 4) != 0) {
            i = imageItem.width;
        }
        if ((i3 & 8) != 0) {
            i2 = imageItem.height;
        }
        if ((i3 & 16) != 0) {
            str3 = imageItem.name;
        }
        return imageItem.copy(str, str2, i, i2, str3);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.src;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final String component5() {
        return this.name;
    }

    public final ImageItem copy(String str, String str2, int i, int i2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        Intrinsics.checkParameterIsNotNull(str2, "src");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        return new ImageItem(str, str2, i, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return Intrinsics.areEqual(this.uuid, imageItem.uuid) && Intrinsics.areEqual(this.src, imageItem.src) && this.width == imageItem.width && this.height == imageItem.height && Intrinsics.areEqual(this.name, imageItem.name);
    }

    public int hashCode() {
        String str = this.uuid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.src;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ImageItem(uuid=" + this.uuid + ", src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", name=" + this.name + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setSrc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.src = str;
    }

    public final void setUuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuid = str;
    }

    public ImageItem(String str, String str2, int i, int i2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        Intrinsics.checkParameterIsNotNull(str2, "src");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        this.uuid = str;
        this.src = str2;
        this.width = i;
        this.height = i2;
        this.name = str3;
    }
}
