package com.tt.miniapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class AppbrandSwitch extends CompoundButton {

    /* renamed from: t */
    private static final int[] f169270t = {16842912};

    /* renamed from: a */
    private Drawable f169271a;

    /* renamed from: b */
    private Drawable f169272b;

    /* renamed from: c */
    private int f169273c;

    /* renamed from: d */
    private int f169274d;

    /* renamed from: e */
    private int f169275e;

    /* renamed from: f */
    private int f169276f;

    /* renamed from: g */
    private float f169277g;

    /* renamed from: h */
    private float f169278h;

    /* renamed from: i */
    private VelocityTracker f169279i;

    /* renamed from: j */
    private int f169280j;

    /* renamed from: k */
    private float f169281k;

    /* renamed from: l */
    private int f169282l;

    /* renamed from: m */
    private int f169283m;

    /* renamed from: n */
    private int f169284n;

    /* renamed from: o */
    private int f169285o;

    /* renamed from: p */
    private int f169286p;

    /* renamed from: q */
    private int f169287q;

    /* renamed from: r */
    private int f169288r;

    /* renamed from: s */
    private final Rect f169289s;

    public Drawable getThumbDrawable() {
        return this.f169271a;
    }

    public Drawable getTrackDrawable() {
        return this.f169272b;
    }

    private boolean getTargetCheckedState() {
        if (this.f169281k >= ((float) (getThumbScrollRange() / 2))) {
            return true;
        }
        return false;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f169272b;
        if (drawable == null) {
            return 0;
        }
        drawable.getPadding(this.f169289s);
        return ((this.f169282l - this.f169284n) - this.f169289s.left) - this.f169289s.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f169271a;
        if (drawable != null) {
            drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f169272b;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
        }
        invalidate();
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f169282l;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f169274d;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f169282l;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f169274d;
        }
        return compoundPaddingRight;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo233448a(boolean z) {
        setChecked(z);
    }

    public AppbrandSwitch(Context context) {
        this(context, null);
    }

    public void setSwitchPadding(int i) {
        this.f169274d = i;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f169271a = drawable;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.f169272b = drawable;
        requestLayout();
    }

    /* renamed from: a */
    private void m261732a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void setThumbPosition(boolean z) {
        float f;
        if (z) {
            f = (float) getThumbScrollRange();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f169281k = f;
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        setThumbPosition(isChecked());
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(getContext().getResources().getDrawable(i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f169270t);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f169271a || drawable == this.f169272b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m261734b(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        this.f169275e = 0;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        m261732a(motionEvent);
        if (z) {
            this.f169279i.computeCurrentVelocity(1000);
            float xVelocity = this.f169279i.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f169280j)) {
                z2 = getTargetCheckedState();
            } else if (xVelocity > BitmapDescriptorFactory.HUE_RED) {
                z2 = true;
            }
            mo233448a(z2);
            return;
        }
        mo233448a(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f169285o;
        int i2 = this.f169286p;
        int i3 = this.f169287q;
        int i4 = this.f169288r;
        this.f169272b.setBounds(i, i2, i3, i4);
        this.f169272b.draw(canvas);
        canvas.save();
        this.f169272b.getPadding(this.f169289s);
        int i5 = i + this.f169289s.left;
        canvas.clipRect(i5, i2, i3 - this.f169289s.right, i4);
        this.f169271a.getPadding(this.f169289s);
        int i6 = (int) (this.f169281k + 0.5f);
        this.f169271a.setBounds((i5 - this.f169289s.left) + i6, i2, i5 + i6 + this.f169284n + this.f169289s.right, i4);
        this.f169271a.draw(canvas);
        canvas.restore();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.view.AppbrandSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public AppbrandSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m261733a(float f, float f2) {
        this.f169271a.getPadding(this.f169289s);
        int i = this.f169286p;
        int i2 = this.f169276f;
        int i3 = i - i2;
        int i4 = (this.f169285o + ((int) (this.f169281k + 0.5f))) - i2;
        int i5 = this.f169284n + i4 + this.f169289s.left + this.f169289s.right;
        int i6 = this.f169276f;
        int i7 = i5 + i6;
        int i8 = this.f169288r + i6;
        if (f <= ((float) i4) || f >= ((float) i7) || f2 <= ((float) i3) || f2 >= ((float) i8)) {
            return false;
        }
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f169271a == null) {
            this.f169271a = getResources().getDrawable(R.drawable.microapp_m_button_switch_all);
        }
        if (this.f169272b == null) {
            this.f169272b = getResources().getDrawable(R.drawable.microapp_m_switch_track);
        }
        Drawable drawable = this.f169272b;
        if (drawable != null && this.f169271a != null) {
            int max = Math.max(this.f169273c, drawable.getIntrinsicWidth());
            int intrinsicHeight = this.f169272b.getIntrinsicHeight();
            this.f169284n = this.f169271a.getIntrinsicWidth();
            this.f169282l = max;
            this.f169283m = intrinsicHeight;
            setMeasuredDimension(max, intrinsicHeight);
        }
    }

    public AppbrandSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f169279i = VelocityTracker.obtain();
        this.f169289s = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.as_switchMinWidth, R.attr.as_switchPadding, R.attr.as_thumb, R.attr.as_track}, i, 0);
        this.f169271a = obtainStyledAttributes.getDrawable(2);
        this.f169272b = obtainStyledAttributes.getDrawable(3);
        this.f169273c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f169274d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f169276f = viewConfiguration.getScaledTouchSlop();
        this.f169280j = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        setThumbPosition(isChecked());
        int width = getWidth() - getPaddingRight();
        int i8 = width - this.f169282l;
        int gravity = getGravity() & SmEvents.EVENT_NE_RR;
        if (gravity == 16) {
            i7 = this.f169283m;
            i6 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            i6 = getPaddingTop();
            i7 = this.f169283m;
        } else {
            i5 = getHeight() - getPaddingBottom();
            i6 = i5 - this.f169283m;
            this.f169285o = i8;
            this.f169286p = i6;
            this.f169288r = i5;
            this.f169287q = width;
        }
        i5 = i7 + i6;
        this.f169285o = i8;
        this.f169286p = i6;
        this.f169288r = i5;
        this.f169287q = width;
    }
}
