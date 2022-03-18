package com.ss.android.lark.contact.impl.contacts_new;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a;
import com.ss.android.lark.contact.impl.contacts_new.NewContactView;
import com.ss.android.lark.contact.impl.entity.ExternalContactSummary;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_new.d */
public class C35706d extends BasePresenter<AbstractC35695a.AbstractC35696a, AbstractC35695a.AbstractC35698b, AbstractC35695a.AbstractC35698b.AbstractC35699a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35695a.AbstractC35698b.AbstractC35699a createViewDelegate() {
        return new C35710b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m139778b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.d$b */
    public class C35710b implements AbstractC35695a.AbstractC35698b.AbstractC35699a {
        @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b.AbstractC35699a
        /* renamed from: b */
        public void mo131489b() {
            ((AbstractC35695a.AbstractC35696a) C35706d.this.getModel()).mo131479a(new UIGetDataCallback(new IGetDataCallback<AbstractC35936a.C35940d>() {
                /* class com.ss.android.lark.contact.impl.contacts_new.C35706d.C35710b.C357111 */

                /* renamed from: a */
                public void onSuccess(AbstractC35936a.C35940d dVar) {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131464a();
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131469a(C35706d.this.mo131495a(dVar.mo132237a()));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131464a();
                    Log.m165382e("get friend request failed: " + errorResult.toString());
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b.AbstractC35699a
        /* renamed from: a */
        public boolean mo131488a() {
            return ((AbstractC35695a.AbstractC35696a) C35706d.this.getModel()).mo131483a();
        }

        private C35710b() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b.AbstractC35699a
        /* renamed from: a */
        public void mo131486a(final NewContactView.C35693a aVar) {
            ((AbstractC35695a.AbstractC35696a) C35706d.this.getModel()).mo131481a(aVar.f92317a, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.contact.impl.contacts_new.C35706d.C35710b.C357122 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131466a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131465a(R.string.Lark_Legacy_DeleteFail);
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35698b.AbstractC35699a
        /* renamed from: a */
        public void mo131487a(String str, String str2) {
            ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131468a(str, str2);
        }
    }

    /* renamed from: b */
    private void m139778b() {
        ((AbstractC35695a.AbstractC35698b) getView()).mo131473c();
        ((AbstractC35695a.AbstractC35696a) getModel()).mo131479a(new UIGetDataCallback(new IGetDataCallback<AbstractC35936a.C35940d>() {
            /* class com.ss.android.lark.contact.impl.contacts_new.C35706d.C357071 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131474d();
                Log.m165382e("get friend request failed: " + errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35940d dVar) {
                String b = ((AbstractC35695a.AbstractC35696a) C35706d.this.getModel()).mo131484b();
                List<ChatApplication> a = dVar.mo132237a();
                if (!b.equals("0") || !CollectionUtils.isEmpty(a)) {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131469a(C35706d.this.mo131495a(dVar.mo132237a()));
                } else {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131470b();
                }
                ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131474d();
                ((AbstractC35695a.AbstractC35696a) C35706d.this.getModel()).mo131482a(true);
            }
        }));
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.d$a */
    private class C35708a implements AbstractC35695a.AbstractC35696a.AbstractC35697a {
        private C35708a() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.AbstractC35695a.AbstractC35696a.AbstractC35697a
        /* renamed from: a */
        public void mo131485a(final List<ChatApplication> list) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.contacts_new.C35706d.C35708a.RunnableC357091 */

                public void run() {
                    ((AbstractC35695a.AbstractC35698b) C35706d.this.getView()).mo131472b(C35706d.this.mo131495a(list));
                }
            });
        }
    }

    /* renamed from: a */
    public List<NewContactView.C35693a> mo131495a(List<ChatApplication> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a() {
            /* class com.ss.android.lark.contact.impl.contacts_new.$$Lambda$d$cAyIOH95RLSmi6_OrKwP54PAkl4 */

            @Override // com.larksuite.framework.utils.C26249aa.AbstractC26250a
            public final Object get(Object obj) {
                return C35706d.this.m139777b((ChatApplication) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public NewContactView.C35693a m139777b(ChatApplication chatApplication) {
        ExternalContactSummary externalContactSummary = chatApplication.getExternalContactSummary();
        if (externalContactSummary == null) {
            return null;
        }
        AbstractC35361b.AbstractC35367f j = C35358a.m138143a().mo130165j();
        NewContactView.C35693a aVar = new NewContactView.C35693a();
        aVar.f92319c = externalContactSummary.getAvatarKey();
        aVar.f92320d = j.mo130196a(externalContactSummary.getUserName(), externalContactSummary.getUserEnName());
        aVar.f92317a = chatApplication.getId();
        aVar.f92318b = externalContactSummary.getUseId();
        aVar.f92321e = externalContactSummary.getTenantName();
        aVar.f92322f = chatApplication.getExtraMessage();
        aVar.f92323g = chatApplication.getStatus();
        return aVar;
    }

    public C35706d(AbstractC35695a.AbstractC35696a aVar, AbstractC35695a.AbstractC35698b bVar) {
        super(aVar, bVar);
        ((AbstractC35695a.AbstractC35696a) getModel()).mo131480a(new C35708a());
    }
}
