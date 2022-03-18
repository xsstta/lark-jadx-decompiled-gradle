package com.ss.android.lark.mm.utils.ktextensions;

import android.os.Looper;
import android.view.View;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.disposables.EmptyDisposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"checkMainThread", "", "observer", "Lio/reactivex/Observer;", "clicks", "Lio/reactivex/Observable;", "", "Landroid/view/View;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.ktextensions.c */
public final class C47109c {
    /* renamed from: a */
    public static final Observable<Unit> m186569a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$clicks");
        Observable<Unit> observeOn = new ViewClickObservable(view).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkExpressionValueIsNotNull(observeOn, "ViewClickObservable(this…dSchedulers.mainThread())");
        return observeOn;
    }

    /* renamed from: a */
    public static final boolean m186570a(AbstractC69009q<?> qVar) {
        if (!(!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()))) {
            return true;
        }
        qVar.onSubscribe(EmptyDisposable.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        qVar.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
