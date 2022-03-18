package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: a */
    public float f2725a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public float f2726b = Float.NaN;

    /* renamed from: c */
    ViewOutlineProvider f2727c;

    /* renamed from: d */
    RectF f2728d;

    /* renamed from: e */
    Drawable[] f2729e;

    /* renamed from: f */
    LayerDrawable f2730f;

    /* renamed from: g */
    private C0681a f2731g = new C0681a();

    /* renamed from: h */
    private boolean f2732h = true;

    /* renamed from: i */
    private float f2733i = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: j */
    private Path f2734j;

    public float getCrossfade() {
        return this.f2733i;
    }

    public float getRound() {
        return this.f2726b;
    }

    public float getRoundPercent() {
        return this.f2725a;
    }

    public float getBrightness() {
        return this.f2731g.f2740d;
    }

    public float getContrast() {
        return this.f2731g.f2742f;
    }

    public float getSaturation() {
        return this.f2731g.f2741e;
    }

    public float getWarmth() {
        return this.f2731g.f2743g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public static class C0681a {

        /* renamed from: a */
        float[] f2737a = new float[20];

        /* renamed from: b */
        ColorMatrix f2738b = new ColorMatrix();

        /* renamed from: c */
        ColorMatrix f2739c = new ColorMatrix();

        /* renamed from: d */
        float f2740d = 1.0f;

        /* renamed from: e */
        float f2741e = 1.0f;

        /* renamed from: f */
        float f2742f = 1.0f;

        /* renamed from: g */
        float f2743g = 1.0f;

        C0681a() {
        }

        /* renamed from: a */
        private void m3325a(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2737a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        private void m3327c(float f) {
            float[] fArr = this.f2737a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3782a(ImageView imageView) {
            boolean z;
            this.f2738b.reset();
            float f = this.f2741e;
            boolean z2 = true;
            if (f != 1.0f) {
                m3325a(f);
                this.f2738b.set(this.f2737a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f2742f;
            if (f2 != 1.0f) {
                this.f2739c.setScale(f2, f2, f2, 1.0f);
                this.f2738b.postConcat(this.f2739c);
                z = true;
            }
            float f3 = this.f2743g;
            if (f3 != 1.0f) {
                m3326b(f3);
                this.f2739c.set(this.f2737a);
                this.f2738b.postConcat(this.f2739c);
                z = true;
            }
            float f4 = this.f2740d;
            if (f4 != 1.0f) {
                m3327c(f4);
                this.f2739c.set(this.f2737a);
                this.f2738b.postConcat(this.f2739c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2738b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: b */
        private void m3326b(float f) {
            float f2;
            float f3;
            float f4;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                f = 0.01f;
            }
            float f5 = (5000.0f / f) / 100.0f;
            if (f5 > 66.0f) {
                double d = (double) (f5 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f5)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            if (f5 >= 66.0f) {
                f4 = 255.0f;
            } else if (f5 > 19.0f) {
                f4 = (((float) Math.log((double) (f5 - 10.0f))) * 138.51773f) - 305.0448f;
            } else {
                f4 = BitmapDescriptorFactory.HUE_RED;
            }
            float min = Math.min(255.0f, Math.max(f3, (float) BitmapDescriptorFactory.HUE_RED));
            float min2 = Math.min(255.0f, Math.max(f2, (float) BitmapDescriptorFactory.HUE_RED));
            float min3 = Math.min(255.0f, Math.max(f4, (float) BitmapDescriptorFactory.HUE_RED));
            float min4 = Math.min(255.0f, Math.max(255.0f, (float) BitmapDescriptorFactory.HUE_RED));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, (float) BitmapDescriptorFactory.HUE_RED));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, (float) BitmapDescriptorFactory.HUE_RED));
            float[] fArr = this.f2737a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    private void setOverlay(boolean z) {
        this.f2732h = z;
    }

    public void setBrightness(float f) {
        this.f2731g.f2740d = f;
        this.f2731g.mo3782a(this);
    }

    public void setContrast(float f) {
        this.f2731g.f2742f = f;
        this.f2731g.mo3782a(this);
    }

    public void setSaturation(float f) {
        this.f2731g.f2741e = f;
        this.f2731g.mo3782a(this);
    }

    public void setWarmth(float f) {
        this.f2731g.f2743g = f;
        this.f2731g.mo3782a(this);
    }

    public ImageFilterView(Context context) {
        super(context);
        m3324a(context, null);
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2725a == BitmapDescriptorFactory.HUE_RED || this.f2734j == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2734j);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public void setCrossfade(float f) {
        this.f2733i = f;
        if (this.f2729e != null) {
            if (!this.f2732h) {
                this.f2730f.getDrawable(0).setAlpha((int) ((1.0f - this.f2733i) * 255.0f));
            }
            this.f2730f.getDrawable(1).setAlpha((int) (this.f2733i * 255.0f));
            super.setImageDrawable(this.f2730f);
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f2725a != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2725a = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2734j == null) {
                this.f2734j = new Path();
            }
            if (this.f2728d == null) {
                this.f2728d = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2727c == null) {
                    C06791 r7 = new ViewOutlineProvider() {
                        /* class androidx.constraintlayout.utils.widget.ImageFilterView.C06791 */

                        public void getOutline(View view, Outline outline) {
                            int width = ImageFilterView.this.getWidth();
                            int height = ImageFilterView.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2725a) / 2.0f);
                        }
                    };
                    this.f2727c = r7;
                    setOutlineProvider(r7);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2725a) / 2.0f;
            this.f2728d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2734j.reset();
            this.f2734j.addRoundRect(this.f2728d, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2726b = f;
            float f2 = this.f2725a;
            this.f2725a = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2726b != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2726b = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2734j == null) {
                this.f2734j = new Path();
            }
            if (this.f2728d == null) {
                this.f2728d = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2727c == null) {
                    C06802 r6 = new ViewOutlineProvider() {
                        /* class androidx.constraintlayout.utils.widget.ImageFilterView.C06802 */

                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2726b);
                        }
                    };
                    this.f2727c = r6;
                    setOutlineProvider(r6);
                }
                setClipToOutline(true);
            }
            this.f2728d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2734j.reset();
            Path path = this.f2734j;
            RectF rectF = this.f2728d;
            float f3 = this.f2726b;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3324a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3324a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.altSrc, R.attr.brightness, R.attr.contrast, R.attr.crossfade, R.attr.overlay, R.attr.round, R.attr.roundPercent, R.attr.saturation, R.attr.warmth});
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f2733i = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == 8) {
                    setWarmth(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 7) {
                    setSaturation(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 2) {
                    setContrast(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 5) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                    }
                } else if (index == 6) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                    }
                } else if (index == 4) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2732h));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2729e = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2729e[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2729e);
                this.f2730f = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2733i * 255.0f));
                super.setImageDrawable(this.f2730f);
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3324a(context, attributeSet);
    }
}
