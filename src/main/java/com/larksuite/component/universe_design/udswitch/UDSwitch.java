package com.larksuite.component.universe_design.udswitch;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.C25817b;
import com.larksuite.component.universe_design.util.C25818j;
import com.larksuite.suite.R;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b'\b\u0016\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u000eH\u0002J\b\u0010E\u001a\u00020CH\u0002J\b\u0010F\u001a\u00020CH\u0002J\b\u0010G\u001a\u00020CH\u0002J\u0010\u0010H\u001a\u00020C2\u0006\u0010I\u001a\u00020JH\u0002J \u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020-2\u0006\u0010N\u001a\u00020-H\u0002J\u0012\u0010O\u001a\u00020C2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0018\u0010R\u001a\u00020C2\u0006\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020-H\u0016J\b\u0010U\u001a\u00020CH\u0014J\b\u0010V\u001a\u00020\tH\u0016J\b\u0010W\u001a\u00020\tH\u0016J\b\u0010X\u001a\u00020\u000eH\u0002J\b\u0010Y\u001a\u0004\u0018\u00010+J\b\u0010Z\u001a\u00020\tH\u0002J\b\u0010[\u001a\u00020\tH\u0002J\b\u0010\\\u001a\u0004\u0018\u00010/J\b\u0010]\u001a\u0004\u0018\u00010+J\b\u0010^\u001a\u0004\u0018\u00010/J\u0018\u0010_\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020-H\u0002J*\u0010`\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010a\u001a\u00020CH\u0016J\u0012\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020\tH\u0014J\u0010\u0010e\u001a\u00020C2\u0006\u0010f\u001a\u00020QH\u0014J0\u0010g\u001a\u00020C2\u0006\u0010h\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\t2\u0006\u0010j\u001a\u00020\t2\u0006\u0010k\u001a\u00020\t2\u0006\u0010l\u001a\u00020\tH\u0014J\u0018\u0010m\u001a\u00020C2\u0006\u0010n\u001a\u00020\t2\u0006\u0010o\u001a\u00020\tH\u0014J\u0010\u0010p\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010q\u001a\u00020C2\u0006\u0010r\u001a\u00020\u000eH\u0016J\u000e\u0010s\u001a\u00020C2\u0006\u0010r\u001a\u00020\u000eJ\u000e\u0010t\u001a\u00020C2\u0006\u0010r\u001a\u00020\u000eJ\u0012\u0010u\u001a\u00020C2\b\u0010v\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010w\u001a\u00020C2\u0006\u0010x\u001a\u00020\tJ\u0010\u0010y\u001a\u00020C2\b\u0010z\u001a\u0004\u0018\u00010+J\u0010\u0010{\u001a\u00020C2\u0006\u0010|\u001a\u00020-H\u0016J\u000e\u0010}\u001a\u00020C2\u0006\u0010~\u001a\u00020\tJ\u000f\u0010\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020/J\u0012\u0010\u0001\u001a\u00020C2\t\u0010\u0001\u001a\u0004\u0018\u00010+J\u000f\u0010\u0001\u001a\u00020C2\u0006\u0010~\u001a\u00020\tJ\u0010\u0010\u0001\u001a\u00020C2\u0007\u0010\u0001\u001a\u00020/J\u0011\u0010\u0001\u001a\u00020C2\u0006\u0010I\u001a\u00020JH\u0002J\t\u0010\u0001\u001a\u00020CH\u0016J\u0012\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020+H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u000e\u0010 \u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010$\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u000e\u0010'\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\u000e\u00105\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n >*\u0004\u0018\u00010=0=X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001b¨\u0006\u0001"}, d2 = {"Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "Landroid/widget/CompoundButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mHasThumbTint", "", "mHasThumbTintMode", "mHasTrackTint", "mHasTrackTintMode", "mMinFlingVelocity", "mOnCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mPositionAnimator", "Landroid/animation/ObjectAnimator;", "mSwitchBottom", "getMSwitchBottom", "()I", "setMSwitchBottom", "(I)V", "mSwitchHeight", "mSwitchLeft", "getMSwitchLeft", "setMSwitchLeft", "mSwitchMinWidth", "mSwitchRight", "getMSwitchRight", "setMSwitchRight", "mSwitchTop", "getMSwitchTop", "setMSwitchTop", "mSwitchWidth", "mTempRect", "Landroid/graphics/Rect;", "mThumbDrawable", "Landroid/graphics/drawable/Drawable;", "mThumbPosition", "", "mThumbTintList", "Landroid/content/res/ColorStateList;", "mThumbTintMode", "Landroid/graphics/PorterDuff$Mode;", "mThumbWidth", "getMThumbWidth", "setMThumbWidth", "mTouchMode", "mTouchSlop", "mTouchX", "mTouchY", "mTrackDrawable", "mTrackTintList", "mTrackTintMode", "mVelocityTracker", "Landroid/view/VelocityTracker;", "kotlin.jvm.PlatformType", "thumbInitialLeft", "getThumbInitialLeft", "setThumbInitialLeft", "animateThumbToCheckedState", "", "newCheckedState", "applyThumbTint", "applyTrackTint", "cancelPositionAnimator", "cancelSuperTouch", "ev", "Landroid/view/MotionEvent;", "constrain", "amount", "low", "high", "draw", C60375c.f150914a, "Landroid/graphics/Canvas;", "drawableHotspotChanged", "x", "y", "drawableStateChanged", "getCompoundPaddingLeft", "getCompoundPaddingRight", "getTargetCheckedState", "getThumbDrawable", "getThumbOffset", "getThumbScrollRange", "getThumbTintList", "getTrackDrawable", "getTrackTintList", "hitThumb", "initView", "jumpDrawablesToCurrentState", "onCreateDrawableState", "", "extraSpace", "onDraw", "canvas", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "setChecked", "checked", "setCheckedIgnoreEvent", "setCheckedImmediately", "setOnCheckedChangeListener", "listener", "setSwitchMinWidth", "pixels", "setThumbDrawable", "thumb", "setThumbPosition", "position", "setThumbResource", "resId", "setThumbTintList", "tint", "setTrackDrawable", "track", "setTrackResource", "setTrackTintList", "stopDrag", "toggle", "verifyDrawable", "who", "Companion", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDSwitch extends CompoundButton {

    /* renamed from: b */
    public static final int[] f63828b = {16842912};

    /* renamed from: c */
    public static final Property<UDSwitch, Float> f63829c = new C25813b(Float.TYPE, "thumbPos");

    /* renamed from: d */
    public static final Companion f63830d = new Companion(null);

    /* renamed from: A */
    private boolean f63831A;

    /* renamed from: B */
    private boolean f63832B;

    /* renamed from: C */
    private int f63833C;

    /* renamed from: D */
    private final Rect f63834D;

    /* renamed from: E */
    private ObjectAnimator f63835E;

    /* renamed from: F */
    private CompoundButton.OnCheckedChangeListener f63836F;

    /* renamed from: a */
    public float f63837a;

    /* renamed from: e */
    private int f63838e;

    /* renamed from: f */
    private int f63839f;

    /* renamed from: g */
    private int f63840g;

    /* renamed from: h */
    private int f63841h;

    /* renamed from: i */
    private int f63842i;

    /* renamed from: j */
    private int f63843j;

    /* renamed from: k */
    private int f63844k;

    /* renamed from: l */
    private int f63845l;

    /* renamed from: m */
    private Drawable f63846m;

    /* renamed from: n */
    private ColorStateList f63847n;

    /* renamed from: o */
    private PorterDuff.Mode f63848o;

    /* renamed from: p */
    private boolean f63849p;

    /* renamed from: q */
    private boolean f63850q;

    /* renamed from: r */
    private int f63851r;

    /* renamed from: s */
    private int f63852s;

    /* renamed from: t */
    private float f63853t;

    /* renamed from: u */
    private float f63854u;

    /* renamed from: v */
    private final VelocityTracker f63855v;

    /* renamed from: w */
    private int f63856w;

    /* renamed from: x */
    private Drawable f63857x;

    /* renamed from: y */
    private ColorStateList f63858y;

    /* renamed from: z */
    private PorterDuff.Mode f63859z;

    /* renamed from: a */
    private final float m93272a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/universe_design/udswitch/UDSwitch$Companion;", "", "()V", "CHECKED_STATE_SET", "", "getCHECKED_STATE_SET", "()[I", "THUMB_ANIMATION_DURATION", "", "THUMB_POS", "Landroid/util/Property;", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "", "getTHUMB_POS", "()Landroid/util/Property;", "TOUCH_MODE_DOWN", "TOUCH_MODE_DRAGGING", "TOUCH_MODE_IDLE", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitch$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final int getMSwitchBottom() {
        return this.f63843j;
    }

    /* access modifiers changed from: protected */
    public final int getMSwitchLeft() {
        return this.f63840g;
    }

    /* access modifiers changed from: protected */
    public final int getMSwitchRight() {
        return this.f63842i;
    }

    /* access modifiers changed from: protected */
    public final int getMSwitchTop() {
        return this.f63841h;
    }

    /* access modifiers changed from: protected */
    public final int getMThumbWidth() {
        return this.f63845l;
    }

    public final Drawable getThumbDrawable() {
        return this.f63846m;
    }

    /* access modifiers changed from: protected */
    public final int getThumbInitialLeft() {
        return this.f63844k;
    }

    public final ColorStateList getThumbTintList() {
        return this.f63847n;
    }

    public final Drawable getTrackDrawable() {
        return this.f63857x;
    }

    public final ColorStateList getTrackTintList() {
        return this.f63858y;
    }

    /* renamed from: c */
    private final void m93281c() {
        ObjectAnimator objectAnimator = this.f63835E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private final boolean getTargetCheckedState() {
        if (this.f63837a > 0.5f) {
            return true;
        }
        return false;
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    private final int getThumbOffset() {
        float f;
        if (C25818j.m93322a(this)) {
            f = 1.0f - this.f63837a;
        } else {
            f = this.f63837a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public int getCompoundPaddingLeft() {
        if (!C25818j.m93322a(this)) {
            return super.getCompoundPaddingLeft();
        }
        return super.getCompoundPaddingLeft() + this.f63838e;
    }

    public int getCompoundPaddingRight() {
        if (C25818j.m93322a(this)) {
            return super.getCompoundPaddingRight();
        }
        return super.getCompoundPaddingRight() + this.f63838e;
    }

    private final int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f63857x;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f63834D;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f63846m;
        if (drawable2 != null) {
            rect = C25817b.m93299a(drawable2);
            Intrinsics.checkExpressionValueIsNotNull(rect, "DrawableUtils.getOpticalBounds(mThumbDrawable)");
        } else {
            rect = C25817b.f63879a;
            Intrinsics.checkExpressionValueIsNotNull(rect, "DrawableUtils.INSETS_NONE");
        }
        return ((((this.f63838e - this.f63845l) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f63846m;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f63857x;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f63846m;
        if (drawable != null) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f63857x;
        if (drawable2 != null) {
            if (drawable2 == null) {
                Intrinsics.throwNpe();
            }
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f63835E;
        if (objectAnimator != null) {
            if (objectAnimator == null) {
                Intrinsics.throwNpe();
            }
            if (objectAnimator.isStarted()) {
                ObjectAnimator objectAnimator2 = this.f63835E;
                if (objectAnimator2 == null) {
                    Intrinsics.throwNpe();
                }
                objectAnimator2.end();
                this.f63835E = null;
            }
        }
    }

    /* renamed from: a */
    private final void mo91762a() {
        Drawable drawable = this.f63857x;
        if (drawable == null) {
            return;
        }
        if (this.f63831A || this.f63832B) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            this.f63857x = mutate;
            if (this.f63831A) {
                if (mutate == null) {
                    Intrinsics.throwNpe();
                }
                C0774a.m3768a(mutate, this.f63858y);
            }
            if (this.f63832B) {
                Drawable drawable2 = this.f63857x;
                if (drawable2 == null) {
                    Intrinsics.throwNpe();
                }
                PorterDuff.Mode mode = this.f63859z;
                if (mode == null) {
                    Intrinsics.throwNpe();
                }
                C0774a.m3771a(drawable2, mode);
            }
            Drawable drawable3 = this.f63857x;
            if (drawable3 == null) {
                Intrinsics.throwNpe();
            }
            if (drawable3.isStateful()) {
                Drawable drawable4 = this.f63857x;
                if (drawable4 == null) {
                    Intrinsics.throwNpe();
                }
                drawable4.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private final void mo91764b() {
        Drawable drawable = this.f63846m;
        if (drawable == null) {
            return;
        }
        if (this.f63849p || this.f63850q) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            Drawable mutate = C0774a.m3779g(drawable).mutate();
            this.f63846m = mutate;
            if (this.f63849p) {
                if (mutate == null) {
                    Intrinsics.throwNpe();
                }
                C0774a.m3768a(mutate, this.f63847n);
            }
            if (this.f63850q) {
                Drawable drawable2 = this.f63846m;
                if (drawable2 == null) {
                    Intrinsics.throwNpe();
                }
                PorterDuff.Mode mode = this.f63848o;
                if (mode == null) {
                    Intrinsics.throwNpe();
                }
                C0774a.m3771a(drawable2, mode);
            }
            Drawable drawable3 = this.f63846m;
            if (drawable3 == null) {
                Intrinsics.throwNpe();
            }
            if (drawable3.isStateful()) {
                Drawable drawable4 = this.f63846m;
                if (drawable4 == null) {
                    Intrinsics.throwNpe();
                }
                drawable4.setState(getDrawableState());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMSwitchBottom(int i) {
        this.f63843j = i;
    }

    /* access modifiers changed from: protected */
    public final void setMSwitchLeft(int i) {
        this.f63840g = i;
    }

    /* access modifiers changed from: protected */
    public final void setMSwitchRight(int i) {
        this.f63842i = i;
    }

    /* access modifiers changed from: protected */
    public final void setMSwitchTop(int i) {
        this.f63841h = i;
    }

    /* access modifiers changed from: protected */
    public final void setMThumbWidth(int i) {
        this.f63845l = i;
    }

    /* access modifiers changed from: protected */
    public final void setThumbInitialLeft(int i) {
        this.f63844k = i;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f63836F = onCheckedChangeListener;
    }

    public final void setSwitchMinWidth(int i) {
        this.f63833C = i;
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f63837a = f;
        invalidate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"com/larksuite/component/universe_design/udswitch/UDSwitch$Companion$THUMB_POS$1", "Landroid/util/Property;", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "", "get", "udSwitch", "(Lcom/larksuite/component/universe_design/udswitch/UDSwitch;)Ljava/lang/Float;", "set", "", "value", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitch$b */
    public static final class C25813b extends Property<UDSwitch, Float> {
        /* renamed from: a */
        public Float get(UDSwitch uDSwitch) {
            Intrinsics.checkParameterIsNotNull(uDSwitch, "udSwitch");
            return Float.valueOf(uDSwitch.f63837a);
        }

        C25813b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ void set(UDSwitch uDSwitch, Float f) {
            mo91759a(uDSwitch, f.floatValue());
        }

        /* renamed from: a */
        public void mo91759a(UDSwitch uDSwitch, float f) {
            Intrinsics.checkParameterIsNotNull(uDSwitch, "udSwitch");
            uDSwitch.setThumbPosition(f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitch(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setCheckedImmediately(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        setThumbPosition(f);
    }

    public final void setThumbResource(int i) {
        setThumbDrawable(C0215a.m655b(getContext(), i));
    }

    public final void setThumbTintList(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "tint");
        this.f63847n = colorStateList;
        this.f63849p = true;
        mo91764b();
    }

    public final void setTrackResource(int i) {
        setTrackDrawable(C0215a.m655b(getContext(), i));
    }

    public final void setTrackTintList(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "tint");
        this.f63858y = colorStateList;
        this.f63831A = true;
        mo91762a();
    }

    /* renamed from: a */
    private final void m93275a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Intrinsics.checkExpressionValueIsNotNull(obtain, "cancel");
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f63828b);
        }
        return onCreateDrawableState;
    }

    public final void setCheckedIgnoreEvent(boolean z) {
        if (this.f63836F == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f63836F);
    }

    public final void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f63846m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f63846m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public final void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f63857x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f63857x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "who");
        if (super.verifyDrawable(drawable) || drawable == this.f63846m || drawable == this.f63857x) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void mo91763a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f63829c, f);
        this.f63835E = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration((long) 250);
            if (Build.VERSION.SDK_INT >= 18) {
                ofFloat.setAutoCancel(true);
            }
            ofFloat.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.f63834D;
        Drawable drawable = this.f63857x;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        Drawable drawable2 = this.f63846m;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int save = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !ViewCompat.m4012F(this)) {
            m93281c();
            if (isChecked) {
                f = 1.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            setThumbPosition(f);
            return;
        }
        mo91763a(isChecked);
    }

    /* renamed from: b */
    private final void m93280b(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        this.f63851r = 0;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f63855v.computeCurrentVelocity(1000);
            VelocityTracker velocityTracker = this.f63855v;
            Intrinsics.checkExpressionValueIsNotNull(velocityTracker, "mVelocityTracker");
            float xVelocity = velocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f63856w)) {
                if (!C25818j.m93322a(this) ? xVelocity > ((float) 0) : xVelocity < ((float) 0)) {
                    z2 = true;
                }
                isChecked = z2;
            } else {
                isChecked = getTargetCheckedState();
            }
        }
        setChecked(isChecked);
        m93275a(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f63834D;
        int i3 = this.f63840g;
        int i4 = this.f63841h;
        int i5 = this.f63842i;
        int i6 = this.f63843j;
        this.f63844k = getThumbOffset() + i3;
        Drawable drawable = this.f63846m;
        if (drawable != null) {
            rect = C25817b.m93299a(drawable);
        } else {
            rect = C25817b.f63879a;
        }
        Drawable drawable2 = this.f63857x;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            this.f63844k += rect2.left;
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
                    drawable2.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            drawable2.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f63846m;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = this.f63844k - rect2.left;
            int i8 = this.f63844k + this.f63845l + rect2.right;
            drawable3.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0774a.m3767a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r0 != 3) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.udswitch.UDSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f63846m;
        if (drawable != null) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            C0774a.m3765a(drawable, f, f2);
        }
        Drawable drawable2 = this.f63857x;
        if (drawable2 != null) {
            if (drawable2 == null) {
                Intrinsics.throwNpe();
            }
            C0774a.m3765a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Rect rect = this.f63834D;
        Drawable drawable = this.f63846m;
        int i5 = 0;
        if (drawable != null) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            drawable.getPadding(rect);
            Drawable drawable2 = this.f63846m;
            if (drawable2 == null) {
                Intrinsics.throwNpe();
            }
            i4 = (drawable2.getIntrinsicWidth() - rect.left) - rect.right;
            Drawable drawable3 = this.f63846m;
            if (drawable3 == null) {
                Intrinsics.throwNpe();
            }
            i3 = drawable3.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f63845l = i4;
        Drawable drawable4 = this.f63857x;
        if (drawable4 != null) {
            if (drawable4 == null) {
                Intrinsics.throwNpe();
            }
            drawable4.getPadding(rect);
            Drawable drawable5 = this.f63857x;
            if (drawable5 == null) {
                Intrinsics.throwNpe();
            }
            i5 = drawable5.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable6 = this.f63846m;
        if (drawable6 != null) {
            Rect a = C25817b.m93299a(drawable6);
            i6 = Math.max(i6, a.left);
            i7 = Math.max(i7, a.right);
        }
        int max = Math.max(i5, i3);
        this.f63838e = (int) Math.max(((float) this.f63833C) * 1.0f, (((float) this.f63845l) * 1.6f) + ((float) i6) + ((float) i7));
        this.f63839f = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    /* renamed from: a */
    private final boolean m93277a(float f, float f2) {
        if (this.f63846m == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        Drawable drawable = this.f63846m;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        drawable.getPadding(this.f63834D);
        int i = this.f63841h;
        int i2 = this.f63852s;
        int i3 = i - i2;
        int i4 = (this.f63840g + thumbOffset) - i2;
        int i5 = this.f63845l + i4 + this.f63834D.left + this.f63834D.right;
        int i6 = this.f63852s;
        int i7 = i5 + i6;
        int i8 = this.f63843j + i6;
        if (f <= ((float) i4) || f >= ((float) i7) || f2 <= ((float) i3) || f2 >= ((float) i8)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitch(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDSwitch);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63855v = VelocityTracker.obtain();
        this.f63834D = new Rect();
        m93274a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private final void m93274a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843074, R.attr.ud_switch_minWidth, R.attr.ud_switch_thumbTint, R.attr.ud_switch_track, R.attr.ud_switch_trackTint}, i, i2);
        if (obtainStyledAttributes != null) {
            this.f63846m = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
            this.f63847n = colorStateList;
            if (colorStateList != null) {
                this.f63849p = true;
                mo91764b();
            }
            this.f63857x = obtainStyledAttributes.getDrawable(3);
            this.f63858y = obtainStyledAttributes.getColorStateList(4);
            if (this.f63847n != null) {
                this.f63831A = true;
                mo91762a();
            }
            this.f63833C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f63852s = viewConfiguration.getScaledTouchSlop();
        this.f63856w = viewConfiguration.getScaledMinimumFlingVelocity();
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
        if (this.f63846m != null) {
            Rect rect = this.f63834D;
            Drawable drawable = this.f63857x;
            if (drawable != null) {
                if (drawable == null) {
                    Intrinsics.throwNpe();
                }
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C25817b.m93299a(this.f63846m);
            i5 = Math.max(0, a.left - rect.left);
            i11 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C25818j.m93322a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f63838e + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f63838e) + i5 + i11;
        }
        int gravity = getGravity() & SmEvents.EVENT_NE_RR;
        if (gravity == 16) {
            i10 = this.f63839f;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity == 48) {
            i9 = getPaddingTop();
            i10 = this.f63839f;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f63839f;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f63839f;
            this.f63840g = i7;
            this.f63841h = i9;
            this.f63843j = i8;
            this.f63842i = i6;
        }
        i8 = i10 + i9;
        this.f63840g = i7;
        this.f63841h = i9;
        this.f63843j = i8;
        this.f63842i = i6;
    }
}
