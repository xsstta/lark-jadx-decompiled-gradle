package com.bytedance.apm6.cpu.collect;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.SharedPreferencesC2910d;
import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.CgroupFetcher;
import com.bytedance.apm6.cpu.p169a.AbstractC3228b;
import com.bytedance.apm6.cpu.p169a.C3227a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p191d.AbstractC3340c;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p727a.C13852b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.apm6.cpu.collect.a */
public class C3233a {

    /* renamed from: a */
    public SharedPreferences f10363a;

    /* renamed from: b */
    private AtomicBoolean f10364b;

    /* renamed from: c */
    private C3239c f10365c;

    /* renamed from: d */
    private C3237b f10366d;

    /* renamed from: e */
    private AbstractC3338a f10367e;

    /* renamed from: f */
    private C3223a.AbstractC3224a f10368f;

    /* renamed from: g */
    private AbstractC13853c f10369g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.cpu.collect.a$a */
    public static final class C3236a {

        /* renamed from: a */
        public static final C3233a f10372a = new C3233a();
    }

    /* renamed from: a */
    public static C3233a m13533a() {
        return C3236a.f10372a;
    }

    /* renamed from: d */
    public C3223a.AbstractC3224a mo13391d() {
        return this.f10368f;
    }

    /* renamed from: f */
    public void mo13393f() {
        this.f10365c.mo13408a();
        this.f10366d.mo13406b();
    }

    /* renamed from: g */
    public void mo13394g() {
        this.f10365c.mo13411b();
        this.f10366d.mo13402a();
    }

    private C3233a() {
        this.f10364b = new AtomicBoolean(false);
        try {
            this.f10369g = C13852b.m56165a(C2785b.m11735a());
        } catch (Throwable unused) {
        }
        C3237b bVar = new C3237b(this.f10369g);
        this.f10366d = bVar;
        this.f10365c = new C3239c(bVar, this.f10369g);
    }

    /* renamed from: b */
    public void mo13389b() {
        if (this.f10364b.compareAndSet(false, true)) {
            this.f10367e = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
            this.f10363a = SharedPreferencesC2910d.m12319a(C3318a.m13917w(), "apm_cpu_front");
            if (C3318a.m13827e()) {
                mo13392e();
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(new AbstractRunnableC3362a(300000, 300000) {
                    /* class com.bytedance.apm6.cpu.collect.C3233a.C32341 */

                    public void run() {
                        C3233a.this.mo13392e();
                    }
                });
            }
            SharedPreferences.Editor edit = this.f10363a.edit();
            String f = C3318a.m13828f();
            edit.putString(f, Process.myPid() + "," + this.f10367e.mo13548a()).apply();
            this.f10367e.mo13547a(new AbstractC3340c() {
                /* class com.bytedance.apm6.cpu.collect.C3233a.C32352 */

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onActivityCreated(Activity activity) {
                }

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onActivityPause(Activity activity) {
                }

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onActivityResume(Activity activity) {
                }

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onActivityStarted(Activity activity) {
                }

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onBackground(Activity activity) {
                    SharedPreferences.Editor edit = C3233a.this.f10363a.edit();
                    String f = C3318a.m13828f();
                    edit.putString(f, Process.myPid() + "," + false).apply();
                }

                @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                public void onFront(Activity activity) {
                    SharedPreferences.Editor edit = C3233a.this.f10363a.edit();
                    String f = C3318a.m13828f();
                    edit.putString(f, Process.myPid() + "," + true).apply();
                }
            });
            C3336c.m13901a(AbstractC3228b.class);
        }
    }

    /* renamed from: c */
    public boolean mo13390c() {
        boolean z;
        if (this.f10367e.mo13548a()) {
            SharedPreferences.Editor edit = this.f10363a.edit();
            String f = C3318a.m13828f();
            edit.putString(f, Process.myPid() + "," + this.f10367e.mo13548a()).apply();
            return true;
        }
        Map<String, ?> all = this.f10363a.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    if (((String) it.next().getValue()).split(",")[1].equals("true")) {
                        z = true;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        z = false;
        CgroupFetcher.CGROUP_LEVEL a = CgroupFetcher.m13483a();
        if (z || this.f10367e.mo13548a() || a == CgroupFetcher.CGROUP_LEVEL.TOP_APP || a == CgroupFetcher.CGROUP_LEVEL.FOREGROUND) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13392e() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.collect.C3233a.mo13392e():void");
    }

    /* renamed from: a */
    public void mo13388a(C3227a aVar) {
        if (aVar != null) {
            C3244e.m13566a();
            Log.i("APM-CPU", "config: " + aVar);
            this.f10365c.mo13409a(aVar);
            if (aVar.mo13350d()) {
                this.f10366d.mo13404a(aVar);
            }
        }
    }
}
