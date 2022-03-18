package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "", "isCreateTodo", "", "isShouldFastCreate", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.g */
public final class DescriptionInit {

    /* renamed from: a */
    private final boolean f140171a;

    /* renamed from: b */
    private final boolean f140172b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionInit)) {
            return false;
        }
        DescriptionInit gVar = (DescriptionInit) obj;
        return this.f140171a == gVar.f140171a && this.f140172b == gVar.f140172b;
    }

    public int hashCode() {
        boolean z = this.f140171a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f140172b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "DescriptionInit(isCreateTodo=" + this.f140171a + ", isShouldFastCreate=" + this.f140172b + ")";
    }

    /* renamed from: a */
    public final boolean mo193000a() {
        return this.f140171a;
    }

    public DescriptionInit(boolean z, boolean z2) {
        this.f140171a = z;
        this.f140172b = z2;
    }
}
