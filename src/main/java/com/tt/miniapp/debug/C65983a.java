package com.tt.miniapp.debug;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.C65716a;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.DebugUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.debug.a */
public class C65983a {

    /* renamed from: a */
    public WebSocket f166551a;

    /* renamed from: b */
    public String f166552b;

    /* renamed from: c */
    public String f166553c;

    /* renamed from: d */
    public boolean f166554d;

    /* renamed from: e */
    public boolean f166555e;

    /* renamed from: f */
    public boolean f166556f;

    /* renamed from: g */
    public boolean f166557g;

    /* renamed from: h */
    public AbstractC65988a f166558h;

    /* renamed from: i */
    public boolean f166559i;

    /* renamed from: j */
    public Handler f166560j;

    /* renamed from: com.tt.miniapp.debug.a$a */
    public interface AbstractC65988a {
        /* renamed from: a */
        void mo230979a();
    }

    /* renamed from: c */
    public static HandlerThread m258416c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static synchronized C65983a m258415a() {
        C65983a debugManager;
        synchronized (C65983a.class) {
            debugManager = ContextSingletonInstance.getInstance().getDebugManager();
        }
        return debugManager;
    }

    /* renamed from: b */
    public void mo230974b() {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.debug.C65983a.RunnableC659873 */

            public void run() {
                if (C65983a.this.f166558h != null && !C65983a.this.f166559i) {
                    C65983a.this.f166559i = true;
                    C65983a.this.f166558h.mo230979a();
                }
            }
        });
    }

    public C65983a() {
        boolean z;
        if (DebugUtil.debug() || C67031e.m261247a()) {
            z = true;
        } else {
            z = false;
        }
        this.f166554d = z;
        this.f166555e = false;
        this.f166556f = false;
        this.f166557g = false;
        this.f166560j = null;
        this.f166554d = z | ((Boolean) HostDependManager.getInst().getHostData(2011, false, C65716a.f165588a)).booleanValue();
    }

    /* renamed from: c */
    private void m258417c() {
        HandlerThread c = m258416c("RemoteDebugHandler");
        c.start();
        this.f166560j = new Handler(c.getLooper()) {
            /* class com.tt.miniapp.debug.C65983a.HandlerC659841 */

            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != -1 || C65983a.this.f166559i) {
                    try {
                        JSONObject jSONObject = (JSONObject) message.obj;
                        AppBrandLogger.m52828d("DebugManager", "handleMessage: pageSwitchInfo: " + jSONObject);
                        if (jSONObject != null && jSONObject.has("mPageContent")) {
                            C65989c.m258429a().mo230985a(jSONObject.get("mPageContent").toString());
                        }
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "DebugManager", e.getStackTrace());
                    }
                } else {
                    C65983a.this.f166559i = true;
                    C65983a.this.mo230975b("time over 10 second");
                    C65983a.this.f166558h.mo230979a();
                }
            }
        };
    }

    /* renamed from: d */
    private void m258418d() {
        String str = this.f166552b + "&cursor=webview&role=phone";
        OkHttpClient build = new OkHttpClient.Builder().build();
        Request build2 = new Request.Builder().url(str).build();
        AppBrandLogger.m52828d("DebugManager", "run: " + str);
        this.f166560j.sendEmptyMessageDelayed(-1, 10000);
        build.newWebSocket(build2, new WebSocketListener() {
            /* class com.tt.miniapp.debug.C65983a.C659852 */

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                AppBrandLogger.m52828d("DebugManager", "onOpen remoteWsClient");
                C65983a.this.f166551a = webSocket;
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str) {
                AppBrandLogger.m52828d("DebugManager", "onMessage remoteWsClient " + str);
                if (TextUtils.equals(str, "entrustDebug")) {
                    if (C65983a.this.f166560j.hasMessages(-1)) {
                        C65983a.this.f166560j.removeMessages(-1);
                    }
                    C65983a.this.f166554d = true;
                    C65983a.this.f166556f = true;
                    C65983a aVar = C65983a.this;
                    aVar.f166553c = C65983a.this.f166552b + "&cursor=v8&role=phone";
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.tt.miniapp.debug.C65983a.C659852.RunnableC659861 */

                        public void run() {
                            WebView.setWebContentsDebuggingEnabled(true);
                            if (C65983a.this.f166558h != null && !C65983a.this.f166559i) {
                                C65983a.this.f166559i = true;
                                C65983a.this.f166558h.mo230979a();
                            }
                        }
                    });
                } else if (TextUtils.equals(str, "cancelDebug")) {
                    if (C65983a.this.f166560j.hasMessages(-1)) {
                        C65983a.this.f166560j.removeMessages(-1);
                    }
                    C65983a.this.mo230975b(str);
                    C65983a.this.mo230974b();
                } else {
                    C65989c.m258429a().mo230987b(str);
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i, String str) {
                AppBrandLogger.m52828d("DebugManager", "remoteWsClient code: " + i + " reason: " + str);
                C65983a.this.f166551a = null;
                C65983a.this.f166554d = DebugUtil.debug();
                C65983a.this.mo230974b();
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                AppBrandLogger.m52828d("DebugManager", "remoteWsClient onFailure" + th.toString());
                th.printStackTrace();
                C65983a.this.f166554d = DebugUtil.debug();
                C65983a.this.mo230974b();
            }
        });
    }

    /* renamed from: a */
    public void mo230973a(String str) {
        WebSocket webSocket = this.f166551a;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    /* renamed from: b */
    public void mo230975b(String str) {
        AppBrandLogger.m52829e("DebugManager", "close_remote_ws", str);
        WebSocket webSocket = this.f166551a;
        if (webSocket != null) {
            webSocket.close(3999, str);
        }
    }

    /* renamed from: a */
    public void mo230972a(AbstractC65988a aVar) {
        this.f166558h = aVar;
        AppBrandLogger.m52830i("DebugManager", "open debug");
        if (this.f166555e) {
            m258417c();
            m258418d();
            return;
        }
        this.f166556f = false;
        aVar.mo230979a();
        this.f166559i = true;
    }
}
