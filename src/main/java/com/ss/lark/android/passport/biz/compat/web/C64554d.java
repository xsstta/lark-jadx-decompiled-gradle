package com.ss.lark.android.passport.biz.compat.web;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.jsbridge.BridgeWebView;
import com.ss.android.lark.jsbridge.C40667c;
import com.ss.android.lark.jsbridge.C40668d;
import com.ss.android.lark.passport.infra.base.statistics.LoginHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49153af;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49156ah;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49218u;
import com.ss.android.lark.passport.infra.util.aj;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64564a;
import com.ss.lark.android.passport.biz.compat.web.jsbridge.AbstractC64569d;
import com.ss.lark.android.passport.biz.compat.web.p3214a.C64548a;
import com.ss.lark.android.passport.biz.compat.web.p3215b.AbstractC64550a;
import com.ss.lark.android.passport.biz.compat.web.p3215b.C64551b;
import com.ss.lark.android.passport.biz.compat.web.p3215b.C64552c;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.d */
public class C64554d extends Fragment {

    /* renamed from: a */
    public BridgeWebView f162965a;

    /* renamed from: b */
    public long f162966b;

    /* renamed from: c */
    public final C64553c f162967c = new C64553c();

    /* renamed from: d */
    public final C64552c f162968d = new C64552c(new AbstractC64550a[0]);

    /* renamed from: e */
    public final PassportLog f162969e = PassportLog.f123351c.mo171474a();

    /* renamed from: f */
    public CommonTitleBar f162970f;

    /* renamed from: g */
    ProgressBar f162971g;

    /* renamed from: h */
    View f162972h;

    /* renamed from: i */
    public final C64549b f162973i = new C64549b(this);

    /* renamed from: j */
    private boolean f162974j = true;

    /* renamed from: k */
    private boolean f162975k;

    /* renamed from: l */
    private FrameLayout f162976l;

    /* renamed from: m */
    private boolean f162977m = true;

    /* renamed from: n */
    private boolean f162978n = false;

    /* renamed from: o */
    private boolean f162979o = false;

    /* renamed from: p */
    private String f162980p;

    /* renamed from: q */
    private String f162981q;

    /* renamed from: r */
    private View f162982r;

    /* renamed from: s */
    private final View.OnClickListener f162983s = new View.OnClickListener() {
        /* class com.ss.lark.android.passport.biz.compat.web.C64554d.View$OnClickListenerC645615 */

        public void onClick(View view) {
            C64554d.this.mo223272d();
            if (C64554d.this.mo223271c()) {
                C64554d.this.f162965a.goBack();
            } else {
                C64554d.this.mo223273e();
            }
        }
    };

    /* renamed from: t */
    private final View.OnClickListener f162984t = new View.OnClickListener() {
        /* class com.ss.lark.android.passport.biz.compat.web.C64554d.View$OnClickListenerC645626 */

        public void onClick(View view) {
            C64554d.this.mo223272d();
            C64554d.this.mo223273e();
        }
    };

