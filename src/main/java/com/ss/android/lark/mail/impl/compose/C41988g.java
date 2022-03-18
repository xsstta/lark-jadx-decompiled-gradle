package com.ss.android.lark.mail.impl.compose;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f;
import com.bytedance.ee.bear.middleground.docsdk.C9306a;
import com.bytedance.ee.bear.middleground.docsdk.C9307b;
import com.bytedance.ee.bear.middleground.docsdk.C9310c;
import com.bytedance.ee.bear.middleground.docsdk.C9311d;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.util.C13582a;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.mailtoolbar.C42760e;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailToolbarPlugin;
import com.ss.android.lark.mail.impl.message.p2204d.C42859c;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.compose.g */
public class C41988g {

    /* renamed from: a */
    public static ComposeWebView f106585a;

    /* renamed from: b */
    public static C42760e f106586b;

    /* renamed from: c */
    public static boolean f106587c;

    /* renamed from: d */
    public static boolean f106588d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C4943e m166968a(C4943e eVar) {
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.g$a */
    public static class C41992a extends AbstractC9313f {
        @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f
        /* renamed from: a */
        public C9306a mo35539a() {
            return C9306a.f25027a;
        }

        public C41992a() {
            super(new AbstractC13402a() {
                /* class com.ss.android.lark.mail.impl.compose.C41988g.C41992a.C419931 */

                @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
                public C13477l getServiceManager() {
                    return new C13477l();
                }

                @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
                public LarkWebView getWebView() {
                    C41988g.m166970a();
                    return C41988g.f106585a.getWebView();
                }

                @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
                public Context getWebViewContext() {
                    C41988g.m166970a();
                    return C41988g.f106585a.getWebView().getWebViewContext();
                }
            });
        }

        @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f, com.bytedance.ee.larkwebview.base.C13405d
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.m165388i("onRenderProcessGone DocSDKPreload 22");
            C41988g.m166973d();
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f
        /* renamed from: a */
        public void mo35540a(String str, Map<String, String> map) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                C41816b.m166115a().mo150114D().mo150182b(str, jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m166977h() {
        ComposeWebView composeWebView = f106585a;
        if (composeWebView != null) {
            composeWebView.mo153476g();
        }
    }

    /* renamed from: k */
    private static C41992a m166980k() {
        return new C41992a();
    }

    /* renamed from: e */
    public static void m166974e() {
        Log.m165389i("DocSDKPreload", "onlyDestroy clear mComposeWebView");
        f106585a = null;
    }

    /* renamed from: j */
    private static void m166979j() {
        ComposeWebView composeWebView = f106585a;
        if (composeWebView != null) {
            composeWebView.mo35519a(new IWebViewExtension.RenderProcessGoneListener() {
                /* class com.ss.android.lark.mail.impl.compose.C41988g.C419891 */

                @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
                public boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                    Log.m165389i("DocSDKPreload", "onRenderProcessGone DocSDKPreload 11");
                    C41988g.m166973d();
                    return true;
                }
            });
        }
    }

    /* renamed from: b */
    public static void m166971b() {
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.prestartweb")) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.C41988g.RunnableC419902 */

                public void run() {
                    if (!C41988g.f106587c && C41988g.f106585a == null) {
                        C41988g.m166970a();
                        C41988g.f106585a.onPause();
                        C41988g.f106588d = true;
                    }
                    C41988g.f106587c = true;
                }
            });
        }
    }

    /* renamed from: c */
    public static void m166972c() {
        if (f106585a != null) {
            m166979j();
            f106585a.setBridgeWebViewClient(m166980k());
        }
    }

    /* renamed from: d */
    public static void m166973d() {
        Log.m165389i("DocSDKPreload", "onRenderProcessGone clear mComposeWebView");
        f106585a = null;
        C42859c.m170753a().mo153838b();
    }

    /* renamed from: f */
    public static void m166975f() {
        Log.m165389i("DocSDKPreload", "resetWebView");
        ComposeWebView composeWebView = f106585a;
        if (composeWebView != null) {
            composeWebView.mo19616a();
            f106585a.getWebView().destroy();
            f106585a = null;
        }
    }

    /* renamed from: i */
    public static ComposeWebView m166978i() {
        m166970a();
        if (f106588d) {
            f106588d = false;
            f106585a.onResume();
        }
        return f106585a;
    }

    /* renamed from: g */
    public static void m166976g() {
        Log.m165389i("DocSDKPreload", "reset");
        ComposeWebView composeWebView = f106585a;
        if (composeWebView != null) {
            LinearLayout linearLayout = (LinearLayout) composeWebView.getWebView().getParent();
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            f106585a.mo153471d();
            f106585a.mo153475f();
        }
    }

    /* renamed from: a */
    public static void m166970a() {
        if (f106585a == null) {
            Log.m165389i("DocSDKPreload", "initIfNeeded");
            f106585a = new ComposeWebView(C41816b.m166115a().mo150132b());
            C41816b.m166115a().mo150126a(f106585a.getWebView(), "mail_compose_webView");
            f106585a.setBridgeWebViewClient(m166980k());
            f106585a.getSettings().setJavaScriptEnabled(true);
            f106585a.getSettings().setAllowUniversalAccessFromFileURLs(false);
            f106585a.getSettings().setUserAgentString(C41816b.m166115a().mo150141h());
            CookieManager.getInstance().setAcceptThirdPartyCookies(f106585a.getWebView(), true);
            f106585a.getWebView().resumeTimers();
            f106585a.getWebView().stopLoading();
            f106585a.getWebView().clearHistory();
            HashMap<String, String> hashMap = new HashMap<>();
            int n = C41816b.m166115a().mo150147n();
            if (n == 1 || n == 2) {
                hashMap.put("staging", "false");
            } else if (n == 3 || n == 4) {
                hashMap.put("staging", "true");
            }
            hashMap.put("userId", C41816b.m166115a().mo150139f());
            hashMap.put("atUserEnable", Boolean.toString(C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.atuser")));
            hashMap.put("inline_image", "true");
            f106585a.mo153461a(hashMap);
            C13582a.m55112a((Application) C41816b.m166115a().mo150132b());
            f106586b = new C42760e();
            m166979j();
        }
    }

    /* renamed from: a */
    private static AbstractC4931i m166967a(ComposeWebView composeWebView) {
        return new C9311d((BridgeWebViewV2) composeWebView.getWebView());
    }

    /* renamed from: a */
    public static ComposeWebView m166969a(final Context context, String str, MailToolbarPlugin.AbstractC42812b bVar) {
        Log.m165389i("DocSDKPreload", "newComposeWebView");
        ComposeWebView i = m166978i();
        i.getWebView().setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
        C4933k kVar = new C4933k(m166967a(i));
        C419913 r2 = new C4943e.AbstractC4944a() {
            /* class com.ss.android.lark.mail.impl.compose.C41988g.C419913 */

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
            /* renamed from: a */
            public <T> T mo19325a(Class<T> cls) {
                return null;
            }

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
            /* renamed from: b */
            public AbstractC4948i mo19326b() {
                return C41988g.f106586b;
            }

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
            /* renamed from: a */
            public LifecycleOwner mo19324a() {
                return (FragmentActivity) context;
            }

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
            public FragmentActivity getActivity() {
                return (FragmentActivity) context;
            }
        };
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        new C9307b.C9309a().mo35531a(fragmentActivity).mo35532a(r2).mo35534a(new C9310c(fragmentActivity, fragmentActivity.findViewById(R.id.activity_container), (TitleBar) null)).mo35533a(new C4943e.AbstractC4945b() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$g$vX0ndPlB7gY01fuYLtp_JsgCOI4 */

            @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4945b
            public final C4943e createPluginHost() {
                return C41988g.m166968a(C4943e.this);
            }
        }).mo35535a();
        C42760e eVar = (C42760e) r2.mo19326b();
        if (eVar != null) {
            eVar.mo153563a(bVar);
            eVar.mo153564a(str);
            i.setWebPluginProvider(eVar);
        }
        return i;
    }
}
