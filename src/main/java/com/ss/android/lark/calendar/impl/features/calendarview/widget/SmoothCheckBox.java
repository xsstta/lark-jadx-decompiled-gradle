package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class SmoothCheckBox extends View implements Checkable {

    /* renamed from: i */
    private static final int f78475i = Color.parseColor("#FB4846");

    /* renamed from: j */
    private static final int f78476j = Color.parseColor("#DFDFDF");

    /* renamed from: a */
    public float f78477a;

    /* renamed from: b */
    public float f78478b;

    /* renamed from: c */
    public float f78479c;

    /* renamed from: d */
    public int f78480d;

    /* renamed from: e */
    public int f78481e;

    /* renamed from: f */
    public int f78482f;

    /* renamed from: g */
    public int f78483g;

    /* renamed from: h */
    public boolean f78484h;

    /* renamed from: k */
    private Paint f78485k;

    /* renamed from: l */
    private Paint f78486l;

    /* renamed from: m */
    private Paint f78487m;

    /* renamed from: n */
    private Point[] f78488n;

    /* renamed from: o */
    private Point f78489o;

    /* renamed from: p */
    private Path f78490p;

    /* renamed from: q */
    private float f78491q;

    /* renamed from: r */
    private float f78492r;

    /* renamed from: s */
    private int f78493s;

    /* renamed from: t */
    private int f78494t;

    /* renamed from: u */
    private int f78495u;

    /* renamed from: v */
    private boolean f78496v;

    /* renamed from: w */
    private boolean f78497w;

    /* renamed from: x */
    private boolean f78498x;

    /* renamed from: y */
    private AbstractC31096a f78499y;

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox$a */
    public interface AbstractC31096a {
        /* renamed from: a */
        void mo112643a(SmoothCheckBox smoothCheckBox, boolean z);
    }

    public boolean isChecked() {
        return this.f78496v;
    }

    /* renamed from: d */
    private void m116064d() {
        postDelayed(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.RunnableC310957 */

            public void run() {
                SmoothCheckBox.this.f78484h = true;
                SmoothCheckBox.this.postInvalidate();
            }
        }, (long) this.f78494t);
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("InstanceState", super.onSaveInstanceState());
        bundle.putBoolean("InstanceState", isChecked());
        return bundle;
    }

    /* renamed from: c */
    private void m116062c() {
        int i;
        this.f78484h = true;
        float f = 1.0f;
        this.f78479c = 1.0f;
        boolean isChecked = isChecked();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (isChecked) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f78478b = f;
        if (isChecked()) {
            i = this.f78480d;
        } else {
            i = this.f78483g;
        }
        this.f78482f = i;
        if (isChecked()) {
            f2 = this.f78491q + this.f78492r;
        }
        this.f78477a = f2;
    }

    /* renamed from: b */
    public void mo112624b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration((long) this.f78494t);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.C310935 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.f78478b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.f78482f = SmoothCheckBox.m116058a(smoothCheckBox.f78480d, SmoothCheckBox.this.f78483g, SmoothCheckBox.this.f78478b);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration((long) this.f78494t);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.C310946 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.f78479c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat2.start();
    }

    /* renamed from: a */
    public void mo112623a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration((long) ((this.f78494t / 3) * 2));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.C310913 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.f78478b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
                smoothCheckBox.f78482f = SmoothCheckBox.m116058a(smoothCheckBox.f78481e, SmoothCheckBox.this.f78480d, 1.0f - SmoothCheckBox.this.f78478b);
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration((long) this.f78494t);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.C310924 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmoothCheckBox.this.f78479c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SmoothCheckBox.this.postInvalidate();
            }
        });
        ofFloat2.start();
        m116064d();
    }

    public void setCheckedColor(int i) {
        this.f78480d = i;
    }

    public void setOnCheckedChangeListener(AbstractC31096a aVar) {
        this.f78499y = aVar;
    }

    public SmoothCheckBox(Context context) {
        this(context, null);
    }

    public void setUnCheckedStrokeColor(int i) {
        this.f78482f = i;
        this.f78483g = i;
    }

    /* renamed from: c */
    private void m116063c(Canvas canvas) {
        if (this.f78484h && isChecked()) {
            m116065d(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m116061b(canvas);
        m116059a(canvas);
        m116063c(canvas);
    }

    /* renamed from: b */
    private void m116061b(Canvas canvas) {
        this.f78487m.setColor(this.f78482f);
        canvas.drawCircle((float) this.f78489o.x, (float) this.f78489o.y, ((float) this.f78489o.x) * this.f78479c, this.f78487m);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setChecked(bundle.getBoolean("InstanceState"));
            super.onRestoreInstanceState(bundle.getParcelable("InstanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setChecked(boolean z) {
        this.f78496v = z;
        m116062c();
        invalidate();
        AbstractC31096a aVar = this.f78499y;
        if (aVar != null) {
            aVar.mo112643a(this, this.f78496v);
        }
    }

    /* renamed from: a */
    private int m116057a(int i) {
        int dp2px = UIUtils.dp2px(getContext(), 25.0f);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(dp2px, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    /* renamed from: a */
    private void m116059a(Canvas canvas) {
        this.f78485k.setColor(this.f78481e);
        canvas.drawCircle((float) this.f78489o.x, (float) this.f78489o.y, ((float) (this.f78489o.x - this.f78495u)) * this.f78478b, this.f78485k);
    }

    /* renamed from: a */
    private void m116060a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.color_checked, R.attr.color_tick, R.attr.color_unchecked, R.attr.color_unchecked_stroke, R.attr.duration, R.attr.enable_click, R.attr.stroke_width});
        int color = obtainStyledAttributes.getColor(1, -1);
        this.f78494t = obtainStyledAttributes.getInt(4, LocationRequest.PRIORITY_INDOOR);
        this.f78482f = obtainStyledAttributes.getColor(3, f78476j);
        this.f78480d = obtainStyledAttributes.getColor(0, f78475i);
        this.f78481e = obtainStyledAttributes.getColor(2, -1);
        this.f78495u = obtainStyledAttributes.getDimensionPixelSize(6, UIUtils.dp2px(getContext(), BitmapDescriptorFactory.HUE_RED));
        this.f78497w = obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.recycle();
        this.f78498x = false;
        this.f78483g = this.f78482f;
        Paint paint = new Paint(1);
        this.f78486l = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f78486l.setStrokeCap(Paint.Cap.ROUND);
        this.f78486l.setColor(color);
        Paint paint2 = new Paint(1);
        this.f78487m = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f78487m.setColor(this.f78482f);
        Paint paint3 = new Paint(1);
        this.f78485k = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f78485k.setColor(this.f78480d);
        this.f78490p = new Path();
        this.f78489o = new Point();
        Point[] pointArr = new Point[3];
        this.f78488n = pointArr;
        pointArr[0] = new Point();
        this.f78488n[1] = new Point();
        this.f78488n[2] = new Point();
        if (this.f78497w) {
            setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.View$OnClickListenerC310891 */

                public void onClick(View view) {
                    SmoothCheckBox.this.toggle();
                    SmoothCheckBox.this.f78484h = false;
                    SmoothCheckBox.this.f78477a = BitmapDescriptorFactory.HUE_RED;
                    if (SmoothCheckBox.this.isChecked()) {
                        SmoothCheckBox.this.mo112623a();
                    } else {
                        SmoothCheckBox.this.mo112624b();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m116065d(Canvas canvas) {
        this.f78490p.reset();
        if (!this.f78498x) {
            this.f78498x = true;
            this.f78477a = this.f78491q + this.f78492r;
        }
        float f = this.f78477a;
        float f2 = 3.0f;
        if (f < this.f78491q) {
            int i = this.f78493s;
            if (((float) i) / 20.0f >= 3.0f) {
                f2 = ((float) i) / 20.0f;
            }
            this.f78477a = f + f2;
            float f3 = ((float) this.f78488n[0].x) + ((((float) (this.f78488n[1].x - this.f78488n[0].x)) * this.f78477a) / this.f78491q);
            float f4 = ((float) this.f78488n[0].y) + ((((float) (this.f78488n[1].y - this.f78488n[0].y)) * this.f78477a) / this.f78491q);
            this.f78490p.moveTo((float) this.f78488n[0].x, (float) this.f78488n[0].y);
            this.f78490p.lineTo(f3, f4);
            canvas.drawPath(this.f78490p, this.f78486l);
            float f5 = this.f78477a;
            float f6 = this.f78491q;
            if (f5 > f6) {
                this.f78477a = f6;
            }
        } else {
            this.f78490p.moveTo((float) this.f78488n[0].x, (float) this.f78488n[0].y);
            this.f78490p.lineTo((float) this.f78488n[1].x, (float) this.f78488n[1].y);
            canvas.drawPath(this.f78490p, this.f78486l);
            if (this.f78477a < this.f78491q + this.f78492r) {
                float f7 = ((float) this.f78488n[1].x) + ((((float) (this.f78488n[2].x - this.f78488n[1].x)) * (this.f78477a - this.f78491q)) / this.f78492r);
                float f8 = ((float) this.f78488n[1].y) - ((((float) (this.f78488n[1].y - this.f78488n[2].y)) * (this.f78477a - this.f78491q)) / this.f78492r);
                this.f78490p.reset();
                this.f78490p.moveTo((float) this.f78488n[1].x, (float) this.f78488n[1].y);
                this.f78490p.lineTo(f7, f8);
                canvas.drawPath(this.f78490p, this.f78486l);
                int i2 = this.f78493s;
                if (i2 / 20 >= 3) {
                    f2 = (float) (i2 / 20);
                }
                this.f78477a += f2;
            } else {
                this.f78490p.reset();
                this.f78490p.moveTo((float) this.f78488n[1].x, (float) this.f78488n[1].y);
                this.f78490p.lineTo((float) this.f78488n[2].x, (float) this.f78488n[2].y);
                canvas.drawPath(this.f78490p, this.f78486l);
            }
        }
        if (this.f78477a < this.f78491q + this.f78492r) {
            postDelayed(new Runnable() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.SmoothCheckBox.RunnableC310902 */

                public void run() {
                    SmoothCheckBox.this.postInvalidate();
                }
            }, 10);
        }
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m116057a(i), m116057a(i2));
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f78478b = 1.0f;
        this.f78479c = 1.0f;
        m116060a(attributeSet);
    }

    /* renamed from: a */
    public static int m116058a(int i, int i2, float f) {
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) alpha) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) red) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) green) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) blue) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.f78493s = getMeasuredWidth();
        int i6 = this.f78495u;
        if (i6 == 0) {
            i6 = getMeasuredWidth() / 10;
        }
        this.f78495u = i6;
        if (i6 > getMeasuredWidth() / 5) {
            i5 = getMeasuredWidth() / 5;
        } else {
            i5 = this.f78495u;
        }
        this.f78495u = i5;
        if (i5 < 3) {
            i5 = 3;
        }
        this.f78495u = i5;
        this.f78489o.x = this.f78493s / 2;
        this.f78489o.y = getMeasuredHeight() / 2;
        this.f78488n[0].x = Math.round((((float) getMeasuredWidth()) / 30.0f) * 9.0f);
        this.f78488n[0].y = Math.round((((float) getMeasuredHeight()) / 30.0f) * 16.0f);
        this.f78488n[1].x = Math.round((((float) getMeasuredWidth()) / 30.0f) * 13.0f);
        this.f78488n[1].y = Math.round((((float) getMeasuredHeight()) / 30.0f) * 20.0f);
        this.f78488n[2].x = Math.round((((float) getMeasuredWidth()) / 30.0f) * 22.0f);
        this.f78488n[2].y = Math.round((((float) getMeasuredHeight()) / 30.0f) * 10.0f);
        this.f78491q = (float) Math.sqrt(Math.pow((double) (this.f78488n[1].x - this.f78488n[0].x), 2.0d) + Math.pow((double) (this.f78488n[1].y - this.f78488n[0].y), 2.0d));
        this.f78492r = (float) Math.sqrt(Math.pow((double) (this.f78488n[2].x - this.f78488n[1].x), 2.0d) + Math.pow((double) (this.f78488n[2].y - this.f78488n[1].y), 2.0d));
        this.f78486l.setStrokeWidth((float) this.f78495u);
    }
}
