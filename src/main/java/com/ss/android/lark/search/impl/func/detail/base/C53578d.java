package com.ss.android.lark.search.impl.func.detail.base;

import android.app.Activity;
import butterknife.ButterKnife;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.d */
public class C53578d implements BaseSearchView.AbstractC53568a {

    /* renamed from: a */
    protected Activity f132347a;

    /* renamed from: b */
    protected ISearchModuleDependency.AbstractC53317e f132348b = C53258a.m205939a().mo181756f();

    @Override // com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.AbstractC53568a
    /* renamed from: a */
    public void mo182830a() {
        this.f132347a.finish();
    }

    public C53578d(Activity activity) {
        this.f132347a = activity;
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.AbstractC53568a
    /* renamed from: a */
    public void mo182831a(BaseSearchView baseSearchView) {
        ButterKnife.bind(baseSearchView, this.f132347a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182877a(String str) {
        C53258a.m205939a().mo181751c(this.f132347a, str);
    }
}
