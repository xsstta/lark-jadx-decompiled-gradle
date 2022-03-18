package com.bytedance.crash.upload;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.runtime.C3866n;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.e */
public abstract class AbstractC3899e {

    /* renamed from: a */
    public static LinkedList<C3902a> f11956a = new LinkedList<>();

    /* renamed from: b */
    private static ConcurrentLinkedQueue<AbstractC3899e> f11957b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private static volatile boolean f11958c = false;

    /* renamed from: a */
    public void mo15541a() {
    }

    /* renamed from: a */
    public abstract void mo15542a(CrashType crashType, C3902a aVar);

    /* renamed from: com.bytedance.crash.upload.e$a */
    public static class C3902a {

        /* renamed from: a */
        public final CrashType f11961a;

        /* renamed from: b */
        private final JSONObject f11962b;

        /* renamed from: c */
        private final JSONObject f11963c;

        /* renamed from: a */
        public String mo15544a() {
            return this.f11962b.optString("crash_thread_name", null);
        }

        /* renamed from: b */
        public long mo15545b() {
            return (long) this.f11962b.optInt("app_start_time", -1);
        }

        /* renamed from: c */
        public String mo15546c() {
            int i = C39012.f11960a[this.f11961a.ordinal()];
            if (i == 1) {
                return this.f11962b.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null);
            }
            if (i == 2) {
                return this.f11962b.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f11962b.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null);
        }

        C3902a(JSONObject jSONObject, CrashType crashType) {
            this.f11961a = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f11962b = ((JSONArray) jSONObject.opt(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).optJSONObject(0);
            } else {
                this.f11962b = jSONObject;
            }
            this.f11963c = jSONObject.optJSONObject("header");
        }
    }

    /* renamed from: com.bytedance.crash.upload.e$2 */
    static /* synthetic */ class C39012 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.crash.CrashType[] r0 = com.bytedance.crash.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.crash.upload.AbstractC3899e.C39012.f11960a = r0
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.crash.upload.AbstractC3899e.C39012.f11960a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.crash.upload.AbstractC3899e.C39012.f11960a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.AbstractC3899e.C39012.<clinit>():void");
        }
    }

    /* renamed from: b */
    static void m16163b() {
        f11958c = true;
        ConcurrentLinkedQueue<AbstractC3899e> concurrentLinkedQueue = f11957b;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<AbstractC3899e> it = f11957b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo15541a();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16162a(AbstractC3899e eVar) {
        if (f11957b != null) {
            if (f11958c) {
                C3866n.m16016b().mo15508a(new Runnable(eVar) {
                    /* class com.bytedance.crash.upload.AbstractC3899e.RunnableC39001 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC3899e f11959a;

                    public void run() {
                        Iterator<C3902a> it = AbstractC3899e.f11956a.iterator();
                        while (it.hasNext()) {
                            C3902a next = it.next();
                            this.f11959a.mo15542a(next.f11961a, next);
                        }
                        this.f11959a.mo15541a();
                    }

                    {
                        this.f11959a = r1;
                    }
                });
            } else {
                f11957b.add(eVar);
            }
        }
    }

    /* renamed from: a */
    static void m16161a(CrashType crashType, JSONObject jSONObject) {
        C3902a aVar = new C3902a(jSONObject, crashType);
        f11956a.add(aVar);
        ConcurrentLinkedQueue<AbstractC3899e> concurrentLinkedQueue = f11957b;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<AbstractC3899e> it = f11957b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo15542a(crashType, aVar);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
