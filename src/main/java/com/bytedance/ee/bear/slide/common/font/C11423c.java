package com.bytedance.ee.bear.slide.common.font;

import android.text.TextUtils;
import com.bytedance.ee.bear.slide.common.font.C11426f;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.slide.common.font.c */
public class C11423c {

    /* renamed from: a */
    private C11426f.AbstractC11427a f30710a;

    /* renamed from: b */
    private List<C11419a> f30711b;

    /* renamed from: c */
    private List<C11419a> f30712c;

    /* renamed from: d */
    private boolean f30713d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo43769a() {
        return this.f30713d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11426f.AbstractC11427a mo43770b() {
        return this.f30710a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C11419a> mo43771c() {
        return this.f30711b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo43772d() {
        C11426f.AbstractC11427a aVar = this.f30710a;
        if (aVar != null) {
            aVar.mo43786a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43773e() {
        C11426f.AbstractC11427a aVar = this.f30710a;
        if (aVar != null) {
            aVar.mo43790a(this.f30712c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43767a(C11419a aVar) {
        C11426f.AbstractC11427a aVar2;
        if (this.f30712c.remove(aVar) && (aVar2 = this.f30710a) != null) {
            aVar2.mo43788a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43768a(String str) {
        for (C11419a aVar : this.f30711b) {
            if (TextUtils.equals(str, aVar.mo43748e())) {
                this.f30710a.mo43789a(str);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43766a(long j, C11419a aVar) {
        if (this.f30710a != null && this.f30711b.contains(aVar)) {
            this.f30710a.mo43787a(j, aVar);
        }
    }

    C11423c(C11426f.AbstractC11427a aVar, List<C11419a> list, boolean z) {
        this.f30710a = aVar;
        this.f30711b = list;
        this.f30712c = new ArrayList(list);
        this.f30713d = z;
    }
}
