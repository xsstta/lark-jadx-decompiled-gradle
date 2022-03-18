package com.ss.android.photoeditor.base;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.photoeditor.base.C59615b;
import com.ss.android.photoeditor.base.C59653n;
import com.ss.android.photoeditor.p3010b.C59610b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.base.f */
public class C59627f {

    /* renamed from: a */
    public RectF f148002a;

    /* renamed from: b */
    public RectF f148003b;

    /* renamed from: c */
    public C59653n f148004c;

    /* renamed from: d */
    public AbstractC59632a f148005d;

    /* renamed from: e */
    public C59615b f148006e;

    /* renamed from: f */
    public boolean f148007f;

    /* renamed from: g */
    public float f148008g;

    /* renamed from: h */
    public float f148009h;

    /* renamed from: i */
    public AbstractC59633b f148010i;

    /* renamed from: j */
    public AbstractC59634c f148011j;

    /* renamed from: k */
    private List<MotionEvent> f148012k = new ArrayList();

    /* renamed from: l */
    private AbstractC59632a f148013l = new AbstractC59632a() {
        /* class com.ss.android.photoeditor.base.C59627f.C596281 */

        @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59632a
        /* renamed from: a */
        public int mo203131a() {
            return 1;
        }

        @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59632a
        /* renamed from: a */
        public void mo203132a(MotionEvent motionEvent) {
            if (C59627f.this.f148011j != null) {
                C59627f.this.f148011j.mo203139a(motionEvent);
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                C59627f.this.f148005d = null;
            }
        }
    };

    /* renamed from: m */
    private AbstractC59632a f148014m = new AbstractC59632a() {
        /* class com.ss.android.photoeditor.base.C59627f.C596292 */

        @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59632a
        /* renamed from: a */
        public int mo203131a() {
            return 2;
        }

        @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59632a
        /* renamed from: a */
        public void mo203132a(MotionEvent motionEvent) {
            C59627f.this.f148004c.mo203184a(motionEvent);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.base.f$a */
    public interface AbstractC59632a {
        /* renamed from: a */
        int mo203131a();

        /* renamed from: a */
        void mo203132a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.photoeditor.base.f$b */
    public static abstract class AbstractC59633b {
        /* renamed from: a */
        public void mo203136a(RectF rectF) {
        }

        /* renamed from: b */
        public void mo203137b(RectF rectF) {
        }

        /* renamed from: c */
        public void mo203138c(RectF rectF) {
        }
    }

    /* renamed from: com.ss.android.photoeditor.base.f$c */
    public interface AbstractC59634c {
        /* renamed from: a */
        void mo203139a(MotionEvent motionEvent);
    }

    /* renamed from: a */
    private void m231281a() {
        this.f148004c = new C59653n(new C59653n.AbstractC59654a() {
            /* class com.ss.android.photoeditor.base.C59627f.C596303 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.photoeditor.base.C59653n.AbstractC59654a
            /* renamed from: a */
            public void mo203133a() {
                C59627f.this.f148010i.mo203138c(C59627f.this.f148002a);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.photoeditor.base.C59653n.AbstractC59654a
            /* renamed from: b */
            public void mo203135b() {
                if (!C59627f.this.f148006e.mo203065a(C59627f.this.f148002a, C59627f.this.f148003b)) {
                    C59627f.this.f148010i.mo203137b(new RectF(C59627f.this.f148002a));
                }
                C59627f.this.f148005d = null;
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.photoeditor.base.C59653n.AbstractC59654a
            /* renamed from: a */
            public void mo203134a(PointF pointF, float f, float f2, float f3) {
                float a = C59655o.m231378a(f, C59627f.this.f148008g, C59627f.this.f148009h, C59627f.this.f148002a.width());
                if (pointF != null) {
                    C59610b.m231211a(C59627f.this.f148002a, pointF.x, pointF.y, a);
                }
                C59627f.this.f148002a.offset(f2, f3);
                C59627f.this.f148010i.mo203136a(C59627f.this.f148002a);
            }
        });
    }

    /* renamed from: b */
    private void m231283b() {
        this.f148006e = new C59615b(new C59615b.AbstractC59618a() {
            /* class com.ss.android.photoeditor.base.C59627f.C596314 */

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: a */
            public void mo203071a() {
                C59627f.this.f148007f = true;
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: c */
            public void mo203074c() {
                C59627f.this.f148007f = false;
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: b */
            public void mo203073b() {
                C59627f.this.f148007f = false;
                C59627f.this.f148010i.mo203137b(new RectF(C59627f.this.f148002a));
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: a */
            public void mo203072a(RectF rectF) {
                C59627f.this.f148002a.set(rectF);
                C59627f.this.f148010i.mo203136a(C59627f.this.f148002a);
            }
        });
    }

    /* renamed from: a */
    public void mo203130a(MotionEvent motionEvent) {
        if (!this.f148007f) {
            if (this.f148005d == null) {
                this.f148005d = m231282b(motionEvent);
                return;
            }
            if (motionEvent.getPointerCount() == 2 && this.f148005d.mo203131a() == 1) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                this.f148005d.mo203132a(obtain);
                this.f148005d = this.f148014m;
                obtain.recycle();
            }
            this.f148005d.mo203132a(motionEvent);
        }
    }

    /* renamed from: b */
    private AbstractC59632a m231282b(MotionEvent motionEvent) {
        AbstractC59632a aVar;
        if (motionEvent.getAction() == 0) {
            this.f148012k.add(MotionEvent.obtain(motionEvent));
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            if (motionEvent.getPointerCount() == 2) {
                aVar = this.f148014m;
            } else {
                aVar = this.f148013l;
            }
            for (int i = 0; i < this.f148012k.size(); i++) {
                MotionEvent motionEvent2 = this.f148012k.get(i);
                aVar.mo203132a(motionEvent2);
                motionEvent2.recycle();
            }
            aVar.mo203132a(motionEvent);
            this.f148012k.clear();
            return aVar;
        }
        return null;
    }

    /* renamed from: a */
    public void mo203129a(RectF rectF, RectF rectF2) {
        this.f148006e.mo203066b(rectF, rectF2);
    }

    public C59627f(RectF rectF, RectF rectF2, AbstractC59633b bVar, AbstractC59634c cVar) {
        this.f148003b = rectF;
        this.f148002a = rectF2;
        this.f148010i = bVar;
        this.f148011j = cVar;
        this.f148007f = false;
        this.f148008g = rectF.width() * 2.5f;
        this.f148009h = this.f148003b.width() * 0.4f;
        m231283b();
        m231281a();
    }
}
