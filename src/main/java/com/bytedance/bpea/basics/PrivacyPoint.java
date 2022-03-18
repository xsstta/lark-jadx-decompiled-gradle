package com.bytedance.bpea.basics;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyPoint;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "tag", "getTag", "setTag", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyPoint implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private String f11335a;

    /* renamed from: b */
    private final String f11336b;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PrivacyPoint) && Intrinsics.areEqual(this.f11336b, ((PrivacyPoint) obj).f11336b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11336b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PrivacyPoint(id=" + this.f11336b + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyPoint$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/bpea/basics/PrivacyPoint;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/bpea/basics/PrivacyPoint;", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.basics.PrivacyPoint$a */
    public static final class CREATOR implements Parcelable.Creator<PrivacyPoint> {
        private CREATOR() {
        }

        /* renamed from: a */
        public PrivacyPoint[] newArray(int i) {
            return new PrivacyPoint[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public PrivacyPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PrivacyPoint(parcel);
        }
    }

    /* renamed from: a */
    public final void mo14469a(String str) {
        this.f11335a = str;
    }

    public PrivacyPoint(String str) {
        this.f11336b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PrivacyPoint(Parcel parcel) {
        this(parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11336b);
    }
}
