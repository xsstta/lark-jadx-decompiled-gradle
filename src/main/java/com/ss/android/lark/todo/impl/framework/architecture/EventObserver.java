package com.ss.android.lark.todo.impl.framework.architecture;

import androidx.lifecycle.AbstractC1178x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/architecture/EventObserver;", "T", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/lark/todo/impl/framework/architecture/Event;", "onEventUnhandledContent", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onChanged", "event", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.a.c */
public final class EventObserver<T> implements AbstractC1178x<Event<? extends T>> {

    /* renamed from: a */
    private final Function1<T, Unit> f141049a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public EventObserver(Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onEventUnhandledContent");
        this.f141049a = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void onChanged(Event<? extends T> bVar) {
        Object a;
        if (bVar != null && (a = bVar.mo194118a()) != null) {
            this.f141049a.invoke(a);
        }
    }
}
