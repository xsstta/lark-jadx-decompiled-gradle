package com.bytedance.crash.p218b;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.C2944i;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.entity.C3747f;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3861k;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p228b.C3845c;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.l */
public class C3716l {

    /* renamed from: a */
    public static boolean f11462a = false;

    /* renamed from: b */
    public static volatile long f11463b = -1;

    /* renamed from: c */
    public static long f11464c = 100;

    /* renamed from: d */
    public static long f11465d = 0;

    /* renamed from: e */
    public static long f11466e = 0;

    /* renamed from: f */
    public static long f11467f = 0;

    /* renamed from: g */
    public static int f11468g = 0;

    /* renamed from: h */
    public static boolean f11469h = false;

    /* renamed from: i */
    public static volatile String f11470i = null;

    /* renamed from: j */
    public static volatile boolean f11471j = false;

    /* renamed from: k */
    public static int f11472k = -1;

    /* renamed from: l */
    public static volatile long f11473l = 0;

    /* renamed from: m */
    public static long f11474m = -1;

    /* renamed from: n */
    public static long f11475n = -1;

    /* renamed from: o */
    private static int f11476o = 0;

    /* renamed from: p */
    private static List<C3747f> f11477p = null;

    /* renamed from: q */
    private static int f11478q = -1;

    /* renamed from: r */
    private static MessageQueue f11479r;

    /* renamed from: s */
    private static Field f11480s;

    /* renamed from: t */
    private static Field f11481t;

    /* renamed from: j */
    public static long m15341j() {
        return f11473l;
    }

    /* renamed from: a */
    public static void m15330a() {
        if (!f11462a) {
            f11462a = true;
        }
    }

    /* renamed from: b */
    public static void m15333b() {
        if (f11462a) {
            f11462a = false;
        }
    }

    /* renamed from: g */
    public static void m15338g() {
        HandlerThread a = C3866n.m16015a();
        f11465d = SystemClock.uptimeMillis();
        new Handler(a.getLooper()).postDelayed(new Runnable() {
            /* class com.bytedance.crash.p218b.C3716l.RunnableC37204 */

            /* renamed from: a */
            public static Thread m15347a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public void run() {
                try {
                    m15347a(new Thread("npth-tick") {
                        /* class com.bytedance.crash.p218b.C3716l.RunnableC37204.C37211 */

                        public void run() {
                            long j;
                            super.run();
                            while (C3716l.f11462a) {
                                try {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    if (!C3696c.m15234a()) {
                                        C3716l.f11473l = C3716l.m15340i();
                                    }
                                    C3716l.f11463b = (uptimeMillis - C3716l.f11465d) / C3716l.f11464c;
                                    long j2 = (uptimeMillis - C3716l.f11465d) % C3716l.f11464c;
                                    if (j2 >= 95) {
                                        C3716l.f11463b--;
                                        j = C3716l.f11464c << 1;
                                    } else {
                                        j = C3716l.f11464c;
                                    }
                                    SystemClock.sleep(j - j2);
                                } catch (Throwable unused) {
                                }
                            }
                            C3716l.f11469h = false;
                        }
                    }).start();
                } catch (Throwable unused) {
                }
            }
        }, f11464c);
    }

