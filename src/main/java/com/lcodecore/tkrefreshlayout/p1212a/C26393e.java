package com.lcodecore.tkrefreshlayout.p1212a;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import java.util.Objects;

/* renamed from: com.lcodecore.tkrefreshlayout.a.e */
public class C26393e implements AbstractC26390c {

    /* renamed from: a */
    protected TwinklingRefreshLayout.C26373a f65130a;

    /* renamed from: b */
    private float f65131b;

    /* renamed from: c */
    private float f65132c;

    /* renamed from: d */
    private boolean f65133d;

    /* renamed from: e */
    private boolean f65134e;

    /* renamed from: f */
    private boolean f65135f;

    /* renamed from: g */
    private boolean f65136g;

    /* renamed from: h */
    private MotionEvent f65137h;

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93660a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: b */
    public boolean mo93664b(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: c */
    public boolean mo93665c(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: d */
    public void mo93666d(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    private void m95579a() {
        MotionEvent motionEvent = this.f65137h;
        if (motionEvent != null) {
            this.f65130a.mo93585a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    /* renamed from: b */
    private void m95580b() {
        MotionEvent motionEvent = this.f65137h;
        this.f65130a.mo93585a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    public C26393e(TwinklingRefreshLayout.C26373a aVar) {
        Objects.requireNonNull(aVar, "The coprocessor can not be null.");
        this.f65130a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != 3) goto L_0x0193;
     */
    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo93663a(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p1212a.C26393e.mo93663a(android.view.MotionEvent):boolean");
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93662a(MotionEvent motionEvent, boolean z) {
        if (!z && this.f65134e) {
            this.f65130a.mo93586b().mo93627a();
        }
        if (!z && this.f65135f) {
            this.f65130a.mo93586b().mo93634b();
        }
        this.f65134e = false;
        this.f65135f = false;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93661a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        int n = this.f65130a.mo93606n();
        if (this.f65130a.mo93561D() && f2 >= ((float) n) && !this.f65130a.mo93565H()) {
            this.f65130a.mo93586b().mo93630a((int) f4);
        }
        if (this.f65130a.mo93562E() && f2 <= ((float) (-n))) {
            this.f65130a.mo93586b().mo93637b((int) f4);
        }
    }
}
