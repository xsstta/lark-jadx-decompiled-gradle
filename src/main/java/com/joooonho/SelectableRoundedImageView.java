package com.joooonho;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SelectableRoundedImageView extends ImageView {

    /* renamed from: b */
    private static final ImageView.ScaleType[] f59219b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a */
    private int f59220a;

    /* renamed from: c */
    private ImageView.ScaleType f59221c;

    /* renamed from: d */
    private float f59222d;

    /* renamed from: e */
    private float f59223e;

    /* renamed from: f */
    private float f59224f;

    /* renamed from: g */
    private float f59225g;

    /* renamed from: h */
    private float f59226h;

    /* renamed from: i */
    private ColorStateList f59227i;

    /* renamed from: j */
    private boolean f59228j;

    /* renamed from: k */
    private Drawable f59229k;

    /* renamed from: l */
    private float[] f59230l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.joooonho.SelectableRoundedImageView$a */
    public static class C23941a extends Drawable {

        /* renamed from: a */
        private RectF f59231a = new RectF();

        /* renamed from: b */
        private RectF f59232b = new RectF();

        /* renamed from: c */
        private final RectF f59233c;

        /* renamed from: d */
        private final int f59234d;

        /* renamed from: e */
        private final int f59235e;

        /* renamed from: f */
        private final Paint f59236f;

        /* renamed from: g */
        private final Paint f59237g;

        /* renamed from: h */
        private BitmapShader f59238h;

        /* renamed from: i */
        private float[] f59239i;

        /* renamed from: j */
        private float[] f59240j;

        /* renamed from: k */
        private boolean f59241k;

        /* renamed from: l */
        private float f59242l;

        /* renamed from: m */
        private ColorStateList f59243m;

        /* renamed from: n */
        private ImageView.ScaleType f59244n;

        /* renamed from: o */
        private Path f59245o;

        /* renamed from: p */
        private Bitmap f59246p;

        /* renamed from: q */
        private boolean f59247q;

        public int getIntrinsicHeight() {
            return this.f59235e;
        }

        public int getIntrinsicWidth() {
            return this.f59234d;
        }

        /* renamed from: a */
        public void mo85913a(float[] fArr) {
            if (fArr != null) {
                if (fArr.length == 8) {
                    for (int i = 0; i < fArr.length; i++) {
                        this.f59239i[i] = fArr[i];
                    }
                    return;
                }
                throw new ArrayIndexOutOfBoundsException("radii[] needs 8 values");
            }
        }

        public boolean isStateful() {
            return this.f59243m.isStateful();
        }

        /* renamed from: a */
        private void m87533a() {
            int i = 0;
            while (true) {
                float[] fArr = this.f59239i;
                if (i < fArr.length) {
                    if (fArr[i] > BitmapDescriptorFactory.HUE_RED) {
                        this.f59240j[i] = fArr[i];
                        fArr[i] = fArr[i] - this.f59242l;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        public int getOpacity() {
            Bitmap bitmap = this.f59246p;
            if (bitmap == null || bitmap.hasAlpha() || this.f59236f.getAlpha() < 255) {
                return -3;
            }
            return -1;
        }

        /* renamed from: a */
        public void mo85912a(boolean z) {
            this.f59241k = z;
        }

        /* renamed from: a */
        public void mo85909a(float f) {
            this.f59242l = f;
            this.f59237g.setStrokeWidth(f);
        }

        public void setAlpha(int i) {
            this.f59236f.setAlpha(i);
            invalidateSelf();
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f59236f.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public void setDither(boolean z) {
            this.f59236f.setDither(z);
            invalidateSelf();
        }

        public void setFilterBitmap(boolean z) {
            this.f59236f.setFilterBitmap(z);
            invalidateSelf();
        }

        /* access modifiers changed from: protected */
        public boolean onStateChange(int[] iArr) {
            int colorForState = this.f59243m.getColorForState(iArr, 0);
            if (this.f59237g.getColor() == colorForState) {
                return super.onStateChange(iArr);
            }
            this.f59237g.setColor(colorForState);
            return true;
        }

        /* renamed from: a */
        public static Bitmap m87530a(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: c */
        private void m87537c(Canvas canvas) {
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float width = (this.f59242l * this.f59231a.width()) / ((this.f59231a.width() * fArr[0]) - (this.f59242l * 2.0f));
            this.f59242l = width;
            this.f59237g.setStrokeWidth(width);
            this.f59232b.set(this.f59231a);
            RectF rectF = this.f59232b;
            float f = this.f59242l;
            rectF.inset((-f) / 2.0f, (-f) / 2.0f);
        }

        /* renamed from: a */
        private void m87534a(Canvas canvas) {
            Rect clipBounds = canvas.getClipBounds();
            Matrix matrix = canvas.getMatrix();
            if (ImageView.ScaleType.CENTER == this.f59244n) {
                this.f59231a.set(clipBounds);
            } else if (ImageView.ScaleType.CENTER_CROP == this.f59244n) {
                m87535a(matrix);
                this.f59231a.set(clipBounds);
            } else if (ImageView.ScaleType.FIT_XY == this.f59244n) {
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(this.f59233c, new RectF(clipBounds), Matrix.ScaleToFit.FILL);
                this.f59238h.setLocalMatrix(matrix2);
                this.f59231a.set(clipBounds);
            } else if (ImageView.ScaleType.FIT_START == this.f59244n || ImageView.ScaleType.FIT_END == this.f59244n || ImageView.ScaleType.FIT_CENTER == this.f59244n || ImageView.ScaleType.CENTER_INSIDE == this.f59244n) {
                m87535a(matrix);
                this.f59231a.set(this.f59233c);
            } else if (ImageView.ScaleType.MATRIX == this.f59244n) {
                m87535a(matrix);
                this.f59231a.set(this.f59233c);
            }
        }

        /* renamed from: b */
        private void m87536b(Canvas canvas) {
            float[] fArr = new float[9];
            canvas.getMatrix().getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = fArr[2];
            float f4 = fArr[5];
            float width = this.f59231a.width();
            float width2 = this.f59231a.width();
            float f5 = this.f59242l;
            float f6 = width / ((width2 + f5) + f5);
            float height = this.f59231a.height();
            float height2 = this.f59231a.height();
            float f7 = this.f59242l;
            float f8 = height / ((height2 + f7) + f7);
            canvas.scale(f6, f8);
            if (ImageView.ScaleType.FIT_START == this.f59244n || ImageView.ScaleType.FIT_END == this.f59244n || ImageView.ScaleType.FIT_XY == this.f59244n || ImageView.ScaleType.FIT_CENTER == this.f59244n || ImageView.ScaleType.CENTER_INSIDE == this.f59244n || ImageView.ScaleType.MATRIX == this.f59244n) {
                float f9 = this.f59242l;
                canvas.translate(f9, f9);
            } else if (ImageView.ScaleType.CENTER == this.f59244n || ImageView.ScaleType.CENTER_CROP == this.f59244n) {
                canvas.translate((-f3) / (f6 * f), (-f4) / (f8 * f2));
                canvas.translate(-(this.f59231a.left - this.f59242l), -(this.f59231a.top - this.f59242l));
            }
        }

        public void draw(Canvas canvas) {
            canvas.save();
            if (!this.f59247q) {
                m87534a(canvas);
                if (this.f59242l > BitmapDescriptorFactory.HUE_RED) {
                    m87537c(canvas);
                    m87533a();
                }
                this.f59247q = true;
            }
            if (this.f59241k) {
                if (this.f59242l > BitmapDescriptorFactory.HUE_RED) {
                    m87536b(canvas);
                    this.f59245o.addOval(this.f59231a, Path.Direction.CW);
                    canvas.drawPath(this.f59245o, this.f59236f);
                    this.f59245o.reset();
                    this.f59245o.addOval(this.f59232b, Path.Direction.CW);
                    canvas.drawPath(this.f59245o, this.f59237g);
                } else {
                    this.f59245o.addOval(this.f59231a, Path.Direction.CW);
                    canvas.drawPath(this.f59245o, this.f59236f);
                }
            } else if (this.f59242l > BitmapDescriptorFactory.HUE_RED) {
                m87536b(canvas);
                this.f59245o.addRoundRect(this.f59231a, this.f59239i, Path.Direction.CW);
                canvas.drawPath(this.f59245o, this.f59236f);
                this.f59245o.reset();
                this.f59245o.addRoundRect(this.f59232b, this.f59240j, Path.Direction.CW);
                canvas.drawPath(this.f59245o, this.f59237g);
            } else {
                this.f59245o.addRoundRect(this.f59231a, this.f59239i, Path.Direction.CW);
                canvas.drawPath(this.f59245o, this.f59236f);
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m87535a(Matrix matrix) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            int i = 0;
            while (true) {
                float[] fArr2 = this.f59239i;
                if (i < fArr2.length) {
                    fArr2[i] = fArr2[i] / fArr[0];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo85910a(ColorStateList colorStateList) {
            if (colorStateList == null) {
                this.f59242l = BitmapDescriptorFactory.HUE_RED;
                this.f59243m = ColorStateList.valueOf(0);
                this.f59237g.setColor(0);
                return;
            }
            this.f59243m = colorStateList;
            this.f59237g.setColor(colorStateList.getColorForState(getState(), -16777216));
        }

        /* renamed from: a */
        public void mo85911a(ImageView.ScaleType scaleType) {
            if (scaleType != null) {
                this.f59244n = scaleType;
            }
        }

        /* renamed from: a */
        public static C23941a m87532a(Bitmap bitmap, Resources resources) {
            if (bitmap != null) {
                return new C23941a(bitmap, resources);
            }
            return null;
        }

        /* renamed from: a */
        public static Drawable m87531a(Drawable drawable, Resources resources) {
            if (drawable == null || (drawable instanceof C23941a)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m87531a(layerDrawable.getDrawable(i), resources));
                }
                return layerDrawable;
            }
            Bitmap a = m87530a(drawable);
            if (a != null) {
                return new C23941a(a, resources);
            }
            Log.w("SelectableRoundedCornerDrawable", "Failed to create bitmap from drawable!");
            return drawable;
        }

        public C23941a(Bitmap bitmap, Resources resources) {
            RectF rectF = new RectF();
            this.f59233c = rectF;
            this.f59239i = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            this.f59240j = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            this.f59241k = false;
            this.f59242l = BitmapDescriptorFactory.HUE_RED;
            this.f59243m = ColorStateList.valueOf(-16777216);
            this.f59244n = ImageView.ScaleType.FIT_CENTER;
            this.f59245o = new Path();
            this.f59247q = false;
            this.f59246p = bitmap;
            this.f59238h = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            if (bitmap != null) {
                this.f59234d = bitmap.getScaledWidth(resources.getDisplayMetrics());
                this.f59235e = bitmap.getScaledHeight(resources.getDisplayMetrics());
            } else {
                this.f59235e = -1;
                this.f59234d = -1;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f59234d, (float) this.f59235e);
            Paint paint = new Paint(1);
            this.f59236f = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setShader(this.f59238h);
            Paint paint2 = new Paint(1);
            this.f59237g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.f59243m.getColorForState(getState(), -16777216));
            paint2.setStrokeWidth(this.f59242l);
        }
    }

    public ColorStateList getBorderColors() {
        return this.f59227i;
    }

    public float getBorderWidth() {
        return this.f59226h;
    }

    public float getCornerRadius() {
        return this.f59222d;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f59221c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f59227i.getDefaultColor();
    }

    /* renamed from: a */
    private Drawable m87527a() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f59220a;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Resources.NotFoundException e) {
                Log.w("SelectableRoundedImageView", "Unable to find resource: " + this.f59220a, e);
                this.f59220a = 0;
            }
        }
        return C23941a.m87531a(drawable, getResources());
    }

    /* renamed from: b */
    private void m87528b() {
        Drawable drawable = this.f59229k;
        if (drawable != null) {
            ((C23941a) drawable).mo85911a(this.f59221c);
            ((C23941a) this.f59229k).mo85913a(this.f59230l);
            ((C23941a) this.f59229k).mo85909a(this.f59226h);
            ((C23941a) this.f59229k).mo85910a(this.f59227i);
            ((C23941a) this.f59229k).mo85912a(this.f59228j);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f59228j = z;
        m87528b();
        invalidate();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        this.f59221c = scaleType;
        m87528b();
    }

    public void setBorderWidthDP(float f) {
        float f2 = getResources().getDisplayMetrics().density * f;
        if (this.f59226h != f2) {
            this.f59226h = f2;
            m87528b();
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f59220a = 0;
        C23941a a = C23941a.m87532a(bitmap, getResources());
        this.f59229k = a;
        super.setImageDrawable(a);
        m87528b();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f59220a = 0;
        Drawable a = C23941a.m87531a(drawable, getResources());
        this.f59229k = a;
        super.setImageDrawable(a);
        m87528b();
    }

    public void setImageResource(int i) {
        if (this.f59220a != i) {
            this.f59220a = i;
            Drawable a = m87527a();
            this.f59229k = a;
            super.setImageDrawable(a);
            m87528b();
        }
    }

    public SelectableRoundedImageView(Context context) {
        super(context);
        this.f59221c = ImageView.ScaleType.FIT_CENTER;
        this.f59227i = ColorStateList.valueOf(-16777216);
        this.f59228j = false;
        this.f59230l = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f59227i.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f59227i = colorStateList;
            m87528b();
            if (this.f59226h > BitmapDescriptorFactory.HUE_RED) {
                invalidate();
            }
        }
    }

    public SelectableRoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectableRoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59221c = ImageView.ScaleType.FIT_CENTER;
        this.f59227i = ColorStateList.valueOf(-16777216);
        this.f59228j = false;
        this.f59230l = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843037, R.attr.sriv_border_color, R.attr.sriv_border_width, R.attr.sriv_left_bottom_corner_radius, R.attr.sriv_left_top_corner_radius, R.attr.sriv_oval, R.attr.sriv_right_bottom_corner_radius, R.attr.sriv_right_top_corner_radius}, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setScaleType(f59219b[i2]);
        }
        this.f59222d = (float) obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f59223e = (float) obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f59224f = (float) obtainStyledAttributes.getDimensionPixelSize(3, 0);
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f59225g = dimensionPixelSize;
        float f = this.f59222d;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            float f2 = this.f59223e;
            if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                float f3 = this.f59224f;
                if (f3 >= BitmapDescriptorFactory.HUE_RED && dimensionPixelSize >= BitmapDescriptorFactory.HUE_RED) {
                    this.f59230l = new float[]{f, f, f2, f2, dimensionPixelSize, dimensionPixelSize, f3, f3};
                    float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 0);
                    this.f59226h = dimensionPixelSize2;
                    if (dimensionPixelSize2 >= BitmapDescriptorFactory.HUE_RED) {
                        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
                        this.f59227i = colorStateList;
                        if (colorStateList == null) {
                            this.f59227i = ColorStateList.valueOf(-16777216);
                        }
                        this.f59228j = obtainStyledAttributes.getBoolean(5, false);
                        obtainStyledAttributes.recycle();
                        m87528b();
                        return;
                    }
                    throw new IllegalArgumentException("border width cannot be negative.");
                }
            }
        }
        throw new IllegalArgumentException("radius values cannot be negative.");
    }

    /* renamed from: a */
    public void mo85893a(float f, float f2, float f3, float f4) {
        float f5 = getResources().getDisplayMetrics().density;
        float f6 = f * f5;
        float f7 = f2 * f5;
        float f8 = f3 * f5;
        float f9 = f4 * f5;
        this.f59230l = new float[]{f6, f6, f7, f7, f9, f9, f8, f8};
        m87528b();
    }
}
