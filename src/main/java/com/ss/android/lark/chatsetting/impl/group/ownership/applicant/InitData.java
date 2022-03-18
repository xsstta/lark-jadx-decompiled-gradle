package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "", "isOpenVerification", "", "applicantList", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "(ZLjava/util/List;)V", "getApplicantList", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.k */
public final class InitData {

    /* renamed from: a */
    private final boolean f89620a;

    /* renamed from: b */
    private final List<ApplicantViewData> f89621b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitData)) {
            return false;
        }
        InitData kVar = (InitData) obj;
        return this.f89620a == kVar.f89620a && Intrinsics.areEqual(this.f89621b, kVar.f89621b);
    }

    public int hashCode() {
        boolean z = this.f89620a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<ApplicantViewData> list = this.f89621b;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "InitData(isOpenVerification=" + this.f89620a + ", applicantList=" + this.f89621b + ")";
    }

    /* renamed from: a */
    public final boolean mo128148a() {
        return this.f89620a;
    }

    /* renamed from: b */
    public final List<ApplicantViewData> mo128149b() {
        return this.f89621b;
    }

    public InitData(boolean z, List<ApplicantViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "applicantList");
        this.f89620a = z;
        this.f89621b = list;
    }
}
