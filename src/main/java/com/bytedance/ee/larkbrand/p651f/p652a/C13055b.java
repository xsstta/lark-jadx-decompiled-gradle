package com.bytedance.ee.larkbrand.p651f.p652a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.eenet.httpclient.C12614a;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.cookie.p618c.C12760a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12763a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12826d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66440j;
import com.tt.miniapp.net.C66528j;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.p3371e.C67515e;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.impl.business.api.diagnose.entity.C67893b;
import com.tt.refer.impl.business.api.diagnose.entity.C67895d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.f.a.b */
public class C13055b {

    /* renamed from: a */
    public SparseArray<Call> f34695a = new SparseArray<>();

    /* renamed from: b */
    public List<Integer> f34696b = new ArrayList();

    /* renamed from: c */
    private IAppContext f34697c;

    /* renamed from: com.bytedance.ee.larkbrand.f.a.b$a */
    public static class C13058a {

        /* renamed from: a */
        String f34706a;

        /* renamed from: b */
        String f34707b;

        /* renamed from: a */
        public String mo49101a() {
            return this.f34706a;
        }

        /* renamed from: b */
        public String mo49102b() {
            return this.f34707b;
        }

        public C13058a(String str, String str2) {
            this.f34706a = str;
            this.f34707b = str2;
        }
    }

