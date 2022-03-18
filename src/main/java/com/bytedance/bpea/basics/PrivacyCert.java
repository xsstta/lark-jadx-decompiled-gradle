package com.bytedance.bpea.basics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyCert;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "privacyPoint", "Lcom/bytedance/bpea/basics/PrivacyPoint;", "usage", "", "privacyPolicies", "", "Lcom/bytedance/bpea/basics/PrivacyPolicy;", "(Lcom/bytedance/bpea/basics/PrivacyPoint;Ljava/lang/String;[Lcom/bytedance/bpea/basics/PrivacyPolicy;)V", "getPrivacyPoint", "()Lcom/bytedance/bpea/basics/PrivacyPoint;", "getPrivacyPolicies", "()[Lcom/bytedance/bpea/basics/PrivacyPolicy;", "[Lcom/bytedance/bpea/basics/PrivacyPolicy;", "getUsage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/bytedance/bpea/basics/PrivacyPoint;Ljava/lang/String;[Lcom/bytedance/bpea/basics/PrivacyPolicy;)Lcom/bytedance/bpea/basics/PrivacyCert;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "Builder", "CREATOR", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyCert implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final PrivacyPoint f11332a;

    /* renamed from: b */
    private final String f11333b;

    /* renamed from: c */
    private final PrivacyPolicy[] f11334c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\u0015J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R0\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b@BX\u000e¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyCert$Builder;", "", "()V", "<set-?>", "", "privacyCertId", "getPrivacyCertId", "()Ljava/lang/String;", "", "Lcom/bytedance/bpea/basics/PrivacyPolicy;", "privacyPolicies", "getPrivacyPolicies", "()[Lcom/bytedance/bpea/basics/PrivacyPolicy;", "[Lcom/bytedance/bpea/basics/PrivacyPolicy;", "tag", "getTag", "usage", "getUsage", "build", "Lcom/bytedance/bpea/basics/PrivacyCert;", "policies", "([Lcom/bytedance/bpea/basics/PrivacyPolicy;)Lcom/bytedance/bpea/basics/PrivacyCert$Builder;", "Companion", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public String privacyCertId;
        private PrivacyPolicy[] privacyPolicies;
        private String tag;
        private String usage;

        @JvmStatic
        public static final Builder with(String str) {
            return Companion.with(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyCert$Builder$Companion;", "", "()V", "with", "Lcom/bytedance/bpea/basics/PrivacyCert$Builder;", "id", "", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Builder with(String str) {
                Intrinsics.checkParameterIsNotNull(str, "id");
                Builder builder = new Builder();
                builder.privacyCertId = str;
                return builder;
            }
        }

        public final String getPrivacyCertId() {
            return this.privacyCertId;
        }

        public final PrivacyPolicy[] getPrivacyPolicies() {
            return this.privacyPolicies;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getUsage() {
            return this.usage;
        }

        public final PrivacyCert build() {
            PrivacyPoint privacyPoint = new PrivacyPoint(this.privacyCertId);
            privacyPoint.mo14469a(this.tag);
            return new PrivacyCert(privacyPoint, this.usage, this.privacyPolicies);
        }

        public final Builder tag(String str) {
            Builder builder = this;
            builder.tag = str;
            return builder;
        }

        public final Builder usage(String str) {
            Intrinsics.checkParameterIsNotNull(str, "usage");
            Builder builder = this;
            builder.usage = str;
            return builder;
        }

        public final Builder policies(PrivacyPolicy... privacyPolicyArr) {
            Intrinsics.checkParameterIsNotNull(privacyPolicyArr, "privacyPolicies");
            Builder builder = this;
            int length = privacyPolicyArr.length;
            PrivacyPolicy[] privacyPolicyArr2 = new PrivacyPolicy[length];
            for (int i = 0; i < length; i++) {
                privacyPolicyArr2[i] = privacyPolicyArr[i];
            }
            builder.privacyPolicies = privacyPolicyArr2;
            return builder;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyCert)) {
            return false;
        }
        PrivacyCert privacyCert = (PrivacyCert) obj;
        return Intrinsics.areEqual(this.f11332a, privacyCert.f11332a) && Intrinsics.areEqual(this.f11333b, privacyCert.f11333b) && Intrinsics.areEqual(this.f11334c, privacyCert.f11334c);
    }

    public int hashCode() {
        PrivacyPoint privacyPoint = this.f11332a;
        int i = 0;
        int hashCode = (privacyPoint != null ? privacyPoint.hashCode() : 0) * 31;
        String str = this.f11333b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        PrivacyPolicy[] privacyPolicyArr = this.f11334c;
        if (privacyPolicyArr != null) {
            i = Arrays.hashCode(privacyPolicyArr);
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PrivacyCert(privacyPoint=" + this.f11332a + ", usage=" + this.f11333b + ", privacyPolicies=" + Arrays.toString(this.f11334c) + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/bpea/basics/PrivacyCert$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/bpea/basics/PrivacyCert;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/bpea/basics/PrivacyCert;", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.basics.PrivacyCert$a */
    public static final class CREATOR implements Parcelable.Creator<PrivacyCert> {
        private CREATOR() {
        }

        /* renamed from: a */
        public PrivacyCert[] newArray(int i) {
            return new PrivacyCert[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public PrivacyCert createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new PrivacyCert(parcel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PrivacyCert(Parcel parcel) {
        this((PrivacyPoint) parcel.readParcelable(PrivacyPoint.class.getClassLoader()), parcel.readString(), (PrivacyPolicy[]) parcel.createTypedArray(PrivacyPolicy.CREATOR));
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeParcelable(this.f11332a, i);
        parcel.writeString(this.f11333b);
        parcel.writeTypedArray(this.f11334c, i);
    }

    public PrivacyCert(PrivacyPoint privacyPoint, String str, PrivacyPolicy[] privacyPolicyArr) {
        this.f11332a = privacyPoint;
        this.f11333b = str;
        this.f11334c = privacyPolicyArr;
    }
}
