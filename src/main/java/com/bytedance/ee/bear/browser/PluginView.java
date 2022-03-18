package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.browser.plugin.C4951l;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.log.C13479a;

public class PluginView extends FrameLayout implements LifecycleObserver, AbstractC7664b, AbstractC7666d {

    /* renamed from: a */
    public LifecycleOwner f14455a;

    /* renamed from: b */
    public AbstractC4948i f14456b;

    /* renamed from: c */
    private C4943e.AbstractC4945b f14457c;

    /* renamed from: d */
    private FragmentManager f14458d;

    /* renamed from: e */
    private boolean f14459e;

    /* renamed from: f */
    private C4943e f14460f;

    /* renamed from: g */
    private C4949j f14461g;

    /* renamed from: h */
    private AbstractC4958n f14462h;

    /* renamed from: i */
    private C4917a f14463i;

    public C4943e getPluginHost() {
        return this.f14460f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.browser.PluginView$a */
    public class C4917a implements C4943e.AbstractC4944a {

        /* renamed from: a */
        final /* synthetic */ PluginView f14464a;

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public LifecycleOwner mo19324a() {
            return this.f14464a.f14455a;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: b */
        public AbstractC4948i mo19326b() {
            return this.f14464a.f14456b;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        public FragmentActivity getActivity() {
            return this.f14464a.getFragmentActivity();
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public <T> T mo19325a(Class<T> cls) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ C4943e m20234e() {
        C4943e a = mo19313a();
        this.f14460f = a;
        return a;
    }

    public FragmentActivity getFragmentActivity() {
        return (FragmentActivity) getContext();
    }

    /* renamed from: c */
    private boolean m20232c() {
        if (this.f14459e) {
            return true;
        }
        C13479a.m54775e("PluginView", "Not init yet");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4943e mo19313a() {
        C4943e.AbstractC4945b bVar = this.f14457c;
        if (bVar != null) {
            return bVar.createPluginHost();
        }
        return new C4943e();
    }

    /* renamed from: b */
    private void m20231b() {
        if (!(getContext() instanceof FragmentActivity)) {
            throw new IllegalStateException("Can only used in a FragmentActivity");
        }
    }

    /* access modifiers changed from: protected */
    public AbstractC4958n getUIContainer() {
        if (this.f14462h == null) {
            C13479a.m54759a("PluginView", "", new IllegalStateException("getUIContainer while not created yet !"));
        }
        return this.f14462h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13479a.m54764b("PluginView", "onAttachedToWindow");
        if (m20232c()) {
            m20233d();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        C13479a.m54764b("PluginView", "onBackPressed");
        if (!m20232c() || !this.f14460f.mo19561d()) {
            return false;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C13479a.m54764b("PluginView", "onDestroy");
        if (m20232c()) {
            this.f14461g.mo19577a(this.f14463i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54764b("PluginView", "onDetachedFromWindow");
        if (m20232c()) {
            this.f14461g.mo19582b(this.f14463i, this.f14462h);
            this.f14462h = null;
        }
    }

    /* renamed from: d */
    private void m20233d() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("attachPluginUI created?");
        if (this.f14462h != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("PluginView", sb.toString());
        if (this.f14462h == null) {
            AbstractC4958n a = mo19314a(this);
            this.f14462h = a;
            this.f14461g.mo19579a(this.f14463i, a);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C13479a.m54764b("PluginView", "onCreate");
        if (m20232c()) {
            this.f14461g.mo19576a(new C4943e.AbstractC4945b() {
                /* class com.bytedance.ee.bear.browser.$$Lambda$PluginView$aTbG0QBLQYhqOthITkugErox91A */

                @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
                public final C4943e createPluginHost() {
                    return PluginView.lambda$aTbG0QBLQYhqOthITkugErox91A(PluginView.this);
                }
            }, this.f14463i);
            if (isAttachedToWindow()) {
                m20233d();
            }
        }
    }

    public PluginView(Context context) {
        super(context);
        m20231b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4958n mo19314a(View view) {
        return new C4951l(getContext(), view, this.f14458d, null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m20232c()) {
            this.f14461g.mo19578a(this.f14463i, configuration);
        }
    }

    public PluginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20231b();
    }

    public PluginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20231b();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        C13479a.m54764b("PluginView", "onActivityResult");
        if (m20232c()) {
            this.f14460f.mo19541a(i, i2, intent);
        }
    }
}
