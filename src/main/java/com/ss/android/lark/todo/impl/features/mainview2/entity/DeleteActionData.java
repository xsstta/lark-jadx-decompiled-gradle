package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/DeleteActionData;", "Lcom/larksuite/framework/section/IActionData;", "todoGuid", "", "behindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "(Ljava/lang/String;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "getBehindDeleteStatus", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "setBehindDeleteStatus", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;)V", "getTodoGuid", "()Ljava/lang/String;", "setTodoGuid", "(Ljava/lang/String;)V", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.d */
public final class DeleteActionData implements IActionData {

    /* renamed from: a */
    private String f140557a;

    /* renamed from: b */
    private TodoItemViewData.BehindDeleteStatus f140558b;

    /* renamed from: c */
    private TodoSource f140559c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteActionData)) {
            return false;
        }
        DeleteActionData dVar = (DeleteActionData) obj;
        return Intrinsics.areEqual(this.f140557a, dVar.f140557a) && Intrinsics.areEqual(this.f140558b, dVar.f140558b) && Intrinsics.areEqual(this.f140559c, dVar.f140559c);
    }

    public int hashCode() {
        String str = this.f140557a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TodoItemViewData.BehindDeleteStatus behindDeleteStatus = this.f140558b;
        int hashCode2 = (hashCode + (behindDeleteStatus != null ? behindDeleteStatus.hashCode() : 0)) * 31;
        TodoSource todoSource = this.f140559c;
        if (todoSource != null) {
            i = todoSource.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DeleteActionData(todoGuid=" + this.f140557a + ", behindDeleteStatus=" + this.f140558b + ", todoSource=" + this.f140559c + ")";
    }

    /* renamed from: a */
    public final String mo193501a() {
        return this.f140557a;
    }

    /* renamed from: b */
    public final TodoItemViewData.BehindDeleteStatus mo193502b() {
        return this.f140558b;
    }

    /* renamed from: c */
    public final TodoSource mo193503c() {
        return this.f140559c;
    }

    public DeleteActionData(String str, TodoItemViewData.BehindDeleteStatus behindDeleteStatus, TodoSource todoSource) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(behindDeleteStatus, "behindDeleteStatus");
        Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
        this.f140557a = str;
        this.f140558b = behindDeleteStatus;
        this.f140559c = todoSource;
    }
}
