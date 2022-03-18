package com.ss.android.ad.splash.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ad.splash.AbstractC27228a;
import com.ss.android.ad.splash.AbstractC27231aa;
import com.ss.android.ad.splash.AbstractC27233b;
import com.ss.android.ad.splash.AbstractC27241c;
import com.ss.android.ad.splash.AbstractC27442d;
import com.ss.android.ad.splash.AbstractC27444e;
import com.ss.android.ad.splash.AbstractC27445f;
import com.ss.android.ad.splash.AbstractC27450j;
import com.ss.android.ad.splash.AbstractC27452l;
import com.ss.android.ad.splash.AbstractC27460p;
import com.ss.android.ad.splash.AbstractC27469t;
import com.ss.android.ad.splash.AbstractC27489w;
import com.ss.android.ad.splash.AbstractC27490x;
import com.ss.android.ad.splash.core.p1252g.AbstractC27304a;
import com.ss.android.ad.splash.core.p1252g.AbstractC27306b;
import com.ss.android.ad.splash.core.p1252g.C27310e;
import com.ss.android.ad.splash.core.p1252g.C27316h;
import com.ss.android.ad.splash.origin.AbstractC27458c;
import com.ss.android.ad.splash.p1243a.C27229a;
import com.ss.android.ad.splash.p1245c.AbstractC27244b;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27482k;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e */
public class C27287e {

    /* renamed from: A */
    private static int f67997A;

    /* renamed from: B */
    private static int f67998B;

    /* renamed from: C */
    private static int f67999C;

    /* renamed from: D */
    private static int f68000D;

    /* renamed from: E */
    private static int f68001E;

    /* renamed from: F */
    private static boolean f68002F = true;

    /* renamed from: G */
    private static volatile boolean f68003G = false;

    /* renamed from: H */
    private static volatile boolean f68004H = false;

    /* renamed from: I */
    private static volatile String f68005I;

    /* renamed from: J */
    private static volatile String f68006J;

    /* renamed from: K */
    private static volatile String f68007K;

    /* renamed from: L */
    private static volatile long f68008L = 864000000;

    /* renamed from: M */
    private static volatile boolean f68009M = true;

    /* renamed from: N */
    private static AbstractC27469t f68010N;

    /* renamed from: O */
    private static int f68011O = 0;

    /* renamed from: P */
    private static int f68012P = 0;

    /* renamed from: Q */
    private static int f68013Q = 0;

    /* renamed from: R */
    private static boolean f68014R = false;

    /* renamed from: S */
    private static boolean f68015S = false;

    /* renamed from: T */
    private static volatile AbstractC27244b f68016T;

    /* renamed from: U */
    private static int f68017U;

    /* renamed from: V */
    private static boolean f68018V = true;

    /* renamed from: W */
    private static boolean f68019W = false;

    /* renamed from: X */
    private static AbstractC27458c f68020X;

    /* renamed from: Y */
    private static boolean f68021Y = false;

    /* renamed from: Z */
    private static int f68022Z = -1;

    /* renamed from: a */
    public static AbstractC27452l f68023a;
    private static boolean aa = true;
    private static boolean ab = false;
    private static boolean ac = false;
    private static long ad = 2000;
    private static long ae = 2000;
    private static boolean af = false;
    private static boolean ag = true;
    private static boolean ah = false;

    /* renamed from: ai  reason: collision with root package name */
    private static boolean f175441ai = false;
    private static AbstractC27445f aj;
    private static boolean ak = false;
    private static boolean al = false;
    private static boolean am = false;
    private static AbstractC27304a an;
    private static AbstractC27241c ao;
    private static AbstractC27233b ap;
    private static AbstractC27444e aq;
    private static int ar = 0;
    private static AbstractC27450j as;
    private static boolean at = false;
    private static boolean au = false;
    private static C27369u av;

    /* renamed from: b */
    private static final String f68024b = String.valueOf(200614);

    /* renamed from: c */
    private static volatile AbstractC27231aa f68025c;

    /* renamed from: d */
    private static AbstractC27489w f68026d;

    /* renamed from: e */
    private static AbstractC27490x f68027e;

    /* renamed from: f */
    private static ExecutorService f68028f;

    /* renamed from: g */
    private static ExecutorService f68029g;

    /* renamed from: h */
    private static AbstractC27460p f68030h;

    /* renamed from: i */
    private static ExecutorService f68031i;

    /* renamed from: j */
    private static ExecutorService f68032j;

    /* renamed from: k */
    private static long f68033k;

    /* renamed from: l */
    private static boolean f68034l = false;

    /* renamed from: m */
    private static ConcurrentHashMap<Long, Integer> f68035m;

