package com.ss.android.photoeditor.crop_rotate;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.crop_rotate.C59672a;
import com.ss.android.photoeditor.crop_rotate.C59688c;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59611c;
import com.ss.android.photoeditor.p3010b.C59613d;

public class PhotoClipView extends AppCompatImageView {

    /* renamed from: m */
    private static final float f148084m = ((float) C59613d.m231216a(90));

    /* renamed from: a */
    boolean f148085a;

    /* renamed from: b */
    RectF f148086b;

    /* renamed from: c */
    public Bitmap f148087c;

    /* renamed from: d */
    public C59688c f148088d;

    /* renamed from: e */
    public RectF f148089e;

    /* renamed from: f */
    public C59672a f148090f;

    /* renamed from: g */
    public C59685b f148091g;

    /* renamed from: h */
    public RectF f148092h;

    /* renamed from: i */
    public RectF f148093i;

    /* renamed from: j */
    public boolean f148094j;

    /* renamed from: k */
    public C59703d f148095k;

    /* renamed from: l */
    public boolean f148096l;

    /* renamed from: n */
    private Paint f148097n;

    /* renamed from: o */
    private float[] f148098o;

    public RectF getClipImitationRect() {
        return this.f148089e;
    }

    /* renamed from: a */
    public void mo203201a() {
        mo203202a(null);
    }

    /* renamed from: g */
    public void mo203208g() {
        mo203201a();
        invalidate();
    }

    public RectF getPhotoImitationRect() {
        return this.f148095k.mo203300j();
    }

    public int getTotalRotateAngle() {
        return this.f148095k.mo203302l();
    }

    /* renamed from: h */
    public void mo203214h() {
        C59610b.m231208a(this.f148087c);
    }

    public RectF getClipRect() {
        C59688c cVar = this.f148088d;
        if (cVar != null) {
            return cVar.mo203267c();
        }
        return this.f148086b;
    }

    /* renamed from: com.ss.android.photoeditor.crop_rotate.PhotoClipView$a */
    static class C59671a extends C59622e.AbstractC59624a {

        /* renamed from: b */
        private int f148111b;

        /* renamed from: c */
        private RectF f148112c;

        /* renamed from: d */
        private RectF f148113d;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return null;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            return null;
        }

        public String toString() {
            return "ClipAndRotateEditAction : " + this.f148113d.toString();
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            bVar.f147998d = true;
            bVar.f147997c = this.f148111b;
            bVar.f147995a = this.f148113d;
            bVar.f147996b = this.f148112c;
            Log.m165379d("ClipAndRotateEditAction", "show= " + this.f148113d);
            return bVar;
        }

