package com.tt.miniapp.component.nativeview.game;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundedImageView extends ImageView {

    /* renamed from: a */
    public static final Shader.TileMode f166220a = Shader.TileMode.CLAMP;

    /* renamed from: b */
    static final /* synthetic */ boolean f166221b = true;

    /* renamed from: c */
    private static final ImageView.ScaleType[] f166222c = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: d */
    private final float[] f166223d;

    /* renamed from: e */
    private Drawable f166224e;

    /* renamed from: f */
    private ColorStateList f166225f;

    /* renamed from: g */
    private float f166226g;

    /* renamed from: h */
    private ColorFilter f166227h;

    /* renamed from: i */
    private boolean f166228i;

    /* renamed from: j */
    private Drawable f166229j;

    /* renamed from: k */
    private boolean f166230k;

    /* renamed from: l */
    private boolean f166231l;

    /* renamed from: m */
    private boolean f166232m;

    /* renamed from: n */
    private int f166233n;

    /* renamed from: o */
    private int f166234o;

    /* renamed from: p */
    private ImageView.ScaleType f166235p;

    /* renamed from: q */
    private Shader.TileMode f166236q;

    /* renamed from: r */
    private Shader.TileMode f166237r;

    public ColorStateList getBorderColors() {
        return this.f166225f;
    }

    public float getBorderWidth() {
        return this.f166226g;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f166235p;
    }

    public Shader.TileMode getTileModeX() {
        return this.f166236q;
    }

    public Shader.TileMode getTileModeY() {
        return this.f166237r;
    }

    /* renamed from: c */
    private void m258135c() {
        m258132a(this.f166229j, this.f166235p);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f166225f.getDefaultColor();
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    /* renamed from: d */
    private void m258136d() {
        Drawable drawable = this.f166229j;
        if (drawable != null && this.f166228i) {
            Drawable mutate = drawable.mutate();
            this.f166229j = mutate;
            if (this.f166230k) {
                mutate.setColorFilter(this.f166227h);
            }
        }
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.f166223d;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (float f2 : fArr) {
            f = Math.max(f2, f);
        }
        return f;
    }

    /* renamed from: a */
    private Drawable m258131a() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f166233n;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f166233n, e);
                this.f166233n = 0;
            }
        }
        return C65900a.m258138a(drawable);
    }

    /* renamed from: b */
    private Drawable m258134b() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f166234o;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f166234o, e);
                this.f166234o = 0;
            }
        }
        return C65900a.m258138a(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.component.nativeview.game.RoundedImageView$1 */
    public static /* synthetic */ class C658991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f166238a;

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
                com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.f166238a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.component.nativeview.game.RoundedImageView.C658991.<clinit>():void");
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setCornerRadius(float f) {
        mo230708a(f, f, f, f);
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f166224e = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f166224e = drawable;
        m258133a(f166221b);
        super.setBackgroundDrawable(this.f166224e);
    }

    public void setBackgroundResource(int i) {
        if (this.f166234o != i) {
            this.f166234o = i;
            Drawable b = m258134b();
            this.f166224e = b;
            setBackgroundDrawable(b);
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        mo230708a(dimension, dimension, dimension, dimension);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f166231l = z;
        m258135c();
        m258133a(false);
        invalidate();
    }

    /* renamed from: a */
    private static Shader.TileMode m258130a(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    public void setBorderWidth(float f) {
        if (this.f166226g != f) {
            this.f166226g = f;
            m258135c();
            m258133a(false);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f166227h != colorFilter) {
            this.f166227h = colorFilter;
            this.f166230k = f166221b;
            this.f166228i = f166221b;
            m258136d();
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f166233n = 0;
        this.f166229j = C65900a.m258139a(bitmap);
        m258135c();
        super.setImageDrawable(this.f166229j);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f166233n = 0;
        this.f166229j = C65900a.m258138a(drawable);
        m258135c();
        super.setImageDrawable(this.f166229j);
    }

    public void setImageResource(int i) {
        if (this.f166233n != i) {
            this.f166233n = i;
            this.f166229j = m258131a();
            m258135c();
            super.setImageDrawable(this.f166229j);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f166236q != tileMode) {
            this.f166236q = tileMode;
            m258135c();
            m258133a(false);
            invalidate();
        }
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f166237r != tileMode) {
            this.f166237r = tileMode;
            m258135c();
            m258133a(false);
            invalidate();
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f166223d = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f166225f = ColorStateList.valueOf(-16777216);
        this.f166226g = BitmapDescriptorFactory.HUE_RED;
        this.f166227h = null;
        this.f166228i = false;
        this.f166230k = false;
        this.f166231l = false;
        this.f166232m = false;
        Shader.TileMode tileMode = f166220a;
        this.f166236q = tileMode;
        this.f166237r = tileMode;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f166225f.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f166225f = colorStateList;
            m258135c();
            m258133a(false);
            if (this.f166226g > BitmapDescriptorFactory.HUE_RED) {
                invalidate();
            }
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f166221b && scaleType == null) {
            throw new AssertionError();
        } else if (this.f166235p != scaleType) {
            this.f166235p = scaleType;
            switch (C658991.f166238a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m258135c();
            m258133a(false);
            invalidate();
        }
    }

    /* renamed from: a */
    private void m258133a(boolean z) {
        if (this.f166232m) {
            if (z) {
                this.f166224e = C65900a.m258138a(this.f166224e);
            }
            m258132a(this.f166224e, ImageView.ScaleType.FIT_XY);
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m258132a(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            if (drawable instanceof C65900a) {
                C65900a aVar = (C65900a) drawable;
                aVar.mo230741a(scaleType).mo230737a(this.f166226g).mo230739a(this.f166225f).mo230742a(this.f166231l).mo230740a(this.f166236q).mo230743b(this.f166237r);
                float[] fArr = this.f166223d;
                if (fArr != null) {
                    aVar.mo230738a(fArr[0], fArr[1], fArr[3], fArr[2]);
                }
                m258136d();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    m258132a(layerDrawable.getDrawable(i), scaleType);
                }
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f166223d = fArr;
        this.f166225f = ColorStateList.valueOf(-16777216);
        this.f166226g = BitmapDescriptorFactory.HUE_RED;
        this.f166227h = null;
        this.f166228i = false;
        this.f166230k = false;
        this.f166231l = false;
        this.f166232m = false;
        Shader.TileMode tileMode = f166220a;
        this.f166236q = tileMode;
        this.f166237r = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843037, R.attr.tma_riv_border_color, R.attr.tma_riv_border_width, R.attr.tma_riv_corner_radius, R.attr.tma_riv_corner_radius_bottom_left, R.attr.tma_riv_corner_radius_bottom_right, R.attr.tma_riv_corner_radius_top_left, R.attr.tma_riv_corner_radius_top_right, R.attr.tma_riv_mutate_background, R.attr.tma_riv_oval, R.attr.tma_riv_tile_mode, R.attr.tma_riv_tile_mode_x, R.attr.tma_riv_tile_mode_y}, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setScaleType(f166222c[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(3, -1);
        fArr[0] = (float) obtainStyledAttributes.getDimensionPixelSize(6, -1);
        fArr[1] = (float) obtainStyledAttributes.getDimensionPixelSize(7, -1);
        fArr[3] = (float) obtainStyledAttributes.getDimensionPixelSize(5, -1);
        fArr[2] = (float) obtainStyledAttributes.getDimensionPixelSize(4, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f166223d;
            if (fArr2[i3] < BitmapDescriptorFactory.HUE_RED) {
                fArr2[i3] = 0.0f;
            } else {
                z = f166221b;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : dimensionPixelSize;
            int length2 = this.f166223d.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f166223d[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.f166226g = dimensionPixelSize2;
        if (dimensionPixelSize2 < BitmapDescriptorFactory.HUE_RED) {
            this.f166226g = BitmapDescriptorFactory.HUE_RED;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        this.f166225f = colorStateList;
        if (colorStateList == null) {
            this.f166225f = ColorStateList.valueOf(-16777216);
        }
        this.f166232m = obtainStyledAttributes.getBoolean(8, false);
        this.f166231l = obtainStyledAttributes.getBoolean(9, false);
        int i5 = obtainStyledAttributes.getInt(10, -2);
        if (i5 != -2) {
            setTileModeX(m258130a(i5));
            setTileModeY(m258130a(i5));
        }
        int i6 = obtainStyledAttributes.getInt(11, -2);
        if (i6 != -2) {
            setTileModeX(m258130a(i6));
        }
        int i7 = obtainStyledAttributes.getInt(12, -2);
        if (i7 != -2) {
            setTileModeY(m258130a(i7));
        }
        m258135c();
        m258133a(f166221b);
        if (this.f166232m) {
            super.setBackgroundDrawable(this.f166224e);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo230708a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f166223d;
        if (fArr[0] != f || fArr[1] != f2 || fArr[3] != f4 || fArr[2] != f3) {
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
            fArr[3] = f4;
            m258135c();
            m258133a(false);
            invalidate();
        }
    }
}
