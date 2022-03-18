package com.ss.android.ttvecamera;

import android.graphics.Rect;
import com.ss.android.ttvecamera.AbstractC60313b;

/* renamed from: com.ss.android.ttvecamera.o */
public class C60420o {

    /* renamed from: a */
    private final int f150989a;

    /* renamed from: b */
    private final int f150990b;

    /* renamed from: c */
    private final int f150991c;

    /* renamed from: d */
    private final int f150992d;

    /* renamed from: e */
    private final float f150993e;

    /* renamed from: f */
    private long f150994f;

    /* renamed from: g */
    private boolean f150995g = true;

    /* renamed from: h */
    private boolean f150996h = true;

    /* renamed from: i */
    private boolean f150997i;

    /* renamed from: j */
    private boolean f150998j = true;

    /* renamed from: k */
    private AbstractC60313b.AbstractC60314a f150999k;

    /* renamed from: l */
    private AbstractC60313b.AbstractC60315b f151000l;

    /* renamed from: m */
    private AbstractC60422a f151001m = new C60423b();

    /* renamed from: com.ss.android.ttvecamera.o$a */
    public interface AbstractC60422a {
        /* renamed from: a */
        void mo206916a(int i, int i2, String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttvecamera.o$b */
    public static class C60423b implements AbstractC60422a {
        private C60423b() {
        }

        @Override // com.ss.android.ttvecamera.C60420o.AbstractC60422a
        /* renamed from: a */
        public void mo206916a(int i, int i2, String str) {
            if (i > 0) {
                C60427s.m234842b("TEFocusNullCallback", "Focus done, cost: " + i + "ms");
            } else {
                C60427s.m234839a("TEFocusNullCallback", "Focus failed, error code: " + i + ", msg: " + str);
            }
            C60427s.m234835a();
        }
    }

    /* renamed from: a */
    public AbstractC60422a mo206893a() {
        return this.f151001m;
    }

    /* renamed from: d */
    public int mo206903d() {
        return this.f150989a;
    }

    /* renamed from: e */
    public int mo206905e() {
        return this.f150990b;
    }

    /* renamed from: f */
    public int mo206906f() {
        return this.f150991c;
    }

    /* renamed from: g */
    public int mo206907g() {
        return this.f150992d;
    }

    /* renamed from: h */
    public float mo206908h() {
        return this.f150993e;
    }

    /* renamed from: i */
    public boolean mo206909i() {
        return this.f150995g;
    }

    /* renamed from: j */
    public boolean mo206910j() {
        return this.f150996h;
    }

    /* renamed from: k */
    public boolean mo206911k() {
        return this.f150997i;
    }

    /* renamed from: l */
    public boolean mo206912l() {
        return this.f150998j;
    }

    /* renamed from: m */
    public AbstractC60313b.AbstractC60314a mo206913m() {
        return this.f150999k;
    }

    /* renamed from: n */
    public AbstractC60313b.AbstractC60315b mo206914n() {
        return this.f151000l;
    }

    /* renamed from: b */
    public void mo206899b() {
        this.f150994f = System.currentTimeMillis();
    }

    /* renamed from: c */
    public int mo206901c() {
        return (int) (System.currentTimeMillis() - this.f150994f);
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f150989a + ", height =" + this.f150990b + ", x =" + this.f150991c + ", y =" + this.f150992d + ", need focus =" + this.f150995g + ", need meter =" + this.f150996h + ", lock =" + this.f150997i + ", from user=" + this.f150998j + '}';
    }

    /* renamed from: b */
    public void mo206900b(boolean z) {
        this.f150996h = z;
    }

    /* renamed from: c */
    public void mo206902c(boolean z) {
        this.f150997i = z;
    }

    /* renamed from: a */
    public void mo206894a(AbstractC60313b.AbstractC60314a aVar) {
        this.f150999k = aVar;
    }

    /* renamed from: d */
    public void mo206904d(boolean z) {
        this.f150998j = z;
    }

    /* renamed from: a */
    public void mo206895a(AbstractC60313b.AbstractC60315b bVar) {
        this.f151000l = bVar;
    }

    /* renamed from: a */
    public void mo206896a(AbstractC60422a aVar) {
        if (aVar != null) {
            this.f151001m = aVar;
        } else {
            this.f151001m = new C60423b();
        }
    }

    /* renamed from: a */
    public void mo206897a(boolean z) {
        this.f150995g = z;
    }

    /* renamed from: a */
    public Rect mo206892a(int i, boolean z) {
        AbstractC60313b.AbstractC60314a aVar = this.f150999k;
        if (aVar != null) {
            return aVar.mo206564a(this.f150989a, this.f150990b, this.f150991c, this.f150992d, i, z).get(0).rect;
        }
        return null;
    }

    /* renamed from: b */
    public Rect mo206898b(int i, boolean z) {
        AbstractC60313b.AbstractC60315b bVar = this.f151000l;
        if (bVar != null) {
            return bVar.mo206565a(this.f150989a, this.f150990b, this.f150991c, this.f150992d, i, z).get(0).rect;
        }
        return null;
    }

    public C60420o(int i, int i2, int i3, int i4, float f) {
        this.f150989a = i;
        this.f150990b = i2;
        this.f150991c = i3;
        this.f150992d = i4;
        this.f150993e = f;
    }
}
