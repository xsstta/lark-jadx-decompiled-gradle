package com.tt.miniapp.component.nativeview.game;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;

/* renamed from: com.tt.miniapp.component.nativeview.game.a */
public class C65900a extends Drawable {

    /* renamed from: a */
    private final RectF f166239a = new RectF();

    /* renamed from: b */
    private final RectF f166240b = new RectF();

    /* renamed from: c */
    private final RectF f166241c;

    /* renamed from: d */
    private final Bitmap f166242d;

    /* renamed from: e */
    private final Paint f166243e;

    /* renamed from: f */
    private final int f166244f;

    /* renamed from: g */
    private final int f166245g;

    /* renamed from: h */
    private final RectF f166246h;

    /* renamed from: i */
    private final Paint f166247i;

    /* renamed from: j */
    private final Matrix f166248j;

    /* renamed from: k */
    private final RectF f166249k;

    /* renamed from: l */
    private Shader.TileMode f166250l;

    /* renamed from: m */
    private Shader.TileMode f166251m;

    /* renamed from: n */
    private boolean f166252n;

    /* renamed from: o */
    private float f166253o;

    /* renamed from: p */
    private final boolean[] f166254p;

    /* renamed from: q */
    private boolean f166255q;

    /* renamed from: r */
    private float f166256r;

    /* renamed from: s */
    private ColorStateList f166257s;

