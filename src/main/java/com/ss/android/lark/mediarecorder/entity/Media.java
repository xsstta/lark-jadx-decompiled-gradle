package com.ss.android.lark.mediarecorder.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B?\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010B\u0005¢\u0006\u0002\u0010\u0011J\b\u0010(\u001a\u00020\u0004H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0004H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001a¨\u0006-"}, d2 = {"Lcom/ss/android/lark/mediarecorder/entity/Media;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "id", "", "path", "", "mimeType", "duration", "", "w", C14002h.f36692e, "size", "(ILjava/lang/String;Ljava/lang/String;JIIJ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "getDuration", "()J", "setDuration", "(J)V", "height", "getHeight", "()I", "setHeight", "(I)V", "getId", "setId", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "getPath", "setPath", "getSize", "setSize", "width", "getWidth", "setWidth", "describeContents", "writeToParcel", "", "flags", "CREATOR", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
public final class Media implements Parcelable, Serializable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private long duration;
    private int height;
    private int id;
    private String mimeType;
    private String path;
    private long size;
    private int width;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mediarecorder/entity/Media$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/mediarecorder/entity/Media;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/mediarecorder/entity/Media;", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.entity.Media$a */
    public static final class CREATOR implements Parcelable.Creator<Media> {
        private CREATOR() {
        }

        /* renamed from: a */
        public Media[] newArray(int i) {
            return new Media[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public Media createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new Media(parcel);
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getWidth() {
        return this.width;
    }

    public Media() {
        this.path = "";
        this.mimeType = "";
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setMimeType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.path = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Media(Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.id = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        this.path = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.mimeType = readString2 != null ? readString2 : str;
        this.duration = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.size = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.size);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Media(int i, String str, String str2, long j, int i2, int i3, long j2) {
        this();
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str2, "mimeType");
        this.id = i;
        this.path = str;
        this.mimeType = str2;
        this.duration = j;
        this.width = i2;
        this.height = i3;
        this.size = j2;
    }
}
