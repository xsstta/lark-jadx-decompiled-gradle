package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.dispatcher.C13953a;
import com.bytedance.frameworks.baselib.network.dispatcher.C13961e;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.C13982b;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13994c;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.IMetricsCollect;
import com.bytedance.retrofit2.IRequestInfo;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.a */
public class C13989a implements WeakHandler.IHandler, IMetricsCollect, IRequestInfo, AbstractC20594b {

    /* renamed from: C */
    private static Class f36599C;

    /* renamed from: E */
    private static boolean f36600E = false;

    /* renamed from: c */
    static final /* synthetic */ boolean f36601c;

    /* renamed from: d */
    private static final String f36602d;

    /* renamed from: w */
    private static HandlerThread f36603w = m56582a("Concurrent-Handler");

    /* renamed from: z */
    private static boolean f36604z;

    /* renamed from: A */
    private boolean f36605A;

    /* renamed from: B */
    private long f36606B;

    /* renamed from: D */
    private String f36607D;

    /* renamed from: a */
    public C20639k f36608a;

    /* renamed from: b */
    public BaseHttpRequestInfo f36609b = BaseHttpRequestInfo.createHttpRequestInfo();

    /* renamed from: e */
    private volatile long f36610e;

    /* renamed from: f */
    private boolean f36611f;

    /* renamed from: g */
    private String f36612g;

    /* renamed from: h */
    private volatile boolean f36613h;

    /* renamed from: i */
    private Request f36614i;

    /* renamed from: j */
    private String f36615j;

    /* renamed from: k */
    private long f36616k;

    /* renamed from: l */
    private String f36617l;

    /* renamed from: m */
    private String f36618m;

    /* renamed from: n */
    private List<String> f36619n = new ArrayList();

    /* renamed from: o */
    private final Object f36620o = new Object();

    /* renamed from: p */
    private volatile AtomicInteger f36621p = new AtomicInteger(0);

    /* renamed from: q */
    private List<HttpURLConnection> f36622q = new CopyOnWriteArrayList();

    /* renamed from: r */
    private volatile boolean f36623r = false;

    /* renamed from: s */
    private volatile HttpURLConnection f36624s = null;

    /* renamed from: t */
    private List<C13991a> f36625t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private volatile int f36626u = 0;

    /* renamed from: v */
    private CountDownLatch f36627v = new CountDownLatch(1);

    /* renamed from: x */
    private WeakHandler f36628x = new WeakHandler(f36603w.getLooper(), this);

    /* renamed from: y */
    private long f36629y;

