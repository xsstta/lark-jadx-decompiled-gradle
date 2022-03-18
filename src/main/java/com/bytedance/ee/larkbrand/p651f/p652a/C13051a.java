package com.bytedance.ee.larkbrand.p651f.p652a;

import android.util.SparseArray;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
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
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.net.C66522i;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.p3371e.C67515e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.f.a.a */
public class C13051a {

    /* renamed from: d */
    private static final List<String> f34683d = Arrays.asList("sgsnssdk.com", "snssdk.com", "toutiao.com", "wukong.com", "bytedance.net");

    /* renamed from: a */
    public SparseArray<Call> f34684a = new SparseArray<>();

    /* renamed from: b */
    public List<Integer> f34685b = new ArrayList();

    /* renamed from: c */
    private IAppContext f34686c;

    /* renamed from: com.bytedance.ee.larkbrand.f.a.a$a */
    public static class C13054a {

        /* renamed from: a */
        String f34693a;

        /* renamed from: b */
        String f34694b;

        /* renamed from: a */
        public String mo49093a() {
            return this.f34693a;
        }

        /* renamed from: b */
        public String mo49094b() {
            return this.f34694b;
        }

        public C13054a(String str, String str2) {
            this.f34693a = str;
            this.f34694b = str2;
        }
    }

    public C13051a(IAppContext iAppContext) {
        this.f34686c = iAppContext;
    }

    /* renamed from: a */
    public static C13051a m53536a(IAppContext iAppContext) {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst != null) {
            inst.setRequestVersion("v1");
        }
        return C12988a.m53439a(iAppContext).mo48905a();
    }

    /* renamed from: a */
    private List<C13054a> m53537a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new C13054a(next, jSONObject.optString(next)));
                }
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_LarkNetApiUtil", e);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo49090a(Integer num) {
        if (this.f34684a.get(num.intValue()) != null) {
            this.f34684a.get(num.intValue()).cancel();
        }
        if (this.f34685b.contains(num)) {
            this.f34685b.remove(num);
        }
        AppBrandLogger.m52830i("tma_LarkNetApiUtil", "remove request", this.f34684a.get(num.intValue()));
    }

    /* renamed from: a */
    public void mo49089a(final int i, final C66522i.C66526b bVar, final AbstractC67550j.AbstractC67551a<String> aVar) {
        this.f34685b.add(Integer.valueOf(i));
        Observable.create(new Function<C66522i.C66527c>() {
            /* class com.bytedance.ee.larkbrand.p651f.p652a.C13051a.C130532 */

            /* renamed from: a */
            public C66522i.C66527c fun() {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C66522i.C66527c a = C13051a.this.mo49088a(bVar.f167929a, bVar.f167930b, bVar.f167932d, bVar.f167936h, bVar.f167933e, bVar.f167931c, bVar.f167934f, bVar.f167935g);
                    AppBrandLogger.m52830i("tma_LarkNetApiUtil", "request time ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " url ", bVar.f167930b);
                    return a;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_LarkNetApiUtil", "request", e);
                    return null;
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<C66522i.C66527c>() {
            /* class com.bytedance.ee.larkbrand.p651f.p652a.C13051a.C130521 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", "fail");
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "request:fail");
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "server error");
                    aVar.onNativeModuleCall(jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Throwable th2) {
                    C13051a.this.mo49090a(Integer.valueOf(i));
                    throw th2;
                }
                C13051a.this.mo49090a(Integer.valueOf(i));
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0060 A[Catch:{ Exception -> 0x0156, all -> 0x0154 }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.tt.miniapp.net.C66522i.C66527c r20) {
                /*
                // Method dump skipped, instructions count: 426
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.p651f.p652a.C13051a.C130521.onSuccess(com.tt.miniapp.net.i$c):void");
            }
        });
    }

    /* renamed from: a */
    private synchronized Call m53538a(Request.Builder builder, int i, String str) {
        long j;
        String str2;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f34686c).getAppConfig();
        if (appConfig != null) {
            j = appConfig.mo230046g().f34173a;
        } else {
            j = 60000;
        }
        AbstractC12625f a = C12843b.m53037a(j, j, j, this.f34686c);
        if (!this.f34685b.contains(Integer.valueOf(i))) {
            return null;
        }
        builder.addHeader("EENet-Request-Enable-Complex-Connect", Boolean.FALSE.toString());
        C12793a.m52872a(builder, j);
        C12614a a2 = a.mo47928a();
        if (C12763a.m52781a(this.f34686c.getAppId())) {
            IAppContext iAppContext = this.f34686c;
            CookieJar a3 = AppCookieJarMgr.m52756a(iAppContext, C67515e.m262603a(iAppContext));
            if (a3 != null) {
                a2.mo47916a(a3);
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = "cookie jar is null! app id:";
                if (this.f34686c.getAppId() != null) {
                    str2 = this.f34686c.getAppId();
                } else {
                    str2 = "";
                }
                objArr[1] = str2;
                AppBrandLogger.m52829e("tma_LarkNetApiUtil", objArr);
            }
        }
        Call newCall = a2.mo47918a(new C12760a(str)).mo47919a().newCall(builder.build());
        this.f34684a.put(i, newCall);
        return newCall;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tt.miniapp.net.C66522i.C66527c mo49088a(int r24, java.lang.String r25, java.lang.String r26, byte[] r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 897
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.p651f.p652a.C13051a.mo49088a(int, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.tt.miniapp.net.i$c");
    }
}
