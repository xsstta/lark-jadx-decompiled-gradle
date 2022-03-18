package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/ClickFilterActionData;", "Lcom/larksuite/framework/section/IActionData;", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "isResetExpandState", "", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;Z)V", "getFilterType", "()Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "setFilterType", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;)V", "()Z", "setResetExpandState", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.b */
public final class ClickFilterActionData implements IActionData {

    /* renamed from: a */
    private TodoListView.Type f140552a;

    /* renamed from: b */
    private boolean f140553b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickFilterActionData)) {
            return false;
        }
        ClickFilterActionData bVar = (ClickFilterActionData) obj;
        return Intrinsics.areEqual(this.f140552a, bVar.f140552a) && this.f140553b == bVar.f140553b;
    }

    public int hashCode() {
        TodoListView.Type type = this.f140552a;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        boolean z = this.f140553b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "ClickFilterActionData(filterType=" + this.f140552a + ", isResetExpandState=" + this.f140553b + ")";
    }

    /* renamed from: a */
    public final TodoListView.Type mo193491a() {
        return this.f140552a;
    }

    /* renamed from: b */
    public final boolean mo193492b() {
        return this.f140553b;
    }

    public ClickFilterActionData(TodoListView.Type type, boolean z) {
        Intrinsics.checkParameterIsNotNull(type, "filterType");
        this.f140552a = type;
        this.f140553b = z;
    }
}
