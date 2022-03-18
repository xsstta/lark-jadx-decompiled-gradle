package com.ss.android.lark.todo.impl.framework.architecture;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eR\u0010\u0010\u0003\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "hasBeenHandled$annotations", "()V", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.a.b */
public class Event<T> {

    /* renamed from: a */
    private boolean f141047a;

    /* renamed from: b */
    private final T f141048b;

    /* renamed from: a */
    public final T mo194118a() {
        if (this.f141047a) {
            return null;
        }
        this.f141047a = true;
        return this.f141048b;
    }

    public Event(T t) {
        this.f141048b = t;
    }
}
