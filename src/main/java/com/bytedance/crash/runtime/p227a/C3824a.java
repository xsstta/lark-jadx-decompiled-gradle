package com.bytedance.crash.runtime.p227a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.p226j.AbstractC3770a;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.util.C3926a;
import com.bytedance.crash.util.C3937e;
import com.bytedance.crash.util.C3955q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.a.a */
public class C3824a {

    /* renamed from: B */
    private static volatile C3824a f11742B = null;

    /* renamed from: a */
    public static boolean f11743a = true;

    /* renamed from: b */
    public static boolean f11744b = false;

    /* renamed from: c */
    public static boolean f11745c = false;

    /* renamed from: d */
    public static int f11746d = 1;

    /* renamed from: e */
    public static long f11747e = -1;

    /* renamed from: y */
    private static boolean f11748y;

    /* renamed from: A */
    private final LinkedList<C3828a> f11749A = new LinkedList<>();

    /* renamed from: C */
    private int f11750C = 50;

    /* renamed from: f */
    public final List<String> f11751f = new ArrayList();

    /* renamed from: g */
    public final List<Long> f11752g = new ArrayList();

    /* renamed from: h */
    public final List<String> f11753h = new ArrayList();

    /* renamed from: i */
    public final List<Long> f11754i = new ArrayList();

    /* renamed from: j */
    public ArrayList<WeakReference<Activity>> f11755j = new ArrayList<>();

    /* renamed from: k */
    public String f11756k;

    /* renamed from: l */
    public long f11757l;

    /* renamed from: m */
    public String f11758m;

    /* renamed from: n */
    public long f11759n;

    /* renamed from: o */
    public String f11760o;

    /* renamed from: p */
    public long f11761p;

    /* renamed from: q */
    public String f11762q;

    /* renamed from: r */
    public long f11763r;

    /* renamed from: s */
    public String f11764s;

    /* renamed from: t */
    public long f11765t;

    /* renamed from: u */
    public boolean f11766u;

    /* renamed from: v */
    public long f11767v = -1;

    /* renamed from: w */
    public int f11768w;

    /* renamed from: x */
    public AbstractC3770a f11769x;

    /* renamed from: z */
    private final Application f11770z;

    /* renamed from: a */
    public static void m15816a() {
        f11748y = true;
    }

    /* renamed from: c */
    public static long m15818c() {
        return f11747e;
    }

    /* renamed from: f */
    public boolean mo15401f() {
        return this.f11766u;
    }

    /* renamed from: g */
    public ArrayList<WeakReference<Activity>> mo15402g() {
        return this.f11755j;
    }

    /* renamed from: e */
    public long mo15400e() {
        return SystemClock.uptimeMillis() - this.f11767v;
    }

    /* renamed from: i */
    public String mo15404i() {
        return String.valueOf(this.f11760o);
    }

    /* renamed from: b */
    public static int m15817b() {
        int i = f11746d;
        if (i != 1) {
            return i;
        }
        if (f11748y) {
            return 2;
        }
        return 1;
    }

    /* renamed from: l */
    private JSONArray m15821l() {
        return m15814a(this.f11751f, this.f11752g);
    }

    /* renamed from: m */
    private JSONArray m15822m() {
        return m15814a(this.f11753h, this.f11754i);
    }

    /* renamed from: d */
    public static C3824a m15819d() {
        if (f11742B == null) {
            synchronized (C3824a.class) {
                if (f11742B == null) {
                    f11742B = new C3824a(C3774m.m15610k());
                }
            }
        }
        return f11742B;
    }

