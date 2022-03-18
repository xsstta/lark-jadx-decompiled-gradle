package com.bytedance.applog;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.collector.C3394a;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.manager.DeviceRegisterParameterFactory;
import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.p201e.C3411e;
import com.bytedance.applog.p201e.C3412f;
import com.bytedance.applog.p201e.C3413g;
import com.bytedance.applog.util.C3452b;
import com.bytedance.applog.util.C3459h;
import com.bytedance.applog.util.C3467p;
import com.bytedance.applog.util.C3469r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.a */
public final class C3368a {

    /* renamed from: a */
    public static int f10664a;

    /* renamed from: b */
    private static volatile C3435g f10665b;

    /* renamed from: c */
    private static volatile C3436h f10666c;

    /* renamed from: d */
    private static volatile C3394a f10667d;

    /* renamed from: e */
    private static AbstractC3399e f10668e;

    /* renamed from: f */
    private static Application f10669f;

    /* renamed from: g */
    private static volatile boolean f10670g;

    /* renamed from: h */
    private static C3373e f10671h;

    /* renamed from: a */
    public static void m14027a(boolean z) {
    }

    /* renamed from: f */
    public static boolean m14043f() {
        return true;
    }

    /* renamed from: a */
    public static Context m14003a() {
        return f10669f;
    }

    /* renamed from: s */
    public static AbstractC3399e m14056s() {
        return f10668e;
    }

    /* renamed from: a */
    public static void m14019a(String str, String str2) {
        C3373e eVar = f10671h;
        if (eVar != null) {
            eVar.mo13604a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m14015a(String str) {
        C3373e eVar = f10671h;
        if (eVar != null) {
            eVar.mo13603a(str);
        }
    }

    /* renamed from: a */
    public static void m14024a(HashMap<String, Object> hashMap) {
        if (f10666c != null) {
            f10666c.mo13852a(hashMap);
        }
    }

    /* renamed from: a */
    public static void m14021a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4 = null;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) {
            if (jSONObject != null) {
                str4 = jSONObject.toString();
            }
            C3373e.m14085a(new C3411e(str, str2, str3, j, j2, str4));
            return;
        }
        C3469r.m14669c("category and label is empty", null);
    }

    /* renamed from: a */
    public static void m14020a(String str, String str2, String str3, long j, long j2) {
        m14021a(str, str2, str3, j, j2, null);
    }

