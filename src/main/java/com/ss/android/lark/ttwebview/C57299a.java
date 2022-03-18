package com.ss.android.lark.ttwebview;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy;
import com.ss.android.lark.ttwebview.p2847a.AbstractC57300a;
import com.ss.android.lark.ttwebview.p2848b.p2849a.C57301a;
import com.ss.android.lark.ttwebview.p2850c.AbstractC57302a;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.ttwebview.a */
public class C57299a {

    /* renamed from: a */
    private static volatile AbstractC57300a f141162a;

    /* renamed from: b */
    private C57301a f141163b = new C57301a();

    /* renamed from: e */
    public boolean mo194415e() {
        return true;
    }

    /* renamed from: a */
    public static AbstractC57300a m222017a() {
        return f141162a;
    }

    /* renamed from: b */
    public boolean mo194410b() {
        return this.f141163b.mo194421a();
    }

    /* renamed from: c */
    public String mo194411c() {
        if (!m222017a().mo177703b()) {
            return this.f141163b.mo194422b();
        }
        TTWebViewApiProxy tTWebViewApiProxy = (TTWebViewApiProxy) C68183b.m264839a().mo237086a(m222017a().mo177702a(), TTWebViewApiProxy.class);
        if (tTWebViewApiProxy == null) {
            return this.f141163b.mo194422b();
        }
        return tTWebViewApiProxy.getLocalSoVersion();
    }

    /* renamed from: d */
    public String mo194413d() {
        if (!m222017a().mo177703b()) {
            return this.f141163b.mo194424c();
        }
        TTWebViewApiProxy tTWebViewApiProxy = (TTWebViewApiProxy) C68183b.m264839a().mo237086a(m222017a().mo177702a(), TTWebViewApiProxy.class);
        if (tTWebViewApiProxy == null) {
            return this.f141163b.mo194424c();
        }
        return tTWebViewApiProxy.getLoadSoVersion();
    }

    /* renamed from: a */
    public void mo194404a(Context context) {
        this.f141163b.mo194416a(context);
    }

    /* renamed from: b */
    public void mo194409b(Context context) {
        this.f141163b.mo194423b(context);
    }

    /* renamed from: d */
    public void mo194414d(Context context) {
        this.f141163b.mo194425c(context);
    }

    public C57299a(AbstractC57300a aVar) {
        f141162a = aVar;
    }

    /* renamed from: c */
    public boolean mo194412c(Context context) {
        String c = C26252ad.m94994c(context);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        return c.contains("sandboxed_process");
    }

    /* renamed from: a */
    public void mo194407a(AbstractC57302a aVar) {
        this.f141163b.mo194419a(aVar);
    }

    /* renamed from: a */
    public void mo194408a(boolean z) {
        if (m222017a().mo177703b()) {
            TTWebViewApiProxy tTWebViewApiProxy = (TTWebViewApiProxy) C68183b.m264839a().mo237086a(m222017a().mo177702a(), TTWebViewApiProxy.class);
            if (tTWebViewApiProxy != null) {
                tTWebViewApiProxy.fetchWebViewCore(z);
                return;
            }
            return;
        }
        this.f141163b.mo194420a(z);
    }

    /* renamed from: a */
    public void mo194405a(Context context, String str) {
        this.f141163b.mo194417a(context, str);
    }

    /* renamed from: a */
    public void mo194406a(WebView webView, String str) {
        this.f141163b.mo194418a(webView, str);
    }
}
