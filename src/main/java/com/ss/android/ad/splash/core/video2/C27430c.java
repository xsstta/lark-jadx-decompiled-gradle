package com.ss.android.ad.splash.core.video2;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27368t;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.p1252g.C27307c;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.C27481j;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.splash.core.video2.c */
public class C27430c implements AbstractC27429b {

    /* renamed from: a */
    private int f68562a;

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: b */
    public void mo97177b() {
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: b */
    public void mo97225b(int i) {
    }

    /* renamed from: b */
    public void mo97178b(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo97226c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo97227c(int i) {
    }

    /* renamed from: c */
    public void mo97179c(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo97228d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo97731d(int i) {
    }

    /* renamed from: d */
    public void mo97180d(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo97229e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo97732e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo97733e(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo97734f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo97735f(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo97736g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97964a(C27331b bVar, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("show_expected", Integer.valueOf(bVar.mo97453S()));
        hashMap2.put("show_type", bVar.mo97499m() ? "real_time" : "not_real_time");
        int i = 1;
        hashMap2.put("play_order", 1);
        if (C27287e.ah() != -1) {
            if (C27287e.ah() != 1) {
                i = 2;
            }
            hashMap2.put("awemelaunch", Integer.valueOf(i));
        }
        hashMap2.put("ad_sequence", Integer.valueOf(C27368t.m99732a().mo97695z()));
        hashMap.put("is_ad_event", "1");
        if (!C27480i.m100385a(bVar.mo97511x())) {
            hashMap.put("log_extra", bVar.mo97511x());
        }
        hashMap.put("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        C27278b.m99171a().mo97296a(bVar, 0, "play", hashMap, hashMap2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97963a(C27331b bVar, AbstractC27436f fVar) {
        if (bVar.mo97445K() != null) {
            C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
            if (C27287e.m99259e().mo97696a()) {
                C27287e.m99217P().mo97347a(null, "play", bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
            } else {
                C27287e.m99217P().mo97349c(null, bVar.mo97509v(), bVar.mo97445K().mo97571a(), bVar.mo97511x(), true, -1, null, a);
            }
        }
        C27287e.m99218Q().mo97335a((long) fVar.mo97930h(), fVar.mo97925c(), fVar.mo97926d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97962a(C27331b bVar, int i, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap.put("duration", Integer.valueOf(i));
        hashMap2.put("play_order", 1);
        C27278b.m99171a().mo97296a(bVar, 0, "pause", hashMap, hashMap2);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: a */
    public void mo97174a() {
        mo97734f();
        mo97736g();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: h */
    public void mo97955h() {
        mo97228d();
        mo97229e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo97966i() {
        C27287e.m99218Q().mo97339b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo97967j() {
        C27287e.m99218Q().mo97341c();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: f */
    public void mo97953f(int i) {
        mo97227c(i);
        mo97226c();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: a */
    public void mo97175a(int i) {
        mo97731d(i);
        mo97732e(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97959a(C27331b bVar) {
        mo97965b(bVar, null, null);
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: a */
    public void mo97176a(int i, int i2) {
        mo97733e(i, i2);
        mo97735f(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97957a(int i, C27331b bVar) {
        if (bVar.mo97445K() != null) {
            C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
            if (C27287e.m99259e().mo97696a()) {
                C27287e.m99217P().mo97347a(null, "play_over", bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
            } else {
                C27287e.m99217P().mo97350d(null, bVar.mo97509v(), bVar.mo97445K().mo97573b(), bVar.mo97511x(), true, -1, null, a);
            }
        }
        C27287e.m99218Q().mo97334a();
    }

    @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b
    /* renamed from: g */
    public void mo97954g(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            if (f >= 0.75f) {
                int i3 = this.f68562a;
                if ((i3 & 8) == 0) {
                    this.f68562a = i3 | 8;
                    mo97180d(i, i2);
                }
            }
            if (f >= 0.5f) {
                int i4 = this.f68562a;
                if ((i4 & 4) == 0) {
                    this.f68562a = i4 | 4;
                    mo97179c(i, i2);
                }
            }
            if (f >= 0.25f) {
                int i5 = this.f68562a;
                if ((i5 & 2) == 0) {
                    this.f68562a = i5 | 2;
                    mo97178b(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97960a(C27331b bVar, int i) {
        mo97962a(bVar, i, (HashMap<String, Object>) null, (HashMap<String, Object>) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97956a(int i, int i2, int i3) {
        if (i3 != 1) {
            C27287e.m99218Q().mo97343d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo97965b(C27331b bVar, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("play_order", 1);
        C27278b.m99171a().mo97296a(bVar, 0, "resume", hashMap, hashMap2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97958a(int i, C27331b bVar, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("play_order", 1);
        hashMap.put("duration", Long.toString((long) i));
        hashMap.put("percent", Integer.toString(100));
        hashMap.put("is_ad_event", "1");
        hashMap.put("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        if (!C27480i.m100385a(bVar.mo97511x())) {
            hashMap.put("log_extra", bVar.mo97511x());
        }
        C27278b.m99171a().mo97296a(bVar, 0, "play_over", hashMap, hashMap2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97961a(C27331b bVar, int i, int i2, int i3, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        long j = (long) i;
        hashMap.put("duration", Long.toString(j));
        hashMap.put("percent", Integer.valueOf(C27481j.m100386a(j, (long) i2)));
        hashMap.put("is_ad_event", "1");
        hashMap.put("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        hashMap.put("break_reason", Integer.valueOf(i3));
        if (!C27480i.m100385a(bVar.mo97511x())) {
            hashMap.put("log_extra", bVar.mo97511x());
        }
        hashMap2.put("break_reason", Integer.valueOf(i3));
        hashMap2.put("play_order", 1);
        C27278b.m99171a().mo97296a(bVar, 0, "play_break", hashMap, hashMap2);
    }
}