    /* renamed from: a */
    public static void m14022a(String str, JSONObject jSONObject) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            C3469r.m14666a("eventName is empty", (Throwable) null);
        }
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        C3373e.m14085a(new C3413g(str, false, str2));
    }

    /* renamed from: a */
    public static void m14017a(String str, Bundle bundle) {
        Throwable th;
        JSONObject jSONObject = null;
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (String str2 : bundle.keySet()) {
                            jSONObject2.put(str2, bundle.get(str2));
                        }
                        jSONObject = jSONObject2;
                    } catch (Throwable th2) {
                        th = th2;
                        jSONObject = jSONObject2;
                        C3469r.m14667a(th);
                        m14022a(str, jSONObject);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C3469r.m14667a(th);
                m14022a(str, jSONObject);
            }
        }
        m14022a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m14023a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String str5 = "second_app_" + str;
            try {
                jSONObject.put("params_for_special", "second_app");
                jSONObject.put("second_appid", str2);
                jSONObject.put("second_appname", str3);
                jSONObject.put("product_type", str4);
            } catch (Throwable th) {
                C3469r.m14667a(th);
            }
            C3373e.m14085a(new C3413g(str5, false, jSONObject.toString()));
            return;
        }
        C3469r.m14668b("both second appid and second app name is empty, return", null);
    }

    /* renamed from: a */
    public static void m14018a(String str, Bundle bundle, String str2, String str3, String str4) {
        Throwable th;
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            String str5 = "second_app_" + str;
            if (bundle != null) {
                try {
                    if (!bundle.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            for (String str6 : bundle.keySet()) {
                                jSONObject2.put(str6, bundle.get(str6));
                            }
                            jSONObject2.put("params_for_special", "second_app");
                            jSONObject2.put("second_appid", str2);
                            jSONObject2.put("second_appname", str3);
                            jSONObject2.put("product_type", str4);
                            jSONObject = jSONObject2;
                        } catch (Throwable th2) {
                            th = th2;
                            jSONObject = jSONObject2;
                            C3469r.m14667a(th);
                            m14022a(str5, jSONObject);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C3469r.m14667a(th);
                    m14022a(str5, jSONObject);
                    return;
                }
            }
            m14022a(str5, jSONObject);
            return;
        }
        C3469r.m14668b("both second appid and second app name is empty, return", null);
    }

    /* renamed from: a */
    public static void m14026a(Map<String, String> map, boolean z) {
        if (f10666c != null) {
            C3398b.m14190a(f10669f, f10666c.mo13857b(), z, map);
        }
    }

    /* renamed from: a */
    public static void m14013a(AbstractC3423i iVar) {
        C3467p.m14657a().mo13912a(iVar);
    }

    /* renamed from: a */
    public static void m14014a(C3426k kVar) {
        if (f10671h != null) {
            C3469r.m14670d("setUriRuntime " + kVar.mo13773a(), null);
            f10671h.mo13602a(kVar);
        }
    }

    /* renamed from: a */
    public static boolean m14028a(Context context) {
        return DeviceRegisterParameterFactory.isNewUserMode(context);
    }

    /* renamed from: a */
    public static void m14025a(Map<String, String> map) {
        String i = m14046i();
        if (!TextUtils.isEmpty(i)) {
            map.put("device_id", i);
        }
        String k = m14048k();
        if (!TextUtils.isEmpty(k)) {
            map.put("install_id", k);
        }
        String o = m14052o();
        if (!TextUtils.isEmpty(o)) {
            map.put("openudid", o);
        }
        String n = m14051n();
        if (!TextUtils.isEmpty(n)) {
            map.put("clientudid", n);
        }
    }

    /* renamed from: a */
    public static void m14016a(String str, int i) {
        if (f10667d != null) {
            f10667d.mo13643a(str, i);
        }
    }

    private C3368a() {
        C3469r.m14667a((Throwable) null);
    }

    /* renamed from: h */
    public static boolean m14045h() {
        return f10666c.mo13875p();
    }

    /* renamed from: b */
    public static C3424j m14029b() {
        if (f10665b != null) {
            return f10665b.mo13816b();
        }
        return null;
    }

    /* renamed from: c */
    public static void m14038c() {
        C3373e eVar = f10671h;
        if (eVar != null) {
            eVar.mo13605a((String[]) null, true);
        }
    }

    /* renamed from: d */
    public static String m14041d() {
        if (f10666c != null) {
            return f10666c.mo13876q();
        }
        return null;
    }

    /* renamed from: e */
    public static String m14042e() {
        if (f10666c != null) {
            return f10666c.mo13867h();
        }
        return "";
    }

    /* renamed from: g */
    public static boolean m14044g() {
        C3373e eVar = f10671h;
        if (eVar != null) {
            return eVar.mo13606a(false);
        }
        return false;
    }

    /* renamed from: i */
    public static String m14046i() {
        if (f10666c != null) {
            return f10666c.mo13866g();
        }
        return "";
    }

    /* renamed from: j */
    public static String m14047j() {
        if (f10666c != null) {
            return f10666c.mo13868i();
        }
        return "";
    }

    /* renamed from: k */
    public static String m14048k() {
        if (f10666c != null) {
            return f10666c.mo13869j();
        }
        return "";
    }

    /* renamed from: l */
    public static String m14049l() {
        if (f10666c != null) {
            return f10666c.mo13870k();
        }
        return "";
    }

    /* renamed from: m */
    public static String m14050m() {
        if (f10666c != null) {
            return f10666c.mo13864f();
        }
        return "";
    }

    /* renamed from: n */
    public static String m14051n() {
        if (f10666c != null) {
            return f10666c.mo13871l();
        }
        return "";
    }

    /* renamed from: o */
    public static String m14052o() {
        if (f10666c != null) {
            return f10666c.mo13872m();
        }
        return "";
    }

    /* renamed from: p */
    public static AbstractC3450b m14053p() {
        return f10665b.mo13816b().mo13767v();
    }

    /* renamed from: r */
    public static void m14055r() {
        if (f10667d != null) {
            f10667d.onActivityPaused(null);
        }
    }

    /* renamed from: q */
    public static JSONObject m14054q() {
        if (f10666c != null) {
            return f10666c.mo13857b();
        }
        C3469r.m14667a(new RuntimeException("init come first"));
        return null;
    }

    /* renamed from: b */
    public static void m14032b(AbstractC3387c cVar) {
        C3459h.m14609a().mo13907b(cVar);
    }

    /* renamed from: c */
    public static void m14039c(Context context) {
        if (context instanceof Activity) {
            m14055r();
        }
    }

    /* renamed from: c */
    public static void m14040c(String str) {
        m14021a("event_v1", str, null, 0, 0, null);
    }

    /* renamed from: a */
    public static void m14006a(Account account) {
        if (f10666c != null) {
            C3469r.m14670d("setAccount " + account, null);
            f10666c.mo13850a(account);
        }
    }

    /* renamed from: b */
    public static void m14031b(Context context) {
        if (context instanceof Activity) {
            m14016a(context.getClass().getName(), context.hashCode());
        }
    }

    /* renamed from: b */
    public static void m14033b(AbstractC3423i iVar) {
        C3467p.m14657a().mo13913b(iVar);
    }

    /* renamed from: b */
    public static void m14034b(String str) {
        if (f10666c != null) {
            f10666c.mo13858b(str);
        }
    }

    /* renamed from: a */
    public static void m14010a(AbstractC3383b bVar) {
        C3452b.m14578a().mo13896a(bVar);
    }

    /* renamed from: a */
    public static void m14011a(AbstractC3387c cVar) {
        C3459h.m14609a().mo13906a(cVar);
    }

    /* renamed from: a */
    public static void m14012a(AbstractC3395d dVar) {
        C3398b.f10770a = dVar;
    }

    /* renamed from: b */
    public static void m14037b(boolean z) {
        if (f10666c != null) {
            f10666c.mo13854a(z);
            return;
        }
        throw new IllegalStateException("Applog还未init()");
    }

    /* renamed from: a */
    public static void m14009a(Context context, boolean z) {
        DeviceRegisterParameterFactory.setNewUserMode(context, z);
    }

    /* renamed from: a */
    public static <T> T m14004a(String str, T t) {
        if (f10666c != null) {
            return (T) f10666c.mo13856b(str, t);
        }
        return null;
    }

    /* renamed from: b */
    public static <T> T m14030b(String str, T t) {
        if (f10666c != null) {
            return (T) f10666c.mo13849a(str, (Object) t);
        }
        return null;
    }

    /* renamed from: a */
    public static void m14007a(Context context, C3424j jVar) {
        synchronized (C3368a.class) {
            if (f10669f == null) {
                C3469r.m14664a(context, jVar.mo13736a());
                C3469r.m14670d("Inited Begin", null);
                Application application = (Application) context.getApplicationContext();
                f10669f = application;
                f10665b = new C3435g(application, jVar);
                f10666c = new C3436h(f10669f, f10665b);
                f10667d = new C3394a(jVar.mo13758m());
                f10671h = new C3373e(f10669f, f10665b, f10666c);
                if (jVar.mo13729I()) {
                    f10669f.registerActivityLifecycleCallbacks(f10667d);
                }
                f10664a = 1;
                f10670g = jVar.mo13745b();
                C3469r.m14670d("Inited End", null);
            }
        }
    }

    /* renamed from: b */
    public static void m14035b(String str, String str2) {
        m14021a("event_v1", str, str2, 0, 0, null);
    }

    /* renamed from: b */
    public static void m14036b(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() <= 0) {
            C3469r.m14668b("call onEventData with invalid params, return", null);
            return;
        }
        try {
            C3373e.m14085a(new C3412f(str, jSONObject));
        } catch (Exception e) {
            C3469r.m14669c("call onEventData get exception: ", e);
        }
    }

    /* renamed from: a */
    public static String m14005a(Context context, String str, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        m14008a(context, sb, z);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14008a(Context context, StringBuilder sb, boolean z) {
        if (f10666c != null) {
            C3398b.m14189a(context, f10666c.mo13857b(), sb, z);
        } else {
            C3469r.m14668b("addNetCommonParams no init", null);
        }
    }
}
