package com.ss.android.lark.ug.dyflow.common.data.elements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "Landroid/os/Parcelable;", "text", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getText", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "flags", "CREATOR", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ButtonElementData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f141460a;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/ug/dyflow/common/data/elements/ButtonElementData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.elements.ButtonElementData$a */
    public static final class CREATOR implements Parcelable.Creator<ButtonElementData> {
        private CREATOR() {
        }

        /* renamed from: a */
        public ButtonElementData[] newArray(int i) {
            return new ButtonElementData[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public ButtonElementData createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new ButtonElementData(parcel);
        }
    }

    /* renamed from: a */
    public final String mo194879a() {
        return this.f141460a;
    }

    public ButtonElementData(String str) {
        this.f141460a = str;
    }

    public ButtonElementData(Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f141460a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f141460a);
        }
    }
}
