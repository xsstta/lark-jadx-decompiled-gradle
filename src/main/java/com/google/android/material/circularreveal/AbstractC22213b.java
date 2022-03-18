package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.p987h.C22309a;

/* renamed from: com.google.android.material.circularreveal.b */
public interface AbstractC22213b extends CircularRevealHelper.AbstractC22210a {
    void Y_();

    /* renamed from: a */
    void mo77235a();

    int getCircularRevealScrimColor();

    C22218d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C22218d dVar);

    /* renamed from: com.google.android.material.circularreveal.b$d */
    public static class C22218d {

        /* renamed from: a */
        public float f54293a;

        /* renamed from: b */
        public float f54294b;

        /* renamed from: c */
        public float f54295c;

        private C22218d() {
        }

        /* renamed from: a */
        public boolean mo77279a() {
            if (this.f54295c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo77278a(C22218d dVar) {
            mo77277a(dVar.f54293a, dVar.f54294b, dVar.f54295c);
        }

        public C22218d(C22218d dVar) {
            this(dVar.f54293a, dVar.f54294b, dVar.f54295c);
        }

        /* renamed from: a */
        public void mo77277a(float f, float f2, float f3) {
            this.f54293a = f;
            this.f54294b = f2;
            this.f54295c = f3;
        }

        public C22218d(float f, float f2, float f3) {
            this.f54293a = f;
            this.f54294b = f2;
            this.f54295c = f3;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.b$b */
    public static class C22216b extends Property<AbstractC22213b, C22218d> {

        /* renamed from: a */
        public static final Property<AbstractC22213b, C22218d> f54291a = new C22216b("circularReveal");

        private C22216b(String str) {
            super(C22218d.class, str);
        }

        /* renamed from: a */
        public C22218d get(AbstractC22213b bVar) {
            return bVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(AbstractC22213b bVar, C22218d dVar) {
            bVar.setRevealInfo(dVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.b$c */
    public static class C22217c extends Property<AbstractC22213b, Integer> {

        /* renamed from: a */
        public static final Property<AbstractC22213b, Integer> f54292a = new C22217c("circularRevealScrimColor");

        private C22217c(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(AbstractC22213b bVar) {
            return Integer.valueOf(bVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(AbstractC22213b bVar, Integer num) {
            bVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public static class C22215a implements TypeEvaluator<C22218d> {

        /* renamed from: a */
        public static final TypeEvaluator<C22218d> f54289a = new C22215a();

        /* renamed from: b */
        private final C22218d f54290b = new C22218d();

        /* renamed from: a */
        public C22218d evaluate(float f, C22218d dVar, C22218d dVar2) {
            this.f54290b.mo77277a(C22309a.m80779a(dVar.f54293a, dVar2.f54293a, f), C22309a.m80779a(dVar.f54294b, dVar2.f54294b, f), C22309a.m80779a(dVar.f54295c, dVar2.f54295c, f));
            return this.f54290b;
        }
    }
}
