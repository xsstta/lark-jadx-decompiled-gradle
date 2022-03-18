package com.bytedance.applog.p197a;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.bytedance.applog.AbstractC3399e;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.network.C3449a;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.p201e.C3408d;
import com.bytedance.applog.p201e.C3415i;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.a.h */
public class C3377h extends AbstractC3371c {

    /* renamed from: b */
    private static final long[] f10710b = {10000};

    /* renamed from: c */
    private C3449a f10711c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: a */
    public boolean mo13590a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: e */
    public String mo13594e() {
        return "sender";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: c */
    public long[] mo13592c() {
        return f10710b;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: b */
    public long mo13591b() {
        return this.f10672a.mo13614h().mo13792D();
    }

    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: d */
    public boolean mo13593d() {
        Bundle a;
        long currentTimeMillis = System.currentTimeMillis();
        C3378i a2 = this.f10672a.mo13600a();
        if (!(a2 == null || (a = a2.mo13619a(currentTimeMillis, 50000)) == null)) {
            C3368a.m14017a("play_session", a);
            C3368a.m14038c();
        }
        C3408d c = this.f10672a.mo13608c();
        C3436h d = this.f10672a.mo13610d();
        if (d.mo13873n() == 0) {
            return false;
        }
        JSONObject a3 = C3470s.m14673a(d.mo13857b());
        if (a3 != null) {
            AbstractC3399e s = C3368a.m14056s();
            if (s != null) {
                s.mo13652a(a3);
            }
            m14118a(c.mo13701a(a3));
            return true;
        }
        C3469r.m14667a((Throwable) null);
        return false;
    }

    C3377h(C3373e eVar) {
        super(eVar);
        this.f10711c = new C3449a("sender_", eVar.mo13614h());
    }

    /* renamed from: a */
    private void m14118a(ArrayList<C3415i> arrayList) {
        if (this.f10711c.mo13882b()) {
            C3435g h = this.f10672a.mo13614h();
            C3408d c = this.f10672a.mo13608c();
            C3436h d = this.f10672a.mo13610d();
            ArrayList<C3415i> a = c.mo13700a();
            if (arrayList != null) {
                a.addAll(arrayList);
            }
            if (a.size() > 0) {
                ArrayList<C3415i> arrayList2 = new ArrayList<>(a.size());
                ArrayList<C3415i> arrayList3 = new ArrayList<>(a.size());
                String[] a2 = C3398b.m14191a(this.f10672a, d.mo13857b(), false);
                Iterator<C3415i> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3415i next = it.next();
                    if (next.f10817j == null || next.f10817j.length <= 0) {
                        arrayList2.add(next);
                    } else {
                        int a3 = C3396a.m14174a(a2, next.f10817j, h);
                        if (C3396a.m14183a(a3)) {
                            this.f10711c.mo13883c();
                            break;
                        } else if (a3 == 200) {
                            this.f10711c.mo13884d();
                            if (arrayList != null && arrayList.contains(next)) {
                                c.mo13702a(next, true, (SQLiteDatabase) null, false);
                            }
                            arrayList2.add(next);
                        } else {
                            next.f10819l = a3;
                            arrayList3.add(next);
                        }
                    }
                }
                if (arrayList2.size() > 0 || arrayList3.size() > 0) {
                    c.mo13704a(arrayList2, arrayList3);
                }
                C3469r.m14670d(mo13594e() + " " + arrayList2.size() + " " + a.size(), null);
            }
        }
    }
}
