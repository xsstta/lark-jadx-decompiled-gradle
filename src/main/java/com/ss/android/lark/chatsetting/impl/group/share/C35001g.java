package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Intent;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chatsetting.impl.group.share.C35002h;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.g */
public class C35001g extends BasePresenter<C35002h.AbstractC35003a, C35002h.AbstractC35004b, C35002h.AbstractC35004b.AbstractC35005a> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C35002h.AbstractC35004b.AbstractC35005a createViewDelegate() {
        return null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public C35002h.AbstractC35004b getView() {
        return (C35002h.AbstractC35004b) super.getView();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        getView().mo128955a(((C35002h.AbstractC35003a) getModel()).mo128990a());
        getView().mo128956a(((C35002h.AbstractC35003a) getModel()).mo128994e(), ((C35002h.AbstractC35003a) getModel()).mo128995f(), ((C35002h.AbstractC35003a) getModel()).mo128996g(), ((C35002h.AbstractC35003a) getModel()).mo128997h(), ((C35002h.AbstractC35003a) getModel()).mo128991b(), ((C35002h.AbstractC35003a) getModel()).mo128993d(), ((C35002h.AbstractC35003a) getModel()).mo128992c());
    }

    public C35001g(C35002h.AbstractC35003a aVar, C35002h.AbstractC35004b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public void mo128999a(int i, int i2, Intent intent) {
        getView().mo128952a(i, i2, intent);
    }
}
