package com.ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.socialbase.downloader.constants.DownloadCacheSyncStatus;
import com.ss.android.socialbase.downloader.depend.AbstractC60025c;
import com.ss.android.socialbase.downloader.depend.AbstractC60026d;
import com.ss.android.socialbase.downloader.depend.AbstractC60037o;
import com.ss.android.socialbase.downloader.depend.AbstractC60038p;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.AbstractC60081a;
import com.ss.android.socialbase.downloader.impls.C60088b;
import com.ss.android.socialbase.downloader.impls.C60089c;
import com.ss.android.socialbase.downloader.impls.C60090d;
import com.ss.android.socialbase.downloader.impls.C60095e;
import com.ss.android.socialbase.downloader.impls.C60096f;
import com.ss.android.socialbase.downloader.impls.C60098g;
import com.ss.android.socialbase.downloader.impls.C60100h;
import com.ss.android.socialbase.downloader.impls.C60101i;
import com.ss.android.socialbase.downloader.impls.C60102j;
import com.ss.android.socialbase.downloader.impls.C60104l;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.ServiceConnectionC60105m;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import com.ss.android.socialbase.downloader.network.AbstractC60136f;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;
import com.ss.android.socialbase.downloader.network.AbstractC60138h;
import com.ss.android.socialbase.downloader.p3024a.C59986a;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.AbstractC59993b;
import com.ss.android.socialbase.downloader.p3026c.AbstractC59994c;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.p3028e.ThreadFactoryC60069a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Skip;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.downloader.b */
public class C60046b {

    /* renamed from: A */
    private static volatile AbstractC59994c f149684A;

    /* renamed from: B */
    private static volatile AbstractC60037o f149685B;

    /* renamed from: C */
    private static volatile List<AbstractC60042t> f149686C = new ArrayList();

    /* renamed from: D */
    private static volatile boolean f149687D = false;

    /* renamed from: E */
    private static volatile OkHttpClient f149688E = null;

    /* renamed from: F */
    private static boolean f149689F = false;

    /* renamed from: G */
    private static int f149690G;

    /* renamed from: H */
    private static final int f149691H;

    /* renamed from: I */
    private static final int f149692I = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: J */
    private static final int f149693J;

    /* renamed from: K */
    private static final int f149694K;

    /* renamed from: L */
    private static int f149695L = 8192;

    /* renamed from: M */
    private static boolean f149696M;

    /* renamed from: N */
    private static final List<AbstractC60025c> f149697N = new ArrayList();

    /* renamed from: O */
    private static final List<AbstractC60038p> f149698O = new ArrayList();

    /* renamed from: P */
    private static int f149699P;

    /* renamed from: Q */
    private static boolean f149700Q = true;

    /* renamed from: R */
    private static AbstractC60066p f149701R;

    /* renamed from: S */
    private static AbstractC59993b f149702S;

    /* renamed from: T */
    private static volatile boolean f149703T = false;

    /* renamed from: a */
    private static volatile Context f149704a;

    /* renamed from: b */
    private static volatile AbstractC60059i f149705b;

    /* renamed from: c */
    private static volatile AbstractC60060j f149706c;

    /* renamed from: d */
    private static volatile AbstractC60058h f149707d;

    /* renamed from: e */
    private static volatile AbstractC60040r f149708e;

    /* renamed from: f */
    private static volatile AbstractC60081a f149709f;

    /* renamed from: g */
    private static volatile AbstractC60064n f149710g;

    /* renamed from: h */
    private static volatile AbstractC60026d f149711h;

    /* renamed from: i */
    private static volatile AbstractC60064n f149712i;

    /* renamed from: j */
    private static volatile AbstractC60138h f149713j;

    /* renamed from: k */
    private static volatile AbstractC60136f f149714k;

    /* renamed from: l */
    private static volatile AbstractC60138h f149715l;

    /* renamed from: m */
    private static volatile AbstractC60136f f149716m;

    /* renamed from: n */
    private static volatile AbstractC60061k f149717n;

    /* renamed from: o */
    private static volatile ExecutorService f149718o;

    /* renamed from: p */
    private static volatile ExecutorService f149719p;

    /* renamed from: q */
    private static volatile ExecutorService f149720q;

