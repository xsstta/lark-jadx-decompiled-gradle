package com.ss.android.lark.platform.statistics.p2502b;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.network.C51869i;
import com.ss.android.lark.platform.statistics.C51986d;
import com.ss.android.lark.platform.statistics.C51989f;
import com.ss.android.lark.utils.C57765ac;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.b.b */
public class C51963b {

    /* renamed from: a */
    public static JSONObject f129018a;

    /* renamed from: b */
    public static JSONObject f129019b;

    /* renamed from: c */
    static int f129020c;

    /* renamed from: d */
    private static C51982j f129021d = new C51982j(C51985l.class, 16);

    /* renamed from: e */
    private static ConcurrentHashMap<String, C51985l> f129022e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ThreadLocal<Stack<String>> f129023f = new ThreadLocal() {
        /* class com.ss.android.lark.platform.statistics.p2502b.C51963b.C519641 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Stack<String> initialValue() {
            return new Stack<>();
        }
    };

    /* renamed from: g */
    private static ConcurrentHashMap<String, Object> f129024g = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static boolean m201564a(Context context) {
        return C57765ac.m224187a(context) || C57765ac.m224190d(context) || C57765ac.m224189c(context) || C57765ac.m224194h(context);
    }

    /* renamed from: b */
    public static void m201566b() {
        C51869i.m201154a((String) null);
        CoreThreadPool.getDefault().getCachedThreadPool().execute($$Lambda$b$WTxLQuUZsEn7oXzTiG2EqMm9LVs.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m201569c() {
        C51986d.m201656a(f129018a, f129019b, f129024g);
        f129018a = null;
        f129019b = null;
        f129024g.clear();
    }

    /* renamed from: a */
    public static String m201555a() {
        String pop;
        C51985l remove;
        String str = "";
        try {
            if (f129023f.get().isEmpty() || (remove = f129022e.remove((pop = f129023f.get().pop()))) == null) {
                return str;
            }
            remove.mo178190i();
            if (remove.mo178183b(2)) {
                remove.mo178181a(f129018a, f129019b);
                str = pop;
            }
            Log.m165389i("BoostTracer", remove.toString());
            m201558a(remove);
            C51869i.m201157c(null);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static Object m201565b(String str) {
        return f129024g.get(str);
    }

    /* renamed from: a */
    public static void m201558a(C51985l lVar) {
        C51966c.m201571a().mo178145a(lVar);
        f129021d.mo178175a(lVar);
    }

    /* renamed from: a */
    public static long m201554a(String str) {
        Exception e;
        long j;
        long j2 = 0;
        try {
            if (f129019b == null) {
                j = 0;
            } else {
                j = f129018a.getLong("to_feed_render");
            }
            if (j == 0) {
                return 0;
            }
            try {
                m201557a(j, str);
                return j;
            } catch (Exception e2) {
                e = e2;
                j2 = j;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return j2;
        }
    }

    /* renamed from: a */
    public static void m201562a(boolean z) {
        f129020c = !z ? 1 : 0;
    }

    /* renamed from: a */
    public static void m201556a(long j, long j2) {
        C51985l.f129081c = j2 - j;
    }

    /* renamed from: a */
    public static <V> void m201559a(String str, V v) {
        f129024g.put(str, v);
    }

    /* renamed from: a */
    public static void m201557a(final long j, final String str) {
        C51869i.m201154a((String) null);
        if (C51973e.m201586d() || C36083a.m141486a().getSafeModeDependency().mo133109a()) {
            f129018a = null;
            f129019b = null;
            return;
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51963b.RunnableC519652 */

            public void run() {
                try {
                    C51963b.f129018a.put("latency", j);
                    C51963b.f129018a.put("data_empty", C51963b.f129020c);
                } catch (JSONException e) {
                    Log.m165383e("BoostTracer", e.toString());
                }
                C51989f.m201665a(C51973e.m201591i(), C51963b.f129018a, C51963b.f129019b, str, j, C51973e.m201595m());
                C51963b.f129018a = null;
                C51963b.f129019b = null;
            }
        });
    }

    /* renamed from: a */
    public static void m201560a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            ConcurrentHashMap<String, C51985l> concurrentHashMap = f129022e;
            C51985l remove = concurrentHashMap.remove(str + str2);
            if (remove != null) {
                remove.mo178190i();
                if (remove.mo178183b(2)) {
                    remove.mo178181a(f129018a, f129019b);
                }
                Log.m165389i("BoostTracer", remove.toString());
                m201558a(remove);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m201563a(boolean z, boolean z2) {
        if (z) {
            f129018a = new JSONObject();
            f129019b = new JSONObject();
        }
    }

    /* renamed from: a */
    public static void m201561a(String str, String str2, int i) {
        try {
            C51985l c = m201568c(str, str2, i);
            f129022e.put(str, c);
            c.mo178189h();
            f129023f.get().push(str);
            C51869i.m201157c(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static C51985l m201568c(String str, String str2, int i) {
        C51985l lVar = (C51985l) f129021d.mo178174a(C51985l.class);
        lVar.mo178182b(str);
        lVar.mo178180a(str2);
        lVar.mo178179a((long) i);
        return lVar;
    }

    /* renamed from: b */
    public static void m201567b(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            C51985l c = m201568c(str, str2, i);
            ConcurrentHashMap<String, C51985l> concurrentHashMap = f129022e;
            concurrentHashMap.put(str + str2, c);
            c.mo178189h();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
