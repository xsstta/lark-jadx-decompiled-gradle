package com.ss.android.lark.threaddetail.p2750b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.PageLoader;

/* renamed from: com.ss.android.lark.threaddetail.b.f */
public class C55794f implements PageLoader.IReceiver<C55781c> {

    /* renamed from: a */
    IGetDataCallback<C55781c> f137640a;

    /* renamed from: b */
    C55777a f137641b;

    public C55794f(C55777a aVar, IGetDataCallback<C55781c> iGetDataCallback) {
        this.f137641b = aVar;
        this.f137640a = iGetDataCallback;
    }

    /* renamed from: a */
    public void mo122978a(int i, C55781c cVar) {
        if (i == 0) {
            this.f137641b.mo127112c((C33952a) cVar);
        } else if (i == 1) {
            this.f137641b.mo127108b((C33952a) cVar);
        } else {
            this.f137641b.mo127103a(cVar);
        }
        IGetDataCallback<C55781c> iGetDataCallback = this.f137640a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(cVar);
        }
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122979a(int i, Throwable th) {
        IGetDataCallback<C55781c> iGetDataCallback = this.f137640a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }
}
