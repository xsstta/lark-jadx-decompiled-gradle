package com.bytedance.ee.bear.document;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.document.tips.TipsWithConfirmView;
import com.bytedance.ee.bear.facade.common.widget.ErrorTipsView;
import com.bytedance.ee.bear.facade.common.widget.NoNetworkView;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.notification.AbstractC10318c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class DocTipsLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f15906a;

    /* renamed from: b */
    private boolean f15907b;

    /* renamed from: c */
    private boolean f15908c;

    /* renamed from: d */
    private boolean f15909d;

    /* renamed from: e */
    private TipsWithConfirmView f15910e;

    /* renamed from: f */
    private NoNetworkView f15911f;

    /* renamed from: g */
    private AbstractC10318c.AbstractC10320b f15912g;

    /* renamed from: h */
    private ErrorTipsView f15913h;

    /* renamed from: i */
    private ViewGroup f15914i;

    public AbstractC10318c.AbstractC10320b getNotificationView() {
        return this.f15912g;
    }

    /* renamed from: a */
    public void mo22420a() {
        this.f15906a = false;
        m22784h();
        mo22429e();
    }

    /* renamed from: b */
    public void mo22425b() {
        this.f15909d = false;
        m22784h();
        mo22429e();
    }

    /* renamed from: c */
    public void mo22427c() {
        this.f15907b = false;
        m22784h();
        mo22429e();
    }

    /* renamed from: d */
    public void mo22428d() {
        this.f15908c = false;
        m22784h();
        this.f15912g.mo39427a();
        mo22429e();
    }

    /* renamed from: f */
    private void m22782f() {
        m22778a(this);
        this.f15906a = true;
        m22778a(this.f15911f);
        m22779a(this.f15913h, this.f15910e, this.f15914i);
    }

    /* renamed from: g */
    private void m22783g() {
        m22778a(this);
        this.f15909d = true;
        m22778a(this.f15913h);
        if (this.f15906a || this.f15907b || this.f15908c) {
            m22780b(this.f15913h);
        }
    }

    /* renamed from: e */
    public void mo22429e() {
        if (!this.f15907b && !this.f15906a && !this.f15908c && !this.f15909d) {
            m22780b(this);
        }
    }

    /* renamed from: h */
    private void m22784h() {
        if (this.f15906a) {
            m22782f();
            return;
        }
        m22780b(this.f15911f);
        if (this.f15907b) {
            m22778a(this.f15910e);
            return;
        }
        m22780b(this.f15910e);
        if (this.f15908c) {
            m22778a(this.f15914i);
            return;
        }
        m22780b(this.f15914i);
        if (this.f15909d) {
            m22778a(this.f15913h);
        } else {
            m22780b(this.f15913h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m22781c(View view) {
        mo22425b();
    }

    /* renamed from: a */
    private void m22778a(View view) {
        view.setVisibility(0);
    }

    /* renamed from: b */
    private void m22780b(View view) {
        view.setVisibility(8);
    }

    public void setNoNetworkTip(String str) {
        this.f15911f.setTip(str);
    }

    public DocTipsLayout(Context context) {
        super(context);
        m22777a(context, null, 0);
    }

    /* renamed from: a */
    private void m22779a(View... viewArr) {
        if (viewArr.length != 0) {
            for (View view : viewArr) {
                m22780b(view);
            }
        }
    }

    /* renamed from: a */
    public void mo22421a(String str) {
        setNoNetworkTip(str);
        m22782f();
    }

    public DocTipsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22777a(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo22422a(String str, AbstractC7947h hVar) {
        m22778a(this);
        this.f15907b = true;
        m22778a(this.f15910e);
        m22779a(this.f15913h, this.f15914i);
        this.f15910e.mo24931a(str, hVar);
        if (this.f15906a) {
            m22780b(this.f15910e);
        }
    }

    /* renamed from: a */
    public void mo22423a(String str, String str2) {
        m22778a(this);
        this.f15908c = true;
        m22778a(this.f15914i);
        m22780b(this.f15913h);
        this.f15912g.mo39430a(str, str2);
        if (this.f15906a || this.f15907b) {
            m22780b(this.f15914i);
        }
    }

    public DocTipsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22777a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m22777a(Context context, AttributeSet attributeSet, int i) {
        inflate(context, R.layout.doc_main_tips_layout, this);
        this.f15910e = (TipsWithConfirmView) findViewById(R.id.at_notify_tips);
        this.f15911f = (NoNetworkView) findViewById(R.id.doc_main_no_network_tip_banner);
        this.f15914i = (ViewGroup) findViewById(R.id.doc_main_notification_container);
        AbstractC10318c.AbstractC10320b a = ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39422a();
        this.f15912g = a;
        this.f15914i.addView(a.mo39426a(context));
        ErrorTipsView errorTipsView = (ErrorTipsView) findViewById(R.id.error_tips);
        this.f15913h = errorTipsView;
        errorTipsView.setIconButtonListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocTipsLayout$t9TDvbf8FfYLqt3rnhI1mO3KM9A */

            public final void onClick(View view) {
                DocTipsLayout.lambda$t9TDvbf8FfYLqt3rnhI1mO3KM9A(DocTipsLayout.this, view);
            }
        });
    }

    /* renamed from: b */
    public void mo22426b(String str, String str2, String str3, boolean z, String str4, String str5, ErrorTipsView.TipsType tipsType, ErrorTipsView.AbstractC7725a aVar) {
        this.f15913h.mo30225a(str, str2, str3, z, str4, str5, tipsType, aVar);
    }

    /* renamed from: a */
    public void mo22424a(String str, String str2, String str3, boolean z, String str4, String str5, ErrorTipsView.TipsType tipsType, ErrorTipsView.AbstractC7725a aVar) {
        mo22426b(str, str2, str3, z, str4, str5, tipsType, aVar);
        m22783g();
    }
}
