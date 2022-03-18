package com.ss.android.lark.todo.impl.rustadapter.push.entity;

import com.bytedance.lark.pb.todo.v1.ChangedTodoCollection;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/rustadapter/push/entity/TodoChangeNotificationUnit;", "Ljava/io/Serializable;", "changedTodoCollection", "Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;", "isRefreshAll", "", "(Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;Z)V", "getChangedTodoCollection", "()Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;", "setChangedTodoCollection", "(Lcom/bytedance/lark/pb/todo/v1/ChangedTodoCollection;)V", "()Z", "setRefreshAll", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoChangeNotificationUnit implements Serializable {
    private ChangedTodoCollection changedTodoCollection;
    private boolean isRefreshAll;

    public static /* synthetic */ TodoChangeNotificationUnit copy$default(TodoChangeNotificationUnit todoChangeNotificationUnit, ChangedTodoCollection changedTodoCollection2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            changedTodoCollection2 = todoChangeNotificationUnit.changedTodoCollection;
        }
        if ((i & 2) != 0) {
            z = todoChangeNotificationUnit.isRefreshAll;
        }
        return todoChangeNotificationUnit.copy(changedTodoCollection2, z);
    }

    public final ChangedTodoCollection component1() {
        return this.changedTodoCollection;
    }

    public final boolean component2() {
        return this.isRefreshAll;
    }

    public final TodoChangeNotificationUnit copy(ChangedTodoCollection changedTodoCollection2, boolean z) {
        return new TodoChangeNotificationUnit(changedTodoCollection2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoChangeNotificationUnit)) {
            return false;
        }
        TodoChangeNotificationUnit todoChangeNotificationUnit = (TodoChangeNotificationUnit) obj;
        return Intrinsics.areEqual(this.changedTodoCollection, todoChangeNotificationUnit.changedTodoCollection) && this.isRefreshAll == todoChangeNotificationUnit.isRefreshAll;
    }

    public int hashCode() {
        ChangedTodoCollection changedTodoCollection2 = this.changedTodoCollection;
        int hashCode = (changedTodoCollection2 != null ? changedTodoCollection2.hashCode() : 0) * 31;
        boolean z = this.isRefreshAll;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "TodoChangeNotificationUnit(changedTodoCollection=" + this.changedTodoCollection + ", isRefreshAll=" + this.isRefreshAll + ")";
    }

    public final ChangedTodoCollection getChangedTodoCollection() {
        return this.changedTodoCollection;
    }

    public final boolean isRefreshAll() {
        return this.isRefreshAll;
    }

    public final void setChangedTodoCollection(ChangedTodoCollection changedTodoCollection2) {
        this.changedTodoCollection = changedTodoCollection2;
    }

    public final void setRefreshAll(boolean z) {
        this.isRefreshAll = z;
    }

    public TodoChangeNotificationUnit(ChangedTodoCollection changedTodoCollection2, boolean z) {
        this.changedTodoCollection = changedTodoCollection2;
        this.isRefreshAll = z;
    }
}
