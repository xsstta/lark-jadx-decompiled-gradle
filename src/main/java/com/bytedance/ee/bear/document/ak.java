package com.bytedance.ee.bear.document;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.offline.sync.C6002l;
import com.bytedance.ee.bear.document.rendergone.AbstractC6088b;
import com.bytedance.ee.bear.document.rendergone.C6087a;
import com.bytedance.ee.bear.document.web.C6290a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.lark.component.C12733b;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.List;
import org.json.JSONObject;

public class ak {

    /* renamed from: a */
    private static DocBridgeWebViewV2 f15979a;

    /* renamed from: b */
    private static AbstractC5642a f15980b;

    /* renamed from: c */
    private static C6290a f15981c;

    /* renamed from: d */
    private static AbstractC6088b f15982d = new AbstractC6088b() {
        /* class com.bytedance.ee.bear.document.ak.C56401 */

        @Override // com.bytedance.ee.bear.document.rendergone.AbstractC6088b
        /* renamed from: a */
        public void mo22588a(boolean z, int i) {
            C6087a.m24610a(z, i);
        }
    };

    /* renamed from: com.bytedance.ee.bear.document.ak$a */
    public interface AbstractC5642a {
        /* renamed from: a */
        void mo17108a(WebView webView);
    }

    /* renamed from: b */
    public static DocBridgeWebViewV2 m22924b() {
        DocBridgeWebViewV2 docBridgeWebViewV2;
        synchronized (ak.class) {
            docBridgeWebViewV2 = f15979a;
        }
        return docBridgeWebViewV2;
    }

    /* renamed from: c */
    public static void m22926c() {
        C13479a.m54764b("WebViewHolder", "destroyWebview()... ");
        synchronized (ak.class) {
            DocBridgeWebViewV2 docBridgeWebViewV2 = f15979a;
            if (docBridgeWebViewV2 != null) {
                ViewGroup viewGroup = (ViewGroup) docBridgeWebViewV2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(f15979a);
                }
                C6002l.m24300a().mo24269c();
                f15979a.clearHistory();
                f15979a.destroy();
                f15979a = null;
                f15981c = null;
            }
        }
    }

    /* renamed from: a */
    public DocBridgeWebViewV2 mo22587a() {
        synchronized (ak.class) {
            if (f15979a == null) {
                C13479a.m54758a("WebViewHolder", "getCleanWebView()... webView is null");
                return null;
            }
            C13479a.m54772d("WebViewHolder", "getCleanWebView()... isready = " + f15979a.mo22364k());
            if (f15979a.mo22364k()) {
                f15979a.stopLoading();
            }
            f15979a.clearHistory();
            ViewGroup viewGroup = (ViewGroup) f15979a.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(f15979a);
            }
            return f15979a;
        }
    }

    /* renamed from: a */
    public static void m22923a(AbstractC5642a aVar) {
        f15980b = aVar;
    }

    public ak(Context context, C10917c cVar) {
        m22922a(context, cVar);
    }

    /* renamed from: b */
    private static void m22925b(final Context context, C10917c cVar) {
        C13398b.m54467a(new AbstractC13397a() {
            /* class com.bytedance.ee.bear.document.ak.C56412 */

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public String mo22589a() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: b */
            public List<String> mo22592b() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: c */
            public String mo22593c() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public boolean mo22591a(String str) {
                return C4211a.m17514a().mo16536a(str, false);
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public void mo22590a(String str, JSONObject jSONObject) {
                C5234y.m21391b().mo21080a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    static synchronized DocBridgeWebViewV2 m22922a(Context context, C10917c cVar) {
        DocBridgeWebViewV2 docBridgeWebViewV2;
        synchronized (ak.class) {
            if (f15979a == null) {
                f15979a = new DocBridgeWebViewV2(context.getApplicationContext(), cVar, "WebViewHolder");
                m22925b(context, cVar);
                f15979a.mo22328a(f15982d);
                DocBridgeWebViewV2 docBridgeWebViewV22 = f15979a;
                AbstractC5642a aVar = f15980b;
                if (aVar != null) {
                    aVar.mo17108a(docBridgeWebViewV22);
                }
                docBridgeWebViewV22.measure(View.MeasureSpec.makeMeasureSpec(C13749l.m55736a(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((float) C13749l.m55748b()) * 0.9f), 1073741824));
                docBridgeWebViewV22.layout(0, 0, docBridgeWebViewV22.getMeasuredWidth(), docBridgeWebViewV22.getMeasuredHeight());
            }
            if (f15981c == null) {
                DocBridgeWebViewV2 docBridgeWebViewV23 = f15979a;
                C6290a aVar2 = new C6290a(docBridgeWebViewV23.getSettings(), C4511g.m18594d());
                f15981c = aVar2;
                aVar2.mo25299a(docBridgeWebViewV23);
                if (!C13653a.m55399c(context)) {
                    C12733b.m52710a().mo48219a(f15979a);
                }
            }
            docBridgeWebViewV2 = f15979a;
        }
        return docBridgeWebViewV2;
    }
}
