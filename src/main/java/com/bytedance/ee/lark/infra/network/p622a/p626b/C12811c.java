package com.bytedance.ee.lark.infra.network.p622a.p626b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.a.b.c */
public class C12811c {

    /* renamed from: a */
    public WebSocket f34207a;

    /* renamed from: b */
    public AbstractC12821d f34208b;

    /* renamed from: c */
    public Handler f34209c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private Context f34210d;

    /* renamed from: e */
    private String f34211e;

    /* renamed from: f */
    private OkHttpClient f34212f;

    /* renamed from: g */
    private Request f34213g;

    /* renamed from: h */
    private int f34214h = -1;

    /* renamed from: i */
    private boolean f34215i;

    /* renamed from: j */
    private boolean f34216j;

    /* renamed from: k */
    private Lock f34217k;

    /* renamed from: l */
    private int f34218l = 0;

    /* renamed from: m */
    private Runnable f34219m = new Runnable() {
        /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.RunnableC128121 */

        public void run() {
            if (C12811c.this.f34208b != null) {
                C12811c.this.f34208b.mo48408a();
            }
            C12811c.this.mo48390g();
        }
    };

    /* renamed from: n */
    private WebSocketListener f34220n = new WebSocketListener() {
        /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132 */

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, final String str) {
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128163 */

                    public void run() {
                        C12811c.this.f34208b.mo48410a(str);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48410a(str);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, final Response response) {
            C12811c.this.f34207a = webSocket;
            C12811c.this.mo48382a(1);
            C12811c.this.mo48389f();
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128141 */

                    public void run() {
                        C12811c.this.f34208b.mo48412a(response);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48412a(response);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, final ByteString byteString) {
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128152 */

                    public void run() {
                        C12811c.this.f34208b.mo48413a(byteString);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48413a(byteString);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, final int i, final String str) {
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128185 */

                    public void run() {
                        C12811c.this.f34208b.mo48414b(i, str);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48414b(i, str);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, final int i, final String str) {
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128174 */

                    public void run() {
                        C12811c.this.f34208b.mo48409a(i, str);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48409a(i, str);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, final Throwable th, final Response response) {
            C12811c.this.mo48388e();
            if (C12811c.this.f34208b == null) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C12811c.this.f34209c.post(new Runnable() {
                    /* class com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c.C128132.RunnableC128196 */

                    public void run() {
                        C12811c.this.f34208b.mo48411a(th, response);
                    }
                });
            } else {
                C12811c.this.f34208b.mo48411a(th, response);
            }
        }
    };

    /* renamed from: o */
    private C12810b f34221o;

    /* renamed from: p */
    private IAppContext f34222p;

    /* renamed from: a */
    public WebSocket mo48381a() {
        return this.f34207a;
    }

    /* renamed from: f */
    public void mo48389f() {
        m52916i();
    }

    /* renamed from: b */
    public synchronized int mo48385b() {
        return this.f34214h;
    }

    /* renamed from: c */
    public void mo48386c() {
        this.f34216j = false;
        mo48390g();
    }

    /* renamed from: d */
    public void mo48387d() {
        this.f34216j = true;
        m52917j();
    }

    /* renamed from: i */
    private void m52916i() {
        this.f34209c.removeCallbacks(this.f34219m);
        this.f34218l = 0;
    }

    /* renamed from: j */
    private void m52917j() {
        AbstractC12821d dVar;
        if (this.f34214h != -1) {
            m52916i();
            OkHttpClient okHttpClient = this.f34212f;
            if (okHttpClient != null) {
                okHttpClient.dispatcher().cancelAll();
            }
            WebSocket webSocket = this.f34207a;
            if (!(webSocket == null || webSocket.close(1000, "normal close") || (dVar = this.f34208b) == null)) {
                dVar.mo48414b(CommonCode.StatusCode.API_CLIENT_EXPIRED, "abnormal close");
            }
            mo48382a(-1);
        }
    }

    /* renamed from: g */
    public synchronized void mo48390g() {
        if (!m52913a(this.f34210d)) {
            mo48382a(-1);
            return;
        }
        int b = mo48385b();
        if (!(b == 0 || b == 1)) {
            mo48382a(0);
            m52915h();
        }
    }

    /* renamed from: e */
    public void mo48388e() {
        AppBrandLogger.m52828d("tma_WsManager", "tryReconnect isNeedReconnect ", Boolean.valueOf(this.f34215i), " isManualClose ", Boolean.valueOf(this.f34216j));
        if (this.f34215i && !this.f34216j) {
            if (!m52913a(this.f34210d)) {
                mo48382a(-1);
            } else if (this.f34218l <= 3) {
                mo48382a(2);
                long j = (long) (this.f34218l * HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                Handler handler = this.f34209c;
                Runnable runnable = this.f34219m;
                if (j > 120000) {
                    j = 120000;
                }
                handler.postDelayed(runnable, j);
                this.f34218l++;
            }
        }
    }

    /* renamed from: h */
    private void m52915h() {
        if (this.f34212f == null) {
            long j = DependencyMgr.m52811b().mo48311c(this.f34222p).f34176d;
            this.f34212f = new OkHttpClient.Builder().retryOnConnectionFailure(true).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).connectTimeout(j, TimeUnit.MILLISECONDS).build();
        }
        if (this.f34213g == null) {
            Request.Builder builder = new Request.Builder();
            builder.url(this.f34211e);
            C12793a.m52873a(builder, this.f34222p, null);
            try {
                C12810b bVar = this.f34221o;
                if (bVar != null) {
                    JSONObject jSONObject = bVar.f34204d;
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            builder.addHeader(next, jSONObject.optString(next));
                        }
                    }
                    if (this.f34221o.f34205e != null) {
                        int length = this.f34221o.f34205e.length();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < length; i++) {
                            sb.append(this.f34221o.f34205e.getString(i));
                            if (i != length - 1) {
                                sb.append(",");
                            }
                        }
                        if (!TextUtils.isEmpty(sb.toString())) {
                            builder.addHeader("Sec-WebSocket-Protocol", sb.toString());
                        }
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_WsManager", e.getStackTrace());
            }
            this.f34213g = builder.build();
        }
        this.f34212f.dispatcher().cancelAll();
        try {
            this.f34217k.lockInterruptibly();
            try {
                this.f34212f.newWebSocket(this.f34213g, this.f34220n);
            } finally {
                this.f34217k.unlock();
            }
        } catch (InterruptedException e2) {
            AppBrandLogger.stacktrace(6, "tma_WsManager", e2.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.ee.lark.infra.network.a.b.c$a */
    public static final class C12820a {

        /* renamed from: a */
        public Context f34240a;

        /* renamed from: b */
        public String f34241b;

        /* renamed from: c */
        public boolean f34242c = true;

        /* renamed from: d */
        public OkHttpClient f34243d;

        /* renamed from: e */
        public C12810b f34244e;

        /* renamed from: a */
        public C12820a mo48404a(C12810b bVar) {
            this.f34244e = bVar;
            return this;
        }

        /* renamed from: a */
        public C12820a mo48405a(String str) {
            this.f34241b = str;
            return this;
        }

        public C12820a(Context context) {
            this.f34240a = context;
        }

        /* renamed from: a */
        public C12820a mo48406a(boolean z) {
            this.f34242c = z;
            return this;
        }

        /* renamed from: a */
        public C12811c mo48407a(IAppContext iAppContext) {
            return new C12811c(this, iAppContext);
        }
    }

    /* renamed from: a */
    public synchronized void mo48382a(int i) {
        this.f34214h = i;
    }

    /* renamed from: a */
    public void mo48383a(AbstractC12821d dVar) {
        this.f34208b = dVar;
    }

    /* renamed from: a */
    private boolean m52913a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    /* renamed from: a */
    private boolean m52914a(Object obj) {
        WebSocket webSocket = this.f34207a;
        boolean z = false;
        if (webSocket != null && this.f34214h == 1) {
            if (obj instanceof String) {
                z = webSocket.send((String) obj);
            } else if (obj instanceof ByteString) {
                z = webSocket.send((ByteString) obj);
            }
            if (!z) {
                mo48388e();
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo48384a(String str) {
        return m52914a((Object) str);
    }

    public C12811c(C12820a aVar, IAppContext iAppContext) {
        this.f34222p = iAppContext;
        this.f34210d = aVar.f34240a;
        this.f34211e = aVar.f34241b;
        this.f34215i = aVar.f34242c;
        this.f34212f = aVar.f34243d;
        this.f34221o = aVar.f34244e;
        this.f34217k = new ReentrantLock();
    }
}
