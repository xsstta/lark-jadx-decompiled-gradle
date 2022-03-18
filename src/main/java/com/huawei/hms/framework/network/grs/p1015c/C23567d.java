package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import com.huawei.hms.framework.network.grs.p1013a.C23548a;
import com.huawei.hms.framework.network.grs.p1014b.C23553b;
import com.huawei.hms.framework.network.grs.p1015c.p1016a.C23560a;
import com.huawei.hms.framework.network.grs.p1015c.p1017b.C23565c;
import com.huawei.hms.framework.network.grs.p1018d.C23585d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* renamed from: com.huawei.hms.framework.network.grs.c.d */
public class C23567d implements AbstractC23559a {

    /* renamed from: a */
    private static final String f58085a = "d";

    /* renamed from: b */
    private GrsBaseInfo f58086b;

    /* renamed from: c */
    private Context f58087c;

    /* renamed from: d */
    private C23548a f58088d;

    /* renamed from: e */
    private C23568e f58089e;

    /* renamed from: f */
    private ArrayList<Future<C23568e>> f58090f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C23568e> f58091g = new ArrayList<>();

    /* renamed from: h */
    private JSONArray f58092h = new JSONArray();

    /* renamed from: i */
    private ArrayList<String> f58093i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<String> f58094j = new ArrayList<>();

    /* renamed from: k */
    private C23565c f58095k;

    /* renamed from: l */
    private long f58096l = 1;