    /* renamed from: n */
    private static volatile boolean f68036n = false;

    /* renamed from: o */
    private static long f68037o;

    /* renamed from: p */
    private static C27275c f68038p;

    /* renamed from: q */
    private static HashMap<String, String> f68039q;

    /* renamed from: r */
    private static AbstractC27228a f68040r;

    /* renamed from: s */
    private static Context f68041s;

    /* renamed from: t */
    private static boolean f68042t = false;

    /* renamed from: u */
    private static AbstractC27306b f68043u;

    /* renamed from: v */
    private static Handler f68044v = new Handler(Looper.getMainLooper());

    /* renamed from: w */
    private static AbstractC27442d f68045w;

    /* renamed from: x */
    private static int f68046x;

    /* renamed from: y */
    private static int f68047y;

    /* renamed from: z */
    private static boolean f68048z = true;

    /* renamed from: Z */
    public static String m99227Z() {
        return "1385";
    }

    public static String ab() {
        return "2.0.6-rc.4";
    }

    /* renamed from: n */
    public static void m99274n() {
        f68004H = true;
    }

    /* renamed from: w */
    public static void m99283w() {
        f68003G = true;
    }

    /* renamed from: A */
    public static boolean m99202A() {
        return ak;
    }

    /* renamed from: B */
    public static boolean m99203B() {
        return al;
    }

    /* renamed from: C */
    public static ConcurrentHashMap<Long, Integer> m99204C() {
        return f68035m;
    }

    /* renamed from: D */
    public static AbstractC27231aa m99205D() {
        return f68025c;
    }

    /* renamed from: E */
    public static AbstractC27489w m99206E() {
        return f68026d;
    }

    /* renamed from: F */
    public static AbstractC27490x m99207F() {
        return f68027e;
    }

    /* renamed from: G */
    public static AbstractC27452l m99208G() {
        return f68023a;
    }

    /* renamed from: H */
    public static long m99209H() {
        return f68033k;
    }

    /* renamed from: I */
    public static boolean m99210I() {
        return f68034l;
    }

    /* renamed from: J */
    public static ExecutorService m99211J() {
        return f68031i;
    }

    /* renamed from: K */
    public static ExecutorService m99212K() {
        return f68032j;
    }

    /* renamed from: N */
    public static String m99215N() {
        return f68007K;
    }

    /* renamed from: O */
    public static long m99216O() {
        return f68008L;
    }

    /* renamed from: R */
    public static AbstractC27458c m99219R() {
        return f68020X;
    }

    /* renamed from: T */
    public static Context m99221T() {
        return f68041s;
    }

    /* renamed from: U */
    public static AbstractC27469t m99222U() {
        return f68010N;
    }

    /* renamed from: V */
    public static AbstractC27450j m99223V() {
        return as;
    }

    /* renamed from: W */
    public static int m99224W() {
        return f68011O;
    }

    /* renamed from: X */
    public static boolean m99225X() {
        return f68014R;
    }

    /* renamed from: Y */
    public static AbstractC27244b m99226Y() {
        return f68016T;
    }

    public static String aa() {
        return f68024b;
    }

    public static int ac() {
        return f68012P;
    }

    public static int ad() {
        return f68013Q;
    }

    public static int af() {
        return f68017U;
    }

    public static boolean ag() {
        return f68018V;
    }

    public static int ah() {
        return f68022Z;
    }

    public static boolean ai() {
        return aa;
    }

    public static boolean aj() {
        return ab;
    }

    public static boolean ak() {
        return ac;
    }

    public static boolean al() {
        return f68021Y;
    }

    public static long am() {
        return ad;
    }

    public static long an() {
        return ae;
    }

    public static boolean ao() {
        return af;
    }

    public static boolean ap() {
        return ag;
    }

    public static boolean aq() {
        return ah;
    }

    public static boolean ar() {
        return f175441ai;
    }

    public static AbstractC27445f as() {
        return aj;
    }

    public static boolean at() {
        return am;
    }

    public static AbstractC27444e au() {
        return aq;
    }

    public static int av() {
        return ar;
    }

    public static boolean aw() {
        return at;
    }

    /* renamed from: f */
    public static AbstractC27460p m99261f() {
        return f68030h;
    }

    /* renamed from: g */
    public static long m99263g() {
        return f68037o;
    }

    /* renamed from: j */
    public static AbstractC27241c m99269j() {
        return ao;
    }

    /* renamed from: l */
    public static int m99272l() {
        return f68000D;
    }

    /* renamed from: m */
    public static boolean m99273m() {
        return f68004H;
    }

    /* renamed from: o */
    public static int m99275o() {
        return f67998B;
    }

