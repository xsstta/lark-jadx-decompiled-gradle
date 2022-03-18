package com.ss.android.lark.setting.page.v2;

import android.app.Activity;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.setting.page.v2.AbstractC54591a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.setting.page.v2.d */
public class C54598d extends BasePresenter<AbstractC54591a.AbstractC54592a, AbstractC54591a.AbstractC54593b, AbstractC54591a.AbstractC54593b.AbstractC54594a> {

    /* renamed from: a */
    private Activity f134923a;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC54591a.AbstractC54593b.AbstractC54594a createViewDelegate() {
        return new AbstractC54591a.AbstractC54593b.AbstractC54594a() {
            /* class com.ss.android.lark.setting.page.v2.C54598d.C545991 */
        };
    }

    /* renamed from: b */
    public void mo186508b() {
        ((AbstractC54591a.AbstractC54593b) getView()).mo186503b();
    }

    /* renamed from: c */
    public void mo186509c() {
        ((AbstractC54591a.AbstractC54593b) getView()).mo186504c();
    }

    /* renamed from: d */
    public void mo186510d() {
        ((AbstractC54591a.AbstractC54593b) getView()).mo186501a();
    }

    /* renamed from: e */
    public void mo186511e() {
        ((AbstractC54591a.AbstractC54593b) getView()).mo186505d();
    }

    public C54598d(Activity activity, AbstractC54591a.AbstractC54592a aVar, AbstractC54591a.AbstractC54593b bVar) {
        super(aVar, bVar);
        this.f134923a = activity;
    }
}
