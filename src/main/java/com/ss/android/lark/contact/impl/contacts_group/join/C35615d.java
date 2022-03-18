package com.ss.android.lark.contact.impl.contacts_group.join;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.d */
public class C35615d extends BasePresenter<AbstractC35606a.AbstractC35607a, AbstractC35606a.AbstractC35608b, AbstractC35606a.AbstractC35608b.AbstractC35609a> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC35606a.AbstractC35608b.AbstractC35609a createViewDelegate() {
        return new C35618a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m139418c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.d$a */
    public class C35618a implements AbstractC35606a.AbstractC35608b.AbstractC35609a {
        @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35608b.AbstractC35609a
        /* renamed from: a */
        public boolean mo131284a() {
            return ((AbstractC35606a.AbstractC35607a) C35615d.this.getModel()).mo131282a();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35608b.AbstractC35609a
        /* renamed from: b */
        public void mo131285b() {
            ((AbstractC35606a.AbstractC35607a) C35615d.this.getModel()).mo131283b(new UIGetDataCallback(new IGetDataCallback<List<Chat>>() {
                /* class com.ss.android.lark.contact.impl.contacts_group.join.C35615d.C35618a.C356191 */

                /* renamed from: a */
                public void onSuccess(List<Chat> list) {
                    ((AbstractC35606a.AbstractC35608b) C35615d.this.getView()).mo131276a();
                    ((AbstractC35606a.AbstractC35608b) C35615d.this.getView()).mo131279b(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("get joined groups failed: " + errorResult.toString());
                    ((AbstractC35606a.AbstractC35608b) C35615d.this.getView()).mo131276a();
                }
            }));
        }

        private C35618a() {
        }
    }

    /* renamed from: c */
    private void m139418c() {
        ((AbstractC35606a.AbstractC35607a) getModel()).mo131281a(new UIGetDataCallback(new IGetDataCallback<List<Chat>>() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.C35615d.C356161 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35615d.this.mo131292a();
            }

            /* renamed from: a */
            public void onSuccess(List<Chat> list) {
                if (list.size() > 0) {
                    ((AbstractC35606a.AbstractC35608b) C35615d.this.getView()).mo131278a(list);
                }
                C35615d.this.mo131292a();
            }
        }));
    }

    /* renamed from: a */
    public void mo131292a() {
        ((AbstractC35606a.AbstractC35607a) getModel()).mo131283b(new UIGetDataCallback(new IGetDataCallback<List<Chat>>() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.C35615d.C356172 */

            /* renamed from: a */
            public void onSuccess(List<Chat> list) {
                ((AbstractC35606a.AbstractC35608b) C35615d.this.getView()).mo131278a(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("get joined groups failed: " + errorResult.toString());
            }
        }));
    }

    public C35615d(AbstractC35606a.AbstractC35607a aVar, AbstractC35606a.AbstractC35608b bVar) {
        super(aVar, bVar);
    }
}
