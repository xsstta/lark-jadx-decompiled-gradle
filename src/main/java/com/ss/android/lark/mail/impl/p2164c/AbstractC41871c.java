package com.ss.android.lark.mail.impl.p2164c;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.mail.impl.c.c */
public abstract class AbstractC41871c<Data> implements IGetDataCallback<Data> {

    /* renamed from: a */
    IGetDataCallback f106206a;

    /* renamed from: b */
    AtomicBoolean f106207b;

    /* renamed from: a */
    public abstract void mo150436a();

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        AtomicBoolean atomicBoolean = this.f106207b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            this.f106206a.onError(errorResult);
        } else {
            mo150436a();
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(Data data) {
        AtomicBoolean atomicBoolean = this.f106207b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            this.f106206a.onSuccess(data);
        } else {
            mo150436a();
        }
    }

    public AbstractC41871c(IGetDataCallback iGetDataCallback, AtomicBoolean atomicBoolean) {
        this.f106206a = iGetDataCallback;
        this.f106207b = atomicBoolean;
    }
}