    /* renamed from: p */
    public static int m99276p() {
        return f68046x;
    }

    /* renamed from: q */
    public static int m99277q() {
        return f68047y;
    }

    /* renamed from: r */
    public static int m99278r() {
        return f67997A;
    }

    /* renamed from: s */
    public static int m99279s() {
        return f68001E;
    }

    /* renamed from: t */
    public static AbstractC27442d m99280t() {
        return f68045w;
    }

    /* renamed from: u */
    public static int m99281u() {
        return f67999C;
    }

    /* renamed from: v */
    public static boolean m99282v() {
        return f68003G;
    }

    /* renamed from: x */
    public static boolean m99284x() {
        return f68048z;
    }

    /* renamed from: y */
    public static ExecutorService m99285y() {
        return f68028f;
    }

    /* renamed from: z */
    public static ExecutorService m99286z() {
        return f68029g;
    }

    /* renamed from: a */
    public static boolean m99244a() {
        return f68009M;
    }

    /* renamed from: a */
    public static void m99238a(AbstractC27490x xVar) {
        f68027e = xVar;
    }

    /* renamed from: a */
    public static void m99242a(ExecutorService executorService) {
        f68028f = executorService;
    }

    /* renamed from: a */
    public static void m99241a(ConcurrentHashMap<Long, Integer> concurrentHashMap) {
        f68035m = concurrentHashMap;
    }

    /* renamed from: a */
    public static void m99243a(boolean z) {
        ak = z;
    }

    /* renamed from: a */
    public static boolean m99245a(long j) {
        if (f68035m.containsKey(Long.valueOf(j))) {
            return false;
        }
        f68035m.put(Long.valueOf(j), 0);
        return true;
    }

    /* renamed from: a */
    public static void m99239a(String str) {
        f68006J = str;
    }

    /* renamed from: a */
    public static void m99240a(HashMap<String, String> hashMap) {
        f68039q = hashMap;
    }

    /* renamed from: d */
    public static boolean m99258d() {
        return f68002F;
    }

    /* renamed from: h */
    public static boolean m99266h() {
        return f68042t;
    }

    /* renamed from: Q */
    public static AbstractC27304a m99218Q() {
        if (an == null) {
            an = new AbstractC27304a.C27305a();
        }
        return an;
    }

    /* renamed from: e */
    public static C27369u m99259e() {
        if (av == null) {
            av = C27369u.m99790a(null);
        }
        return av;
    }

    /* renamed from: i */
    public static C27275c m99267i() {
        if (f68038p == null) {
            f68038p = new C27275c();
        }
        return f68038p;
    }

    /* renamed from: k */
    public static AbstractC27233b m99271k() {
        if (ap == null) {
            ap = new AbstractC27233b() {
                /* class com.ss.android.ad.splash.core.C27287e.C272881 */
            };
        }
        return ap;
    }

    /* renamed from: L */
    public static String m99213L() {
        if (!m99259e().mo97697b()) {
            return m99214M();
        }
        String str = f68005I;
        if (TextUtils.isEmpty(str)) {
            str = ax();
        }
        return m99246b(str);
    }

    /* renamed from: M */
    public static String m99214M() {
        if (TextUtils.isEmpty(f68006J)) {
            return m99246b(ax());
        }
        return m99246b(f68006J);
    }

    /* renamed from: S */
    public static HashMap<String, String> m99220S() {
        AbstractC27228a aVar;
        if (f68039q == null && (aVar = f68040r) != null) {
            f68039q = aVar.mo97099a();
        }
        return f68039q;
    }

    public static String ae() {
        String str;
        C27275c cVar = f68038p;
        if (cVar != null) {
            str = cVar.mo97276d();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return C27368t.m99732a().mo97690u();
        }
        return str;
    }

    private static String ax() {
        return m99221T().getFilesDir().getAbsolutePath() + "/splashCache/";
    }

    /* renamed from: c */
    public static boolean m99255c() {
        return f68036n;
    }

    /* renamed from: P */
    public static AbstractC27306b m99217P() {
        if (f68043u == null) {
            synchronized (C27287e.class) {
                if (f68043u == null) {
                    Context context = f68041s;
                    f68043u = new C27310e(context, new C27316h(context));
                }
            }
        }
        return f68043u;
    }

    /* renamed from: b */
    public static boolean m99251b() {
        return au;
    }

    /* renamed from: a */
    public static void m99228a(int i) {
        f68012P = i;
    }

    /* renamed from: b */
    public static void m99247b(int i) {
        f68013Q = i;
    }

    /* renamed from: c */
    public static void m99253c(ExecutorService executorService) {
        f68031i = executorService;
    }

