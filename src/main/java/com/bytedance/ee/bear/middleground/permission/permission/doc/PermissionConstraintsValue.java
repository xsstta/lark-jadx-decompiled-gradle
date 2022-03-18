package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraintsValue;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/util/io/NonProguard;", "security", "", Comment.f24093e, "(II)V", "getComment", "()I", "getSecurity", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionConstraintsValue extends NetService.Result<Serializable> implements NonProguard {
    private final int comment;
    private final int security;

    public PermissionConstraintsValue() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ PermissionConstraintsValue copy$default(PermissionConstraintsValue permissionConstraintsValue, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = permissionConstraintsValue.security;
        }
        if ((i3 & 2) != 0) {
            i2 = permissionConstraintsValue.comment;
        }
        return permissionConstraintsValue.copy(i, i2);
    }

    public final int component1() {
        return this.security;
    }

    public final int component2() {
        return this.comment;
    }

    public final PermissionConstraintsValue copy(int i, int i2) {
        return new PermissionConstraintsValue(i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionConstraintsValue) {
                PermissionConstraintsValue permissionConstraintsValue = (PermissionConstraintsValue) obj;
                if (this.security == permissionConstraintsValue.security) {
                    if (this.comment == permissionConstraintsValue.comment) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.security * 31) + this.comment;
    }

    public final int getComment() {
        return this.comment;
    }

    public final int getSecurity() {
        return this.security;
    }

    public String toString() {
        return "constraintValue{security=" + this.security + " ,comment=" + this.comment + '}';
    }

    public PermissionConstraintsValue(int i, int i2) {
        this.security = i;
        this.comment = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionConstraintsValue(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
