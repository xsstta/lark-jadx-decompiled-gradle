package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TitleActionData;", "Lcom/larksuite/framework/section/IActionData;", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "isTargetExpand", "", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;Z)V", "()Z", "setTargetExpand", "(Z)V", "getTitleType", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "setTitleType", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.f */
public final class TitleActionData implements IActionData {

    /* renamed from: a */
    private TodoItemViewData.TitleType f140562a;

    /* renamed from: b */
    private boolean f140563b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleActionData)) {
            return false;
        }
        TitleActionData fVar = (TitleActionData) obj;
        return Intrinsics.areEqual(this.f140562a, fVar.f140562a) && this.f140563b == fVar.f140563b;
    }

    public int hashCode() {
        TodoItemViewData.TitleType titleType = this.f140562a;
        int hashCode = (titleType != null ? titleType.hashCode() : 0) * 31;
        boolean z = this.f140563b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "TitleActionData(titleType=" + this.f140562a + ", isTargetExpand=" + this.f140563b + ")";
    }

    /* renamed from: a */
    public final TodoItemViewData.TitleType mo193512a() {
        return this.f140562a;
    }

    /* renamed from: b */
    public final boolean mo193513b() {
        return this.f140563b;
    }

    public TitleActionData(TodoItemViewData.TitleType titleType, boolean z) {
        Intrinsics.checkParameterIsNotNull(titleType, "titleType");
        this.f140562a = titleType;
        this.f140563b = z;
    }
}
