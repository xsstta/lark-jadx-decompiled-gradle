package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35598e;
import com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.d */
public class C35597d extends BasePresenter<AbstractC35598e.AbstractC35599a, AbstractC35598e.AbstractC35600b, AbstractC35598e.AbstractC35600b.AbstractC35601a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35598e.AbstractC35600b.AbstractC35601a createViewDelegate() {
        return null;
    }

    public C35597d(Context context, ContactsMyGroupView.AbstractC35589a aVar, AbstractC35602f fVar, FragmentManager fragmentManager) {
        m139383a(context, aVar, fVar, fragmentManager);
    }

    /* renamed from: a */
    private void m139383a(Context context, ContactsMyGroupView.AbstractC35589a aVar, AbstractC35602f fVar, FragmentManager fragmentManager) {
        setModel(new C35596c(fVar));
        setView(new ContactsMyGroupView(((AbstractC35598e.AbstractC35599a) getModel()).mo131274a(context), aVar, fragmentManager));
    }
}
