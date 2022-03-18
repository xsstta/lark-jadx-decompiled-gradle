package ee.android.framework.manis.base;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.AbstractC68179a;
import ee.android.framework.manis.C68183b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ee.android.framework.manis.base.c */
public class C68189c {

    /* renamed from: c */
    private static final String[] f171427c = {"main"};

    /* renamed from: a */
    public final Map<String, IInterface> f171428a;

    /* renamed from: b */
    public final Object f171429b;

    /* renamed from: d */
    private final Map<String, Method> f171430d;

    /* access modifiers changed from: private */
    /* renamed from: ee.android.framework.manis.base.c$a */
    public static class C68191a {

        /* renamed from: a */
        public static C68189c f171431a = new C68189c();
    }

    /* renamed from: a */
    public static C68189c m264851a() {
        return C68191a.f171431a;
    }

    private C68189c() {
        this.f171428a = new ConcurrentHashMap();
        this.f171430d = new HashMap();
        this.f171429b = new Object();
    }

    /* access modifiers changed from: private */
    /* renamed from: ee.android.framework.manis.base.c$b */
    public final class C68192b implements IBinder.DeathRecipient {

        /* renamed from: a */
        public Uri f171432a;

        /* renamed from: b */
        public String f171433b;

        /* renamed from: d */
        private IInterface f171435d;

        /* renamed from: a */
        public static Thread m264856a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public void binderDied() {
            if (this.f171435d != null) {
                synchronized (C68189c.this.f171429b) {
                    this.f171435d.asBinder().unlinkToDeath(this, 0);
                    C68189c.this.f171428a.remove(this.f171433b);
                    m264856a(new Thread(new Runnable() {
                        /* class ee.android.framework.manis.base.C68189c.C68192b.RunnableC681931 */

                        public void run() {
                            String str;
                            StringBuilder sb = new StringBuilder();
                            sb.append("ManisDeathRecipient retry connect service:");
                            sb.append(C68192b.this.f171433b);
                            sb.append(", uri:");
                            if (C68192b.this.f171432a == null) {
                                str = "null";
                            } else {
                                str = C68192b.this.f171432a.toString();
                            }
                            sb.append(str);
                            Log.m165389i("ServiceFetcher", sb.toString());
                        }
                    })).start();
                }
            }
        }

        public C68192b(Uri uri, String str, IInterface iInterface) {
            this.f171432a = uri;
            this.f171433b = str;
            this.f171435d = iInterface;
        }
    }

    /* renamed from: b */
    private boolean m264854b(Context context, Class<?> cls) {
        AbstractC68179a b = C68183b.m264839a().mo237087b();
        if (b == null) {
            return true;
        }
        String a = C68188b.m264850a(context, cls.getName());
        if (!b.mo237084a(a) && !m264853a(context, a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m264853a(Context context, String str) {
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(str)) {
            packageName = packageName + ":" + str;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (TextUtils.equals(packageName, runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public <T> T mo237105a(Context context, Class<T> cls) {
        T t;
        String a = C68194d.m264857a(context, (Class<?>) cls);
        if (TextUtils.isEmpty(a)) {
            Log.m165383e("ServiceFetcher", "class:" + cls.getName() + " is not register");
            return null;
        }
        String name = cls.getName();
        synchronized (this.f171429b) {
            t = (T) this.f171428a.get(name);
        }
        if (t != null && t.asBinder().pingBinder() && t.asBinder().isBinderAlive()) {
            return t;
        }
        Uri parse = Uri.parse(a);
        if (m264854b(context, cls)) {
            return (T) m264852a(context, parse, name);
        }
        Log.m165389i("ServiceFetcher", "failed to fetchService, cann't launch process.");
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b A[SYNTHETIC, Splitter:B:46:0x016b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m264852a(android.content.Context r13, android.net.Uri r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.android.framework.manis.base.C68189c.m264852a(android.content.Context, android.net.Uri, java.lang.String):java.lang.Object");
    }
}
