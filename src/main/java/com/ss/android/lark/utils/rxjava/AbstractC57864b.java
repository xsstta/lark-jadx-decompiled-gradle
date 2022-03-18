package com.ss.android.lark.utils.rxjava;

import io.reactivex.AbstractC69009q;

/* renamed from: com.ss.android.lark.utils.rxjava.b */
public abstract class AbstractC57864b<T> implements AbstractC69009q<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo147247a(Throwable th);

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        C57876d.m224585a(th);
        mo147247a(th);
    }
}
