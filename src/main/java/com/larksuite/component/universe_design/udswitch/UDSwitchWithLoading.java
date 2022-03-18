package com.larksuite.component.universe_design.udswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.C0774a;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u000e\u0014\b\u0016\u0018\u0000 G2\u00020\u0001:\u0002GHB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J(\u0010+\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002J\b\u0010.\u001a\u0004\u0018\u00010\u0018J\b\u0010/\u001a\u00020'H\u0002J*\u00100\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020*H\u0014J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0014J\b\u00106\u001a\u00020\u0011H\u0016J\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u0018J\u000e\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\tJ\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\u0011H\u0002J\u000e\u0010=\u001a\u00020%2\u0006\u0010:\u001a\u00020\tJ\u000e\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@J\u000e\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020\u001cJ\b\u0010C\u001a\u00020%H\u0002J\b\u0010D\u001a\u00020%H\u0002J\u000e\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020\u0011R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading;", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "drawablesAttachListener", "com/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$drawablesAttachListener$1", "Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$drawablesAttachListener$1;", "mHasLoadingTint", "", "mHasLoadingTintMode", "mLoadingAnimatorCallback", "com/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$mLoadingAnimatorCallback$1", "Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$mLoadingAnimatorCallback$1;", "mLoadingCheckedColor", "mLoadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "mLoadingRadius", "mLoadingState", "mLoadingStatusChangeListener", "Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$OnLoadingStatusChangeListener;", "mLoadingStrokeWidth", "mLoadingTintMode", "Landroid/graphics/PorterDuff$Mode;", "mLoadingUnCheckedColor", "mLoadingWidth", "mTempRect", "Landroid/graphics/Rect;", "changeColor", "", "progressColors", "", "draw", C60375c.f150914a, "Landroid/graphics/Canvas;", "generateProgressDrawable", "progressRadiusPx", "progressStrokePx", "getLoadingDrawable", "getStateColor", "initView", "onDraw", "canvas", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "performClick", "setLoadingDrawable", "loading", "setLoadingRadius", "pixels", "setLoadingState", "isLoading", "setLoadingStrokeWidth", "setLoadingTintList", "tint", "Landroid/content/res/ColorStateList;", "setOnLoadingStatusChangeListener", "listener", "startLoading", "stopLoading", "submitLoadingStatus", "checked", "Companion", "OnLoadingStatusChangeListener", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDSwitchWithLoading extends UDSwitch {

    /* renamed from: f */
    public static final int[] f63860f = {-16842910, 16842912};

    /* renamed from: g */
    public static final int[] f63861g = {-16842910};

    /* renamed from: h */
    public static final Companion f63862h = new Companion(null);

    /* renamed from: e */
    public boolean f63863e;

    /* renamed from: i */
    private int f63864i;

    /* renamed from: j */
    private CircularProgressDrawable f63865j;

    /* renamed from: k */
    private int f63866k;

    /* renamed from: l */
    private int f63867l;

    /* renamed from: m */
    private int f63868m;

    /* renamed from: n */
    private int f63869n;

    /* renamed from: o */
    private final Rect f63870o;

    /* renamed from: p */
    private OnLoadingStatusChangeListener f63871p;

    /* renamed from: q */
    private final C25815d f63872q;

    /* renamed from: r */
    private final View$OnAttachStateChangeListenerC25814c f63873r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$OnLoadingStatusChangeListener;", "", "onLoadingStatus", "", "checked", "", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading$b */
    public interface OnLoadingStatusChangeListener {
        void onLoadingStatus(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$Companion;", "", "()V", "STATE_CHECKED", "", "getSTATE_CHECKED", "()[I", "STATE_UNCHECKED", "getSTATE_UNCHECKED", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CircularProgressDrawable getLoadingDrawable() {
        return this.f63865j;
    }

    public boolean performClick() {
        setLoadingState(true);
        return true;
    }

    /* renamed from: a */
    public final void mo91762a() {
        CircularProgressDrawable circularProgressDrawable = this.f63865j;
        if (circularProgressDrawable != null && (circularProgressDrawable instanceof Animatable)) {
            circularProgressDrawable.stop();
        }
    }

    private final int[] getStateColor() {
        int i;
        int[] iArr = new int[1];
        if (isChecked()) {
            i = this.f63866k;
        } else {
            i = this.f63867l;
        }
        iArr[0] = i;
        return iArr;
    }

    /* renamed from: b */
    public final void mo91764b() {
        CircularProgressDrawable circularProgressDrawable = this.f63865j;
        if (circularProgressDrawable != null && (circularProgressDrawable instanceof Animatable)) {
            m93286a(getStateColor());
            circularProgressDrawable.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$drawablesAttachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading$c */
    public static final class View$OnAttachStateChangeListenerC25814c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDSwitchWithLoading f63874a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC25814c(UDSwitchWithLoading uDSwitchWithLoading) {
            this.f63874a = uDSwitchWithLoading;
        }

        public void onViewDetachedFromWindow(View view) {
            this.f63874a.mo91762a();
        }

        public void onViewAttachedToWindow(View view) {
            if (this.f63874a.f63863e) {
                this.f63874a.mo91764b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/larksuite/component/universe_design/udswitch/UDSwitchWithLoading$mLoadingAnimatorCallback$1", "Landroid/graphics/drawable/Drawable$Callback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "unscheduleDrawable", "universe-ui-switch_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading$d */
    public static final class C25815d implements Drawable.Callback {

        /* renamed from: a */
        final /* synthetic */ UDSwitchWithLoading f63875a;

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            Intrinsics.checkParameterIsNotNull(runnable, "what");
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            Intrinsics.checkParameterIsNotNull(runnable, "what");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25815d(UDSwitchWithLoading uDSwitchWithLoading) {
            this.f63875a = uDSwitchWithLoading;
        }

        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            this.f63875a.invalidate();
        }
    }

    public final void setOnLoadingStatusChangeListener(OnLoadingStatusChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f63871p = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitchWithLoading(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setLoadingDrawable(CircularProgressDrawable circularProgressDrawable) {
        Intrinsics.checkParameterIsNotNull(circularProgressDrawable, "loading");
        this.f63865j = circularProgressDrawable;
        invalidate();
    }

    public final void setLoadingStrokeWidth(int i) {
        CircularProgressDrawable circularProgressDrawable = this.f63865j;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.mo7694a((float) i);
        }
    }

    /* renamed from: a */
    private final void m93286a(int[] iArr) {
        boolean z;
        CircularProgressDrawable circularProgressDrawable;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && (circularProgressDrawable = this.f63865j) != null) {
            circularProgressDrawable.mo7701a(Arrays.copyOf(iArr, iArr.length));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.udswitch.UDSwitch
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f63863e) {
            CircularProgressDrawable circularProgressDrawable = this.f63865j;
            int save = canvas.save();
            if (circularProgressDrawable != null) {
                circularProgressDrawable.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final void setLoadingRadius(int i) {
        CircularProgressDrawable circularProgressDrawable = this.f63865j;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.mo7703b(((float) i) - circularProgressDrawable.mo7693a());
            int b = ((int) circularProgressDrawable.mo7702b()) * 2;
            circularProgressDrawable.setBounds(0, 0, b, b);
        }
    }

    public final void setLoadingTintList(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "tint");
        this.f63866k = colorStateList.getColorForState(f63860f, 0);
        this.f63867l = colorStateList.getColorForState(f63861g, 0);
        m93286a(getStateColor());
    }

    private final void setLoadingState(boolean z) {
        if (this.f63863e != z) {
            this.f63863e = z;
            if (z) {
                OnLoadingStatusChangeListener bVar = this.f63871p;
                if (bVar != null) {
                    bVar.onLoadingStatus(isChecked());
                }
                setEnabled(false);
                mo91764b();
                return;
            }
            setEnabled(true);
            mo91762a();
        }
    }

    /* renamed from: a */
    public final void mo91763a(boolean z) {
        if (this.f63863e) {
            setLoadingState(false);
            setChecked(z);
            invalidate();
        }
    }

    @Override // com.larksuite.component.universe_design.udswitch.UDSwitch
    public void draw(Canvas canvas) {
        CircularProgressDrawable circularProgressDrawable;
        super.draw(canvas);
        Rect rect = this.f63870o;
        if (this.f63863e && (circularProgressDrawable = this.f63865j) != null) {
            circularProgressDrawable.getPadding(rect);
            int b = ((int) (circularProgressDrawable.mo7702b() + circularProgressDrawable.mo7693a())) * 2;
            int thumbInitialLeft = getThumbInitialLeft() + ((getMThumbWidth() - b) / 2);
            int i = thumbInitialLeft - rect.left;
            int i2 = thumbInitialLeft + b + rect.right;
            circularProgressDrawable.setBounds(i, getMSwitchTop(), i2, getMSwitchBottom());
            Drawable background = getBackground();
            if (background != null) {
                C0774a.m3767a(background, i, getMSwitchTop(), i2, getMSwitchBottom());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitchWithLoading(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.udswitch.UDSwitch
    public void onMeasure(int i, int i2) {
        int i3;
        CircularProgressDrawable circularProgressDrawable;
        Rect rect = this.f63870o;
        if (!this.f63863e || (circularProgressDrawable = this.f63865j) == null) {
            i3 = 0;
        } else {
            if (circularProgressDrawable == null) {
                Intrinsics.throwNpe();
            }
            circularProgressDrawable.getPadding(rect);
            CircularProgressDrawable circularProgressDrawable2 = this.f63865j;
            if (circularProgressDrawable2 == null) {
                Intrinsics.throwNpe();
            }
            i3 = (circularProgressDrawable2.getIntrinsicWidth() - rect.left) - rect.right;
            CircularProgressDrawable circularProgressDrawable3 = this.f63865j;
            if (circularProgressDrawable3 == null) {
                Intrinsics.throwNpe();
            }
            circularProgressDrawable3.getIntrinsicHeight();
        }
        this.f63864i = i3;
        super.onMeasure(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDSwitchWithLoading(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDSwitch);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final CircularProgressDrawable m93284a(Context context, int[] iArr, int i, int i2) {
        boolean z;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.mo7698a(1);
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (true ^ z) {
            circularProgressDrawable.mo7701a(Arrays.copyOf(iArr, iArr.length));
        }
        circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
        float f = (float) i2;
        circularProgressDrawable.mo7703b(((float) i) - f);
        circularProgressDrawable.mo7694a(f);
        int b = ((int) circularProgressDrawable.mo7702b()) * 2;
        circularProgressDrawable.setBounds(0, 0, b, b);
        return circularProgressDrawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDSwitchWithLoading(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63870o = new Rect();
        this.f63872q = new C25815d(this);
        this.f63873r = new View$OnAttachStateChangeListenerC25814c(this);
        m93285a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private final void m93285a(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        int i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_switch_loading, R.attr.ud_switch_loadingRadius, R.attr.ud_switch_loadingStrokeWidth, R.attr.ud_switch_loadingTint}, i, i2);
        if (obtainStyledAttributes != null) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                i3 = colorStateList.getColorForState(f63860f, 0);
            } else {
                i3 = 0;
            }
            this.f63866k = i3;
            if (colorStateList != null) {
                i4 = colorStateList.getColorForState(f63861g, 0);
            } else {
                i4 = 0;
            }
            this.f63867l = i4;
            this.f63868m = obtainStyledAttributes.getDimensionPixelSize(1, (int) UDDimenUtils.m93307a(context, 5.43f));
            this.f63869n = obtainStyledAttributes.getDimensionPixelSize(2, (int) UDDimenUtils.m93307a(context, 1.43f));
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable instanceof CircularProgressDrawable) {
                this.f63865j = (CircularProgressDrawable) drawable;
            } else {
                this.f63865j = m93284a(context, getStateColor(), this.f63868m, this.f63869n);
            }
            CircularProgressDrawable circularProgressDrawable = this.f63865j;
            if (circularProgressDrawable != null) {
                circularProgressDrawable.setCallback(this.f63872q);
            }
            obtainStyledAttributes.recycle();
        }
        addOnAttachStateChangeListener(this.f63873r);
    }
}
