package com.ss.android.lark.contact.feat.contact_external.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.feat.contact_external.data.ExternalContactViewData;
import com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c;
import com.ss.android.lark.contact.feat.contact_external.mvp.C35446b;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.inv.export.util.InvRequestUtils;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.b */
public class C35446b extends BasePresenter<AbstractC35453c.AbstractC35454a, AbstractC35453c.AbstractC35456b, AbstractC35453c.AbstractC35456b.AbstractC35457a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35453c.AbstractC35456b.AbstractC35457a createViewDelegate() {
        return new C35450c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m138653b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.b$a */
    public class C35448a implements InvRequestUtils.LocalAndServerRequestCallback<List<ExternalContactViewData>> {
        /* renamed from: a */
        public boolean mo130830a(List<ExternalContactViewData> list) {
            return true;
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130825a() {
            ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130798b();
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: b */
        public void mo130832b() {
            ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130800c();
        }

        private C35448a() {
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130827a(UIGetDataCallback<List<ExternalContactViewData>> uIGetDataCallback) {
            ((AbstractC35453c.AbstractC35454a) C35446b.this.getModel()).mo130817a((Boolean) true, (IGetDataCallback<List<ExternalContactViewData>>) uIGetDataCallback);
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: b */
        public void mo130833b(UIGetDataCallback<List<ExternalContactViewData>> uIGetDataCallback) {
            ((AbstractC35453c.AbstractC35454a) C35446b.this.getModel()).mo130817a((Boolean) false, (IGetDataCallback<List<ExternalContactViewData>>) uIGetDataCallback);
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130826a(ErrorResult errorResult) {
            ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130792a();
            if (errorResult != null) {
                Log.m165382e("get external contacts failed: " + errorResult.toString());
            } else {
                Log.m165382e("get external contacts failed.");
            }
            InvAppreciableUtils.f101934a.mo145655a(errorResult, true);
        }

        /* renamed from: a */
        public void mo130828a(boolean z, List<ExternalContactViewData> list) {
            if (CollectionUtils.isEmpty(list)) {
                ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130792a();
            } else {
                ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130797a(list);
            }
            if (!z) {
                InvAppreciableUtils.f101934a.mo145657a(false, true);
            }
        }
    }

    /* renamed from: b */
    private void m138653b() {
        InvAppreciableUtils.f101934a.mo145657a(true, true);
        InvRequestUtils.m159144b(new C35448a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.b$b */
    public class C35449b implements AbstractC35453c.AbstractC35454a.AbstractC35455a {
        private C35449b() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m138664b(ExternalContactViewData aVar) {
            ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130801c(aVar);
        }

        @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35454a.AbstractC35455a
        /* renamed from: a */
        public void mo130834a(ExternalContactViewData aVar) {
            UICallbackExecutor.execute(new Runnable(aVar) {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.$$Lambda$b$b$JHlcWSsYMLPXZtdoqvs81EU2WYs */
                public final /* synthetic */ ExternalContactViewData f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C35446b.C35449b.this.m138664b(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.b$c */
    public class C35450c implements AbstractC35453c.AbstractC35456b.AbstractC35457a {
        private C35450c() {
        }

        @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b.AbstractC35457a
        /* renamed from: a */
        public void mo130835a(final ExternalContactViewData aVar) {
            ((AbstractC35453c.AbstractC35454a) C35446b.this.getModel()).mo130819a(aVar.mo130776d(), aVar.mo130778e(), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.C35446b.C35450c.C354522 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130799b(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130793a(R.string.Lark_Legacy_DeleteFail);
                }
            }));
        }

        @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b.AbstractC35457a
        /* renamed from: a */
        public void mo130836a(String str) {
            ((AbstractC35453c.AbstractC35454a) C35446b.this.getModel()).mo130818a(str, new UIGetDataCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.C35446b.C35450c.C354511 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    ((AbstractC35453c.AbstractC35456b) C35446b.this.getView()).mo130794a(chatter);
                }
            }));
        }
    }

    public C35446b(AbstractC35453c.AbstractC35454a aVar, AbstractC35453c.AbstractC35456b bVar) {
        super(aVar, bVar);
        aVar.mo130816a(new C35449b());
    }
}
