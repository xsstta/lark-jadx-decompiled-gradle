package com.tt.miniapp.view.lark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: b */
    private static final ImageView.ScaleType f169502b = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: c */
    private static final Bitmap.Config f169503c = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final RectF f169504a;

    /* renamed from: d */
    private final Matrix f169505d;

    /* renamed from: e */
    private final Paint f169506e;

    /* renamed from: f */
    private Bitmap f169507f;

    /* renamed from: g */
    private BitmapShader f169508g;

    /* renamed from: h */
    private int f169509h;

    /* renamed from: i */
    private int f169510i;

    /* renamed from: j */
    private float f169511j;

    /* renamed from: k */
    private ColorFilter f169512k;

    /* renamed from: l */
    private boolean f169513l;

    /* renamed from: m */
    private boolean f169514m;

    /* renamed from: n */
    private boolean f169515n;

    public ColorFilter getColorFilter() {
        return this.f169512k;
    }

    public ImageView.ScaleType getScaleType() {
        return f169502b;
    }

    /* renamed from: b */
    private void m261854b() {
        this.f169506e.setColorFilter(this.f169512k);
    }

    /* renamed from: c */
    private void m261855c() {
        if (this.f169515n) {
            this.f169507f = null;
        } else {
            this.f169507f = m261851a(getDrawable());
        }
        m261856d();
    }

    /* renamed from: a */
    private void m261852a() {
        super.setScaleType(f169502b);
        this.f169513l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C67196a());
        }
        if (this.f169514m) {
            m261856d();
            this.f169514m = false;
        }
    }

    /* renamed from: e */
    private RectF m261857e() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: d */
    private void m261856d() {
        if (!this.f169513l) {
            this.f169514m = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f169507f == null) {
                invalidate();
                return;
            }
            this.f169508g = new BitmapShader(this.f169507f, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f169506e.setAntiAlias(true);
            this.f169506e.setShader(this.f169508g);
            this.f169510i = this.f169507f.getHeight();
            this.f169509h = this.f169507f.getWidth();
            this.f169504a.set(m261857e());
            this.f169511j = Math.min(this.f169504a.height() / 2.0f, this.f169504a.width() / 2.0f);
            m261854b();
            m261858f();
            invalidate();
        }
    }

    /* renamed from: f */
    private void m261858f() {
        float f;
        float f2;
        this.f169505d.set(null);
        float height = ((float) this.f169509h) * this.f169504a.height();
        float width = this.f169504a.width() * ((float) this.f169510i);
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (height > width) {
            f2 = this.f169504a.height() / ((float) this.f169510i);
            f3 = (this.f169504a.width() - (((float) this.f169509h) * f2)) * 0.5f;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = this.f169504a.width() / ((float) this.f169509h);
            f = (this.f169504a.height() - (((float) this.f169510i) * f2)) * 0.5f;
        }
        this.f169505d.setScale(f2, f2);
        this.f169505d.postTranslate(((float) ((int) (f3 + 0.5f))) + this.f169504a.left, ((float) ((int) (f + 0.5f))) + this.f169504a.top);
        this.f169508g.setLocalMatrix(this.f169505d);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.lark.CircleImageView$a */
    public class C67196a extends ViewOutlineProvider {
        private C67196a() {
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f169504a.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m261855c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m261855c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        m261855c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m261855c();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f169512k) {
            this.f169512k = colorFilter;
            m261854b();
            invalidate();
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.f169504a = new RectF();
        this.f169505d = new Matrix();
        this.f169506e = new Paint();
        this.f169515n = false;
        m261852a();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f169502b) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f169515n) {
            super.onDraw(canvas);
        } else if (this.f169507f != null) {
            canvas.drawCircle(this.f169504a.centerX(), this.f169504a.centerY(), this.f169511j, this.f169506e);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f169515n) {
            return super.onTouchEvent(motionEvent);
        }
        if (!m261853a(motionEvent.getX(), motionEvent.getY()) || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Bitmap m261851a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, f169503c);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f169503c);
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

    public void setImageAlpha(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            f = 1.0f;
        }
        setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f}));
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m261853a(float f, float f2) {
        if (!this.f169504a.isEmpty() && Math.pow((double) (f - this.f169504a.centerX()), 2.0d) + Math.pow((double) (f2 - this.f169504a.centerY()), 2.0d) > Math.pow((double) this.f169511j, 2.0d)) {
            return false;
        }
        return true;
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f169504a = new RectF();
        this.f169505d = new Matrix();
        this.f169506e = new Paint();
        this.f169515n = false;
        m261852a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m261856d();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m261856d();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m261856d();
    }
}
