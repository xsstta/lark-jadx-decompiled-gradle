package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.base.C59627f;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59611c;

public class MosaicView extends AppCompatImageView {

    /* renamed from: a */
    RectF f148317a;

    /* renamed from: b */
    boolean f148318b;

    /* renamed from: c */
    public AbstractMosaicStrategy f148319c;

    /* renamed from: d */
    public Bitmap f148320d;

    /* renamed from: e */
    public Bitmap f148321e;

    /* renamed from: f */
    public Canvas f148322f;

    /* renamed from: g */
    public RectF f148323g;

    /* renamed from: h */
    public C59627f f148324h;

    /* renamed from: i */
    public RectF f148325i;

    /* renamed from: j */
    public boolean f148326j;

    /* renamed from: k */
    private int f148327k;

    /* renamed from: l */
    private Matrix f148328l;

    /* renamed from: m */
    private AbstractC59733a f148329m;

    /* renamed from: n */
    private float[] f148330n;

    /* renamed from: o */
    private AbstractMosaicStrategy.AbstractC59722a f148331o;

    /* renamed from: p */
    private Runnable f148332p;

    /* renamed from: q */
    private C59622e.AbstractC59624a f148333q;

    /* renamed from: com.ss.android.photoeditor.mosaic.MosaicView$a */
    interface AbstractC59733a {
        /* renamed from: a */
        void mo203369a(MotionEvent motionEvent);
    }

    public RectF getLocation() {
        return this.f148323g;
    }

    /* renamed from: c */
    public void mo203375c() {
        this.f148333q = C59622e.m231233a().mo203097e();
    }

