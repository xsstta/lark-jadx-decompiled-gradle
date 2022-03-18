package com.ss.android.lark.passport.infra.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;

public class RoundedImageView extends AppCompatImageView {

    /* renamed from: a */
    Drawable f123589a;

    /* renamed from: b */
    Paint f123590b;

    /* renamed from: c */
    private final int f123591c;

    /* renamed from: d */
    private final int f123592d;

    /* renamed from: e */
    private float f123593e;

    /* renamed from: f */
    private int f123594f;

    /* renamed from: g */
    private int f123595g;

    /* renamed from: h */
    private PorterDuffColorFilter f123596h;

    /* renamed from: i */
    private boolean f123597i;

    /* renamed from: j */
    private boolean f123598j;

    /* renamed from: k */
    private Matrix f123599k;

    /* renamed from: l */
    private Path f123600l;

    /* renamed from: m */
    private Paint f123601m;

    /* renamed from: n */
    private final RectF f123602n;

    /* renamed from: o */
    private final RectF f123603o;

    /* renamed from: p */
    private final RectF f123604p;

    /* renamed from: q */
    private final float[] f123605q;

    public float getCornerRadius() {
        return this.f123605q[0];
    }

    /* renamed from: a */
    private void m194092a() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        Paint paint = new Paint();
        this.f123590b = paint;
        paint.setFilterBitmap(true);
        this.f123590b.setAntiAlias(true);
        this.f123590b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f123600l = new Path();
        Paint paint2 = new Paint();
        this.f123601m = paint2;
        paint2.setAntiAlias(true);
        this.f123601m.setStyle(Paint.Style.STROKE);
        if (this.f123591c != 0) {
            this.f123596h = new PorterDuffColorFilter(this.f123591c, PorterDuff.Mode.DARKEN);
        }
        this.f123599k = new Matrix();
    }

    /* renamed from: b */
    private void m194095b() {
        this.f123604p.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        Drawable drawable = this.f123589a;
        if (drawable != null) {
            drawable.setBounds((int) this.f123604p.left, (int) this.f123604p.top, (int) this.f123604p.right, (int) this.f123604p.bottom);
        }
        float f = (this.f123593e * 1.0f) / 2.0f;
        this.f123602n.set(this.f123604p);
        this.f123602n.inset(f, f);
        this.f123603o.set(this.f123604p);
        RectF rectF = this.f123603o;
        float f2 = this.f123593e;
        int i = this.f123595g;
        rectF.inset(((float) i) + f2, f2 + ((float) i));
    }

    public void setCornerRadiusDP(float f) {
        mo171783a(f, f, f, f);
    }

    public RoundedImageView(Context context) {
        this(context, null);
    }

    public void setOval(boolean z) {
        this.f123597i = z;
        invalidate();
    }

    public void setBorderColor(int i) {
        if (this.f123594f != i) {
            this.f123594f = i;
            invalidate();
        }
    }

    public void setBorderDrawable(Drawable drawable) {
        if (this.f123589a != drawable) {
            this.f123589a = drawable;
            invalidate();
        }
    }

    /* renamed from: a */
    private boolean m194094a(Drawable drawable) {
        if (drawable == null) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getWidth() > 0 && getHeight() > 0) {
            m194095b();
            m194093a(canvas);
        }
    }

    public void setBorderPaddingInDp(float f) {
        float a = (float) C49154ag.m193828a(getContext(), f);
        if (a != ((float) this.f123595g)) {
            this.f123595g = (int) a;
            invalidate();
        }
    }

    public void setBorderWidthDP(float f) {
        float a = (float) C49154ag.m193828a(getContext(), f);
        if (a != this.f123593e) {
            this.f123593e = a;
            invalidate();
        }
    }

    public void setSelected(boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z != isSelected()) {
            super.setSelected(z);
            if (z) {
                porterDuffColorFilter = this.f123596h;
            } else {
                porterDuffColorFilter = null;
            }
            setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        } else if (!this.f123598j) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (motionEvent.getAction() != 0) {
                setSelected(false);
            } else {
                setSelected(true);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    private void m194093a(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (m194094a(drawable)) {
            Rect bounds = drawable.getBounds();
            if (bounds.width() != 0 && bounds.height() != 0) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = bounds.width();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = bounds.height();
                }
                float f = (float) intrinsicWidth;
                float f2 = (float) intrinsicHeight;
                float max = Math.max((this.f123603o.width() * 1.0f) / f, (this.f123603o.height() * 1.0f) / f2);
                this.f123599k.reset();
                this.f123599k.setScale(max, max);
                this.f123599k.postTranslate((-((f * max) - ((float) getWidth()))) / 2.0f, (-((max * f2) - ((float) getHeight()))) / 2.0f);
                int saveCount = canvas.getSaveCount();
                canvas.save();
                this.f123600l.reset();
                if (this.f123597i) {
                    this.f123600l.addOval(this.f123603o, Path.Direction.CW);
                } else {
                    this.f123600l.addRoundRect(this.f123603o, this.f123605q, Path.Direction.CW);
                }
                canvas.clipPath(this.f123600l);
                if (getCropToPadding()) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    canvas.clipRect(getPaddingLeft() + scrollX, getPaddingTop() + scrollY, ((scrollX + getRight()) - getLeft()) - getPaddingRight(), ((scrollY + getBottom()) - getTop()) - getPaddingRight());
                }
                Matrix matrix = this.f123599k;
                if (matrix != null) {
                    canvas.concat(matrix);
                }
                drawable.draw(canvas);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!this.f123597i) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                boolean z2 = false;
                if (mode == Integer.MIN_VALUE || mode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                    z2 = true;
                }
                float intrinsicWidth = (float) drawable.getIntrinsicWidth();
                float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                float f = ((float) measuredWidth) / intrinsicWidth;
                float f2 = ((float) measuredHeight) / intrinsicHeight;
                if (z && z2) {
                    int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i3 >= 0 && f2 >= 1.0f) {
                        setMeasuredDimension((int) intrinsicWidth, (int) intrinsicHeight);
                    } else if (i3 >= 0) {
                        setMeasuredDimension((int) (intrinsicHeight * f2), measuredHeight);
                    } else if (f2 >= 1.0f) {
                        setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                    } else if (f < f2) {
                        setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                    } else {
                        setMeasuredDimension((int) (intrinsicWidth * f2), measuredHeight);
                    }
                } else if (z) {
                    setMeasuredDimension((int) (intrinsicWidth * f2), measuredHeight);
                } else if (z2) {
                    setMeasuredDimension(measuredWidth, (int) (intrinsicHeight * f));
                }
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123598j = true;
        this.f123602n = new RectF();
        this.f123603o = new RectF();
        this.f123604p = new RectF();
        float[] fArr = new float[8];
        this.f123605q = fArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.civ_badge_background, R.attr.civ_badge_icon, R.attr.civ_badge_min_size, R.attr.civ_badge_padding, R.attr.civ_badge_position_angle, R.attr.civ_badge_text, R.attr.civ_badge_text_color, R.attr.civ_badge_text_size, R.attr.civ_border_color, R.attr.civ_border_drawable, R.attr.civ_border_padding, R.attr.civ_border_width, R.attr.civ_oval, R.attr.civ_radius, R.attr.civ_radius_left_bottom, R.attr.civ_radius_left_top, R.attr.civ_radius_right_bottom, R.attr.civ_radius_right_top, R.attr.civ_selected_board_color, R.attr.civ_selected_mask_color, R.attr.civ_touch_select_enable}, i, 0);
        this.f123593e = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f123594f = obtainStyledAttributes.getColor(8, -1);
        this.f123595g = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f123589a = obtainStyledAttributes.getDrawable(9);
        this.f123598j = obtainStyledAttributes.getBoolean(20, true);
        this.f123592d = obtainStyledAttributes.getColor(18, this.f123594f);
        this.f123591c = obtainStyledAttributes.getColor(19, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(16, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        float f = (float) dimensionPixelSize2;
        fArr[1] = f;
        fArr[0] = f;
        float f2 = (float) dimensionPixelSize3;
        fArr[3] = f2;
        fArr[2] = f2;
        float f3 = (float) dimensionPixelSize4;
        fArr[5] = f3;
        fArr[4] = f3;
        float f4 = (float) dimensionPixelSize5;
        fArr[7] = f4;
        fArr[6] = f4;
        this.f123597i = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        m194092a();
    }

    /* renamed from: a */
    public void mo171783a(float f, float f2, float f3, float f4) {
        float a = (float) C49154ag.m193828a(getContext(), f);
        float a2 = (float) C49154ag.m193828a(getContext(), f2);
        float a3 = (float) C49154ag.m193828a(getContext(), f3);
        float a4 = (float) C49154ag.m193828a(getContext(), f4);
        float[] fArr = this.f123605q;
        if (a != fArr[0] || a2 != fArr[2] || a3 != fArr[4] || a4 != fArr[6]) {
            fArr[1] = a;
            fArr[0] = a;
            fArr[3] = a2;
            fArr[2] = a2;
            fArr[5] = a3;
            fArr[4] = a3;
            fArr[7] = a4;
            fArr[6] = a4;
            this.f123597i = false;
            invalidate();
        }
    }
}