        C59671a(RectF rectF, RectF rectF2, int i) {
            this.f148111b = i;
            this.f148112c = new RectF(rectF);
            this.f148113d = new RectF(rectF2);
            int i2 = -i;
            C59610b.m231213a(this.f148112c, i2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
            C59610b.m231213a(this.f148113d, i2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: b */
    public void mo203203b() {
        Bitmap bitmap = this.f148087c;
        if (bitmap != null) {
            float min = (float) Math.min(bitmap.getWidth(), this.f148087c.getHeight());
            float f = f148084m;
            if (min < f) {
                float f2 = f / min;
                Bitmap bitmap2 = this.f148087c;
                this.f148087c = Bitmap.createScaledBitmap(bitmap2, (int) (((float) bitmap2.getWidth()) * f2), (int) (((float) this.f148087c.getHeight()) * f2), true);
            }
        }
    }

    /* renamed from: c */
    public void mo203204c() {
        final C59622e.C59625b c = C59622e.m231233a().mo203094c();
        Bitmap createBitmap = Bitmap.createBitmap(c.mo203118a());
        new Canvas(createBitmap).drawBitmap(c.mo203121b(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        setImageBitmap(createBitmap);
        this.f148091g.mo203253a(createBitmap);
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596702 */

            public void run() {
                PhotoClipView.this.f148093i.set(PhotoClipView.this.mo203206e());
                C59610b.m231213a(PhotoClipView.this.f148093i, c.mo203123c(), PhotoClipView.this.f148093i.centerX(), PhotoClipView.this.f148093i.centerY());
                PhotoClipView.this.f148090f.mo203246c(PhotoClipView.this.f148093i, PhotoClipView.this.getScreenShowRegion());
                RectF rectF = new RectF(c.f147995a);
                RectF rectF2 = new RectF(c.f147996b);
                C59610b.m231213a(rectF, c.f147997c, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                C59610b.m231213a(rectF2, c.f147997c, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
                RectF rectF3 = new RectF(rectF);
                PhotoClipView.this.f148088d.mo203268c(rectF3);
                float width = rectF3.width() / rectF.width();
                C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                float centerX = PhotoClipView.this.f148093i.centerX() - rectF.centerX();
                float centerY = PhotoClipView.this.f148093i.centerY() - rectF.centerY();
                rectF2.offset(centerX, centerY);
                rectF.offset(centerX, centerY);
                C59610b.m231213a(rectF2, -c.mo203123c(), rectF2.centerX(), rectF2.centerY());
                PhotoClipView.this.f148095k.mo203290a(new C59703d(rectF2, c.mo203123c(), new PointF(rectF2.centerX(), rectF2.centerY())));
                PhotoClipView.this.f148088d.mo203266b(rectF);
                PhotoClipView.this.f148089e.set(rectF);
                PhotoClipView.this.mo203205d();
            }
        });
        invalidate();
    }

    /* renamed from: f */
    public void mo203207f() {
        if (!this.f148096l) {
            this.f148090f.mo203240a(new PointF(this.f148088d.mo203267c().centerX(), this.f148088d.mo203267c().centerY()));
        }
    }

    public RectF getScreenShowRegion() {
        RectF rectF = new RectF();
        rectF.left = C59613d.m231215a(20.5f);
        rectF.right = ((float) getWidth()) - C59613d.m231215a(20.5f);
        rectF.top = C59613d.m231215a(26.5f);
        rectF.bottom = ((float) getHeight()) - C59613d.m231215a(26.5f);
        return rectF;
    }

    /* renamed from: d */
    public void mo203205d() {
        if (this.f148086b != null) {
            this.f148085a = true;
            RectF rectF = new RectF(this.f148086b);
            RectF rectF2 = new RectF(this.f148089e);
            RectF rectF3 = new RectF(this.f148095k.mo203300j());
            float width = rectF.width() / rectF2.width();
            C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
            C59610b.m231211a(rectF3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
            rectF3.offset(rectF.centerX() - rectF2.centerX(), rectF.centerY() - rectF2.centerY());
            this.f148090f.mo203241a(rectF3, new RectF(this.f148095k.mo203300j()));
            this.f148086b = null;
        }
    }

    /* renamed from: e */
    public RectF mo203206e() {
        RectF rectF = new RectF();
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float width = (float) getWidth();
        float height = (float) getHeight();
        Log.m165379d("PhotoClipView", "imageRect imageWidth:viewWidth " + intrinsicWidth + ":" + width);
        Matrix imageMatrix = getImageMatrix();
        float a = m231396a(imageMatrix, 0);
        int intrinsicHeight = (int) (((float) getDrawable().getIntrinsicHeight()) * m231396a(imageMatrix, 4));
        float f = (float) ((int) (intrinsicWidth * a));
        if (Math.abs(f - width) < 3.0f) {
            float f2 = (float) intrinsicHeight;
            float f3 = (height - f2) / 2.0f;
            rectF.set(BitmapDescriptorFactory.HUE_RED, (float) ((int) f3), (float) ((int) width), (float) ((int) (f3 + f2)));
        } else {
            float f4 = (width - f) / 2.0f;
            rectF.set((float) ((int) f4), BitmapDescriptorFactory.HUE_RED, (float) ((int) (f4 + f)), (float) ((int) height));
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float min = Math.min(((rectF.height() - ((float) C59613d.m231216a(26))) - ((float) C59613d.m231216a(26))) / rectF.height(), ((rectF.width() - ((float) C59613d.m231216a(20))) - ((float) C59613d.m231216a(20))) / rectF.width());
        rectF.left = (float) ((int) (((rectF.left - centerX) * min) + centerX));
        rectF.right = (float) ((int) (((rectF.right - centerX) * min) + centerX));
        rectF.top = (float) ((int) (((rectF.top - centerY) * min) + centerY));
        rectF.bottom = (float) ((int) (((rectF.bottom - centerY) * min) + centerY));
        return rectF;
    }

    public void setPreLocation(RectF rectF) {
        this.f148086b = rectF;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f148087c = bitmap;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f148094j || this.f148096l) {
            return true;
        }
        this.f148090f.mo203245b(motionEvent);
        return true;
    }

    public PhotoClipView(Context context) {
        super(context);
        this.f148097n = new Paint();
        this.f148098o = new float[9];
        this.f148096l = false;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: a */
    public void mo203202a(final Runnable runnable) {
        C59611c.m231214a(this, new Runnable() {
            /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621 */

            public void run() {
                PhotoClipView.this.mo203203b();
                PhotoClipView photoClipView = PhotoClipView.this;
                photoClipView.f148093i = photoClipView.mo203206e();
                PhotoClipView photoClipView2 = PhotoClipView.this;
                photoClipView2.f148095k = new C59703d(photoClipView2.f148093i, 0, new PointF(PhotoClipView.this.f148093i.centerX(), PhotoClipView.this.f148093i.centerY()));
                PhotoClipView.this.f148089e = new RectF(PhotoClipView.this.f148093i);
                PhotoClipView photoClipView3 = PhotoClipView.this;
                photoClipView3.f148091g = new C59685b(photoClipView3.f148087c, PhotoClipView.this.f148095k);
                PhotoClipView photoClipView4 = PhotoClipView.this;
                photoClipView4.f148090f = new C59672a(photoClipView4.f148093i, PhotoClipView.this.f148095k, PhotoClipView.this.f148089e, new C59672a.AbstractC59681b() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596631 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59681b
                    /* renamed from: a */
                    public void mo203219a() {
                        PhotoClipView.this.f148085a = false;
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59681b
                    /* renamed from: b */
                    public void mo203223b() {
                        PhotoClipView.this.f148085a = false;
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59681b
                    /* renamed from: a */
                    public void mo203222a(C59703d dVar) {
                        PhotoClipView.this.f148095k.mo203290a(dVar);
                        PhotoClipView.this.invalidate();
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59681b
                    /* renamed from: a */
                    public void mo203220a(RectF rectF, int i) {
                        PhotoClipView.this.f148093i.set(rectF);
                        PhotoClipView.this.f148088d.mo203258a(i);
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59681b
                    /* renamed from: a */
                    public void mo203221a(RectF rectF, RectF rectF2, int i, float f) {
                        PhotoClipView.this.f148088d.mo203262a(rectF, rectF2, (float) i, f);
                    }
                }, new C59672a.AbstractC59684e() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596642 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59684e
                    /* renamed from: a */
                    public RectF mo203224a() {
                        return PhotoClipView.this.f148088d.mo203267c();
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59684e
                    /* renamed from: b */
                    public RectF mo203225b() {
                        return PhotoClipView.this.getScreenShowRegion();
                    }
                }, new C59672a.AbstractC59683d() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596653 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59683d
                    /* renamed from: b */
                    public void mo203227b(MotionEvent motionEvent) {
                        PhotoClipView.this.f148088d.mo203263a(motionEvent);
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59672a.AbstractC59683d
                    /* renamed from: a */
                    public boolean mo203226a(MotionEvent motionEvent) {
                        return PhotoClipView.this.f148088d.mo203264a(motionEvent.getX(), motionEvent.getY());
                    }
                });
                PhotoClipView photoClipView5 = PhotoClipView.this;
                photoClipView5.f148088d = new C59688c(photoClipView5.f148093i, PhotoClipView.this.f148095k, new C59688c.AbstractC59702e() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596664 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59702e
                    /* renamed from: c */
                    public void mo203230c() {
                        PhotoClipView.this.invalidate();
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59702e
                    /* renamed from: a */
                    public int mo203228a() {
                        return PhotoClipView.this.getWidth();
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59702e
                    /* renamed from: b */
                    public int mo203229b() {
                        return PhotoClipView.this.getHeight();
                    }
                }, new C59688c.AbstractC59700c() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596675 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59700c
                    /* renamed from: a */
                    public void mo203231a(RectF rectF) {
                        PhotoClipView.this.f148089e.set(rectF);
                    }
                }, new C59688c.AbstractC59701d() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596686 */

                    /* renamed from: b */
                    private C59703d f148107b;

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59701d
                    /* renamed from: a */
                    public void mo203232a() {
                        PhotoClipView.this.f148096l = false;
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59701d
                    /* renamed from: b */
                    public void mo203235b() {
                        PhotoClipView.this.f148096l = false;
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59701d
                    /* renamed from: a */
                    public void mo203234a(RectF rectF) {
                        PhotoClipView.this.f148096l = true;
                        PhotoClipView.this.f148092h = new RectF(rectF);
                        this.f148107b = new C59703d(PhotoClipView.this.f148095k);
                        Log.m165389i("PhotoClipView", "onTransitionStart : clipRegion = " + rectF + ", locationBeforeTransition = " + this.f148107b);
                    }

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59701d
                    /* renamed from: a */
                    public void mo203233a(float f, RectF rectF) {
                        Log.m165389i("PhotoClipView", "onTransitionUpdate : locationBeforeTransition = " + this.f148107b + " mStartClipRect = " + PhotoClipView.this.f148092h);
                        PhotoClipView.this.f148090f.mo203239a(this.f148107b);
                        PhotoClipView.this.f148095k.mo203290a(PhotoClipView.this.f148090f.mo203244b(PhotoClipView.this.f148092h, rectF));
                        PhotoClipView.this.invalidate();
                    }
                }, new C59688c.AbstractC59699b() {
                    /* class com.ss.android.photoeditor.crop_rotate.PhotoClipView.RunnableC596621.C596697 */

                    @Override // com.ss.android.photoeditor.crop_rotate.C59688c.AbstractC59699b
                    /* renamed from: a */
                    public C59703d mo203236a() {
                        return PhotoClipView.this.f148095k;
                    }
                });
                PhotoClipView.this.f148094j = true;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                if (PhotoClipView.this.f148086b != null) {
                    PhotoClipView.this.f148085a = true;
                    PhotoClipView.this.f148090f.mo203241a(new RectF(PhotoClipView.this.f148086b), PhotoClipView.this.f148093i);
                    PhotoClipView.this.f148086b = null;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(this.f148091g.mo203252a(), this.f148091g.mo203254b(), null);
        if (!this.f148085a) {
            this.f148088d.mo203259a(canvas);
        }
    }

    /* renamed from: a */
    private float m231396a(Matrix matrix, int i) {
        matrix.getValues(this.f148098o);
        return this.f148098o[i];
    }

    public PhotoClipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148097n = new Paint();
        this.f148098o = new float[9];
        this.f148096l = false;
    }

    public PhotoClipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f148097n = new Paint();
        this.f148098o = new float[9];
        this.f148096l = false;
    }
}
