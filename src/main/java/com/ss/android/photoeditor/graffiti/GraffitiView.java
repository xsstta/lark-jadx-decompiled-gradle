package com.ss.android.photoeditor.graffiti;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.base.C59627f;
import com.ss.android.photoeditor.graffiti.C59718a;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59611c;

public class GraffitiView extends AppCompatImageView {

    /* renamed from: a */
    Runnable f148226a;

    /* renamed from: b */
    RectF f148227b;

    /* renamed from: c */
    boolean f148228c;

    /* renamed from: d */
    public Bitmap f148229d;

    /* renamed from: e */
    public RectF f148230e;

    /* renamed from: f */
    public C59718a f148231f;

    /* renamed from: g */
    public boolean f148232g;

    /* renamed from: h */
    private Bitmap f148233h;

    /* renamed from: i */
    private RectF f148234i;

    /* renamed from: j */
    private float[] f148235j;

    /* renamed from: k */
    private Matrix f148236k;

    /* renamed from: l */
    private int f148237l;

    /* renamed from: m */
    private int f148238m;

    /* renamed from: n */
    private C59627f f148239n;

    /* renamed from: o */
    private AbstractC59716a f148240o;

    /* renamed from: p */
    private C59622e.AbstractC59624a f148241p;

    /* renamed from: com.ss.android.photoeditor.graffiti.GraffitiView$a */
    interface AbstractC59716a {
        /* renamed from: a */
        void mo203305a(MotionEvent motionEvent);
    }

    public RectF getLocation() {
        return this.f148230e;
    }

    /* renamed from: i */
    private void m231575i() {
        C59718a aVar = this.f148231f;
        if (aVar != null) {
            aVar.mo203344c();
        }
    }

