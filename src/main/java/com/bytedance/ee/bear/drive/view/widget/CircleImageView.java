package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class CircleImageView extends ImageView {

    /* renamed from: b */
    private static final ImageView.ScaleType f20454b = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: c */
    private static final Bitmap.Config f20455c = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final RectF f20456a;

    /* renamed from: d */
    private final RectF f20457d;

    /* renamed from: e */
    private final Matrix f20458e;

    /* renamed from: f */
    private final Paint f20459f;

    /* renamed from: g */
    private final Paint f20460g;

    /* renamed from: h */
    private final Paint f20461h;

    /* renamed from: i */
    private int f20462i;

    /* renamed from: j */
    private int f20463j;

    /* renamed from: k */
    private int f20464k;

    /* renamed from: l */
    private Bitmap f20465l;

    /* renamed from: m */
    private BitmapShader f20466m;

    /* renamed from: n */
    private int f20467n;

    /* renamed from: o */
    private int f20468o;

    /* renamed from: p */
    private float f20469p;

    /* renamed from: q */
    private float f20470q;

    /* renamed from: r */
    private ColorFilter f20471r;

    /* renamed from: s */
    private boolean f20472s;

    /* renamed from: t */
    private boolean f20473t;

    /* renamed from: u */
    private boolean f20474u;

    /* renamed from: v */
    private boolean f20475v;

    public int getBorderColor() {
        return this.f20462i;
    }

    public int getBorderWidth() {
        return this.f20463j;
    }

    public int getCircleBackgroundColor() {
        return this.f20464k;
    }

    public ColorFilter getColorFilter() {
        return this.f20471r;
    }

    public ImageView.ScaleType getScaleType() {
        return f20454b;
    }

    /* renamed from: b */
    private void m30307b() {
        this.f20459f.setColorFilter(this.f20471r);
    }

    /* renamed from: c */
    private void m30308c() {
        if (this.f20475v) {
            this.f20465l = null;
        } else {
            this.f20465l = m30304a(getDrawable());
        }
        m30309d();
    }

    /* renamed from: a */
    private void m30305a() {
        super.setScaleType(f20454b);
        this.f20472s = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C7559a());
        }
        if (this.f20473t) {
            m30309d();
            this.f20473t = false;
        }
    }

    /* renamed from: e */
    private RectF m30310e() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: f */
    private void m30311f() {
        float f;
        float f2;
        this.f20458e.set(null);
        float height = ((float) this.f20467n) * this.f20457d.height();
        float width = this.f20457d.width() * ((float) this.f20468o);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (height > width) {
            f2 = this.f20457d.height() / ((float) this.f20468o);
            f3 = (this.f20457d.width() - (((float) this.f20467n) * f2)) * 0.5f;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = this.f20457d.width() / ((float) this.f20467n);
            f = (this.f20457d.height() - (((float) this.f20468o) * f2)) * 0.5f;
        }
        this.f20458e.setScale(f2, f2);
        this.f20458e.postTranslate(((float) ((int) (f3 + 0.5f))) + this.f20457d.left, ((float) ((int) (f + 0.5f))) + this.f20457d.top);
        this.f20466m.setLocalMatrix(this.f20458e);
    }

    /* renamed from: d */
    private void m30309d() {
        int i;
        if (!this.f20472s) {
            this.f20473t = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f20465l == null) {
                invalidate();
                return;
            }
            this.f20466m = new BitmapShader(this.f20465l, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f20459f.setAntiAlias(true);
            this.f20459f.setShader(this.f20466m);
            this.f20460g.setStyle(Paint.Style.STROKE);
            this.f20460g.setAntiAlias(true);
            this.f20460g.setColor(this.f20462i);
            this.f20460g.setStrokeWidth((float) this.f20463j);
            this.f20461h.setStyle(Paint.Style.FILL);
            this.f20461h.setAntiAlias(true);
            this.f20461h.setColor(this.f20464k);
            this.f20468o = this.f20465l.getHeight();
            this.f20467n = this.f20465l.getWidth();
            this.f20456a.set(m30310e());
            this.f20470q = Math.min((this.f20456a.height() - ((float) this.f20463j)) / 2.0f, (this.f20456a.width() - ((float) this.f20463j)) / 2.0f);
            this.f20457d.set(this.f20456a);
            if (!this.f20474u && (i = this.f20463j) > 0) {
                this.f20457d.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
            }
            this.f20469p = Math.min(this.f20457d.height() / 2.0f, this.f20457d.width() / 2.0f);
            m30307b();
            m30311f();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.widget.CircleImageView$a */
    public class C7559a extends ViewOutlineProvider {
        private C7559a() {
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f20456a.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m30308c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m30308c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m30308c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m30308c();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i != this.f20462i) {
            this.f20462i = i;
            this.f20460g.setColor(i);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f20474u) {
            this.f20474u = z;
            m30309d();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f20463j) {
            this.f20463j = i;
            m30309d();
        }
    }

    public void setCircleBackgroundColor(int i) {
        if (i != this.f20464k) {
            this.f20464k = i;
            this.f20461h.setColor(i);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f20471r) {
            this.f20471r = colorFilter;
            m30307b();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f20475v != z) {
            this.f20475v = z;
            m30308c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m30306a(motionEvent.getX(), motionEvent.getY()) || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f20454b) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.f20457d = new RectF();
        this.f20456a = new RectF();
        this.f20458e = new Matrix();
        this.f20459f = new Paint();
        this.f20460g = new Paint();
        this.f20461h = new Paint();
        this.f20462i = -16777216;
        this.f20463j = 0;
        this.f20464k = 0;
        m30305a();
    }

    /* renamed from: a */
    private Bitmap m30304a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, f20455c);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f20455c);
            }
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f20475v) {
            super.onDraw(canvas);
        } else if (this.f20465l != null) {
            if (this.f20464k != 0) {
                canvas.drawCircle(this.f20457d.centerX(), this.f20457d.centerY(), this.f20469p, this.f20461h);
            }
            canvas.drawCircle(this.f20457d.centerX(), this.f20457d.centerY(), this.f20469p, this.f20459f);
            if (this.f20463j > 0) {
                canvas.drawCircle(this.f20456a.centerX(), this.f20456a.centerY(), this.f20470q, this.f20460g);
            }
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m30306a(float f, float f2) {
        if (Math.pow((double) (f - this.f20456a.centerX()), 2.0d) + Math.pow((double) (f2 - this.f20456a.centerY()), 2.0d) <= Math.pow((double) this.f20470q, 2.0d)) {
            return true;
        }
        return false;
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20457d = new RectF();
        this.f20456a = new RectF();
        this.f20458e = new Matrix();
        this.f20459f = new Paint();
        this.f20460g = new Paint();
        this.f20461h = new Paint();
        this.f20462i = -16777216;
        this.f20463j = 0;
        this.f20464k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drive_civ_border_color, R.attr.drive_civ_border_overlay, R.attr.drive_civ_border_width, R.attr.drive_civ_circle_background_color}, i, 0);
        this.f20463j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f20462i = obtainStyledAttributes.getColor(0, -16777216);
        this.f20474u = obtainStyledAttributes.getBoolean(1, false);
        this.f20464k = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        m30305a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m30309d();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m30309d();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m30309d();
    }
}
