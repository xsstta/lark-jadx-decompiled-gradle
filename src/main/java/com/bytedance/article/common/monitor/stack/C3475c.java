package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3143y;
import com.bytedance.article.common.monitor.stack.HttpUtil;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.article.common.monitor.stack.c */
public class C3475c implements C3047b.AbstractC3052b {

    /* renamed from: a */
    public static String f10998a = "https://i.isnssdk.com/monitor/collect/c/exception";

    /* renamed from: d */
    public static final Object f10999d = new Object();

    /* renamed from: i */
    private static volatile C3475c f11000i;

    /* renamed from: j */
    private static volatile AbstractC3477a f11001j;

    /* renamed from: b */
    public volatile int f11002b;

    /* renamed from: c */
    public volatile JSONObject f11003c;

    /* renamed from: e */
    public final LinkedList<C3480f> f11004e = new LinkedList<>();

    /* renamed from: f */
    private volatile long f11005f;

    /* renamed from: g */
    private volatile boolean f11006g;

    /* renamed from: h */
    private volatile long f11007h;

    /* renamed from: k */
    private volatile C3472a f11008k;

    /* renamed from: com.bytedance.article.common.monitor.stack.c$a */
    public interface AbstractC3477a {
        /* renamed from: a */
        void mo13927a(String str);
    }

    private C3475c() {
        C3047b.m12756a().mo12883a(this);
        this.f11008k = new C3472a();
    }

    /* renamed from: a */
    public static C3475c m14705a() {
        if (f11000i == null) {
            synchronized (f10999d) {
                if (f11000i == null) {
                    f11000i = new C3475c();
                }
            }
        }
        return f11000i;
    }

    /* renamed from: c */
    private void m14707c() {
        this.f11005f = System.currentTimeMillis();
        C3047b.m12756a().mo12890b(new Runnable() {
            /* class com.bytedance.article.common.monitor.stack.C3475c.RunnableC34761 */

            public void run() {
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (C3475c.f10999d) {
                        linkedList.addAll(C3475c.this.f11004e);
                        C3475c.this.f11004e.clear();
                        C3475c.this.f11002b = 0;
                    }
                    if (!linkedList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        while (!linkedList.isEmpty()) {
                            C3480f fVar = (C3480f) linkedList.poll();
                            if (fVar != null) {
                                jSONArray.put(new JSONObject(fVar.f11011b));
                            }
                        }
                        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                        if (C3475c.this.f11003c == null) {
                            C3475c.this.f11003c = C2785b.m11774o();
                        }
                        jSONObject.put("header", C3475c.this.f11003c);
                        C3475c.this.mo13921a(C3475c.f10998a, jSONObject.toString());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo13924b() {
        if (!ApmDelegate.m12591a().mo12794g() || ApmDelegate.m12591a().mo12782a("exception_filter_network")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m14706a(String str) {
        f10998a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo13925b(String str) {
        return ApmDelegate.m12591a().mo12782a(str);
    }

    @Override // com.bytedance.apm.p153n.C3047b.AbstractC3052b
    public void onTimeEvent(long j) {
        try {
            if (this.f11008k != null) {
                this.f11008k.mo13918a();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f11005f > 1200000 && this.f11002b > 0) || this.f11002b > 20) {
                m14707c();
            }
            if (this.f11006g && currentTimeMillis - this.f11007h > 1800000) {
                this.f11006g = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo13921a(String str, String str2) {
        try {
            if (ApmDelegate.m12591a().mo12794g()) {
                HttpUtil.m14683a(1048576, C3143y.m13089a(str, C2785b.m11773n()), str2.getBytes(), HttpUtil.CompressType.GZIP, "application/json; charset=utf-8", true);
            }
        } catch (Throwable th) {
            int i = -1;
            if (th instanceof HttpResponseException) {
                i = th.getStatusCode();
            }
            if (i >= 500 && i <= 600) {
                this.f11007h = System.currentTimeMillis();
                this.f11006g = true;
            }
        }
    }

    /* renamed from: a */
    public void mo13923a(Throwable th, String str) {
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            String className = stackTrace[0].getClassName();
            String methodName = stackTrace[0].getMethodName();
            int lineNumber = stackTrace[0].getLineNumber();
            String a = C3479e.m14715a(th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("class_ref", className);
            jSONObject.put("method", methodName);
            jSONObject.put("line_num", lineNumber);
            jSONObject.put("stack", a);
            jSONObject.put("exception_type", 1);
            jSONObject.put("is_core", 1);
            jSONObject.put("message", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
            if (this.f11003c == null) {
                this.f11003c = C2785b.m11774o();
            }
            jSONObject2.put("header", this.f11003c);
            HttpUtil.m14683a(1048576, C3143y.m13089a(f10998a, C2785b.m11773n()), jSONObject2.toString().getBytes(), HttpUtil.CompressType.GZIP, "application/json; charset=utf-8", true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo13922a(String str, String str2, String str3, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                boolean z2 = false;
                if (z) {
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("log_type", "log_exception");
                    if (str3 != null) {
                        if (str3.length() > 10240) {
                            jSONObject.put("extraMessage", str3.substring(0, 10240));
                        } else {
                            jSONObject.put("extraMessage", str3);
                        }
                    }
                    if (f11001j != null) {
                        f11001j.mo13927a(jSONObject.toString());
                    }
                }
                if (ApmDelegate.m12591a().mo12794g()) {
                    boolean b = mo13925b(str);
                    boolean b2 = ApmDelegate.m12591a().mo12786b(str3);
                    if ((b || b2) && !this.f11006g) {
                        synchronized (f10999d) {
                            int size = this.f11004e.size();
                            if (size >= 20) {
                                z2 = true;
                            }
                            this.f11004e.add(new C3480f(str, str2));
                            this.f11002b = size + 1;
                        }
                        if (z2) {
                            m14707c();
                        }
                    }
                } else if (this.f11008k != null) {
                    this.f11008k.mo13919a(str, str2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
