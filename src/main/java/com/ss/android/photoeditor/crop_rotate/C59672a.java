package com.ss.android.photoeditor.crop_rotate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.C59615b;
import com.ss.android.photoeditor.base.C59653n;
import com.ss.android.photoeditor.base.C59655o;
import com.ss.android.photoeditor.p3010b.C59610b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.photoeditor.crop_rotate.a */
public class C59672a {

    /* renamed from: a */
    public RectF f148114a;

    /* renamed from: b */
    public C59703d f148115b;

    /* renamed from: c */
    public AbstractC59681b f148116c;

    /* renamed from: d */
    public AbstractC59683d f148117d;

    /* renamed from: e */
    public C59615b f148118e;

    /* renamed from: f */
    public boolean f148119f;

    /* renamed from: g */
    public float f148120g;

    /* renamed from: h */
    public float f148121h;

    /* renamed from: i */
    private RectF f148122i;

    /* renamed from: j */
    private PointF f148123j;

    /* renamed from: k */
    private AbstractC59684e f148124k;

    /* renamed from: l */
    private C59653n f148125l;

    /* renamed from: m */
    private AbstractC59680a f148126m;

    /* renamed from: n */
    private boolean f148127n;

    /* renamed from: o */
    private AbstractC59680a f148128o = new AbstractC59680a() {
        /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596731 */

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public int mo203247a() {
            return 2;
        }

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public void mo203248a(MotionEvent motionEvent) {
            C59672a.this.mo203242a(motionEvent);
        }
    };

    /* renamed from: p */
    private AbstractC59680a f148129p = new AbstractC59680a() {
        /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596742 */

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public int mo203247a() {
            return 1;
        }

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public void mo203248a(MotionEvent motionEvent) {
            C59672a aVar = C59672a.this;
            aVar.mo203243a(motionEvent, aVar.f148114a);
        }
    };

