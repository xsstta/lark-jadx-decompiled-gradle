package com.bytedance.ee.bear.fileselector.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/fileselector/bean/SelectedImageItem;", "Ljava/io/Serializable;", "uuid", "", "imgFile", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;II)V", "getHeight", "()I", "setHeight", "(I)V", "getImgFile", "()Ljava/lang/String;", "setImgFile", "(Ljava/lang/String;)V", "getUuid", "setUuid", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "file-selector_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SelectedImageItem implements Serializable {
    private int height;
    private String imgFile;
    private String uuid;
    private int width;

    public static /* synthetic */ SelectedImageItem copy$default(SelectedImageItem selectedImageItem, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = selectedImageItem.uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = selectedImageItem.imgFile;
        }
        if ((i3 & 4) != 0) {
            i = selectedImageItem.width;
        }
        if ((i3 & 8) != 0) {
            i2 = selectedImageItem.height;
        }
        return selectedImageItem.copy(str, str2, i, i2);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.imgFile;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final SelectedImageItem copy(String str, String str2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        Intrinsics.checkParameterIsNotNull(str2, "imgFile");
        return new SelectedImageItem(str, str2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelectedImageItem) {
                SelectedImageItem selectedImageItem = (SelectedImageItem) obj;
                if (Intrinsics.areEqual(this.uuid, selectedImageItem.uuid) && Intrinsics.areEqual(this.imgFile, selectedImageItem.imgFile)) {
                    if (this.width == selectedImageItem.width) {
                        if (this.height == selectedImageItem.height) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.uuid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.imgFile;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "SelectedImageItem(uuid=" + this.uuid + ", imgFile=" + this.imgFile + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getImgFile() {
        return this.imgFile;
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

    public final void setImgFile(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.imgFile = str;
    }

    public final void setUuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuid = str;
    }

    public SelectedImageItem(String str, String str2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        Intrinsics.checkParameterIsNotNull(str2, "imgFile");
        this.uuid = str;
        this.imgFile = str2;
        this.width = i;
        this.height = i2;
    }
}
