package com.bytedance.ee.bear.bitable.pro;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\u0013\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/TableRole;", "Lcom/bytedance/ee/util/io/NonProguard;", "tableId", "", "tableName", "perm", "", "recRule", "Lcom/bytedance/ee/bear/bitable/pro/RecRule;", "(Ljava/lang/String;Ljava/lang/String;ILcom/bytedance/ee/bear/bitable/pro/RecRule;)V", "getPerm", "()I", "getRecRule", "()Lcom/bytedance/ee/bear/bitable/pro/RecRule;", "getTableId", "()Ljava/lang/String;", "getTableName", "canEdit", "", "canEditAllRow", "canEditAllRowAndColumn", "canEditPartAndInvisibleOtherRow", "canEditPartAndReadOtherRow", "canRead", "canReadAllRow", "canReadPartRow", "equals", "other", "", "hashCode", "noPermission", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TableRole implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private final int perm;
    private final RecRule recRule;
    private final String tableId;
    private final String tableName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/TableRole$Companion;", "", "()V", "PERM_EDIT", "", "PERM_FORBIDDEN", "PERM_MANAGER", "PERM_READ", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.TableRole$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getPerm() {
        return this.perm;
    }

    public final RecRule getRecRule() {
        return this.recRule;
    }

    public final String getTableId() {
        return this.tableId;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final boolean canRead() {
        if (this.perm == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.tableId.hashCode();
    }

    public final boolean noPermission() {
        if (this.perm == 0) {
            return true;
        }
        return false;
    }

    public final boolean canEdit() {
        int i = this.perm;
        if (i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean canEditAllRow() {
        if (this.perm == 2 && this.recRule == null) {
            return true;
        }
        return false;
    }

    public final boolean canEditAllRowAndColumn() {
        if (this.perm == 4) {
            return true;
        }
        return false;
    }

    public final boolean canReadAllRow() {
        if (this.perm == 1 && this.recRule == null) {
            return true;
        }
        return false;
    }

    public final boolean canReadPartRow() {
        if (this.perm != 1 || this.recRule == null) {
            return false;
        }
        return true;
    }

    public final boolean canEditPartAndInvisibleOtherRow() {
        RecRule recRule2 = this.recRule;
        if (recRule2 != null && recRule2.getPerm() == 2 && this.recRule.getOtherPerm() == 0) {
            return true;
        }
        return false;
    }

    public final boolean canEditPartAndReadOtherRow() {
        RecRule recRule2 = this.recRule;
        if (recRule2 != null && recRule2.getPerm() == 2 && this.recRule.getOtherPerm() == 1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.bitable.pro.TableRole");
        } else if (!Intrinsics.areEqual(this.tableId, ((TableRole) obj).tableId)) {
            return false;
        } else {
            return true;
        }
    }

    public TableRole(String str, String str2, int i, RecRule recRule2) {
        Intrinsics.checkParameterIsNotNull(str, "tableId");
        Intrinsics.checkParameterIsNotNull(str2, "tableName");
        this.tableId = str;
        this.tableName = str2;
        this.perm = i;
        this.recRule = recRule2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TableRole(String str, String str2, int i, RecRule recRule2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, recRule2);
    }
}