    /* renamed from: a */
    public synchronized void mo49098a(Integer num) {
        if (this.f34695a.get(num.intValue()) != null) {
            this.f34695a.get(num.intValue()).cancel();
        }
        if (this.f34696b.contains(num)) {
            this.f34696b.remove(num);
        }
        AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "remove request", this.f34695a.get(num.intValue()), "taskId:", num);
    }

    public C13055b(IAppContext iAppContext) {
        this.f34697c = iAppContext;
    }

    /* renamed from: a */
    public static C13055b m53547a(IAppContext iAppContext) {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst != null) {
            inst.setRequestVersion("v2");
        }
        return C12988a.m53439a(iAppContext).mo48906b();
    }

    /* renamed from: a */
    private List<C13058a> m53548a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new C13058a(next, jSONObject.optString(next)));
                }
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", e);
        }
        return arrayList;
    }

    /* renamed from: a */
    private synchronized Call m53549a(Request.Builder builder, int i, String str) {
        long j;
        Call newCall;
        String str2;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f34697c).getAppConfig();
        if (appConfig != null) {
            j = appConfig.mo230046g().f34173a;
        } else {
            j = 60000;
        }
        AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "make call ->timeout :", Long.valueOf(j));
        C12793a.m52872a(builder, j);
        C12614a a = C12843b.m53037a(j, j, j, this.f34697c).mo47928a();
        if (C12763a.m52781a(this.f34697c.getAppId())) {
            AppCookieJarMgr aVar = AppCookieJarMgr.f34120a;
            IAppContext iAppContext = this.f34697c;
            CookieJar a2 = AppCookieJarMgr.m52756a(iAppContext, C67515e.m262603a(iAppContext));
            if (a2 != null) {
                a.mo47916a(a2);
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = "cookie jar is null! app id:";
                if (this.f34697c.getAppId() != null) {
                    str2 = this.f34697c.getAppId();
                } else {
                    str2 = "";
                }
                objArr[1] = str2;
                AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", objArr);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a.mo47918a(new C12760a(str));
        }
        newCall = a.mo47919a().newCall(builder.build());
        this.f34695a.put(i, newCall);
        return newCall;
    }

    /* renamed from: a */
    public void mo49097a(final int i, final C66528j.C66533b bVar, final AbstractC67550j.AbstractC67551a<IApiOutputParam> aVar, final OPTrace oPTrace) {
        this.f34696b.add(Integer.valueOf(i));
        AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "request start and taskId:", Integer.valueOf(i));
        Observable.create(new Function<C66528j.C66534c>() {
            /* class com.bytedance.ee.larkbrand.p651f.p652a.C13055b.C130572 */

            /* renamed from: a */
            public C66528j.C66534c fun() {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C66528j.C66534c a = C13055b.this.mo49096a(bVar.f167961a, bVar.f167962b, bVar.f167965e, bVar.f167964d, bVar.f167969i, bVar.f167966f, bVar.f167963c, bVar.f167967g, bVar.f167968h, oPTrace);
                    AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "request time ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " url ", C67019aa.m261223a(bVar.f167962b));
                    return a;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", "request", e);
                    return new C66528j.C66534c(e);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<C66528j.C66534c>() {
            /* class com.bytedance.ee.larkbrand.p651f.p652a.C13055b.C130561 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                try {
                    C66705d.C66708b bVar = new C66705d.C66708b();
                    bVar.f168400b = "fail";
                    bVar.f168401c = "request:fail";
                    bVar.f168408j = "server error";
                    OPTrace oPTrace = oPTrace;
                    if (oPTrace != null && !TextUtils.isEmpty(oPTrace.getRequestId())) {
                        bVar.f168409k = oPTrace.getRequestId();
                    }
                    bVar.f168405g = oPTrace;
                    aVar.onNativeModuleCall(bVar);
                    AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", "request:fail", th.getMessage(), "taskId:", Integer.valueOf(i));
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", e);
                } catch (Throwable th2) {
                    C13055b.this.mo49098a(Integer.valueOf(i));
                    throw th2;
                }
                C13055b.this.mo49098a(Integer.valueOf(i));
            }

            /* JADX WARNING: Removed duplicated region for block: B:66:0x0252  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.tt.miniapp.net.C66528j.C66534c r18) {
                /*
                // Method dump skipped, instructions count: 609
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.p651f.p652a.C13055b.C130561.onSuccess(com.tt.miniapp.net.j$c):void");
            }
        });
    }

    /* renamed from: a */
    private C12830f m53546a(Request.Builder builder, int i, OPTrace oPTrace, String str) throws Exception {
        byte[] bArr;
        C12830f fVar = new C12830f(this.f34697c);
        C12793a.m52873a(builder, this.f34697c, oPTrace);
        Call a = m53549a(builder, i, str);
        if (a == null) {
            AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "okhttp make call failed!!");
            return null;
        }
        Response a2 = C12843b.m53045a(a, builder, oPTrace, this.f34697c);
        fVar.mo48459a(a2.code());
        Headers headers = a2.headers();
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
        if (a2.body() != null) {
            bArr = a2.body().bytes();
        } else {
            bArr = new byte[0];
        }
        fVar.mo48462a(bArr);
        if (a2.body() != null) {
            a2.body().close();
        }
        if (C67893b.m264178a(this.f34697c).mo235551a()) {
            C67893b.m264178a(this.f34697c).mo235550a(this.f34697c, new C67895d(a.request().url().toString(), a2.code(), a2.headers(), fVar.mo48466d()));
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f mo49095a(int r18, java.lang.String r19, java.lang.String r20, byte[] r21, java.lang.String r22, java.lang.String r23, com.ss.android.lark.opmonitor.trace.OPTrace r24) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.p651f.p652a.C13055b.mo49095a(int, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, com.ss.android.lark.opmonitor.trace.OPTrace):com.bytedance.ee.lark.infra.network.c.a.f");
    }

    /* renamed from: a */
    public C66528j.C66534c mo49096a(int i, String str, String str2, boolean z, byte[] bArr, String str3, String str4, String str5, String str6, OPTrace oPTrace) throws Exception {
        boolean z2;
        C12830f fVar;
        C66528j.C66534c cVar;
        if (DebugUtil.debug()) {
            AppBrandLogger.m52828d("tma_LarkNetApiUtilV2", "requestId ", Integer.valueOf(i), " url ", str, " data ", str2, " headers ", str3, " method ", str4, " dataType ", str5, " responseType ", str6);
        } else {
            AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "requestId ", Integer.valueOf(i), " url ", str, " method ", str4, " dataType ", str5, " responseType ", str6);
        }
        C66528j.C66534c cVar2 = new C66528j.C66534c(i, false, 0, "", "", str5, str6);
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("tma_LarkNetApiUtilV2", "request url is empty!", "taskId:", Integer.valueOf(i));
            return cVar2;
        }
        int i2 = -1;
        if ("GET".equals(str4) || "POST".equals(str4)) {
            z2 = z;
        } else {
            z2 = false;
        }
        if (z2) {
            fVar = C66440j.m259722a(new C66440j.C66448d(str, str4, str2, str3), this.f34697c);
            if (fVar != null) {
                AppBrandLogger.m52830i("tma_LarkNetApiUtilV2", "get response from prefetch");
                i2 = 1;
            } else {
                fVar = mo49095a(i, str, str2, bArr, str3, str4, oPTrace);
                i2 = 0;
            }
        } else {
            fVar = mo49095a(i, str, str2, bArr, str3, str4, oPTrace);
        }
        int b = fVar.mo48463b();
        ArrayList<C12826d> h = fVar.mo48470h();
        JSONObject jSONObject = new JSONObject();
        if (h != null) {
            int size = h.size();
            for (int i3 = 0; i3 < size; i3++) {
                String a = h.get(i3).mo48423a();
                String b2 = h.get(i3).mo48425b();
                if (jSONObject.has(a)) {
                    jSONObject.put(a, jSONObject.optString(a) + ", " + b2);
                } else {
                    jSONObject.put(a, b2);
                }
            }
        }
        if (fVar.mo48467e() == null) {
            cVar = cVar2;
        } else if (TextUtils.equals(str6, "arraybuffer")) {
            cVar = new C66528j.C66534c(i, true, b, fVar.mo48467e(), jSONObject.toString(), str5, str6);
        } else {
            cVar = new C66528j.C66534c(i, true, b, fVar.mo48466d(), jSONObject.toString(), str5, str6);
        }
        cVar.f167980j = i2;
        return cVar;
    }
}
