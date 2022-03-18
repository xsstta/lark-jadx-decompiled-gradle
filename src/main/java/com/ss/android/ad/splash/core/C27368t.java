package com.ss.android.ad.splash.core;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.ss.android.ad.splash.core.model.C27338f;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27472b;
import com.ss.android.ad.splash.utils.C27474d;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.Calendar;

/* renamed from: com.ss.android.ad.splash.core.t */
public class C27368t {

    /* renamed from: a */
    private static volatile C27368t f68315a;

    /* renamed from: b */
    private static final String f68316b = (C27287e.m99221T().getFilesDir() + "/SplashData/");

    /* renamed from: g */
    private static Calendar f68317g = Calendar.getInstance();

    /* renamed from: c */
    private long f68318c;

    /* renamed from: d */
    private long f68319d;

    /* renamed from: e */
    private SharedPreferences f68320e = C27287e.m99221T().getSharedPreferences("splash_ad_sp", 0);

    /* renamed from: f */
    private SharedPreferences.Editor f68321f;

    /* renamed from: l */
    public void mo97681l() {
        this.f68321f.apply();
    }

    /* renamed from: M */
    private SharedPreferences.Editor m99731M() {
        if (this.f68321f == null) {
            this.f68321f = this.f68320e.edit();
        }
        return this.f68321f;
    }

    /* renamed from: A */
    public boolean mo97640A() {
        return this.f68320e.getBoolean("key_splash_ad_empty", false);
    }

