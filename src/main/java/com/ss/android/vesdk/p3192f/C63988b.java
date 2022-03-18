package com.ss.android.vesdk.p3192f;

import android.view.Surface;
import com.ss.android.vesdk.C63922a;

/* renamed from: com.ss.android.vesdk.f.b */
public class C63988b implements AbstractC63989c {

    /* renamed from: a */
    private C63922a<AbstractC63989c> f161602a = new C63922a<>();

    /* renamed from: b */
    int f161603b;

    /* renamed from: c */
    int f161604c;

    /* renamed from: d */
    Surface f161605d;

    /* renamed from: e */
    boolean f161606e;

    /* renamed from: a */
    public int mo221431a() {
        return this.f161603b;
    }

    /* renamed from: b */
    public int mo221433b() {
        return this.f161604c;
    }

    /* renamed from: c */
    public boolean mo221435c() {
        return this.f161606e;
    }

    /* renamed from: b */
    public boolean mo221434b(AbstractC63989c cVar) {
        return this.f161602a.mo221138b(cVar);
    }

    /* renamed from: a */
    public boolean mo221432a(AbstractC63989c cVar) {
        if (cVar != null) {
            return this.f161602a.mo221136a(cVar);
        }
        return false;
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: a */
    public void mo221382a(Surface surface) {
        this.f161605d = surface;
        this.f161606e = false;
        for (AbstractC63989c cVar : this.f161602a.mo221139c()) {
            cVar.mo221382a(surface);
        }
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: b */
    public void mo221402b(Surface surface) {
        for (AbstractC63989c cVar : this.f161602a.mo221139c()) {
            cVar.mo221402b(surface);
        }
    }

    public C63988b(int i, int i2) {
        this.f161603b = i;
        this.f161604c = i2;
    }

    @Override // com.ss.android.vesdk.p3192f.AbstractC63989c
    /* renamed from: a */
    public void mo221383a(Surface surface, int i, int i2, int i3) {
        if (this.f161603b == i3 && this.f161604c == i3 && surface == this.f161605d) {
            this.f161606e = false;
        } else {
            this.f161606e = true;
            this.f161603b = i2;
            this.f161604c = i3;
        }
        for (AbstractC63989c cVar : this.f161602a.mo221139c()) {
            cVar.mo221383a(surface, i, i2, i3);
        }
    }
}
