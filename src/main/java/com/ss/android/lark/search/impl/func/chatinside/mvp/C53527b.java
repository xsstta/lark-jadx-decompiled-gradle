package com.ss.android.lark.search.impl.func.chatinside.mvp;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.search.impl.func.chatinside.mvp.AbstractC53528c;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.b */
public class C53527b extends BasePresenter<AbstractC53528c.AbstractC53529a, AbstractC53528c.AbstractC53530b, AbstractC53528c.AbstractC53530b.AbstractC53531a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC53528c.AbstractC53530b.AbstractC53531a createViewDelegate() {
        return null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC53528c.AbstractC53530b) getView()).mo182755a(((AbstractC53528c.AbstractC53529a) getModel()).mo182757a());
        ((AbstractC53528c.AbstractC53530b) getView()).mo182753a(((AbstractC53528c.AbstractC53529a) getModel()).mo182758b());
    }

    public C53527b(AbstractC53528c.AbstractC53529a aVar, AbstractC53528c.AbstractC53530b bVar) {
        super(aVar, bVar);
    }
}
