package com.bytedance.ee.bear.doc.cover.selectcover.local;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/local/LocalImageItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "contentType", "", "uuid", "filePath", "fileName", "fileSize", "", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V", "getContentType", "()Ljava/lang/String;", "getFileName", "setFileName", "(Ljava/lang/String;)V", "getFilePath", "setFilePath", "getFileSize", "()J", "setFileSize", "(J)V", "getHeight", "()I", "setHeight", "(I)V", "getUuid", "setUuid", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LocalImageItem implements NonProguard {
    private final String contentType;
    private String fileName;
    private String filePath;
    private long fileSize;
    private int height;
    private String uuid;
    private int width;

    public static /* synthetic */ LocalImageItem copy$default(LocalImageItem localImageItem, String str, String str2, String str3, String str4, long j, int i, int i2, int i3, Object obj) {
        return localImageItem.copy((i3 & 1) != 0 ? localImageItem.contentType : str, (i3 & 2) != 0 ? localImageItem.uuid : str2, (i3 & 4) != 0 ? localImageItem.filePath : str3, (i3 & 8) != 0 ? localImageItem.fileName : str4, (i3 & 16) != 0 ? localImageItem.fileSize : j, (i3 & 32) != 0 ? localImageItem.width : i, (i3 & 64) != 0 ? localImageItem.height : i2);
    }

    public final String component1() {
        return this.contentType;
    }

    public final String component2() {
        return this.uuid;
    }

    public final String component3() {
        return this.filePath;
    }

    public final String component4() {
        return this.fileName;
    }

    public final long component5() {
        return this.fileSize;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final LocalImageItem copy(String str, String str2, String str3, String str4, long j, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "contentType");
        Intrinsics.checkParameterIsNotNull(str2, "uuid");
        Intrinsics.checkParameterIsNotNull(str3, "filePath");
        Intrinsics.checkParameterIsNotNull(str4, "fileName");
        return new LocalImageItem(str, str2, str3, str4, j, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalImageItem) {
                LocalImageItem localImageItem = (LocalImageItem) obj;
                if (Intrinsics.areEqual(this.contentType, localImageItem.contentType) && Intrinsics.areEqual(this.uuid, localImageItem.uuid) && Intrinsics.areEqual(this.filePath, localImageItem.filePath) && Intrinsics.areEqual(this.fileName, localImageItem.fileName)) {
                    if (this.fileSize == localImageItem.fileSize) {
                        if (this.width == localImageItem.width) {
                            if (this.height == localImageItem.height) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.contentType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uuid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.filePath;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fileName;
        if (str4 != null) {
            i = str4.hashCode();
        }
        long j = this.fileSize;
        return ((((((hashCode3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "LocalImageItem(contentType=" + this.contentType + ", uuid=" + this.uuid + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setFileName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.filePath = str;
    }

    public final void setUuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuid = str;
    }

    public LocalImageItem(String str, String str2, String str3, String str4, long j, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "contentType");
        Intrinsics.checkParameterIsNotNull(str2, "uuid");
        Intrinsics.checkParameterIsNotNull(str3, "filePath");
        Intrinsics.checkParameterIsNotNull(str4, "fileName");
        this.contentType = str;
        this.uuid = str2;
        this.filePath = str3;
        this.fileName = str4;
        this.fileSize = j;
        this.width = i;
        this.height = i2;
    }
}
