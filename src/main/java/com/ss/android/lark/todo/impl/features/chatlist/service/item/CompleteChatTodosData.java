package com.ss.android.lark.todo.impl.features.chatlist.service.item;

import com.bytedance.lark.pb.todo.v1.ChatTodoInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJ8\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/CompleteChatTodosData;", "", "completedTodos", "", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "pageOffset", "", "isHasMore", "", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getCompletedTodos", "()Ljava/util/List;", "setCompletedTodos", "(Ljava/util/List;)V", "()Ljava/lang/Boolean;", "setHasMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPageOffset", "()Ljava/lang/Long;", "setPageOffset", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/ss/android/lark/todo/impl/features/chatlist/service/item/CompleteChatTodosData;", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.c.a.a */
public final class CompleteChatTodosData {

    /* renamed from: a */
    private List<ChatTodoInfo> f139317a;

    /* renamed from: b */
    private Long f139318b;

    /* renamed from: c */
    private Boolean f139319c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteChatTodosData)) {
            return false;
        }
        CompleteChatTodosData aVar = (CompleteChatTodosData) obj;
        return Intrinsics.areEqual(this.f139317a, aVar.f139317a) && Intrinsics.areEqual(this.f139318b, aVar.f139318b) && Intrinsics.areEqual(this.f139319c, aVar.f139319c);
    }

    public int hashCode() {
        List<ChatTodoInfo> list = this.f139317a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.f139318b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.f139319c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CompleteChatTodosData(completedTodos=" + this.f139317a + ", pageOffset=" + this.f139318b + ", isHasMore=" + this.f139319c + ")";
    }

    /* renamed from: a */
    public final List<ChatTodoInfo> mo191832a() {
        return this.f139317a;
    }

    /* renamed from: b */
    public final Long mo191833b() {
        return this.f139318b;
    }

    /* renamed from: c */
    public final Boolean mo191834c() {
        return this.f139319c;
    }

    public CompleteChatTodosData(List<ChatTodoInfo> list, Long l, Boolean bool) {
        this.f139317a = list;
        this.f139318b = l;
        this.f139319c = bool;
    }
}
