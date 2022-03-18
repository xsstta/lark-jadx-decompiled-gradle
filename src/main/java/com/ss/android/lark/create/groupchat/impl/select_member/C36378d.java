package com.ss.android.lark.create.groupchat.impl.select_member;

import android.content.Intent;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.d */
public class C36378d extends BasePresenter<AbstractC36395h.AbstractC36396a, AbstractC36395h.AbstractC36397b, AbstractC36395h.AbstractC36397b.AbstractC36398a> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC36395h.AbstractC36397b.AbstractC36398a createViewDelegate() {
        return new C36380a();
    }

    /* renamed from: a */
    public void mo134179a() {
        ((AbstractC36395h.AbstractC36397b) getView()).mo134156a();
    }

    /* renamed from: c */
    public void mo134182c() {
        ((AbstractC36395h.AbstractC36397b) getView()).mo134163b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC36395h.AbstractC36397b) getView()).mo134162a(((AbstractC36395h.AbstractC36396a) getModel()).mo134177a(), ((AbstractC36395h.AbstractC36396a) getModel()).mo134178b());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.d$a */
    public class C36380a implements AbstractC36395h.AbstractC36397b.AbstractC36398a {
        private C36380a() {
        }
    }

    public C36378d(AbstractC36395h.AbstractC36397b bVar, GroupCreateInfo groupCreateInfo) {
        C36377c cVar = new C36377c(groupCreateInfo);
        bVar.setViewDelegate(createViewDelegate());
        setModel(cVar);
        setView(bVar);
    }

    /* renamed from: a */
    public void mo134180a(int i, int i2, Intent intent) {
        ((AbstractC36395h.AbstractC36397b) getView()).mo134158a(i, i2, intent);
    }
}
