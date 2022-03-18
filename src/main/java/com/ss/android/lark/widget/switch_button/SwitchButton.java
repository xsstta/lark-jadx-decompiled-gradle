package com.ss.android.lark.widget.switch_button;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SwitchButton extends CompoundButton {

    /* renamed from: a */
    private static int[] f146925a = {16842912, 16842910, 16842919};

    /* renamed from: b */
    private static int[] f146926b = {-16842912, 16842910, 16842919};

    /* renamed from: A */
    private Paint f146927A;

    /* renamed from: B */
    private boolean f146928B;

    /* renamed from: C */
    private boolean f146929C;

    /* renamed from: D */
    private boolean f146930D;

    /* renamed from: E */
    private ObjectAnimator f146931E;

    /* renamed from: F */
    private float f146932F;

    /* renamed from: G */
    private RectF f146933G;

    /* renamed from: H */
    private float f146934H;

    /* renamed from: I */
    private float f146935I;

    /* renamed from: J */
    private float f146936J;

    /* renamed from: K */
    private int f146937K;

    /* renamed from: L */
    private int f146938L;

    /* renamed from: M */
    private Paint f146939M;

    /* renamed from: N */
    private CharSequence f146940N;

    /* renamed from: O */
    private CharSequence f146941O;

    /* renamed from: P */
    private TextPaint f146942P;

    /* renamed from: Q */
    private Layout f146943Q;

    /* renamed from: R */
    private Layout f146944R;

    /* renamed from: S */
    private float f146945S;

    /* renamed from: T */
    private float f146946T;

    /* renamed from: U */
    private float f146947U;

    /* renamed from: V */
    private boolean f146948V = true;

    /* renamed from: W */
    private boolean f146949W;
    private CompoundButton.OnCheckedChangeListener aa;

    /* renamed from: c */
    private Drawable f146950c;

    /* renamed from: d */
    private Drawable f146951d;

    /* renamed from: e */
    private ColorStateList f146952e;

    /* renamed from: f */
    private ColorStateList f146953f;

    /* renamed from: g */
    private float f146954g;

    /* renamed from: h */
    private float f146955h;

    /* renamed from: i */
    private RectF f146956i;

    /* renamed from: j */
    private float f146957j;

    /* renamed from: k */
    private long f146958k;

    /* renamed from: l */
    private boolean f146959l;

    /* renamed from: m */
    private int f146960m;

    /* renamed from: n */
    private PointF f146961n;

    /* renamed from: o */
    private int f146962o;

    /* renamed from: p */
    private int f146963p;

    /* renamed from: q */
    private int f146964q;

    /* renamed from: r */
    private int f146965r;

    /* renamed from: s */
    private int f146966s;

    /* renamed from: t */
    private Drawable f146967t;

    /* renamed from: u */
    private Drawable f146968u;

    /* renamed from: v */
    private RectF f146969v;

    /* renamed from: w */
    private RectF f146970w;

    /* renamed from: x */
    private RectF f146971x;

    /* renamed from: y */
    private RectF f146972y;

    /* renamed from: z */
    private RectF f146973z;

    public long getAnimationDuration() {
        return this.f146958k;
    }

    public ColorStateList getBackColor() {
        return this.f146952e;
    }

    public Drawable getBackDrawable() {
        return this.f146951d;
    }

    public float getBackMeasureRatio() {
        return this.f146957j;
    }

    public float getBackRadius() {
        return this.f146955h;
    }

    public final float getProcess() {
        return this.f146932F;
    }

    public ColorStateList getThumbColor() {
        return this.f146953f;
    }

    public Drawable getThumbDrawable() {
        return this.f146950c;
    }

    public RectF getThumbMargin() {
        return this.f146956i;
    }

    public float getThumbRadius() {
        return this.f146954g;
    }

    public PointF getThumbSizeF() {
        return this.f146961n;
    }

    public int getTintColor() {
        return this.f146960m;
    }

    public float getThumbHeight() {
        return this.f146961n.y;
    }

    public float getThumbWidth() {
        return this.f146961n.x;
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* renamed from: b */
    private void m229906b() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean getStatusBasedOnPos() {
        if (getProcess() > 0.5f) {
            return true;
        }
        return false;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f146970w.width(), this.f146970w.height());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f146974a = this.f146940N;
        savedState.f146975b = this.f146941O;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int[] iArr;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f146928B || (colorStateList2 = this.f146953f) == null) {
            setDrawableState(this.f146950c);
        } else {
            this.f146962o = colorStateList2.getColorForState(getDrawableState(), this.f146962o);
        }
        if (isChecked()) {
            iArr = f146926b;
        } else {
            iArr = f146925a;
        }
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f146965r = textColors.getColorForState(f146925a, defaultColor);
            this.f146966s = textColors.getColorForState(f146926b, defaultColor);
        }
        if (this.f146929C || (colorStateList = this.f146952e) == null) {
            Drawable drawable = this.f146951d;
            if (!(drawable instanceof StateListDrawable) || !this.f146959l) {
                this.f146968u = null;
            } else {
                drawable.setState(iArr);
                this.f146968u = this.f146951d.getCurrent().mutate();
            }
            setDrawableState(this.f146951d);
            Drawable drawable2 = this.f146951d;
            if (drawable2 != null) {
                this.f146967t = drawable2.getCurrent().mutate();
                return;
            }
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), this.f146963p);
        this.f146963p = colorForState;
        this.f146964q = this.f146952e.getColorForState(iArr, colorForState);
    }

    /* renamed from: a */
    private void m229903a() {
        float f;
        float f2 = this.f146956i.top;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float paddingTop = ((float) getPaddingTop()) + Math.max((float) BitmapDescriptorFactory.HUE_RED, f2);
        float paddingLeft = ((float) getPaddingLeft()) + Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f146956i.left);
        if (!(this.f146943Q == null || this.f146944R == null || this.f146956i.top + this.f146956i.bottom <= BitmapDescriptorFactory.HUE_RED)) {
            paddingTop += (((((float) ((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop())) - this.f146961n.y) - this.f146956i.top) - this.f146956i.bottom) / 2.0f;
        }
        if (this.f146928B) {
            PointF pointF = this.f146961n;
            pointF.x = Math.max(pointF.x, (float) this.f146950c.getMinimumWidth());
            PointF pointF2 = this.f146961n;
            pointF2.y = Math.max(pointF2.y, (float) this.f146950c.getMinimumHeight());
        }
        this.f146969v.set(paddingLeft, paddingTop, this.f146961n.x + paddingLeft, this.f146961n.y + paddingTop);
        float f4 = this.f146969v.left - this.f146956i.left;
        float min = Math.min((float) BitmapDescriptorFactory.HUE_RED, ((Math.max(this.f146961n.x * this.f146957j, this.f146961n.x + this.f146945S) - this.f146969v.width()) - this.f146945S) / 2.0f);
        float min2 = Math.min((float) BitmapDescriptorFactory.HUE_RED, (((this.f146969v.height() + this.f146956i.top) + this.f146956i.bottom) - this.f146946T) / 2.0f);
        this.f146970w.set(f4 + min, (this.f146969v.top - this.f146956i.top) + min2, (((f4 + this.f146956i.left) + Math.max(this.f146961n.x * this.f146957j, this.f146961n.x + this.f146945S)) + this.f146956i.right) - min, (this.f146969v.bottom + this.f146956i.bottom) - min2);
        this.f146971x.set(this.f146969v.left, BitmapDescriptorFactory.HUE_RED, (this.f146970w.right - this.f146956i.right) - this.f146969v.width(), BitmapDescriptorFactory.HUE_RED);
        this.f146955h = Math.min(Math.min(this.f146970w.width(), this.f146970w.height()) / 2.0f, this.f146955h);
        Drawable drawable = this.f146951d;
        if (drawable != null) {
            drawable.setBounds((int) this.f146970w.left, (int) this.f146970w.top, m229900a((double) this.f146970w.right), m229900a((double) this.f146970w.bottom));
        }
        if (this.f146943Q != null) {
            float width = this.f146970w.left + ((((this.f146970w.width() - this.f146969v.width()) - this.f146956i.right) - ((float) this.f146943Q.getWidth())) / 2.0f);
            if (this.f146956i.left < BitmapDescriptorFactory.HUE_RED) {
                f = this.f146956i.left * -0.5f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f5 = width + f;
            if (!this.f146929C && this.f146948V) {
                f5 += this.f146955h / 4.0f;
            }
            float height = this.f146970w.top + ((this.f146970w.height() - ((float) this.f146943Q.getHeight())) / 2.0f);
            this.f146972y.set(f5, height, ((float) this.f146943Q.getWidth()) + f5, ((float) this.f146943Q.getHeight()) + height);
        }
        if (this.f146944R != null) {
            float width2 = (this.f146970w.right - ((((this.f146970w.width() - this.f146969v.width()) - this.f146956i.left) - ((float) this.f146944R.getWidth())) / 2.0f)) - ((float) this.f146944R.getWidth());
            if (this.f146956i.right < BitmapDescriptorFactory.HUE_RED) {
                f3 = this.f146956i.right * 0.5f;
            }
            float f6 = width2 + f3;
            if (!this.f146929C && this.f146948V) {
                f6 -= this.f146955h / 4.0f;
            }
            float height2 = this.f146970w.top + ((this.f146970w.height() - ((float) this.f146944R.getHeight())) / 2.0f);
            this.f146973z.set(f6, height2, ((float) this.f146944R.getWidth()) + f6, ((float) this.f146944R.getHeight()) + height2);
        }
    }

    public void setAnimationDuration(long j) {
        this.f146958k = j;
    }

    public void setFadeBack(boolean z) {
        this.f146959l = z;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.ss.android.lark.widget.switch_button.SwitchButton.SavedState.C591911 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        CharSequence f146974a;

        /* renamed from: b */
        CharSequence f146975b;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f146974a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f146975b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f146974a, parcel, i);
            TextUtils.writeToParcel(this.f146975b, parcel, i);
        }
    }

    /* renamed from: a */
    private int m229900a(double d) {
        return (int) Math.ceil(d);
    }

    public void setBackMeasureRatio(float f) {
        this.f146957j = f;
        requestLayout();
    }

    public void setDrawDebugRect(boolean z) {
        this.f146930D = z;
        invalidate();
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.aa = onCheckedChangeListener;
    }

    public SwitchButton(Context context) {
        super(context);
        m229904a((AttributeSet) null);
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f146952e = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setBackRadius(float f) {
        this.f146955h = f;
        if (!this.f146929C) {
            invalidate();
        }
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f146953f = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
    }

    public void setThumbColorRes(int i) {
        setThumbColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setThumbRadius(float f) {
        this.f146954g = f;
        if (!this.f146928B) {
            invalidate();
        }
    }

    /* renamed from: a */
    private Layout m229902a(CharSequence charSequence) {
        TextPaint textPaint = this.f146942P;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        mo201180a(savedState.f146974a, savedState.f146975b);
        this.f146949W = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f146949W = false;
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z;
        this.f146951d = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f146929C = z;
        m229903a();
        refreshDrawableState();
        requestLayout();
        invalidate();
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            mo201181a(z);
        }
        if (this.f146949W) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        float f;
        super.setChecked(z);
        ObjectAnimator objectAnimator = this.f146931E;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f146931E.cancel();
        }
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        setProcess(f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.aa == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.aa);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.aa == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.aa);
    }

    public final void setProcess(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f146932F = f;
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z;
        this.f146950c = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f146928B = z;
        m229903a();
        refreshDrawableState();
        requestLayout();
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            mo201179a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            mo201179a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbSize(PointF pointF) {
        if (pointF == null) {
            float f = getResources().getDisplayMetrics().density * 20.0f;
            mo201178a(f, f);
            return;
        }
        mo201178a(pointF.x, pointF.y);
    }

    public void setTintColor(int i) {
        this.f146960m = i;
        this.f146953f = C59192a.m229913a(i);
        this.f146952e = C59192a.m229914b(this.f146960m);
        this.f146929C = false;
        this.f146928B = false;
        refreshDrawableState();
        invalidate();
    }

    /* renamed from: b */
    private int m229905b(int i) {
        float f;
        float f2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int a = m229900a((double) Math.max(this.f146961n.y, this.f146961n.y + this.f146956i.top + this.f146956i.right));
        Layout layout = this.f146943Q;
        if (layout != null) {
            f = (float) layout.getHeight();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        Layout layout2 = this.f146944R;
        if (layout2 != null) {
            f2 = (float) layout2.getHeight();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f146946T = BitmapDescriptorFactory.HUE_RED;
        } else {
            float max = Math.max(f, f2);
            this.f146946T = max;
            a = m229900a((double) Math.max((float) a, max));
        }
        int max2 = Math.max(a, getSuggestedMinimumHeight());
        int max3 = Math.max(max2, getPaddingTop() + max2 + getPaddingBottom());
        if (mode == 1073741824) {
            return Math.max(max3, size);
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(max3, size);
        }
        return max3;
    }

    /* renamed from: a */
    private int m229901a(int i) {
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int a = m229900a((double) (this.f146961n.x * this.f146957j));
        if (this.f146929C) {
            a = Math.max(a, this.f146951d.getMinimumWidth());
        }
        Layout layout = this.f146943Q;
        if (layout != null) {
            f = (float) layout.getWidth();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        Layout layout2 = this.f146944R;
        if (layout2 != null) {
            f2 = (float) layout2.getWidth();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f146945S = BitmapDescriptorFactory.HUE_RED;
        } else {
            this.f146945S = Math.max(f, f2) + (this.f146947U * 2.0f);
            float f3 = (float) a;
            float f4 = f3 - this.f146961n.x;
            float f5 = this.f146945S;
            if (f4 < f5) {
                a = (int) (f3 + (f5 - f4));
            }
        }
        int max = Math.max(a, m229900a((double) (((float) a) + this.f146956i.left + this.f146956i.right)));
        int max2 = Math.max(Math.max(max, getPaddingLeft() + max + getPaddingRight()), getSuggestedMinimumWidth());
        if (mode == 1073741824) {
            return Math.max(max2, size);
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(max2, size);
        }
        return max2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r0 != 3) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.switch_button.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201181a(boolean z) {
        ObjectAnimator objectAnimator = this.f146931E;
        if (objectAnimator != null) {
            if (objectAnimator.isRunning()) {
                this.f146931E.cancel();
            }
            this.f146931E.setDuration(this.f146958k);
            if (z) {
                this.f146931E.setFloatValues(this.f146932F, 1.0f);
            } else {
                this.f146931E.setFloatValues(this.f146932F, 0.0f);
            }
            this.f146931E.start();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.switch_button.SwitchButton.onDraw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private void m229904a(AttributeSet attributeSet) {
        TypedArray typedArray;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        float f6;
        float f7;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        float f8;
        float f9;
        float f10;
        int i2;
        String str;
        ColorStateList colorStateList2;
        boolean z2;
        String str2;
        float f11;
        TypedArray typedArray2;
        float f12;
        boolean z3;
        boolean z4;
        float f13;
        this.f146937K = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f146938L = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f146927A = new Paint(1);
        Paint paint = new Paint(1);
        this.f146939M = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f146939M.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.f146942P = getPaint();
        this.f146969v = new RectF();
        this.f146970w = new RectF();
        this.f146971x = new RectF();
        this.f146961n = new PointF();
        this.f146956i = new RectF();
        this.f146972y = new RectF();
        this.f146973z = new RectF();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "process", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).setDuration(250L);
        this.f146931E = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f146933G = new RectF();
        float f14 = getResources().getDisplayMetrics().density;
        float f15 = f14 * 2.0f;
        float f16 = f14 * 20.0f;
        float f17 = f16 / 2.0f;
        if (attributeSet == null) {
            typedArray = null;
        } else {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.kswAnimationDuration, R.attr.kswAutoAdjustTextPosition, R.attr.kswBackColor, R.attr.kswBackDrawable, R.attr.kswBackMeasureRatio, R.attr.kswBackRadius, R.attr.kswFadeBack, R.attr.kswTextMarginH, R.attr.kswTextOff, R.attr.kswTextOn, R.attr.kswThumbColor, R.attr.kswThumbDrawable, R.attr.kswThumbHeight, R.attr.kswThumbMargin, R.attr.kswThumbMarginBottom, R.attr.kswThumbMarginLeft, R.attr.kswThumbMarginRight, R.attr.kswThumbMarginTop, R.attr.kswThumbRadius, R.attr.kswThumbWidth, R.attr.kswTintColor});
        }
        if (typedArray != null) {
            Drawable drawable3 = typedArray.getDrawable(11);
            ColorStateList colorStateList3 = typedArray.getColorStateList(10);
            float dimension = typedArray.getDimension(13, f15);
            float dimension2 = typedArray.getDimension(15, dimension);
            float dimension3 = typedArray.getDimension(16, dimension);
            float dimension4 = typedArray.getDimension(17, dimension);
            float dimension5 = typedArray.getDimension(14, dimension);
            f5 = typedArray.getDimension(19, f16);
            float dimension6 = typedArray.getDimension(12, f16);
            float dimension7 = typedArray.getDimension(18, Math.min(f5, dimension6) / 2.0f);
            float dimension8 = typedArray.getDimension(5, dimension7 + f15);
            Drawable drawable4 = typedArray.getDrawable(3);
            ColorStateList colorStateList4 = typedArray.getColorStateList(2);
            float f18 = typedArray.getFloat(4, 1.8f);
            int integer = typedArray.getInteger(0, 250);
            boolean z5 = typedArray.getBoolean(6, true);
            int color = typedArray.getColor(20, 0);
            String string = typedArray.getString(9);
            String string2 = typedArray.getString(8);
            float dimension9 = typedArray.getDimension(7, Math.max(f15, dimension8 / 2.0f));
            boolean z6 = typedArray.getBoolean(1, true);
            typedArray.recycle();
            f8 = dimension9;
            i = integer;
            i2 = color;
            str2 = string2;
            f3 = dimension7;
            drawable = drawable4;
            f7 = dimension2;
            f9 = dimension6;
            colorStateList2 = colorStateList4;
            f2 = f18;
            z = z5;
            str = string;
            z2 = z6;
            f4 = dimension8;
            drawable2 = drawable3;
            f10 = dimension4;
            f = dimension3;
            colorStateList = colorStateList3;
            f6 = dimension5;
        } else {
            f9 = f16;
            f5 = f9;
            f8 = f15;
            f4 = f17;
            f3 = f4;
            str2 = null;
            z2 = true;
            colorStateList2 = null;
            str = null;
            i2 = 0;
            f10 = BitmapDescriptorFactory.HUE_RED;
            drawable2 = null;
            colorStateList = null;
            drawable = null;
            f7 = BitmapDescriptorFactory.HUE_RED;
            f6 = BitmapDescriptorFactory.HUE_RED;
            z = true;
            f2 = 1.8f;
            f = BitmapDescriptorFactory.HUE_RED;
            i = 250;
        }
        if (attributeSet == null) {
            f11 = f7;
            typedArray2 = null;
        } else {
            f11 = f7;
            typedArray2 = getContext().obtainStyledAttributes(attributeSet, new int[]{16842970, 16842981});
        }
        if (typedArray2 != null) {
            f12 = f6;
            boolean z7 = typedArray2.getBoolean(0, true);
            boolean z8 = typedArray2.getBoolean(1, z7);
            setFocusable(z7);
            setClickable(z8);
            typedArray2.recycle();
        } else {
            f12 = f6;
            setFocusable(true);
            setClickable(true);
        }
        this.f146940N = str;
        this.f146941O = str2;
        this.f146947U = f8;
        this.f146948V = z2;
        this.f146950c = drawable2;
        this.f146953f = colorStateList;
        if (drawable2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f146928B = z3;
        this.f146960m = i2;
        if (i2 == 0) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true)) {
                this.f146960m = typedValue.data;
            } else {
                this.f146960m = 3309506;
            }
        }
        if (!this.f146928B && this.f146953f == null) {
            ColorStateList a = C59192a.m229913a(this.f146960m);
            this.f146953f = a;
            this.f146962o = a.getDefaultColor();
        }
        if (this.f146928B) {
            f5 = Math.max(f5, (float) this.f146950c.getMinimumWidth());
            f9 = Math.max(f9, (float) this.f146950c.getMinimumHeight());
        }
        this.f146961n.set(f5, f9);
        this.f146951d = drawable;
        this.f146952e = colorStateList2;
        if (drawable != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f146929C = z4;
        if (!z4 && colorStateList2 == null) {
            ColorStateList b = C59192a.m229914b(this.f146960m);
            this.f146952e = b;
            int defaultColor = b.getDefaultColor();
            this.f146963p = defaultColor;
            this.f146964q = this.f146952e.getColorForState(f146925a, defaultColor);
        }
        this.f146956i.set(f11, f10, f, f12);
        if (this.f146956i.width() >= BitmapDescriptorFactory.HUE_RED) {
            f13 = Math.max(f2, 1.0f);
        } else {
            f13 = f2;
        }
        this.f146957j = f13;
        this.f146954g = f3;
        this.f146955h = f4;
        long j = (long) i;
        this.f146958k = j;
        this.f146959l = z;
        this.f146931E.setDuration(j);
        if (isChecked()) {
            setProcess(1.0f);
        }
    }

    /* renamed from: a */
    public void mo201178a(float f, float f2) {
        this.f146961n.set(f, f2);
        m229903a();
        requestLayout();
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229904a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f146943Q == null && (charSequence2 = this.f146940N) != null) {
            this.f146943Q = m229902a(charSequence2);
        }
        if (this.f146944R == null && (charSequence = this.f146941O) != null) {
            this.f146944R = m229902a(charSequence);
        }
        setMeasuredDimension(m229901a(i), m229905b(i2));
    }

    /* renamed from: a */
    public void mo201180a(CharSequence charSequence, CharSequence charSequence2) {
        this.f146940N = charSequence;
        this.f146941O = charSequence2;
        this.f146943Q = null;
        this.f146944R = null;
        requestLayout();
        invalidate();
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229904a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m229903a();
        }
    }

    /* renamed from: a */
    public void mo201179a(float f, float f2, float f3, float f4) {
        this.f146956i.set(f, f2, f3, f4);
        requestLayout();
    }
}
