package com.ss.android.lark.utils.rxjava;

import io.reactivex.functions.Consumer;

public abstract class ReportErrorConsumer implements Consumer<Throwable> {
    /* access modifiers changed from: protected */
    public abstract void error(Throwable th) throws Exception;

    public void accept(Throwable th) throws Exception {
        C57876d.m224585a(th);
        error(th);
    }
}
