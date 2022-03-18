package com.bytedance.ee.bear.document.templatePlugin;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.DocumentWebClientPriority;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.templates.p552a.AbstractC11438a;
import com.bytedance.ee.bear.templates.p554c.AbstractC11453a;
import com.bytedance.ee.bear.templates.p554c.AbstractC11454b;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u0012\u001a\u00020\tR\u0015\u0010\u0004\u001a\u00060\u0005R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "webviewClient", "Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin$TemplateWebViewClient;", "getWebviewClient", "()Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin$TemplateWebViewClient;", "hideTemplatePreview", "", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onBackPressed", "", "onDetachFromUIContainer", "showTemplatePreview", "Companion", "TemplateWebViewClient", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class GroupTemplatePreviewPlugin extends DocumentPlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    private final TemplateWebViewClient webviewClient = new TemplateWebViewClient();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "getTitle"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin$e */
    public static final class C6166e implements AbstractC11453a {

        /* renamed from: a */
        public static final C6166e f17179a = new C6166e();

        C6166e() {
        }

        @Override // com.bytedance.ee.bear.templates.p554c.AbstractC11453a
        /* renamed from: a */
        public final void mo24887a(String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin$Companion;", "", "()V", "CODE_FINISH_TEMPLATE", "", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final TemplateWebViewClient getWebviewClient() {
        return this.webviewClient;
    }

    public final void hideTemplatePreview() {
        FragmentActivity fragmentActivity = null;
        AbstractC11438a aVar = (AbstractC11438a) KoinJavaComponent.m268613a(AbstractC11438a.class, null, null, 6, null);
        C6095s sVar = (C6095s) getHost();
        if (sVar != null) {
            fragmentActivity = sVar.mo19564f();
        }
        aVar.mo43934b(fragmentActivity);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        FragmentActivity f;
        C6095s sVar = (C6095s) getHost();
        if (sVar == null || (f = sVar.mo19564f()) == null) {
            return true;
        }
        f.finish();
        return true;
    }

    public final void showTemplatePreview() {
        FragmentActivity fragmentActivity = null;
        AbstractC11438a aVar = (AbstractC11438a) KoinJavaComponent.m268613a(AbstractC11438a.class, null, null, 6, null);
        C6095s sVar = (C6095s) getHost();
        if (sVar != null) {
            fragmentActivity = sVar.mo19564f();
        }
        aVar.mo43933a((Activity) fragmentActivity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin$TemplateWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/bytedance/ee/bear/document/templatePlugin/GroupTemplatePreviewPlugin;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin$b */
    public final class TemplateWebViewClient extends WebViewClient {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TemplateWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            Uri url;
            Uri url2;
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            String str2 = null;
            if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) {
                str = null;
            } else {
                str = url2.getHost();
            }
            sb.append(str);
            if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
                str2 = url.getPath();
            }
            sb.append(str2);
            return C6313i.m25327a().mo25392c(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin$c */
    public static final class View$OnClickListenerC6164c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupTemplatePreviewPlugin f17176a;

        View$OnClickListenerC6164c(GroupTemplatePreviewPlugin groupTemplatePreviewPlugin) {
            this.f17176a = groupTemplatePreviewPlugin;
        }

        public final void onClick(View view) {
            this.f17176a.getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin$d */
    public static final class C6165d<T> implements AbstractC1178x<Map<String, Object>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11454b f17177a;

        /* renamed from: b */
        final /* synthetic */ C6095s f17178b;

        C6165d(AbstractC11454b bVar, C6095s sVar) {
            this.f17177a = bVar;
            this.f17178b = sVar;
        }

        /* renamed from: a */
        public final void onChanged(Map<String, Object> map) {
            FragmentActivity f;
            FragmentActivity f2;
            if (map.containsKey("TEMPLATE_RESULT_KEY") && map.get("TEMPLATE_RESULT_KEY") != null) {
                this.f17177a.mo43999a(map.get("TEMPLATE_RESULT_KEY"));
                C6095s sVar = this.f17178b;
                if (!(sVar == null || (f2 = sVar.mo19564f()) == null)) {
                    f2.setResult(100);
                }
                C6095s sVar2 = this.f17178b;
                if (sVar2 != null && (f = sVar2.mo19564f()) != null) {
                    f.finish();
                }
            }
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        getWeb().mo19438b(this.webviewClient);
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        C1177w<Map<String, Object>> docExtra;
        ViewGroup.LayoutParams layoutParams;
        View f;
        View findViewById;
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19512a((CharSequence) getString(R.string.CreationMobile_Operation_Preview));
        getTitleBar().mo19509a(R.color.text_title);
        C8275a aVar = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.MINDNOTE");
        if (aVar.mo32553a().equals(getDocViewModel().getDocumentType())) {
            if (nVar == null || (f = nVar.mo19601f()) == null || (findViewById = f.findViewById(R.id.titleContentLayout)) == null) {
                layoutParams = null;
            } else {
                layoutParams = findViewById.getLayoutParams();
            }
            if (!(layoutParams instanceof AppBarLayout.LayoutParams)) {
                layoutParams = null;
            }
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.mo76392a(0);
            }
        }
        getWeb().mo19426a(this.webviewClient, DocumentWebClientPriority.Template.ordinal());
        String queryParameter = Uri.parse(getDocViewModel().getOriginUrl()).getQueryParameter("collectionId");
        if (queryParameter != null) {
            C4943e host = getHost();
            Intrinsics.checkExpressionValueIsNotNull(host, "getHost()");
            FragmentActivity f2 = ((C6095s) host).mo19564f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "getHost().activity");
            AbstractC11454b a = ((AbstractC11438a) KoinJavaComponent.m268613a(AbstractC11438a.class, null, null, 6, null)).mo43932a((Activity) getContext(), (ViewGroup) f2.getWindow().findViewById(16908290), queryParameter, C6166e.f17179a);
            TitleBar titleBar2 = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar2, "titleBar");
            titleBar2.mo19508a().setLeftClickListener(new View$OnClickListenerC6164c(this));
            DocViewModel docViewModel = (DocViewModel) aj.m5366a(getActivity()).mo6005a(DocViewModel.class);
            if (docViewModel != null && (docExtra = docViewModel.getDocExtra()) != null) {
                docExtra.mo5923a(getActivity(), new C6165d(a, sVar));
            }
        }
    }
}
