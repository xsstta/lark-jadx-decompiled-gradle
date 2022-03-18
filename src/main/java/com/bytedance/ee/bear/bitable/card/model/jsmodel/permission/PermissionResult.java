package com.bytedance.ee.bear.bitable.card.model.jsmodel.permission;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionResult;", "Lcom/bytedance/ee/util/io/NonProguard;", "result", "", "([Z)V", "getResult", "()[Z", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionResult implements NonProguard {
    private boolean[] result;

    public PermissionResult() {
        this(null, 1, null);
    }

    public static /* synthetic */ PermissionResult copy$default(PermissionResult permissionResult, boolean[] zArr, int i, Object obj) {
        if ((i & 1) != 0) {
            zArr = permissionResult.result;
        }
        return permissionResult.copy(zArr);
    }

    public final boolean[] component1() {
        return this.result;
    }

    public final PermissionResult copy(boolean[] zArr) {
        return new PermissionResult(zArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PermissionResult) && Intrinsics.areEqual(this.result, ((PermissionResult) obj).result);
        }
        return true;
    }

    public int hashCode() {
        boolean[] zArr = this.result;
        if (zArr != null) {
            return Arrays.hashCode(zArr);
        }
        return 0;
    }

    public String toString() {
        return "PermissionResult(result=" + Arrays.toString(this.result) + ")";
    }

    public final boolean[] getResult() {
        return this.result;
    }

    public final void setResult(boolean[] zArr) {
        this.result = zArr;
    }

    public PermissionResult(boolean[] zArr) {
        this.result = zArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionResult(boolean[] zArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : zArr);
    }
}