    /* renamed from: com.ss.lark.android.passport.biz.compat.web.d$a */
    public interface AbstractC64563a {
        /* renamed from: a */
        boolean mo223247a(WebView webView, boolean z, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo223270b() {
        m253647k();
        m253648l();
    }

    /* renamed from: d */
    public void mo223272d() {
        if (mo223274f()) {
            C49203q.m193973a((Context) getActivity());
        }
    }

    /* renamed from: f */
    public boolean mo223274f() {
        if (!isAdded() || getActivity() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo223275g() {
        if (!mo223271c()) {
            return false;
        }
        this.f162965a.goBack();
        return true;
    }

    /* renamed from: i */
    public void mo223277i() {
        View view = this.f162972h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C64548a.m253629a((WebView) this.f162965a);
        this.f162965a = null;
        super.onDestroyView();
    }

    /* renamed from: l */
    private void m253648l() {
        if (mo223274f()) {
            m253645a(getActivity());
            mo223276h();
        }
    }

    /* renamed from: n */
    private void m253650n() {
        BridgeWebView bridgeWebView;
        if (mo223274f() && (bridgeWebView = this.f162965a) != null) {
            bridgeWebView.getSettings().setUserAgentString(ServiceFinder.m193752g().getUserAgent());
        }
    }

    /* renamed from: c */
    public boolean mo223271c() {
        BridgeWebView bridgeWebView;
        if (mo223274f() && this.f162975k && (bridgeWebView = this.f162965a) != null && bridgeWebView.canGoBack()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo223273e() {
        if (isAdded() && getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        BridgeWebView bridgeWebView = this.f162965a;
        if (bridgeWebView != null) {
            bridgeWebView.onPause();
            this.f162965a.pauseTimers();
        }
        C64549b bVar = this.f162973i;
        if (bVar != null) {
            bVar.mo223257b(false);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BridgeWebView bridgeWebView = this.f162965a;
        if (bridgeWebView != null) {
            bridgeWebView.onResume();
            this.f162965a.resumeTimers();
        }
        C64549b bVar = this.f162973i;
        if (bVar != null) {
            bVar.mo223257b(true);
        }
    }

    /* renamed from: k */
    private void m253647k() {
        ProgressBar progressBar = this.f162971g;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.f162971g.setVisibility(8);
        }
        BridgeWebView bridgeWebView = this.f162965a;
        if (bridgeWebView != null) {
            C64548a.m253629a((WebView) bridgeWebView);
            this.f162965a = null;
        }
        View view = this.f162972h;
        if (view != null && view.getVisibility() == 0) {
            this.f162972h.setVisibility(8);
        }
    }

    /* renamed from: m */
    private void m253649m() {
        List<AbstractC64564a> c;
        FragmentActivity activity = getActivity();
        if ((activity instanceof AbstractC64569d) && (c = ((AbstractC64569d) activity).mo170970c()) != null) {
            for (AbstractC64564a aVar : c) {
                this.f162965a.mo146766a(aVar.mo223288a(), aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo223264a() {
        if (mo223274f() && this.f162965a != null) {
            ProgressBar progressBar = this.f162971g;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.f162972h.setVisibility(8);
            m253650n();
            this.f162965a.reload();
        }
    }

    /* renamed from: o */
    private void m253651o() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LKUIToast.show(C64340b.m252955a().mo222860b(), (int) R.string.Lark_Login_WebUrlLoadTip);
            return;
        }
        this.f162980p = arguments.getString("url", "");
        this.f162981q = arguments.getString("user_agent", "");
        this.f162974j = arguments.getBoolean("initback", true);
        this.f162975k = arguments.getBoolean("can_go_back", false);
        this.f162979o = arguments.getBoolean("enable_progressbar", false);
    }

    /* renamed from: h */
    public void mo223276h() {
        ProgressBar progressBar;
        if (!aj.m193849a(this.f162980p)) {
            PassportLog passportLog = this.f162969e;
            passportLog.mo171465b("WebViewFragment", "url isValidSchema: " + C64548a.m253630b(this.f162980p));
            this.f162980p = "http://" + this.f162980p;
        }
        if (this.f162979o && (progressBar = this.f162971g) != null) {
            progressBar.setVisibility(0);
        }
        String a = C64548a.m253627a(this.f162980p);
        BridgeWebView bridgeWebView = this.f162965a;
        if (bridgeWebView == null) {
            return;
        }
        if (TextUtils.isEmpty(bridgeWebView.getUrl())) {
            this.f162965a.loadUrl(a);
        } else {
            mo223264a();
        }
    }

    /* renamed from: j */
    private void m253646j() {
        this.f162965a = new BridgeWebView(getContext());
        if (!TextUtils.isEmpty(this.f162981q)) {
            this.f162965a.getSettings().setUserAgentString(this.f162981q);
        }
        this.f162976l.addView(this.f162965a, -1, -1);
        PassportLog passportLog = this.f162969e;
        passportLog.mo171465b("WebViewFragment", "url=" + C64548a.m253630b(this.f162980p));
        this.f162965a.setWebChromeClient(new C40667c(this.f162965a) {
            /* class com.ss.lark.android.passport.biz.compat.web.C64554d.C645573 */

            @Override // com.ss.android.lark.jsbridge.C40667c
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (C64554d.this.f162971g != null) {
                    C64554d.this.f162971g.setProgress(i);
                }
                if (i > 50 && webView != null && webView.getVisibility() != 0) {
                    webView.setVisibility(0);
                }
            }
        });
        this.f162966b = SystemClock.elapsedRealtime();
        if (Build.VERSION.SDK_INT < 26) {
            ServiceFinder.m193752g().setWebViewRenderGoneListener(this.f162965a, this.f162973i);
        }
        this.f162965a.setWebViewClient(new C40668d(this.f162965a) {
            /* class com.ss.lark.android.passport.biz.compat.web.C64554d.C645584 */

            @Override // com.ss.android.lark.jsbridge.C40668d, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (C64554d.this.f162967c.mo223263a(webView.getContext(), str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                boolean z;
                if (C64554d.this.f162973i != null) {
                    C64549b bVar = C64554d.this.f162973i;
                    int i = 0;
                    if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (renderProcessGoneDetail != null) {
                        i = renderProcessGoneDetail.rendererPriorityAtExit();
                    }
                    bVar.mo172446a(webView, z, i);
                }
                return true;
            }

            @Override // com.ss.android.lark.jsbridge.C40668d
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (C64554d.this.f162971g != null) {
                    C64554d.this.f162971g.setVisibility(8);
                }
                C64554d.this.f162965a.setVisibility(0);
                PassportLog passportLog = C64554d.this.f162969e;
                passportLog.mo171465b("WebViewFragment", "H5 load finished url=" + C64548a.m253630b(str));
                if (C64554d.this.f162966b > 0) {
                    LoginHitPoint.f123304a.mo171396a(str, Long.valueOf(SystemClock.elapsedRealtime() - C64554d.this.f162966b));
                    C64554d.this.f162966b = 0;
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (C64554d.this.f162971g != null) {
                    C64554d.this.f162971g.setVisibility(0);
                }
                PassportLog passportLog = C64554d.this.f162969e;
                passportLog.mo171465b("WebViewFragment", "H5 load start url=" + C64548a.m253630b(str));
                C64554d.this.f162968d.mo223261a(str);
            }

            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                C64554d dVar = C64554d.this;
                dVar.mo223266a("" + webResourceRequest.getUrl(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
            }

            public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
                UDDialogBuilder eVar = new UDDialogBuilder(webView.getContext());
                eVar.title(C49154ag.m193830a(C64554d.this.getContext(), (int) R.string.Lark_Security_linkSecurityAlert));
                eVar.message(C49153af.m193827a(C49154ag.m193830a(C64554d.this.getContext(), (int) R.string.Lark_Security_linkSecurityAlertDescription), "url", webView.getUrl(), C64554d.this.f162969e));
                eVar.cancelOnTouchOutside(false);
                eVar.addActionButton(R.id.ud_dialog_btn_primary, C49154ag.m193830a(C64554d.this.getContext(), (int) R.string.Lark_Security_linkSecurityAlertContinue), new DialogInterface.OnClickListener() {
                    /* class com.ss.lark.android.passport.biz.compat.web.C64554d.C645584.DialogInterface$OnClickListenerC645591 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        sslErrorHandler.proceed();
                    }
                });
                eVar.addActionButton(R.id.ud_dialog_btn_secondary, C49154ag.m193830a(C64554d.this.getContext(), (int) R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
                    /* class com.ss.lark.android.passport.biz.compat.web.C64554d.C645584.DialogInterface$OnClickListenerC645602 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        sslErrorHandler.cancel();
                    }
                });
                eVar.show();
                C64554d.this.mo223266a(webView.getUrl(), sslError.getPrimaryError(), sslError.toString());
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (C64554d.this.f162971g != null) {
                    C64554d.this.f162971g.setVisibility(8);
                }
                C64554d.this.mo223277i();
                C64554d.this.mo223266a(str2, i, str);
            }
        });
        m253649m();
        WebSettings settings = this.f162965a.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptEnabled(true);
        m253650n();
    }

    /* renamed from: a */
    public void mo223265a(AbstractC64563a aVar) {
        C64549b bVar = this.f162973i;
        if (bVar != null) {
            bVar.mo223255a(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m253651o();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C64549b bVar = this.f162973i;
        if (bVar != null) {
            bVar.mo223257b(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo223269a(WebView webView) {
        if (webView != null && webView == this.f162965a && webView.getParent() == this.f162976l) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private View m253645a(Context context) {
        if (this.f162982r == null) {
            return null;
        }
        this.f162970f.mo171755a(this.f162977m, this.f162978n);
        this.f162970f.setTitleClickListener(new CommonTitleBar.AbstractC49239c() {
            /* class com.ss.lark.android.passport.biz.compat.web.C64554d.C645551 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                if (C64554d.this.mo223274f()) {
                    FragmentActivity activity = C64554d.this.getActivity();
                    if (activity instanceof AbstractC64547a) {
                        ((AbstractC64547a) activity).onLeftBtnClick(C64554d.this.f162970f);
                    } else {
                        C64554d.this.getActivity().finish();
                    }
                }
            }
        });
        this.f162972h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.web.C64554d.View$OnClickListenerC645562 */

            public void onClick(View view) {
                C64554d.this.mo223276h();
            }
        });
        try {
            CookieSyncManager.createInstance(context);
            m253646j();
            this.f162973i.mo223256a(true);
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT > 25 && mo223274f()) {
                this.f162973i.mo223256a(false);
                String string = context.getString(R.string.Lark_Login_EnableChrome);
                if (this.f162974j) {
                    LKUIToast.show(C64340b.m252955a().mo222860b(), string, 3500);
                    mo223273e();
                } else {
                    TextView textView = new TextView(getActivity());
                    textView.setGravity(17);
                    textView.setText(string);
                    textView.setTextColor(C49154ag.m193840c(context, R.color.text_title));
                    textView.setBackgroundColor(C49154ag.m193840c(context, R.color.bg_body));
                    return textView;
                }
            }
        }
        return this.f162982r;
    }

    /* renamed from: a */
    public void mo223268a(boolean z, boolean z2) {
        this.f162977m = z;
        this.f162978n = z2;
        CommonTitleBar commonTitleBar = this.f162970f;
        if (commonTitleBar != null) {
            commonTitleBar.mo171755a(z, z2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f162982r == null || TextUtils.isEmpty(this.f162980p)) {
            return;
        }
        if (C49156ah.m193843a(this.f162980p)) {
            C49218u.m194041a(view.getContext(), this.f162980p, this.f162969e);
        } else {
            mo223276h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo223267a(String str, Object obj) {
        BridgeWebView bridgeWebView = this.f162965a;
        if (bridgeWebView == null) {
            return;
        }
        if (obj == null) {
            bridgeWebView.loadUrl(String.format(Locale.ENGLISH, "javascript:(window.%s && window.%s())", str, str));
        } else if (obj instanceof Integer) {
            bridgeWebView.loadUrl(String.format(Locale.ENGLISH, "javascript:(window.%s && window.%s(%d))", str, str, obj));
        } else if (obj instanceof String) {
            bridgeWebView.loadUrl(String.format(Locale.ENGLISH, "javascript:(window.%s && window.%s(%s))", str, str, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
        }
    }

    /* renamed from: a */
    public void mo223266a(String str, int i, String str2) {
        this.f162969e.mo171471d("WebViewFragment", "h5 error: failUrl=" + C64548a.m253630b(str) + "; code=" + i + "; msg=" + str2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.signin_sdk_web_fragment, viewGroup, false);
        this.f162982r = inflate;
        this.f162970f = (CommonTitleBar) inflate.findViewById(R.id.login_web_titlebar);
        if (this.f162979o) {
            this.f162971g = (ProgressBar) this.f162982r.findViewById(R.id.log_web_progressbar);
        }
        this.f162972h = this.f162982r.findViewById(R.id.error_page);
        this.f162976l = (FrameLayout) this.f162982r.findViewById(R.id.webview_container);
        this.f162968d.mo223262a(new C64551b(this.f162970f));
        return m253645a(context);
    }
}
