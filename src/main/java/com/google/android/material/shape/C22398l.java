package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.shape.l */
public class C22398l {

    /* renamed from: a */
    public static final AbstractC22389c f54919a = new C22396j(0.5f);

    /* renamed from: b */
    C22390d f54920b;

    /* renamed from: c */
    C22390d f54921c;

    /* renamed from: d */
    C22390d f54922d;

    /* renamed from: e */
    C22390d f54923e;

    /* renamed from: f */
    AbstractC22389c f54924f;

    /* renamed from: g */
    AbstractC22389c f54925g;

    /* renamed from: h */
    AbstractC22389c f54926h;

    /* renamed from: i */
    AbstractC22389c f54927i;

    /* renamed from: j */
    C22392f f54928j;

    /* renamed from: k */
    C22392f f54929k;

    /* renamed from: l */
    C22392f f54930l;

    /* renamed from: m */
    C22392f f54931m;

    /* renamed from: com.google.android.material.shape.l$b */
    public interface AbstractC22401b {
        /* renamed from: a */
        AbstractC22389c mo77988a(AbstractC22389c cVar);
    }

    /* renamed from: b */
    public C22390d mo78005b() {
        return this.f54920b;
    }

    /* renamed from: c */
    public C22390d mo78006c() {
        return this.f54921c;
    }

    /* renamed from: d */
    public C22390d mo78007d() {
        return this.f54922d;
    }

    /* renamed from: e */
    public C22390d mo78008e() {
        return this.f54923e;
    }

    /* renamed from: f */
    public AbstractC22389c mo78009f() {
        return this.f54924f;
    }

    /* renamed from: g */
    public AbstractC22389c mo78010g() {
        return this.f54925g;
    }

    /* renamed from: h */
    public AbstractC22389c mo78011h() {
        return this.f54926h;
    }

    /* renamed from: i */
    public AbstractC22389c mo78012i() {
        return this.f54927i;
    }

    /* renamed from: j */
    public C22392f mo78013j() {
        return this.f54931m;
    }

    /* renamed from: k */
    public C22392f mo78014k() {
        return this.f54928j;
    }

    /* renamed from: l */
    public C22392f mo78015l() {
        return this.f54929k;
    }

    /* renamed from: m */
    public C22392f mo78016m() {
        return this.f54930l;
    }

    /* renamed from: a */
    public C22398l mo78003a(AbstractC22401b bVar) {
        return mo78017n().mo78021a(bVar.mo77988a(mo78009f())).mo78027b(bVar.mo77988a(mo78010g())).mo78036d(bVar.mo77988a(mo78012i())).mo78032c(bVar.mo77988a(mo78011h())).mo78024a();
    }

