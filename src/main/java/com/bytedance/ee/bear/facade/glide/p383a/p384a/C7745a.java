package com.bytedance.ee.bear.facade.glide.p383a.p384a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.huawei.hms.location.LocationRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.a.a */
public class C7745a {

    /* renamed from: a */
    private static String f21003a = "";

    /* renamed from: b */
    private static PersistenceSharedPreference f21004b;

    /* renamed from: c */
    private static LruCache<String, String> f21005c = new LruCache<>(LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: d */
    private static List<String> f21006d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private static int f21007e;

    /* renamed from: f */
    private static C10917c f21008f;

    /* renamed from: g */
    private static String f21009g = Locale.ENGLISH.getLanguage();

    /* renamed from: h */
    private static HashMap<String, Boolean> f21010h = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.facade.glide.a.a.a$a */
    public static class C7747a {

        /* renamed from: a */
        public static final C7745a f21011a = new C7745a();
    }

    /* renamed from: a */
    public static C7745a m31019a() {
        m31022b("");
        return C7747a.f21011a;
    }

    private C7745a() {
        f21008f = new C10917c(new C10929e());
        m31022b(C4511g.m18594d().mo17356e());
        ao b = C4484g.m18494b();
        f21009g = b.mo17252c();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.facade.glide.p383a.p384a.$$Lambda$a$_oQIOb1LmzylUEpVtqjq5JxmBA4 */

            public final void run() {
                C7745a.m31020a(ao.this);
            }
        });
    }

    /* renamed from: d */
    private String m31024d(String str) {
        return C13598b.m55198e(str);
    }

    /* renamed from: e */
    private String m31025e(String str) {
        return C13598b.m55199f(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31020a(ao aoVar) {
        aoVar.mo17254e().mo5925a($$Lambda$a$raLLjGOCLUCWa9XWRzmFgDdcl3U.INSTANCE);
    }

    /* renamed from: b */
    private static void m31022b(String str) {
        if (f21004b == null) {
            m31023c(str);
        }
    }

    /* renamed from: a */
    public static void m31021a(String str) {
        if (!TextUtils.equals(str, f21003a)) {
            f21005c.evictAll();
            m31023c(str);
        }
    }

    /* renamed from: c */
    private static void m31023c(String str) {
        if (!TextUtils.isEmpty(str)) {
            f21003a = str;
            f21004b = new PersistenceSharedPreference(C13598b.m55197d(str));
            return;
        }
        f21004b = new PersistenceSharedPreference("etag_cache");
    }

    /* renamed from: e */
    public synchronized String mo30372e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a = mo30365a(str, str2);
        if (TextUtils.isEmpty(a)) {
            a = mo30371d(str, str2);
        }
        return a;
    }

    /* renamed from: a */
    public synchronized String mo30365a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String g = m31027g(str, str2);
        C13479a.m54772d("ETagCache", "getETagFromMemoryCache, new Key:" + g);
        return f21005c.get(g);
    }

    /* renamed from: b */
    public synchronized void mo30369b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String g = m31027g(str, str2);
            C13479a.m54772d("ETagCache", "removeETagFromMemoryCache, new Key:" + g);
            f21005c.remove(g);
        }
    }

    /* renamed from: c */
    public synchronized void mo30370c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String g = m31027g(str, str2);
            C13479a.m54772d("ETagCache", "removeETagFromMemoryCache, new Key:" + g);
            f21005c.remove(g);
            f21004b.mo34037a(g, "");
        }
    }

    /* renamed from: g */
    private synchronized String m31027g(String str, String str2) {
        String builder;
        builder = Uri.parse(str).buildUpon().clearQuery().toString();
        String host = Uri.parse(builder).getHost();
        if (host != null) {
            builder = builder.replace(host, "");
        }
        return builder + "_" + f21009g + "_" + str2;
    }

    /* renamed from: d */
    public synchronized String mo30371d(String str, String str2) {
        if (f21004b == null) {
            throw new RuntimeException("you must call init first");
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            String g = m31027g(str, str2);
            C13479a.m54772d("ETagCache", "removeETagFromMemoryCache, new Key:" + g);
            return m31025e((String) f21004b.mo34038b(m31024d(g), ""));
        }
    }

    /* renamed from: f */
    public synchronized boolean mo30373f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str3 = m31027g(str, str2) + "_isIcon";
        Boolean bool = f21010h.get(str3);
        if (bool == null) {
            return ((Boolean) f21004b.mo34038b(m31024d(str3), false)).booleanValue();
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public synchronized void mo30367a(String str, String str2, String str3) {
        if (f21004b != null) {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    String g = m31027g(str, str3);
                    C13479a.m54772d("ETagCache", "removeETagFromMemoryCache, new Key:" + g);
                    f21004b.mo34037a(m31024d(g), m31024d(str2));
                    f21005c.put(g, str2);
                    return;
                }
            }
            return;
        }
        throw new RuntimeException("you must call init first");
    }

    /* renamed from: a */
    public synchronized void mo30368a(String str, boolean z, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String str3 = m31027g(str, str2) + "_isIcon";
            f21010h.put(str3, Boolean.valueOf(z));
            f21004b.mo34037a(m31024d(str3), Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public synchronized void mo30366a(String str, int i, String str2, boolean z) {
        C13479a.m54772d("ETagCache", "last chatWindowId:" + f21007e + ",current chatWindowId:" + i + ", isForceUpdate = " + z);
        if (!TextUtils.isEmpty(str)) {
            if ((f21007e != i || z) && !C13657b.m55421a(f21006d)) {
                C13479a.m54764b("ETagCache", "clear chat thumbnail load record");
                for (String str3 : f21006d) {
                    m31019a().mo30369b(str3, str2);
                }
                f21006d.clear();
            }
            f21007e = i;
            if (!f21006d.contains(str)) {
                f21006d.add(str);
            }
        }
    }
}
