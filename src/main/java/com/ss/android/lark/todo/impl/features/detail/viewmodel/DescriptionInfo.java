package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.bytedance.lark.pb.todo.v1.TodoSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "", "isComplete", "", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "editable", "(ZLcom/bytedance/lark/pb/todo/v1/TodoSource;Z)V", "getEditable", "()Z", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.f */
public final class DescriptionInfo {

    /* renamed from: a */
    private final boolean f140168a;

    /* renamed from: b */
    private final TodoSource f140169b;

    /* renamed from: c */
    private final boolean f140170c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionInfo)) {
            return false;
        }
        DescriptionInfo fVar = (DescriptionInfo) obj;
        return this.f140168a == fVar.f140168a && Intrinsics.areEqual(this.f140169b, fVar.f140169b) && this.f140170c == fVar.f140170c;
    }

    public int hashCode() {
        boolean z = this.f140168a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        TodoSource todoSource = this.f140169b;
        int hashCode = (i5 + (todoSource != null ? todoSource.hashCode() : 0)) * 31;
        boolean z2 = this.f140170c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "DescriptionInfo(isComplete=" + this.f140168a + ", todoSource=" + this.f140169b + ", editable=" + this.f140170c + ")";
    }

    /* renamed from: a */
    public final boolean mo192996a() {
        return this.f140170c;
    }

    public DescriptionInfo(boolean z, TodoSource todoSource, boolean z2) {
        this.f140168a = z;
        this.f140169b = todoSource;
        this.f140170c = z2;
    }
}
