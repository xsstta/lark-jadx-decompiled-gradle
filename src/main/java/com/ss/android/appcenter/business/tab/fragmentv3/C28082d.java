package com.ss.android.appcenter.business.tab.fragmentv3;

import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.p1265a.C27576e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28196n;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.d */
public class C28082d {

    /* renamed from: a */
    private C28084a f70317a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.d$b */
    public static class C28085b {

        /* renamed from: a */
        public static C28082d f70326a = new C28082d();
    }

    /* renamed from: g */
    public static C28082d m102671g() {
        return C28085b.f70326a;
    }

    /* renamed from: j */
    private void m102674j() {
        this.f70317a = new C28084a();
    }

    /* renamed from: f */
    public void mo99980f() {
        this.f70317a.f70319a = true;
    }

    private C28082d() {
        this.f70317a = new C28084a();
    }

    /* renamed from: h */
    private boolean m102672h() {
        return this.f70317a.f70324f.mo98257c();
    }

    /* renamed from: a */
    public void mo99971a() {
        m102674j();
        this.f70317a.f70324f.mo98250a("Template_Cold_Boot", "start");
    }

    /* renamed from: c */
    public void mo99976c() {
        this.f70317a.f70324f.mo98251a("Template_Cold_Boot", "initEnvFinish", "init_env");
    }

    /* renamed from: b */
    public void mo99974b() {
        if (!m102672h()) {
            mo99971a();
        }
        this.f70317a.f70324f.mo98251a("Template_Cold_Boot", "routerFinish", "router");
    }

    /* renamed from: e */
    public void mo99979e() {
        if (m102672h() && this.f70317a.f70321c.isEmpty()) {
            m102673i();
        }
    }

    /* renamed from: d */
    public void mo99978d() {
        this.f70317a.f70324f.mo98255b("Template_Cold_Boot", "requestFinish", "request_data");
        this.f70317a.f70322d = System.currentTimeMillis();
        C28196n.m103273a(new C28196n.AbstractC28200a<Object>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.C28082d.C280831 */

            @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b
            /* renamed from: b */
            public Object mo98233b() throws Throwable {
                return null;
            }

            @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b
            /* renamed from: a */
            public void mo98231a(Object obj) {
                C28082d.this.mo99979e();
            }
        }, 500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    private void m102673i() {
        if (!this.f70317a.f70319a) {
            this.f70317a.f70319a = true;
            OPMonitor addCategoryValue = C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69224U).addCategoryValue("use_cache", Integer.valueOf(this.f70317a.f70320b ? 1 : 0));
            Map<String, Long> b = this.f70317a.f70324f.mo98253b();
            for (String str : b.keySet()) {
                addCategoryValue.addCategoryValue(str, b.get(str));
            }
            addCategoryValue.addCategoryValue("first_frame_block_show", Long.valueOf(Math.max(this.f70317a.f70323e - this.f70317a.f70322d, 0L)));
            addCategoryValue.addCategoryValue("init_blockit", 0);
            addCategoryValue.addCategoryValue("all_block_show", 0);
            addCategoryValue.flush();
        }
    }

    /* renamed from: a */
    public void mo99973a(boolean z) {
        this.f70317a.f70320b = z;
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.d$a */
    public class C28084a {

        /* renamed from: a */
        public boolean f70319a;

        /* renamed from: b */
        public boolean f70320b;

        /* renamed from: c */
        public Set f70321c = new TreeSet();

        /* renamed from: d */
        public long f70322d;

        /* renamed from: e */
        public long f70323e;

        /* renamed from: f */
        public C27576e f70324f = new C27576e(true);

        public C28084a() {
        }
    }

    /* renamed from: a */
    private boolean m102670a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.f70317a.f70322d;
        if (this.f70317a.f70322d == 0) {
            C28184h.m103250d("Template_Cold_Boot", "block start early. name:" + str);
            return true;
        } else if (currentTimeMillis < 300) {
            C28184h.m103250d("Template_Cold_Boot", "duration:" + currentTimeMillis + ". in 300ms. name:" + str);
            return true;
        } else {
            C28184h.m103250d("Template_Cold_Boot", "duration:" + currentTimeMillis + ". too long. name:" + str);
            return false;
        }
    }

    /* renamed from: a */
    public void mo99972a(String str, String str2) {
        if (m102670a(str)) {
            this.f70317a.f70321c.add(str2);
        }
    }

    /* renamed from: b */
    public void mo99975b(String str, String str2) {
        if (this.f70317a.f70321c.contains(str2)) {
            this.f70317a.f70323e = System.currentTimeMillis();
            this.f70317a.f70321c.remove(str2);
            mo99979e();
        }
        C28184h.m103250d("Template_Cold_Boot", "block success finish. name:" + str);
    }

    /* renamed from: c */
    public void mo99977c(String str, String str2) {
        if (this.f70317a.f70321c.contains(str2)) {
            this.f70317a.f70321c.remove(str2);
            mo99979e();
        }
        C28184h.m103250d("Template_Cold_Boot", "block fail finish. name:" + str);
    }
}
