package com.ss.android.lark.biz.core.api.magic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/biz/core/api/magic/ErrorInfo;", "", "errorCode", "", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMsg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.c.a */
public final class ErrorInfo {

    /* renamed from: a */
    private final String f73978a;

    /* renamed from: b */
    private final String f73979b;

    public ErrorInfo() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo aVar = (ErrorInfo) obj;
        return Intrinsics.areEqual(this.f73978a, aVar.f73978a) && Intrinsics.areEqual(this.f73979b, aVar.f73979b);
    }

    public int hashCode() {
        String str = this.f73978a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73979b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ErrorInfo(errorCode=" + this.f73978a + ", errorMsg=" + this.f73979b + ")";
    }

    /* renamed from: a */
    public final String mo105682a() {
        return this.f73978a;
    }

    /* renamed from: b */
    public final String mo105683b() {
        return this.f73979b;
    }

    public ErrorInfo(String str, String str2) {
        this.f73978a = str;
        this.f73979b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "-10100" : str, (i & 2) != 0 ? "" : str2);
    }
}
