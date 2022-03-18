package com.ruffian.library;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RTextView extends TextView {

    /* renamed from: A */
    private int f67087A;

    /* renamed from: B */
    private int f67088B;

    /* renamed from: C */
    private ColorStateList f67089C;

    /* renamed from: D */
    private Drawable f67090D;

    /* renamed from: E */
    private String f67091E;

    /* renamed from: F */
    private int[][] f67092F;

    /* renamed from: G */
    private StateListDrawable f67093G;

    /* renamed from: H */
    private float[] f67094H;

    /* renamed from: I */
    private int f67095I;

    /* renamed from: J */
    private Context f67096J;

    /* renamed from: K */
    private GestureDetector f67097K;

    /* renamed from: L */
    private boolean f67098L;

    /* renamed from: M */
    private boolean f67099M;

    /* renamed from: N */
    private boolean f67100N;

    /* renamed from: O */
    private boolean f67101O;

    /* renamed from: P */
    private boolean f67102P;

    /* renamed from: Q */
    private boolean f67103Q;

    /* renamed from: a */
    private int f67104a;

    /* renamed from: b */
    public Drawable f67105b;

    /* renamed from: c */
    public Drawable f67106c;

    /* renamed from: d */
    public Drawable f67107d;

    /* renamed from: e */
    private int f67108e;

    /* renamed from: f */
    private int f67109f;

    /* renamed from: g */
    private float f67110g;

    /* renamed from: h */
    private float f67111h;

    /* renamed from: i */
    private float f67112i;

    /* renamed from: j */
    private float f67113j;

    /* renamed from: k */
    private float f67114k;

    /* renamed from: l */
    private float f67115l;

    /* renamed from: m */
    private float f67116m;

    /* renamed from: n */
    private int f67117n;

    /* renamed from: o */
    private int f67118o;

    /* renamed from: p */
    private int f67119p;

    /* renamed from: q */
    private int f67120q;

    /* renamed from: r */
    private int f67121r;

    /* renamed from: s */
    private int f67122s;

    /* renamed from: t */
    private int f67123t;

    /* renamed from: u */
    private int f67124u;

    /* renamed from: v */
    private int f67125v;

    /* renamed from: w */
    private GradientDrawable f67126w;

    /* renamed from: x */
    private GradientDrawable f67127x;

    /* renamed from: y */
    private GradientDrawable f67128y;

    /* renamed from: z */
    private int f67129z;

    public int getBackgroundColorNormal() {
        return this.f67123t;
    }

    public int getBackgroundColorPressed() {
        return this.f67124u;
    }

    public int getBackgroundColorUnable() {
        return this.f67125v;
    }

    public int getBorderColorNormal() {
        return this.f67120q;
    }

    public int getBorderColorPressed() {
        return this.f67121r;
    }

    public int getBorderColorUnable() {
        return this.f67122s;
    }

    public float getBorderDashGap() {
        return this.f67116m;
    }

    public float getBorderDashWidth() {
        return this.f67115l;
    }

    public int getBorderWidthNormal() {
        return this.f67117n;
    }

    public int getBorderWidthPressed() {
        return this.f67118o;
    }

    public int getBorderWidthUnable() {
        return this.f67119p;
    }

    public float getCornerRadius() {
        return this.f67110g;
    }

    public float getCornerRadiusBottomLeft() {
        return this.f67113j;
    }

    public float getCornerRadiusBottomRight() {
        return this.f67114k;
    }

    public float getCornerRadiusTopLeft() {
        return this.f67111h;
    }

    public float getCornerRadiusTopRight() {
        return this.f67112i;
    }

    public int getIconDirection() {
        return this.f67109f;
    }

    public int getIconHeight() {
        return this.f67104a;
    }

    public Drawable getIconNormal() {
        return this.f67106c;
    }

    public Drawable getIconPressed() {
        return this.f67107d;
    }

    public Drawable getIconUnable() {
        return this.f67090D;
    }

    public int getIconWidth() {
        return this.f67108e;
    }

    public int getPressedTextColor() {
        return this.f67087A;
    }

    public int getTextColorNormal() {
        return this.f67129z;
    }

    public int getTextColorUnable() {
        return this.f67088B;
    }

    public String getTypefacePath() {
        return this.f67091E;
    }

    /* renamed from: c */
    private void m98220c() {
        if (!TextUtils.isEmpty(this.f67091E)) {
            setTypeface(Typeface.createFromAsset(this.f67096J.getAssets(), this.f67091E));
        }
    }

    /* renamed from: f */
    private void m98223f() {
        this.f67126w.setCornerRadii(this.f67094H);
        this.f67127x.setCornerRadii(this.f67094H);
        this.f67128y.setCornerRadii(this.f67094H);
        setBackgroundState(false);
    }

    /* renamed from: d */
    private void m98221d() {
        int i = this.f67087A;
        ColorStateList colorStateList = new ColorStateList(this.f67092F, new int[]{i, i, this.f67129z, this.f67088B});
        this.f67089C = colorStateList;
        setTextColor(colorStateList);
    }

    /* renamed from: e */
    private void m98222e() {
        this.f67126w.setStroke(this.f67117n, this.f67120q, this.f67115l, this.f67116m);
        this.f67127x.setStroke(this.f67118o, this.f67121r, this.f67115l, this.f67116m);
        this.f67128y.setStroke(this.f67119p, this.f67122s, this.f67115l, this.f67116m);
        setBackgroundState(false);
    }

    /* renamed from: g */
    private void m98224g() {
        float f = this.f67110g;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.f67094H;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            fArr[4] = f;
            fArr[5] = f;
            fArr[6] = f;
            fArr[7] = f;
            m98223f();
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            float[] fArr2 = this.f67094H;
            float f2 = this.f67111h;
            fArr2[0] = f2;
            fArr2[1] = f2;
            float f3 = this.f67112i;
            fArr2[2] = f3;
            fArr2[3] = f3;
            float f4 = this.f67114k;
            fArr2[4] = f4;
            fArr2[5] = f4;
            float f5 = this.f67113j;
            fArr2[6] = f5;
            fArr2[7] = f5;
            m98223f();
        }
    }

    /* renamed from: b */
    private void m98219b() {
        this.f67126w = new GradientDrawable();
        this.f67127x = new GradientDrawable();
        this.f67128y = new GradientDrawable();
        Drawable background = getBackground();
        if (background == null || !(background instanceof StateListDrawable)) {
            this.f67093G = new StateListDrawable();
        } else {
            this.f67093G = (StateListDrawable) background;
        }
        if (!this.f67098L) {
            this.f67124u = this.f67123t;
        }
        if (!this.f67099M) {
            this.f67125v = this.f67123t;
        }
        this.f67126w.setColor(this.f67123t);
        this.f67127x.setColor(this.f67124u);
        this.f67128y.setColor(this.f67125v);
        int[][] iArr = this.f67092F;
        iArr[0] = new int[]{16842910, 16842919};
        iArr[1] = new int[]{16842910, 16842908};
        iArr[3] = new int[]{-16842910};
        iArr[2] = new int[]{16842910};
        this.f67093G.addState(iArr[0], this.f67127x);
        this.f67093G.addState(this.f67092F[1], this.f67127x);
        this.f67093G.addState(this.f67092F[3], this.f67128y);
        this.f67093G.addState(this.f67092F[2], this.f67126w);
        if (!isEnabled()) {
            this.f67105b = this.f67090D;
        } else {
            this.f67105b = this.f67106c;
        }
        if (!this.f67102P) {
            this.f67118o = this.f67117n;
        }
        if (!this.f67103Q) {
            this.f67119p = this.f67117n;
        }
        if (!this.f67100N) {
            this.f67121r = this.f67120q;
        }
        if (!this.f67101O) {
            this.f67122s = this.f67120q;
        }
        if (this.f67123t == 0 && this.f67125v == 0 && this.f67124u == 0) {
            setBackgroundState(true);
        } else {
            setBackgroundState(false);
        }
        m98221d();
        m98222e();
        mo96119a();
        m98224g();
        m98220c();
    }

    /* renamed from: a */
    public void mo96119a() {
        Drawable drawable;
        if (this.f67104a == 0 && this.f67108e == 0 && (drawable = this.f67105b) != null) {
            this.f67108e = drawable.getIntrinsicWidth();
            this.f67104a = this.f67105b.getIntrinsicHeight();
        }
        m98217a(this.f67105b, this.f67108e, this.f67104a, this.f67109f);
    }

    /* renamed from: com.ruffian.library.RTextView$a */
    class C27016a extends GestureDetector.SimpleOnGestureListener {
        C27016a() {
        }

        public void onShowPress(MotionEvent motionEvent) {
            if (RTextView.this.f67107d != null) {
                RTextView rTextView = RTextView.this;
                rTextView.f67105b = rTextView.f67107d;
                RTextView.this.mo96119a();
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (RTextView.this.f67106c == null) {
                return false;
            }
            RTextView rTextView = RTextView.this;
            rTextView.f67105b = rTextView.f67106c;
            RTextView.this.mo96119a();
            return false;
        }
    }

    public RTextView(Context context) {
        this(context, null);
    }

    public void setBorderDashGap(float f) {
        this.f67116m = f;
        m98222e();
    }

    public void setBorderDashWidth(float f) {
        this.f67115l = f;
        m98222e();
    }

    public void setCornerRadius(float f) {
        this.f67110g = f;
        m98224g();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            Drawable drawable = this.f67106c;
            if (drawable != null) {
                this.f67105b = drawable;
                mo96119a();
                return;
            }
            return;
        }
        Drawable drawable2 = this.f67090D;
        if (drawable2 != null) {
            this.f67105b = drawable2;
            mo96119a();
        }
    }

    private void setBackgroundState(boolean z) {
        Drawable background = getBackground();
        if (z && (background instanceof ColorDrawable)) {
            int color = ((ColorDrawable) background).getColor();
            mo96118a(color, color, color);
        }
        if (Build.VERSION.SDK_INT < 16) {
            if (!z) {
                background = this.f67093G;
            }
            setBackgroundDrawable(background);
            return;
        }
        if (!z) {
            background = this.f67093G;
        }
        setBackground(background);
    }

    /* renamed from: a */
    public RTextView mo96117a(int i) {
        this.f67123t = i;
        if (!this.f67098L) {
            this.f67124u = i;
            this.f67127x.setColor(i);
        }
        if (!this.f67099M) {
            int i2 = this.f67123t;
            this.f67125v = i2;
            this.f67128y.setColor(i2);
        }
        this.f67126w.setColor(this.f67123t);
        setBackgroundState(false);
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        Drawable drawable2;
        if (!isEnabled()) {
            return true;
        }
        this.f67097K.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            Drawable drawable3 = this.f67106c;
            if (drawable3 != null) {
                this.f67105b = drawable3;
                mo96119a();
            }
        } else if (action != 2) {
            if (action == 3 && (drawable2 = this.f67106c) != null) {
                this.f67105b = drawable2;
                mo96119a();
            }
        } else if (m98218a((int) motionEvent.getX(), (int) motionEvent.getY()) && (drawable = this.f67106c) != null) {
            this.f67105b = drawable;
            mo96119a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private boolean m98218a(int i, int i2) {
        if (i >= 0 - this.f67095I) {
            int width = getWidth();
            int i3 = this.f67095I;
            if (i >= width + i3 || i2 < 0 - i3 || i2 >= getHeight() + this.f67095I) {
                return true;
            }
            return false;
        }
        return true;
    }

    public RTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67092F = new int[4][];
        this.f67094H = new float[8];
        this.f67096J = context;
        this.f67095I = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f67097K = new GestureDetector(context, new C27016a());
        m98216a(context, attributeSet);
    }

    /* renamed from: a */
    private void m98216a(Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (context == null || attributeSet == null) {
            m98219b();
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.background_normal, R.attr.background_pressed, R.attr.background_unable, R.attr.border_color_normal, R.attr.border_color_pressed, R.attr.border_color_unable, R.attr.border_dash_gap, R.attr.border_dash_width, R.attr.border_width_normal, R.attr.border_width_pressed, R.attr.border_width_unable, R.attr.corner_radius, R.attr.corner_radius_bottom_left, R.attr.corner_radius_bottom_right, R.attr.corner_radius_top_left, R.attr.corner_radius_top_right, R.attr.icon_direction, R.attr.icon_height, R.attr.icon_src_normal, R.attr.icon_src_pressed, R.attr.icon_src_unable, R.attr.icon_width, R.attr.text_color_normal, R.attr.text_color_pressed, R.attr.text_color_unable, R.attr.text_typeface});
        this.f67110g = (float) obtainStyledAttributes.getDimensionPixelSize(11, -1);
        boolean z6 = false;
        this.f67111h = (float) obtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.f67112i = (float) obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f67113j = (float) obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f67114k = (float) obtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.f67115l = (float) obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f67116m = (float) obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f67117n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f67118o = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f67119p = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f67120q = obtainStyledAttributes.getColor(3, 0);
        this.f67121r = obtainStyledAttributes.getColor(4, 0);
        this.f67122s = obtainStyledAttributes.getColor(5, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f67106c = obtainStyledAttributes.getDrawable(18);
            this.f67107d = obtainStyledAttributes.getDrawable(19);
            this.f67090D = obtainStyledAttributes.getDrawable(20);
        } else {
            int resourceId = obtainStyledAttributes.getResourceId(18, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(19, -1);
            int resourceId3 = obtainStyledAttributes.getResourceId(20, -1);
            if (resourceId != -1) {
                this.f67106c = C0215a.m655b(context, resourceId);
            }
            if (resourceId2 != -1) {
                this.f67107d = C0215a.m655b(context, resourceId2);
            }
            if (resourceId3 != -1) {
                this.f67090D = C0215a.m655b(context, resourceId3);
            }
        }
        this.f67108e = obtainStyledAttributes.getDimensionPixelSize(21, 0);
        this.f67104a = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.f67109f = obtainStyledAttributes.getInt(16, 1);
        this.f67129z = obtainStyledAttributes.getColor(22, getCurrentTextColor());
        this.f67087A = obtainStyledAttributes.getColor(23, getCurrentTextColor());
        this.f67088B = obtainStyledAttributes.getColor(24, getCurrentTextColor());
        this.f67123t = obtainStyledAttributes.getColor(0, 0);
        this.f67124u = obtainStyledAttributes.getColor(1, 0);
        this.f67125v = obtainStyledAttributes.getColor(2, 0);
        this.f67091E = obtainStyledAttributes.getString(25);
        obtainStyledAttributes.recycle();
        if (this.f67124u != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f67098L = z;
        if (this.f67125v != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f67099M = z2;
        if (this.f67121r != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f67100N = z3;
        if (this.f67122s != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f67101O = z4;
        if (this.f67118o != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f67102P = z5;
        if (this.f67119p != 0) {
            z6 = true;
        }
        this.f67103Q = z6;
        m98219b();
    }

    /* renamed from: a */
    public RTextView mo96118a(int i, int i2, int i3) {
        this.f67123t = i;
        this.f67124u = i2;
        this.f67125v = i3;
        this.f67098L = true;
        this.f67099M = true;
        this.f67126w.setColor(i);
        this.f67127x.setColor(this.f67124u);
        this.f67128y.setColor(this.f67125v);
        setBackgroundState(false);
        return this;
    }

    /* renamed from: a */
    private void m98217a(Drawable drawable, int i, int i2, int i3) {
        if (drawable != null) {
            if (!(i == 0 || i2 == 0)) {
                drawable.setBounds(0, 0, i, i2);
            }
            if (i3 == 1) {
                setCompoundDrawables(drawable, null, null, null);
            } else if (i3 == 2) {
                setCompoundDrawables(null, drawable, null, null);
            } else if (i3 == 3) {
                setCompoundDrawables(null, null, drawable, null);
            } else if (i3 == 4) {
                setCompoundDrawables(null, null, null, drawable);
            }
        }
    }
}
