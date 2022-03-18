package com.ss.android.lark.chatbase;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;

/* renamed from: com.ss.android.lark.chatbase.a */
public class C34414a<PageData, T> implements PageLoader.IReceiver<PageData> {

    /* renamed from: a */
    final IGetDataCallback<PageData> f88870a;

    /* renamed from: b */
    final AbstractC34432b<?, T, PageData, AbstractC33964i<T>> f88871b;

    public C34414a(AbstractC34432b<?, T, PageData, AbstractC33964i<T>> bVar, IGetDataCallback<PageData> iGetDataCallback) {
        this.f88870a = iGetDataCallback;
        this.f88871b = bVar;
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122978a(int i, PageData pagedata) {
        if (i == 0) {
            this.f88871b.mo127112c(pagedata);
        } else if (i == 1) {
            this.f88871b.mo127108b(pagedata);
        } else {
            this.f88871b.mo127103a(pagedata);
        }
        IGetDataCallback<PageData> iGetDataCallback = this.f88870a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(pagedata);
        }
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122979a(int i, Throwable th) {
        IGetDataCallback<PageData> iGetDataCallback = this.f88870a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }
}
