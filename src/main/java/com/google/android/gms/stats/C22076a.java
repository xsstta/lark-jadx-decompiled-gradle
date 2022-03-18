package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.stats.a */
public class C22076a {

    /* renamed from: n */
    private static ScheduledExecutorService f53699n;

    /* renamed from: o */
    private static volatile AbstractC22077a f53700o = new C22078b();

    /* renamed from: a */
    private final Object f53701a;

    /* renamed from: b */
    private final PowerManager.WakeLock f53702b;

    /* renamed from: c */
    private WorkSource f53703c;

    /* renamed from: d */
    private final int f53704d;

    /* renamed from: e */
    private final String f53705e;

    /* renamed from: f */
    private final String f53706f;

    /* renamed from: g */
    private final String f53707g;

    /* renamed from: h */
    private final Context f53708h;

    /* renamed from: i */
    private boolean f53709i;

    /* renamed from: j */
    private final Map<String, Integer[]> f53710j;

    /* renamed from: k */
    private final Set<Future<?>> f53711k;

    /* renamed from: l */
    private int f53712l;

    /* renamed from: m */
    private AtomicInteger f53713m;

    /* renamed from: com.google.android.gms.stats.a$a */
    public interface AbstractC22077a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22076a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private C22076a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    private C22076a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f53701a = this;
        this.f53709i = true;
        this.f53710j = new HashMap();
        this.f53711k = Collections.synchronizedSet(new HashSet());
        this.f53713m = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f53704d = i;
        this.f53706f = null;
        this.f53707g = null;
        Context applicationContext = context.getApplicationContext();
        this.f53708h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f53705e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f53705e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        this.f53702b = newWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(str3) ? context.getPackageName() : str3);
            this.f53703c = fromPackage;
            if (fromPackage != null && WorkSourceUtil.hasWorkSourcePermission(applicationContext)) {
                WorkSource workSource = this.f53703c;
                if (workSource != null) {
                    workSource.add(fromPackage);
                } else {
                    this.f53703c = fromPackage;
                }
                try {
                    newWakeLock.setWorkSource(this.f53703c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f53699n == null) {
            f53699n = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    /* renamed from: b */
    private final List<String> m79637b() {
        return WorkSourceUtil.getNames(this.f53703c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f53712l == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r13.f53708h, com.google.android.gms.common.stats.StatsUtils.getEventKey(r13.f53702b, r6), 7, r13.f53705e, r6, null, r13.f53704d, m79637b(), r14);
        r13.f53712l++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74991a(long r14) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C22076a.mo74991a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r12.f53712l == 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r12.f53708h, com.google.android.gms.common.stats.StatsUtils.getEventKey(r12.f53702b, r6), 8, r12.f53705e, r6, null, r12.f53704d, m79637b());
        r12.f53712l--;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74990a() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C22076a.mo74990a():void");
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m79635a(int i) {
        if (this.f53702b.isHeld()) {
            try {
                this.f53702b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f53705e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f53702b.isHeld();
        }
    }

    /* renamed from: a */
    private final String m79634a(String str) {
        if (this.f53709i) {
            return !TextUtils.isEmpty(str) ? str : this.f53706f;
        }
        return this.f53706f;
    }

    /* renamed from: a */
    public void mo74992a(boolean z) {
        this.f53702b.setReferenceCounted(z);
        this.f53709i = z;
    }
}
