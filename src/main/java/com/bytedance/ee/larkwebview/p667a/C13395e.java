package com.bytedance.ee.larkwebview.p667a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import com.bytedance.ee.larkwebview.base.BaseWebView;
import com.bytedance.ee.larkwebview.p667a.C13390c;
import com.ss.android.lark.utils.C57824f;
import java.util.Locale;

/* renamed from: com.bytedance.ee.larkwebview.a.e */
public class C13395e {

    /* renamed from: a */
    public boolean f35308a = true;

    /* renamed from: b */
    public String f35309b;

    /* renamed from: c */
    public boolean f35310c;

    /* renamed from: com.bytedance.ee.larkwebview.a.e$a */
    public static class C13396a extends AbstractC13387a {

        /* renamed from: a */
        private C13395e f35311a = new C13395e();

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.larkwebview.p667a.AbstractC13387a
        /* renamed from: a */
        public void mo49691a(Context context) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13395e mo49702a() {
            return this.f35311a;
        }

        public C13396a(C13390c.C13392a aVar) {
            super(aVar);
        }
    }

    /* renamed from: a */
    public void mo49701a(BaseWebView baseWebView) {
        if (baseWebView != null) {
            WebSettings settings = baseWebView.getSettings();
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDisplayZoomControls(false);
            settings.setBuiltInZoomControls(true);
            settings.setAllowFileAccess(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(baseWebView, true);
            settings.setSupportZoom(true);
            settings.setJavaScriptEnabled(this.f35308a);
            settings.setSupportMultipleWindows(this.f35310c);
            if (TextUtils.isEmpty(this.f35309b)) {
                settings.setUserAgentString(C57824f.m224460a(baseWebView.getContext(), settings.getUserAgentString(), Locale.getDefault()));
                return;
            }
            settings.setUserAgentString(this.f35309b);
        }
    }
}
