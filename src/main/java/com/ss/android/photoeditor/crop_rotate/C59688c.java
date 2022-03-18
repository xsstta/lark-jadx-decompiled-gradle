package com.ss.android.photoeditor.crop_rotate;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.p3010b.C59609a;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59613d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.photoeditor.crop_rotate.c */
public class C59688c {

    /* renamed from: a */
    public static final int f148158a = C59613d.m231216a(90);

    /* renamed from: g */
    private static final int f148159g = C59613d.m231216a(4);

    /* renamed from: h */
    private static final int f148160h = C59613d.m231216a(40);

    /* renamed from: i */
    private static final int f148161i = C59613d.m231216a(20);

    /* renamed from: A */
    private Bitmap f148162A;

    /* renamed from: B */
    private Canvas f148163B;

    /* renamed from: C */
    private float f148164C;

    /* renamed from: D */
    private float f148165D;

    /* renamed from: E */
    private RectF f148166E = new RectF(this.f148167b);

    /* renamed from: b */
    public RectF f148167b;

    /* renamed from: c */
    public AbstractC59702e f148168c;

    /* renamed from: d */
    public AbstractC59700c f148169d;

    /* renamed from: e */
    public AbstractC59701d f148170e;

    /* renamed from: f */
    public boolean f148171f;

    /* renamed from: j */
    private int f148172j;

    /* renamed from: k */
    private AbstractC59698a f148173k;

    /* renamed from: l */
    private RectF f148174l;

    /* renamed from: m */
    private RectF f148175m;

    /* renamed from: n */
    private RectF f148176n;

    /* renamed from: o */
    private RectF f148177o;

    /* renamed from: p */
    private RectF f148178p;

    /* renamed from: q */
    private RectF f148179q;

    /* renamed from: r */
    private RectF f148180r;

    /* renamed from: s */
    private RectF f148181s;

    /* renamed from: t */
    private C59703d f148182t;

    /* renamed from: u */
    private RectF f148183u;

    /* renamed from: v */
    private RectF f148184v;

    /* renamed from: w */
    private AbstractC59699b f148185w;

    /* renamed from: x */
    private Paint f148186x;

    /* renamed from: y */
    private Paint f148187y;

    /* renamed from: z */
    private boolean f148188z;

    /* renamed from: com.ss.android.photoeditor.crop_rotate.c$a */
    public interface AbstractC59698a {
        /* renamed from: a */
        void mo203270a();

        /* renamed from: a */
        void mo203271a(float f, float f2);

        /* renamed from: a */
        void mo203272a(RectF rectF);
    }

    /* renamed from: com.ss.android.photoeditor.crop_rotate.c$b */
    public interface AbstractC59699b {
        /* renamed from: a */
        C59703d mo203236a();
    }

    /* renamed from: com.ss.android.photoeditor.crop_rotate.c$c */
    public interface AbstractC59700c {
        /* renamed from: a */
        void mo203231a(RectF rectF);
    }

    /* renamed from: com.ss.android.photoeditor.crop_rotate.c$d */
    public interface AbstractC59701d {
        /* renamed from: a */
        void mo203232a();

        /* renamed from: a */
        void mo203233a(float f, RectF rectF);

        /* renamed from: a */
        void mo203234a(RectF rectF);

        /* renamed from: b */
        void mo203235b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.c$e */
    public interface AbstractC59702e {
        /* renamed from: a */
        int mo203228a();

        /* renamed from: b */
        int mo203229b();

        /* renamed from: c */
        void mo203230c();
    }

