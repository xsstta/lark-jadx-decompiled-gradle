package com.ss.android.lark.inv.export.ui;

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
    private static final ImageView.ScaleType f101892b = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: c */
    private static final Bitmap.Config f101893c = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final RectF f101894a;

    /* renamed from: d */
    private final RectF f101895d;

    /* renamed from: e */
    private final Matrix f101896e;

    /* renamed from: f */
    private final Paint f101897f;

    /* renamed from: g */
    private final Paint f101898g;

    /* renamed from: h */
    private final Paint f101899h;

    /* renamed from: i */
    private int f101900i;

    /* renamed from: j */
    private int f101901j;

    /* renamed from: k */
    private int f101902k;

    /* renamed from: l */
    private Bitmap f101903l;

    /* renamed from: m */
    private BitmapShader f101904m;

    /* renamed from: n */
    private int f101905n;

    /* renamed from: o */
    private int f101906o;

    /* renamed from: p */
    private float f101907p;

    /* renamed from: q */
    private float f101908q;

    /* renamed from: r */
    private ColorFilter f101909r;

    /* renamed from: s */
    private boolean f101910s;

    /* renamed from: t */
    private boolean f101911t;

    /* renamed from: u */
    private boolean f101912u;

    /* renamed from: v */
    private boolean f101913v;

    public int getBorderColor() {
        return this.f101900i;
    }

    public int getBorderWidth() {
        return this.f101901j;
    }

    public int getCircleBackgroundColor() {
        return this.f101902k;
    }

    public ColorFilter getColorFilter() {
        return this.f101909r;
    }

    /* renamed from: b */
    private void m158945b() {
        this.f101897f.setColorFilter(this.f101909r);
    }

    /* renamed from: c */
    private void m158946c() {
        if (this.f101913v) {
            this.f101903l = null;
        } else {
            this.f101903l = m158942a(getDrawable());
        }
        m158947d();
    }

    /* renamed from: a */
    private void m158943a() {
        super.setScaleType(f101892b);
        this.f101910s = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C40094a());
        }
        if (this.f101911t) {
            m158947d();
            this.f101911t = false;
        }
    }

    /* renamed from: e */
    private RectF m158948e() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: f */
    private void m158949f() {
        float f;
        float f2;
        this.f101896e.set(null);
        float height = ((float) this.f101905n) * this.f101895d.height();
        float width = this.f101895d.width() * ((float) this.f101906o);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (height > width) {
            f2 = this.f101895d.height() / ((float) this.f101906o);
            f3 = (this.f101895d.width() - (((float) this.f101905n) * f2)) * 0.5f;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = this.f101895d.width() / ((float) this.f101905n);
            f = (this.f101895d.height() - (((float) this.f101906o) * f2)) * 0.5f;
        }
        this.f101896e.setScale(f2, f2);
        this.f101896e.postTranslate(((float) ((int) (f3 + 0.5f))) + this.f101895d.left, ((float) ((int) (f + 0.5f))) + this.f101895d.top);
        this.f101904m.setLocalMatrix(this.f101896e);
    }

    /* renamed from: d */
    private void m158947d() {
        int i;
        if (!this.f101910s) {
            this.f101911t = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f101903l == null) {
                invalidate();
                return;
            }
            this.f101904m = new BitmapShader(this.f101903l, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f101897f.setAntiAlias(true);
            this.f101897f.setShader(this.f101904m);
            this.f101898g.setStyle(Paint.Style.STROKE);
            this.f101898g.setAntiAlias(true);
            this.f101898g.setColor(this.f101900i);
            this.f101898g.setStrokeWidth((float) this.f101901j);
            this.f101899h.setStyle(Paint.Style.FILL);
            this.f101899h.setAntiAlias(true);
            this.f101899h.setColor(this.f101902k);
            this.f101906o = this.f101903l.getHeight();
            this.f101905n = this.f101903l.getWidth();
            this.f101894a.set(m158948e());
            this.f101908q = Math.min((this.f101894a.height() - ((float) this.f101901j)) / 2.0f, (this.f101894a.width() - ((float) this.f101901j)) / 2.0f);
            this.f101895d.set(this.f101894a);
            if (!this.f101912u && (i = this.f101901j) > 0) {
                this.f101895d.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
            }
            this.f101907p = Math.min(this.f101895d.height() / 2.0f, this.f101895d.width() / 2.0f);
            m158945b();
            m158949f();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inv.export.ui.CircleImageView$a */
    public class C40094a extends ViewOutlineProvider {
        private C40094a() {
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f101894a.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m158946c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m158946c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m158946c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m158946c();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i != this.f101900i) {
            this.f101900i = i;
            this.f101898g.setColor(i);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f101912u) {
            this.f101912u = z;
            m158947d();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f101901j) {
            this.f101901j = i;
            m158947d();
        }
    }

    public void setCircleBackgroundColor(int i) {
        if (i != this.f101902k) {
            this.f101902k = i;
            this.f101899h.setColor(i);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f101909r) {
            this.f101909r = colorFilter;
            m158945b();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f101913v != z) {
            this.f101913v = z;
            m158946c();
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.f101895d = new RectF();
        this.f101894a = new RectF();
        this.f101896e = new Matrix();
        this.f101897f = new Paint();
        this.f101898g = new Paint();
        this.f101899h = new Paint();
        this.f101900i = -16777216;
        this.f101901j = 0;
        this.f101902k = 0;
        m158943a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f101913v) {
            return super.onTouchEvent(motionEvent);
        }
        if (!m158944a(motionEvent.getX(), motionEvent.getY()) || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Bitmap m158942a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, f101893c);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f101893c);
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
        if (this.f101913v) {
            super.onDraw(canvas);
        } else if (this.f101903l != null) {
            if (this.f101902k != 0) {
                canvas.drawCircle(this.f101895d.centerX(), this.f101895d.centerY(), this.f101907p, this.f101899h);
            }
            canvas.drawCircle(this.f101895d.centerX(), this.f101895d.centerY(), this.f101907p, this.f101897f);
            if (this.f101901j > 0) {
                canvas.drawCircle(this.f101894a.centerX(), this.f101894a.centerY(), this.f101908q, this.f101898g);
            }
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m158944a(float f, float f2) {
        if (!this.f101894a.isEmpty() && Math.pow((double) (f - this.f101894a.centerX()), 2.0d) + Math.pow((double) (f2 - this.f101894a.centerY()), 2.0d) > Math.pow((double) this.f101908q, 2.0d)) {
            return false;
        }
        return true;
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f101895d = new RectF();
        this.f101894a = new RectF();
        this.f101896e = new Matrix();
        this.f101897f = new Paint();
        this.f101898g = new Paint();
        this.f101899h = new Paint();
        this.f101900i = -16777216;
        this.f101901j = 0;
        this.f101902k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mi_civ_border_color, R.attr.mi_civ_border_overlay, R.attr.mi_civ_border_width, R.attr.mi_civ_circle_background_color}, i, 0);
        this.f101901j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f101900i = obtainStyledAttributes.getColor(0, -16777216);
        this.f101912u = obtainStyledAttributes.getBoolean(1, false);
        this.f101902k = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        m158943a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m158947d();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m158947d();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m158947d();
    }
}