    /* renamed from: t */
    private ImageView.ScaleType f166258t;

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return this.f166245g;
    }

    public int getIntrinsicWidth() {
        return this.f166244f;
    }

    /* renamed from: a */
    public C65900a mo230741a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f166258t != scaleType) {
            this.f166258t = scaleType;
            m258140a();
        }
        return this;
    }

    public int getAlpha() {
        return this.f166243e.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f166243e.getColorFilter();
    }

    public boolean isStateful() {
        return this.f166257s.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.component.nativeview.game.a$1 */
    public static /* synthetic */ class C659011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f166259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.tt.miniapp.component.nativeview.game.C65900a.C659011.f166259a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.component.nativeview.game.C65900a.C659011.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m258140a() {
        float f;
        float f2;
        float f3;
        int i = C659011.f166259a[this.f166258t.ordinal()];
        if (i == 1) {
            this.f166246h.set(this.f166239a);
            RectF rectF = this.f166246h;
            float f4 = this.f166256r;
            rectF.inset(f4 / 2.0f, f4 / 2.0f);
            this.f166248j.reset();
            this.f166248j.setTranslate((float) ((int) (((this.f166246h.width() - ((float) this.f166244f)) * 0.5f) + 0.5f)), (float) ((int) (((this.f166246h.height() - ((float) this.f166245g)) * 0.5f) + 0.5f)));
        } else if (i == 2) {
            this.f166246h.set(this.f166239a);
            RectF rectF2 = this.f166246h;
            float f5 = this.f166256r;
            rectF2.inset(f5 / 2.0f, f5 / 2.0f);
            this.f166248j.reset();
            float height = ((float) this.f166244f) * this.f166246h.height();
            float width = this.f166246h.width() * ((float) this.f166245g);
            float f6 = BitmapDescriptorFactory.HUE_RED;
            if (height > width) {
                f2 = this.f166246h.height() / ((float) this.f166245g);
                f6 = (this.f166246h.width() - (((float) this.f166244f) * f2)) * 0.5f;
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = this.f166246h.width() / ((float) this.f166244f);
                f = (this.f166246h.height() - (((float) this.f166245g) * f2)) * 0.5f;
            }
            this.f166248j.setScale(f2, f2);
            Matrix matrix = this.f166248j;
            float f7 = this.f166256r;
            matrix.postTranslate(((float) ((int) (f6 + 0.5f))) + (f7 / 2.0f), ((float) ((int) (f + 0.5f))) + (f7 / 2.0f));
        } else if (i == 3) {
            this.f166248j.reset();
            if (((float) this.f166244f) > this.f166239a.width() || ((float) this.f166245g) > this.f166239a.height()) {
                f3 = Math.min(this.f166239a.width() / ((float) this.f166244f), this.f166239a.height() / ((float) this.f166245g));
            } else {
                f3 = 1.0f;
            }
            this.f166248j.setScale(f3, f3);
            this.f166248j.postTranslate((float) ((int) (((this.f166239a.width() - (((float) this.f166244f) * f3)) * 0.5f) + 0.5f)), (float) ((int) (((this.f166239a.height() - (((float) this.f166245g) * f3)) * 0.5f) + 0.5f)));
            this.f166246h.set(this.f166241c);
            this.f166248j.mapRect(this.f166246h);
            RectF rectF3 = this.f166246h;
            float f8 = this.f166256r;
            rectF3.inset(f8 / 2.0f, f8 / 2.0f);
            this.f166248j.setRectToRect(this.f166241c, this.f166246h, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f166246h.set(this.f166241c);
            this.f166248j.setRectToRect(this.f166241c, this.f166239a, Matrix.ScaleToFit.END);
            this.f166248j.mapRect(this.f166246h);
            RectF rectF4 = this.f166246h;
            float f9 = this.f166256r;
            rectF4.inset(f9 / 2.0f, f9 / 2.0f);
            this.f166248j.setRectToRect(this.f166241c, this.f166246h, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.f166246h.set(this.f166241c);
            this.f166248j.setRectToRect(this.f166241c, this.f166239a, Matrix.ScaleToFit.START);
            this.f166248j.mapRect(this.f166246h);
            RectF rectF5 = this.f166246h;
            float f10 = this.f166256r;
            rectF5.inset(f10 / 2.0f, f10 / 2.0f);
            this.f166248j.setRectToRect(this.f166241c, this.f166246h, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.f166246h.set(this.f166241c);
            this.f166248j.setRectToRect(this.f166241c, this.f166239a, Matrix.ScaleToFit.CENTER);
            this.f166248j.mapRect(this.f166246h);
            RectF rectF6 = this.f166246h;
            float f11 = this.f166256r;
            rectF6.inset(f11 / 2.0f, f11 / 2.0f);
            this.f166248j.setRectToRect(this.f166241c, this.f166246h, Matrix.ScaleToFit.FILL);
        } else {
            this.f166246h.set(this.f166239a);
            RectF rectF7 = this.f166246h;
            float f12 = this.f166256r;
            rectF7.inset(f12 / 2.0f, f12 / 2.0f);
            this.f166248j.reset();
            this.f166248j.setRectToRect(this.f166241c, this.f166246h, Matrix.ScaleToFit.FILL);
        }
        this.f166240b.set(this.f166246h);
        this.f166252n = true;
    }

    /* renamed from: a */
    public C65900a mo230742a(boolean z) {
        this.f166255q = z;
        return this;
    }

    /* renamed from: a */
    public C65900a mo230737a(float f) {
        this.f166256r = f;
        this.f166247i.setStrokeWidth(f);
        return this;
    }

    /* renamed from: a */
    public static C65900a m258139a(Bitmap bitmap) {
        if (bitmap != null) {
            return new C65900a(bitmap);
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m258145b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f166239a.set(rect);
        m258140a();
    }

    public void setAlpha(int i) {
        this.f166243e.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f166243e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f166243e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f166243e.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: a */
    private static boolean m258142a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C65900a mo230743b(Shader.TileMode tileMode) {
        if (this.f166251m != tileMode) {
            this.f166251m = tileMode;
            this.f166252n = true;
            invalidateSelf();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f166257s.getColorForState(iArr, 0);
        if (this.f166247i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f166247i.setColor(colorForState);
        return true;
    }

    /* renamed from: a */
    public static Drawable m258138a(Drawable drawable) {
        if (drawable == null || (drawable instanceof C65900a)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m258138a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap b = m258143b(drawable);
        if (b != null) {
            return new C65900a(b);
        }
        return drawable;
    }

    /* renamed from: b */
    public static Bitmap m258143b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    /* renamed from: a */
    public C65900a mo230739a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f166257s = colorStateList;
        this.f166247i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public C65900a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f166241c = rectF;
        this.f166246h = new RectF();
        this.f166248j = new Matrix();
        this.f166249k = new RectF();
        this.f166250l = Shader.TileMode.CLAMP;
        this.f166251m = Shader.TileMode.CLAMP;
        this.f166252n = true;
        this.f166253o = BitmapDescriptorFactory.HUE_RED;
        this.f166254p = new boolean[]{true, true, true, true};
        this.f166255q = false;
        this.f166256r = BitmapDescriptorFactory.HUE_RED;
        this.f166257s = ColorStateList.valueOf(-16777216);
        this.f166258t = ImageView.ScaleType.FIT_CENTER;
        this.f166242d = bitmap;
        int width = bitmap.getWidth();
        this.f166244f = width;
        int height = bitmap.getHeight();
        this.f166245g = height;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
        Paint paint = new Paint();
        this.f166243e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f166247i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f166257s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f166256r);
    }

    /* renamed from: a */
    private void m258141a(Canvas canvas) {
        if (!m258145b(this.f166254p) && this.f166253o != BitmapDescriptorFactory.HUE_RED) {
            float f = this.f166240b.left;
            float f2 = this.f166240b.top;
            float width = this.f166240b.width() + f;
            float height = this.f166240b.height() + f2;
            float f3 = this.f166253o;
            if (!this.f166254p[0]) {
                this.f166249k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f166249k, this.f166243e);
            }
            if (!this.f166254p[1]) {
                this.f166249k.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f166249k, this.f166243e);
            }
            if (!this.f166254p[3]) {
                this.f166249k.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f166249k, this.f166243e);
            }
            if (!this.f166254p[2]) {
                this.f166249k.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f166249k, this.f166243e);
            }
        }
    }

    /* renamed from: b */
    private void m258144b(Canvas canvas) {
        if (!m258145b(this.f166254p) && this.f166253o != BitmapDescriptorFactory.HUE_RED) {
            float f = this.f166240b.left;
            float f2 = this.f166240b.top;
            float width = f + this.f166240b.width();
            float height = f2 + this.f166240b.height();
            float f3 = this.f166253o;
            float f4 = this.f166256r / 2.0f;
            if (!this.f166254p[0]) {
                canvas.drawLine(f - f4, f2, f + f3, f2, this.f166247i);
                canvas.drawLine(f, f2 - f4, f, f2 + f3, this.f166247i);
            }
            if (!this.f166254p[1]) {
                canvas.drawLine((width - f3) - f4, f2, width, f2, this.f166247i);
                canvas.drawLine(width, f2 - f4, width, f2 + f3, this.f166247i);
            }
            if (!this.f166254p[3]) {
                canvas.drawLine((width - f3) - f4, height, width + f4, height, this.f166247i);
                canvas.drawLine(width, height - f3, width, height, this.f166247i);
            }
            if (!this.f166254p[2]) {
                canvas.drawLine(f - f4, height, f + f3, height, this.f166247i);
                canvas.drawLine(f, height - f3, f, height, this.f166247i);
            }
        }
    }

    public void draw(Canvas canvas) {
        if (this.f166252n) {
            BitmapShader bitmapShader = new BitmapShader(this.f166242d, this.f166250l, this.f166251m);
            if (this.f166250l == Shader.TileMode.CLAMP && this.f166251m == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f166248j);
            }
            this.f166243e.setShader(bitmapShader);
            this.f166252n = false;
        }
        if (this.f166255q) {
            if (this.f166256r > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawOval(this.f166240b, this.f166243e);
                canvas.drawOval(this.f166246h, this.f166247i);
                return;
            }
            canvas.drawOval(this.f166240b, this.f166243e);
        } else if (m258142a(this.f166254p)) {
            float f = this.f166253o;
            if (this.f166256r > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRoundRect(this.f166240b, f, f, this.f166243e);
                canvas.drawRoundRect(this.f166246h, f, f, this.f166247i);
                m258141a(canvas);
                m258144b(canvas);
                return;
            }
            canvas.drawRoundRect(this.f166240b, f, f, this.f166243e);
            m258141a(canvas);
        } else {
            canvas.drawRect(this.f166240b, this.f166243e);
            if (this.f166256r > BitmapDescriptorFactory.HUE_RED) {
                canvas.drawRect(this.f166246h, this.f166247i);
            }
        }
    }

    /* renamed from: a */
    public C65900a mo230740a(Shader.TileMode tileMode) {
        if (this.f166250l != tileMode) {
            this.f166250l = tileMode;
            this.f166252n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: a */
    public C65900a mo230738a(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        boolean z4 = true;
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < BitmapDescriptorFactory.HUE_RED) {
                    throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                }
                this.f166253o = floatValue;
            } else {
                this.f166253o = BitmapDescriptorFactory.HUE_RED;
            }
            boolean[] zArr = this.f166254p;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            zArr[0] = z;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[1] = z2;
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[3] = z3;
            if (f4 <= BitmapDescriptorFactory.HUE_RED) {
                z4 = false;
            }
            zArr[2] = z4;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }
}
