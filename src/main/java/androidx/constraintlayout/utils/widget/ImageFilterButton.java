package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: a */
    public float f2713a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public float f2714b = Float.NaN;

    /* renamed from: c */
    ViewOutlineProvider f2715c;

    /* renamed from: d */
    RectF f2716d;

    /* renamed from: e */
    Drawable[] f2717e;

    /* renamed from: f */
    LayerDrawable f2718f;

    /* renamed from: g */
    private ImageFilterView.C0681a f2719g = new ImageFilterView.C0681a();

    /* renamed from: h */
    private float f2720h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i */
    private Path f2721i;

    /* renamed from: j */
    private boolean f2722j = true;

    public float getCrossfade() {
        return this.f2720h;
    }

    public float getRound() {
        return this.f2714b;
    }

    public float getRoundPercent() {
        return this.f2713a;
    }

    public float getContrast() {
        return this.f2719g.f2742f;
    }

    public float getSaturation() {
        return this.f2719g.f2741e;
    }

    public float getWarmth() {
        return this.f2719g.f2743g;
    }

    private void setOverlay(boolean z) {
        this.f2722j = z;
    }

    public void setBrightness(float f) {
        this.f2719g.f2740d = f;
        this.f2719g.mo3782a(this);
    }

    public void setContrast(float f) {
        this.f2719g.f2742f = f;
        this.f2719g.mo3782a(this);
    }

    public void setSaturation(float f) {
        this.f2719g.f2741e = f;
        this.f2719g.mo3782a(this);
    }

    public void setWarmth(float f) {
        this.f2719g.f2743g = f;
        this.f2719g.mo3782a(this);
    }

    public ImageFilterButton(Context context) {
        super(context);
        m3323a(context, null);
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2714b == BitmapDescriptorFactory.HUE_RED || this.f2721i == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2721i);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public void setCrossfade(float f) {
        this.f2720h = f;
        if (this.f2717e != null) {
            if (!this.f2722j) {
                this.f2718f.getDrawable(0).setAlpha((int) ((1.0f - this.f2720h) * 255.0f));
            }
            this.f2718f.getDrawable(1).setAlpha((int) (this.f2720h * 255.0f));
            super.setImageDrawable(this.f2718f);
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f2713a != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2713a = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2721i == null) {
                this.f2721i = new Path();
            }
            if (this.f2716d == null) {
                this.f2716d = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2715c == null) {
                    C06771 r7 = new ViewOutlineProvider() {
                        /* class androidx.constraintlayout.utils.widget.ImageFilterButton.C06771 */

                        public void getOutline(View view, Outline outline) {
                            int width = ImageFilterButton.this.getWidth();
                            int height = ImageFilterButton.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2713a) / 2.0f);
                        }
                    };
                    this.f2715c = r7;
                    setOutlineProvider(r7);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2713a) / 2.0f;
            this.f2716d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2721i.reset();
            this.f2721i.addRoundRect(this.f2716d, min, min, Path.Direction.CW);
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
            this.f2714b = f;
            float f2 = this.f2713a;
            this.f2713a = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2714b != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2714b = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2721i == null) {
                this.f2721i = new Path();
            }
            if (this.f2716d == null) {
                this.f2716d = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2715c == null) {
                    C06782 r6 = new ViewOutlineProvider() {
                        /* class androidx.constraintlayout.utils.widget.ImageFilterButton.C06782 */

                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2714b);
                        }
                    };
                    this.f2715c = r6;
                    setOutlineProvider(r6);
                }
                setClipToOutline(true);
            }
            this.f2716d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2721i.reset();
            Path path = this.f2721i;
            RectF rectF = this.f2716d;
            float f3 = this.f2714b;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3323a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3323a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.altSrc, R.attr.brightness, R.attr.contrast, R.attr.crossfade, R.attr.overlay, R.attr.round, R.attr.roundPercent, R.attr.saturation, R.attr.warmth});
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f2720h = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2722j));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2717e = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2717e[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2717e);
                this.f2718f = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2720h * 255.0f));
                super.setImageDrawable(this.f2718f);
            }
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3323a(context, attributeSet);
    }
}