    /* renamed from: e */
    public void mo203377e() {
        C59610b.m231208a(this.f148320d);
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148319c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203360f();
        }
    }

    /* renamed from: f */
    private void m231647f() {
        setBackgroundColor(-16777216);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f148328l = new Matrix();
    }

    /* renamed from: b */
    public void mo203374b() {
        RectF rectF = this.f148317a;
        if (rectF == null) {
            return;
        }
        if (!this.f148318b) {
            this.f148324h.mo203129a(new RectF(this.f148317a), this.f148325i);
            this.f148317a = null;
            return;
        }
        this.f148323g.set(rectF);
        this.f148317a = null;
    }

    private Bitmap getStrategyBaseBmp() {
        C59622e.C59625b f = C59622e.m231233a().mo203098f();
        RectF rectF = new RectF(f.f147996b);
        RectF rectF2 = new RectF(f.f147995a);
        float width = ((float) f.mo203118a().getWidth()) / rectF.width();
        C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_4444);
        float f2 = rectF.top - rectF2.top;
        new Canvas(createBitmap).drawBitmap(f.mo203118a(), rectF.left - rectF2.left, f2, (Paint) null);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) f.mo203123c());
        return Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public void mo203370a() {
        if (C59622e.m231233a().mo203091a(this.f148333q)) {
            C59611c.m231214a(this, new Runnable() {
                /* class com.ss.android.photoeditor.mosaic.MosaicView.RunnableC597313 */

                public void run() {
                    MosaicView.this.f148325i.set(MosaicView.this.getImageRect());
                    MosaicView.this.f148323g.set(MosaicView.this.f148325i);
                    MosaicView mosaicView = MosaicView.this;
                    mosaicView.f148321e = Bitmap.createScaledBitmap(mosaicView.f148320d, (int) MosaicView.this.f148325i.width(), (int) MosaicView.this.f148325i.height(), true);
                    MosaicView.this.f148322f = new Canvas(MosaicView.this.f148321e);
                    MosaicView mosaicView2 = MosaicView.this;
                    mosaicView2.setStrategy(mosaicView2.f148319c);
                    MosaicView.this.mo203374b();
                }
            });
            invalidate();
            return;
        }
        this.f148321e = Bitmap.createScaledBitmap(this.f148320d, (int) this.f148325i.width(), (int) this.f148325i.height(), true);
        this.f148322f = new Canvas(this.f148321e);
        setStrategy(this.f148319c);
        mo203374b();
        invalidate();
    }

    /* renamed from: d */
    public void mo203376d() {
        C59622e.AbstractC59624a h = C59622e.m231233a().mo203100h();
        C59622e.C59625b k = C59622e.m231233a().mo203103k();
        if (h != null) {
            k.mo203122b(h);
        }
        final Bitmap g = C59622e.m231233a().mo203099g();
        setImageBitmap(g);
        if (k.f147998d) {
            C59611c.m231214a(this, new Runnable() {
                /* class com.ss.android.photoeditor.mosaic.MosaicView.RunnableC597324 */

                public void run() {
                    MosaicView.this.f148325i.set(MosaicView.this.getImageRect());
                    MosaicView.this.f148323g.set(MosaicView.this.f148325i);
                    MosaicView mosaicView = MosaicView.this;
                    mosaicView.f148321e = Bitmap.createScaledBitmap(g, (int) mosaicView.f148325i.width(), (int) MosaicView.this.f148325i.height(), true);
                    MosaicView.this.f148322f = new Canvas(MosaicView.this.f148321e);
                    MosaicView mosaicView2 = MosaicView.this;
                    mosaicView2.setStrategy(mosaicView2.f148319c);
                }
            });
            invalidate();
            return;
        }
        this.f148321e = Bitmap.createScaledBitmap(g, (int) this.f148325i.width(), (int) this.f148325i.height(), true);
        this.f148322f = new Canvas(this.f148321e);
        setStrategy(this.f148319c);
        invalidate();
    }

    public RectF getImageRect() {
        RectF rectF = new RectF();
        float width = (float) getWidth();
        float height = (float) getHeight();
        Matrix imageMatrix = getImageMatrix();
        int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * m231646a(imageMatrix, 0));
        int intrinsicHeight = (int) (((float) getDrawable().getIntrinsicHeight()) * m231646a(imageMatrix, 4));
        if (Math.abs(((float) intrinsicWidth) - width) < 3.0f) {
            if (intrinsicHeight <= 0) {
                intrinsicHeight = 1;
            }
            if (width <= BitmapDescriptorFactory.HUE_RED) {
                width = 1.0f;
            }
            float f = (float) intrinsicHeight;
            float f2 = (height - f) / 2.0f;
            rectF.set(BitmapDescriptorFactory.HUE_RED, (float) ((int) f2), (float) ((int) width), (float) ((int) (f2 + f)));
        } else {
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            if (height <= BitmapDescriptorFactory.HUE_RED) {
                height = 1.0f;
            }
            float f3 = (float) intrinsicWidth;
            float f4 = (width - f3) / 2.0f;
            rectF.set((float) ((int) f4), BitmapDescriptorFactory.HUE_RED, (float) ((int) (f4 + f3)), (float) ((int) height));
        }
        return rectF;
    }

    public void setMotionEventListener(AbstractC59733a aVar) {
        this.f148329m = aVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        mo203371a(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f148320d = bitmap;
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148319c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203347a(bitmap);
        }
    }

    public void setPaintSize(int i) {
        this.f148327k = i;
        AbstractMosaicStrategy abstractMosaicStrategy = this.f148319c;
        if (abstractMosaicStrategy != null) {
            abstractMosaicStrategy.mo203346a(i);
        }
    }

    public MosaicView(Context context) {
        super(context);
        this.f148330n = new float[9];
        this.f148331o = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.MosaicView.C597271 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                MosaicView.this.f148322f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicView.this.f148321e.getWidth(), MosaicView.this.f148321e.getHeight()), (Paint) null);
                MosaicView.this.invalidate();
            }
        };
        m231647f();
    }

    /* renamed from: a */
    public void mo203371a(Canvas canvas) {
        C59610b.m231209a(this.f148328l, this.f148321e, this.f148323g);
        canvas.drawBitmap(this.f148321e, this.f148328l, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148326j) {
            return true;
        }
        this.f148324h.mo203130a(motionEvent);
        AbstractC59733a aVar = this.f148329m;
        if (aVar == null) {
            return true;
        }
        aVar.mo203369a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public void mo203373a(final Runnable runnable) {
        this.f148332p = runnable;
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.mosaic.MosaicView.RunnableC597282 */

            public void run() {
                MosaicView mosaicView = MosaicView.this;
                mosaicView.f148325i = mosaicView.getImageRect();
                MosaicView.this.f148323g = new RectF(MosaicView.this.f148325i);
                MosaicView mosaicView2 = MosaicView.this;
                mosaicView2.f148321e = Bitmap.createScaledBitmap(mosaicView2.f148320d, (int) MosaicView.this.f148325i.width(), (int) MosaicView.this.f148325i.height(), true);
                MosaicView.this.f148322f = new Canvas(MosaicView.this.f148321e);
                MosaicView mosaicView3 = MosaicView.this;
                mosaicView3.f148324h = new C59627f(mosaicView3.f148325i, MosaicView.this.f148323g, new C59627f.AbstractC59633b() {
                    /* class com.ss.android.photoeditor.mosaic.MosaicView.RunnableC597282.C597291 */

                    @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59633b
                    /* renamed from: a */
                    public void mo203136a(RectF rectF) {
                        MosaicView.this.f148323g.set(rectF);
                        MosaicView.this.invalidate();
                    }
                }, new C59627f.AbstractC59634c() {
                    /* class com.ss.android.photoeditor.mosaic.MosaicView.RunnableC597282.C597302 */

                    @Override // com.ss.android.photoeditor.base.C59627f.AbstractC59634c
                    /* renamed from: a */
                    public void mo203139a(MotionEvent motionEvent) {
                        if (MosaicView.this.f148319c != null) {
                            HitPointHelper.f147964l.mo203046b(true);
                            MosaicView.this.f148319c.mo203349a(motionEvent);
                        }
                    }
                });
                MosaicView.this.f148326j = true;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                MosaicView.this.mo203374b();
            }
        });
    }

    public void setStrategy(AbstractMosaicStrategy abstractMosaicStrategy) {
        this.f148319c = abstractMosaicStrategy;
        abstractMosaicStrategy.mo203348a(this.f148325i);
        this.f148319c.mo203351a(this.f148331o);
        this.f148319c.mo203347a(getStrategyBaseBmp());
        this.f148319c.mo203346a(this.f148327k);
        this.f148319c.mo203354b(this.f148323g);
        this.f148319c.mo203357c(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()));
        this.f148319c.mo203359e();
    }

    /* renamed from: a */
    public void mo203372a(RectF rectF, boolean z) {
        this.f148317a = rectF;
        this.f148318b = z;
    }

    /* renamed from: a */
    private float m231646a(Matrix matrix, int i) {
        matrix.getValues(this.f148330n);
        return this.f148330n[i];
    }

    public MosaicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148330n = new float[9];
        this.f148331o = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.MosaicView.C597271 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                MosaicView.this.f148322f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicView.this.f148321e.getWidth(), MosaicView.this.f148321e.getHeight()), (Paint) null);
                MosaicView.this.invalidate();
            }
        };
        m231647f();
    }

    public MosaicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f148330n = new float[9];
        this.f148331o = new AbstractMosaicStrategy.AbstractC59722a() {
            /* class com.ss.android.photoeditor.mosaic.MosaicView.C597271 */

            @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy.AbstractC59722a
            /* renamed from: a */
            public void mo203361a(Bitmap bitmap, boolean z) {
                MosaicView.this.f148322f.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, MosaicView.this.f148321e.getWidth(), MosaicView.this.f148321e.getHeight()), (Paint) null);
                MosaicView.this.invalidate();
            }
        };
        m231647f();
    }
}
