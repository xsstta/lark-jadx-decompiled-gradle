package com.ss.android.lark.jsbridge;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.ss.android.lark.jsbridge.BridgeWebView;
import com.ss.android.lark.log.Log;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BridgeWebView extends WebView {

    /* renamed from: a */
    Map<String, AbstractC40669e> f103255a = new HashMap();

    /* renamed from: b */
    Map<String, AbstractC40665a> f103256b = new HashMap();

    /* renamed from: c */
    AbstractC40665a f103257c = new C40670f();

    /* renamed from: d */
    AbstractC40669e f103258d = new AbstractC40669e() {
        /* class com.ss.android.lark.jsbridge.BridgeWebView.C406601 */

        @Override // com.ss.android.lark.jsbridge.AbstractC40669e
        /* renamed from: b */
        public void mo107243b(String str) {
            Log.m165397w("BridgeWebView", "JS Callback handler onFail:" + str);
        }

        @Override // com.ss.android.lark.jsbridge.AbstractC40669e
        /* renamed from: a */
        public void mo107242a(String str) {
            AbstractC40669e eVar;
            AbstractC40665a aVar;
            try {
                List<C40671g> a = C40671g.m160685a(str);
                if (a == null || a.size() == 0) {
                    Log.m165397w("BridgeWebView", "JS Callback list empty");
                    return;
                }
                for (int i = 0; i < a.size(); i++) {
                    C40671g gVar = a.get(i);
                    String a2 = gVar.mo146784a();
                    Log.m165389i("BridgeWebView", "JS Callback handler name:" + gVar.mo146791e());
                    if (!TextUtils.isEmpty(a2)) {
                        BridgeWebView.this.f103255a.get(a2).mo107242a(gVar.mo146785b());
                        BridgeWebView.this.f103255a.remove(a2);
                    } else {
                        final String c = gVar.mo146787c();
                        if (!TextUtils.isEmpty(c)) {
                            eVar = new AbstractC40669e() {
                                /* class com.ss.android.lark.jsbridge.BridgeWebView.C406601.C406611 */

                                @Override // com.ss.android.lark.jsbridge.AbstractC40669e
                                /* renamed from: a */
                                public void mo107242a(String str) {
                                    C40671g gVar = new C40671g();
                                    gVar.mo146786b(c);
                                    gVar.mo146788c(C40671g.m160684a(true, str));
                                    BridgeWebView.this.mo146764a(gVar);
                                }

                                @Override // com.ss.android.lark.jsbridge.AbstractC40669e
                                /* renamed from: b */
                                public void mo107243b(String str) {
                                    C40671g gVar = new C40671g();
                                    gVar.mo146786b(c);
                                    gVar.mo146788c(C40671g.m160684a(false, str));
                                    BridgeWebView.this.mo146764a(gVar);
                                }
                            };
                        } else {
                            eVar = new C40663a();
                        }
                        if (!TextUtils.isEmpty(gVar.mo146791e())) {
                            aVar = BridgeWebView.this.f103256b.get(gVar.mo146791e());
                        } else {
                            aVar = BridgeWebView.this.f103257c;
                        }
                        if (aVar != null) {
                            aVar.mo146778a(gVar.mo146789d(), eVar);
                            Log.m165389i("BridgeWebView", "JS Callback handler bridge:" + gVar.mo146791e());
                        }
                    }
                }
            } catch (Exception e) {
                Log.m165398w("BridgeWebView", "JS Callback toArrayList error", e);
            }
        }
    };

    /* renamed from: e */
    public final AtomicBoolean f103259e = new AtomicBoolean(false);

    /* renamed from: f */
    private List<C40671g> f103260f = new ArrayList();

    /* renamed from: g */
    private long f103261g = 0;

    /* renamed from: h */
    private boolean f103262h;

    /* renamed from: i */
    private String f103263i;

    /* renamed from: j */
    private C40668d f103264j;

    /* renamed from: com.ss.android.lark.jsbridge.BridgeWebView$a */
    private static class C40663a implements AbstractC40669e {
        @Override // com.ss.android.lark.jsbridge.AbstractC40669e
        /* renamed from: a */
        public void mo107242a(String str) {
        }

        @Override // com.ss.android.lark.jsbridge.AbstractC40669e
        /* renamed from: b */
        public void mo107243b(String str) {
        }

        private C40663a() {
        }
    }

    public List<C40671g> getStartupMessage() {
        return this.f103260f;
    }

    /* renamed from: c */
    public void mo146771c() {
        this.f103256b.clear();
        this.f103255a.clear();
    }

    /* renamed from: a */
    public void mo146763a() {
        if (mo146770b()) {
            mo146767a("javascript:LkWebViewJavascriptBridge._fetchQueue();", this.f103258d);
            return;
        }
        Log.m165397w("BridgeWebView", "flushMessageQueue called in no ui thread");
        post(new Runnable() {
            /* class com.ss.android.lark.jsbridge.BridgeWebView.RunnableC406622 */

            public void run() {
                BridgeWebView bridgeWebView = BridgeWebView.this;
                bridgeWebView.mo146767a("javascript:LkWebViewJavascriptBridge._fetchQueue();", bridgeWebView.f103258d);
            }
        });
    }

    /* renamed from: b */
    public boolean mo146770b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m160658d() {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 19 && m160656a(getContext())) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C40668d dVar = new C40668d(this);
        this.f103264j = dVar;
        setWebViewClient(dVar);
        setWebChromeClient(new C40667c(this));
        addJavascriptInterface(new C40664b(this), "_large_msg_bridge");
    }

    public void setDefaultHandler(AbstractC40665a aVar) {
        this.f103257c = aVar;
    }

    public void setStartupMessage(List<C40671g> list) {
        this.f103260f = list;
    }

    /* renamed from: com.ss.android.lark.jsbridge.BridgeWebView$b */
    public static class C40664b {

        /* renamed from: a */
        private StringBuilder f103269a;

        /* renamed from: b */
        private BridgeWebView f103270b;

        public C40664b(BridgeWebView bridgeWebView) {
            this.f103270b = bridgeWebView;
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m160674a(String str) {
            BridgeWebView bridgeWebView = this.f103270b;
            bridgeWebView.mo146765a("larkbridge://return/_fetchQueue/" + str);
        }

        public int send(String str) {
            if (str == null || !str.startsWith("larkbridge://return/_fetchQueueSegment/")) {
                this.f103269a = null;
                return -1;
            }
            String substring = str.substring(39);
            boolean startsWith = substring.startsWith("last_one/");
            String substring2 = substring.substring(9);
            if (this.f103269a == null) {
                this.f103269a = new StringBuilder(2048);
            }
            this.f103269a.append(substring2);
            if (!startsWith) {
                return 0;
            }
            String sb = this.f103269a.toString();
            this.f103269a = null;
            try {
                this.f103270b.post(new Runnable(URLDecoder.decode(sb, "UTF-8")) {
                    /* class com.ss.android.lark.jsbridge.$$Lambda$BridgeWebView$b$7NVCzje2SvKG5YvE4uUO2FrhlJE */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        BridgeWebView.C40664b.lambda$7NVCzje2SvKG5YvE4uUO2FrhlJE(BridgeWebView.C40664b.this, this.f$1);
                    }
                });
                Log.m165389i("BridgeWebView", "use large message bridge");
                return 1;
            } catch (Exception e) {
                Log.m165398w("BridgeWebView", "JS large message", e);
                return -1;
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m160657b(String str) {
        evaluateJavascript(str, null);
    }

    /* renamed from: a */
    private boolean m160656a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    public void setNeedUselessDecode(boolean z) {
        Log.m165389i("BridgeWebView", "change useless decode state to " + z);
        C40668d dVar = this.f103264j;
        if (dVar != null) {
            dVar.mo146781a(z);
        }
    }

    public BridgeWebView(Context context) {
        super(context);
        m160658d();
    }

    /* renamed from: a */
    public void mo146764a(C40671g gVar) {
        List<C40671g> list = this.f103260f;
        if (list != null) {
            list.add(gVar);
        } else {
            mo146769b(gVar);
        }
    }

    /* renamed from: b */
    public void mo146769b(C40671g gVar) {
        String format = String.format("javascript:LkWebViewJavascriptBridge._handleMessageFromNative(\"%s\");", gVar.mo146793f().replaceAll("(\\\\)([^utrn])", "\\\\\\\\$1$2").replaceAll("(?<=[^\\\\])(\")", "\\\\\""));
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            evaluateJavascript(format, null);
        } else {
            post(new Runnable(format) {
                /* class com.ss.android.lark.jsbridge.$$Lambda$BridgeWebView$nE0_8ymF_vAL2QufilW6utKSF8 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BridgeWebView.m270663lambda$nE0_8ymF_vAL2QufilW6utKSF8(BridgeWebView.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo146765a(String str) {
        String c = C40666b.m160679c(str);
        AbstractC40669e eVar = this.f103255a.get(c);
        String b = C40666b.m160678b(str);
        if (eVar != null) {
            eVar.mo107242a(b);
            this.f103255a.remove(c);
            return;
        }
        Log.m165389i("BridgeWebView", "handlerReturnData, f is null");
    }

    /* renamed from: a */
    public void mo146766a(String str, AbstractC40665a aVar) {
        if (aVar != null) {
            this.f103256b.put(str, aVar);
        }
    }

    public BridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m160658d();
    }

    /* renamed from: a */
    public void mo146767a(String str, AbstractC40669e eVar) {
        evaluateJavascript(str, null);
        this.f103255a.put(C40666b.m160677a(str), eVar);
    }

    /* renamed from: a */
    public void mo146768a(boolean z, boolean z2) {
        if (z) {
            this.f103262h = false;
        } else if (!this.f103262h || z2) {
            if (TextUtils.isEmpty(this.f103263i)) {
                this.f103263i = C40666b.m160676a(getContext(), "WebViewJavascriptBridge.js");
            }
            evaluateJavascript("javascript:" + this.f103263i, null);
            this.f103262h = true;
        }
    }

    public BridgeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m160658d();
    }
}
