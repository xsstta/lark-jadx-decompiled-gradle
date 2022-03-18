package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/BatchDocUserPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "perms", "", "", "", "permissionV2", "(Ljava/util/Map;Ljava/util/Map;)V", "getPermissionV2", "()Ljava/util/Map;", "getPerms", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BatchDocUserPermission extends NetService.Result<Serializable> {
    private final Map<String, Integer> permissionV2;
    private final Map<String, Integer> perms;

    public BatchDocUserPermission() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.middleground.permission.permission.doc.BatchDocUserPermission */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchDocUserPermission copy$default(BatchDocUserPermission batchDocUserPermission, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = batchDocUserPermission.perms;
        }
        if ((i & 2) != 0) {
            map2 = batchDocUserPermission.permissionV2;
        }
        return batchDocUserPermission.copy(map, map2);
    }

    public final Map<String, Integer> component1() {
        return this.perms;
    }

    public final Map<String, Integer> component2() {
        return this.permissionV2;
    }

    public final BatchDocUserPermission copy(Map<String, Integer> map, Map<String, Integer> map2) {
        Intrinsics.checkParameterIsNotNull(map, "perms");
        Intrinsics.checkParameterIsNotNull(map2, "permissionV2");
        return new BatchDocUserPermission(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchDocUserPermission)) {
            return false;
        }
        BatchDocUserPermission batchDocUserPermission = (BatchDocUserPermission) obj;
        return Intrinsics.areEqual(this.perms, batchDocUserPermission.perms) && Intrinsics.areEqual(this.permissionV2, batchDocUserPermission.permissionV2);
    }

    public int hashCode() {
        Map<String, Integer> map = this.perms;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Integer> map2 = this.permissionV2;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BatchDocUserPermission(perms=" + this.perms + ", permissionV2=" + this.permissionV2 + ")";
    }

    public final Map<String, Integer> getPermissionV2() {
        return this.permissionV2;
    }

    public final Map<String, Integer> getPerms() {
        return this.perms;
    }

    public BatchDocUserPermission(Map<String, Integer> map, Map<String, Integer> map2) {
        Intrinsics.checkParameterIsNotNull(map, "perms");
        Intrinsics.checkParameterIsNotNull(map2, "permissionV2");
        this.perms = map;
        this.permissionV2 = map2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BatchDocUserPermission(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? new HashMap() : map2);
    }
}