    public C23567d(GrsBaseInfo grsBaseInfo, Context context, C23548a aVar) {
        this.f58086b = grsBaseInfo;
        this.f58087c = context;
        this.f58088d = aVar;
        m85471b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[LOOP:0: B:1:0x0005->B:36:0x008d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.huawei.hms.framework.network.grs.p1015c.C23568e m85468a(java.util.concurrent.ExecutorService r15, java.util.ArrayList<java.lang.String> r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1015c.C23567d.m85468a(java.util.concurrent.ExecutorService, java.util.ArrayList, java.lang.String):com.huawei.hms.framework.network.grs.c.e");
    }

    /* renamed from: b */
    private C23568e m85469b(C23568e eVar) {
        String str;
        String str2;
        Throwable e;
        int size = this.f58090f.size();
        for (int i = 0; i < size && (eVar == null || !eVar.mo82909m()); i++) {
            try {
                eVar = this.f58090f.get(i).get(40000, TimeUnit.MILLISECONDS);
            } catch (CancellationException unused) {
                Logger.m85371i(f58085a, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str2 = f58085a;
                str = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.m85376w(str2, str, e);
            } catch (InterruptedException e3) {
                e = e3;
                str2 = f58085a;
                str = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.m85376w(str2, str, e);
            } catch (TimeoutException unused2) {
                Logger.m85375w(f58085a, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!this.f58090f.get(i).isCancelled()) {
                    this.f58090f.get(i).cancel(true);
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private C23568e m85470b(ExecutorService executorService, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C23568e a = m85468a(executorService, this.f58094j, str);
        int b = a == null ? 0 : a.mo82897b();
        String str2 = f58085a;
        Logger.m85374v(str2, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(b));
        if (b == 404 || b == 401) {
            if (!TextUtils.isEmpty(m85472c()) || !TextUtils.isEmpty(this.f58086b.getAppName())) {
                this.f58090f.clear();
                Logger.m85371i(str2, "this env has not deploy new interface,so use old interface.");
                a = m85468a(executorService, this.f58093i, str);
            } else {
                Logger.m85371i(str2, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
        }
        C23570g.m85508a(this.f58091g, SystemClock.elapsedRealtime() - elapsedRealtime, this.f58092h, this.f58087c);
        return a;
    }

    /* renamed from: b */
    private void m85471b() {
        C23565c a = C23560a.m85448a(this.f58087c);
        if (a == null) {
            Logger.m85375w(f58085a, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        mo82892a(a);
        List<String> a2 = a.mo82881a();
        if (a2 == null || a2.size() <= 0) {
            Logger.m85373v(f58085a, "maybe grs_base_url config with [],please check.");
        } else if (a2.size() <= 10) {
            String c = a.mo82887c();
            String b = a.mo82885b();
            if (a2.size() > 0) {
                for (String str : a2) {
                    if (!str.startsWith("https://")) {
                        Logger.m85375w(f58085a, "grs server just support https scheme url,please check.");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        Locale locale = Locale.ROOT;
                        Object[] objArr = new Object[1];
                        objArr[0] = TextUtils.isEmpty(m85472c()) ? this.f58086b.getAppName() : m85472c();
                        sb.append(String.format(locale, c, objArr));
                        String grsReqParamJoint = this.f58086b.getGrsReqParamJoint(false, false, "1.0", this.f58087c);
                        if (!TextUtils.isEmpty(grsReqParamJoint)) {
                            sb.append("?");
                            sb.append(grsReqParamJoint);
                        }
                        this.f58093i.add(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(b);
                        String grsReqParamJoint2 = this.f58086b.getGrsReqParamJoint(false, false, m85472c(), this.f58087c);
                        if (!TextUtils.isEmpty(grsReqParamJoint2)) {
                            sb2.append("?");
                            sb2.append(grsReqParamJoint2);
                        }
                        this.f58094j.add(sb2.toString());
                    }
                }
            }
            Logger.m85374v(f58085a, "request to GRS server url is{%s} and {%s}", this.f58093i, this.f58094j);
        } else {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
    }

    /* renamed from: c */
    private String m85472c() {
        C23590a a = C23553b.m85431a(this.f58087c.getPackageName(), this.f58086b).mo82866a();
        if (a == null) {
            return "";
        }
        String a2 = a.mo82942a();
        Logger.m85374v(f58085a, "get appName from local assets is{%s}", a2);
        return a2;
    }

    /* renamed from: a */
    public C23565c mo82890a() {
        return this.f58095k;
    }

    /* renamed from: a */
    public C23568e mo82891a(ExecutorService executorService, String str) {
        String str2;
        Throwable e;
        String str3;
        if (this.f58093i == null || this.f58094j == null) {
            return null;
        }
        try {
            C23565c a = mo82890a();
            return (C23568e) executorService.submit(new CallableC23566c(this, executorService, str)).get((long) (a != null ? a.mo82888d() : 10), TimeUnit.SECONDS);
        } catch (CancellationException unused) {
            Logger.m85371i(f58085a, "{submitExcutorTaskWithTimeout} the computation was cancelled");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            str2 = f58085a;
            str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
            Logger.m85376w(str2, str3, e);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str2 = f58085a;
            str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
            Logger.m85376w(str2, str3, e);
            return null;
        } catch (TimeoutException unused2) {
            Logger.m85375w(f58085a, "{submitExcutorTaskWithTimeout} the wait timed out");
            return null;
        } catch (Exception e4) {
            e = e4;
            str2 = f58085a;
            str3 = "{submitExcutorTaskWithTimeout} catch Exception";
            Logger.m85376w(str2, str3, e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo82892a(C23565c cVar) {
        this.f58095k = cVar;
    }

    @Override // com.huawei.hms.framework.network.grs.p1015c.AbstractC23559a
    /* renamed from: a */
    public synchronized void mo82872a(C23568e eVar) {
        this.f58091g.add(eVar);
        C23568e eVar2 = this.f58089e;
        if (eVar2 == null || !eVar2.mo82909m()) {
            if (eVar.mo82908l()) {
                Logger.m85371i(f58085a, "GRS server open 503 limiting strategy.");
                C23585d.m85564a(this.f58086b.getGrsParasKey(false, true, this.f58087c), new C23585d.C23586a(eVar.mo82906j(), SystemClock.elapsedRealtime()));
            } else if (!eVar.mo82909m()) {
                Logger.m85373v(f58085a, "grsResponseResult has exception so need return");
            } else {
                this.f58089e = eVar;
                this.f58088d.mo82843a(this.f58086b, eVar, this.f58087c);
                for (int i = 0; i < this.f58090f.size(); i++) {
                    if (!this.f58093i.get(i).equals(eVar.mo82907k()) && !this.f58094j.get(i).equals(eVar.mo82907k()) && !this.f58090f.get(i).isCancelled()) {
                        Logger.m85371i(f58085a, "future cancel");
                        this.f58090f.get(i).cancel(true);
                    }
                }
            }
        } else {
            Logger.m85373v(f58085a, "grsResponseResult is ok");
        }
    }
}
