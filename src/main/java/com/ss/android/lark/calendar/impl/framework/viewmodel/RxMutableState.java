package com.ss.android.lark.calendar.impl.framework.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0014J\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005R \u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000@RX\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxMutableState;", "V", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxState;", "initValue", "(Ljava/lang/Object;)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "add", "", "observer", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent$ObserverDisposable;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/RxEvent;", "emit", "v", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.e */
public final class RxMutableState<V> extends RxState<V> {

    /* renamed from: a */
    private V f83413a;

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.RxState
    /* renamed from: a */
    public V mo118786a() {
        return this.f83413a;
    }

    public RxMutableState(V v) {
        Intrinsics.checkParameterIsNotNull(v, "initValue");
        this.f83413a = v;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.RxEvent
    /* renamed from: a */
    public void mo118781a(RxEvent<V>.ObserverDisposable observerDisposable) {
        Intrinsics.checkParameterIsNotNull(observerDisposable, "observer");
        super.mo118781a(observerDisposable);
        observerDisposable.onNext(mo118786a());
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.RxEvent
    /* renamed from: a */
    public void mo118782a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "v");
        this.f83413a = v;
        super.mo118782a((Object) v);
    }
}
