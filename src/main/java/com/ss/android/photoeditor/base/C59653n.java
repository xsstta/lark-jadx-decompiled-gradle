package com.ss.android.photoeditor.base;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.photoeditor.base.n */
public class C59653n {

    /* renamed from: a */
    private AbstractC59654a f148054a;

    /* renamed from: b */
    private C59640j f148055b;

    /* renamed from: c */
    private C59640j f148056c;

    /* renamed from: d */
    private PointF f148057d;

    /* renamed from: e */
    private PointF f148058e;

    /* renamed from: f */
    private boolean f148059f;

    /* renamed from: com.ss.android.photoeditor.base.n$a */
    public static abstract class AbstractC59654a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo203133a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo203134a(PointF pointF, float f, float f2, float f3) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo203135b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo203185c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo203186d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo203187e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo203188f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo203189g() {
        }
    }

    public C59653n(AbstractC59654a aVar) {
        this.f148054a = aVar;
    }

    /* renamed from: c */
    private void m231368c(MotionEvent motionEvent) {
        this.f148055b = new C59640j(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
    }

    /* renamed from: b */
    private void m231367b(MotionEvent motionEvent) {
        C59640j jVar = this.f148056c;
        if (jVar == null) {
            this.f148056c = new C59640j(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
        } else {
            jVar.mo203164a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1));
        }
    }

    /* renamed from: a */
    public void mo203184a(MotionEvent motionEvent) {
        float f;
        float f2;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f148054a.mo203189g();
        } else if (action == 1) {
            this.f148056c = null;
            this.f148055b = null;
            this.f148054a.mo203185c();
            this.f148054a.mo203135b();
        } else if (action == 2) {
            if (!this.f148059f) {
                this.f148059f = true;
                this.f148054a.mo203133a();
            }
            float f3 = 1.0f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (pointerCount == 1) {
                if (this.f148058e == null) {
                    PointF pointF = new PointF();
                    this.f148058e = pointF;
                    pointF.x = motionEvent.getX();
                    this.f148058e.y = motionEvent.getY();
                    f2 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f4 = motionEvent.getX() - this.f148058e.x;
                    f2 = motionEvent.getY() - this.f148058e.y;
                    this.f148058e.x = motionEvent.getX();
                    this.f148058e.y = motionEvent.getY();
                }
                this.f148055b = null;
                f = f2;
            } else if (pointerCount == 2) {
                this.f148058e = null;
                m231367b(motionEvent);
                if (this.f148055b == null) {
                    m231368c(motionEvent);
                    this.f148057d = this.f148055b.mo203163a();
                }
                Log.m165379d("DoublePActionHandler", "ACTION_MOVE");
                f3 = this.f148055b.mo203167d(this.f148056c);
                f4 = this.f148055b.mo203165b(this.f148056c);
                f = this.f148055b.mo203166c(this.f148056c);
                this.f148055b.mo203168e(this.f148056c);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            this.f148054a.mo203134a(this.f148057d, f3, f4, f);
            this.f148054a.mo203188f();
        } else if (action == 5) {
            m231368c(motionEvent);
            m231367b(motionEvent);
            this.f148057d = this.f148055b.mo203163a();
            this.f148054a.mo203187e();
            if (!this.f148059f) {
                this.f148054a.mo203133a();
                this.f148059f = true;
            }
            Log.m165379d("DoublePActionHandler", "ACTION_POINTER_DOWN");
        } else if (action == 6) {
            Log.m165379d("DoublePActionHandler", "ACTION_POINTER_UP");
            this.f148054a.mo203186d();
        }
    }
}
