package androidx.constraintlayout.motion.p024a;

import androidx.constraintlayout.motion.widget.AbstractC0555g;
import androidx.constraintlayout.motion.widget.AbstractC0588r;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.constraintlayout.motion.a.h */
public class C0536h {

    /* renamed from: g */
    private static String f1983g = "VelocityMatrix";

    /* renamed from: a */
    float f1984a;

    /* renamed from: b */
    float f1985b;

    /* renamed from: c */
    float f1986c;

    /* renamed from: d */
    float f1987d;

    /* renamed from: e */
    float f1988e;

    /* renamed from: f */
    float f1989f;

    /* renamed from: a */
    public void mo3129a() {
        this.f1988e = BitmapDescriptorFactory.HUE_RED;
        this.f1987d = BitmapDescriptorFactory.HUE_RED;
        this.f1986c = BitmapDescriptorFactory.HUE_RED;
        this.f1985b = BitmapDescriptorFactory.HUE_RED;
        this.f1984a = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public void mo3131a(AbstractC0555g gVar, float f) {
        if (gVar != null) {
            this.f1988e = gVar.mo3247b(f);
        }
    }

    /* renamed from: a */
    public void mo3133a(AbstractC0588r rVar, float f) {
        if (rVar != null) {
            this.f1988e = rVar.mo3355b(f);
            this.f1989f = rVar.mo3350a(f);
        }
    }

    /* renamed from: b */
    public void mo3135b(AbstractC0555g gVar, AbstractC0555g gVar2, float f) {
        if (gVar != null || gVar2 != null) {
            if (gVar == null) {
                this.f1984a = gVar.mo3247b(f);
            }
            if (gVar2 == null) {
                this.f1985b = gVar2.mo3247b(f);
            }
        }
    }

    /* renamed from: a */
    public void mo3132a(AbstractC0555g gVar, AbstractC0555g gVar2, float f) {
        if (gVar != null) {
            this.f1986c = gVar.mo3247b(f);
        }
        if (gVar2 != null) {
            this.f1987d = gVar2.mo3247b(f);
        }
    }

    /* renamed from: b */
    public void mo3136b(AbstractC0588r rVar, AbstractC0588r rVar2, float f) {
        if (rVar != null) {
            this.f1984a = rVar.mo3355b(f);
        }
        if (rVar2 != null) {
            this.f1985b = rVar2.mo3355b(f);
        }
    }

    /* renamed from: a */
    public void mo3134a(AbstractC0588r rVar, AbstractC0588r rVar2, float f) {
        if (rVar != null) {
            this.f1986c = rVar.mo3355b(f);
        }
        if (rVar2 != null) {
            this.f1987d = rVar2.mo3355b(f);
        }
    }

    /* renamed from: a */
    public void mo3130a(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f1986c;
        float f8 = f4 + this.f1987d;
        float f9 = f7 + (this.f1984a * f5);
        float f10 = f8 + (this.f1985b * f6);
        float radians = (float) Math.toRadians((double) this.f1988e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f1989f));
        double d = (double) (((float) i2) * f6);
        fArr[0] = f9 + (((float) ((((double) (((float) (-i)) * f5)) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) ((((double) (((float) i) * f5)) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }
}