    /* renamed from: k */
    private void m15820k() {
        if (Build.VERSION.SDK_INT >= 14 && this.f11770z != null) {
            this.f11770z.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.bytedance.crash.runtime.p227a.C3824a.C38273 */

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                    String str;
                    C3824a aVar = C3824a.this;
                    if (aVar.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    aVar.f11758m = str;
                    C3824a.this.f11759n = System.currentTimeMillis();
                    C3824a aVar2 = C3824a.this;
                    aVar2.mo15399a(aVar2.f11758m, C3824a.this.f11759n, "onStart", activity.hashCode());
                }

                public void onActivityStopped(Activity activity) {
                    String str;
                    C3824a aVar = C3824a.this;
                    if (aVar.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    aVar.f11764s = str;
                    C3824a.this.f11765t = System.currentTimeMillis();
                    C3824a aVar2 = C3824a.this;
                    aVar2.mo15399a(aVar2.f11764s, C3824a.this.f11765t, "onStop", activity.hashCode());
                }

                public void onActivityDestroyed(Activity activity) {
                    String str;
                    if (C3824a.this.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    int indexOf = C3824a.this.f11751f.indexOf(str);
                    if (indexOf > -1 && indexOf < C3824a.this.f11751f.size()) {
                        C3824a.this.f11751f.remove(indexOf);
                        C3824a.this.f11752g.remove(indexOf);
                    }
                    C3824a.this.f11753h.add(str);
                    long currentTimeMillis = System.currentTimeMillis();
                    C3824a.this.f11754i.add(Long.valueOf(currentTimeMillis));
                    C3824a.this.mo15399a(str, currentTimeMillis, "onDestroy", activity.hashCode());
                }

                public void onActivityPaused(Activity activity) {
                    String str;
                    C3824a aVar = C3824a.this;
                    if (aVar.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    aVar.f11762q = str;
                    C3824a.this.f11763r = System.currentTimeMillis();
                    C3824a aVar2 = C3824a.this;
                    aVar2.f11768w--;
                    if (C3824a.this.f11768w == 0) {
                        C3824a.this.f11766u = false;
                        C3824a.f11745c = false;
                        C3824a.this.f11767v = SystemClock.uptimeMillis();
                    } else if (C3824a.this.f11768w < 0) {
                        C3824a.this.f11768w = 0;
                        C3824a.this.f11766u = false;
                        C3824a.f11745c = false;
                        C3824a.this.f11767v = SystemClock.uptimeMillis();
                    }
                    C3824a aVar3 = C3824a.this;
                    aVar3.mo15399a(aVar3.f11762q, C3824a.this.f11763r, "onPause", activity.hashCode());
                }

                public void onActivityResumed(Activity activity) {
                    String str;
                    C3824a aVar = C3824a.this;
                    if (aVar.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    aVar.f11760o = str;
                    C3824a.this.f11761p = System.currentTimeMillis();
                    C3824a.this.f11768w++;
                    if (!C3824a.this.f11766u) {
                        C3824a.this.f11766u = true;
                        if (C3824a.f11743a) {
                            C3824a.f11743a = false;
                            C3824a.f11746d = 1;
                            C3824a.f11747e = C3824a.this.f11761p;
                        }
                        if (C3824a.this.f11760o.equals(C3824a.this.f11762q)) {
                            if (C3824a.f11745c && !C3824a.f11744b) {
                                C3824a.f11746d = 4;
                                C3824a.f11747e = C3824a.this.f11761p;
                            } else if (!C3824a.f11745c) {
                                C3824a.f11746d = 3;
                                C3824a.f11747e = C3824a.this.f11761p;
                            }
                        }
                    }
                    C3824a aVar2 = C3824a.this;
                    aVar2.mo15399a(aVar2.f11760o, C3824a.this.f11761p, "onResume", activity.hashCode());
                }

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String str;
                    boolean z;
                    C3824a aVar = C3824a.this;
                    if (aVar.f11769x == null) {
                        str = activity.getClass().getName();
                    } else {
                        str = C3824a.this.f11769x.mo15296a(activity);
                    }
                    aVar.f11756k = str;
                    C3824a.this.f11757l = System.currentTimeMillis();
                    if (bundle != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C3824a.f11744b = z;
                    C3824a.f11745c = true;
                    C3824a.this.f11751f.add(C3824a.this.f11756k);
                    C3824a.this.f11752g.add(Long.valueOf(C3824a.this.f11757l));
                    C3824a aVar2 = C3824a.this;
                    aVar2.mo15399a(aVar2.f11756k, C3824a.this.f11757l, "onCreate", activity.hashCode());
                    C3824a.this.f11755j.add(new WeakReference<>(activity));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.runtime.a.a$a */
    public static class C3828a {

        /* renamed from: a */
        String f11778a;

        /* renamed from: b */
        String f11779b;

        /* renamed from: c */
        long f11780c;

        public String toString() {
            return C3937e.m16353a().format(new Date(this.f11780c)) + " : " + this.f11778a + ' ' + this.f11779b;
        }

        C3828a(String str, String str2, long j) {
            this.f11779b = str2;
            this.f11780c = j;
            this.f11778a = str;
        }
    }

    /* renamed from: j */
    public JSONArray mo15405j() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f11749A).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C3828a) it.next()).toString());
        }
        return jSONArray;
    }

    /* renamed from: h */
    public JSONObject mo15403h() {
        JSONObject jSONObject = new JSONObject();
        C3955q.m16447a(jSONObject, "last_create_activity", m15815a(this.f11756k, this.f11757l));
        C3955q.m16447a(jSONObject, "last_start_activity", m15815a(this.f11758m, this.f11759n));
        C3955q.m16447a(jSONObject, "last_resume_activity", m15815a(this.f11760o, this.f11761p));
        C3955q.m16447a(jSONObject, "last_pause_activity", m15815a(this.f11762q, this.f11763r));
        C3955q.m16447a(jSONObject, "last_stop_activity", m15815a(this.f11764s, this.f11765t));
        C3955q.m16447a(jSONObject, "alive_activities", m15821l());
        C3955q.m16447a(jSONObject, "finish_activities", m15822m());
        return jSONObject;
    }

    /* renamed from: a */
    public void mo15398a(AbstractC3770a aVar) {
        this.f11769x = aVar;
    }

    private C3824a(Application application) {
        this.f11770z = application;
        try {
            m15820k();
        } catch (Throwable unused) {
        }
        C3926a.m16277a(new Callable<JSONArray>() {
            /* class com.bytedance.crash.runtime.p227a.C3824a.CallableC38251 */

            /* renamed from: a */
            public JSONArray call() throws Exception {
                return C3824a.m15819d().mo15405j();
            }
        });
    }

    /* renamed from: a */
    private JSONObject m15815a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        C3955q.m16447a(jSONObject, "name", str);
        C3955q.m16447a(jSONObject, "time", Long.valueOf(j));
        return jSONObject;
    }

    /* renamed from: a */
    private JSONArray m15814a(List<String> list, List<Long> list2) {
        JSONArray jSONArray = new JSONArray();
        if (this.f11751f != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    jSONArray.put(m15815a(list.get(i), list2.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public C3828a mo15397a(String str, String str2, long j) {
        C3828a aVar;
        if (this.f11749A.size() >= this.f11750C) {
            aVar = this.f11749A.poll();
            if (aVar != null) {
                this.f11749A.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        C3828a aVar2 = new C3828a(str, str2, j);
        this.f11749A.add(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public void mo15399a(final String str, final long j, final String str2, final int i) {
        C3866n.m16016b().mo15508a(new Runnable() {
            /* class com.bytedance.crash.runtime.p227a.C3824a.RunnableC38262 */

            public void run() {
                try {
                    C3828a a = C3824a.this.mo15397a(str, str2, j);
                    a.f11779b = str2;
                    a.f11778a = str;
                    a.f11780c = j;
                } catch (Throwable unused) {
                }
                C3869p.m16027a("activityLifeCycle", str + '.' + str2 + '@' + Long.toHexString((long) i), j);
            }
        });
    }
}
