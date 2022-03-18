package com.bytedance.applog.p197a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.p201e.AbstractC3402b;
import com.bytedance.applog.p201e.C3414h;
import com.bytedance.applog.p201e.C3416j;
import com.bytedance.applog.p201e.C3418l;
import com.bytedance.applog.util.C3469r;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/* renamed from: com.bytedance.applog.a.i */
public class C3378i {

    /* renamed from: a */
    public static long f10712a;

    /* renamed from: f */
    private static long f10713f;

    /* renamed from: o */
    private static C3380a f10714o;

    /* renamed from: b */
    private final C3373e f10715b;

    /* renamed from: c */
    private C3416j f10716c;

    /* renamed from: d */
    private C3416j f10717d;

    /* renamed from: e */
    private String f10718e;

    /* renamed from: g */
    private long f10719g;

    /* renamed from: h */
    private int f10720h;

    /* renamed from: i */
    private long f10721i = -1;

    /* renamed from: j */
    private volatile boolean f10722j;

    /* renamed from: k */
    private long f10723k;

    /* renamed from: l */
    private int f10724l;

    /* renamed from: m */
    private String f10725m;

    /* renamed from: n */
    private volatile String f10726n;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.applog.a.i$a */
    public static class C3380a extends C3418l {
        private C3380a() {
        }
    }

    /* renamed from: a */
    public String mo13621a() {
        return this.f10718e;
    }

    /* renamed from: b */
    public String mo13623b() {
        return this.f10726n;
    }

    /* renamed from: c */
    public boolean mo13625c() {
        return this.f10722j;
    }

    /* renamed from: e */
    public static long m14125e() {
        long j = f10713f + 1;
        f10713f = j;
        return j;
    }

    /* renamed from: f */
    static C3380a m14126f() {
        if (f10714o == null) {
            f10714o = new C3380a();
        }
        f10714o.mo13660a(0);
        return f10714o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo13626d() {
        if (!mo13625c() || this.f10723k != 0) {
            return false;
        }
        return true;
    }

    C3378i(C3373e eVar) {
        this.f10715b = eVar;
    }

    /* renamed from: a */
    static boolean m14124a(AbstractC3402b bVar) {
        if (bVar instanceof C3416j) {
            return ((C3416j) bVar).mo13714j();
        }
        return false;
    }

    /* renamed from: b */
    public void mo13624b(AbstractC3402b bVar) {
        if (bVar != null) {
            bVar.f10783e = f10712a;
            bVar.f10784f = C3368a.m14050m();
            bVar.f10782d = this.f10718e;
            bVar.f10781c = m14125e();
            bVar.f10785g = C3368a.m14041d();
            bVar.f10786h = this.f10715b.mo13611e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Bundle mo13619a(long j, long j2) {
        Bundle bundle;
        bundle = null;
        if (this.f10715b.mo13614h().mo13832k() && mo13626d() && j - this.f10719g > j2) {
            bundle = new Bundle();
            bundle.putInt("session_no", this.f10724l);
            int i = this.f10720h + 1;
            this.f10720h = i;
            bundle.putInt("send_times", i);
            bundle.putLong("current_duration", (j - this.f10719g) / 1000);
            bundle.putString("session_start_time", AbstractC3402b.m14198b(this.f10721i));
            this.f10719g = j;
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo13622a(AbstractC3402b bVar, ArrayList<AbstractC3402b> arrayList) {
        boolean z = bVar instanceof C3416j;
        boolean a = m14124a(bVar);
        boolean z2 = true;
        if (this.f10721i == -1) {
            mo13620a(bVar, arrayList, m14124a(bVar));
        } else if (!this.f10722j && a) {
            mo13620a(bVar, arrayList, true);
        } else if (this.f10723k != 0 && bVar.f10780b > this.f10723k + this.f10715b.mo13614h().mo13791C()) {
            mo13620a(bVar, arrayList, a);
        } else if (this.f10721i > bVar.f10780b + 7200000) {
            mo13620a(bVar, arrayList, a);
        } else {
            z2 = false;
        }
        if (z) {
            C3416j jVar = (C3416j) bVar;
            if (jVar.mo13714j()) {
                this.f10719g = bVar.f10780b;
                this.f10723k = 0;
                arrayList.add(bVar);
                if (TextUtils.isEmpty(jVar.f10832k)) {
                    if (this.f10717d != null && (jVar.f10780b - this.f10717d.f10780b) - this.f10717d.f10831j < 500) {
                        jVar.f10832k = this.f10717d.f10833l;
                    } else if (this.f10716c != null && (jVar.f10780b - this.f10716c.f10780b) - this.f10716c.f10831j < 500) {
                        jVar.f10832k = this.f10716c.f10833l;
                    }
                }
            } else {
                Bundle a2 = mo13619a(bVar.f10780b, 0);
                if (a2 != null) {
                    C3368a.m14017a("play_session", a2);
                }
                this.f10719g = 0;
                this.f10723k = jVar.f10780b;
                arrayList.add(bVar);
                if (jVar.mo13715k()) {
                    this.f10716c = jVar;
                } else {
                    this.f10717d = jVar;
                    this.f10716c = null;
                }
            }
        } else if (!(bVar instanceof C3380a)) {
            arrayList.add(bVar);
        }
        mo13624b(bVar);
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C3414h mo13620a(AbstractC3402b bVar, ArrayList<AbstractC3402b> arrayList, boolean z) {
        long j;
        C3414h hVar;
        String str;
        if (bVar instanceof C3380a) {
            j = -1;
        } else {
            j = bVar.f10780b;
        }
        this.f10718e = UUID.randomUUID().toString();
        if (z && !this.f10715b.f10678a && TextUtils.isEmpty(this.f10726n)) {
            this.f10726n = this.f10718e;
        }
        f10713f = 10000;
        this.f10721i = j;
        this.f10722j = z;
        this.f10723k = 0;
        boolean z2 = false;
        if (z) {
            Calendar instance = Calendar.getInstance();
            String str2 = "" + instance.get(1) + instance.get(2) + instance.get(5);
            C3435g h = this.f10715b.mo13614h();
            if (TextUtils.isEmpty(this.f10725m)) {
                this.f10725m = h.mo13829h();
                this.f10724l = h.mo13830i();
            }
            if (!str2.equals(this.f10725m)) {
                this.f10725m = str2;
                this.f10724l = 1;
            } else {
                this.f10724l++;
            }
            h.mo13811a(str2, this.f10724l);
            this.f10720h = 0;
        }
        hVar = null;
        if (j != -1) {
            hVar = new C3414h();
            hVar.f10782d = this.f10718e;
            if (!this.f10722j) {
                z2 = true;
            }
            hVar.f10815l = z2;
            hVar.f10781c = m14125e();
            hVar.mo13660a(this.f10721i);
            hVar.f10814k = this.f10715b.mo13610d().mo13861d();
            hVar.f10813j = this.f10715b.mo13610d().mo13859c();
            hVar.f10783e = f10712a;
            hVar.f10784f = C3368a.m14050m();
            hVar.f10785g = C3368a.m14041d();
            arrayList.add(hVar);
        }
        if (C3368a.f10664a <= 0) {
            C3368a.f10664a = 6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startSession, ");
        if (this.f10722j) {
            str = "fg";
        } else {
            str = "bg";
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.f10718e);
        C3469r.m14665a(sb.toString());
        return hVar;
    }
}
