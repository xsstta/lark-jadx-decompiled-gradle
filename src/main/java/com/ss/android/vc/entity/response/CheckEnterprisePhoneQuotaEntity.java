package com.ss.android.vc.entity.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/entity/response/CheckEnterprisePhoneQuotaEntity;", "", "date", "", "availableEnterprisePhoneAmount", "", "departmentName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAvailableEnterprisePhoneAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDate", "()Ljava/lang/String;", "getDepartmentName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ss/android/vc/entity/response/CheckEnterprisePhoneQuotaEntity;", "equals", "", "other", "hashCode", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.response.d */
public final class CheckEnterprisePhoneQuotaEntity {

    /* renamed from: a */
    private final String f152682a;

    /* renamed from: b */
    private final Integer f152683b;

    /* renamed from: c */
    private final String f152684c;

    public CheckEnterprisePhoneQuotaEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckEnterprisePhoneQuotaEntity)) {
            return false;
        }
        CheckEnterprisePhoneQuotaEntity dVar = (CheckEnterprisePhoneQuotaEntity) obj;
        return Intrinsics.areEqual(this.f152682a, dVar.f152682a) && Intrinsics.areEqual(this.f152683b, dVar.f152683b) && Intrinsics.areEqual(this.f152684c, dVar.f152684c);
    }

    public int hashCode() {
        String str = this.f152682a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f152683b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f152684c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CheckEnterprisePhoneQuotaEntity(date=" + this.f152682a + ", availableEnterprisePhoneAmount=" + this.f152683b + ", departmentName=" + this.f152684c + ")";
    }

    /* renamed from: a */
    public final String mo210123a() {
        return this.f152682a;
    }

    /* renamed from: b */
    public final Integer mo210124b() {
        return this.f152683b;
    }

    /* renamed from: c */
    public final String mo210125c() {
        return this.f152684c;
    }

    public CheckEnterprisePhoneQuotaEntity(String str, Integer num, String str2) {
        this.f152682a = str;
        this.f152683b = num;
        this.f152684c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckEnterprisePhoneQuotaEntity(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2);
    }
}
