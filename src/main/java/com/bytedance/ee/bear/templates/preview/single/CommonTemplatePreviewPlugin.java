package com.bytedance.ee.bear.templates.preview.single;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.DocumentWebClientPriority;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.templates.preview.data.Item;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0002 !B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J!\u0010\u001b\u001a\u00020\r2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", ShareHitPoint.f121869d, "", "(Ljava/lang/String;)V", "commonTemplateViewModel", "Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplateViewModel;", "templatePreviewWebViewClient", "Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin$TemplatePreviewWebViewClient;", "getType", "()Ljava/lang/String;", "ensurePreviewFragment", "", "getTemplateView", "Landroid/view/ViewGroup;", "initTitle", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onBackPressed", "", "onDetachFromUIContainer", "onPreviewFinish", "setupMoreMenu", "showRightMenu", "items", "", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "([Lcom/bytedance/ee/bear/browser/plugin/MenuItem;)V", "Companion", "TemplatePreviewWebViewClient", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonTemplatePreviewPlugin extends DocumentPlugin implements AbstractC7666d {
    public static final Companion Companion = new Companion(null);
    public CommonTemplateViewModel commonTemplateViewModel;
    private final TemplatePreviewWebViewClient templatePreviewWebViewClient = new TemplatePreviewWebViewClient();
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin$Companion;", "", "()V", "CODE_FINISH_TEMPLATE", "", "MENU_ID_PREVIEW_MORE_ACTION", "", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getType() {
        return this.type;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        CommonTemplateViewModel cVar = this.commonTemplateViewModel;
        if (cVar != null) {
            cVar.onBackPressed();
        }
        getActivity().finish();
        return false;
    }

    public final void onPreviewFinish() {
        ViewGroup templateView = getTemplateView();
        if (templateView != null) {
            templateView.setVisibility(8);
        }
        getActivity().setResult(100);
        CommonTemplateViewModel cVar = this.commonTemplateViewModel;
        if (cVar != null) {
            cVar.setCommonPreviewTemplateView(null);
        }
    }

    private final ViewGroup getTemplateView() {
        C6095s sVar = (C6095s) getHost();
        Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
        FragmentActivity f = sVar.mo19564f();
        Intrinsics.checkExpressionValueIsNotNull(f, "host.activity");
        return (ViewGroup) ((ViewGroup) f.getWindow().findViewById(16908290)).findViewById(R.id.layout_common_template_preview);
    }

    private final void initTitle() {
        Item currTemplate;
        CommonTemplateViewModel cVar = this.commonTemplateViewModel;
        if (cVar != null && (currTemplate = cVar.getCurrTemplate()) != null) {
            TitleBar titleBar = getTitleBar();
            Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
            titleBar.mo19512a((CharSequence) currTemplate.getName());
            getTitleBar().mo19509a(R.color.text_title);
        }
    }

    private final void setupMoreMenu() {
        Drawable a = C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_more_outlined, (int) R.color.facade_selector_icon_n1);
        showRightMenu(new CommonTemplatePreviewPlugin$setupMoreMenu$1(this, a, "PREVIEW_MORE_ACTION", a, ""));
    }

    private final void ensurePreviewFragment() {
        CommonPreviewTemplateView aVar;
        LiveData<Boolean> previewActive;
        DocViewModel m;
        C6095s sVar = (C6095s) getHost();
        Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
        FragmentActivity f = sVar.mo19564f();
        Intrinsics.checkExpressionValueIsNotNull(f, "host.activity");
        ViewGroup viewGroup = (ViewGroup) f.getWindow().findViewById(16908290);
        ViewGroup templateView = getTemplateView();
        CommonTemplateViewModel cVar = this.commonTemplateViewModel;
        String str = null;
        if (cVar != null) {
            aVar = cVar.getCommonPreviewTemplateView();
        } else {
            aVar = null;
        }
        View findViewById = viewGroup.findViewById(R.id.tv_preview_title);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (aVar == null) {
            aVar = new CommonPreviewTemplateView();
            CommonTemplateViewModel cVar2 = this.commonTemplateViewModel;
            if (cVar2 != null) {
                cVar2.setCommonPreviewTemplateView(aVar);
            }
            CommonTemplateViewModel cVar3 = this.commonTemplateViewModel;
            if (cVar3 != null) {
                C6095s sVar2 = (C6095s) getHost();
                if (!(sVar2 == null || (m = sVar2.mo24598m()) == null)) {
                    str = m.getPreviewListStr();
                }
                cVar3.initTemplates(str);
            }
            CommonTemplateViewModel cVar4 = this.commonTemplateViewModel;
            if (cVar4 != null) {
                cVar4.setType(this.type);
            }
            CommonTemplatePreviewAnalytic.f31207b.mo44508a();
        }
        if (templateView == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "content");
            aVar.mo44507a(activity, viewGroup, this.commonTemplateViewModel);
        } else {
            templateView.setVisibility(0);
        }
        CommonTemplateViewModel cVar5 = this.commonTemplateViewModel;
        if (cVar5 != null && (previewActive = cVar5.getPreviewActive()) != null) {
            previewActive.mo5923a(getLifecycleOwner(), new C11579c(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin$TemplatePreviewWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$b */
    public final class TemplatePreviewWebViewClient extends WebViewClient {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TemplatePreviewWebViewClient() {
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

    public CommonTemplatePreviewPlugin(String str) {
        this.type = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$c */
    public static final class C11579c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CommonTemplatePreviewPlugin f31194a;

        C11579c(CommonTemplatePreviewPlugin commonTemplatePreviewPlugin) {
            this.f31194a = commonTemplatePreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                this.f31194a.onPreviewFinish();
            }
        }
    }

    private final void showRightMenu(MenuItem... menuItemArr) {
        getTitleBar().mo19528h(true);
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().mo45073a();
        getTitleBar().mo19514a(C69043h.m265716a(menuItemArr), TitleBar.MenuType.Right);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        getWeb().mo19438b(this.templatePreviewWebViewClient);
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        CommonTemplateViewModel cVar = (CommonTemplateViewModel) new C1144ai(getActivity()).mo6005a(CommonTemplateViewModel.class);
        this.commonTemplateViewModel = cVar;
        if (cVar != null) {
            cVar.setPreviewActive(true);
        }
        if (Intrinsics.areEqual(this.type, "custom")) {
            setupMoreMenu();
        }
        getWeb().mo19426a(this.templatePreviewWebViewClient, DocumentWebClientPriority.Template.ordinal());
        ensurePreviewFragment();
        initTitle();
    }
}
