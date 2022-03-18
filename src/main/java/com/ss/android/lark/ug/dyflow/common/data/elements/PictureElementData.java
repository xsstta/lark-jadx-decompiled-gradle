package com.ss.android.lark.ug.dyflow.common.data.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "imageData", "", "imageType", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType;", "(Ljava/lang/String;Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType;)V", "getImageData", "()Ljava/lang/String;", "getImageType", "()Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType;", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "ImageType", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PictureElementData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f141462a;

    /* renamed from: b */
    private final ImageType f141463b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "RAW_URL", "ENCRYPTED_KEY", "RAW_DATA", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ImageType {
        UNKNOWN(0),
        RAW_URL(1),
        ENCRYPTED_KEY(2),
        RAW_DATA(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$ImageType;", "value", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData$ImageType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ImageType mo194897a(int i) {
                if (i == 0) {
                    return ImageType.UNKNOWN;
                }
                if (i == 1) {
                    return ImageType.RAW_URL;
                }
                if (i == 2) {
                    return ImageType.ENCRYPTED_KEY;
                }
                if (i != 3) {
                    return ImageType.UNKNOWN;
                }
                return ImageType.RAW_DATA;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ImageType(int i) {
            this.value = i;
        }
    }

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/elements/PictureElementData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.elements.PictureElementData$a */
    public static final class CREATOR implements Parcelable.Creator<PictureElementData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public PictureElementData[] newArray(int i) {
            return new PictureElementData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public PictureElementData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PictureElementData(parcel);
        }
    }

    /* renamed from: a */
    public final String mo194893a() {
        return this.f141462a;
    }

    public PictureElementData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f141462a = parcel.readString();
        this.f141463b = ImageType.Companion.mo194897a(parcel.readInt());
    }

    public PictureElementData(String str, ImageType imageType) {
        Intrinsics.checkParameterIsNotNull(imageType, "imageType");
        this.f141462a = str;
        this.f141463b = imageType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f141462a);
            parcel.writeInt(this.f141463b.getValue());
        }
    }
}
