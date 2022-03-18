package com.tt.miniapp.debug;

import android.os.Process;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12808a;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.debug.c */
public class C65989c {

    /* renamed from: d */
    private static C65989c f166568d;

    /* renamed from: a */
    public String f166569a;

    /* renamed from: b */
    public Boolean f166570b = true;

    /* renamed from: c */
    public HashMap<String, WebSocket> f166571c = new HashMap<>();

    /* renamed from: e */
    private int f166572e = Process.myPid();

    /* renamed from: a */
    public static synchronized C65989c m258429a() {
        C65989c cVar;
        synchronized (C65989c.class) {
            if (f166568d == null) {
                synchronized (C65989c.class) {
                    if (f166568d == null) {
                        f166568d = new C65989c();
                    }
                }
            }
            cVar = f166568d;
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo230986b() {
        try {
            if (this.f166571c.get(this.f166569a) != null) {
                AppBrandLogger.m52828d("WebviewDebugManager", "webviewWsHash has " + this.f166569a + " && return");
                C65983a.m258415a().mo230973a("__IDE__reloadDevtool");
                return;
            }
            C12808a aVar = new C12808a();
            Request build = new Request.Builder().url(aVar.mo48369a("webview_devtools_remote_" + this.f166572e, "devtools", "page", this.f166569a)).build();
            final String str = this.f166569a;
            m258430a(aVar).newWebSocket(build, new WebSocketListener() {
                /* class com.tt.miniapp.debug.C65989c.C659912 */

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, String str) {
                    AppBrandLogger.m52828d("WebviewDebugManager", str + " webviewWsClient " + str);
                    if (C65989c.this.f166571c.size() > 0) {
                        try {
                            if (new JSONObject(str).get("method").equals("Inspector.detached")) {
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    C65983a.m258415a().mo230973a(str);
                }

                @Override // okhttp3.WebSocketListener
                public void onOpen(WebSocket webSocket, Response response) {
                    AppBrandLogger.m52828d("WebviewDebugManager", str + " webviewWsClient open");
                    if (!C65989c.this.f166570b.booleanValue()) {
                        C65983a.m258415a().mo230973a("__IDE__reloadDevtool");
                    } else {
                        C65989c.this.f166570b = false;
                        C65983a.m258415a().mo230973a("__IDE__webviewReady");
                    }
                    C65989c.this.f166571c.put(str, webSocket);
                }

                @Override // okhttp3.WebSocketListener
                public void onClosed(WebSocket webSocket, int i, String str) {
                    AppBrandLogger.m52828d("WebviewDebugManager", str + " webviewWsClient code: " + i + " reason: " + str);
                    C65989c.this.f166571c.remove(str);
                }

                @Override // okhttp3.WebSocketListener
                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    AppBrandLogger.m52828d("WebviewDebugManager", str + " webviewWsClient onFailure " + th.toString());
                    C65989c.this.f166571c.remove(str);
                    th.printStackTrace();
                }
            });
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "WebviewDebugManager", e.getStackTrace());
        }
    }

    /* renamed from: b */
    public void mo230987b(String str) {
        if (this.f166571c.get(this.f166569a) != null) {
            this.f166571c.get(this.f166569a).send(str);
        }
    }

    /* renamed from: a */
    private OkHttpClient m258430a(C12808a aVar) {
        return new OkHttpClient.Builder().socketFactory(aVar).dns(aVar).proxySelector(new ProxySelector() {
            /* class com.tt.miniapp.debug.C65989c.C659923 */

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                return null;
            }

            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                AppBrandLogger.m52829e("WebviewDebugManager", iOException.getMessage());
            }
        }).build();
    }

    /* renamed from: a */
    public void mo230985a(final String str) {
        C12808a aVar = new C12808a();
        HttpUrl a = aVar.mo48368a("webview_devtools_remote_" + this.f166572e, "json");
        AppBrandLogger.m52828d("WebviewDebugManager", "getCurWebviewTarget " + str);
        m258430a(aVar).newCall(new Request.Builder().url(a).addHeader("Host", "").build()).enqueue(new Callback() {
            /* class com.tt.miniapp.debug.C65989c.C659901 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                AppBrandLogger.m52829e("WebviewDebugManager", "onFailure: " + iOException.getMessage());
                C65989c.this.mo230985a(str);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                String str;
                if (response.body() != null) {
                    str = response.body().string();
                } else {
                    str = null;
                }
                AppBrandLogger.m52828d("WebviewDebugManager", "onResponse: " + str);
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String obj = jSONObject.get("url").toString();
                        String obj2 = jSONObject.get("id").toString();
                        String str2 = str;
                        if (str2 != null) {
                            if (obj.contains(str2)) {
                                C65989c.this.f166569a = obj2;
                                break;
                            }
                        } else if (obj.split("#").length > 1) {
                            C65989c.this.f166569a = obj2;
                            break;
                        }
                        i++;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (C65989c.this.f166569a == null) {
                    AppBrandLogger.m52829e("WebviewDebugManager", "not get curWsId");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused) {
                    }
                    C65989c.this.mo230985a(str);
                    return;
                }
                AppBrandLogger.m52828d("WebviewDebugManager", "curWsId" + C65989c.this.f166569a);
                C65989c.this.mo230986b();
            }
        });
    }
}