    /* renamed from: a */
    public boolean mo78004a(RectF rectF) {
        boolean z = this.f54931m.getClass().equals(C22392f.class) && this.f54929k.getClass().equals(C22392f.class) && this.f54928j.getClass().equals(C22392f.class) && this.f54930l.getClass().equals(C22392f.class);
        float a = this.f54924f.mo77991a(rectF);
        boolean z2 = this.f54925g.mo77991a(rectF) == a && this.f54927i.mo77991a(rectF) == a && this.f54926h.mo77991a(rectF) == a;
        boolean z3 = (this.f54921c instanceof C22397k) && (this.f54920b instanceof C22397k) && (this.f54922d instanceof C22397k) && (this.f54923e instanceof C22397k);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C22400a m81156a() {
        return new C22400a();
    }

    /* renamed from: n */
    public C22400a mo78017n() {
        return new C22400a(this);
    }

    /* renamed from: com.google.android.material.shape.l$a */
    public static final class C22400a {

        /* renamed from: a */
        public C22390d f54932a = C22394h.m81145a();

        /* renamed from: b */
        public C22390d f54933b = C22394h.m81145a();

        /* renamed from: c */
        public C22390d f54934c = C22394h.m81145a();

        /* renamed from: d */
        public C22390d f54935d = C22394h.m81145a();

        /* renamed from: e */
        public AbstractC22389c f54936e = new C22387a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: f */
        public AbstractC22389c f54937f = new C22387a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: g */
        public AbstractC22389c f54938g = new C22387a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: h */
        public AbstractC22389c f54939h = new C22387a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: i */
        public C22392f f54940i = C22394h.m81150b();

        /* renamed from: j */
        public C22392f f54941j = C22394h.m81150b();

        /* renamed from: k */
        public C22392f f54942k = C22394h.m81150b();

        /* renamed from: l */
        public C22392f f54943l = C22394h.m81150b();

        public C22400a() {
        }

        /* renamed from: a */
        public C22398l mo78024a() {
            return new C22398l(this);
        }

        /* renamed from: a */
        public C22400a mo78021a(AbstractC22389c cVar) {
            this.f54936e = cVar;
            return this;
        }

        /* renamed from: b */
        public C22400a mo78027b(AbstractC22389c cVar) {
            this.f54937f = cVar;
            return this;
        }

        /* renamed from: c */
        public C22400a mo78032c(AbstractC22389c cVar) {
            this.f54938g = cVar;
            return this;
        }

        /* renamed from: d */
        public C22400a mo78036d(AbstractC22389c cVar) {
            this.f54939h = cVar;
            return this;
        }

        /* renamed from: a */
        public C22400a mo78023a(C22392f fVar) {
            this.f54940i = fVar;
            return this;
        }

        /* renamed from: b */
        public C22400a mo78025b(float f) {
            this.f54936e = new C22387a(f);
            return this;
        }

        /* renamed from: c */
        public C22400a mo78030c(float f) {
            this.f54937f = new C22387a(f);
            return this;
        }

        /* renamed from: d */
        public C22400a mo78034d(float f) {
            this.f54938g = new C22387a(f);
            return this;
        }

        /* renamed from: e */
        public C22400a mo78038e(float f) {
            this.f54939h = new C22387a(f);
            return this;
        }

        /* renamed from: e */
        public C22400a mo78039e(C22390d dVar) {
            this.f54935d = dVar;
            float f = m81179f(dVar);
            if (f != -1.0f) {
                mo78038e(f);
            }
            return this;
        }

        /* renamed from: f */
        private static float m81179f(C22390d dVar) {
            if (dVar instanceof C22397k) {
                return ((C22397k) dVar).f54918a;
            }
            if (dVar instanceof C22391e) {
                return ((C22391e) dVar).f54913a;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public C22400a mo78018a(float f) {
            return mo78025b(f).mo78030c(f).mo78034d(f).mo78038e(f);
        }

        /* renamed from: b */
        public C22400a mo78028b(C22390d dVar) {
            this.f54932a = dVar;
            float f = m81179f(dVar);
            if (f != -1.0f) {
                mo78025b(f);
            }
            return this;
        }

        /* renamed from: c */
        public C22400a mo78033c(C22390d dVar) {
            this.f54933b = dVar;
            float f = m81179f(dVar);
            if (f != -1.0f) {
                mo78030c(f);
            }
            return this;
        }

        /* renamed from: d */
        public C22400a mo78037d(C22390d dVar) {
            this.f54934c = dVar;
            float f = m81179f(dVar);
            if (f != -1.0f) {
                mo78034d(f);
            }
            return this;
        }

        /* renamed from: b */
        public C22400a mo78029b(C22392f fVar) {
            this.f54942k = fVar;
            return this;
        }

        /* renamed from: a */
        public C22400a mo78022a(C22390d dVar) {
            return mo78028b(dVar).mo78033c(dVar).mo78037d(dVar).mo78039e(dVar);
        }

        public C22400a(C22398l lVar) {
            this.f54932a = lVar.f54920b;
            this.f54933b = lVar.f54921c;
            this.f54934c = lVar.f54922d;
            this.f54935d = lVar.f54923e;
            this.f54936e = lVar.f54924f;
            this.f54937f = lVar.f54925g;
            this.f54938g = lVar.f54926h;
            this.f54939h = lVar.f54927i;
            this.f54940i = lVar.f54928j;
            this.f54941j = lVar.f54929k;
            this.f54942k = lVar.f54930l;
            this.f54943l = lVar.f54931m;
        }

        /* renamed from: a */
        public C22400a mo78019a(int i, float f) {
            return mo78022a(C22394h.m81146a(i)).mo78018a(f);
        }

        /* renamed from: b */
        public C22400a mo78026b(int i, AbstractC22389c cVar) {
            return mo78033c(C22394h.m81146a(i)).mo78027b(cVar);
        }

        /* renamed from: c */
        public C22400a mo78031c(int i, AbstractC22389c cVar) {
            return mo78037d(C22394h.m81146a(i)).mo78032c(cVar);
        }

        /* renamed from: d */
        public C22400a mo78035d(int i, AbstractC22389c cVar) {
            return mo78039e(C22394h.m81146a(i)).mo78036d(cVar);
        }

        /* renamed from: a */
        public C22400a mo78020a(int i, AbstractC22389c cVar) {
            return mo78028b(C22394h.m81146a(i)).mo78021a(cVar);
        }
    }

    public C22398l() {
        this.f54920b = C22394h.m81145a();
        this.f54921c = C22394h.m81145a();
        this.f54922d = C22394h.m81145a();
        this.f54923e = C22394h.m81145a();
        this.f54924f = new C22387a(BitmapDescriptorFactory.HUE_RED);
        this.f54925g = new C22387a(BitmapDescriptorFactory.HUE_RED);
        this.f54926h = new C22387a(BitmapDescriptorFactory.HUE_RED);
        this.f54927i = new C22387a(BitmapDescriptorFactory.HUE_RED);
        this.f54928j = C22394h.m81150b();
        this.f54929k = C22394h.m81150b();
        this.f54930l = C22394h.m81150b();
        this.f54931m = C22394h.m81150b();
    }

    private C22398l(C22400a aVar) {
        this.f54920b = aVar.f54932a;
        this.f54921c = aVar.f54933b;
        this.f54922d = aVar.f54934c;
        this.f54923e = aVar.f54935d;
        this.f54924f = aVar.f54936e;
        this.f54925g = aVar.f54937f;
        this.f54926h = aVar.f54938g;
        this.f54927i = aVar.f54939h;
        this.f54928j = aVar.f54940i;
        this.f54929k = aVar.f54941j;
        this.f54930l = aVar.f54942k;
        this.f54931m = aVar.f54943l;
    }

    /* renamed from: a */
    public C22398l mo78002a(float f) {
        return mo78017n().mo78018a(f).mo78024a();
    }

    /* renamed from: a */
    public static C22400a m81157a(Context context, int i, int i2) {
        return m81158a(context, i, i2, 0);
    }

    /* renamed from: a */
    private static AbstractC22389c m81155a(TypedArray typedArray, int i, AbstractC22389c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        if (peekValue.type == 5) {
            return new C22387a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (peekValue.type == 6) {
            return new C22396j(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    /* renamed from: a */
    private static C22400a m81158a(Context context, int i, int i2, int i3) {
        return m81159a(context, i, i2, new C22387a((float) i3));
    }

    /* renamed from: a */
    private static C22400a m81159a(Context context, int i, int i2, AbstractC22389c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight});
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            AbstractC22389c a = m81155a(obtainStyledAttributes, 5, cVar);
            AbstractC22389c a2 = m81155a(obtainStyledAttributes, 8, a);
            AbstractC22389c a3 = m81155a(obtainStyledAttributes, 9, a);
            AbstractC22389c a4 = m81155a(obtainStyledAttributes, 7, a);
            return new C22400a().mo78020a(i4, a2).mo78026b(i5, a3).mo78031c(i6, a4).mo78035d(i7, m81155a(obtainStyledAttributes, 6, a));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static C22400a m81160a(Context context, AttributeSet attributeSet, int i, int i2) {
        return m81161a(context, attributeSet, i, i2, 0);
    }

    /* renamed from: a */
    public static C22400a m81161a(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m81162a(context, attributeSet, i, i2, new C22387a((float) i3));
    }

    /* renamed from: a */
    public static C22400a m81162a(Context context, AttributeSet attributeSet, int i, int i2, AbstractC22389c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay}, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m81159a(context, resourceId, resourceId2, cVar);
    }
}
