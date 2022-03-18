package com.bytedance.apm.p143i;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p153n.C3047b;
import com.huawei.hms.location.LocationRequest;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.i */
public class C2995i extends AbstractC2946a {

    /* renamed from: a */
    public static boolean f9653a = false;

    /* renamed from: b */
    public static int f9654b = LocationRequest.PRIORITY_INDOOR;

    /* renamed from: c */
    private static final int f9655c = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    private static boolean f9656e = false;

    /* renamed from: f */
    private static boolean f9657f = false;

    /* renamed from: d */
    private long f9658d = 600000;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return this.f9658d;
    }

    /* renamed from: a */
    private void m12586a() {
        m12584a(null, false);
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        super.onReady();
        f9653a = true;
    }

    public C2995i() {
        this.f9459k = "thread";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    public void mo12103e() {
        super.mo12103e();
        if (f9656e && f9657f && System.currentTimeMillis() - C2785b.m11777r() > 1200000) {
            m12586a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        boolean z;
        super.mo12099a(jSONObject);
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f9656e = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        f9657f = z2;
        f9654b = jSONObject.optInt("thread_count_threshold", LocationRequest.PRIORITY_INDOOR);
        this.f9658d = jSONObject.optLong("collect_interval", 10) * 60000;
    }

    /* renamed from: a */
    public static int m12584a(final String str, final boolean z) {
        final int i;
        try {
            i = new File("/proc/self/task/").list().length;
        } catch (Throwable unused) {
            i = 0;
        }
        if (i == 0) {
            return 0;
        }
        final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        final int[] iArr = {threadGroup.activeCount()};
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p143i.C2995i.RunnableC29961 */

            public void run() {
                int[] iArr;
                if (z || iArr[0] < C2995i.f9654b || !C2995i.f9653a) {
                    try {
                        JSONObject a = C2995i.m12585a(str, i, iArr[0], null);
                        if (a != null) {
                            C2741a.m11630c().mo11785a(new C2753f("thread", null, null, a));
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    int[] iArr2 = iArr;
                    Thread[] threadArr = new Thread[(iArr2[0] + (iArr2[0] / 2))];
                    iArr2[0] = threadGroup.enumerate(threadArr);
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        iArr = iArr;
                        if (i < iArr[0]) {
                            String name = threadArr[i].getName();
                            if (!TextUtils.isEmpty(name)) {
                                sb.append(name);
                                sb.append(",");
                            }
                            i++;
                        } else {
                            try {
                                break;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                    }
                    JSONObject a2 = C2995i.m12585a(str, i, iArr[0], sb.toString());
                    if (a2 != null) {
                        C2741a.m11630c().mo11785a(new C2753f("thread", null, null, a2));
                    }
                }
            }
        });
        return (i << 16) + iArr[0];
    }

    /* renamed from: a */
    public static JSONObject m12585a(String str, int i, int i2, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("total_thread_count", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put("java_thread_count", i2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("scene", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", C2785b.m11761e());
        jSONObject.put("cpu_count", f9655c);
        jSONObject.put("process_name", C2785b.m11756d());
        return jSONObject;
    }
}
