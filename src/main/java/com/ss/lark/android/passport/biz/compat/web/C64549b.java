package com.ss.lark.android.passport.biz.compat.web;

import android.app.KeyguardManager;
import android.os.Build;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49401o;
import com.ss.lark.android.passport.biz.compat.web.C64554d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.b */
public class C64549b implements AbstractC49401o {

    /* renamed from: a */
    private final C64554d f162950a;

    /* renamed from: b */
    private final AtomicBoolean f162951b = new AtomicBoolean(true);

    /* renamed from: c */
    private boolean f162952c = false;

    /* renamed from: d */
    private boolean f162953d = false;

    /* renamed from: e */
    private C64554d.AbstractC64563a f162954e;

    /* renamed from: f */
    private WebView f162955f;

    /* renamed from: g */
    private boolean f162956g;

    /* renamed from: h */
    private int f162957h;

    /* renamed from: i */
    private final PassportLog f162958i = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public void mo223255a(C64554d.AbstractC64563a aVar) {
        this.f162954e = aVar;
    }

    /* renamed from: a */
    public void mo223256a(boolean z) {
        this.f162951b.set(z);
    }

    public C64549b(C64554d dVar) {
        this.f162950a = dVar;
    }

    /* renamed from: b */
    public void mo223257b(boolean z) {
        this.f162952c = z;
        if (z && this.f162953d) {
            m253631b(this.f162955f, this.f162956g, this.f162957h);
        }
    }

    /* renamed from: b */
    private void m253631b(WebView webView, boolean z, int i) {
        if (webView == null) {
            return;
        }
        if (this.f162952c) {
            this.f162953d = false;
            C64554d.AbstractC64563a aVar = this.f162954e;
            if (aVar == null || !aVar.mo223247a(webView, z, i)) {
                this.f162950a.mo223270b();
            }
            this.f162955f = null;
            return;
        }
        this.f162953d = true;
        this.f162955f = webView;
        this.f162956g = z;
        this.f162957h = i;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49401o
    /* renamed from: a */
    public boolean mo172446a(WebView webView, boolean z, int i) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (z) {
                this.f162958i.mo171471d("RenderProcessGoneHandler", "onRenderProcessGone WebView has been killed - crashed");
            } else {
                this.f162958i.mo171471d("RenderProcessGoneHandler", "onRenderProcessGone WebView has been killed - not crash");
            }
        }
        FragmentActivity activity = this.f162950a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            C49096b.C49097a a = C49096b.m193596i("docs_dev_performance_webview_error").mo171413a("business_channel", "passport");
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            a.mo171413a("didCrash", str).mo171413a("rendererPriorityAtExit", String.valueOf(i)).mo171413a("app_visible", String.valueOf(this.f162952c)).mo171413a("screen_status", String.valueOf(((KeyguardManager) activity.getApplicationContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())).mo171413a("enable_x5", Boolean.valueOf(ServiceFinder.m193752g().isTTWebView())).mo171414a();
            if (!this.f162950a.mo223269a(webView)) {
                this.f162958i.mo171465b("RenderProcessGoneHandler", "onRenderProcessGone WebView can not be removed");
                return true;
            } else if (!this.f162951b.get()) {
                this.f162958i.mo171465b("RenderProcessGoneHandler", "onRenderProcessGone WebView has no webview core");
                this.f162950a.mo223273e();
                return true;
            } else {
                m253631b(webView, z, i);
            }
        }
        return true;
    }
}