    /* renamed from: j */
    private void m231576j() {
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.RunnableC597157 */

            public void run() {
                int b = GraffitiView.this.f148231f.mo203342b();
                int a = GraffitiView.this.f148231f.mo203338a();
                GraffitiView.this.mo203318g();
                GraffitiView.this.mo203316e();
                GraffitiView.this.mo203315d();
                GraffitiView.this.f148231f.mo203340a(GraffitiView.this.f148229d);
                GraffitiView.this.setPaintSize(a);
                GraffitiView.this.setPaintColor(b);
            }
        });
    }

    /* renamed from: c */
    public void mo203314c() {
        this.f148241p = C59622e.m231233a().mo203097e();
    }

    /* renamed from: e */
    public void mo203316e() {
        this.f148230e = new RectF(this.f148234i);
    }

    /* renamed from: h */
    public void mo203320h() {
        C59610b.m231208a(this.f148233h);
        C59610b.m231208a(this.f148229d);
        m231575i();
    }

    /* renamed from: a */
    public void mo203310a() {
        RectF rectF = this.f148227b;
        if (rectF == null) {
            return;
        }
        if (!this.f148228c) {
            this.f148239n.mo203129a(new RectF(this.f148227b), this.f148234i);
            this.f148227b = null;
            return;
        }
        this.f148230e.set(rectF);
        this.f148227b = null;
    }

    /* renamed from: b */
    public void mo203313b() {
        if (C59622e.m231233a().mo203091a(this.f148241p)) {
            final int b = this.f148231f.mo203342b();
            final int a = this.f148231f.mo203338a();
            mo203312a(new Runnable() {
                /* class com.ss.android.photoeditor.graffiti.GraffitiView.RunnableC597102 */

                public void run() {
                    GraffitiView.this.setPaintColor(b);
                    GraffitiView.this.setPaintSize(a);
                }
            });
            return;
        }
        this.f148231f.mo203340a(this.f148233h);
        mo203310a();
    }

    /* renamed from: d */
    public void mo203315d() {
        this.f148231f = new C59718a(getContext(), this.f148234i, this.f148230e, new C59718a.AbstractC59720b() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.C597113 */

            @Override // com.ss.android.photoeditor.graffiti.C59718a.AbstractC59720b
            /* renamed from: a */
            public void mo203328a(Bitmap bitmap) {
                GraffitiView.this.f148229d = bitmap;
                Log.m165379d("onGraffitiLayerChanged", "object = " + GraffitiView.this.f148231f);
                GraffitiView.this.invalidate();
            }
        }, new C59718a.AbstractC59721c() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.C597124 */

            @Override // com.ss.android.photoeditor.graffiti.C59718a.AbstractC59721c
            /* renamed from: a */
            public int mo203329a() {
                return GraffitiView.this.getWidth();
            }

            @Override // com.ss.android.photoeditor.graffiti.C59718a.AbstractC59721c
            /* renamed from: b */
            public int mo203330b() {
                return GraffitiView.this.getHeight();
            }
        });
        this.f148239n = new C59627f(this.f148234i, this.f148230e, new C59627f.AbstractC59633b() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.C597135 */

            @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
            /* renamed from: a */
            public void mo203136a(RectF rectF) {
                GraffitiView.this.f148230e.set(rectF);
                GraffitiView.this.invalidate();
            }
        }, new C59627f.AbstractC59634c() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.C597146 */

            @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59634c
            /* renamed from: a */
            public void mo203139a(MotionEvent motionEvent) {
                HitPointHelper.f147964l.mo203043a(true);
                GraffitiView.this.f148231f.mo203341a(motionEvent);
            }
        });
    }

    /* renamed from: f */
    public void mo203317f() {
        C59622e.AbstractC59624a h = C59622e.m231233a().mo203100h();
        if (h != null) {
            C59622e.C59625b k = C59622e.m231233a().mo203103k();
            k.mo203122b(h);
            if (k.f147998d) {
                setImageBitmap(C59622e.m231233a().mo203099g());
                m231576j();
                return;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(C59622e.m231233a().mo203099g(), this.f148237l, this.f148238m, true);
            setImageBitmap(createScaledBitmap);
            this.f148231f.mo203340a(createScaledBitmap);
        }
    }

    /* renamed from: g */
    public void mo203318g() {
        this.f148234i = new RectF();
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float width = (float) getWidth();
        float height = (float) getHeight();
        Log.m165379d("GraffitiView", "imageRect imageWidth:viewWidth =" + intrinsicWidth + ":" + width);
        Matrix imageMatrix = getImageMatrix();
        float a = m231573a(imageMatrix, 0);
        float a2 = m231573a(imageMatrix, 4);
        int i = (int) (intrinsicWidth * a);
        this.f148237l = i;
        this.f148238m = (int) (((float) getDrawable().getIntrinsicHeight()) * a2);
        if (Math.abs(((float) i) - width) < 3.0f) {
            RectF rectF = this.f148234i;
            int i2 = this.f148238m;
            rectF.set(BitmapDescriptorFactory.HUE_RED, (float) ((int) ((height - ((float) i2)) / 2.0f)), (float) ((int) width), (float) ((int) (((height - ((float) i2)) / 2.0f) + ((float) i2))));
            return;
        }
        RectF rectF2 = this.f148234i;
        int i3 = this.f148237l;
        rectF2.set((float) ((int) ((width - ((float) i3)) / 2.0f)), BitmapDescriptorFactory.HUE_RED, (float) ((int) (((width - ((float) i3)) / 2.0f) + ((float) i3))), (float) ((int) height));
    }

    public void setMotionEventListener(AbstractC59716a aVar) {
        this.f148240o = aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f148233h = bitmap;
        this.f148229d = bitmap;
        super.setImageBitmap(bitmap);
    }

    public void setPaintSize(int i) {
        this.f148231f.mo203339a(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        m231574a(canvas);
    }

    public void setPaintColor(int i) {
        if (this.f148231f == null) {
            mo203315d();
        }
        this.f148231f.mo203343b(i);
    }

    public GraffitiView(Context context) {
        super(context);
        this.f148235j = new float[9];
        this.f148236k = new Matrix();
    }

    /* renamed from: a */
    private void m231574a(Canvas canvas) {
        Bitmap bitmap = this.f148229d;
        if (bitmap != null) {
            C59610b.m231209a(this.f148236k, bitmap, this.f148230e);
            canvas.drawBitmap(this.f148229d, this.f148236k, null);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148232g) {
            return true;
        }
        this.f148239n.mo203130a(motionEvent);
        AbstractC59716a aVar = this.f148240o;
        if (aVar == null) {
            return true;
        }
        aVar.mo203305a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public void mo203312a(final Runnable runnable) {
        this.f148226a = runnable;
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.graffiti.GraffitiView.RunnableC597091 */

            public void run() {
                GraffitiView.this.mo203318g();
                GraffitiView.this.mo203316e();
                GraffitiView.this.mo203315d();
                GraffitiView.this.f148231f.mo203340a(GraffitiView.this.f148229d);
                GraffitiView.this.f148232g = true;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                GraffitiView.this.mo203310a();
            }
        });
    }

    /* renamed from: a */
    public void mo203311a(RectF rectF, boolean z) {
        this.f148227b = rectF;
        this.f148228c = z;
    }

    /* renamed from: a */
    private float m231573a(Matrix matrix, int i) {
        matrix.getValues(this.f148235j);
        return this.f148235j[i];
    }

    public GraffitiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148235j = new float[9];
        this.f148236k = new Matrix();
    }

    public GraffitiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f148235j = new float[9];
        this.f148236k = new Matrix();
    }
}