    /* renamed from: i */
    public static long m15340i() {
        if (f11472k < 0) {
            return 0;
        }
        try {
            return NativeTools.m16236b().mo15603c(f11472k);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: m */
    public static long m15344m() {
        long j = f11463b - f11475n;
        if (j <= 0) {
            j = 1;
        }
        return j * f11464c;
    }

    /* renamed from: c */
    public static void m15334c() {
        if (!C3840b.m15890h() && C2944i.m12404a() == null) {
            C3861k.m15993a().mo15476b();
            C3861k.m15993a().mo15477b(new Printer() {
                /* class com.bytedance.crash.p218b.C3716l.C37182 */

                public void println(String str) {
                    int i;
                    if (C3716l.f11462a) {
                        C3716l.f11470i = str;
                        if (!C3716l.f11469h) {
                            C3716l.f11469h = true;
                            C3716l.f11472k = Process.myTid();
                            C3716l.m15338g();
                        }
                        if (C3716l.f11474m == -1) {
                            C3716l.f11474m = 0;
                            C3716l.f11475n = 0;
                            return;
                        }
                        long j = C3716l.f11463b;
                        C3716l.f11475n = j;
                        long j2 = j - C3716l.f11474m;
                        if (j2 <= 0) {
                            C3716l.f11468g++;
                            return;
                        }
                        if (j2 == 1) {
                            if (C3716l.f11468g > 1) {
                                i = 7;
                            } else if (C3716l.f11468g == 1) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        } else if (C3716l.f11468g > 1) {
                            i = 5;
                        } else if (C3716l.f11468g == 1) {
                            i = 6;
                        } else {
                            i = 1;
                        }
                        long j3 = C3716l.m15341j();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (!C3716l.f11471j) {
                            C3716l.m15332a(C3716l.m15335d(), j3 - C3716l.f11466e, uptimeMillis - C3716l.f11467f, j2, i, C3716l.f11468g, null);
                        }
                        C3716l.f11466e = j3;
                        C3716l.f11467f = uptimeMillis;
                        C3716l.f11468g = 1;
                        C3716l.f11474m = j;
                    }
                }
            });
            C3861k.m15993a().mo15474a(new Printer() {
                /* class com.bytedance.crash.p218b.C3716l.C37193 */

                public void println(String str) {
                    int i;
                    if (C3716l.f11462a && C3716l.f11474m >= 0) {
                        long j = C3716l.f11463b;
                        C3716l.f11470i = "no message running";
                        long j2 = j - C3716l.f11474m;
                        if (j2 > 0) {
                            long j3 = C3716l.m15341j();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            int i2 = (j2 > 1 ? 1 : (j2 == 1 ? 0 : -1));
                            if (i2 == 0 && C3716l.f11468g > 1) {
                                i = 9;
                            } else if (i2 == 0 && C3716l.f11468g == 1) {
                                i = 2;
                            } else if (i2 > 0 && C3716l.f11468g > 1) {
                                i = 4;
                            } else if (i2 <= 0 || C3716l.f11468g != 1) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            if (!C3716l.f11471j) {
                                C3716l.m15332a(C3716l.m15335d(), j3 - C3716l.f11466e, uptimeMillis - C3716l.f11467f, j2, i, C3716l.f11468g, str);
                            }
                            C3716l.f11466e = j3;
                            C3716l.f11467f = uptimeMillis;
                            C3716l.f11468g = 0;
                            C3716l.f11474m = j;
                        }
                    }
                }
            });
            f11466e = m15341j();
            f11467f = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: d */
    public static C3747f m15335d() {
        int size = f11477p.size();
        int i = f11476o;
        if (size == i) {
            int i2 = (f11478q + 1) % i;
            f11478q = i2;
            return f11477p.get(i2);
        }
        C3747f fVar = new C3747f();
        f11477p.add(fVar);
        f11478q++;
        return fVar;
    }

    /* renamed from: e */
    public static JSONArray m15336e() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C3747f> f = m15337f();
            if (f == null) {
                return jSONArray;
            }
            for (C3747f fVar : f) {
                if (fVar != null) {
                    jSONArray.put(fVar.mo15256a());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: k */
    public static JSONObject m15342k() {
        C3747f l = m15343l();
        JSONObject a = l.mo15256a();
        try {
            a.put("message", l.f11547g);
            a.put("currentMessageCost", l.f11544d);
            a.put("currentMessageCpu", l.f11545e);
            a.put("currentTick", f11463b);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
        return a;
    }

    /* renamed from: l */
    public static C3747f m15343l() {
        if (C2944i.m12404a() != null) {
            try {
                return C2944i.m12404a().mo12645b();
            } catch (Throwable unused) {
            }
        }
        C3747f fVar = new C3747f();
        fVar.f11547g = f11470i;
        fVar.f11544d = m15344m();
        fVar.f11545e = m15341j() - f11466e;
        return fVar;
    }

    /* renamed from: f */
    public static List<C3747f> m15337f() {
        if (C2944i.m12404a() != null) {
            try {
                return C2944i.m12404a().mo12644a();
            } catch (Throwable unused) {
            }
        }
        if (f11477p == null) {
            return null;
        }
        f11471j = true;
        ArrayList arrayList = new ArrayList();
        if (f11477p.size() == f11476o) {
            for (int i = f11478q; i < f11477p.size(); i++) {
                arrayList.add(f11477p.get(i));
            }
            for (int i2 = 0; i2 < f11478q; i2++) {
                arrayList.add(f11477p.get(i2));
            }
        } else {
            arrayList.addAll(f11477p);
        }
        f11471j = false;
        return arrayList;
    }

    /* renamed from: h */
    public static MessageQueue m15339h() {
        if (f11479r == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f11479r = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f11479r = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f11479r = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return f11479r;
    }

    /* renamed from: a */
    private static Message m15326a(Message message) {
        Field field = f11481t;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f11481t = declaredField;
                declaredField.setAccessible(true);
                return (Message) f11481t.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Message m15327a(MessageQueue messageQueue) {
        Field field = f11480s;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f11480s = declaredField;
                declaredField.setAccessible(true);
                return (Message) f11480s.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static JSONArray m15328a(int i, long j) {
        MessageQueue h = m15339h();
        JSONArray jSONArray = new JSONArray();
        if (h == null) {
            return jSONArray;
        }
        try {
            synchronized (h) {
                Message a = m15327a(h);
                if (a == null) {
                    return jSONArray;
                }
                int i2 = 0;
                int i3 = 0;
                while (a != null && i2 < 300) {
                    i2++;
                    i3++;
                    JSONObject a2 = m15329a(a, j);
                    try {
                        a2.put("id", i3);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a2);
                    if (a.getWhen() - j > 0 && i2 > i) {
                        break;
                    }
                    a = m15326a(a);
                }
                return jSONArray;
            }
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    /* renamed from: a */
    private static JSONObject m15329a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m15331a(int i, int i2) {
        if (!f11462a) {
            f11462a = true;
            if (i > 10) {
                f11476o = i;
            }
            if (i2 > 10) {
                f11464c = (long) i2;
            }
            f11477p = new ArrayList();
            C3840b.m15875a(new C3840b.AbstractC3841a() {
                /* class com.bytedance.crash.p218b.C3716l.C37171 */

                @Override // com.bytedance.crash.runtime.C3840b.AbstractC3841a
                /* renamed from: b */
                public void mo15169b() {
                }

                @Override // com.bytedance.crash.runtime.C3840b.AbstractC3841a
                /* renamed from: a */
                public void mo15168a() {
                    C3716l.m15334c();
                    if (C3845c.m15929a() && C3845c.m15934b()) {
                        if (C3840b.m15906x()) {
                            try {
                                int init = ByteHook.init();
                                Log.i("LooperMonitor", "NPTH_KEY init,status_code: " + init);
                                if (init != 0) {
                                    Log.i("LooperMonitor", "NPTH_KEY init FAILED, status_code: " + init);
                                }
                                NativeImpl.m15682a(Build.VERSION.SDK_INT);
                            } catch (Throwable unused) {
                            }
                        }
                        if (C3840b.m15907y() && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 31) {
                            NativeTools.m16236b().mo15597a(C3840b.m15908z(), Build.VERSION.SDK_INT);
                        }
                        if (NativeTools.m16236b().mo15613e() && ((C3840b.m15898p() || C3774m.m15604e() || C3746e.m15488b()) && !C3840b.m15905w() && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 30)) {
                            Log.i("LooperMonitor", "[xasan] enable. ");
                            C3775n.m15645b(false);
                        }
                        if (C3840b.m15905w()) {
                            Log.i("LooperMonitor", "NativeHeapTracker enable.");
                            C3775n.m15639a(C3840b.m15861A());
                        }
                    }
                }
            });
            m15327a(m15339h());
        }
    }

    /* renamed from: a */
    public static void m15332a(C3747f fVar, long j, long j2, long j3, int i, int i2, String str) {
        fVar.f11545e = j;
        fVar.f11543c = j3;
        fVar.f11544d = j2;
        fVar.f11546f = false;
        fVar.f11541a = i2;
        if (str != null) {
            fVar.f11547g = str;
        }
        fVar.f11542b = i;
    }
}
