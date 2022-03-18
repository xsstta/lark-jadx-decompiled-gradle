package com.bytedance.ee.bear.middleground.permission.permission.bitableshare;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableShareUserPermission;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/bitableshare/BitableShareUserPermission;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "", "permitted", "(Z)V", "getPermitted", "()Z", "canShare", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableShareUserPermission extends NetService.Result<Boolean> implements IBitableShareUserPermission {
    private final boolean permitted;

    public BitableShareUserPermission() {
        this(false, 1, null);
    }

    public static /* synthetic */ BitableShareUserPermission copy$default(BitableShareUserPermission bitableShareUserPermission, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bitableShareUserPermission.permitted;
        }
        return bitableShareUserPermission.copy(z);
    }

    public final boolean component1() {
        return this.permitted;
    }

    public final BitableShareUserPermission copy(boolean z) {
        return new BitableShareUserPermission(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BitableShareUserPermission) {
                if (this.permitted == ((BitableShareUserPermission) obj).permitted) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.permitted;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "BitableShareUserPermission(permitted=" + this.permitted + ")";
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableShareUserPermission
    public boolean canShare() {
        return this.permitted;
    }

    public final boolean getPermitted() {
        return this.permitted;
    }

    public BitableShareUserPermission(boolean z) {
        this.permitted = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitableShareUserPermission(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