    /* renamed from: r */
    private static volatile ExecutorService f149721r;

    /* renamed from: s */
    private static volatile ExecutorService f149722s;

    /* renamed from: t */
    private static volatile ExecutorService f149723t;

    /* renamed from: u */
    private static volatile ExecutorService f149724u;

    /* renamed from: v */
    private static volatile ExecutorService f149725v;

    /* renamed from: w */
    private static volatile AbstractC60057g f149726w;

    /* renamed from: x */
    private static volatile DownloadReceiver f149727x;

    /* renamed from: y */
    private static volatile AbstractC60067q f149728y;

    /* renamed from: z */
    private static volatile AbstractC60065o f149729z;

    /* renamed from: a */
    public static void m232972a(AbstractC60066p pVar) {
    }

    private C60046b() {
    }

    /* renamed from: A */
    public static boolean m232939A() {
        return f149700Q;
    }

    /* renamed from: D */
    public static AbstractC60040r m232942D() {
        return f149708e;
    }

    /* renamed from: I */
    public static AbstractC59993b m232947I() {
        return f149702S;
    }

    /* renamed from: J */
    public static AbstractC60066p m232948J() {
        return f149701R;
    }

    /* renamed from: d */
    public static AbstractC60138h m232989d() {
        return f149713j;
    }

    /* renamed from: f */
    public static AbstractC60136f m232993f() {
        return f149714k;
    }

    /* renamed from: g */
    public static AbstractC59994c m232995g() {
        return f149684A;
    }

    /* renamed from: y */
    public static int m233015y() {
        return f149699P;
    }

