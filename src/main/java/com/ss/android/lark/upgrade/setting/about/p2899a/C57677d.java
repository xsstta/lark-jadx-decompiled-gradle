package com.ss.android.lark.upgrade.setting.about.p2899a;

import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.setting.about.p2899a.C57670b;

/* renamed from: com.ss.android.lark.upgrade.setting.about.a.d */
public class C57677d extends BasePresenter<C57670b.AbstractC57671a, C57670b.AbstractC57673b, C57670b.AbstractC57673b.AbstractC57674a> {
    /* renamed from: b */
    public void mo195786b() {
        m223928e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C57670b.AbstractC57673b.AbstractC57674a createViewDelegate() {
        return new C57670b.AbstractC57673b.AbstractC57674a() {
            /* class com.ss.android.lark.upgrade.setting.about.p2899a.C57677d.C576781 */

            @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57673b.AbstractC57674a
            /* renamed from: a */
            public void mo195784a() {
                ((C57670b.AbstractC57671a) C57677d.this.getModel()).mo195778b();
                ((C57670b.AbstractC57673b) C57677d.this.getView()).mo195783b();
            }
        };
    }

    /* renamed from: c */
    public void mo195787c() {
        m223928e();
        m223929f();
    }

    /* renamed from: d */
    public View mo195788d() {
        return ((C57670b.AbstractC57673b) getView()).mo195780a();
    }

    /* renamed from: e */
    private void m223928e() {
        ((C57670b.AbstractC57673b) getView()).mo195781a(((C57670b.AbstractC57671a) getModel()).mo195777a());
    }

    /* renamed from: f */
    private void m223929f() {
        boolean z;
        C57670b.AbstractC57673b bVar = (C57670b.AbstractC57673b) getView();
        boolean a = ((C57670b.AbstractC57671a) getModel()).mo195777a();
        if (C57607a.m223662a().mo177725s().mo177731a("user_privacy_update_tip") || C57607a.m223662a().mo177725s().mo177731a("user_agreement_update_tip")) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo195782a(a, z);
    }

    /* renamed from: com.ss.android.lark.upgrade.setting.about.a.d$a */
    private class C57679a implements C57670b.AbstractC57671a.AbstractC57672a {
        private C57679a() {
        }

        @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57671a.AbstractC57672a
        /* renamed from: a */
        public void mo195779a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.upgrade.setting.about.p2899a.C57677d.C57679a.RunnableC576801 */

                public void run() {
                    ((C57670b.AbstractC57673b) C57677d.this.getView()).mo195781a(z);
                }
            });
        }
    }

    public C57677d(C57670b.AbstractC57671a aVar, C57670b.AbstractC57673b bVar) {
        super(aVar, bVar);
        ((C57670b.AbstractC57671a) getModel()).mo195776a(new C57679a());
    }
}
