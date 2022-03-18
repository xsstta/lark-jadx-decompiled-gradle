package com.bytedance.ee.bear.bitable.pro;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/RoleResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "defaultEditRole", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "defaultReadRole", "otherRole", "", "(Lcom/bytedance/ee/bear/bitable/pro/Role;Lcom/bytedance/ee/bear/bitable/pro/Role;Ljava/util/List;)V", "getDefaultEditRole", "()Lcom/bytedance/ee/bear/bitable/pro/Role;", "getDefaultReadRole", "getOtherRole", "()Ljava/util/List;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RoleResult extends NetService.Result<Serializable> {
    private final Role defaultEditRole;
    private final Role defaultReadRole;
    private final List<Role> otherRole;

    public RoleResult() {
        this(null, null, null, 7, null);
    }

    public final Role getDefaultEditRole() {
        return this.defaultEditRole;
    }

    public final Role getDefaultReadRole() {
        return this.defaultReadRole;
    }

    public final List<Role> getOtherRole() {
        return this.otherRole;
    }

    public RoleResult(Role role, Role role2, List<Role> list) {
        Intrinsics.checkParameterIsNotNull(list, "otherRole");
        this.defaultEditRole = role;
        this.defaultReadRole = role2;
        this.otherRole = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoleResult(Role role, Role role2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : role, (i & 2) != 0 ? null : role2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
