package com.ss.android.vc.entity.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/entity/response/GetPhoneNumberAttributtonEntity;", "", "province", "", "isp", "(Ljava/lang/String;Ljava/lang/String;)V", "getIsp", "()Ljava/lang/String;", "getProvince", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.response.r */
public final class GetPhoneNumberAttributtonEntity {

    /* renamed from: a */
    private final String f152716a;

    /* renamed from: b */
    private final String f152717b;

    public GetPhoneNumberAttributtonEntity() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPhoneNumberAttributtonEntity)) {
            return false;
        }
        GetPhoneNumberAttributtonEntity rVar = (GetPhoneNumberAttributtonEntity) obj;
        return Intrinsics.areEqual(this.f152716a, rVar.f152716a) && Intrinsics.areEqual(this.f152717b, rVar.f152717b);
    }

    public int hashCode() {
        String str = this.f152716a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152717b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetPhoneNumberAttributtonEntity(province=" + this.f152716a + ", isp=" + this.f152717b + ")";
    }

    /* renamed from: a */
    public final String mo210129a() {
        return this.f152716a;
    }

    /* renamed from: b */
    public final String mo210130b() {
        return this.f152717b;
    }

    public GetPhoneNumberAttributtonEntity(String str, String str2) {
        this.f152716a = str;
        this.f152717b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetPhoneNumberAttributtonEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
