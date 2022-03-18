package com.ss.android.lark.ug.dyflow.common.data.elements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "Landroid/os/Parcelable;", "videoUrl", "", "isVertical", "", "(Ljava/lang/String;Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()Z", "getVideoUrl", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoElementData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f141466a;

    /* renamed from: b */
    private final boolean f141467b;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/elements/VideoElementData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.elements.VideoElementData$a */
    public static final class CREATOR implements Parcelable.Creator<VideoElementData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public VideoElementData[] newArray(int i) {
            return new VideoElementData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public VideoElementData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new VideoElementData(parcel);
        }
    }

    /* renamed from: a */
    public final String mo194911a() {
        return this.f141466a;
    }

    /* renamed from: b */
    public final boolean mo194912b() {
        return this.f141467b;
    }

    public VideoElementData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        String readString = parcel.readString();
        this.f141466a = readString == null ? "" : readString;
        this.f141467b = parcel.readByte() != ((byte) 0);
    }

    public VideoElementData(String str, boolean z) {
        this.f141466a = str;
        this.f141467b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (parcel != null) {
            parcel.writeString(this.f141466a);
            if (this.f141467b) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
        }
    }
}
