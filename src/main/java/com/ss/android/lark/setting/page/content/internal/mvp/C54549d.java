package com.ss.android.lark.setting.page.content.internal.mvp;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a;

/* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.d */
public class C54549d extends BasePresenter<AbstractC54538a.AbstractC54539a, AbstractC54538a.AbstractC54541b, AbstractC54538a.AbstractC54541b.AbstractC54542a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54538a.AbstractC54541b.AbstractC54542a createViewDelegate() {
        return new C54552b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.d$b */
    public class C54552b implements AbstractC54538a.AbstractC54541b.AbstractC54542a {
        @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54541b.AbstractC54542a
        /* renamed from: a */
        public void mo186379a() {
            ((AbstractC54538a.AbstractC54539a) C54549d.this.getModel()).mo186376a();
        }

        private C54552b() {
        }
    }

    /* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.d$a */
    private class C54551a implements AbstractC54538a.AbstractC54539a.AbstractC54540a {
        private C54551a() {
        }

        @Override // com.ss.android.lark.setting.page.content.internal.mvp.AbstractC54538a.AbstractC54539a.AbstractC54540a
        /* renamed from: a */
        public void mo186378a(boolean z) {
            if (z) {
                ((AbstractC54538a.AbstractC54541b) C54549d.this.getView()).mo186371b();
            } else {
                ((AbstractC54538a.AbstractC54541b) C54549d.this.getView()).mo186369a();
            }
        }
    }

    public C54549d(AbstractC54538a.AbstractC54539a aVar, AbstractC54538a.AbstractC54541b bVar) {
        super(aVar, bVar);
        aVar.mo186377a(new C54551a());
    }
}
