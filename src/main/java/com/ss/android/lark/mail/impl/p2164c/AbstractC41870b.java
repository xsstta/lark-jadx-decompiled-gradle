package com.ss.android.lark.mail.impl.p2164c;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.utils.C43849u;

/* renamed from: com.ss.android.lark.mail.impl.c.b */
public abstract class AbstractC41870b<Data> implements IGetDataCallback<Data> {
    /* renamed from: a */
    public abstract void m166303b(ErrorResult errorResult);

    /* renamed from: a */
    public abstract void m166304b(Data data);

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        C43849u.m173826a(new Runnable(errorResult) {
            /* class com.ss.android.lark.mail.impl.p2164c.$$Lambda$b$S31XOdal9WL4LsiJP6Vlhl2OysU */
            public final /* synthetic */ ErrorResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC41870b.lambda$S31XOdal9WL4LsiJP6Vlhl2OysU(AbstractC41870b.this, this.f$1);
            }
        });
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(Data data) {
        C43849u.m173826a(new Runnable(data) {
            /* class com.ss.android.lark.mail.impl.p2164c.$$Lambda$b$cQKBphwTd6lBF8SMr6bXwm9IByw */
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC41870b.lambda$cQKBphwTd6lBF8SMr6bXwm9IByw(AbstractC41870b.this, this.f$1);
            }
        });
    }
}
