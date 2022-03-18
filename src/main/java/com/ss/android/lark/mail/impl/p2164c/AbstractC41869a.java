package com.ss.android.lark.mail.impl.p2164c;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.utils.C43849u;

/* renamed from: com.ss.android.lark.mail.impl.c.a */
public abstract class AbstractC41869a<Data> implements IGetDataCallback<Data> {
    /* renamed from: a */
    public abstract void m166299b(ErrorResult errorResult);

    /* renamed from: a */
    public abstract void m166300b(Data data);

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        C43849u.m173826a(new Runnable(errorResult) {
            /* class com.ss.android.lark.mail.impl.p2164c.$$Lambda$a$fbeEo0hNrPy3oDiVZqdUFmns */
            public final /* synthetic */ ErrorResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC41869a.m270717lambda$fbeEo0hNrPy3oDiVZqdUFmns(AbstractC41869a.this, this.f$1);
            }
        });
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
    public void onSuccess(Data data) {
        C43849u.m173826a(new Runnable(data) {
            /* class com.ss.android.lark.mail.impl.p2164c.$$Lambda$a$bomlbHHcVhVyREErDX5njctuODw */
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC41869a.lambda$bomlbHHcVhVyREErDX5njctuODw(AbstractC41869a.this, this.f$1);
            }
        });
    }
}
