package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.p1013a.C23548a;
import com.huawei.hms.framework.network.grs.p1013a.C23550c;
import com.huawei.hms.framework.network.grs.p1015c.C23575l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.huawei.hms.framework.network.grs.d */
public class C23576d {

    /* renamed from: a */
    private static final String f58134a = "d";

    /* renamed from: b */
    private static ExecutorService f58135b = ExecutorsUtils.newCachedThreadPool("GRS_GrsClient-Init");

    /* renamed from: c */
    private GrsBaseInfo f58136c;

    /* renamed from: d */
    private boolean f58137d;

    /* renamed from: e */
    private final Object f58138e;

    /* renamed from: f */
    private Context f58139f;

    /* renamed from: g */
    private C23575l f58140g;

    /* renamed from: h */
    private C23548a f58141h;

    /* renamed from: i */
    private C23550c f58142i;

    /* renamed from: j */
    private C23545a f58143j;

    /* renamed from: k */
    private Future<Boolean> f58144k;

    C23576d(Context context, GrsBaseInfo grsBaseInfo) {
        this.f58137d = false;
        Object obj = new Object();
        this.f58138e = obj;
        this.f58139f = context.getApplicationContext();
        m85524a(grsBaseInfo);
        if (!this.f58137d) {
            synchronized (obj) {
                if (!this.f58137d) {
                    GrsBaseInfo grsBaseInfo2 = this.f58136c;
                    this.f58144k = f58135b.submit(new CallableC23558c(this, this.f58139f, grsBaseInfo2));
                }
            }
        }
    }

    C23576d(GrsBaseInfo grsBaseInfo) {
        this.f58137d = false;
        this.f58138e = new Object();
        m85524a(grsBaseInfo);
    }

    /* renamed from: a */
    private void m85524a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f58136c = grsBaseInfo.clone();
        } catch (CloneNotSupportedException e) {
            Logger.m85376w(f58134a, "GrsClient catch CloneNotSupportedException", e);
            this.f58136c = grsBaseInfo.copy();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m85526a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.m85373v(f58134a, "sp's content is empty.");
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith("time")) {
                String a = this.f58142i.mo82847a(str, "");
                long j = 0;
                if (!TextUtils.isEmpty(a) && a.matches("\\d+")) {
                    try {
                        j = Long.parseLong(a);
                    } catch (NumberFormatException e) {
                        Logger.m85376w(f58134a, "convert expire time from String to Long catch NumberFormatException.", e);
                    }
                }
                if (!m85527a(j)) {
                    Logger.m85371i(f58134a, "init interface auto clear some invalid sp's data.");
                    this.f58142i.mo82849a(str.substring(0, str.length() - 4));
                    this.f58142i.mo82849a(str);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m85527a(long j) {
        return System.currentTimeMillis() - j <= 604800000;
    }

    /* renamed from: c */
    private boolean m85531c() {
        try {
            Future<Boolean> future = this.f58144k;
            if (future != null) {
                return future.get(10, TimeUnit.SECONDS).booleanValue();
            }
            return false;
        } catch (CancellationException unused) {
            Logger.m85371i(f58134a, "init compute task canceled.");
            return false;
        } catch (ExecutionException e) {
            Logger.m85376w(f58134a, "init compute task failed.", e);
            return false;
        } catch (InterruptedException e2) {
            Logger.m85376w(f58134a, "init compute task interrupted.", e2);
            return false;
        } catch (TimeoutException unused2) {
            Logger.m85375w(f58134a, "init compute task timed out");
            return false;
        } catch (Exception e3) {
            Logger.m85376w(f58134a, "init compute task occur unknown Exception", e3);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo82919a(String str, String str2) {
        if (this.f58136c == null || str == null || str2 == null) {
            Logger.m85375w(f58134a, "invalid para!");
            return null;
        } else if (m85531c()) {
            return this.f58143j.mo82834a(str, str2, this.f58139f);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> mo82920a(String str) {
        if (this.f58136c != null && str != null) {
            return m85531c() ? this.f58143j.mo82835a(str, this.f58139f) : new HashMap();
        }
        Logger.m85375w(f58134a, "invalid para!");
        return new HashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo82921a() {
        if (m85531c()) {
            String grsParasKey = this.f58136c.getGrsParasKey(false, true, this.f58139f);
            this.f58142i.mo82849a(grsParasKey);
            C23550c cVar = this.f58142i;
            cVar.mo82849a(grsParasKey + "time");
            this.f58140g.mo82918a(grsParasKey);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo82922a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.m85375w(f58134a, "IQueryUrlsCallBack is must not null for process continue.");
        } else if (this.f58136c == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (m85531c()) {
            this.f58143j.mo82836a(str, iQueryUrlsCallBack, this.f58139f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo82923a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.m85375w(f58134a, "IQueryUrlCallBack is must not null for process continue.");
        } else if (this.f58136c == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (m85531c()) {
            this.f58143j.mo82837a(str, str2, iQueryUrlCallBack, this.f58139f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo82924a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23576d.class != obj.getClass() || !(obj instanceof C23576d)) {
            return false;
        }
        return this.f58136c.compare(((C23576d) obj).f58136c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo82925b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!m85531c() || (grsBaseInfo = this.f58136c) == null || (context = this.f58139f) == null) {
            return false;
        }
        this.f58141h.mo82842a(grsBaseInfo, context);
        return true;
    }
}