    /* renamed from: B */
    public String mo97641B() {
        return this.f68320e.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    /* renamed from: C */
    public String mo97642C() {
        return this.f68320e.getString("splash_ad_data", "");
    }

    /* renamed from: D */
    public String mo97643D() {
        return this.f68320e.getString("key_splash_show_times_map", "");
    }

    /* renamed from: E */
    public String mo97644E() {
        return this.f68320e.getString("key_splash_ad_penalty_period", "");
    }

    /* renamed from: F */
    public String mo97645F() {
        return this.f68320e.getString("key_empty_log_extra_substitute", "");
    }

    /* renamed from: G */
    public long mo97646G() {
        return this.f68320e.getLong("key_splash_ad_showed_time", -1);
    }

    /* renamed from: H */
    public C27368t mo97647H() {
        m99731M().remove("key_splash_show_times_map");
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C27368t mo97671g() {
        m99731M().putInt("key_splash_ad_show_sequence", mo97695z() + 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C27368t mo97673h() {
        m99731M().putLong("clear_local_cache_time", System.currentTimeMillis());
        return this;
    }

    /* renamed from: i */
    public long mo97675i() {
        return this.f68320e.getLong("clear_local_cache_time", 0);
    }

    /* renamed from: m */
    public String mo97682m() {
        return this.f68320e.getString("splash_ad_full_data", "");
    }

    /* renamed from: n */
    public long mo97683n() {
        return this.f68320e.getLong("splash_ad_leave_interval", 0);
    }

    /* renamed from: o */
    public long mo97684o() {
        return this.f68320e.getLong("splash_ad_splash_interval", 0);
    }

    /* renamed from: p */
    public long mo97685p() {
        return this.f68320e.getLong("splash_ad_cold_launch_interval", 0);
    }

    /* renamed from: q */
    public long mo97686q() {
        return this.f68320e.getLong("splash_ad_last_show_time", 0);
    }

    /* renamed from: r */
    public int mo97687r() {
        return this.f68320e.getInt("show_splash_ad_day", 0);
    }

    /* renamed from: s */
    public String mo97688s() {
        return this.f68320e.getString("key_last_show_sequence_day", "");
    }

    /* renamed from: t */
    public int mo97689t() {
        return this.f68320e.getInt("splash_ad_show_limit", 0);
    }

    /* renamed from: u */
    public String mo97690u() {
        return this.f68320e.getString("splash_ad_did", "");
    }

    /* renamed from: v */
    public boolean mo97691v() {
        return this.f68320e.getBoolean("key_splash_ad_need_ack", false);
    }

    /* renamed from: w */
    public String mo97692w() {
        return this.f68320e.getString("key_splash_ad_time_period_map", "");
    }

    private C27368t() {
    }

    /* renamed from: J */
    private void m99728J() {
        m99731M().putInt("splash_ad_show_count", 0);
        mo97657b(false).mo97681l();
    }

    /* renamed from: K */
    private void m99729K() {
        m99731M().putString("key_last_show_sequence_day", m99730L()).apply();
    }

    /* renamed from: a */
    public static C27368t m99732a() {
        if (f68315a == null) {
            synchronized (C27368t.class) {
                if (f68315a == null) {
                    f68315a = new C27368t();
                }
            }
        }
        return f68315a;
    }

    /* renamed from: b */
    public long mo97654b() {
        if (this.f68319d == 0) {
            this.f68319d = this.f68320e.getLong("key_pre_remote_time", 0);
        }
        return this.f68319d;
    }

    /* renamed from: c */
    public long mo97658c() {
        if (this.f68318c == 0) {
            this.f68318c = this.f68320e.getLong("key_pre_launch_time", 0);
        }
        return this.f68318c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo97680k() {
        return this.f68320e.getString("splash_ad_local_cache_data", "");
    }

    /* renamed from: I */
    private void m99727I() {
        f68317g.setTimeInMillis(System.currentTimeMillis());
        m99731M().putInt("show_splash_ad_day", f68317g.get(5) + f68317g.get(2) + f68317g.get(1)).apply();
    }

    /* renamed from: L */
    private String m99730L() {
        f68317g.setTimeInMillis(System.currentTimeMillis());
        return f68317g.get(1) + "/" + f68317g.get(2) + "/" + f68317g.get(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo97664d() {
        return this.f68320e.getString("splash_ad_first_show_data", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo97667e() {
        f68317g.setTimeInMillis(System.currentTimeMillis());
        if (f68317g.get(5) + f68317g.get(2) + f68317g.get(1) == mo97687r()) {
            return this.f68320e.getBoolean("splash_ad_has_first_refresh", false);
        }
        m99727I();
        m99728J();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C27368t mo97668f() {
        int x = mo97693x() + 1;
        C27471a.m100287b("show count: " + x);
        m99731M().putInt("splash_ad_show_count", x);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo97678j() {
        if (!C27287e.ar()) {
            return this.f68320e.getString("splash_ad_data", "");
        }
        return C27474d.m100319b(f68316b + "splash_ad_ordered_data");
    }

    /* renamed from: x */
    public int mo97693x() {
        f68317g.setTimeInMillis(System.currentTimeMillis());
        if (f68317g.get(5) + f68317g.get(2) + f68317g.get(1) == mo97687r()) {
            return this.f68320e.getInt("splash_ad_show_count", 0);
        }
        m99728J();
        m99727I();
        return 0;
    }

    /* renamed from: y */
    public boolean mo97694y() {
        f68317g.setTimeInMillis(System.currentTimeMillis());
        if (f68317g.get(5) + f68317g.get(2) + f68317g.get(1) != mo97687r()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public int mo97695z() {
        if (m99730L().equals(mo97688s())) {
            return this.f68320e.getInt("key_splash_ad_show_sequence", 0);
        }
        m99731M().putInt("key_splash_ad_show_sequence", 0).apply();
        m99729K();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C27368t mo97648a(int i) {
        m99731M().putInt("splash_ad_show_limit", i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27368t mo97655b(long j) {
        m99731M().putLong("splash_ad_splash_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C27368t mo97659c(long j) {
        m99731M().putLong("splash_ad_cold_launch_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C27368t mo97662d(long j) {
        m99731M().putLong("splash_ad_last_show_time", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C27368t mo97666e(String str) {
        m99731M().putString("key_splash_ad_time_period_map", str);
        return this;
    }

    /* renamed from: f */
    public C27368t mo97669f(long j) {
        m99731M().putLong("key_splash_ad_showed_time", j);
        return this;
    }

    /* renamed from: j */
    public C27368t mo97677j(String str) {
        m99731M().putString("key_splash_ad_penalty_period", str);
        return this;
    }

    /* renamed from: k */
    public C27368t mo97679k(String str) {
        m99731M().putString("key_empty_log_extra_substitute", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C27368t mo97663d(String str) {
        m99731M().putString("splash_ad_data", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C27368t mo97665e(long j) {
        this.f68318c = SystemClock.elapsedRealtime();
        this.f68319d = j;
        m99731M().putLong("key_pre_remote_time", j).putLong("key_pre_launch_time", this.f68318c).apply();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C27368t mo97670f(String str) {
        m99731M().putString("splash_ad_first_show_data", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C27368t mo97676i(String str) {
        m99731M().putString("splash_ad_local_cache_data", str);
        return this;
    }

    /* renamed from: l */
    private synchronized void m99733l(String str) {
        if (!C27480i.m100385a(str)) {
            SharedPreferences.Editor M = m99731M();
            M.putBoolean("splash_ad_url_has_download_" + C27472b.m100294a(str), true).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C27368t mo97649a(long j) {
        m99731M().putLong("splash_ad_leave_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27368t mo97656b(String str) {
        if (C27287e.ar()) {
            C27474d.m100317a(str, f68316b, "splash_ad_ordered_data");
        } else {
            m99731M().putString("splash_ad_data", str);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C27368t mo97660c(String str) {
        m99731M().putString("splash_ad_full_data", str);
        return this;
    }

    /* renamed from: g */
    public synchronized void mo97672g(String str) {
        if (!C27480i.m100385a(str)) {
            SharedPreferences.Editor M = m99731M();
            M.remove("splash_ad_url_has_download_" + C27472b.m100294a(str)).apply();
        }
    }

    /* renamed from: h */
    public synchronized boolean mo97674h(String str) {
        if (C27480i.m100385a(str)) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f68320e;
        return sharedPreferences.getBoolean("splash_ad_url_has_download_" + C27472b.m100294a(str), false);
    }

    /* renamed from: a */
    public C27368t mo97650a(String str) {
        m99731M().putString("key_splash_show_times_map", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27368t mo97657b(boolean z) {
        m99731M().putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C27368t mo97661c(boolean z) {
        m99731M().putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C27368t mo97651a(boolean z) {
        m99731M().putBoolean("key_splash_ad_empty", z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97652a(C27338f fVar) {
        if (fVar != null && !C27480i.m100385a(fVar.mo97536c())) {
            m99733l(fVar.mo97536c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97653a(C27349o oVar) {
        if (oVar != null && !C27480i.m100385a(oVar.mo97575d())) {
            m99733l(oVar.mo97575d());
        }
    }
}
