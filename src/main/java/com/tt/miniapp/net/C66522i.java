package com.tt.miniapp.net;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.cookie.p618c.C12760a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p622a.C12793a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.process.C67556a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.i */
public class C66522i {

    /* renamed from: e */
    private static final List<String> f167916e = C12768c.m52791a().f34154a;

    /* renamed from: a */
    public SparseArray<Call> f167917a = new SparseArray<>();

    /* renamed from: b */
    public List<Integer> f167918b = new ArrayList();

    /* renamed from: c */
    public String f167919c = "";

    /* renamed from: d */
    private IAppContext f167920d;

    /* renamed from: com.tt.miniapp.net.i$a */
    public static class C66525a {

        /* renamed from: a */
        String f167927a;

        /* renamed from: b */
        String f167928b;

        /* renamed from: a */
        public String mo232090a() {
            return this.f167927a;
        }

        /* renamed from: b */
        public String mo232091b() {
            return this.f167928b;
        }

        public C66525a(String str, String str2) {
            this.f167927a = str;
            this.f167928b = str2;
        }
    }

    /* renamed from: com.tt.miniapp.net.i$c */
    public static class C66527c {

        /* renamed from: a */
        public int f167937a;

        /* renamed from: b */
        public boolean f167938b;

        /* renamed from: c */
        public int f167939c;

        /* renamed from: d */
        public String f167940d;

        /* renamed from: e */
        public String f167941e;

        /* renamed from: f */
        public String f167942f;

        /* renamed from: g */
        public String f167943g;

        public C66527c(int i) {
            this(i, false, 0, null, null, null, null);
        }

        public C66527c(int i, boolean z, int i2, String str, String str2, String str3, String str4) {
            this.f167937a = i;
            this.f167938b = z;
            this.f167939c = i2;
            this.f167940d = str;
            this.f167941e = str2;
            this.f167942f = str3;
            this.f167943g = str4;
        }
    }

    public C66522i(IAppContext iAppContext) {
        this.f167920d = iAppContext;
    }

    /* renamed from: a */
    public static C66522i m259931a(IAppContext iAppContext) {
        AppbrandApplicationImpl.getInst(iAppContext).setRequestVersion("v1");
        return C67485a.m262488a(iAppContext).mo234290k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C66525a> mo232085a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new C66525a(next, jSONObject.optString(next)));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo232087a(Integer num) {
        if (this.f167917a.get(num.intValue()) != null) {
            this.f167917a.get(num.intValue()).cancel();
        }
        this.f167918b.remove(num);
    }

