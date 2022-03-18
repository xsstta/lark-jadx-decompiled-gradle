package com.ss.android.lark.threadwindow.p2760a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.threadwindow.C56145l;

/* renamed from: com.ss.android.lark.threadwindow.a.b */
public class C56018b<PageData, T> implements PageLoader.IReceiver<PageData> {

    /* renamed from: a */
    final IGetDataCallback<AbstractC33964i<T>> f138507a;

    /* renamed from: b */
    final AbstractC34432b<?, T, PageData, AbstractC33964i<T>> f138508b;

    /* renamed from: c */
    private final AbstractC36503q f138509c = C29990c.m110930b().mo134586n();

    /* renamed from: d */
    private boolean f138510d;

    public C56018b(AbstractC34432b<?, T, PageData, AbstractC33964i<T>> bVar, IGetDataCallback<AbstractC33964i<T>> iGetDataCallback) {
        this.f138507a = iGetDataCallback;
        this.f138508b = bVar;
        this.f138510d = C56145l.m218886a();
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122979a(int i, Throwable th) {
        IGetDataCallback<AbstractC33964i<T>> iGetDataCallback = this.f138507a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    @Override // com.ss.android.lark.chat.core.model.PageLoader.IReceiver
    /* renamed from: a */
    public void mo122978a(int i, PageData pagedata) {
        if (i == 0) {
            this.f138508b.mo127112c(pagedata);
        } else if (i == 1) {
            if (this.f138510d) {
                this.f138508b.mo127103a(pagedata);
            } else {
                this.f138508b.mo127108b(pagedata);
            }
        } else if (this.f138510d) {
            this.f138508b.mo127108b(pagedata);
        } else {
            this.f138508b.mo127103a(pagedata);
        }
        IGetDataCallback<AbstractC33964i<T>> iGetDataCallback = this.f138507a;
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(this.f138508b.mo127125l());
        }
    }
}
