package com.ss.android.lark.contact.impl.contacts_group.manage;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.d */
public class C35630d extends BasePresenter<AbstractC35623a.AbstractC35624a, AbstractC35623a.AbstractC35625b, AbstractC35623a.AbstractC35625b.AbstractC35626a> {
    /* renamed from: b */
    private void m139464b() {
        m139465c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35623a.AbstractC35625b.AbstractC35626a createViewDelegate() {
        return new C35632a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m139464b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.d$a */
    public class C35632a implements AbstractC35623a.AbstractC35625b.AbstractC35626a {
        @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b.AbstractC35626a
        /* renamed from: a */
        public boolean mo131307a() {
            return ((AbstractC35623a.AbstractC35624a) C35630d.this.getModel()).mo131306a();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b.AbstractC35626a
        /* renamed from: b */
        public void mo131308b() {
            ((AbstractC35623a.AbstractC35624a) C35630d.this.getModel()).mo131305a(new UIGetDataCallback(new IGetDataCallback<List<Chat>>() {
                /* class com.ss.android.lark.contact.impl.contacts_group.manage.C35630d.C35632a.C356331 */

                /* renamed from: a */
                public void onSuccess(List<Chat> list) {
                    ((AbstractC35623a.AbstractC35625b) C35630d.this.getView()).mo131298a();
                    ((AbstractC35623a.AbstractC35625b) C35630d.this.getView()).mo131302b(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("get managed groups failed: " + errorResult.toString());
                    ((AbstractC35623a.AbstractC35625b) C35630d.this.getView()).mo131298a();
                }
            }));
        }

        private C35632a() {
        }
    }

    /* renamed from: c */
    private void m139465c() {
        ((AbstractC35623a.AbstractC35624a) getModel()).mo131305a(new UIGetDataCallback(new IGetDataCallback<List<Chat>>() {
            /* class com.ss.android.lark.contact.impl.contacts_group.manage.C35630d.C356311 */

            /* renamed from: a */
            public void onSuccess(List<Chat> list) {
                ((AbstractC35623a.AbstractC35625b) C35630d.this.getView()).mo131301a(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("get joined groups failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: a */
    public void mo131319a(PickType pickType) {
        ((AbstractC35623a.AbstractC35625b) getView()).mo131299a(pickType);
    }

    /* renamed from: b */
    public void mo131321b(List<String> list) {
        ((AbstractC35623a.AbstractC35625b) getView()).mo131304d(list);
    }

    /* renamed from: a */
    public void mo131320a(List<String> list) {
        ((AbstractC35623a.AbstractC35625b) getView()).mo131303c(list);
    }

    public C35630d(AbstractC35623a.AbstractC35624a aVar, AbstractC35623a.AbstractC35625b bVar) {
        super(aVar, bVar);
    }
}
