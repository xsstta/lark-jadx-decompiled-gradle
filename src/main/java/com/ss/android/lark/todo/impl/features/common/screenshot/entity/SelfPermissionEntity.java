package com.ss.android.lark.todo.impl.features.common.screenshot.entity;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/SelfPermissionEntity;", "", "is_editable", "", "is_assignable", "is_readable", "(ZZZ)V", "()Z", "set_editable", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.a.f */
public final class SelfPermissionEntity {

    /* renamed from: a */
    private boolean f139381a;

    /* renamed from: b */
    private final boolean f139382b;

    /* renamed from: c */
    private final boolean f139383c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfPermissionEntity)) {
            return false;
        }
        SelfPermissionEntity fVar = (SelfPermissionEntity) obj;
        return this.f139381a == fVar.f139381a && this.f139382b == fVar.f139382b && this.f139383c == fVar.f139383c;
    }

    public int hashCode() {
        boolean z = this.f139381a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f139382b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f139383c;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i9 + i;
    }

    public String toString() {
        return "SelfPermissionEntity(is_editable=" + this.f139381a + ", is_assignable=" + this.f139382b + ", is_readable=" + this.f139383c + ")";
    }

    public SelfPermissionEntity(boolean z, boolean z2, boolean z3) {
        this.f139381a = z;
        this.f139382b = z2;
        this.f139383c = z3;
    }
}