    /* renamed from: d */
    public static void m99256d(ExecutorService executorService) {
        f68032j = executorService;
    }

    /* renamed from: e */
    public static void m99260e(boolean z) {
        aa = z;
    }

    /* renamed from: h */
    public static void m99265h(boolean z) {
        ag = z;
    }

    /* renamed from: i */
    public static void m99268i(boolean z) {
        ah = z;
    }

    /* renamed from: a */
    public static void m99230a(Context context) {
        f68041s = context.getApplicationContext();
    }

    /* renamed from: b */
    public static void m99249b(ExecutorService executorService) {
        f68029g = executorService;
    }

    /* renamed from: c */
    public static void m99252c(int i) {
        ar = i | ar;
    }

    /* renamed from: f */
    public static void m99262f(boolean z) {
        ac = z;
    }

    /* renamed from: g */
    public static void m99264g(boolean z) {
        af = z;
    }

    /* renamed from: j */
    public static void m99270j(boolean z) {
        f175441ai = z;
    }

    /* renamed from: a */
    public static void m99231a(AbstractC27231aa aaVar) {
        if (f68043u == null) {
            C27477g.m100330d("SplashAdSdk", "SplashAdTracker is null, please init SplashAdTracker before SplashNetwork!!!");
        }
        f68025c = aaVar;
    }

    /* renamed from: b */
    public static void m99248b(long j) {
        f68035m.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public static void m99254c(boolean z) {
        f68014R = z;
    }

    /* renamed from: a */
    public static void m99232a(AbstractC27233b bVar) {
        ap = bVar;
    }

    /* renamed from: b */
    private static String m99246b(String str) {
        if (str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    /* renamed from: d */
    public static void m99257d(boolean z) {
        C27477g.m100326a("SplashAdSdk", "UDPClient. setIsFirstTimeRequestAd: " + z);
        f68018V = z;
    }

    /* renamed from: a */
    public static void m99233a(AbstractC27244b bVar) {
        f68016T = bVar;
    }

    /* renamed from: b */
    public static void m99250b(boolean z) {
        al = z;
    }

    /* renamed from: a */
    public static void m99234a(C27369u uVar) {
        av = uVar;
    }

    /* renamed from: a */
    public static void m99235a(AbstractC27445f fVar) {
        if (f68038p == null) {
            f68038p = new C27275c();
        }
        aj = fVar;
    }

    /* renamed from: a */
    public static void m99236a(AbstractC27452l lVar) {
        f68023a = lVar;
    }

    /* renamed from: a */
    public static void m99237a(AbstractC27458c cVar) {
        f68020X = cVar;
    }

    /* renamed from: a */
    public static void m99229a(final long j, final String str, final String str2, final JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            long optLong = jSONObject.optLong("ad_fetch_time", 0);
            if (optLong != 0) {
                try {
                    optJSONObject.putOpt("ad_fetch_time", Long.valueOf(optLong));
                } catch (JSONException unused) {
                    C27477g.m100325a("error in transferring ad fetch time");
                }
            }
            optJSONObject.putOpt("current_time", C27482k.m100387a(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", optJSONObject);
            jSONObject.put("is_ad_event", "1");
            if (!f68019W) {
                jSONObject.put("category", "event_v1");
            }
        }
        if (f68019W) {
            final C27229a a = new C27229a.C27230a().mo97102a(jSONObject).mo97100a(j).mo97105c(str2).mo97104b(str).mo97101a("event_v3").mo97103a();
            if (m99259e().mo97699d()) {
                m99211J().execute(new Runnable() {
                    /* class com.ss.android.ad.splash.core.C27287e.RunnableC272892 */

                    public void run() {
                        if (C27287e.f68023a != null) {
                            C27287e.f68023a.mo98022a(a);
                        }
                    }
                });
            } else {
                f68044v.post(new Runnable() {
                    /* class com.ss.android.ad.splash.core.C27287e.RunnableC272903 */

                    public void run() {
                        if (C27287e.f68023a != null) {
                            C27287e.f68023a.mo98022a(a);
                        }
                    }
                });
            }
        } else if (m99259e().mo97699d()) {
            m99211J().execute(new Runnable() {
                /* class com.ss.android.ad.splash.core.C27287e.RunnableC272914 */

                public void run() {
                    if (C27287e.f68023a != null) {
                        C27287e.f68023a.mo98023a(str, str2, j, 0, jSONObject);
                    }
                }
            });
        } else {
            f68044v.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.C27287e.RunnableC272925 */

                public void run() {
                    if (C27287e.f68023a != null) {
                        C27287e.f68023a.mo98023a(str, str2, j, 0, jSONObject);
                    }
                }
            });
        }
    }
}
