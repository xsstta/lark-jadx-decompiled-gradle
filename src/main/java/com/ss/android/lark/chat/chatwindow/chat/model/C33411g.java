package com.ss.android.lark.chat.chatwindow.chat.model;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.g */
public class C33411g<PageData, T> implements PageLoader.IReceiver<PageData> {

    /* renamed from: a */
    final IGetDataCallback<AbstractC33964i<T>> f86035a;

    /* renamed from: b */
    final AbstractC34432b<?, T, PageData, AbstractC33964i<T>> f86036b;

    public C33411g(AbstractC34432b<?, T, PageData, AbstractC33964i<T>> bVar, IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        this.f86035a = iGetDataCallback;
        this.f86036b = bVar;
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122979a(int i, Throwable th) {
        IGetDataCallback<AbstractC33964i<T>> iGetDataCallback = this.f86035a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122978a(int i, PageData pagedata) {
        if (i == 0) {
            this.f86036b.mo127112c(pagedata);
        } else if (i == 1) {
            this.f86036b.mo127108b(pagedata);
        } else {
            this.f86036b.mo127103a(pagedata);
        }
        IGetDataCallback<AbstractC33964i<T>> iGetDataCallback = this.f86035a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(this.f86036b.mo127125l());
        }
    }
}
