package com.tt.miniapp.net;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.cookie.p618c.C12760a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.AbstractC12823a;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12826d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.network.p633e.C12835b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.littleapp.p2128e.p2130b.C41325a;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.net.p3309b.C66510b;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.TimeMeter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.j */
public class C66528j {

    /* renamed from: f */
    private static final List<String> f167944f = C12768c.m52791a().f34154a;

    /* renamed from: a */
    public ConcurrentHashMap<String, Long> f167945a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public String f167946b;

    /* renamed from: c */
    public IAppContext f167947c;

    /* renamed from: d */
    public SparseArray<AbstractC12823a> f167948d = new SparseArray<>();

    /* renamed from: e */
    public List<Integer> f167949e = new ArrayList();

    /* renamed from: a */
    public void mo232095a(final int i, final C66533b bVar, final AbstractC67550j.AbstractC67551a<IApiOutputParam> aVar) {
        this.f167949e.add(Integer.valueOf(i));
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        Observable.create(new Function<C66534c>() {
            /* class com.tt.miniapp.net.C66528j.C665302 */

            /* renamed from: a */
            public C66534c fun() {
                boolean z;
                C66534c cVar = new C66534c(bVar.f167961a, false, 0, "", "", "", "");
                try {
                    String host = Uri.parse(bVar.f167962b).getHost();
                    C66533b bVar = bVar;
                    if (!C66528j.this.f167945a.containsKey(host)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f167970j = z;
                    if (bVar.f167970j) {
                        C66528j.this.f167945a.put(host, 0L);
                    }
                    C66528j jVar = C66528j.this;
                    return jVar.mo232093a(jVar.f167947c, bVar.f167961a, bVar.f167962b, bVar.f167964d, bVar.f167965e, bVar.f167969i, bVar.f167966f, bVar.f167963c, bVar.f167967g, bVar.f167968h);
                } catch (Exception e) {
                    e.printStackTrace();
                    AppBrandLogger.m52829e("tma_RequestManagerV2", "request", e);
                    cVar.f167979i = e.toString();
                    return cVar;
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<C66534c>() {
            /* class com.tt.miniapp.net.C66528j.C665291 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                try {
                    C66705d.C66708b bVar = new C66705d.C66708b();
                    bVar.f168400b = "fail";
                    bVar.f168401c = "request:fail " + th.toString();
                    bVar.f168408j = "server error";
                    aVar.onNativeModuleCall(bVar);
                    C66528j.this.mo232097a(false, bVar.f167970j, C66528j.this.f167946b, newAndStart.stop(), bVar.f167962b, bVar.f168401c, C66528j.this.f167947c);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_RequestManagerV2", e);
                    C66528j jVar = C66528j.this;
                    boolean z = bVar.f167970j;
                    String str = C66528j.this.f167946b;
                    long stop = newAndStart.stop();
                    String str2 = bVar.f167962b;
                    jVar.mo232097a(false, z, str, stop, str2, "error in error " + e.toString(), C66528j.this.f167947c);
                }
            }

            /* renamed from: a */
            public void onSuccess(C66534c cVar) {
                long j;
                int i;
                String str;
                char c;
                Exception e;
                String str2;
                String str3;
                long stop = newAndStart.stop();
                AppBrandLogger.m52828d("tma_RequestManagerV2", " requestId ", C66528j.this.f167946b, Integer.valueOf(cVar.f167971a), Long.valueOf(stop), "  header ", cVar.f167975e, "dataType ", cVar.f167976f, " responseType ", cVar.f167977g, " data = ", cVar.f167974d);
                try {
                    if (!C66528j.this.f167949e.contains(Integer.valueOf(i)) && C66528j.this.f167948d.get(bVar.f167961a).mo48416b()) {
                        cVar.f167972b = false;
                        cVar.f167979i = "abort";
                    }
                    C66705d.C66708b bVar = new C66705d.C66708b();
                    if (cVar.f167972b) {
                        str2 = "success";
                    } else {
                        str2 = "fail";
                    }
                    bVar.f168400b = str2;
                    if (cVar.f167972b) {
                        str3 = "request:ok";
                    } else {
                        str3 = "request:fail " + cVar.f167979i;
                    }
                    bVar.f168401c = str3;
                    bVar.f168399a = cVar.f167971a;
                    if (!TextUtils.isEmpty(cVar.f167975e)) {
                        bVar.f168403e = new JSONObject(cVar.f167975e);
                    }
                    bVar.f168404f = cVar.f167973c + "";
                    bVar.f168406h = cVar.f167980j;
                    if (cVar.f167977g.equals("arraybuffer")) {
                        C66701c.C66703b.C66704a aVar = new C66701c.C66703b.C66704a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, cVar.f167978h);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        bVar.f168407i = arrayList;
                    } else {
                        bVar.f168408j = cVar.f167974d;
                    }
                    aVar.onNativeModuleCall(bVar);
                    C66528j jVar = C66528j.this;
                    boolean z = cVar.f167972b;
                    boolean z2 = bVar.f167970j;
                    String str4 = C66528j.this.f167946b;
                    String str5 = bVar.f167962b;
                    String str6 = bVar.f168401c;
                    j = stop;
                    str = "tma_RequestManagerV2";
                    i = 1;
                    c = 0;
                    try {
                        jVar.mo232097a(z, z2, str4, stop, str5, str6, C66528j.this.f167947c);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = stop;
                    c = 0;
                    i = 1;
                    str = "tma_RequestManagerV2";
                    C66705d.C66708b bVar2 = new C66705d.C66708b();
                    bVar2.f168400b = "fail";
                    bVar2.f168401c = "request:fail " + e.toString();
                    bVar2.f168408j = "unknown error";
                    aVar.onNativeModuleCall(bVar2);
                    Object[] objArr = new Object[i];
                    objArr[c] = e;
                    AppBrandLogger.m52829e(str, objArr);
                    C66528j.this.mo232097a(false, bVar.f167970j, C66528j.this.f167946b, j, bVar.f167962b, bVar2.f168401c, C66528j.this.f167947c);
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo232096a(Integer num) {
        if (this.f167948d.get(num.intValue()) != null) {
            this.f167948d.get(num.intValue()).mo48415a();
        }
        this.f167949e.remove(num);
        AppBrandLogger.m52828d("tma_RequestManagerV2", this.f167948d.get(num.intValue()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C66532a> mo232094a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new C66532a(next, jSONObject.optString(next)));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo232097a(boolean z, boolean z2, String str, long j, String str2, String str3, IAppContext iAppContext) {
        if (Math.random() <= 0.05d || z2) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            } else if (str2.contains("?")) {
                str2 = str2.substring(0, str2.indexOf("?"));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_msg", str3);
                jSONObject.put("url_path", str2);
                jSONObject.put("request_type", str);
                jSONObject.put("first_domain_req", z2);
                AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
                if (!(appInfo == null || appInfo.appId == null || appInfo.version == null)) {
                    jSONObject.put("app_id", appInfo.appId);
                    jSONObject.put("app_version", appInfo.version);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                int i = !z ? 9100 : 0;
                jSONObject.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, C12835b.m53006b(AppbrandContext.getInst().getApplicationContext()));
                jSONObject.put("net_available", C12835b.m53005a(AppbrandContext.getInst().getApplicationContext()));
                AppBrandLogger.m52828d("tma_RequestManagerV2", "mp_ttrequest_result", Integer.valueOf(i), jSONObject2, jSONObject);
                C67509b.m262588a("mp_ttrequest_result", i, jSONObject2, jSONObject, iAppContext);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("tma_RequestManagerV2", th);
            }
        }
    }

    /* renamed from: a */
    private long m259941a() {
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f167947c).getAppConfig();
        if (appConfig != null) {
            return appConfig.mo230046g().f34173a;
        }
        return 60000;
    }

    /* renamed from: com.tt.miniapp.net.j$c */
    public static class C66534c {

        /* renamed from: a */
        public int f167971a;

        /* renamed from: b */
        public boolean f167972b;

        /* renamed from: c */
        public int f167973c;

        /* renamed from: d */
        public String f167974d;

        /* renamed from: e */
        public String f167975e;

        /* renamed from: f */
        public String f167976f;

        /* renamed from: g */
        public String f167977g;

        /* renamed from: h */
        public byte[] f167978h;

        /* renamed from: i */
        public String f167979i = "";

        /* renamed from: j */
        public int f167980j = -1;

        /* renamed from: k */
        public Exception f167981k;

        public C66534c(Exception exc) {
            this.f167981k = exc;
        }

        public C66534c(int i, boolean z, int i2, String str, String str2, String str3, String str4) {
            this.f167971a = i;
            this.f167972b = z;
            this.f167973c = i2;
            this.f167974d = str;
            this.f167975e = str2;
            this.f167976f = str3;
            this.f167977g = str4;
        }

        public C66534c(int i, boolean z, int i2, byte[] bArr, String str, String str2, String str3) {
            this.f167971a = i;
            this.f167972b = z;
            this.f167973c = i2;
            this.f167978h = bArr;
            this.f167975e = str;
            this.f167976f = str2;
            this.f167977g = str3;
        }
    }

    public C66528j(IAppContext iAppContext) {
        this.f167947c = iAppContext;
        this.f167946b = C66497a.m259866a();
    }

    /* renamed from: a */
    public static C66528j m259943a(IAppContext iAppContext) {
        AppbrandApplicationImpl.getInst(iAppContext).setRequestVersion("v2");
        return C67485a.m262488a(iAppContext).mo234291l();
    }

    /* renamed from: a */
    public C12830f mo232092a(C12827e eVar) {
        String str = this.f167946b;
        str.hashCode();
        if (str.equals("ttnet")) {
            return C66434g.m259707a().mo231986b(eVar, this.f167947c);
        }
        if (!str.equals("httpdns")) {
            return m259942a(eVar, false);
        }
        return m259942a(eVar, true);
    }

    /* renamed from: com.tt.miniapp.net.j$a */
    public static class C66532a {

        /* renamed from: a */
        String f167959a;

        /* renamed from: b */
        String f167960b;

        public C66532a(String str, String str2) {
            this.f167959a = str;
            this.f167960b = str2;
        }
    }

    /* renamed from: a */
    private Map<String, String> m259944a(String str, String str2) {
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap();
        List<C66532a> a = mo232094a(str2);
        Iterator<String> it = f167944f.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (str.contains(it.next())) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        String str3 = null;
        if (z2 && C67432a.m262319a(this.f167947c).getAppInfo().innertype == 1) {
            str3 = C67556a.m262928a();
            AppBrandLogger.m52828d("tma_RequestManagerV2", "cookie ", str3);
        }
        for (C66532a aVar : a) {
            if (aVar.f167959a.equalsIgnoreCase("Referer")) {
                break;
            } else if (!z2 || !aVar.f167959a.equalsIgnoreCase("Cookie")) {
                hashMap.put(aVar.f167959a, aVar.f167960b);
            } else {
                String str4 = aVar.f167960b;
                if (!TextUtils.isEmpty(str4)) {
                    if (!TextUtils.isEmpty(str3)) {
                        str4 = str4 + "; " + str3;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        hashMap.put(aVar.f167959a, str4);
                    }
                } else if (!TextUtils.isEmpty(str3)) {
                    hashMap.put(aVar.f167959a, str3);
                }
                z = true;
            }
        }
        if (!z && z2 && !TextUtils.isEmpty(str3)) {
            hashMap.put("Cookie", str3);
        }
        hashMap.put("User-Agent", C67070z.m261387a(this.f167947c));
        hashMap.put("referer", C41325a.m163829a(this.f167947c));
        return hashMap;
    }

    /* renamed from: a */
    private C12830f m259942a(C12827e eVar, boolean z) {
        C12830f fVar = new C12830f(this.f167947c);
        try {
            String m = eVar.mo48450m();
            Request.Builder builder = new Request.Builder();
            builder.url(m);
            String q = eVar.mo48454q();
            if (!q.equals("GET")) {
                String i = eVar.mo48446i();
                MediaType parse = i != null ? MediaType.parse(i) : null;
                byte[] h = eVar.mo48445h();
                if (h == null) {
                    h = new byte[0];
                }
                builder.method(q, RequestBody.create(parse, h));
            }
            String str = "";
            for (Map.Entry<String, String> entry : eVar.mo48449l().entrySet()) {
                String key = entry.getKey();
                builder.addHeader(key, entry.getValue());
                if (key.equalsIgnoreCase(ConvertOfficeToSpaceService.f88309g)) {
                    str = entry.getValue();
                }
            }
            Call a = m259945a(z, builder, eVar.mo48453p(), str);
            if (a != null) {
                final WeakReference weakReference = new WeakReference(a);
                eVar.mo48430a(new C12827e.AbstractC12828a() {
                    /* class com.tt.miniapp.net.C66528j.C665313 */

                    @Override // com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e.AbstractC12828a
                    /* renamed from: a */
                    public void mo48456a() {
                        Call call = (Call) weakReference.get();
                        if (call != null) {
                            call.cancel();
                        }
                    }
                });
                Response execute = a.execute();
                fVar.mo48459a(execute.code());
                Headers headers = execute.headers();
                if (headers != null) {
                    int size = headers.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String name = headers.name(i2);
                        String value = headers.value(i2);
                        C12826d dVar = null;
                        for (C12826d dVar2 : fVar.mo48470h()) {
                            if (dVar2.mo48423a().equals(name)) {
                                dVar = dVar2;
                            }
                        }
                        if (dVar == null) {
                            fVar.mo48470h().add(new C12826d(name, value));
                        } else {
                            dVar.mo48424a(dVar.mo48425b() + "," + value);
                        }
                    }
                }
                fVar.mo48462a(execute.body().bytes());
                return fVar;
            }
            throw new Exception("create get request error");
        } catch (Throwable th) {
            fVar.mo48461a(th);
            fVar.mo48460a(th.toString());
        }
    }

    /* renamed from: a */
    private synchronized Call m259945a(boolean z, Request.Builder builder, long j, String str) {
        OkHttpClient.Builder readTimeout;
        readTimeout = C66517e.m259917a().newBuilder().addInterceptor(new C12760a(str)).connectTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS);
        if (z) {
            C66510b a = C66510b.m259911a();
            a.mo232080a(this.f167947c);
            readTimeout.dns(a);
        }
        return readTimeout.build().newCall(builder.build());
    }

    /* renamed from: com.tt.miniapp.net.j$b */
    public static class C66533b {

        /* renamed from: a */
        public int f167961a;

        /* renamed from: b */
        public String f167962b;

        /* renamed from: c */
        public String f167963c;

        /* renamed from: d */
        public boolean f167964d;

        /* renamed from: e */
        public String f167965e;

        /* renamed from: f */
        public String f167966f;

        /* renamed from: g */
        public String f167967g;

        /* renamed from: h */
        public String f167968h;

        /* renamed from: i */
        public byte[] f167969i;

        /* renamed from: j */
        public boolean f167970j;

        public C66533b(int i, String str, String str2, boolean z, String str3, byte[] bArr, String str4, String str5, String str6) {
            this.f167961a = i;
            this.f167962b = str;
            this.f167963c = str2;
            this.f167964d = z;
            this.f167965e = str3;
            this.f167969i = bArr;
            this.f167966f = str4;
            this.f167967g = str5;
            this.f167968h = str6;
        }
    }

    /* renamed from: a */
    public C66534c mo232093a(IAppContext iAppContext, int i, String str, boolean z, String str2, byte[] bArr, String str3, String str4, String str5, String str6) throws Exception {
        C66534c cVar;
        byte[] bArr2;
        Map<String, String> a = m259944a(str, str3);
        C12827e eVar = new C12827e(str, str4, false);
        String str7 = null;
        for (Map.Entry<String, String> entry : a.entrySet()) {
            String value = entry.getValue();
            eVar.mo48434a(entry.getKey(), entry.getValue());
            if (entry.getKey().equalsIgnoreCase("content-type")) {
                str7 = value;
            }
        }
        long a2 = m259941a();
        eVar.mo48438b(a2);
        eVar.mo48439c(a2);
        eVar.mo48429a(a2);
        if (str7 != null) {
            eVar.mo48440c(str7);
        }
        if (TextUtils.equals(str4, "POST") || TextUtils.equals(str4, "PUT") || TextUtils.equals(str4, "DELETE") || TextUtils.equals(str4, "OPTIONS") || TextUtils.equals(str4, "CONNECT") || TextUtils.equals(str4, "TRACE")) {
            if (bArr != null) {
                eVar.mo48437a(bArr);
            } else {
                if (str2 == null) {
                    bArr2 = new byte[0];
                } else {
                    bArr2 = str2.getBytes();
                }
                eVar.mo48437a(bArr2);
            }
            if (TextUtils.equals(str4, "POST")) {
                eVar.mo48441d("POST");
            } else if (TextUtils.equals(str4, "PUT")) {
                eVar.mo48441d("PUT");
            } else if (TextUtils.equals(str4, "DELETE")) {
                eVar.mo48441d("DELETE");
            } else if (TextUtils.equals(str4, "OPTIONS")) {
                eVar.mo48441d("OPTIONS");
            } else {
                eVar.mo48441d(str4);
            }
        }
        this.f167948d.put(i, eVar);
        C12830f a3 = mo232092a(eVar);
        JSONObject jSONObject = new JSONObject();
        ArrayList<C12826d> h = a3.mo48470h();
        if (h != null) {
            if (h.isEmpty() && a3.mo48463b() >= 400) {
                h.add(new C12826d("code", String.valueOf(a3.mo48463b())));
            }
            for (C12826d dVar : h) {
                String a4 = dVar.mo48423a();
                String b = dVar.mo48425b();
                if (jSONObject.has(a4)) {
                    jSONObject.put(a4, jSONObject.optString(a4) + "," + b);
                } else {
                    jSONObject.put(a4, b);
                }
            }
        }
        if (a3.mo48468f() != null) {
            if (a3.mo48463b() >= 400) {
                cVar = new C66534c(i, true, a3.mo48463b(), a3.mo48466d(), jSONObject.toString(), str5, str6);
            } else {
                cVar = new C66534c(i, false, a3.mo48463b(), "", jSONObject.toString(), str5, str6);
            }
            cVar.f167979i = a3.mo48465c();
        } else {
            byte[] e = a3.mo48467e();
            if (e == null) {
                cVar = new C66534c(i, true, a3.mo48463b(), "", jSONObject.toString(), str5, str6);
            } else if (TextUtils.equals(str6, "arraybuffer")) {
                cVar = new C66534c(i, true, a3.mo48463b(), e, jSONObject.toString(), str5, str6);
            } else {
                cVar = new C66534c(i, true, a3.mo48463b(), new String(e), jSONObject.toString(), str5, str6);
            }
        }
        cVar.f167980j = -1;
        return cVar;
    }
}
