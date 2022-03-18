package com.bytedance.ee.bear.drive.core.p348b;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.C4951l;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.common.DriveViewUtils;
import com.bytedance.ee.bear.drive.config.DriveConfigs;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.p363b.C7209a;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.core.b.a */
public abstract class AbstractC6939a extends C7667e implements C4943e.AbstractC4944a, AbstractC7664b {

    /* renamed from: a */
    protected boolean f18733a;

    /* renamed from: b */
    protected boolean f18734b;

    /* renamed from: c */
    protected boolean f18735c;

    /* renamed from: d */
    protected String f18736d;

    /* renamed from: e */
    private DrivePluginHost f18737e;

    /* renamed from: f */
    private C4949j f18738f;

    /* renamed from: g */
    private AbstractC4958n f18739g;

    /* renamed from: h */
    private TitleBar f18740h;

    /* renamed from: i */
    private DriveConfigs f18741i = new DriveConfigs();

    /* renamed from: j */
    private ViewGroup f18742j;

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: a */
    public LifecycleOwner mo19324a() {
        return this;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: b */
    public AbstractC4948i mo19326b() {
        return this.f18741i;
    }

    /* renamed from: d */
    public DrivePluginHost mo27286d() {
        return this.f18737e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo27289g() {
        return this.f18735c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27288f() {
        TitleBar titleBar;
        ViewGroup viewGroup = this.f18742j;
        if (viewGroup != null && (titleBar = this.f18740h) != null) {
            viewGroup.removeView(titleBar.mo19508a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean getUserVisibleHint() {
        try {
            return super.getUserVisibleHint();
        } catch (Exception e) {
            C13479a.m54761a("AbsDrivePreviewFragment", e);
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        return this.f18737e.mo19561d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m27477a("onPause");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m27477a("onResume");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m27477a("onStart");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m27477a("onStop");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo27287e() {
        TitleBar titleBar;
        if (this.f18742j != null && (titleBar = this.f18740h) != null && titleBar.mo19508a().getParent() == null) {
            this.f18742j.addView(this.f18740h.mo19508a());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f18738f.mo19577a(this);
        this.f18734b = false;
        m27477a("onDestroy");
    }

    /* renamed from: h */
    private TitleBar mo27295h() {
        if (this.f18740h == null) {
            final BaseTitleBar baseTitleBar = new BaseTitleBar(requireContext());
            baseTitleBar.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.drive_main_page_title_bar_height)));
            this.f18740h = new C7209a(new C7209a.AbstractC7215a() {
                /* class com.bytedance.ee.bear.drive.core.p348b.AbstractC6939a.C69401 */

                @Override // com.bytedance.ee.bear.drive.view.p363b.C7209a.AbstractC7215a
                /* renamed from: a */
                public BaseTitleBar mo27290a() {
                    return baseTitleBar;
                }

                @Override // com.bytedance.ee.bear.drive.view.p363b.C7209a.AbstractC7215a
                /* renamed from: b */
                public FragmentActivity mo27291b() {
                    return AbstractC6939a.this.requireActivity();
                }
            });
        }
        return this.f18740h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public DrivePluginHost mo27285c() {
        DrivePluginHost aVar = new DrivePluginHost(this);
        aVar.mo27259a((C6937b) C4950k.m20479a(aVar, C6937b.class, C6937b.newFactory(getArguments())));
        aVar.mo27260a(this.f18741i.mo27179a(aVar));
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m27477a("onDestroyView");
        this.f18738f.mo19582b(this, this.f18739g);
        if (mo27289g()) {
            m27477a("### onDetachData in onDestroyView", String.valueOf(getUserVisibleHint()));
            mo27288f();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: a */
    public <T> T mo19325a(Class<T> cls) {
        return (T) ar.m20937a(cls);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m27477a("onActivityCreated");
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18738f.mo19578a(this, configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m27477a("onSaveInstanceState");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        m27477a("onViewStateRestored");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m27477a("onCreate");
        C4949j a = C4949j.m20465a();
        this.f18738f = a;
        this.f18737e = (DrivePluginHost) a.mo19576a(new C4943e.AbstractC4945b() {
            /* class com.bytedance.ee.bear.drive.core.p348b.$$Lambda$lrq94iXTZBKDSEovv8jL4C046Ws */

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
            public final C4943e createPluginHost() {
                return AbstractC6939a.this.mo27285c();
            }
        }, this);
    }

    /* renamed from: a */
    private void m27477a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(" ");
            sb.append(str);
        }
        if (TextUtils.isEmpty(this.f18736d)) {
            this.f18736d = "";
        }
        C13479a.m54764b("AbsDrivePreviewFragment", hashCode() + "-" + this.f18736d.concat(sb.toString()));
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C4949j jVar = this.f18738f;
        if (jVar != null) {
            jVar.mo19580a(this, z);
        }
        if (getUserVisibleHint()) {
            this.f18733a = true;
            if (this.f18734b && !this.f18735c) {
                this.f18735c = true;
                m27477a("### onAttachData", String.valueOf(z));
                mo27287e();
                return;
            }
            return;
        }
        this.f18733a = false;
        if (this.f18734b && this.f18735c) {
            this.f18735c = false;
            m27477a("### onDetachData", String.valueOf(getUserVisibleHint()));
            mo27288f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m27477a("onViewCreated");
        this.f18742j = (ViewGroup) DriveViewUtils.m27255a(R.id.drive_sdk_main_title_bar_root_fl, this);
        C4951l lVar = new C4951l(requireContext(), view, getChildFragmentManager(), mo27295h());
        this.f18739g = lVar;
        this.f18738f.mo19579a(this, lVar);
        this.f18734b = true;
        if (!this.f18735c && this.f18733a) {
            this.f18735c = true;
            m27477a("### onViewCreated onAttachData", String.valueOf(getUserVisibleHint()));
            mo27287e();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f18737e.mo19541a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.drive_preview_fragment, viewGroup, false);
    }
}