    /* renamed from: a */
    private synchronized Call m259932a(Request.Builder builder, int i, String str) {
        long j;
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.f167920d).getAppConfig();
        if (appConfig != null) {
            j = appConfig.mo230046g().f34173a;
        } else {
            j = 60000;
        }
        OkHttpClient build = C66517e.m259917a().newBuilder().connectTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).build();
        if (!this.f167918b.contains(Integer.valueOf(i))) {
            return null;
        }
        Call newCall = build.newBuilder().addInterceptor(new C12760a(str)).build().newCall(builder.build());
        this.f167917a.put(i, newCall);
        return newCall;
    }

    /* renamed from: a */
    public void mo232086a(final int i, final C66526b bVar, final AbstractC67550j.AbstractC67551a<String> aVar) {
        this.f167918b.add(Integer.valueOf(i));
        Observable.create(new Function<C66527c>() {
            /* class com.tt.miniapp.net.C66522i.C665242 */

            /* renamed from: a */
            public C66527c fun() {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C66527c a = C66522i.this.mo232084a(bVar.f167929a, bVar.f167930b, bVar.f167932d, bVar.f167936h, bVar.f167933e, bVar.f167931c, bVar.f167934f, bVar.f167935g);
                    AppBrandLogger.m52830i("tma_RequestManager", "request time ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " url ", bVar.f167930b);
                    return a;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_RequestManager", "request", e);
                    C66522i.this.f167919c = e.toString();
                    return null;
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<C66527c>() {
            /* class com.tt.miniapp.net.C66522i.C665231 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", "fail");
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "request:fail " + th.toString());
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "server error");
                    aVar.onNativeModuleCall(jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0083 A[Catch:{ Exception -> 0x0179 }] */
            /* JADX WARNING: Removed duplicated region for block: B:39:? A[Catch:{ Exception -> 0x0179 }, RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.tt.miniapp.net.C66522i.C66527c r15) {
                /*
                // Method dump skipped, instructions count: 437
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.net.C66522i.C665231.onSuccess(com.tt.miniapp.net.i$c):void");
            }
        });
    }

    /* renamed from: com.tt.miniapp.net.i$b */
    public static class C66526b {

        /* renamed from: a */
        public int f167929a;

        /* renamed from: b */
        public String f167930b;

        /* renamed from: c */
        public String f167931c;

        /* renamed from: d */
        public String f167932d;

        /* renamed from: e */
        public String f167933e;

        /* renamed from: f */
        public String f167934f;

        /* renamed from: g */
        public String f167935g;

        /* renamed from: h */
        public byte[] f167936h;

        public C66526b(int i, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6) {
            this.f167929a = i;
            this.f167930b = str;
            this.f167931c = str2;
            this.f167932d = str3;
            this.f167936h = bArr;
            this.f167933e = str4;
            this.f167934f = str5;
            this.f167935g = str6;
        }
    }

    /* renamed from: a */
    public C66527c mo232084a(int i, String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6) throws Exception {
        boolean z;
        String str7;
        C66527c cVar;
        C66527c cVar2;
        MediaType mediaType;
        RequestBody requestBody;
        String str8;
        String str9;
        String str10;
        AppBrandLogger.m52828d("tma_RequestManager", "requestId ", Integer.valueOf(i), " url ", str, " data ", str2, " headers ", str3, " method ", str4, " dataType ", str5, " responseType ", str6);
        C66527c cVar3 = new C66527c(i);
        cVar3.f167942f = str5;
        cVar3.f167943g = str6;
        if (TextUtils.isEmpty(str)) {
            return cVar3;
        }
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        List<C66525a> a = mo232085a(str3);
        Iterator<String> it = f167916e.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (str.contains(it.next())) {
                z = true;
                break;
            }
        }
        if (!z || C67432a.m262319a(this.f167920d).getAppInfo().innertype != 1) {
            str7 = null;
        } else {
            str7 = C67556a.m262928a();
            AppBrandLogger.m52828d("tma_RequestManager", "cookie ", str7);
        }
        Iterator<C66525a> it2 = a.iterator();
        boolean z2 = false;
        String str11 = null;
        while (true) {
            if (!it2.hasNext()) {
                cVar = cVar3;
                break;
            }
            C66525a next = it2.next();
            cVar = cVar3;
            if (next.f167927a.equalsIgnoreCase("Referer")) {
                break;
            }
            if (!z || !next.f167927a.equalsIgnoreCase("Cookie")) {
                builder.addHeader(next.f167927a, next.f167928b);
            } else {
                String str12 = next.f167928b;
                if (TextUtils.isEmpty(str12)) {
                    if (!TextUtils.isEmpty(str7)) {
                        builder.addHeader(next.f167927a, str7);
                    }
                    str11 = str7;
                } else {
                    if (!TextUtils.isEmpty(str7)) {
                        str12 = str12 + "; " + str7;
                    }
                    if (!TextUtils.isEmpty(str12)) {
                        builder.addHeader(next.f167927a, str12);
                    }
                    str11 = str12;
                }
                z2 = true;
            }
            cVar3 = cVar;
        }
        if (z2 || !z) {
            str7 = str11;
        } else if (!TextUtils.isEmpty(str7)) {
            builder.addHeader("Cookie", str7);
        }
        C12793a.m52873a(builder, this.f167920d, null);
        String str13 = ",";
        if (TextUtils.equals(str4, "GET")) {
            Call a2 = m259932a(builder, i, str7);
            if (a2 == null) {
                return null;
            }
            Response execute = a2.execute();
            int code = execute.code();
            if (TextUtils.equals(str6, "arraybuffer")) {
                str10 = ByteString.of(execute.body().bytes()).base64();
            } else {
                str10 = execute.body().string();
            }
            Headers headers = execute.headers();
            JSONObject jSONObject = new JSONObject();
            if (headers != null) {
                int size = headers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String name = headers.name(i2);
                    String value = headers.value(i2);
                    if (jSONObject.has(name)) {
                        jSONObject.put(name, jSONObject.optString(name) + str13 + value);
                    } else {
                        jSONObject.put(name, value);
                    }
                }
            }
            execute.body().close();
            execute.close();
            cVar2 = new C66527c(i, true, code, str10, jSONObject.toString(), str5, str6);
        } else if (TextUtils.equals(str4, "POST") || TextUtils.equals(str4, "PUT") || TextUtils.equals(str4, "DELETE") || TextUtils.equals(str4, "OPTIONS") || TextUtils.equals(str4, "CONNECT") || TextUtils.equals(str4, "TRACE")) {
            Iterator<C66525a> it3 = a.iterator();
            String str14 = null;
            while (it3.hasNext()) {
                C66525a next2 = it3.next();
                if (next2.mo232090a().equalsIgnoreCase("Content-Type")) {
                    str14 = next2.mo232091b();
                }
                it3 = it3;
                str13 = str13;
            }
            String str15 = str13;
            if (str14 != null) {
                mediaType = MediaType.parse(str14);
            } else {
                mediaType = null;
            }
            if (bArr != null) {
                requestBody = RequestBody.create(mediaType, bArr);
            } else {
                requestBody = RequestBody.create(mediaType, str2);
            }
            if (requestBody == null) {
                AppBrandLogger.m52829e("tma_RequestManager", "request post content Type should right");
                return null;
            }
            if (TextUtils.equals(str4, "POST")) {
                builder.post(requestBody);
            } else if (TextUtils.equals(str4, "PUT")) {
                builder.put(requestBody);
            } else if (TextUtils.equals(str4, "DELETE")) {
                builder.delete(requestBody);
            } else {
                builder.method(str4, requestBody);
            }
            Call a3 = m259932a(builder, i, str7);
            if (a3 == null) {
                return null;
            }
            Response execute2 = a3.execute();
            int code2 = execute2.code();
            if (TextUtils.equals(str6, "arraybuffer")) {
                str8 = ByteString.of(execute2.body().bytes()).base64();
            } else {
                str8 = execute2.body().string();
            }
            Headers headers2 = execute2.headers();
            JSONObject jSONObject2 = new JSONObject();
            if (headers2 != null) {
                int size2 = headers2.size();
                int i3 = 0;
                while (i3 < size2) {
                    String name2 = headers2.name(i3);
                    String value2 = headers2.value(i3);
                    if (jSONObject2.has(name2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(jSONObject2.optString(name2));
                        str9 = str15;
                        sb.append(str9);
                        sb.append(value2);
                        jSONObject2.put(name2, sb.toString());
                    } else {
                        str9 = str15;
                        jSONObject2.put(name2, value2);
                    }
                    i3++;
                    str15 = str9;
                }
            }
            execute2.body().close();
            execute2.close();
            cVar2 = new C66527c(i, true, code2, str8, jSONObject2.toString(), str5, str6);
        } else {
            cVar2 = cVar;
        }
        AppCookieJarMgr.m52758b().remove();
        return cVar2;
    }
}
