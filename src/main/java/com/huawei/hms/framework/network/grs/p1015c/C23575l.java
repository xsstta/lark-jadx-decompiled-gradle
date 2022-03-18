package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.network.grs.AbstractC23551b;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p1013a.C23548a;
import com.huawei.hms.framework.network.grs.p1015c.p1017b.C23564b;
import com.huawei.hms.framework.network.grs.p1018d.C23585d;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.huawei.hms.framework.network.grs.c.l */
public class C23575l {

    /* renamed from: a */
    private ExecutorService f58130a = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: b */
    private Map<String, C23564b> f58131b = new ConcurrentHashMap(16);

    /* renamed from: c */
    private final Object f58132c = new Object();

    /* renamed from: d */
    private C23548a f58133d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m85512a(C23568e eVar, AbstractC23551b bVar) {
        if (bVar == null) {
            return;
        }
        if (eVar == null) {
            Logger.m85373v("RequestController", "GrsResponse is null");
            bVar.mo82838a();
            return;
        }
        Logger.m85373v("RequestController", "GrsResponse is not null");
        bVar.mo82839a(eVar);
    }

    /* renamed from: a */
    public C23568e mo82915a(GrsBaseInfo grsBaseInfo, Context context, String str) {
        Future<C23568e> future;
        String str2;
        String str3;
        Throwable e;
        Logger.m85366d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = grsBaseInfo.getGrsParasKey(false, true, context);
        synchronized (this.f58132c) {
            if (!NetworkUtil.isNetworkAvailable(context)) {
                return null;
            }
            C23585d.C23586a a = C23585d.m85563a(grsParasKey);
            C23564b bVar = this.f58131b.get(grsParasKey);
            if (bVar != null) {
                if (bVar.mo82880b()) {
                    future = bVar.mo82879a();
                    return future.get();
                }
            }
            if (a != null) {
                if (a.mo82936a()) {
                    return null;
                }
            }
            Logger.m85366d("RequestController", "hitGrsRequestBean == null or request block is released.");
            future = this.f58130a.submit(new CallableC23573j(this, grsBaseInfo, context, str));
            this.f58131b.put(grsParasKey, new C23564b(future));
            try {
                return future.get();
            } catch (CancellationException e2) {
                e = e2;
                str3 = "RequestController";
                str2 = "when check result, find CancellationException, check others";
                Logger.m85376w(str3, str2, e);
                return null;
            } catch (ExecutionException e3) {
                e = e3;
                str3 = "RequestController";
                str2 = "when check result, find ExecutionException, check others";
                Logger.m85376w(str3, str2, e);
                return null;
            } catch (InterruptedException e4) {
                e = e4;
                str3 = "RequestController";
                str2 = "when check result, find InterruptedException, check others";
                Logger.m85376w(str3, str2, e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public void mo82916a(GrsBaseInfo grsBaseInfo, Context context, AbstractC23551b bVar, String str) {
        this.f58130a.execute(new RunnableC23574k(this, grsBaseInfo, context, str, bVar));
    }

    /* renamed from: a */
    public void mo82917a(C23548a aVar) {
        this.f58133d = aVar;
    }

    /* renamed from: a */
    public void mo82918a(String str) {
        synchronized (this.f58132c) {
            this.f58131b.remove(str);
        }
    }
}