    /* renamed from: q */
    private AbstractC59680a f148130q = new AbstractC59680a() {
        /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596753 */

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public int mo203247a() {
            return 0;
        }

        @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59680a
        /* renamed from: a */
        public void mo203248a(MotionEvent motionEvent) {
            C59672a.this.f148117d.mo203227b(motionEvent);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.a$a */
    public interface AbstractC59680a {
        /* renamed from: a */
        int mo203247a();

        /* renamed from: a */
        void mo203248a(MotionEvent motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.a$b */
    public interface AbstractC59681b {
        /* renamed from: a */
        void mo203219a();

        /* renamed from: a */
        void mo203220a(RectF rectF, int i);

        /* renamed from: a */
        void mo203221a(RectF rectF, RectF rectF2, int i, float f);

        /* renamed from: a */
        void mo203222a(C59703d dVar);

        /* renamed from: b */
        void mo203223b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.a$d */
    public interface AbstractC59683d {
        /* renamed from: a */
        boolean mo203226a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo203227b(MotionEvent motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.a$e */
    public interface AbstractC59684e {
        /* renamed from: a */
        RectF mo203224a();

        /* renamed from: b */
        RectF mo203225b();
    }

    /* renamed from: a */
    private AnimatorListenerAdapter m231428a() {
        return new AnimatorListenerAdapter() {
            /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596797 */

            public void onAnimationStart(Animator animator) {
                C59672a.this.f148119f = false;
            }

            public void onAnimationEnd(Animator animator) {
                C59672a.this.f148119f = true;
                C59672a.this.f148116c.mo203219a();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C59672a mo203239a(C59703d dVar) {
        this.f148115b.mo203290a(dVar);
        return this;
    }

    /* renamed from: b */
    private ValueAnimator.AnimatorUpdateListener m231430b(C59682c cVar) {
        final PointF pointF = cVar.f148145c;
        final RectF rectF = cVar.f148143a;
        final RectF rectF2 = cVar.f148144b;
        final C59703d dVar = cVar.f148146d;
        final C59703d dVar2 = new C59703d(dVar);
        return new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596786 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C59672a.this.f148116c.mo203221a(rectF, rectF2, -90, valueAnimator.getAnimatedFraction());
                float width = (((rectF2.width() - rectF.height()) * valueAnimator.getAnimatedFraction()) / rectF.height()) + 1.0f;
                dVar.mo203290a(dVar2);
                dVar.mo203284a(width, width, pointF.x, pointF.y).mo203286a(intValue, pointF);
                C59672a.this.f148116c.mo203222a(dVar);
            }
        };
    }

    /* renamed from: a */
    private void m231429a(C59682c cVar) {
        ValueAnimator duration = ValueAnimator.ofInt((int) ((float) cVar.f148147e), (int) ((float) cVar.f148148f)).setDuration(300L);
        duration.addUpdateListener(m231430b(cVar));
        duration.addListener(m231428a());
        duration.start();
    }

    /* renamed from: c */
    private AbstractC59680a m231431c(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            if (this.f148117d.mo203226a(motionEvent)) {
                return this.f148130q;
            }
            return this.f148129p;
        } else if (motionEvent.getPointerCount() == 2) {
            return this.f148128o;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203240a(PointF pointF) {
        Log.m165379d("ActionHelper", "rotate = " + this.f148119f);
        if (this.f148119f && !this.f148127n) {
            C59610b.m231213a(this.f148122i, -90, pointF.x, pointF.y);
            mo203246c(this.f148122i, this.f148124k.mo203225b());
            RectF a = this.f148124k.mo203224a();
            this.f148116c.mo203220a(this.f148122i, -90);
            m231429a(new C59682c(a, this.f148124k.mo203224a(), this.f148115b, pointF, 0, -90));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203242a(MotionEvent motionEvent) {
        this.f148125l.mo203184a(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo203245b(MotionEvent motionEvent) {
        if (this.f148119f) {
            AbstractC59680a aVar = this.f148126m;
            if (aVar == null) {
                AbstractC59680a c = m231431c(motionEvent);
                this.f148126m = c;
                if (c != null) {
                    c.mo203248a(motionEvent);
                }
            } else {
                if (aVar.mo203247a() == 1 && motionEvent.getPointerCount() == 2) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    this.f148126m.mo203248a(obtain);
                    obtain.recycle();
                    AbstractC59680a aVar2 = this.f148128o;
                    this.f148126m = aVar2;
                    aVar2.mo203248a(motionEvent);
                } else {
                    this.f148126m.mo203248a(motionEvent);
                }
                if (motionEvent.getAction() == 1) {
                    this.f148126m = null;
                }
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f148127n = false;
            } else {
                this.f148127n = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203241a(RectF rectF, RectF rectF2) {
        this.f148118e.mo203066b(rectF, rectF2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C59703d mo203244b(RectF rectF, RectF rectF2) {
        float round = ((float) Math.round((rectF2.width() / rectF.width()) * 1000.0f)) / 1000.0f;
        float round2 = ((float) Math.round((rectF2.height() / rectF.height()) * 1000.0f)) / 1000.0f;
        this.f148115b.mo203284a(round, round2, rectF.centerX(), rectF.centerY());
        RectF rectF3 = new RectF(rectF);
        C59610b.m231212a(rectF3, rectF3.centerX(), rectF3.centerY(), round, round2);
        this.f148115b.mo203283a(rectF2.centerX() - rectF3.centerX(), rectF2.centerY() - rectF3.centerY());
        return this.f148115b;
    }

    /* renamed from: c */
    public RectF mo203246c(RectF rectF, RectF rectF2) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float min = Math.min(rectF2.height() / rectF.height(), rectF2.width() / rectF.width());
        rectF.left = (float) ((int) (((rectF.left - centerX) * min) + centerX));
        rectF.right = (float) ((int) (((rectF.right - centerX) * min) + centerX));
        rectF.top = (float) ((int) (((rectF.top - centerY) * min) + centerY));
        rectF.bottom = (float) ((int) (((rectF.bottom - centerY) * min) + centerY));
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203243a(MotionEvent motionEvent, RectF rectF) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f148123j = new PointF(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            Log.m165379d("ActionHelper", "handleSingleTouchEvent ACTION_UP");
            if (!this.f148118e.mo203065a(this.f148115b.mo203300j(), this.f148114a)) {
                this.f148116c.mo203219a();
            }
        } else if (action == 2) {
            if (this.f148123j == null) {
                this.f148123j = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            float x = motionEvent.getX() - this.f148123j.x;
            float y = motionEvent.getY() - this.f148123j.y;
            this.f148123j.set(motionEvent.getX(), motionEvent.getY());
            this.f148116c.mo203222a(this.f148115b.mo203283a(x, y));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.a$c */
    public static class C59682c {

        /* renamed from: a */
        final RectF f148143a;

        /* renamed from: b */
        final RectF f148144b;

        /* renamed from: c */
        final PointF f148145c;

        /* renamed from: d */
        final C59703d f148146d;

        /* renamed from: e */
        final int f148147e;

        /* renamed from: f */
        final int f148148f;

        C59682c(RectF rectF, RectF rectF2, C59703d dVar, PointF pointF, int i, int i2) {
            this.f148143a = rectF;
            this.f148144b = rectF2;
            this.f148146d = dVar;
            this.f148147e = i;
            this.f148148f = i2;
            this.f148145c = pointF;
        }
    }

    C59672a(RectF rectF, C59703d dVar, RectF rectF2, AbstractC59681b bVar, AbstractC59684e eVar, AbstractC59683d dVar2) {
        this.f148116c = bVar;
        this.f148122i = rectF;
        this.f148115b = dVar;
        this.f148124k = eVar;
        this.f148117d = dVar2;
        this.f148114a = rectF2;
        this.f148120g = dVar.mo203293c() * 0.4f;
        this.f148121h = dVar.mo203293c() * 2.5f;
        this.f148119f = true;
        this.f148118e = new C59615b(new C59615b.AbstractC59618a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596764 */

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: b */
            public void mo203073b() {
                C59672a.this.f148119f = true;
                C59672a.this.f148116c.mo203219a();
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: c */
            public void mo203074c() {
                C59672a.this.f148119f = true;
                C59672a.this.f148116c.mo203223b();
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: a */
            public void mo203071a() {
                Log.m165379d("ActionHelper", "onLocationChangeStart" + C59672a.this.f148119f);
                C59672a.this.f148119f = false;
            }

            @Override // com.ss.android.photoeditor.base.C59615b.AbstractC59618a
            /* renamed from: a */
            public void mo203072a(RectF rectF) {
                C59672a.this.f148115b.mo203288a(rectF);
                C59672a.this.f148116c.mo203222a(C59672a.this.f148115b);
            }
        });
        this.f148125l = new C59653n(new C59653n.AbstractC59654a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59672a.C596775 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.photoeditor.base.C59653n.AbstractC59654a
            /* renamed from: b */
            public void mo203135b() {
                if (!C59672a.this.f148118e.mo203065a(C59672a.this.f148115b.mo203300j(), C59672a.this.f148114a)) {
                    C59672a.this.f148116c.mo203219a();
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.photoeditor.base.C59653n.AbstractC59654a
            /* renamed from: a */
            public void mo203134a(PointF pointF, float f, float f2, float f3) {
                if (pointF != null) {
                    float a = C59655o.m231378a(f, C59672a.this.f148121h, C59672a.this.f148120g, C59672a.this.f148115b.mo203293c());
                    C59672a.this.f148115b.mo203284a(a, a, pointF.x, pointF.y);
                }
                C59672a.this.f148115b.mo203283a(f2, f3);
                C59672a.this.f148116c.mo203222a(C59672a.this.f148115b);
            }
        });
    }
}
