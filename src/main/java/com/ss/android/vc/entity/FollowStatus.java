package com.ss.android.vc.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/entity/FollowStatus;", "", "docToken", "", "docType", "Lcom/ss/android/vc/entity/VcDocType;", "(Ljava/lang/String;Lcom/ss/android/vc/entity/VcDocType;)V", "getDocToken", "()Ljava/lang/String;", "setDocToken", "(Ljava/lang/String;)V", "getDocType", "()Lcom/ss/android/vc/entity/VcDocType;", "setDocType", "(Lcom/ss/android/vc/entity/VcDocType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.c */
public final class FollowStatus {

    /* renamed from: a */
    private String f152487a;

    /* renamed from: b */
    private VcDocType f152488b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowStatus)) {
            return false;
        }
        FollowStatus cVar = (FollowStatus) obj;
        return Intrinsics.areEqual(this.f152487a, cVar.f152487a) && Intrinsics.areEqual(this.f152488b, cVar.f152488b);
    }

    public int hashCode() {
        String str = this.f152487a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VcDocType vcDocType = this.f152488b;
        if (vcDocType != null) {
            i = vcDocType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FollowStatus(docToken=" + this.f152487a + ", docType=" + this.f152488b + ")";
    }

    public FollowStatus(String str, VcDocType vcDocType) {
        this.f152487a = str;
        this.f152488b = vcDocType;
    }
}
