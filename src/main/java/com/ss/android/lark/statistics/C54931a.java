package com.ss.android.lark.statistics;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.C54931a;
import com.ss.android.lark.statistics.helper.CustomHitPointHeaderHolder;
import com.ss.android.lark.statistics.p2697k.C54957b;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.statistics.a */
public class C54931a {

    /* renamed from: a */
    public static volatile AbstractC54934b f135633a = new AbstractC54934b() {
        /* class com.ss.android.lark.statistics.C54931a.C549321 */

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: a */
        public void mo103011a(Context context) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: a */
        public void mo103012a(String str) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: a */
        public void mo103013a(String str, JSONObject jSONObject) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: a */
        public void mo103014a(HashMap<String, Object> hashMap) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: a */
        public void mo103015a(boolean z) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: b */
        public void mo103016b(Context context) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: c */
        public void mo103018c(Context context) {
        }

        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
        /* renamed from: c */
        public void mo103019c(String str, JSONObject jSONObject) {
        }
    };

    /* renamed from: b */
    private static C54937e f135634b;

    /* renamed from: com.ss.android.lark.statistics.a$b */
    public interface AbstractC54934b {
        /* renamed from: a */
        void mo103011a(Context context);

        /* renamed from: a */
        void mo103012a(String str);

        /* renamed from: a */
        void mo103013a(String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo103014a(HashMap<String, Object> hashMap);

        /* renamed from: a */
        void mo103015a(boolean z);

        /* renamed from: b */
        void mo103016b(Context context);

        /* renamed from: c */
        void mo103018c(Context context);

        /* renamed from: c */
        void mo103019c(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.statistics.a$c */
    public interface AbstractC54935c<Data> {
        /* renamed from: a */
        void mo187327a(Data data);

        /* renamed from: a */
        void mo187328a(String str);
    }

    /* renamed from: com.ss.android.lark.statistics.a$d */
    public interface AbstractC54936d {
        /* renamed from: a */
        String mo103000a();

        /* renamed from: a */
        void mo103001a(AbstractC54935c<String> cVar);

        /* renamed from: b */
        String mo103002b();

        /* renamed from: c */
        String mo103003c();

        /* renamed from: d */
        String mo103004d();

        /* renamed from: e */
        String mo103005e();

        /* renamed from: f */
        boolean mo103006f();

        /* renamed from: g */
        Context mo103007g();

        /* renamed from: h */
        ScheduledExecutorService mo103008h();

        /* renamed from: i */
        ExecutorService mo103009i();
    }

    /* renamed from: a */
    public static AbstractC54934b m213004a() {
        return f135633a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.statistics.a$e */
    public static class C54937e {

        /* renamed from: a */
        public AtomicInteger f135637a = new AtomicInteger(0);

        /* renamed from: b */
        public AbstractC54936d f135638b;

        /* renamed from: c */
        private List<C54933a> f135639c = Collections.synchronizedList(new LinkedList());

        /* renamed from: d */
        private AtomicBoolean f135640d = new AtomicBoolean(false);

        /* renamed from: a */
        public void mo187332a(String str, JSONObject jSONObject) {
            Log.m165389i("StatisticsLazy", "sendEvent:" + str);
            if (this.f135637a.get() == 2) {
                mo187329a();
                m213049c(str, jSONObject);
                return;
            }
            m213045a(new Runnable(str, jSONObject) {
                /* class com.ss.android.lark.statistics.$$Lambda$a$e$nTgjywZBzs0gdCwnQufTykz5M */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ JSONObject f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C54931a.C54937e.this.m213050d(this.f$1, this.f$2);
                }
            });
            if (this.f135637a.compareAndSet(0, 1)) {
                m213042a(5);
            }
        }

        /* renamed from: d */
        private boolean m213051d() {
            if (this.f135637a.get() == 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m213052e() {
            C54931a.f135633a.mo103014a(CustomHitPointHeaderHolder.f135720a.mo187490c());
            Log.m165389i("StatisticsLazy", "updateTeaAgentCustomHeaderAsync, executed!");
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m213053f() {
            for (C54933a aVar : this.f135639c) {
                m213049c(aVar.f135635a, aVar.f135636b);
            }
            this.f135639c.clear();
        }

        /* renamed from: b */
        public boolean mo187334b() {
            if (this.f135637a.get() == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo187335c() {
            if (m213051d()) {
                Log.m165389i("StatisticsLazy", "updateTeaAgentCustomHeaderAsync init has not started, do nothing!");
            } else if (mo187334b()) {
                Log.m165389i("StatisticsLazy", "updateTeaAgentCustomHeaderAsync, try to update custom header!");
                this.f135638b.mo103009i().submit($$Lambda$a$e$Acjsjn2kYpproUvf_caTcwJYKiQ.INSTANCE);
            } else {
                Log.m165383e("StatisticsLazy", "updateTeaAgentCustomHeaderAsync, custom header has not been inited!");
            }
        }

        /* renamed from: a */
        public void mo187329a() {
            if (!this.f135639c.isEmpty()) {
                m213045a(new Runnable() {
                    /* class com.ss.android.lark.statistics.$$Lambda$a$e$uFKE5CBCdXRTGSl5tj5hywU3Tdg */

                    public final void run() {
                        C54931a.C54937e.this.m213053f();
                    }
                });
            }
        }

        /* renamed from: a */
        private void m213043a(Context context) {
            try {
                m213047b(context);
            } catch (Throwable th) {
                Log.m165383e("StatisticsLazy", th.getMessage());
            }
        }

        public C54937e(AbstractC54936d dVar) {
            this.f135638b = dVar;
        }

        /* renamed from: a */
        private void m213042a(int i) {
            this.f135638b.mo103008h().schedule(new Runnable() {
                /* class com.ss.android.lark.statistics.C54931a.C54937e.RunnableC549381 */

                public void run() {
                    C54937e.this.f135638b.mo103001a(new AbstractC54935c<String>() {
                        /* class com.ss.android.lark.statistics.C54931a.C54937e.RunnableC549381.C549391 */

                        @Override // com.ss.android.lark.statistics.C54931a.AbstractC54935c
                        /* renamed from: a */
                        public void mo187328a(String str) {
                            Log.m165383e("StatisticsLazy", "lazyInitTeaAgentHeaderInfo asyncGetDeviceId error = " + str);
                        }

                        /* renamed from: b */
                        public void mo187327a(String str) {
                            String b = C54937e.this.f135638b.mo103002b();
                            String a = C54937e.this.f135638b.mo103000a();
                            Context g = C54937e.this.f135638b.mo103007g();
                            String c = C54937e.this.f135638b.mo103003c();
                            String d = C54937e.this.f135638b.mo103004d();
                            C54937e.this.mo187331a(b, a, str);
                            C54937e.this.mo187330a(g, b, a, str, c, d);
                            C54937e.this.f135637a.set(2);
                            C54937e.this.mo187329a();
                            if (str == null) {
                                Log.m165383e("StatisticsLazy", "deviceId is Null.");
                            }
                        }
                    });
                }
            }, (long) i, TimeUnit.SECONDS);
        }

        /* renamed from: b */
        private void m213047b(Context context) {
            Log.m165389i("StatisticsLazy", "TeaAgenter initHeaderAndUniqueId!");
            C54931a.f135633a.mo103012a(CustomHitPointHeaderHolder.f135720a.mo187484a());
            C54931a.f135633a.mo103014a(CustomHitPointHeaderHolder.f135720a.mo187490c());
            C54931a.m213012d(context);
            this.f135640d.compareAndSet(false, true);
        }

        /* renamed from: a */
        private void m213045a(Runnable runnable) {
            synchronized (this.f135639c) {
                runnable.run();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m213050d(String str, JSONObject jSONObject) {
            this.f135639c.add(new C54933a(str, jSONObject));
        }

        /* renamed from: b */
        public void mo187333b(String str, JSONObject jSONObject) {
            if (this.f135637a.get() == 2) {
                C54931a.f135633a.mo103019c(str, jSONObject);
            }
        }

        /* renamed from: c */
        private void m213049c(String str, JSONObject jSONObject) {
            String str2;
            int e = C54957b.m213226d().mo107775e();
            if (e == 0) {
                C54931a.f135633a.mo103013a(str, jSONObject);
            } else if (e != 2) {
                C54931a.f135633a.mo103013a(str, jSONObject);
                if (C54931a.m213013e(this.f135638b.mo103007g())) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    if (jSONObject == null) {
                        str2 = "null";
                    } else {
                        str2 = jSONObject.toString();
                    }
                    objArr[1] = str2;
                    Log.m165389i("StatisticsLazy", String.format("%s -- %s", objArr));
                }
            }
        }

        /* renamed from: a */
        private void m213046a(String str, String str2) {
            if (this.f135638b.mo103006f()) {
                CustomHitPointHeaderHolder.f135720a.mo187492c(str2);
                CustomHitPointHeaderHolder.f135720a.mo187486a(str);
                return;
            }
            CustomHitPointHeaderHolder.f135720a.mo187492c("");
            CustomHitPointHeaderHolder.f135720a.mo187486a("");
        }

        /* renamed from: a */
        public void mo187331a(String str, String str2, String str3) {
            CustomHitPointHeaderHolder.f135720a.mo187493d(this.f135638b.mo103005e());
            m213046a(str, str2);
            CustomHitPointHeaderHolder.f135720a.mo187489b(str3);
        }

        /* renamed from: a */
        private void m213044a(Context context, String str, String str2, String str3) {
            CustomHitPointHeaderHolder.f135720a.mo187489b(str);
            CustomHitPointHeaderHolder.f135720a.mo187494e(str2);
            CustomHitPointHeaderHolder.f135720a.mo187495f(str3);
            CustomHitPointHeaderHolder.f135720a.mo187497h("");
            CustomHitPointHeaderHolder.f135720a.mo187485a((Boolean) false);
            m213043a(context);
        }

        /* renamed from: b */
        private void m213048b(Context context, String str, String str2, String str3, String str4, String str5) {
            CustomHitPointHeaderHolder.f135720a.mo187489b(str3);
            CustomHitPointHeaderHolder.f135720a.mo187486a(str);
            CustomHitPointHeaderHolder.f135720a.mo187492c(str2);
            CustomHitPointHeaderHolder.f135720a.mo187494e(str4);
            CustomHitPointHeaderHolder.f135720a.mo187495f(str5);
            CustomHitPointHeaderHolder.f135720a.mo187497h(str);
            CustomHitPointHeaderHolder.f135720a.mo187485a((Boolean) true);
            m213043a(context);
        }

        /* renamed from: a */
        public void mo187330a(Context context, String str, String str2, String str3, String str4, String str5) {
            if (this.f135638b.mo103006f()) {
                m213048b(context, str, str2, str3, str4, str5);
            } else {
                m213044a(context, str3, str4, str5);
            }
        }
    }

    /* renamed from: b */
    public static void m213008b() {
        C54937e eVar = f135634b;
        if (eVar != null) {
            eVar.mo187335c();
        }
    }

    /* renamed from: a */
    public static void m213005a(Context context) {
        f135633a.mo103011a(context);
    }

    /* renamed from: c */
    public static void m213011c(Context context) {
        f135633a.mo103018c(context);
    }

    /* renamed from: b */
    public static void m213009b(Context context) {
        f135633a.mo103016b(context);
    }

    /* renamed from: d */
    public static void m213012d(Context context) {
        try {
            if (m213013e(context)) {
                f135633a.mo103015a(true);
                Log.m165389i("StatisticsLazy", "Done open AppLog Debugger...");
            }
        } catch (Throwable th) {
            Log.m165389i("StatisticsLazy", "shallItOpenDebugMode throwable e:" + th.toString());
        }
    }

    /* renamed from: e */
    public static boolean m213013e(Context context) {
        String packageName;
        boolean z;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return false;
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!packageName.contains("debug") || !z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.statistics.a$a */
    public static class C54933a {

        /* renamed from: a */
        public String f135635a;

        /* renamed from: b */
        public JSONObject f135636b;

        public C54933a(String str, JSONObject jSONObject) {
            this.f135635a = str;
            this.f135636b = jSONObject;
        }
    }

    /* renamed from: a */
    public static void m213006a(AbstractC54936d dVar, AbstractC54934b bVar) {
        f135634b = new C54937e(dVar);
        f135633a = bVar;
    }

    /* renamed from: a */
    public static void m213007a(String str, JSONObject jSONObject) {
        C54937e eVar = f135634b;
        if (eVar != null) {
            eVar.mo187332a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public static void m213010b(String str, JSONObject jSONObject) {
        C54937e eVar = f135634b;
        if (eVar != null) {
            eVar.mo187333b(str, jSONObject);
        }
    }
}
