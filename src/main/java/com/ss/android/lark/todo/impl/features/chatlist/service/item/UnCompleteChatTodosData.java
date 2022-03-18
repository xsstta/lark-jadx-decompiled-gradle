package com.ss.android.lark.todo.impl.features.chatlist.service.item;

import com.bytedance.lark.pb.todo.v1.ChatTodoInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/UnCompleteChatTodosData;", "", "assignToMeTodos", "", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "assignToOtherTodos", "(Ljava/util/List;Ljava/util/List;)V", "getAssignToMeTodos", "()Ljava/util/List;", "setAssignToMeTodos", "(Ljava/util/List;)V", "getAssignToOtherTodos", "setAssignToOtherTodos", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a.b */
public final class UnCompleteChatTodosData {

    /* renamed from: a */
    private List<ChatTodoInfo> f139320a;

    /* renamed from: b */
    private List<ChatTodoInfo> f139321b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnCompleteChatTodosData)) {
            return false;
        }
        UnCompleteChatTodosData bVar = (UnCompleteChatTodosData) obj;
        return Intrinsics.areEqual(this.f139320a, bVar.f139320a) && Intrinsics.areEqual(this.f139321b, bVar.f139321b);
    }

    public int hashCode() {
        List<ChatTodoInfo> list = this.f139320a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ChatTodoInfo> list2 = this.f139321b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UnCompleteChatTodosData(assignToMeTodos=" + this.f139320a + ", assignToOtherTodos=" + this.f139321b + ")";
    }

    /* renamed from: a */
    public final List<ChatTodoInfo> mo191838a() {
        return this.f139320a;
    }

    /* renamed from: b */
    public final List<ChatTodoInfo> mo191839b() {
        return this.f139321b;
    }

    public UnCompleteChatTodosData(List<ChatTodoInfo> list, List<ChatTodoInfo> list2) {
        this.f139320a = list;
        this.f139321b = list2;
    }
}
