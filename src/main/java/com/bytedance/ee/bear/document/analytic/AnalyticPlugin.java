package com.bytedance.ee.bear.document.analytic;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class AnalyticPlugin extends DocumentPlugin {
    public AbstractC5233x mAnalyticService;

    /* renamed from: com.bytedance.ee.bear.document.analytic.AnalyticPlugin$a */
    public static class C5651a {

        /* renamed from: a */
        public Map<String, Object> f16006a;

        /* renamed from: b */
        public String f16007b = "bizCommonParams";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.analytic.AnalyticPlugin$1 */
    public static /* synthetic */ class C56501 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16005a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.contract.doc.DocsOpenSource[] r0 = com.bytedance.ee.bear.contract.doc.DocsOpenSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.analytic.AnalyticPlugin.C56501.f16005a = r0
                com.bytedance.ee.bear.contract.doc.DocsOpenSource r1 = com.bytedance.ee.bear.contract.doc.DocsOpenSource.vc     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.analytic.AnalyticPlugin.C56501.f16005a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.contract.doc.DocsOpenSource r1 = com.bytedance.ee.bear.contract.doc.DocsOpenSource.docs_feed     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.analytic.AnalyticPlugin.C56501.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.analytic.AnalyticPlugin$b */
    private class C5652b implements AbstractC7945d<C5651a> {
        private C5652b() {
        }

        /* synthetic */ C5652b(AnalyticPlugin analyticPlugin, C56501 r2) {
            this();
        }

        /* renamed from: a */
        public void handle(C5651a aVar, AbstractC7947h hVar) {
            if (!(aVar == null || aVar.f16006a == null || aVar.f16007b == null)) {
                AnalyticPlugin.this.mAnalyticService.mo21077a(aVar.f16007b);
                for (Map.Entry<String, Object> entry : aVar.f16006a.entrySet()) {
                    AnalyticPlugin.this.mAnalyticService.mo21078a(aVar.f16007b, entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.analytic.setCommonParams", new C5652b(this, null));
    }

    private String getAppForm(DocViewModel docViewModel) {
        int i = C56501.f16005a[docViewModel.getOpenSource().ordinal()];
        if (i == 1) {
            return "vc";
        }
        if (i != 2) {
            return "none";
        }
        return "docs_feed";
    }

    private String getFilePermission(DocumentInfo documentInfo) {
        if (documentInfo == null) {
            return "";
        }
        return documentInfo.getDocPermission().mo38594b().getReportJson();
    }

    private String getUserPermission(DocumentInfo documentInfo) {
        if (documentInfo == null) {
            return "";
        }
        return documentInfo.getDocPermission().mo38591a().getReportJson();
    }

    public /* synthetic */ void lambda$onAttachToHost$0$AnalyticPlugin(DocumentInfo documentInfo) {
        this.mAnalyticService.mo21078a("docCommonParams", "user_permission", getUserPermission(documentInfo));
        this.mAnalyticService.mo21078a("docCommonParams", "file_permission", getFilePermission(documentInfo));
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$AnalyticPlugin(DocumentInfo documentInfo) {
        String reportJson = documentInfo.getDocPermission().mo38591a().getReportJson();
        String reportJson2 = documentInfo.getDocPermission().mo38594b().getReportJson();
        this.mAnalyticService.mo21077a("nativePermissionCommonParams");
        this.mAnalyticService.mo21078a("nativePermissionCommonParams", "user_permission", reportJson);
        this.mAnalyticService.mo21078a("nativePermissionCommonParams", "file_permission", reportJson2);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        AbstractC5233x b = C5234y.m21391b();
        this.mAnalyticService = b;
        b.mo21077a("docCommonParams");
        getDocViewModel().liveDocumentInfoData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.analytic.$$Lambda$AnalyticPlugin$XRdKxrQoBw4oVfqAMo8VTK6WoY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AnalyticPlugin.this.lambda$onAttachToHost$0$AnalyticPlugin((DocumentInfo) obj);
            }
        });
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mAnalyticService.mo21087d("bizCommonParams");
        this.mAnalyticService.mo21087d("docCommonParams");
        this.mAnalyticService.mo21087d("nativePermissionCommonParams");
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        DocViewModel docViewModel = getDocViewModel();
        BearUrl bearUrl = docViewModel.getBearUrl();
        this.mAnalyticService.mo21078a("docCommonParams", "file_id", C13598b.m55197d(bearUrl.f17447b));
        this.mAnalyticService.mo21078a("docCommonParams", "file_type", bearUrl.f17446a);
        if (docViewModel.isType(C8275a.f22377j)) {
            this.mAnalyticService.mo21078a("docCommonParams", "module", C8275a.f22377j.mo32553a());
            this.mAnalyticService.mo21078a("docCommonParams", "page_token", C13598b.m55197d(docViewModel.getOriginBearUrl().f17447b));
            this.mAnalyticService.mo21078a("docCommonParams", "container_type", "wiki");
            this.mAnalyticService.mo21078a("docCommonParams", "container_id", C13598b.m55197d(((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21065a(sVar, sVar.mo24597l().getArguments())));
        } else {
            this.mAnalyticService.mo21078a("docCommonParams", "module", bearUrl.f17446a);
            this.mAnalyticService.mo21078a("docCommonParams", "page_token", C13598b.m55197d(bearUrl.f17447b));
            this.mAnalyticService.mo21078a("docCommonParams", "container_type", "folder");
            this.mAnalyticService.mo21078a("docCommonParams", "container_id", C13598b.m55197d(bearUrl.f17447b));
        }
        this.mAnalyticService.mo21078a("docCommonParams", "sub_module", "none");
        this.mAnalyticService.mo21078a("docCommonParams", "app_form", getAppForm(docViewModel));
        docViewModel.liveDocumentInfoData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.analytic.$$Lambda$AnalyticPlugin$gKQIddBA5rV7JtQ1e_M2lA8wyU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AnalyticPlugin.this.lambda$onAttachToUIContainer$1$AnalyticPlugin((DocumentInfo) obj);
            }
        });
    }
}
