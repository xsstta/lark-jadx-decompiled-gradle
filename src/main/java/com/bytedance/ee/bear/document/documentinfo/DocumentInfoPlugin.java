package com.bytedance.ee.bear.document.documentinfo;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.RenderCallbackAdapter;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "renderCallback", "Lcom/bytedance/ee/bear/contract/DocWebService$RenderCallback;", "onAttachToUIContainer", "", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "requestDocumentInfo", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocumentInfoPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    private final AbstractC5089af.AbstractC5091b renderCallback = new C5743b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoPlugin$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void requestDocumentInfo() {
        C13479a.m54764b("DocumentInfoPlugin", "requestDocumentInfo()...");
        String url = getDocViewModel().getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url, "docViewModel.url");
        if (!TextUtils.isEmpty(url) && C6313i.m25327a().mo25392c(url)) {
            BearUrl g = C6313i.m25327a().mo25399g(url);
            if (!TextUtils.isEmpty(g.f17447b) && !C5130a.m20997b(g.f17447b)) {
                DocViewModel docViewModel = getDocViewModel();
                docViewModel.setToken(g.f17447b);
                docViewModel.requestDocumentInfo(url, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/document/documentinfo/DocumentInfoPlugin$renderCallback$1", "Lcom/bytedance/ee/bear/contract/RenderCallbackAdapter;", "onRenderSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin$b */
    public static final class C5743b extends RenderCallbackAdapter {

        /* renamed from: a */
        final /* synthetic */ DocumentInfoPlugin f16200a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5743b(DocumentInfoPlugin documentInfoPlugin) {
            this.f16200a = documentInfoPlugin;
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b, com.bytedance.ee.bear.contract.RenderCallbackAdapter
        public void onRenderSuccess(Map<String, String> map) {
            this.f16200a.requestDocumentInfo();
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        C13479a.m54764b("DocumentInfoPlugin", "onAttachToUIContainer()...add render callback");
        AbstractC4931i web = getWeb();
        Intrinsics.checkExpressionValueIsNotNull(web, "web");
        WebView b = web.mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) b).mo22326a(this.renderCallback);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        C13479a.m54764b("DocumentInfoPlugin", "onDetachFromUIContainer()...remove render callback");
        AbstractC4931i web = getWeb();
        Intrinsics.checkExpressionValueIsNotNull(web, "web");
        WebView b = web.mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) b).mo22338b(this.renderCallback);
        }
    }
}