    /* renamed from: a */
    public static HandlerThread m56582a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.bytedance.retrofit2.IRequestInfo
    public Object getRequestInfo() {
        return this.f36609b;
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: a */
    public Response mo51523a() {
        boolean z;
        Throwable th;
        TypedByteArray typedByteArray;
        InputStream errorStream;
        C20639k kVar = this.f36608a;
        if (kVar != null) {
            kVar.f50280j = System.currentTimeMillis();
        }
        if (!this.f36613h) {
            String str = f36602d;
            Logger.m15167d(str, "Execute url: " + this.f36615j);
            C13998f.m56638a(this.f36611f, (String) null);
            m56588c();
            try {
                this.f36627v.await(this.f36606B, TimeUnit.MILLISECONDS);
                this.f36627v.countDown();
                synchronized (this.f36620o) {
                    if (!this.f36613h) {
                        z = false;
                        if (this.f36624s == null) {
                            C13994c.m56604a().mo51534a(this.f36618m, false);
                            if (this.f36625t.size() <= 0 || this.f36625t.get(0).f36638g == null) {
                                throw m56584a(new IOException("All urls have been tried and timed out by max wait time."), this.f36615j, this.f36624s);
                            }
                            throw this.f36625t.get(0).f36638g;
                        }
                        this.f36622q.remove(this.f36624s);
                    } else {
                        throw new IOException("request canceled");
                    }
                }
                m56591f();
                try {
                    C13994c.m56604a().mo51534a(this.f36618m, f36601c);
                    int a = m56580a(this.f36624s.getResponseCode());
                    this.f36609b.responseBack = System.currentTimeMillis();
                    this.f36609b.recycleCount = -1;
                    this.f36612g = C13998f.m56623a(this.f36624s, this.f36609b, a);
                    this.f36607D = C13998f.m56624a(this.f36624s, "Content-Type");
                    if (!this.f36614i.isResponseStreaming()) {
                        int maxLength = this.f36614i.getMaxLength();
                        this.f36609b.contentType = C13998f.m56654j(this.f36607D);
                        typedByteArray = new TypedByteArray(this.f36607D, C13998f.m56641a(this.f36615j, maxLength, this.f36624s, this.f36616k, this.f36609b, this.f36612g, a, this.f36608a), new String[0]);
                    } else if ((a < 200 || a >= 300) && !C13998f.m56640a(this.f36609b)) {
                        String responseMessage = this.f36624s.getResponseMessage();
                        try {
                            int maxLength2 = this.f36614i.getMaxLength();
                            try {
                                errorStream = this.f36624s.getInputStream();
                            } catch (Exception unused) {
                                errorStream = this.f36624s.getErrorStream();
                            }
                            C13998f.m56639a(false, this.f36624s.getHeaderFields(), maxLength2, errorStream, this.f36607D, this.f36615j, this.f36608a);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            StringBuilder sb = new StringBuilder();
                            sb.append("reason = ");
                            if (responseMessage == null) {
                                responseMessage = "";
                            }
                            sb.append(responseMessage);
                            sb.append("  exception = ");
                            sb.append(th2.getMessage());
                            responseMessage = sb.toString();
                        }
                        this.f36624s.disconnect();
                        throw new HttpResponseException(a, responseMessage);
                    } else {
                        typedByteArray = m56583a(this.f36624s);
                    }
                    Response response = new Response(this.f36615j, a, this.f36624s.getResponseMessage(), C13998f.m56626a(this.f36624s, f36600E), typedByteArray);
                    response.setExtraInfo(this.f36609b);
                    if (!this.f36614i.isResponseStreaming()) {
                        C13998f.m56634a(this.f36624s);
                    }
                    return response;
                } catch (Exception e) {
                    throw m56584a(e, this.f36615j, this.f36624s);
                } catch (Throwable th3) {
                    th = th3;
                    z = f36601c;
                    C13998f.m56634a(this.f36624s);
                    throw th;
                }
            } catch (Exception e2) {
                m56591f();
                throw m56584a(e2, this.f36615j, this.f36624s);
            }
        } else {
            throw new IOException("request canceled");
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: a */
    public boolean mo51524a(long j) {
        this.f36610e = j;
        if (this.f36624s != null) {
            try {
                Reflect.on(this.f36624s).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return f36601c;
    }

    /* renamed from: d */
    private void m56589d() {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this;
        this.f36628x.sendMessage(obtain);
    }

    @Override // com.bytedance.retrofit2.IMetricsCollect
    public void doCollect() {
        C13998f.m56635a(this.f36624s, this.f36609b, this.f36608a);
    }

    static {
        try {
            f36599C = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        f36603w.start();
    }

    /* renamed from: e */
    private void m56590e() {
        if (this.f36628x.obtainMessage(0) != null) {
            this.f36628x.removeMessages(0);
            m56588c();
        }
    }

    /* renamed from: c */
    private void m56588c() {
        C13961e.m56474b().mo51330b(new C13953a("Concurrent-Call", IRequest.Priority.IMMEDIATE, 0, new Runnable() {
            /* class com.bytedance.frameworks.baselib.network.http.cronet.impl.$$Lambda$a$uwxshhWWIjg24DwOvrCQ0Dw5tek */

            public final void run() {
                C13989a.lambda$uwxshhWWIjg24DwOvrCQ0Dw5tek(C13989a.this);
            }
        }, this.f36609b.downloadFile));
        m56587b(this.f36629y);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.a$a */
    public static class C13991a {

        /* renamed from: a */
        int f36632a = -1;

        /* renamed from: b */
        String f36633b;

        /* renamed from: c */
        long f36634c;

        /* renamed from: d */
        long f36635d;

        /* renamed from: e */
        int f36636e;

        /* renamed from: f */
        int f36637f;

        /* renamed from: g */
        IOException f36638g;

        /* renamed from: a */
        public JSONObject mo51531a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("host", this.f36633b);
                jSONObject.put("start", this.f36634c);
                jSONObject.put("end", this.f36635d);
                jSONObject.put("net_error", this.f36636e);
                jSONObject.put("code", this.f36637f);
                IOException iOException = this.f36638g;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (!TextUtils.isEmpty(message) && message.length() > 64) {
                        message = message.substring(0, 64);
                    }
                    jSONObject.put(ApiHandler.API_CALLBACK_EXCEPTION, message);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        C13991a(String str) {
            this.f36633b = str;
            this.f36634c = System.currentTimeMillis();
            this.f36636e = 0;
            this.f36637f = -1;
        }
    }

    /* renamed from: f */
    private void m56591f() {
        this.f36628x.removeCallbacksAndMessages(null);
        synchronized (this.f36620o) {
            if (!this.f36623r) {
                for (HttpURLConnection httpURLConnection : this.f36622q) {
                    if (httpURLConnection != null) {
                        Iterator<C13991a> it = this.f36625t.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13991a next = it.next();
                            if (next.f36632a == httpURLConnection.hashCode()) {
                                next.f36635d = System.currentTimeMillis();
                                next.f36636e = -999;
                                next.f36638g = new IOException("cleanupMessagesAndPendingConnections");
                                break;
                            }
                        }
                        httpURLConnection.disconnect();
                        this.f36622q.remove(httpURLConnection);
                    }
                }
                this.f36608a.f50273c = m56592g();
                this.f36623r = f36601c;
            }
        }
    }

    /* renamed from: g */
    private JSONObject m56592g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("concurrent", this.f36625t.size() - 1);
            jSONObject.put("duration", System.currentTimeMillis() - this.f36616k);
            JSONArray jSONArray = new JSONArray();
            for (C13991a aVar : this.f36625t) {
                jSONArray.put(aVar.mo51531a());
            }
            jSONObject.put("tasks", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: b */
    public void mo51525b() {
        Logger.m15167d(f36602d, "cancel countdown.");
        synchronized (this.f36620o) {
            this.f36627v.countDown();
            m56591f();
            if (this.f36624s != null) {
                this.f36624s.disconnect();
                if (this.f36614i.isResponseStreaming() && !this.f36613h) {
                    doCollect();
                    this.f36609b.contentType = C13998f.m56654j(this.f36607D);
                    this.f36609b.requestEnd = System.currentTimeMillis();
                    if (this.f36609b.reqContext == null || this.f36609b.reqContext.is_need_monitor_in_cancel) {
                        long j = this.f36609b.requestEnd;
                        long j2 = this.f36616k;
                        NetworkParams.monitorApiSample(j - j2, j2, this.f36614i.getUrl(), this.f36612g, this.f36609b);
                    }
                    C14001g.m56679a().mo51563a(this.f36614i.getUrl(), this.f36609b.sentByteCount, this.f36609b.receivedByteCount, this.f36609b.contentType, this.f36609b.requestLog);
                }
            }
            this.f36613h = f36601c;
        }
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cc, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.impl.C13994c.m56604a().mo51535a(r5, r14.f36618m) != false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        com.bytedance.common.utility.Logger.m15167d(com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.f36602d, "inBlockErrorCode countdown.");
        r14.f36627v.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e5, code lost:
        if ((android.os.SystemClock.uptimeMillis() - r0) < r14.f36629y) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e7, code lost:
        m56589d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.m56619a(r14.f36614i, r12);
        r13.f36637f = r2;
        r13.f36635d = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (m56586a(r2, r12.getHeaderField("tt-api-source-5xx"), r14.f36618m) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r2 = r14.f36620o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r14.f36624s != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r14.f36624s = r12;
        r14.f36615j = r4;
        com.bytedance.common.utility.Logger.m15167d(r5, "Find winner connection countdown.");
        r14.f36627v.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (r12 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d1, code lost:
        r12.disconnect();
        r14.f36622q.remove(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r3 = r12.getResponseMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r7 = r14.f36614i.getMaxLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5 = r12.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        r5 = r12.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        r5.printStackTrace();
        r6 = new java.lang.StringBuilder();
        r6.append("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        if (r3 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        r6.append(r3);
        r6.append("  exception = ");
        r6.append(r5.getMessage());
        r3 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0148, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0149, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0155, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r6 = com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.f36599C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0160, code lost:
        r5 = ((java.lang.Integer) com.bytedance.common.utility.reflect.Reflect.on(r2).call("getCronetInternalErrorCode").get()).intValue();
        com.bytedance.common.utility.Logger.m15167d(com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.f36602d, "cronet error code: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018c, code lost:
        if (r12 != null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0191, code lost:
        if (r13 != null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0193, code lost:
        r13.f36638g = m56584a(r2, r4, r12);
        r13.f36636e = r5;
        r13.f36635d = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a1, code lost:
        r14.f36622q.remove(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a6, code lost:
        r2 = r14.f36626u + 1;
        r14.f36626u = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b2, code lost:
        if (r2 >= r14.f36619n.size()) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b4, code lost:
        com.bytedance.common.utility.Logger.m15167d(com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.f36602d, "Try all urls failed countdown.");
        r14.f36627v.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0155  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ void m56593h() {
        /*
        // Method dump skipped, instructions count: 495
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.m56593h():void");
    }

    /* renamed from: b */
    private void m56587b(long j) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this;
        this.f36628x.sendMessageDelayed(obtain, j);
    }

    /* renamed from: a */
    private int m56580a(int i) {
        if (C13998f.m56647b(this.f36624s, this.f36609b, i)) {
            return m56581a(f36601c);
        }
        if (this.f36609b.executeTuringCallback) {
            f36600E = f36601c;
        }
        return i;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && (message.obj instanceof C13989a)) {
            try {
                int i = message.what;
                if (i == 0) {
                    ((C13989a) message.obj).m56588c();
                } else if (i == 1) {
                    ((C13989a) message.obj).m56590e();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private int m56581a(boolean z) {
        if (this.f36624s != null) {
            this.f36624s.disconnect();
        }
        String url = this.f36614i.getUrl();
        try {
            this.f36624s = C13998f.m56625a(url, this.f36614i, this.f36609b, this.f36610e);
            if (z) {
                this.f36609b.bdTuringRetry = f36601c;
                this.f36624s.addRequestProperty("x-tt-bdturing-retry", "1");
            }
            return C13998f.m56619a(this.f36614i, this.f36624s);
        } catch (Exception e) {
            C13998f.m56631a(url, this.f36616k, this.f36609b, this.f36612g, e, this.f36624s, this.f36608a);
            this.f36613h = f36601c;
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    /* renamed from: a */
    private TypedInput m56583a(final HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        if (httpURLConnection.getContentLength() != 0) {
            return new TypedInput() {
                /* class com.bytedance.frameworks.baselib.network.http.cronet.impl.C13989a.C139901 */

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public long length() {
                    return (long) httpURLConnection.getContentLength();
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public String mimeType() {
                    return C13998f.m56624a(httpURLConnection, "Content-Type");
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public InputStream in() {
                    InputStream inputStream;
                    try {
                        inputStream = StreamParser.processInputStream(httpURLConnection.getInputStream(), httpURLConnection.getHeaderFields(), false, C13989a.this.f36608a);
                    } catch (Exception e) {
                        if (C13998f.m56640a(C13989a.this.f36609b)) {
                            inputStream = httpURLConnection.getErrorStream();
                        } else {
                            String responseMessage = httpURLConnection.getResponseMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("reason = ");
                            if (responseMessage == null) {
                                responseMessage = "";
                            }
                            sb.append(responseMessage);
                            sb.append("  exception = ");
                            sb.append(e.getMessage());
                            throw new HttpResponseException(httpURLConnection.getResponseCode(), sb.toString());
                        }
                    }
                    return new C13982b(inputStream, C13989a.this);
                }
            };
        }
        mo51525b();
        return null;
    }

    /* renamed from: a */
    private void m56585a(Request request) {
        this.f36606B = (long) (NetworkParams.getConnectTimeout() + NetworkParams.getIoTimeout());
        if (request.getExtraInfo() instanceof BaseRequestContext) {
            BaseRequestContext baseRequestContext = (BaseRequestContext) request.getExtraInfo();
            if (baseRequestContext.protect_timeout > 0) {
                this.f36606B = baseRequestContext.protect_timeout;
            } else if (baseRequestContext.timeout_connect > 0 && baseRequestContext.timeout_read > 0) {
                this.f36606B = baseRequestContext.timeout_connect + baseRequestContext.timeout_read;
            }
        }
        this.f36606B += 1000;
    }

    public C13989a(Request request, C13994c.C13995a aVar) {
        Logger.m15167d(f36602d, "Request url: " + request.getUrl());
        this.f36614i = request;
        this.f36608a = request.getMetrics();
        String url = request.getUrl();
        this.f36615j = url;
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        String str = scheme + "://" + parse.getHost();
        String query = parse.getQuery();
        Iterator<String> it = aVar.mo51537a().iterator();
        int i = 0;
        while (it.hasNext()) {
            String replaceFirst = this.f36615j.replaceFirst(str, scheme + "://" + it.next());
            if (!TextUtils.isEmpty(query)) {
                if (!query.contains("concurrent=")) {
                    replaceFirst = replaceFirst + "&concurrent=" + i;
                }
                if (i > 0 && !query.contains("is_retry=")) {
                    replaceFirst = replaceFirst + "&is_retry=1";
                }
            }
            i++;
            this.f36619n.add(replaceFirst);
        }
        if (f36601c || this.f36619n.size() >= 2) {
            this.f36617l = UUID.randomUUID().toString();
            this.f36618m = aVar.f36667i;
            this.f36629y = (long) aVar.f36671m;
            f36604z = aVar.f36672n;
            this.f36605A = aVar.f36673o;
            m56585a(request);
            Logger.m15167d(f36602d, "Request max wait time milliseconds: " + this.f36606B + ", connect interval milliseconds: " + this.f36629y);
            C20639k kVar = this.f36608a;
            if (kVar != null) {
                kVar.f50274d = this.f36617l;
                this.f36608a.f50275e = f36601c;
                this.f36609b.appLevelRequestStart = this.f36608a.f50277g;
                this.f36609b.beforeAllInterceptors = this.f36608a.f50278h;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f36616k = currentTimeMillis;
            this.f36609b.requestStart = currentTimeMillis;
            this.f36609b.httpClientType = 0;
            if (this.f36614i.isResponseStreaming()) {
                this.f36609b.downloadFile = f36601c;
            } else {
                this.f36609b.downloadFile = false;
            }
            if (request.getExtraInfo() instanceof BaseRequestContext) {
                this.f36609b.reqContext = (T) ((BaseRequestContext) request.getExtraInfo());
                this.f36611f = this.f36609b.reqContext.bypass_network_status_check;
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private IOException m56584a(Exception exc, String str, HttpURLConnection httpURLConnection) {
        if ((exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        int i = 0;
        if ("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(exc.getClass().getName()) || "com.ttnet.org.chromium.net.impl.QuicExceptionImpl".equals(exc.getClass().getName())) {
            i = C13998f.m56648c(httpURLConnection);
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f36615j;
        }
        C13998f.m56631a(str, this.f36616k, this.f36609b, this.f36612g, exc, httpURLConnection, this.f36608a);
        try {
            C13998f.m56638a(this.f36611f, exc.getMessage());
            return new CronetIOException(exc, this.f36609b, this.f36612g, i);
        } catch (NetworkNotAvailabeException e) {
            return e;
        }
    }

    /* renamed from: a */
    private static boolean m56586a(int i, String str, String str2) {
        if (i >= 200 && i < 300) {
            return false;
        }
        if (str != null && str.equals("1")) {
            return false;
        }
        if ((i < 300 || i >= 600 || f36604z) && !C13994c.m56604a().mo51535a(i, str2)) {
            return f36601c;
        }
        return false;
    }
}
