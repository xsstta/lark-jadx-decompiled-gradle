package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/ConfirmActionData;", "Lcom/larksuite/framework/section/IActionData;", "todoGuid", "", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "isTargetCompleted", "", "(Ljava/lang/String;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Z)V", "()Z", "setTargetCompleted", "(Z)V", "getTodoGuid", "()Ljava/lang/String;", "setTodoGuid", "(Ljava/lang/String;)V", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.c */
public final class ConfirmActionData implements IActionData {

    /* renamed from: a */
    private String f140554a;

    /* renamed from: b */
    private TodoSource f140555b;

    /* renamed from: c */
    private boolean f140556c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmActionData)) {
            return false;
        }
        ConfirmActionData cVar = (ConfirmActionData) obj;
        return Intrinsics.areEqual(this.f140554a, cVar.f140554a) && Intrinsics.areEqual(this.f140555b, cVar.f140555b) && this.f140556c == cVar.f140556c;
    }

    public int hashCode() {
        String str = this.f140554a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TodoSource todoSource = this.f140555b;
        if (todoSource != null) {
            i = todoSource.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f140556c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "ConfirmActionData(todoGuid=" + this.f140554a + ", todoSource=" + this.f140555b + ", isTargetCompleted=" + this.f140556c + ")";
    }

    /* renamed from: a */
    public final String mo193496a() {
        return this.f140554a;
    }

    /* renamed from: b */
    public final TodoSource mo193497b() {
        return this.f140555b;
    }

    public ConfirmActionData(String str, TodoSource todoSource, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
        this.f140554a = str;
        this.f140555b = todoSource;
        this.f140556c = z;
    }
}