    /* renamed from: a */
    static synchronized void m232966a(C60056f fVar) {
        synchronized (C60046b.class) {
            if (f149703T) {
                C59990a.m232841e("DownloadComponentManager", "component has init");
                return;
            }
            boolean z = f149687D;
            if (fVar != null) {
                m232958a(fVar.mo204743a());
                m232969a(fVar.mo204744b());
                m232970a(fVar.mo204745c());
                m232968a(fVar.mo204759q());
                m232964a(fVar.mo204766x());
                m232983b(fVar.mo204758p());
                m232975a(fVar.mo204746d());
                m232974a(fVar.mo204747e());
                m232971a(fVar.mo204748f());
                m232987c(fVar.mo204749g());
                m232990d(fVar.mo204750h());
                m232992e(fVar.mo204751i());
                m232994f(fVar.mo204752j());
                m232996g(fVar.mo204753k());
                m232998h(fVar.mo204754l());
                m232978a(fVar.mo204755m());
                m232986b(fVar.mo204756n());
                m232962a(fVar.mo204757o());
                if (fVar.mo204763u() != null) {
                    f149729z = fVar.mo204763u();
                }
                if (fVar.mo204761s() > 1024) {
                    f149695L = fVar.mo204761s();
                }
                m232967a(fVar.mo204760r());
                if (fVar.mo204762t()) {
                    f149687D = true;
                }
                f149699P = fVar.mo204764v();
                m232963a(fVar.mo204767y());
                m232979a(fVar.mo204765w());
                m232959a(fVar.mo204768z());
            }
            if (f149705b == null) {
                f149705b = new C60090d();
            }
            if (f149710g == null) {
                f149710g = new C60100h();
            }
            if (f149712i == null) {
                f149712i = new ServiceConnectionC60105m();
            }
            if (f149706c == null) {
                f149706c = new C60101i();
            }
            if (f149709f == null) {
                f149709f = new C60095e();
            }
            if (f149707d == null) {
                f149707d = new C60089c();
            }
            if (f149726w == null) {
                f149726w = new C60088b();
            }
            if (f149728y == null) {
                f149728y = new C60102j();
            }
            int i = f149690G;
            if (i <= 0 || i > f149691H) {
                f149690G = f149691H;
            }
            m232949K();
            if (f149687D && !z && !C60161d.m233802c()) {
                C60104l.m233401a(true).mo204811d();
            } else if (C60161d.m233810d()) {
                ExecutorService l = m233002l();
                if (l != null) {
                    l.execute(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.downloader.C60046b.RunnableC600471 */

                        public void run() {
                            Context G = C60046b.m232945G();
                            if (G != null) {
                                C60161d.m233800c(G);
                            }
                        }
                    });
                }
            } else {
                Context G = m232945G();
                if (G != null) {
                    C60161d.m233800c(G);
                }
            }
            f149703T = true;
        }
    }

    /* renamed from: a */
    public static void m232965a(AbstractC60042t tVar) {
        if (tVar != null) {
            synchronized (f149686C) {
                f149686C.add(tVar);
            }
        }
    }

    /* renamed from: a */
    public static void m232961a(AbstractC60025c cVar) {
        List<AbstractC60025c> list = f149697N;
        synchronized (list) {
            if (cVar != null) {
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m232960a(DownloadCacheSyncStatus downloadCacheSyncStatus) {
        List<AbstractC60025c> list = f149697N;
        synchronized (list) {
            for (AbstractC60025c cVar : list) {
                if (cVar != null) {
                    if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_START) {
                        cVar.mo204505a();
                    } else if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_SUCCESS) {
                        cVar.mo204506b();
                    }
                }
            }
            if (downloadCacheSyncStatus == DownloadCacheSyncStatus.SYNC_SUCCESS) {
                f149697N.clear();
            }
        }
    }

    /* renamed from: a */
    public static void m232973a(DownloadTask downloadTask, int i) {
        List<AbstractC60038p> list = f149698O;
        synchronized (list) {
            for (AbstractC60038p pVar : list) {
                if (pVar != null) {
                    pVar.mo204522a(downloadTask, i);
                }
            }
        }
    }

    /* renamed from: a */
    private static int[] m232980a(int i) {
        if (i == 1) {
            return new int[]{0};
        } else if (i != 2) {
            return i != 3 ? new int[]{1, 0} : new int[]{0, 1};
        } else {
            return new int[]{1};
        }
    }

    /* renamed from: a */
    public static synchronized void m232971a(AbstractC60061k kVar) {
        synchronized (C60046b.class) {
            if (kVar != null) {
                f149717n = kVar;
                if (f149705b instanceof C60090d) {
                    ((C60090d) f149705b).mo204941e();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m232978a(ExecutorService executorService) {
        if (executorService != null) {
            f149724u = executorService;
        }
    }

    /* renamed from: a */
    private static void m232962a(AbstractC60026d dVar) {
        if (f149711h == null) {
            f149711h = dVar;
        }
    }

    /* renamed from: a */
    public static void m232977a(Runnable runnable, boolean z) {
        if (runnable != null) {
            if (!z || C60161d.m233810d()) {
                m233001k().execute(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public static void m232976a(Runnable runnable) {
        if (runnable != null) {
            if (!C60161d.m233810d()) {
                runnable.run();
            } else {
                m233007q().execute(runnable);
            }
        }
    }

    /* renamed from: a */
    private static void m232975a(AbstractC60138h hVar) {
        if (hVar != null) {
            f149713j = hVar;
        }
        f149696M = f149713j != null;
    }

    /* renamed from: a */
    private static void m232974a(AbstractC60136f fVar) {
        if (fVar != null) {
            f149714k = fVar;
        }
    }

    /* renamed from: a */
    private static void m232969a(AbstractC60059i iVar) {
        if (iVar != null) {
            f149705b = iVar;
        }
    }

    /* renamed from: a */
    private static void m232970a(AbstractC60060j jVar) {
        if (jVar != null) {
            f149706c = jVar;
        }
    }

    /* renamed from: a */
    public static void m232963a(AbstractC60037o oVar) {
        f149685B = oVar;
        C60148a.m233723a();
    }

    /* renamed from: a */
    private static void m232979a(boolean z) {
        f149700Q = z;
    }

    /* renamed from: a */
    private static void m232968a(AbstractC60058h hVar) {
        if (hVar != null) {
            f149707d = hVar;
        }
    }

    /* renamed from: a */
    public static void m232964a(AbstractC60040r rVar) {
        if (rVar != null) {
            f149708e = rVar;
        }
    }

    /* renamed from: a */
    private static void m232967a(AbstractC60057g gVar) {
        if (gVar != null) {
            f149726w = gVar;
        }
    }

    /* renamed from: B */
    public static synchronized int m232940B() {
        int i;
        synchronized (C60046b.class) {
            i = f149695L;
        }
        return i;
    }

    /* renamed from: G */
    public static synchronized Context m232945G() {
        Context context;
        synchronized (C60046b.class) {
            context = f149704a;
        }
        return context;
    }

    /* renamed from: H */
    public static synchronized boolean m232946H() {
        boolean z;
        synchronized (C60046b.class) {
            z = f149696M;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized boolean m232988c() {
        boolean z;
        synchronized (C60046b.class) {
            z = f149687D;
        }
        return z;
    }

    /* renamed from: e */
    public static List<AbstractC60042t> m232991e() {
        List<AbstractC60042t> list;
        synchronized (f149686C) {
            list = f149686C;
        }
        return list;
    }

    /* renamed from: j */
    public static synchronized AbstractC60065o m233000j() {
        AbstractC60065o oVar;
        synchronized (C60046b.class) {
            oVar = f149729z;
        }
        return oVar;
    }

    /* renamed from: l */
    public static ExecutorService m233002l() {
        if (f149719p != null) {
            return f149719p;
        }
        return m233001k();
    }

    /* renamed from: m */
    public static ExecutorService m233003m() {
        if (f149721r != null) {
            return f149721r;
        }
        return m233005o();
    }

    /* renamed from: n */
    public static ExecutorService m233004n() {
        if (f149722s != null) {
            return f149722s;
        }
        return m233005o();
    }

    /* renamed from: s */
    public static synchronized AbstractC60061k m233009s() {
        AbstractC60061k kVar;
        synchronized (C60046b.class) {
            kVar = f149717n;
        }
        return kVar;
    }

    /* renamed from: C */
    public static AbstractC60058h m232941C() {
        if (f149707d == null) {
            synchronized (C60046b.class) {
                if (f149707d == null) {
                    f149707d = new C60089c();
                }
            }
        }
        return f149707d;
    }

    /* renamed from: E */
    public static AbstractC60057g m232943E() {
        if (f149726w == null) {
            synchronized (C60046b.class) {
                if (f149726w == null) {
                    f149726w = new C60088b();
                }
            }
        }
        return f149726w;
    }

    /* renamed from: F */
    public static AbstractC60067q m232944F() {
        if (f149728y == null) {
            synchronized (C60046b.class) {
                if (f149728y == null) {
                    f149728y = new C60102j();
                }
            }
        }
        return f149728y;
    }

    /* renamed from: h */
    public static AbstractC60138h m232997h() {
        if (f149715l == null) {
            synchronized (C60046b.class) {
                if (f149715l == null) {
                    f149715l = new C60098g();
                }
            }
        }
        return f149715l;
    }

    /* renamed from: i */
    public static AbstractC60136f m232999i() {
        if (f149716m == null) {
            synchronized (C60046b.class) {
                if (f149716m == null) {
                    f149716m = new C60096f();
                }
            }
        }
        return f149716m;
    }

    /* renamed from: t */
    public static AbstractC60059i m233010t() {
        if (f149705b == null) {
            synchronized (C60046b.class) {
                if (f149705b == null) {
                    f149705b = new C60090d();
                }
            }
        }
        return f149705b;
    }

    /* renamed from: u */
    public static AbstractC60064n m233011u() {
        if (f149710g == null) {
            synchronized (C60046b.class) {
                if (f149710g == null) {
                    f149710g = new C60100h();
                }
            }
        }
        return f149710g;
    }

    /* renamed from: v */
    public static AbstractC60064n m233012v() {
        if (f149712i == null) {
            synchronized (C60046b.class) {
                if (f149712i == null) {
                    f149712i = new ServiceConnectionC60105m();
                }
            }
        }
        return f149712i;
    }

    /* renamed from: w */
    public static AbstractC60060j m233013w() {
        if (f149706c == null) {
            synchronized (C60046b.class) {
                if (f149706c == null) {
                    f149706c = new C60101i();
                }
            }
        }
        return f149706c;
    }

    /* renamed from: x */
    public static AbstractC60081a m233014x() {
        if (f149709f == null) {
            synchronized (C60046b.class) {
                if (f149709f == null) {
                    f149709f = new C60095e();
                }
            }
        }
        return f149709f;
    }

    /* renamed from: z */
    public static JSONObject m233016z() {
        if (f149685B == null || f149685B.mo204521a() == null) {
            return new JSONObject();
        }
        return f149685B.mo204521a();
    }

    /* renamed from: K */
    private static void m232949K() {
        if (f149727x == null) {
            f149727x = new DownloadReceiver();
        }
        if (!f149689F) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                m232952a(f149704a, f149727x, intentFilter);
                f149689F = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m232982b() {
        synchronized (C60046b.class) {
            if (!f149687D) {
                f149687D = true;
                try {
                    Intent intent = new Intent(m232945G(), DownloadHandleService.class);
                    intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                    m232945G().startService(intent);
                    if (!C60161d.m233802c()) {
                        C60104l.m233401a(true).mo204811d();
                    }
                } catch (Throwable th) {
                    f149687D = false;
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: k */
    public static ExecutorService m233001k() {
        if (f149718o == null) {
            synchronized (C60046b.class) {
                if (f149718o == null) {
                    int i = f149691H;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC60069a("DownloadThreadPool-cpu-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f149718o = threadPoolExecutor;
                }
            }
        }
        return f149718o;
    }

    /* renamed from: o */
    public static ExecutorService m233005o() {
        if (f149720q == null) {
            synchronized (C60046b.class) {
                if (f149720q == null) {
                    int i = f149693J;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC60069a("DownloadThreadPool-mix-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f149720q = threadPoolExecutor;
                }
            }
        }
        return f149720q;
    }

    /* renamed from: p */
    public static ExecutorService m233006p() {
        if (f149724u == null) {
            synchronized (C60046b.class) {
                if (f149724u == null) {
                    int i = f149692I;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC60069a("DownloadThreadPool-chunk-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f149724u = threadPoolExecutor;
                }
            }
        }
        return f149724u;
    }

    /* renamed from: q */
    public static ExecutorService m233007q() {
        if (f149723t == null) {
            synchronized (C60046b.class) {
                if (f149723t == null) {
                    int i = f149694K;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC60069a("DownloadThreadPool-db-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f149723t = threadPoolExecutor;
                }
            }
        }
        return f149723t;
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        f149691H = availableProcessors;
        f149693J = availableProcessors;
        f149694K = availableProcessors;
    }

    /* renamed from: r */
    public static OkHttpClient m233008r() {
        if (f149688E == null) {
            synchronized (C60046b.class) {
                if (f149688E == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.connectTimeout(30000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
                    if (f149725v != null) {
                        builder.dispatcher(new Dispatcher(f149725v));
                    }
                    f149688E = builder.build();
                }
            }
        }
        return f149688E;
    }

    /* renamed from: a */
    static synchronized void m232957a() {
        synchronized (C60046b.class) {
            try {
                if (!(!f149689F || f149727x == null || f149704a == null)) {
                    f149704a.unregisterReceiver(f149727x);
                    f149689F = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    /* renamed from: a */
    private static void m232959a(AbstractC59994c cVar) {
        if (cVar != null) {
            f149684A = cVar;
        }
    }

    /* renamed from: b */
    private static void m232983b(int i) {
        if (i > 0) {
            f149690G = i;
        }
    }

    /* renamed from: c */
    private static void m232987c(ExecutorService executorService) {
        if (executorService != null) {
            f149718o = executorService;
        }
    }

    /* renamed from: d */
    private static void m232990d(ExecutorService executorService) {
        if (executorService != null) {
            f149719p = executorService;
        }
    }

    /* renamed from: e */
    private static void m232992e(ExecutorService executorService) {
        if (executorService != null) {
            f149720q = executorService;
        }
    }

    /* renamed from: f */
    private static void m232994f(ExecutorService executorService) {
        if (executorService != null) {
            f149721r = executorService;
        }
    }

    /* renamed from: g */
    private static void m232996g(ExecutorService executorService) {
        if (executorService != null) {
            f149722s = executorService;
        }
    }

    /* renamed from: h */
    private static void m232998h(ExecutorService executorService) {
        if (executorService != null) {
            f149723t = executorService;
        }
    }

    /* renamed from: b */
    public static void m232986b(ExecutorService executorService) {
        if (executorService != null) {
            f149725v = executorService;
        }
    }

    /* renamed from: a */
    public static int m232950a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        return m232951a(downloadInfo.getUrl(), downloadInfo.getSavePath());
    }

    /* renamed from: b */
    public static void m232984b(AbstractC60025c cVar) {
        List<AbstractC60025c> list = f149697N;
        synchronized (list) {
            if (cVar != null) {
                if (list.contains(cVar)) {
                    list.remove(cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m232958a(Context context) {
        synchronized (C60046b.class) {
            if (context != null) {
                if (f149704a == null) {
                    f149704a = context.getApplicationContext();
                    C59986a.m232821a().mo204265a(f149704a);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m232951a(String str, String str2) {
        AbstractC60060j w = m233013w();
        if (w == null) {
            return 0;
        }
        return w.mo204771a(str, str2);
    }

    /* renamed from: b */
    public static void m232985b(DownloadTask downloadTask, int i) {
        List<AbstractC60038p> list = f149698O;
        synchronized (list) {
            for (AbstractC60038p pVar : list) {
                if (pVar != null) {
                    pVar.mo204523b(downloadTask, i);
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m232952a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static AbstractC60137g m232955a(boolean z, int i, String str, List<HttpHeader> list) throws Exception {
        return m232956a(z, i, str, list, 0, false, null);
    }

    /* renamed from: a */
    public static AbstractC60135e m232953a(String str, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) throws Exception {
        Exception e = null;
        for (int i2 : m232980a(i)) {
            try {
                AbstractC60135e b = m232981b(str, list, i2, z, downloadInfo);
                if (b != null) {
                    return b;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    /* renamed from: b */
    private static AbstractC60135e m232981b(String str, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) throws BaseException, IOException {
        AbstractC60136f fVar;
        Throwable th;
        IOException iOException;
        if (i == 1) {
            fVar = m232993f();
        } else {
            fVar = m232999i();
        }
        if (fVar != null) {
            long j = 0;
            if (z) {
                try {
                    j = System.currentTimeMillis();
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th2) {
                    iOException = e;
                    th = th2;
                }
            }
            AbstractC60135e a = fVar.mo204944a(str, list);
            if (z) {
                C59992a.m232852a(a, str, System.currentTimeMillis() - j, "head", i, null, downloadInfo);
            }
            return a;
        }
        throw new BaseException(1022, new IOException("httpService not exist, netLib = " + i));
        if (z) {
            C59992a.m232852a(null, str, System.currentTimeMillis() - 0, "head", i, iOException, downloadInfo);
        }
        throw th;
    }

    /* renamed from: a */
    private static AbstractC60137g m232954a(int i, String str, List<HttpHeader> list, int i2, boolean z, DownloadInfo downloadInfo) throws BaseException, IOException {
        AbstractC60138h hVar;
        Throwable th;
        IOException iOException;
        if (i2 == 1) {
            hVar = m232989d();
        } else {
            hVar = m232997h();
        }
        if (hVar != null) {
            long j = 0;
            if (z) {
                try {
                    j = System.currentTimeMillis();
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th2) {
                    iOException = e;
                    th = th2;
                }
            }
            AbstractC60137g a = hVar.mo204948a(i, str, list);
            if (z) {
                C59992a.m232852a(a, str, System.currentTimeMillis() - j, "get", i2, null, downloadInfo);
            }
            return a;
        }
        throw new BaseException(1022, new IOException("httpService not exist, netLib = " + i2));
        if (z) {
            C59992a.m232852a(null, str, System.currentTimeMillis() - 0, "get", i2, iOException, downloadInfo);
        }
        throw th;
    }

    /* renamed from: a */
    public static AbstractC60137g m232956a(boolean z, int i, String str, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) throws Exception {
        if (!z) {
            i2 = 2;
        }
        Exception e = null;
        for (int i3 : m232980a(i2)) {
            try {
                AbstractC60137g a = m232954a(i, str, list, i3, z2, downloadInfo);
                if (a != null) {
                    return a;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
