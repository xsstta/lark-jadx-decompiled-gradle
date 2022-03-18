package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.larkwebview.DocSDKBridgeWebViewImpV2;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.f */
public class C43725f extends DocSDKBridgeWebViewImpV2 {

    /* renamed from: r */
    protected AbstractC43719c f110962r;

    /* renamed from: y */
    protected C43728g f110963y;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo153475f() {
        this.f110962r = null;
        this.f110963y = null;
    }

    /* renamed from: j */
    public void mo155850j() {
        C43728g gVar = this.f110963y;
        if (gVar != null) {
            gVar.mo155864f();
        }
    }

    /* renamed from: k */
    public void mo155851k() {
        C43728g gVar = this.f110963y;
        if (gVar != null) {
            gVar.mo155863e();
        }
    }

    /* renamed from: l */
    public static void m173364l() {
        C13398b.m54467a(new AbstractC13397a() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f.C437272 */

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public String mo22589a() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public boolean mo22591a(String str) {
                return true;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: b */
            public List<String> mo22592b() {
                return null;
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: c */
            public String mo22593c() {
                return C43032aa.m171186a();
            }

            @Override // com.bytedance.ee.larkwebview.p668b.AbstractC13397a
            /* renamed from: a */
            public void mo22590a(String str, JSONObject jSONObject) {
                C42187a.m168522d(str, jSONObject);
            }
        });
    }

    public C43725f(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void mo155849c(int i, boolean z) {
        C43728g gVar = this.f110963y;
        if (gVar != null) {
            gVar.mo155852a(i, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155848a(C43728g gVar, AbstractC43719c cVar) {
        setBridgeWebViewClient(gVar);
        this.f110962r = cVar;
        this.f110963y = gVar;
        gVar.mo155855a(cVar);
        if (C41816b.m166115a().mo150143j()) {
            setWebContentsDebuggingEnabled(true);
        }
        mo35519a(new IWebViewExtension.RenderProcessGoneListener() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f.C437261 */

            @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
            public boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                Log.m165388i("MailWebView onRenderProcessGone");
                if (C43725f.this.f110962r == null) {
                    return true;
                }
                C43725f.this.f110962r.mo150561a(webView);
                return true;
            }
        });
    }
}
