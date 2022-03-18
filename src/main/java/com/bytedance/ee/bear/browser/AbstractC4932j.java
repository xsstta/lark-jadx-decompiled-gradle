package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.browser.plugin.C4951l;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.larksuite.suite.R;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.browser.j */
public abstract class AbstractC4932j extends C7667e implements C4943e.AbstractC4944a, AbstractC7664b {

    /* renamed from: a */
    private C4933k f14489a;

    /* renamed from: b */
    private C4949j f14490b;

    /* renamed from: c */
    private AbstractC4958n f14491c;

    /* renamed from: d */
    private TitleBar f14492d;

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: a */
    public LifecycleOwner mo19324a() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract TitleBar mo19443c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C4933k mo19445e();

    /* renamed from: f */
    public C4933k mo19446f() {
        return this.f14489a;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ C4943e mo22582g() {
        C4933k e = mo19445e();
        this.f14489a = e;
        return e;
    }

    /* renamed from: d */
    public final TitleBar mo19444d() {
        TitleBar titleBar = this.f14492d;
        if (titleBar != null) {
            return titleBar;
        }
        throw new IllegalStateException("getTitleBar before onViewCreated");
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        return this.f14489a.mo19561d();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f14490b.mo19577a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f14490b.mo19582b(this, this.f14491c);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        WebView b;
        super.onResume();
        AbstractC4931i b2 = this.f14489a.mo19448b();
        if (b2 != null && (b = b2.mo19435b()) != null) {
            b.resumeTimers();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14490b.mo19578a(this, configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C4949j jVar = this.f14490b;
        if (jVar != null) {
            jVar.mo19580a(this, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4958n mo19442a(View view) {
        Context context = getContext();
        Objects.requireNonNull(context);
        return new C4951l(context, view, getChildFragmentManager(), mo19444d());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4927f.f14483a = System.currentTimeMillis();
        C4949j a = C4949j.m20465a();
        this.f14490b = a;
        a.mo19576a(new C4943e.AbstractC4945b() {
            /* class com.bytedance.ee.bear.browser.$$Lambda$j$I9jFo2xV_fVJw1jE7D1X1yIcQ */

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
            public final C4943e createPluginHost() {
                return AbstractC4932j.m269136lambda$I9jFo2xV_fVJw1jE7D1X1yIcQ(AbstractC4932j.this);
            }
        }, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14492d = mo19443c();
        AbstractC4958n a = mo19442a(view);
        this.f14491c = a;
        this.f14490b.mo19579a(this, a);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f14489a.mo19541a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.plugin_web_fragment, viewGroup, false);
    }
}
