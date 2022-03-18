package com.larksuite.component.ui.button;

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

public class LKUISwitchButton extends CompoundButton {

    /* renamed from: a */
    public static final int LKUI_SwitchButton = 2131886515;

    /* renamed from: b */
    private static int[] f62519b = {16842912, 16842910, 16842919};

    /* renamed from: c */
    private static int[] f62520c = {-16842912, 16842910, 16842919};

    /* renamed from: A */
    private RectF f62521A;

    /* renamed from: B */
    private Paint f62522B;

    /* renamed from: C */
    private boolean f62523C;

    /* renamed from: D */
    private boolean f62524D;

    /* renamed from: E */
    private boolean f62525E;

    /* renamed from: F */
    private ObjectAnimator f62526F;

    /* renamed from: G */
    private float f62527G;

    /* renamed from: H */
    private RectF f62528H;

    /* renamed from: I */
    private float f62529I;

    /* renamed from: J */
    private float f62530J;

    /* renamed from: K */
    private float f62531K;

    /* renamed from: L */
    private int f62532L;

    /* renamed from: M */
    private int f62533M;

    /* renamed from: N */
    private Paint f62534N;

    /* renamed from: O */
    private CharSequence f62535O;

    /* renamed from: P */
    private CharSequence f62536P;

    /* renamed from: Q */
    private TextPaint f62537Q;

    /* renamed from: R */
    private Layout f62538R;

    /* renamed from: S */
    private Layout f62539S;

    /* renamed from: T */
    private float f62540T;

    /* renamed from: U */
    private float f62541U;

    /* renamed from: V */
    private float f62542V;

    /* renamed from: W */
    private boolean f62543W;
    private boolean aa;
    private CompoundButton.OnCheckedChangeListener ab;

    /* renamed from: d */
    private Drawable f62544d;

    /* renamed from: e */
    private Drawable f62545e;

    /* renamed from: f */
    private ColorStateList f62546f;

    /* renamed from: g */
    private ColorStateList f62547g;

    /* renamed from: h */
    private float f62548h;

    /* renamed from: i */
    private float f62549i;

    /* renamed from: j */
    private RectF f62550j;

    /* renamed from: k */
    private float f62551k;

    /* renamed from: l */
    private long f62552l;

    /* renamed from: m */
    private boolean f62553m;

    /* renamed from: n */
    private int f62554n;

    /* renamed from: o */
    private PointF f62555o;

    /* renamed from: p */
    private int f62556p;

    /* renamed from: q */
    private int f62557q;

    /* renamed from: r */
    private int f62558r;

    /* renamed from: s */
    private int f62559s;

    /* renamed from: t */
    private int f62560t;

    /* renamed from: u */
    private Drawable f62561u;

    /* renamed from: v */
    private Drawable f62562v;

    /* renamed from: w */
    private RectF f62563w;

    /* renamed from: x */
    private RectF f62564x;

    /* renamed from: y */
    private RectF f62565y;

    /* renamed from: z */
    private RectF f62566z;

    public long getAnimationDuration() {
        return this.f62552l;
    }

    public ColorStateList getBackColor() {
        return this.f62546f;
    }

    public Drawable getBackDrawable() {
        return this.f62545e;
    }

    public float getBackMeasureRatio() {
        return this.f62551k;
    }

    public float getBackRadius() {
        return this.f62549i;
    }

    public final float getProcess() {
        return this.f62527G;
    }

    public ColorStateList getThumbColor() {
        return this.f62547g;
    }

    public Drawable getThumbDrawable() {
        return this.f62544d;
    }

    public RectF getThumbMargin() {
        return this.f62550j;
    }

    public float getThumbRadius() {
        return this.f62548h;
    }

    public PointF getThumbSizeF() {
        return this.f62555o;
    }

    public int getTintColor() {
        return this.f62554n;
    }

    public float getThumbHeight() {
        return this.f62555o.y;
    }

