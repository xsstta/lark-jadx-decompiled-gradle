package com.ss.android.lark.mm.utils.ktextensions;

import android.view.View;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC68262a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/utils/ktextensions/ViewClickObservable;", "Lio/reactivex/Observable;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "subscribeActual", "observer", "Lio/reactivex/Observer;", "Listener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.ktextensions.d */
public final class ViewClickObservable extends Observable<Unit> {

    /* renamed from: a */
    private final View f118640a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/utils/ktextensions/ViewClickObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "observer", "Lio/reactivex/Observer;", "", "(Landroid/view/View;Lio/reactivex/Observer;)V", "onClick", "v", "onDispose", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.ktextensions.d$a */
    private static final class Listener extends AbstractC68262a implements View.OnClickListener {

        /* renamed from: a */
        private final View f118641a;

        /* renamed from: b */
        private final AbstractC69009q<? super Unit> f118642b;

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.AbstractC68262a
        /* renamed from: a */
        public void mo28971a() {
            this.f118641a.setOnClickListener(null);
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (!isDisposed()) {
                this.f118642b.onNext(Unit.INSTANCE);
            }
        }

        public Listener(View view, AbstractC69009q<? super Unit> qVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(qVar, "observer");
            this.f118641a = view;
            this.f118642b = qVar;
        }
    }

    public ViewClickObservable(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f118640a = view;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Unit> qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "observer");
        if (C47109c.m186570a(qVar)) {
            Listener aVar = new Listener(this.f118640a, qVar);
            qVar.onSubscribe(aVar);
            this.f118640a.setOnClickListener(aVar);
        }
    }
}
