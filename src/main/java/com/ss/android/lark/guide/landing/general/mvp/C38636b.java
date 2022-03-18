package com.ss.android.lark.guide.landing.general.mvp;

import android.content.Context;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.mvp.C38639c;
import com.ss.android.lark.guide.landing.general.view.GuidePageItemView;
import java.util.List;

/* renamed from: com.ss.android.lark.guide.landing.general.mvp.b */
public class C38636b extends BasePresenter<C38639c.AbstractC38640a, C38639c.AbstractC38641b, C38639c.AbstractC38641b.AbstractC38642a> {

    /* renamed from: a */
    public Context f99317a = C38548a.m152027a().mo141251b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C38639c.AbstractC38641b.AbstractC38642a createViewDelegate() {
        return new C38638a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.b$a */
    public class C38638a implements C38639c.AbstractC38641b.AbstractC38642a {
        @Override // com.ss.android.lark.guide.landing.general.mvp.C38639c.AbstractC38641b.AbstractC38642a
        /* renamed from: a */
        public void mo141535a() {
            C38548a.m152027a().mo141247a(C38636b.this.f99317a);
        }

        @Override // com.ss.android.lark.guide.landing.general.mvp.C38639c.AbstractC38641b.AbstractC38642a
        /* renamed from: b */
        public void mo141536b() {
            C38548a.m152027a().mo141252b(C38636b.this.f99317a);
        }

        private C38638a() {
        }
    }

    /* renamed from: a */
    public void mo141534a(List<GuidePageItemView.C38647a> list) {
        ((C38639c.AbstractC38641b) getView()).mo141526a(list);
    }

    public C38636b(C38639c.AbstractC38640a aVar, C38639c.AbstractC38641b bVar) {
        super(aVar, bVar);
    }
}
