package com.bytedance.ee.bear.externallink;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.AbstractC4932j;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.C4935m;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.C5630ae;
import com.bytedance.ee.bear.document.C5631af;
import com.bytedance.ee.bear.document.C5632ag;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.SafeReuseDocumentWebV2;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.externallink.b */
public class C7649b extends AbstractC4932j {

    /* renamed from: a */
    public String f20741a;

    /* renamed from: b */
    public String f20742b;

    /* renamed from: c */
    public DocBridgeWebViewV2 f20743c;

    /* renamed from: d */
    public C7652a f20744d;

    /* renamed from: e */
    private SafeReuseDocumentWebV2 f20745e;

    /* renamed from: f */
    private boolean f20746f;

    /* renamed from: g */
    private View f20747g;

    /* renamed from: h */
    private LoadingLayout f20748h;

    /* renamed from: i */
    private C7655d f20749i;

    /* renamed from: j */
    private List<AbstractC7653b> f20750j = new ArrayList();

    /* renamed from: k */
    private LoadingLayout.AbstractC5864a f20751k;

    /* renamed from: l */
    private C4935m f20752l = new C4935m();

    /* renamed from: com.bytedance.ee.bear.externallink.b$b */
    public interface AbstractC7653b {
        /* renamed from: a */
        void mo30041a();

        /* renamed from: a */
        void mo30042a(int i, String str);

        /* renamed from: a */
        boolean mo30043a(String str);

        /* renamed from: b */
        void mo30044b();

        /* renamed from: b */
        void mo30045b(String str);
    }

