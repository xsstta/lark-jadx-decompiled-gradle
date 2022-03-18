package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/util/io/NonProguard;", "security", "", Comment.f24093e, "linkShareEntity", "(III)V", "getComment", "()I", "getLinkShareEntity", "getSecurity", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "isCommentSettingDisableByParent", "isCommentSettingDisableBySelf", "isCommentSettingDisableByTenant", "isCommentSettingDisabledByContainer", "isCommentSettingEnabled", "isSecuritySettingDisableByParent", "isSecuritySettingDisableBySelf", "isSecuritySettingDisableByTenant", "isSecuritySettingDisabledByContainer", "isSecuritySettingEnabled", "toString", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PermissionConstraints extends NetService.Result<Serializable> implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final int comment;
    private final int linkShareEntity;
    private final int security;

    public PermissionConstraints() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ PermissionConstraints copy$default(PermissionConstraints permissionConstraints, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = permissionConstraints.security;
        }
        if ((i4 & 2) != 0) {
            i2 = permissionConstraints.comment;
        }
        if ((i4 & 4) != 0) {
            i3 = permissionConstraints.linkShareEntity;
        }
        return permissionConstraints.copy(i, i2, i3);
    }

    public final int component1() {
        return this.security;
    }

    public final int component2() {
        return this.comment;
    }

    public final int component3() {
        return this.linkShareEntity;
    }

    public final PermissionConstraints copy(int i, int i2, int i3) {
        return new PermissionConstraints(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionConstraints) {
                PermissionConstraints permissionConstraints = (PermissionConstraints) obj;
                if (this.security == permissionConstraints.security) {
                    if (this.comment == permissionConstraints.comment) {
                        if (this.linkShareEntity == permissionConstraints.linkShareEntity) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.security * 31) + this.comment) * 31) + this.linkShareEntity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/PermissionConstraints$Companion;", "", "()V", "CONSTRAINTS_BY_CONTAINER", "", "CONSTRAINTS_BY_PARENT", "CONSTRAINTS_BY_SELF", "CONSTRAINTS_BY_TENANT", "NO_CONSTRAINTS", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getComment() {
        return this.comment;
    }

    public final int getLinkShareEntity() {
        return this.linkShareEntity;
    }

    public final int getSecurity() {
        return this.security;
    }

    public final boolean isCommentSettingDisabledByContainer() {
        if (this.comment == 1) {
            return true;
        }
        return false;
    }

    public final boolean isCommentSettingEnabled() {
        if (this.comment == 0) {
            return true;
        }
        return false;
    }

    public final boolean isSecuritySettingDisabledByContainer() {
        if (this.security == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSecuritySettingEnabled() {
        if (this.security == 0) {
            return true;
        }
        return false;
    }

    public final boolean isCommentSettingDisableByParent() {
        if (this.comment == 2) {
            return true;
        }
        return false;
    }

    public final boolean isCommentSettingDisableBySelf() {
        if (this.comment == 3) {
            return true;
        }
        return false;
    }

    public final boolean isCommentSettingDisableByTenant() {
        if (this.comment == 4) {
            return true;
        }
        return false;
    }

    public final boolean isSecuritySettingDisableByParent() {
        if (this.security == 2) {
            return true;
        }
        return false;
    }

    public final boolean isSecuritySettingDisableBySelf() {
        if (this.security == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSecuritySettingDisableByTenant() {
        if (this.security == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "constraint{security=" + this.security + ", comment=" + this.comment + '}';
    }

    public PermissionConstraints(int i, int i2, int i3) {
        this.security = i;
        this.comment = i2;
        this.linkShareEntity = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionConstraints(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
