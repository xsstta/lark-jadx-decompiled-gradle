package com.tt.miniapp.component.nativeview;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65878e;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapp.component.nativeview.p3269a.C65842a;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.p3350b.C67249i;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;

/* renamed from: com.tt.miniapp.component.nativeview.e */
public class C65878e extends C65887g {
    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f, com.tt.miniapp.component.nativeview.C65887g
    public void setAppContext(IAppContext iAppContext) {
        super.setAppContext(iAppContext);
        C67485a.m262488a(iAppContext).mo234280a().mo234307a(5);
    }

    /* renamed from: c */
    private boolean m258069c(String str) {
        AppBrandLogger.m52828d("NativeAdWebView", "standardInterceptLoadSpecialUrl url:", str);
        final C65883a aVar = new C65883a(str);
        if (!aVar.f166177a) {
            return super.mo230664a(str);
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.component.nativeview.C65878e.C658823 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                TTFile a = C65878e.m258068a(C65878e.this.f166189d, aVar.f166178b);
                if (a != null) {
                    C67866g.m264027a(new Runnable(a) {
                        /* class com.tt.miniapp.component.nativeview.$$Lambda$e$3$YWo8EKs_JINQRq3pnAGCK1XQseM */
                        public final /* synthetic */ TTFile f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C65878e.C658823.lambda$YWo8EKs_JINQRq3pnAGCK1XQseM(C65878e.C658823.this, this.f$1);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m258073a(TTFile gVar) {
                C65878e.this.f166186a.mo230762a().loadUrl(gVar.mo235647a());
            }
        }, C67554l.m262725b());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.C65887g
    /* renamed from: a */
    public void mo230663a(WebView webView) {
        this.f166186a.mo230762a().addJavascriptInterface(new C65842a(this, this.f166189d), "ttJSCore");
        this.f166186a.mo230762a().getSettings().setDomStorageEnabled(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.C65887g
    /* renamed from: a */
    public boolean mo230664a(String str) {
        if (TTFileHelper.m264259a("NativeAdWebView", this.f166189d)) {
            return m258069c(str);
        }
        final C65883a aVar = new C65883a(str);
        if (!aVar.f166177a) {
            return super.mo230664a(str);
        }
        AppBrandLogger.m52828d("NativeAdWebView", "interceptLoadSpecialUrl url:", str);
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.component.nativeview.C65878e.C658802 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                final String b = C67404a.m262266a(C65878e.this.f166189d).mo234079b(aVar.f166178b);
                File file = new File(b);
                StreamLoader.extractToFile(aVar.f166178b, file.getParent(), file.getName(), C65878e.this.f166189d);
                AppBrandLogger.m52828d("NativeAdWebView", "interceptLoadSpecialUrl destFile.getAbsolutePath(:", b);
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.component.nativeview.C65878e.C658802.RunnableC658811 */

                    public void run() {
                        WebView a = C65878e.this.f166186a.mo230762a();
                        a.loadUrl("file:///" + b);
                    }
                });
            }
        }, C67554l.m262725b());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.component.nativeview.e$a */
    public class C65883a {

        /* renamed from: a */
        public boolean f166177a;

        /* renamed from: b */
        public String f166178b;

        C65883a(Uri uri) {
            if (uri != null) {
                this.f166177a = TextUtils.equals(uri.getScheme(), "ttadcache");
                this.f166178b = uri.getPath();
            }
        }

        C65883a(String str) {
            Uri parse;
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
                this.f166177a = TextUtils.equals(parse.getScheme(), "ttadcache");
                this.f166178b = parse.getPath();
            }
        }
    }

    /* renamed from: a */
    public static TTFile m258068a(IAppContext iAppContext, String str) {
        AbstractC67722a aVar = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
        File file = new File(aVar.mo235087d(), str);
        StreamLoader.extractToFile(str, file.getParent(), file.getName(), iAppContext);
        AppBrandLogger.m52830i("NativeAdWebView", "standardInterceptLoadSpecialUrl destFile.getAbsolutePath(:", file);
        try {
            TTFile a = TTFile.f171100b.mo235646a(str);
            TTFileContext hVar = new TTFileContext(null, "NativeAdWebView");
            aVar.mo235620d(a, hVar);
            if (aVar.mo235612b(file, a, hVar)) {
                return a;
            }
            AppBrandLogger.m52829e("NativeAdWebView", "moveSystemFile return false");
            return null;
        } catch (TTFileException e) {
            AppBrandLogger.m52829e("NativeAdWebView", "moveSystemFile Exception", e);
        }
    }

    public C65878e(int i, C67231a aVar, RenderViewManager.IRender iRender) {
        super(i, aVar, iRender);
        this.f166187b.mo230699a(new C65887g.AbstractC65898c() {
            /* class com.tt.miniapp.component.nativeview.C65878e.C658791 */

            @Override // com.tt.miniapp.component.nativeview.C65887g.AbstractC65898c
            /* renamed from: a */
            public WebResourceResponse mo230665a(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url = webResourceRequest.getUrl();
                if (url == null) {
                    return null;
                }
                String uri = url.toString();
                String lastPathSegment = url.getLastPathSegment();
                AppBrandLogger.m52828d("NativeAdWebView", "urlString:", uri, "lastPath:", lastPathSegment);
                if (TextUtils.equals(lastPathSegment, "toutiao.js")) {
                    return new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(uri), "UTF-8", null);
                }
                C65883a aVar = new C65883a(url);
                if (aVar.f166177a) {
                    String str = aVar.f166178b;
                    AppBrandLogger.m52830i("NativeAdWebView", "path", str);
                    InputStream stream = StreamLoader.getStream(str, C65878e.this.f166189d);
                    if (stream != null) {
                        try {
                            return new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(uri), "UTF-8", stream);
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("NativeAdWebView", "shouldInterceptRequest", e);
                        }
                    }
                }
                if (TTFileHelper.m264259a("NativeAdWebView", C65878e.this.f166189d)) {
                    AppBrandLogger.m52830i("NativeAdWebView", "standardFeature enable urlString:" + url);
                    TTFile gVar = new TTFile(uri);
                    if (gVar.mo235649c()) {
                        return C67249i.m262070a(gVar, C65878e.this.f166189d);
                    }
                }
                return null;
            }
        });
    }
}