    /* renamed from: j */
    public String mo30057j() {
        return this.f20741a;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: b */
    public AbstractC4948i mo19326b() {
        return AbstractC7648a.m30632b();
    }

    /* renamed from: i */
    public C7656c mo19446f() {
        return (C7656c) super.mo19446f();
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4932j
    /* renamed from: g */
    public void mo22582g() {
        m30635p();
        this.f20748h.mo23567a();
        this.f20748h.mo23569b();
    }

    /* renamed from: h */
    public void mo30055h() {
        m30635p();
        this.f20748h.mo23570c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.AbstractC4932j
    /* renamed from: c */
    public TitleBar mo19443c() {
        return new C5632ag(new C5632ag.AbstractC5638a() {
            /* class com.bytedance.ee.bear.externallink.C7649b.C76512 */

            /* renamed from: a */
            static final /* synthetic */ boolean f20754a = true;

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: c */
            public LifecycleOwner mo22578c() {
                return C7649b.this;
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: a */
            public View mo22576a() {
                return C7649b.this.getView();
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: d */
            public FragmentActivity mo22579d() {
                return C7649b.this.getActivity();
            }

            @Override // com.bytedance.ee.bear.document.C5632ag.AbstractC5638a
            /* renamed from: b */
            public AppBarLayout mo22577b() {
                View view = C7649b.this.getView();
                if (f20754a || view != null) {
                    return (AppBarLayout) view.findViewById(R.id.doc_appbar_layout);
                }
                throw new AssertionError();
            }
        }, mo19446f().mo24598m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo30058k() {
        C13479a.m54764b("ExternalLinkFragment", "dispatchLoadStart");
        for (AbstractC7653b bVar : this.f20750j) {
            bVar.mo30041a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo30059l() {
        C13479a.m54764b("ExternalLinkFragment", "dispatchLoadSuccess");
        for (AbstractC7653b bVar : this.f20750j) {
            bVar.mo30044b();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroy() {
        super.onDestroy();
        SafeReuseDocumentWebV2 safeReuseDocumentWebV2 = this.f20745e;
        if (safeReuseDocumentWebV2 != null) {
            safeReuseDocumentWebV2.mo22532a(false, Integer.valueOf(hashCode()));
        }
        C4935m mVar = this.f20752l;
        if (mVar != null) {
            mVar.mo19453c();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroyView() {
        super.onDestroyView();
        this.f20743c.mo22337b(this.f20749i);
        this.f20743c.destroy();
        LoadingLayout loadingLayout = this.f20748h;
        if (loadingLayout != null) {
            loadingLayout.setOnRetryListener(null);
        }
        C4935m mVar = this.f20752l;
        if (mVar != null) {
            mVar.mo19452b();
        }
    }

    /* renamed from: o */
    private void m30634o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20741a = arguments.getString("url");
            this.f20742b = arguments.getString("injected_js");
            this.f20746f = arguments.getBoolean("enable_dynamic_inject_js", true);
        }
        C13479a.m54764b("ExternalLinkFragment", "URL :" + C13598b.m55197d(this.f20741a));
    }

    /* renamed from: p */
    private void m30635p() {
        View findViewById = this.f20747g.findViewById(R.id.loading);
        if (findViewById instanceof ViewStub) {
            this.f20748h = (LoadingLayout) ((ViewStub) findViewById).inflate();
        } else {
            this.f20748h = (LoadingLayout) findViewById;
        }
        if (this.f20751k == null) {
            C76501 r0 = new LoadingLayout.AbstractC5864a() {
                /* class com.bytedance.ee.bear.externallink.C7649b.C76501 */

                @Override // com.bytedance.ee.bear.document.loading.LoadingLayout.AbstractC5864a
                public void onFailedRetry(int i) {
                    C7649b.this.f20743c.loadUrl(C7649b.this.f20741a);
                }
            };
            this.f20751k = r0;
            this.f20748h.setOnRetryListener(r0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.AbstractC4932j
    /* renamed from: e */
    public C4933k mo19445e() {
        DocBridgeWebViewV2 docBridgeWebViewV2 = new DocBridgeWebViewV2(getContext(), ar.m20936a(), "VC_External");
        this.f20743c = docBridgeWebViewV2;
        m30633a(docBridgeWebViewV2);
        SafeReuseDocumentWebV2 safeReuseDocumentWebV2 = new SafeReuseDocumentWebV2("VC_External", getLifecycle(), this.f20743c);
        this.f20745e = safeReuseDocumentWebV2;
        safeReuseDocumentWebV2.mo22532a(true, Integer.valueOf(hashCode()));
        this.f20752l = new C4935m();
        this.f20752l.mo19450a(new C5631af(), new C5630ae(this.f20743c), AbstractC7648a.m30632b().mo17013a());
        C7656c cVar = new C7656c(this.f20745e);
        cVar.mo30066a(this);
        cVar.mo24594a((DocViewModel) C4950k.m20479a(cVar, DocViewModel.class, DocViewModel.newFactory(getArguments())));
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.externallink.b$c */
    public class C7654c extends WebChromeClient {
        private C7654c() {
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            C7649b.this.mo30054d(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.externallink.b$d */
    public class C7655d extends WebViewClient {
        private C7655d() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C7649b.this.mo30053c(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (C7649b.this.f20744d != null) {
                C7649b bVar = C7649b.this;
                bVar.mo30050b(bVar.f20744d.f20756a, C7649b.this.f20744d.f20757b);
                C7649b bVar2 = C7649b.this;
                bVar2.mo30047a(-3, bVar2.f20744d.f20757b);
                return;
            }
            C7649b.this.mo30059l();
            if (!TextUtils.isEmpty(C7649b.this.f20742b)) {
                C7649b bVar3 = C7649b.this;
                bVar3.mo30049a(bVar3.f20742b);
                C7649b.this.f20742b = null;
            }
            C7649b.this.mo30055h();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C7649b.this.mo30058k();
            C7649b.this.mo22582g();
            C7649b.this.f20744d = null;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C13479a.m54764b("ExternalLinkFragment", "onReceivedError()... url = " + C13598b.m55197d(str2));
            C7649b.this.f20744d = new C7652a(i, str);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onCreate(Bundle bundle) {
        m30634o();
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
    /* renamed from: a */
    public <T> T mo19325a(Class<T> cls) {
        return (T) ar.m20936a().mo41506a(cls);
    }

    /* renamed from: b */
    public void mo30051b(AbstractC7653b bVar) {
        this.f20750j.remove(bVar);
    }

    /* renamed from: b */
    public void mo30052b(String str) {
        if (this.f20746f) {
            C13479a.m54764b("ExternalLinkFragment", "Js will be injected dynamically.");
            mo30049a(str);
            return;
        }
        C13479a.m54758a("ExternalLinkFragment", "Dynamically injecting js is disabled!");
    }

    /* renamed from: a */
    private void m30633a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        WebSettings settings = docBridgeWebViewV2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        C7655d dVar = new C7655d();
        this.f20749i = dVar;
        docBridgeWebViewV2.mo22323a(dVar);
        docBridgeWebViewV2.setWebChromeClient(new C7654c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo30053c(String str) {
        C13479a.m54764b("ExternalLinkFragment", "dispatchLoadUrl: " + C13598b.m55197d(str));
        for (AbstractC7653b bVar : this.f20750j) {
            if (bVar.mo30043a(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30054d(String str) {
        C13479a.m54764b("ExternalLinkFragment", "dispatchLoadTitle: " + C13598b.m55197d(str));
        for (AbstractC7653b bVar : this.f20750j) {
            bVar.mo30045b(str);
        }
    }

    /* renamed from: a */
    public void mo30048a(AbstractC7653b bVar) {
        if (!this.f20750j.contains(bVar)) {
            this.f20750j.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo30049a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f20743c.mo30811a(String.format("try{window.vcData = {token: '%s'};}catch(e){};%s", this.f20741a, str), true);
            C13479a.m54764b("ExternalLinkFragment", "Js injected.");
            return;
        }
        C13479a.m54758a("ExternalLinkFragment", "Js empty ,not injected!");
    }

    /* renamed from: com.bytedance.ee.bear.externallink.b$a */
    private static class C7652a {

        /* renamed from: a */
        int f20756a;

        /* renamed from: b */
        String f20757b;

        C7652a(int i, String str) {
            this.f20756a = i;
            this.f20757b = str;
        }
    }

    /* renamed from: a */
    public void mo30047a(int i, String str) {
        m30635p();
        this.f20748h.mo23568a(i, str);
        this.f20748h.mo23569b();
    }

    /* renamed from: b */
    public void mo30050b(int i, String str) {
        C13479a.m54758a("ExternalLinkFragment", "dispatchLoadFail:" + str);
        for (AbstractC7653b bVar : this.f20750j) {
            bVar.mo30042a(i, str);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20747g = view;
        ((ViewGroup) view.findViewById(R.id.contentOuterContainer)).addView(this.f20743c, -1, -1);
        this.f20743c.loadUrl(this.f20741a);
        this.f20752l.mo19449a();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.externallinks_fragment, viewGroup, false);
    }
}
