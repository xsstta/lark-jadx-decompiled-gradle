package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0667d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.a.m */
class C0657m {

    /* renamed from: a */
    public static int f2630a;

    /* renamed from: b */
    public boolean f2631b;

    /* renamed from: c */
    AbstractC0662p f2632c;

    /* renamed from: d */
    AbstractC0662p f2633d;

    /* renamed from: e */
    ArrayList<AbstractC0662p> f2634e = new ArrayList<>();

    /* renamed from: f */
    int f2635f = 0;

    /* renamed from: g */
    int f2636g;

    /* renamed from: a */
    public void mo3638a(AbstractC0662p pVar) {
        this.f2634e.add(pVar);
        this.f2633d = pVar;
    }

    public C0657m(AbstractC0662p pVar, int i) {
        int i2 = f2630a;
        this.f2635f = i2;
        f2630a = i2 + 1;
        this.f2632c = pVar;
        this.f2633d = pVar;
        this.f2636g = i;
    }

    /* renamed from: a */
    private long m3157a(C0648f fVar, long j) {
        AbstractC0662p pVar = fVar.f2616d;
        if (pVar instanceof C0654k) {
            return j;
        }
        int size = fVar.f2623k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0646d dVar = fVar.f2623k.get(i);
            if (dVar instanceof C0648f) {
                C0648f fVar2 = (C0648f) dVar;
                if (fVar2.f2616d != pVar) {
                    j2 = Math.max(j2, m3157a(fVar2, ((long) fVar2.f2618f) + j));
                }
            }
        }
        if (fVar != pVar.f2662j) {
            return j2;
        }
        long b = j + pVar.mo3617b();
        return Math.max(Math.max(j2, m3157a(pVar.f2663k, b)), b - ((long) pVar.f2663k.f2618f));
    }

    /* renamed from: b */
    private long m3158b(C0648f fVar, long j) {
        AbstractC0662p pVar = fVar.f2616d;
        if (pVar instanceof C0654k) {
            return j;
        }
        int size = fVar.f2623k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AbstractC0646d dVar = fVar.f2623k.get(i);
            if (dVar instanceof C0648f) {
                C0648f fVar2 = (C0648f) dVar;
                if (fVar2.f2616d != pVar) {
                    j2 = Math.min(j2, m3158b(fVar2, ((long) fVar2.f2618f) + j));
                }
            }
        }
        if (fVar != pVar.f2663k) {
            return j2;
        }
        long b = j - pVar.mo3617b();
        return Math.min(Math.min(j2, m3158b(pVar.f2662j, b)), b - ((long) pVar.f2662j.f2618f));
    }

    /* renamed from: a */
    public long mo3637a(C0667d dVar, int i) {
        C0648f fVar;
        C0648f fVar2;
        long j;
        int i2;
        AbstractC0662p pVar = this.f2632c;
        long j2 = 0;
        if (pVar instanceof C0645c) {
            if (((C0645c) pVar).f2660h != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar instanceof C0655l)) {
                return 0;
            }
        } else if (!(pVar instanceof C0658n)) {
            return 0;
        }
        if (i == 0) {
            fVar = dVar.f2562f.f2662j;
        } else {
            fVar = dVar.f2563g.f2662j;
        }
        if (i == 0) {
            fVar2 = dVar.f2562f.f2663k;
        } else {
            fVar2 = dVar.f2563g.f2663k;
        }
        boolean contains = this.f2632c.f2662j.f2624l.contains(fVar);
        boolean contains2 = this.f2632c.f2663k.f2624l.contains(fVar2);
        long b = this.f2632c.mo3617b();
        if (contains && contains2) {
            long a = m3157a(this.f2632c.f2662j, 0);
            long b2 = m3158b(this.f2632c.f2663k, 0);
            long j3 = a - b;
            if (j3 >= ((long) (-this.f2632c.f2663k.f2618f))) {
                j3 += (long) this.f2632c.f2663k.f2618f;
            }
            long j4 = ((-b2) - b) - ((long) this.f2632c.f2662j.f2618f);
            if (j4 >= ((long) this.f2632c.f2662j.f2618f)) {
                j4 -= (long) this.f2632c.f2662j.f2618f;
            }
            float l = this.f2632c.f2656d.mo3573l(i);
            if (l > BitmapDescriptorFactory.HUE_RED) {
                j2 = (long) ((((float) j4) / l) + (((float) j3) / (1.0f - l)));
            }
            float f = (float) j2;
            j = ((long) this.f2632c.f2662j.f2618f) + ((long) ((f * l) + 0.5f)) + b + ((long) ((f * (1.0f - l)) + 0.5f));
            i2 = this.f2632c.f2663k.f2618f;
        } else if (contains) {
            return Math.max(m3157a(this.f2632c.f2662j, (long) this.f2632c.f2662j.f2618f), ((long) this.f2632c.f2662j.f2618f) + b);
        } else {
            if (contains2) {
                return Math.max(-m3158b(this.f2632c.f2663k, (long) this.f2632c.f2663k.f2618f), ((long) (-this.f2632c.f2663k.f2618f)) + b);
            }
            j = ((long) this.f2632c.f2662j.f2618f) + this.f2632c.mo3617b();
            i2 = this.f2632c.f2663k.f2618f;
        }
        return j - ((long) i2);
    }
}
