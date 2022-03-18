package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.p019b.C0280a;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    private static final int[] f1420O = {16842912};

    /* renamed from: c */
    private static final Property<SwitchCompat, Float> f1421c = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* class androidx.appcompat.widget.SwitchCompat.C04121 */

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1436a);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: A */
    private int f1422A;

    /* renamed from: B */
    private int f1423B;

    /* renamed from: C */
    private int f1424C;

    /* renamed from: D */
    private int f1425D;

    /* renamed from: E */
    private int f1426E;

    /* renamed from: F */
    private int f1427F;

    /* renamed from: G */
    private int f1428G;

    /* renamed from: H */
    private final TextPaint f1429H;

    /* renamed from: I */
    private ColorStateList f1430I;

    /* renamed from: J */
    private Layout f1431J;

    /* renamed from: K */
    private Layout f1432K;

    /* renamed from: L */
    private TransformationMethod f1433L;

    /* renamed from: M */
    private final C0452l f1434M;

    /* renamed from: N */
    private final Rect f1435N;

    /* renamed from: a */
    float f1436a;

    /* renamed from: b */
    ObjectAnimator f1437b;

    /* renamed from: d */
    private Drawable f1438d;

    /* renamed from: e */
    private ColorStateList f1439e;

    /* renamed from: f */
    private PorterDuff.Mode f1440f;

    /* renamed from: g */
    private boolean f1441g;

    /* renamed from: h */
    private boolean f1442h;

    /* renamed from: i */
    private Drawable f1443i;

    /* renamed from: j */
    private ColorStateList f1444j;

    /* renamed from: k */
    private PorterDuff.Mode f1445k;

    /* renamed from: l */
    private boolean f1446l;

    /* renamed from: m */
    private boolean f1447m;

    /* renamed from: n */
    private int f1448n;

    /* renamed from: o */
    private int f1449o;

    /* renamed from: p */
    private int f1450p;

    /* renamed from: q */
    private boolean f1451q;

    /* renamed from: r */
    private CharSequence f1452r;

    /* renamed from: s */
    private CharSequence f1453s;

    /* renamed from: t */
    private boolean f1454t;

    /* renamed from: u */
    private int f1455u;

    /* renamed from: v */
    private int f1456v;

    /* renamed from: w */
    private float f1457w;

    /* renamed from: x */
    private float f1458x;

    /* renamed from: y */
    private VelocityTracker f1459y;

    /* renamed from: z */
    private int f1460z;

    /* renamed from: a */
    private static float m1681a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public boolean getShowText() {
        return this.f1454t;
    }

    public boolean getSplitTrack() {
        return this.f1451q;
    }

    public int getSwitchMinWidth() {
        return this.f1449o;
    }

    public int getSwitchPadding() {
        return this.f1450p;
    }

    public CharSequence getTextOff() {
        return this.f1453s;
    }

    public CharSequence getTextOn() {
        return this.f1452r;
    }

    public Drawable getThumbDrawable() {
        return this.f1438d;
    }

    public int getThumbTextPadding() {
        return this.f1448n;
    }

    public ColorStateList getThumbTintList() {
        return this.f1439e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1440f;
    }

    public Drawable getTrackDrawable() {
        return this.f1443i;
    }

    public ColorStateList getTrackTintList() {
        return this.f1444j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1445k;
    }

    /* renamed from: a */
    public void mo2292a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1429H;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1429H;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1429H.setFakeBoldText(false);
        this.f1429H.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setSwitchTypeface(typeface);
    }

    /* renamed from: c */
    private void m1690c() {
        ObjectAnimator objectAnimator = this.f1437b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        if (this.f1436a > 0.5f) {
            return true;
        }
        return false;
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    private int getThumbOffset() {
        float f;
        if (al.m1864a(this)) {
            f = 1.0f - this.f1436a;
        } else {
            f = this.f1436a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public int getCompoundPaddingLeft() {
        if (!al.m1864a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1422A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1450p;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (al.m1864a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1422A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1450p;
        }
        return compoundPaddingRight;
    }

    /* renamed from: b */
    private void m1688b() {
        Drawable drawable = this.f1438d;
        if (drawable == null) {
            return;
        }
        if (this.f1441g || this.f1442h) {
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            this.f1438d = mutate;
            if (this.f1441g) {
                C0774a.m3768a(mutate, this.f1439e);
            }
            if (this.f1442h) {
                C0774a.m3771a(this.f1438d, this.f1440f);
            }
            if (this.f1438d.isStateful()) {
                this.f1438d.setState(getDrawableState());
            }
        }
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1443i;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1435N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1438d;
        if (drawable2 != null) {
            rect = C0460p.m2059a(drawable2);
        } else {
            rect = C0460p.f1685a;
        }
        return ((((this.f1422A - this.f1424C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1438d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1438d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1437b;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1437b.end();
            this.f1437b = null;
        }
    }

    /* renamed from: a */
    private void m1683a() {
        Drawable drawable = this.f1443i;
        if (drawable == null) {
            return;
        }
        if (this.f1446l || this.f1447m) {
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            this.f1443i = mutate;
            if (this.f1446l) {
                C0774a.m3768a(mutate, this.f1444j);
            }
            if (this.f1447m) {
                C0774a.m3771a(this.f1443i, this.f1445k);
            }
            if (this.f1443i.isStateful()) {
                this.f1443i.setState(getDrawableState());
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
    }

    public void setSplitTrack(boolean z) {
        this.f1451q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1449o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1450p = i;
        requestLayout();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1453s = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1452r = charSequence;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1436a = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.f1448n = i;
        requestLayout();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void setShowText(boolean z) {
        if (this.f1454t != z) {
            this.f1454t = z;
            requestLayout();
        }
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0215a.m655b(getContext(), i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1439e = colorStateList;
        this.f1441g = true;
        m1688b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1440f = mode;
        this.f1442h = true;
        m1688b();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0215a.m655b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1444j = colorStateList;
        this.f1446l = true;
        m1683a();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1445k = mode;
        this.f1447m = true;
        m1683a();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1420O);
        }
        return onCreateDrawableState;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1452r;
        } else {
            charSequence = this.f1453s;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1438d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1438d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1443i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1438d || drawable == this.f1443i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Layout m1682a(CharSequence charSequence) {
        int i;
        TransformationMethod transformationMethod = this.f1433L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.f1429H;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.f1452r;
        } else {
            charSequence = this.f1453s;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !ViewCompat.m4012F(this)) {
            m1690c();
            if (isChecked) {
                f = 1.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            setThumbPosition(f);
            return;
        }
        m1686a(isChecked);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1429H.getTypeface() != null && !this.f1429H.getTypeface().equals(typeface)) || (this.f1429H.getTypeface() == null && typeface != null)) {
            this.f1429H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: b */
    private void m1689b(MotionEvent motionEvent) {
        boolean z;
        this.f1455u = 0;
        boolean z2 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f1459y.computeCurrentVelocity(1000);
            float xVelocity = this.f1459y.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1460z)) {
                z2 = getTargetCheckedState();
            } else if (!al.m1864a(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        m1685a(motionEvent);
    }

    /* renamed from: a */
    private void m1685a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1435N;
        int i3 = this.f1425D;
        int i4 = this.f1426E;
        int i5 = this.f1427F;
        int i6 = this.f1428G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1438d;
        if (drawable != null) {
            rect = C0460p.m2059a(drawable);
        } else {
            rect = C0460p.f1685a;
        }
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            thumbOffset += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                if (rect.top > rect2.top) {
                    i = (rect.top - rect2.top) + i4;
                } else {
                    i = i4;
                }
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f1443i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1443i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1438d;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = thumbOffset - rect2.left;
            int i8 = thumbOffset + this.f1424C + rect2.right;
            this.f1438d.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0774a.m3767a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Layout layout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1435N;
        Drawable drawable = this.f1443i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1426E;
        int i3 = this.f1428G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1438d;
        if (drawable != null) {
            if (!this.f1451q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C0460p.m2059a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f1431J;
        } else {
            layout = this.f1432K;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1430I;
            if (colorStateList != null) {
                this.f1429H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1429H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m1686a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1421c, f);
        this.f1437b = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1437b.setAutoCancel(true);
        }
        this.f1437b.start();
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* renamed from: a */
    private void m1684a(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        mo2292a(typeface, i2);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1438d;
        if (drawable != null) {
            C0774a.m3765a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null) {
            C0774a.m3765a(drawable2, f, f2);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1454t) {
            if (this.f1431J == null) {
                this.f1431J = m1682a(this.f1452r);
            }
            if (this.f1432K == null) {
                this.f1432K = m1682a(this.f1453s);
            }
        }
        Rect rect = this.f1435N;
        Drawable drawable = this.f1438d;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1438d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1438d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1454t) {
            i5 = Math.max(this.f1431J.getWidth(), this.f1432K.getWidth()) + (this.f1448n * 2);
        } else {
            i5 = 0;
        }
        this.f1424C = Math.max(i5, i4);
        Drawable drawable2 = this.f1443i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f1443i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f1438d;
        if (drawable3 != null) {
            Rect a = C0460p.m2059a(drawable3);
            i7 = Math.max(i7, a.left);
            i8 = Math.max(i8, a.right);
        }
        int max = Math.max(this.f1449o, (this.f1424C * 2) + i7 + i8);
        int max2 = Math.max(i6, i3);
        this.f1422A = max;
        this.f1423B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    /* renamed from: a */
    private boolean m1687a(float f, float f2) {
        if (this.f1438d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1438d.getPadding(this.f1435N);
        int i = this.f1426E;
        int i2 = this.f1456v;
        int i3 = i - i2;
        int i4 = (this.f1425D + thumbOffset) - i2;
        int i5 = this.f1424C + i4 + this.f1435N.left + this.f1435N.right;
        int i6 = this.f1456v;
        int i7 = i5 + i6;
        int i8 = this.f1428G + i6;
        if (f <= ((float) i4) || f >= ((float) i7) || f2 <= ((float) i3) || f2 >= ((float) i8)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo2291a(Context context, int i) {
        C0427af a = C0427af.m1776a(context, i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale});
        ColorStateList e = a.mo2488e(3);
        if (e != null) {
            this.f1430I = e;
        } else {
            this.f1430I = getTextColors();
        }
        int e2 = a.mo2487e(0, 0);
        if (e2 != 0) {
            float f = (float) e2;
            if (f != this.f1429H.getTextSize()) {
                this.f1429H.setTextSize(f);
                requestLayout();
            }
        }
        m1684a(a.mo2474a(1, -1), a.mo2474a(2, -1));
        if (a.mo2478a(14, false)) {
            this.f1433L = new C0280a(getContext());
        } else {
            this.f1433L = null;
        }
        a.mo2482b();
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1459y = VelocityTracker.obtain();
        this.f1435N = new Rect();
        C0422aa.m1768a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1429H = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0427af a = C0427af.m1778a(context, attributeSet, new int[]{16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode}, i, 0);
        ViewCompat.m4034a(this, context, new int[]{16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode}, attributeSet, a.mo2475a(), i, 0);
        Drawable a2 = a.mo2477a(2);
        this.f1438d = a2;
        if (a2 != null) {
            a2.setCallback(this);
        }
        Drawable a3 = a.mo2477a(11);
        this.f1443i = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        this.f1452r = a.mo2484c(0);
        this.f1453s = a.mo2484c(1);
        this.f1454t = a.mo2478a(3, true);
        this.f1448n = a.mo2487e(8, 0);
        this.f1449o = a.mo2487e(5, 0);
        this.f1450p = a.mo2487e(6, 0);
        this.f1451q = a.mo2478a(4, false);
        ColorStateList e = a.mo2488e(9);
        if (e != null) {
            this.f1439e = e;
            this.f1441g = true;
        }
        PorterDuff.Mode a4 = C0460p.m2058a(a.mo2474a(10, -1), null);
        if (this.f1440f != a4) {
            this.f1440f = a4;
            this.f1442h = true;
        }
        if (this.f1441g || this.f1442h) {
            m1688b();
        }
        ColorStateList e2 = a.mo2488e(12);
        if (e2 != null) {
            this.f1444j = e2;
            this.f1446l = true;
        }
        PorterDuff.Mode a5 = C0460p.m2058a(a.mo2474a(13, -1), null);
        if (this.f1445k != a5) {
            this.f1445k = a5;
            this.f1447m = true;
        }
        if (this.f1446l || this.f1447m) {
            m1683a();
        }
        int g = a.mo2491g(7, 0);
        if (g != 0) {
            mo2291a(context, g);
        }
        C0452l lVar = new C0452l(this);
        this.f1434M = lVar;
        lVar.mo2619a(attributeSet, i);
        a.mo2482b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1456v = viewConfiguration.getScaledTouchSlop();
        this.f1460z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1438d != null) {
            Rect rect = this.f1435N;
            Drawable drawable = this.f1443i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C0460p.m2059a(this.f1438d);
            i5 = Math.max(0, a.left - rect.left);
            i11 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (al.m1864a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1422A + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1422A) + i5 + i11;
        }
        int gravity = getGravity() & SmEvents.EVENT_NE_RR;
        if (gravity == 16) {
            i10 = this.f1423B;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1423B;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1423B;
            this.f1425D = i7;
            this.f1426E = i9;
            this.f1428G = i8;
            this.f1427F = i6;
        }
        i8 = i10 + i9;
        this.f1425D = i7;
        this.f1426E = i9;
        this.f1428G = i8;
        this.f1427F = i6;
    }
}
