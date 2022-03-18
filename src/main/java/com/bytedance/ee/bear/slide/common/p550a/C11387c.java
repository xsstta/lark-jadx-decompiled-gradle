package com.bytedance.ee.bear.slide.common.p550a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.ee.bear.slide.common.a.c */
public class C11387c {

    /* renamed from: a */
    private Context f30582a;

    /* renamed from: b */
    private AbstractC5233x f30583b;

    /* renamed from: c */
    private long f30584c;

    /* renamed from: d */
    private boolean f30585d;

    /* renamed from: e */
    private Executor f30586e;

    /* renamed from: f */
    private final SharedPreferences.OnSharedPreferenceChangeListener f30587f;

    /* renamed from: g */
    private final PersistenceSharedPreference f30588g;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m47275c() {
        this.f30584c = m47272a(this.f30582a);
    }

    /* renamed from: b */
    public void mo43575b() {
        this.f30586e = null;
        this.f30588g.unregisterOnSharedPreferenceChangeListener(this.f30587f);
    }

    /* renamed from: a */
    public void mo43573a() {
        Executor executor;
        if (this.f30585d && this.f30582a != null && (executor = this.f30586e) != null) {
            executor.execute(new Runnable() {
                /* class com.bytedance.ee.bear.slide.common.p550a.$$Lambda$c$Wm3RX2j0zyxRKy4VvRAgB_oaca4 */

                public final void run() {
                    C11387c.lambda$Wm3RX2j0zyxRKy4VvRAgB_oaca4(C11387c.this);
                }
            });
        }
    }

    /* renamed from: a */
    private static long m47272a(Context context) {
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length > 0) {
                return (long) processMemoryInfo[0].getTotalPss();
            }
            return -1;
        } catch (Exception e) {
            C13479a.m54761a("SlideMemoryAnalytic", e);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47274b(Map map) {
        HashMap hashMap;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long a = m47272a(this.f30582a);
        if (a > 0) {
            long j = this.f30584c;
            if (j > 0) {
                long j2 = a - j;
                if (j2 > 0) {
                    if (map != null) {
                        hashMap = new HashMap(map);
                    } else {
                        hashMap = new HashMap();
                    }
                    hashMap.put("memSizeKB", Long.toString(j2));
                    this.f30583b.mo21079a("dev_performance_slide_mem_usage", hashMap);
                    return;
                }
            }
        }
        C13479a.m54775e("SlideMemoryAnalytic", "mem size err");
    }

    /* renamed from: a */
    public void mo43574a(Map<String, String> map) {
        Executor executor;
        if (this.f30585d && this.f30582a != null && this.f30583b != null && (executor = this.f30586e) != null) {
            executor.execute(new Runnable(map) {
                /* class com.bytedance.ee.bear.slide.common.p550a.$$Lambda$c$NlD50sHHuKHUEmNIxHfzwCNhWw */
                public final /* synthetic */ Map f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C11387c.m269970lambda$NlD50sHHuKHUEmNIxHfzwCNhWw(C11387c.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47273a(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.equals("mem_usage_analytic_for_auto_test_enable", str)) {
            this.f30585d = ((Boolean) this.f30588g.mo34038b("mem_usage_analytic_for_auto_test_enable", Boolean.FALSE)).booleanValue();
        }
    }

    public C11387c(Context context, AbstractC5233x xVar) {
        if (context != null) {
            this.f30582a = context.getApplicationContext();
        }
        this.f30583b = xVar;
        this.f30586e = BearExecutors.m48466a();
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        this.f30588g = aVar;
        this.f30585d = ((Boolean) aVar.mo34038b("mem_usage_analytic_for_auto_test_enable", Boolean.FALSE)).booleanValue();
        $$Lambda$c$Z44MgQbX2m5GRaeMVMbx5vC_RA r3 = new SharedPreferences.OnSharedPreferenceChangeListener() {
            /* class com.bytedance.ee.bear.slide.common.p550a.$$Lambda$c$Z44MgQbX2m5GRaeMVMbx5vC_RA */

            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                C11387c.m269971lambda$Z44MgQbX2m5GRaeMVMbx5vC_RA(C11387c.this, sharedPreferences, str);
            }
        };
        this.f30587f = r3;
        aVar.registerOnSharedPreferenceChangeListener(r3);
    }
}
