package com.bytedance.bpea.basics;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006!"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyPolicy;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "content", "dataType", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDataType", "getId", "getVersion", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyPolicy implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f11337a;

    /* renamed from: b */
    private final String f11338b;

    /* renamed from: c */
    private final String f11339c;

    /* renamed from: d */
    private final String f11340d;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPolicy)) {
            return false;
        }
        PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
        return Intrinsics.areEqual(this.f11337a, privacyPolicy.f11337a) && Intrinsics.areEqual(this.f11338b, privacyPolicy.f11338b) && Intrinsics.areEqual(this.f11339c, privacyPolicy.f11339c) && Intrinsics.areEqual(this.f11340d, privacyPolicy.f11340d);
    }

    public int hashCode() {
        String str = this.f11337a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11338b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11339c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11340d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "PrivacyPolicy(id=" + this.f11337a + ", content=" + this.f11338b + ", dataType=" + this.f11339c + ", version=" + this.f11340d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyPolicy$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/bpea/basics/PrivacyPolicy;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/bpea/basics/PrivacyPolicy;", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.basics.PrivacyPolicy$a */
    public static final class CREATOR implements Parcelable.Creator<PrivacyPolicy> {
        private CREATOR() {
        }

        /* renamed from: a */
        public PrivacyPolicy[] newArray(int i) {
            return new PrivacyPolicy[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public PrivacyPolicy createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PrivacyPolicy(parcel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PrivacyPolicy(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11337a);
        parcel.writeString(this.f11338b);
        parcel.writeString(this.f11339c);
        parcel.writeString(this.f11340d);
    }

    public PrivacyPolicy(String str, String str2, String str3, String str4) {
        this.f11337a = str;
        this.f11338b = str2;
        this.f11339c = str3;
        this.f11340d = str4;
    }
}
