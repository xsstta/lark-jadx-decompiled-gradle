package com.ss.android.lark.todo.impl.features.mainview.entity;

import com.bytedance.lark.pb.todo.v1.Todo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoPagingUnit;", "", "todos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "hasMore", "", "nextPosition", "", "(Ljava/util/concurrent/CopyOnWriteArrayList;ZJ)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getNextPosition", "()J", "setNextPosition", "(J)V", "getTodos", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setTodos", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.e */
public final class TodoPagingUnit {

    /* renamed from: a */
    private CopyOnWriteArrayList<Todo> f140341a;

    /* renamed from: b */
    private boolean f140342b;

    /* renamed from: c */
    private long f140343c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoPagingUnit)) {
            return false;
        }
        TodoPagingUnit eVar = (TodoPagingUnit) obj;
        return Intrinsics.areEqual(this.f140341a, eVar.f140341a) && this.f140342b == eVar.f140342b && this.f140343c == eVar.f140343c;
    }

    public int hashCode() {
        CopyOnWriteArrayList<Todo> copyOnWriteArrayList = this.f140341a;
        int hashCode = (copyOnWriteArrayList != null ? copyOnWriteArrayList.hashCode() : 0) * 31;
        boolean z = this.f140342b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f140343c);
    }

    public String toString() {
        return "TodoPagingUnit(todos=" + this.f140341a + ", hasMore=" + this.f140342b + ", nextPosition=" + this.f140343c + ")";
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<Todo> mo193219a() {
        return this.f140341a;
    }

    /* renamed from: b */
    public final boolean mo193220b() {
        return this.f140342b;
    }

    /* renamed from: c */
    public final long mo193221c() {
        return this.f140343c;
    }

    public TodoPagingUnit(CopyOnWriteArrayList<Todo> copyOnWriteArrayList, boolean z, long j) {
        this.f140341a = copyOnWriteArrayList;
        this.f140342b = z;
        this.f140343c = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TodoPagingUnit(CopyOnWriteArrayList copyOnWriteArrayList, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(copyOnWriteArrayList, z, (i & 4) != 0 ? 0 : j);
    }
}
