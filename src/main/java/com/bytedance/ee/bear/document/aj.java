package com.bytedance.ee.bear.document;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.AbstractC4932j;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoAbilityImp;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider;
import com.bytedance.ee.bear.document.feed.C5797a;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public abstract class aj extends AbstractC4932j {

    /* renamed from: d */
    static final /* synthetic */ boolean f15973d = true;

    /* renamed from: a */
    public final String f15974a = ("WebViewFragment#" + Integer.toHexString(hashCode()));

    /* renamed from: b */
    protected DocBridgeWebViewV2 f15975b;

    /* renamed from: c */
    protected AbstractC5625aa f15976c;

    /* renamed from: e */
    private DocReport f15977e;

    /* renamed from: f */
    private AbstractC5233x f15978f;

    /* renamed from: i */
    public AbstractC5625aa mo22584i() {
        return this.f15976c;
    }

    /* renamed from: h */
    public C6095s mo19446f() {
        return (C6095s) super.mo19446f();
    }

    /* renamed from: l */
    private String mo43519l() {
        return mo22586k().getUrl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C13479a.m54764b(this.f15974a, "onDetach");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C13479a.m54764b(this.f15974a, "onStart");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C13479a.m54764b(this.f15974a, "onStop");
    }

    /* renamed from: j */
    public void mo22585j() {
        WebView webView;
        AbstractC5625aa aaVar = this.f15976c;
        if (aaVar != null && (webView = aaVar.getWebView()) != null) {
            webView.flingScroll(0, 0);
            webView.scrollTo(0, 0);
            C5234y.m21391b().mo21079a("document_scroll_to_top", new HashMap());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public DocViewModel mo22586k() {
        if (mo19446f() == null) {
            return null;
        }
        return mo19446f().mo24598m();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroy() {
        C13479a.m54764b(this.f15974a, "onDestroy");
        super.onDestroy();
        mo19446f().mo24600o().mo23800c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mo19446f().mo24600o().mo23798b();
        C13479a.m54764b(this.f15974a, "onPause()...");
    }

    /* renamed from: p */
    private void mo43521p() {
        C13479a.m54764b(this.f15974a, "load");
        this.f15977e = new DocReport(C5084ad.m20847d(), this.f15978f, C4511g.m18594d(), C5102ai.m20872j(), C4511g.m18594d().mo17367q());
        mo19446f().mo24600o().mo23795a();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onDestroyView() {
        C13479a.m54764b(this.f15974a, "onDestroyView");
        if (mo19446f().mo24600o() instanceof C6057p) {
            ((C6057p) mo19446f().mo24600o()).mo24478b(this.f15976c);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onResume() {
        super.onResume();
        this.f15976c.mo22550b();
        boolean a = this.f15976c.mo22549a();
        String str = this.f15974a;
        C13479a.m54764b(str, "onResume webview attached?" + a);
        if (!a) {
            mo43521p();
        }
    }

    /* renamed from: o */
    private void mo43520o() {
        C13479a.m54764b(this.f15974a, "autoShowFeed");
        String l = mo43519l();
        try {
            if (((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35938a(l, (Map) getActivity().getIntent().getSerializableExtra("extra_data_map"))) {
                C13479a.m54764b(this.f15974a, "auto open feed..");
                ((C5797a) C4950k.m20478a(mo19446f(), C5797a.class)).setFeedPanel(Boolean.valueOf((boolean) f15973d));
            }
        } catch (Throwable th) {
            C13479a.m54761a(this.f15974a, th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.AbstractC4932j
    /* renamed from: g */
    public C6095s mo19445e() {
        DocBridgeWebViewV2 a = ak.m22922a(getContext(), ar.m20936a());
        this.f15975b = a;
        C6095s sVar = new C6095s(a.mo22319a(this.f15974a, getLifecycle()));
        sVar.mo19552b(this);
        sVar.mo24595a(this);
        DocViewModel docViewModel = (DocViewModel) C4950k.m20479a(sVar, DocViewModel.class, DocViewModel.newFactory(getArguments()));
        sVar.mo24594a(docViewModel);
        sVar.mo24596a(new C6057p(sVar));
        sVar.mo19547a(DocumentLazyPluginMounterFactory.m22795a(sVar));
        sVar.mo19545a(new DocumentFragmentHostAbilityImpl(sVar));
        DocumentInfoAbilityImp bVar = new DocumentInfoAbilityImp();
        sVar.mo19545a(bVar);
        DocumentInfoProvider a2 = bVar.mo23140a();
        sVar.mo24598m().setDocumentInfoProvider(a2);
        C1177w<String> a3 = a2.mo23144a();
        docViewModel.getClass();
        a3.mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$njEZEpmpOWAY6ODbf3NOsDaUua0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                DocViewModel.this.setDocName((String) obj);
            }
        });
        return sVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.browser.AbstractC4932j
    public boolean onBackPressed() {
        C13479a.m54764b(this.f15974a, "onBackPressed()...");
        mo19446f().mo24600o().mo23797a(f15973d);
        if (super.onBackPressed()) {
            return f15973d;
        }
        DocStateTracker.f16283a.mo23278m();
        WebView webView = this.f15976c.getWebView();
        boolean a = m22909a(webView);
        String str = this.f15974a;
        C13479a.m54764b(str, "canGoBack by normal web stack ?" + a);
        if (!a) {
            return false;
        }
        webView.goBack();
        return f15973d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C13479a.m54764b(this.f15974a, "onActivityCreated");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C13479a.m54764b(this.f15974a, "onAttach");
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        Bundle arguments = getArguments();
        if (bundle == null || arguments == null) {
            super.setArguments(bundle);
        } else {
            arguments.putAll(bundle);
        }
    }

    /* renamed from: b */
    private void m22910b(View view) {
        this.f15976c = (AbstractC5625aa) view.findViewById(R.id.webContainer);
        if (mo19446f().mo24600o() instanceof C6057p) {
            ((C6057p) mo19446f().mo24600o()).mo24476a(this.f15976c);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b(this.f15974a, "onCreate");
        FragmentActivity activity = getActivity();
        if (f15973d || activity != null) {
            this.f15978f = C5234y.m21391b();
            mo22586k().getDeleted().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.$$Lambda$aj$dW8IL3B0UBhZ2pPu9Mr9iaqoEQ */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    aj.m22908a(FragmentActivity.this, (Boolean) obj);
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private boolean m22909a(WebView webView) {
        WebBackForwardList copyBackForwardList;
        WebHistoryItem itemAtIndex;
        if (webView == null || !webView.canGoBack() || (copyBackForwardList = webView.copyBackForwardList()) == null) {
            return false;
        }
        int currentIndex = copyBackForwardList.getCurrentIndex();
        String originalUrl = copyBackForwardList.getCurrentItem().getOriginalUrl();
        for (int i = currentIndex - 1; i > 0; i--) {
            WebHistoryItem itemAtIndex2 = copyBackForwardList.getItemAtIndex(i);
            if (itemAtIndex2 != null) {
                if (!originalUrl.equals(itemAtIndex2.getOriginalUrl())) {
                    break;
                }
                webView.goBack();
                currentIndex--;
            }
        }
        if (currentIndex <= 1 || (itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1)) == null) {
            return false;
        }
        String originalUrl2 = itemAtIndex.getOriginalUrl();
        if (TextUtils.isEmpty(originalUrl2)) {
            C13479a.m54775e(this.f15974a, "Pre url empty !");
            return false;
        }
        String d = C6313i.m25327a().mo25393d();
        if (TextUtils.isEmpty(d) || !originalUrl2.contains(d)) {
            return f15973d;
        }
        return false;
    }

    /* renamed from: a */
    public void mo22581a(boolean z) {
        boolean equals = C8275a.f22372e.mo32553a().equals(mo22586k().getDocumentType());
        boolean equals2 = C8275a.f22373f.mo32553a().equals(mo22586k().getDocumentType());
        boolean equals3 = C8275a.f22378k.mo32553a().equals(mo22586k().getDocumentType());
        if (!equals && !equals2 && !equals3) {
            TitlePlugin titlePlugin = (TitlePlugin) mo19446f().mo19540a(TitlePlugin.class);
            if (titlePlugin != null) {
                titlePlugin.updateCardShowingStatus(z);
            } else {
                C13479a.m54775e(this.f15974a, "titlePlugin is null!");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22908a(FragmentActivity fragmentActivity, Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            fragmentActivity.getClass();
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.document.$$Lambda$NGD7eAD3Y8TwRXoT4feaJO0h1nk */

                public final void run() {
                    FragmentActivity.this.finish();
                }
            }, 100);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public void onViewCreated(View view, Bundle bundle) {
        C13479a.m54764b(this.f15974a, "onViewCreated");
        DocReport.f16153n.mo23015a(System.currentTimeMillis());
        m22910b(view);
        mo43521p();
        super.onViewCreated(view, bundle);
        this.f15977e.mo23008f();
        ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35934a();
        mo43520o();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.browser.AbstractC4932j
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.doc_web_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (fragment != null) {
                    fragment.onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }
}
