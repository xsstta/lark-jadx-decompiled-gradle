package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.browser.plugin.C4951l;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.browser.e */
public abstract class AbstractC4926e<Host extends C4943e> extends C7667e implements C4943e.AbstractC4944a, AbstractC7664b {

    /* renamed from: a */
    static final /* synthetic */ boolean f14478a = true;

    /* renamed from: b */
    private Host f14479b;

    /* renamed from: c */
    private C4949j f14480c;

    /* renamed from: d */
    private AbstractC4958n f14481d;

    /* renamed from: e */
    private TitleBar f14482e;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Host mo19418c();

    /* access modifiers changed from: protected */
    public abstract TitleBar l_();

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ C4943e m20298d() {
        Host c = mo19418c();
        this.f14479b = c;
        return c;
    }

    public final TitleBar m_() {
        TitleBar titleBar = this.f14482e;
        if (titleBar != null) {
            return titleBar;
        }
        throw new IllegalStateException("getTitleBar before onViewCreated");
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return f14478a;
        }
        return this.f14479b.mo19561d();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f14480c.mo19577a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f14480c.mo19582b(this, this.f14481d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14480c.mo19578a(this, configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C4949j jVar = this.f14480c;
        if (jVar != null) {
            jVar.mo19580a(this, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4958n mo19417a(View view) {
        Context context = getContext();
        if (f14478a || context != null) {
            return new C4951l(context, view, getChildFragmentManager(), m_());
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4949j a = C4949j.m20465a();
        this.f14480c = a;
        a.mo19576a(new C4943e.AbstractC4945b() {
            /* class com.bytedance.ee.bear.browser.$$Lambda$e$qzqSmVn_PNXyRpNgQY5TeKPMvIY */

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
            public final C4943e createPluginHost() {
                return AbstractC4926e.lambda$qzqSmVn_PNXyRpNgQY5TeKPMvIY(AbstractC4926e.this);
            }
        }, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14482e = l_();
        AbstractC4958n a = mo19417a(view);
        this.f14481d = a;
        this.f14480c.mo19579a(this, a);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f14479b.mo19541a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.plugin_fragment, viewGroup, false);
    }
}