    public float getThumbWidth() {
        return this.f62555o.x;
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* renamed from: b */
    private void m91695b() {
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
        return new PointF(this.f62564x.width(), this.f62564x.height());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f62567a = this.f62535O;
        savedState.f62568b = this.f62536P;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int[] iArr;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f62523C || (colorStateList2 = this.f62547g) == null) {
            setDrawableState(this.f62544d);
        } else {
            this.f62556p = colorStateList2.getColorForState(getDrawableState(), this.f62556p);
        }
        if (isChecked()) {
            iArr = f62520c;
        } else {
            iArr = f62519b;
        }
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f62559s = textColors.getColorForState(f62519b, defaultColor);
            this.f62560t = textColors.getColorForState(f62520c, defaultColor);
        }
        if (this.f62524D || (colorStateList = this.f62546f) == null) {
            Drawable drawable = this.f62545e;
            if (!(drawable instanceof StateListDrawable) || !this.f62553m) {
                this.f62562v = null;
            } else {
                drawable.setState(iArr);
                this.f62562v = this.f62545e.getCurrent().mutate();
            }
            setDrawableState(this.f62545e);
            Drawable drawable2 = this.f62545e;
            if (drawable2 != null) {
                this.f62561u = drawable2.getCurrent().mutate();
                return;
            }
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), this.f62557q);
        this.f62557q = colorForState;
        this.f62558r = this.f62546f.getColorForState(iArr, colorForState);
    }

    /* renamed from: a */
    private void mo208545a() {
        float f;
        float f2 = this.f62550j.top;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float paddingTop = ((float) getPaddingTop()) + Math.max((float) BitmapDescriptorFactory.HUE_RED, f2);
        float paddingLeft = ((float) getPaddingLeft()) + Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f62550j.left);
        if (!(this.f62538R == null || this.f62539S == null || this.f62550j.top + this.f62550j.bottom <= BitmapDescriptorFactory.HUE_RED)) {
            paddingTop += (((((float) ((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop())) - this.f62555o.y) - this.f62550j.top) - this.f62550j.bottom) / 2.0f;
        }
        if (this.f62523C) {
            PointF pointF = this.f62555o;
            pointF.x = Math.max(pointF.x, (float) this.f62544d.getMinimumWidth());
            PointF pointF2 = this.f62555o;
            pointF2.y = Math.max(pointF2.y, (float) this.f62544d.getMinimumHeight());
        }
        this.f62563w.set(paddingLeft, paddingTop, this.f62555o.x + paddingLeft, this.f62555o.y + paddingTop);
        float f4 = this.f62563w.left - this.f62550j.left;
        float min = Math.min((float) BitmapDescriptorFactory.HUE_RED, ((Math.max(this.f62555o.x * this.f62551k, this.f62555o.x + this.f62540T) - this.f62563w.width()) - this.f62540T) / 2.0f);
        float min2 = Math.min((float) BitmapDescriptorFactory.HUE_RED, (((this.f62563w.height() + this.f62550j.top) + this.f62550j.bottom) - this.f62541U) / 2.0f);
        this.f62564x.set(f4 + min, (this.f62563w.top - this.f62550j.top) + min2, (((f4 + this.f62550j.left) + Math.max(this.f62555o.x * this.f62551k, this.f62555o.x + this.f62540T)) + this.f62550j.right) - min, (this.f62563w.bottom + this.f62550j.bottom) - min2);
        this.f62565y.set(this.f62563w.left, BitmapDescriptorFactory.HUE_RED, (this.f62564x.right - this.f62550j.right) - this.f62563w.width(), BitmapDescriptorFactory.HUE_RED);
        this.f62549i = Math.min(Math.min(this.f62564x.width(), this.f62564x.height()) / 2.0f, this.f62549i);
        Drawable drawable = this.f62545e;
        if (drawable != null) {
            drawable.setBounds((int) this.f62564x.left, (int) this.f62564x.top, m91690a((double) this.f62564x.right), m91690a((double) this.f62564x.bottom));
        }
        if (this.f62538R != null) {
            float width = this.f62564x.left + ((((this.f62564x.width() - this.f62563w.width()) - this.f62550j.right) - ((float) this.f62538R.getWidth())) / 2.0f);
            if (this.f62550j.left < BitmapDescriptorFactory.HUE_RED) {
                f = this.f62550j.left * -0.5f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f5 = width + f;
            if (!this.f62524D && this.f62543W) {
                f5 += this.f62549i / 4.0f;
            }
            float height = this.f62564x.top + ((this.f62564x.height() - ((float) this.f62538R.getHeight())) / 2.0f);
            this.f62566z.set(f5, height, ((float) this.f62538R.getWidth()) + f5, ((float) this.f62538R.getHeight()) + height);
        }
        if (this.f62539S != null) {
            float width2 = (this.f62564x.right - ((((this.f62564x.width() - this.f62563w.width()) - this.f62550j.left) - ((float) this.f62539S.getWidth())) / 2.0f)) - ((float) this.f62539S.getWidth());
            if (this.f62550j.right < BitmapDescriptorFactory.HUE_RED) {
                f3 = this.f62550j.right * 0.5f;
            }
            float f6 = width2 + f3;
            if (!this.f62524D && this.f62543W) {
                f6 -= this.f62549i / 4.0f;
            }
            float height2 = this.f62564x.top + ((this.f62564x.height() - ((float) this.f62539S.getHeight())) / 2.0f);
            this.f62521A.set(f6, height2, ((float) this.f62539S.getWidth()) + f6, ((float) this.f62539S.getHeight()) + height2);
        }
    }

    public void setAnimationDuration(long j) {
        this.f62552l = j;
    }

    public void setFadeBack(boolean z) {
        this.f62553m = z;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.larksuite.component.ui.button.LKUISwitchButton.SavedState.C256301 */

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
        CharSequence f62567a;

        /* renamed from: b */
        CharSequence f62568b;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f62567a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f62568b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f62567a, parcel, i);
            TextUtils.writeToParcel(this.f62568b, parcel, i);
        }
    }

    public LKUISwitchButton(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private int m91690a(double d) {
        return (int) Math.ceil(d);
    }

    public void setBackMeasureRatio(float f) {
        this.f62551k = f;
        requestLayout();
    }

    public void setDrawDebugRect(boolean z) {
        this.f62525E = z;
        invalidate();
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.ab = onCheckedChangeListener;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f62546f = colorStateList;
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
        this.f62549i = f;
        if (!this.f62524D) {
            invalidate();
        }
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f62547g = colorStateList;
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
        this.f62548h = f;
        if (!this.f62523C) {
            invalidate();
        }
    }

    /* renamed from: a */
    private Layout m91692a(CharSequence charSequence) {
        TextPaint textPaint = this.f62537Q;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        mo89121a(savedState.f62567a, savedState.f62568b);
        this.aa = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.aa = false;
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z;
        this.f62545e = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f62524D = z;
        mo208545a();
        refreshDrawableState();
        requestLayout();
        invalidate();
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            mo89122a(z);
        }
        if (this.aa) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        float f;
        super.setChecked(z);
        ObjectAnimator objectAnimator = this.f62526F;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f62526F.cancel();
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
        if (this.ab == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.ab);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.ab == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.ab);
    }

    public final void setProcess(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f62527G = f;
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z;
        this.f62544d = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f62523C = z;
        mo208545a();
        refreshDrawableState();
        requestLayout();
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            mo89119a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            mo89119a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbSize(PointF pointF) {
        if (pointF == null) {
            float f = getResources().getDisplayMetrics().density * 20.0f;
            mo89118a(f, f);
            return;
        }
        mo89118a(pointF.x, pointF.y);
    }

    public void setTintColor(int i) {
        this.f62554n = i;
        this.f62547g = C25631a.m91703a(i);
        this.f62546f = C25631a.m91704b(this.f62554n);
        this.f62524D = false;
        this.f62523C = false;
        refreshDrawableState();
        invalidate();
    }

    /* renamed from: b */
    private int m91694b(int i) {
        float f;
        float f2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int a = m91690a((double) Math.max(this.f62555o.y, this.f62555o.y + this.f62550j.top + this.f62550j.right));
        Layout layout = this.f62538R;
        if (layout != null) {
            f = (float) layout.getHeight();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        Layout layout2 = this.f62539S;
        if (layout2 != null) {
            f2 = (float) layout2.getHeight();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f62541U = BitmapDescriptorFactory.HUE_RED;
        } else {
            float max = Math.max(f, f2);
            this.f62541U = max;
            a = m91690a((double) Math.max((float) a, max));
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
    private int m91691a(int i) {
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int a = m91690a((double) (this.f62555o.x * this.f62551k));
        if (this.f62524D) {
            a = Math.max(a, this.f62545e.getMinimumWidth());
        }
        Layout layout = this.f62538R;
        if (layout != null) {
            f = (float) layout.getWidth();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        Layout layout2 = this.f62539S;
        if (layout2 != null) {
            f2 = (float) layout2.getWidth();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            this.f62540T = BitmapDescriptorFactory.HUE_RED;
        } else {
            this.f62540T = Math.max(f, f2) + (this.f62542V * 2.0f);
            float f3 = (float) a;
            float f4 = f3 - this.f62555o.x;
            float f5 = this.f62540T;
            if (f4 < f5) {
                a = (int) (f3 + (f5 - f4));
            }
        }
        int max = Math.max(a, m91690a((double) (((float) a) + this.f62550j.left + this.f62550j.right)));
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
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.button.LKUISwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89122a(boolean z) {
        ObjectAnimator objectAnimator = this.f62526F;
        if (objectAnimator != null) {
            if (objectAnimator.isRunning()) {
                this.f62526F.cancel();
            }
            this.f62526F.setDuration(this.f62552l);
            if (z) {
                this.f62526F.setFloatValues(this.f62527G, 1.0f);
            } else {
                this.f62526F.setFloatValues(this.f62527G, 0.0f);
            }
            this.f62526F.start();
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
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.button.LKUISwitchButton.onDraw(android.graphics.Canvas):void");
    }

    public LKUISwitchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo89118a(float f, float f2) {
        this.f62555o.set(f, f2);
        mo208545a();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f62538R == null && (charSequence2 = this.f62535O) != null) {
            this.f62538R = m91692a(charSequence2);
        }
        if (this.f62539S == null && (charSequence = this.f62536P) != null) {
            this.f62539S = m91692a(charSequence);
        }
        setMeasuredDimension(m91691a(i), m91694b(i2));
    }

    /* renamed from: a */
    public void mo89121a(CharSequence charSequence, CharSequence charSequence2) {
        this.f62535O = charSequence;
        this.f62536P = charSequence2;
        this.f62538R = null;
        this.f62539S = null;
        requestLayout();
        invalidate();
    }

    public LKUISwitchButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LKUI_SwitchButton);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo89120a(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArray;
        int i3;
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
        int i4;
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
        this.f62532L = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f62533M = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f62522B = new Paint(1);
        Paint paint = new Paint(1);
        this.f62534N = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f62534N.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.f62537Q = getPaint();
        this.f62563w = new RectF();
        this.f62564x = new RectF();
        this.f62565y = new RectF();
        this.f62555o = new PointF();
        this.f62550j = new RectF();
        this.f62566z = new RectF();
        this.f62521A = new RectF();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "process", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).setDuration(250L);
        this.f62526F = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f62528H = new RectF();
        float f14 = getResources().getDisplayMetrics().density;
        float f15 = f14 * 2.0f;
        float f16 = f14 * 20.0f;
        float f17 = f16 / 2.0f;
        if (attributeSet == null) {
            typedArray = null;
        } else {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.kswAnimationDuration, R.attr.kswAutoAdjustTextPosition, R.attr.kswBackColor, R.attr.kswBackDrawable, R.attr.kswBackMeasureRatio, R.attr.kswBackRadius, R.attr.kswFadeBack, R.attr.kswTextMarginH, R.attr.kswTextOff, R.attr.kswTextOn, R.attr.kswThumbColor, R.attr.kswThumbDrawable, R.attr.kswThumbHeight, R.attr.kswThumbMargin, R.attr.kswThumbMarginBottom, R.attr.kswThumbMarginLeft, R.attr.kswThumbMarginRight, R.attr.kswThumbMarginTop, R.attr.kswThumbRadius, R.attr.kswThumbWidth, R.attr.kswTintColor}, i, i2);
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
            i3 = integer;
            i4 = color;
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
            i4 = 0;
            f10 = BitmapDescriptorFactory.HUE_RED;
            drawable2 = null;
            colorStateList = null;
            drawable = null;
            f7 = BitmapDescriptorFactory.HUE_RED;
            f6 = BitmapDescriptorFactory.HUE_RED;
            z = true;
            f2 = 1.8f;
            f = BitmapDescriptorFactory.HUE_RED;
            i3 = 250;
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
        this.f62535O = str;
        this.f62536P = str2;
        this.f62542V = f8;
        this.f62543W = z2;
        this.f62544d = drawable2;
        this.f62547g = colorStateList;
        if (drawable2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f62523C = z3;
        this.f62554n = i4;
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true)) {
                this.f62554n = typedValue.data;
            } else {
                this.f62554n = 3309506;
            }
        }
        if (!this.f62523C && this.f62547g == null) {
            ColorStateList a = C25631a.m91703a(this.f62554n);
            this.f62547g = a;
            this.f62556p = a.getDefaultColor();
        }
        if (this.f62523C) {
            f5 = Math.max(f5, (float) this.f62544d.getMinimumWidth());
            f9 = Math.max(f9, (float) this.f62544d.getMinimumHeight());
        }
        this.f62555o.set(f5, f9);
        this.f62545e = drawable;
        this.f62546f = colorStateList2;
        if (drawable != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f62524D = z4;
        if (!z4 && colorStateList2 == null) {
            ColorStateList b = C25631a.m91704b(this.f62554n);
            this.f62546f = b;
            int defaultColor = b.getDefaultColor();
            this.f62557q = defaultColor;
            this.f62558r = this.f62546f.getColorForState(f62519b, defaultColor);
        }
        this.f62550j.set(f11, f10, f, f12);
        if (this.f62550j.width() >= BitmapDescriptorFactory.HUE_RED) {
            f13 = Math.max(f2, 1.0f);
        } else {
            f13 = f2;
        }
        this.f62551k = f13;
        this.f62548h = f3;
        this.f62549i = f4;
        long j = (long) i3;
        this.f62552l = j;
        this.f62553m = z;
        this.f62526F.setDuration(j);
        if (isChecked()) {
            setProcess(1.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo208545a();
        }
    }

    public LKUISwitchButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f62543W = true;
        mo89120a(attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo89119a(float f, float f2, float f3, float f4) {
        this.f62550j.set(f, f2, f3, f4);
        requestLayout();
    }
}