    /* renamed from: a */
    public void mo203259a(Canvas canvas) {
        canvas.save();
        this.f148163B.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f148186x.setAntiAlias(true);
        this.f148186x.setColor(-1);
        this.f148186x.setStyle(Paint.Style.STROKE);
        this.f148186x.setStrokeWidth((float) C59613d.m231216a(2));
        this.f148186x.setShadowLayer((float) C59613d.m231216a(2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Color.parseColor("#99000000"));
        if (this.f148188z) {
            this.f148163B.drawRect(this.f148184v, this.f148186x);
            m231475b(this.f148163B, this.f148184v);
            m231469a(this.f148163B, this.f148184v);
            canvas.rotate(this.f148164C, this.f148167b.centerX(), this.f148167b.centerY());
        } else {
            this.f148163B.drawRect(this.f148167b, this.f148186x);
            m231469a(this.f148163B, this.f148167b);
            m231475b(this.f148163B, this.f148167b);
        }
        canvas.drawBitmap(this.f148162A, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo203263a(MotionEvent motionEvent) {
        AbstractC59698a aVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float b = m231473b(x);
        float a = m231468a(y);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f148166E = new RectF(this.f148167b);
            this.f148172j = m231476c(b, a);
            this.f148173k = m231474b(b, a);
        } else if (action == 1) {
            this.f148172j = 0;
            if (!m231478d()) {
                AbstractC59698a aVar2 = this.f148173k;
                if (aVar2 != null) {
                    aVar2.mo203272a(this.f148166E);
                }
            } else {
                this.f148169d.mo203231a(this.f148167b);
                AbstractC59698a aVar3 = this.f148173k;
                if (aVar3 != null) {
                    aVar3.mo203270a();
                }
            }
        } else if (action == 2 && (aVar = this.f148173k) != null) {
            aVar.mo203271a(b, a);
        }
        this.f148168c.mo203230c();
    }

    /* renamed from: a */
    public boolean mo203264a(float f, float f2) {
        if (!this.f148174l.contains(f, f2) && !this.f148175m.contains(f, f2) && !this.f148176n.contains(f, f2) && !this.f148177o.contains(f, f2) && !this.f148178p.contains(f, f2) && !this.f148179q.contains(f, f2) && !this.f148180r.contains(f, f2) && !this.f148181s.contains(f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo203262a(RectF rectF, RectF rectF2, float f, float f2) {
        this.f148184v = new RectF(rectF);
        this.f148188z = true;
        this.f148164C = (f * f2) + this.f148165D;
        RectF rectF3 = new RectF(rectF);
        m231470a(rectF3, rectF.centerX(), rectF.centerY(), (((rectF2.width() - rectF.height()) * f2) / rectF.height()) + 1.0f);
        this.f148184v = rectF3;
        if (f2 == 1.0f) {
            this.f148188z = false;
        }
    }

    /* renamed from: a */
    public void mo203261a(RectF rectF) {
        final RectF rectF2 = new RectF();
        final RectF rectF3 = new RectF(this.f148167b);
        final RectF rectF4 = new RectF(rectF);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596891 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C59688c.this.f148171f) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    rectF2.left = ((rectF4.left - rectF3.left) * animatedFraction) + rectF3.left;
                    rectF2.right = ((rectF4.right - rectF3.right) * animatedFraction) + rectF3.right;
                    rectF2.top = ((rectF4.top - rectF3.top) * animatedFraction) + rectF3.top;
                    rectF2.bottom = ((rectF4.bottom - rectF3.bottom) * animatedFraction) + rectF3.bottom;
                    C59688c.this.f148167b.set(rectF2);
                    C59688c.this.mo203257a();
                    C59688c.this.f148169d.mo203231a(C59688c.this.f148167b);
                    C59688c.this.f148168c.mo203230c();
                }
            }
        });
        duration.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596935 */

            public void onAnimationCancel(Animator animator) {
                C59688c.this.f148171f = false;
            }

            public void onAnimationEnd(Animator animator) {
                C59688c.this.f148171f = false;
            }

            public void onAnimationRepeat(Animator animator) {
                C59688c.this.f148171f = true;
            }

            public void onAnimationStart(Animator animator) {
                C59688c.this.f148171f = true;
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public void mo203260a(PointF pointF, float f, float f2, float f3) {
        double d = (double) (f3 * 0.017453292f);
        pointF.x = (float) (((((double) (pointF.x - f)) * Math.cos(d)) - (((double) (pointF.y - f2)) * Math.sin(d))) + ((double) f));
        pointF.y = (float) ((((double) (pointF.x - f)) * Math.sin(d)) + (((double) (pointF.y - f2)) * Math.cos(d)) + ((double) f2));
    }

    /* renamed from: f */
    private AbstractC59698a m231480f() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596968 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                boolean z;
                boolean z2 = true;
                if (C59688c.this.f148167b.right - f > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.left = f;
                    z = true;
                } else {
                    z = false;
                }
                if (C59688c.this.f148167b.bottom - f2 > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.top = f2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: g */
    private AbstractC59698a m231481g() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596979 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                boolean z;
                boolean z2 = true;
                if (f - C59688c.this.f148167b.left > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.right = f;
                    z = true;
                } else {
                    z = false;
                }
                if (C59688c.this.f148167b.bottom - f2 > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.top = f2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: h */
    private AbstractC59698a m231482h() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.AnonymousClass10 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                boolean z;
                boolean z2 = true;
                if (C59688c.this.f148167b.right - f > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.left = f;
                    z = true;
                } else {
                    z = false;
                }
                if (f2 - C59688c.this.f148167b.top > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.bottom = f2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: i */
    private AbstractC59698a m231483i() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.AnonymousClass11 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                boolean z;
                boolean z2 = true;
                if (f - C59688c.this.f148167b.left > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.right = f;
                    z = true;
                } else {
                    z = false;
                }
                if (f2 - C59688c.this.f148167b.top > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.bottom = f2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: j */
    private AbstractC59698a m231484j() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.AnonymousClass12 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                if (C59688c.this.f148167b.bottom - f2 > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.top = f2;
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: k */
    private AbstractC59698a m231485k() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596902 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                if (f2 - C59688c.this.f148167b.top > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.bottom = f2;
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: l */
    private AbstractC59698a m231486l() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596913 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                if (C59688c.this.f148167b.right - f > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.left = f;
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: m */
    private AbstractC59698a m231487m() {
        return new AbstractC59698a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596924 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203270a() {
                C59688c.this.mo203265b();
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203272a(RectF rectF) {
                C59688c.this.mo203261a(rectF);
            }

            @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59698a
            /* renamed from: a */
            public void mo203271a(float f, float f2) {
                if (f - C59688c.this.f148167b.left > ((float) C59688c.f148158a)) {
                    C59688c.this.f148167b.right = f;
                    C59688c.this.mo203257a();
                }
            }
        };
    }

    /* renamed from: c */
    public RectF mo203267c() {
        return new RectF(this.f148167b);
    }

    /* renamed from: b */
    public void mo203265b() {
        m231472a(new RectF(this.f148167b), m231479e(), LocationRequest.PRIORITY_HD_ACCURACY);
    }

    /* renamed from: e */
    private RectF m231479e() {
        float width = this.f148167b.width() / this.f148167b.height();
        float width2 = this.f148183u.width();
        float height = this.f148183u.height();
        PointF pointF = new PointF(this.f148183u.centerX(), this.f148183u.centerY());
        if (width > width2 / height) {
            height = width2 / width;
        } else {
            width2 = height * width;
        }
        RectF rectF = new RectF();
        float f = width2 / 2.0f;
        rectF.left = pointF.x - f;
        rectF.right = pointF.x + f;
        float f2 = height / 2.0f;
        rectF.top = pointF.y - f2;
        rectF.bottom = pointF.y + f2;
        return rectF;
    }

    /* renamed from: d */
    private boolean m231478d() {
        RectF e = m231479e();
        RectF rectF = new RectF(this.f148167b);
        if (C59609a.m231204a(e.width(), rectF.width()) || C59609a.m231204a(e.height(), rectF.height()) || Math.max(this.f148185w.mo203236a().mo203293c() / this.f148183u.width(), this.f148185w.mo203236a().mo203294d() / this.f148183u.height()) < 3.0f) {
            return true;
        }
        if (this.f148167b.width() < this.f148166E.width() || this.f148167b.height() < this.f148166E.height()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo203257a() {
        if (this.f148174l == null) {
            this.f148174l = new RectF();
        }
        RectF rectF = this.f148174l;
        float f = this.f148167b.left;
        int i = f148161i;
        rectF.set(f - ((float) i), this.f148167b.top - ((float) i), this.f148167b.left + ((float) i), this.f148167b.top + ((float) i));
        if (this.f148175m == null) {
            this.f148175m = new RectF();
        }
        this.f148175m.set(this.f148167b.right - ((float) i), this.f148167b.top - ((float) i), this.f148167b.right + ((float) i), this.f148167b.top + ((float) i));
        if (this.f148176n == null) {
            this.f148176n = new RectF();
        }
        this.f148176n.set(this.f148167b.left - ((float) i), this.f148167b.bottom - ((float) i), this.f148167b.left + ((float) i), this.f148167b.bottom + ((float) i));
        if (this.f148177o == null) {
            this.f148177o = new RectF();
        }
        this.f148177o.set(this.f148167b.right - ((float) i), this.f148167b.bottom - ((float) i), this.f148167b.right + ((float) i), this.f148167b.bottom + ((float) i));
        if (this.f148178p == null) {
            this.f148178p = new RectF();
        }
        this.f148178p.set(this.f148167b.left + ((float) i), this.f148167b.top - ((float) i), this.f148167b.right - ((float) i), this.f148167b.top + ((float) i));
        if (this.f148179q == null) {
            this.f148179q = new RectF();
        }
        this.f148179q.set(this.f148167b.left - ((float) i), this.f148167b.top + ((float) i), this.f148167b.left + ((float) i), this.f148167b.bottom - ((float) i));
        if (this.f148180r == null) {
            this.f148180r = new RectF();
        }
        this.f148180r.set(this.f148167b.left + ((float) i), this.f148167b.bottom - ((float) i), this.f148167b.right - ((float) i), this.f148167b.bottom + ((float) i));
        if (this.f148181s == null) {
            this.f148181s = new RectF();
        }
        this.f148181s.set(this.f148167b.right - ((float) i), this.f148167b.top + ((float) i), this.f148167b.right + ((float) i), this.f148167b.bottom - ((float) i));
    }

    /* renamed from: c */
    public RectF mo203268c(RectF rectF) {
        m231477d(rectF);
        return rectF;
    }

    /* renamed from: a */
    private float m231468a(float f) {
        float min = Math.min(this.f148182t.mo203295e(), (float) this.f148168c.mo203229b());
        float max = Math.max(this.f148182t.mo203296f(), (float) BitmapDescriptorFactory.HUE_RED);
        if (f > min) {
            return min;
        }
        return f < max ? max : f;
    }

    /* renamed from: b */
    private float m231473b(float f) {
        float min = Math.min(this.f148182t.mo203298h(), (float) this.f148168c.mo203228a());
        float max = Math.max(this.f148182t.mo203297g(), (float) BitmapDescriptorFactory.HUE_RED);
        if (f > min) {
            return min;
        }
        return f < max ? max : f;
    }

    /* renamed from: d */
    private void m231477d(RectF rectF) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float min = Math.min(this.f148183u.height() / rectF.height(), this.f148183u.width() / rectF.width());
        rectF.left = (float) ((int) (((rectF.left - centerX) * min) + centerX));
        rectF.right = (float) ((int) (((rectF.right - centerX) * min) + centerX));
        rectF.top = (float) ((int) (((rectF.top - centerY) * min) + centerY));
        rectF.bottom = (float) ((int) (((rectF.bottom - centerY) * min) + centerY));
    }

    /* renamed from: b */
    public void mo203266b(RectF rectF) {
        this.f148167b.set(rectF);
        this.f148167b.offset(this.f148183u.centerX() - this.f148167b.centerX(), this.f148183u.centerY() - this.f148167b.centerY());
        mo203257a();
    }

    /* renamed from: a */
    public void mo203258a(int i) {
        RectF rectF = new RectF(this.f148167b);
        m231471a(rectF, i, rectF.centerX(), rectF.centerY());
        this.f148167b.set(rectF);
        m231477d(this.f148167b);
        this.f148169d.mo203231a(this.f148167b);
        mo203257a();
    }

    /* renamed from: a */
    private void m231469a(Canvas canvas, RectF rectF) {
        float f = rectF.bottom - rectF.top;
        float f2 = rectF.right - rectF.left;
        float f3 = f / 3.0f;
        canvas.drawLine(rectF.left, rectF.top + f3, rectF.right, rectF.top + f3, this.f148187y);
        float f4 = f3 * 2.0f;
        canvas.drawLine(rectF.left, rectF.top + f4, rectF.right, rectF.top + f4, this.f148187y);
        float f5 = f2 / 3.0f;
        canvas.drawLine(rectF.left + f5, rectF.top, rectF.left + f5, rectF.bottom, this.f148187y);
        float f6 = f5 * 2.0f;
        canvas.drawLine(rectF.left + f6, rectF.top, rectF.left + f6, rectF.bottom, this.f148187y);
    }

    /* renamed from: b */
    private AbstractC59698a m231474b(float f, float f2) {
        if (this.f148174l.contains(f, f2)) {
            return m231480f();
        }
        if (this.f148175m.contains(f, f2)) {
            return m231481g();
        }
        if (this.f148176n.contains(f, f2)) {
            return m231482h();
        }
        if (this.f148177o.contains(f, f2)) {
            return m231483i();
        }
        if (this.f148178p.contains(f, f2)) {
            return m231484j();
        }
        if (this.f148179q.contains(f, f2)) {
            return m231486l();
        }
        if (this.f148180r.contains(f, f2)) {
            return m231485k();
        }
        if (this.f148181s.contains(f, f2)) {
            return m231487m();
        }
        return null;
    }

    /* renamed from: c */
    private int m231476c(float f, float f2) {
        if (this.f148174l.contains(f, f2)) {
            return 1;
        }
        if (this.f148175m.contains(f, f2)) {
            return 2;
        }
        if (this.f148176n.contains(f, f2)) {
            return 3;
        }
        if (this.f148177o.contains(f, f2)) {
            return 4;
        }
        if (this.f148178p.contains(f, f2)) {
            return 5;
        }
        if (this.f148179q.contains(f, f2)) {
            return 6;
        }
        if (this.f148180r.contains(f, f2)) {
            return 7;
        }
        if (this.f148181s.contains(f, f2)) {
            return 8;
        }
        return 0;
    }

    /* renamed from: b */
    private void m231475b(Canvas canvas, RectF rectF) {
        this.f148186x.setStyle(Paint.Style.FILL);
        this.f148186x.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        float f = rectF.left;
        int i = f148159g;
        float f2 = f - ((float) i);
        float f3 = rectF.top - ((float) i);
        int i2 = f148160h;
        canvas.drawRect(new RectF(f2, f3, ((float) i2) + f2, ((float) i) + f3), this.f148186x);
        canvas.drawRect(new RectF(f2, f3, ((float) i) + f2, ((float) i2) + f3), this.f148186x);
        float f4 = rectF.right - ((float) (i2 - i));
        float f5 = rectF.top - ((float) i);
        canvas.drawRect(new RectF(f4, f5, ((float) i2) + f4, ((float) i) + f5), this.f148186x);
        canvas.drawRect(new RectF(((float) (i2 - i)) + f4, f5, f4 + ((float) i2), ((float) i2) + f5), this.f148186x);
        float f6 = rectF.left - ((float) i);
        float f7 = rectF.bottom - ((float) (i2 - i));
        canvas.drawRect(new RectF(f6, f7, ((float) i) + f6, ((float) i2) + f7), this.f148186x);
        canvas.drawRect(new RectF(f6, ((float) (i2 - i)) + f7, ((float) i2) + f6, f7 + ((float) i2)), this.f148186x);
        float f8 = rectF.right;
        float f9 = rectF.bottom - ((float) (i2 - i));
        canvas.drawRect(new RectF(f8, f9, ((float) i) + f8, ((float) i2) + f9), this.f148186x);
        canvas.drawRect(new RectF(f8 - ((float) (i2 - i)), ((float) (i2 - i)) + f9, f8 + ((float) i), f9 + ((float) i2)), this.f148186x);
    }

    /* renamed from: a */
    private void m231472a(final RectF rectF, final RectF rectF2, int i) {
        final RectF rectF3 = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration((long) i);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596946 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C59688c.this.f148171f) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    rectF3.left = ((rectF2.left - rectF.left) * animatedFraction) + rectF.left;
                    rectF3.right = ((rectF2.right - rectF.right) * animatedFraction) + rectF.right;
                    rectF3.top = ((rectF2.top - rectF.top) * animatedFraction) + rectF.top;
                    rectF3.bottom = ((rectF2.bottom - rectF.bottom) * animatedFraction) + rectF.bottom;
                    C59688c.this.f148167b.set(rectF3);
                    C59688c.this.mo203257a();
                    Log.m165389i("PhotoClipRect", "onAnimationUpdate, temp = " + rectF3);
                    C59688c.this.f148170e.mo203233a(animatedFraction, rectF3);
                    C59688c.this.f148169d.mo203231a(C59688c.this.f148167b);
                }
            }
        });
        duration.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.photoeditor.crop_rotate.C59688c.C596957 */

            public void onAnimationRepeat(Animator animator) {
                C59688c.this.f148171f = true;
            }

            public void onAnimationCancel(Animator animator) {
                C59688c.this.f148171f = false;
                C59688c.this.f148170e.mo203235b();
            }

            public void onAnimationEnd(Animator animator) {
                C59688c.this.f148171f = false;
                C59688c.this.f148170e.mo203232a();
            }

            public void onAnimationStart(Animator animator) {
                Log.m165389i("PhotoClipRect", "onAnimationStart, clipRectRegion = " + C59688c.this.f148167b);
                C59688c.this.f148170e.mo203234a(C59688c.this.f148167b);
                C59688c.this.f148171f = true;
            }
        });
        duration.start();
    }

    /* renamed from: a */
    private void m231470a(RectF rectF, float f, float f2, float f3) {
        rectF.left = ((rectF.left - f) * f3) + f;
        rectF.right = ((rectF.right - f) * f3) + f;
        rectF.top = ((rectF.top - f2) * f3) + f2;
        rectF.bottom = ((rectF.bottom - f2) * f3) + f2;
    }

    /* renamed from: a */
    private void m231471a(RectF rectF, int i, float f, float f2) {
        PointF pointF = new PointF(rectF.left, rectF.top);
        PointF pointF2 = new PointF(rectF.right, rectF.top);
        PointF pointF3 = new PointF(rectF.left, rectF.bottom);
        PointF pointF4 = new PointF(rectF.right, rectF.bottom);
        float f3 = (float) i;
        mo203260a(pointF, f, f2, f3);
        mo203260a(pointF2, f, f2, f3);
        mo203260a(pointF3, f, f2, f3);
        mo203260a(pointF4, f, f2, f3);
        rectF.set(C59610b.m231207a(pointF, pointF2, pointF3, pointF4));
    }

    public C59688c(RectF rectF, C59703d dVar, AbstractC59702e eVar, AbstractC59700c cVar, AbstractC59701d dVar2, AbstractC59699b bVar) {
        int i;
        this.f148168c = eVar;
        this.f148167b = new RectF(rectF);
        this.f148183u = rectF;
        this.f148169d = cVar;
        this.f148170e = dVar2;
        this.f148185w = bVar;
        this.f148182t = dVar;
        this.f148186x = new Paint();
        Paint paint = new Paint();
        this.f148187y = paint;
        paint.setColor(Color.parseColor("#99FFFFFF"));
        int i2 = 1;
        this.f148187y.setAntiAlias(true);
        this.f148187y.setStrokeWidth((float) C59613d.m231216a(1));
        this.f148187y.setPathEffect(new DashPathEffect(new float[]{4.0f, 4.0f}, BitmapDescriptorFactory.HUE_RED));
        if (this.f148168c.mo203228a() <= 0) {
            i = 1;
        } else {
            i = this.f148168c.mo203228a();
        }
        this.f148162A = Bitmap.createBitmap(i, this.f148168c.mo203229b() > 0 ? this.f148168c.mo203229b() : i2, Bitmap.Config.ARGB_8888);
        this.f148163B = new Canvas(this.f148162A);
        mo203257a();
    }
}
