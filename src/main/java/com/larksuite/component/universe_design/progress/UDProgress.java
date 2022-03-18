package com.larksuite.component.universe_design.progress;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.progress.drawable.CircularDrawable;
import com.larksuite.component.universe_design.progress.drawable.LinearDrawable;
import com.larksuite.component.universe_design.progress.drawable.ProgressDrawable;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 42\u00020\u0001:\u000245B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0002J\"\u0010\u001a\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0014J(\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0014J\b\u0010&\u001a\u00020\u0018H\u0002J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\tH\u0016J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\tJ\u000e\u00101\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\tJ\u000e\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\tR\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/larksuite/component/universe_design/progress/UDProgress;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "FLOAT_ZERO", "", "onChangedListener", "Lcom/larksuite/component/universe_design/progress/UDProgress$OnChangeListener;", "getOnChangedListener", "()Lcom/larksuite/component/universe_design/progress/UDProgress$OnChangeListener;", "setOnChangedListener", "(Lcom/larksuite/component/universe_design/progress/UDProgress$OnChangeListener;)V", "progressSpec", "Lcom/larksuite/component/universe_design/progress/UDProgressSpec;", "animateProgress", "", "newProgress", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "resetDrawable", "setIndicatorColor", "color", "setIndicatorCornerRadius", "radius", "setProgress", "progress", "animate", "", "setThickness", "thickness", "setTrackColor", "setType", ShareHitPoint.f121869d, "Companion", "OnChangeListener", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDProgress extends ProgressBar {

    /* renamed from: b */
    public static final Companion f63501b = new Companion(null);

    /* renamed from: a */
    public UDProgressSpec f63502a;

    /* renamed from: c */
    private final float f63503c;

    /* renamed from: d */
    private OnChangeListener f63504d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/progress/UDProgress$OnChangeListener;", "", "onChange", "", "progress", "", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.progress.UDProgress$b */
    public interface OnChangeListener {
        /* renamed from: a */
        void mo91086a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/progress/UDProgress$Companion;", "", "()V", "TYPE_CIRCULAR", "", "TYPE_LINEAR", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.progress.UDProgress$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final OnChangeListener getOnChangedListener() {
        return this.f63504d;
    }

    /* renamed from: a */
    private final void m92901a() {
        CircularDrawable aVar;
        if (this.f63502a.mo91092a() == 0) {
            aVar = new LinearDrawable(this.f63502a);
        } else {
            aVar = new CircularDrawable(this.f63502a);
        }
        setProgressDrawable(aVar);
    }

    public final void setOnChangedListener(OnChangeListener bVar) {
        this.f63504d = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/universe_design/progress/UDProgress$animateProgress$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "universe-ui-progress_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.progress.UDProgress$d */
    public static final class C25769d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ UDProgress f63506a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25769d(UDProgress uDProgress) {
            this.f63506a = uDProgress;
        }

        public void onAnimationCancel(Animator animator) {
            this.f63506a.f63502a.mo91102e(this.f63506a.getProgress());
        }

        public void onAnimationEnd(Animator animator) {
            this.f63506a.f63502a.mo91102e(this.f63506a.getProgress());
            OnChangeListener onChangedListener = this.f63506a.getOnChangedListener();
            if (onChangedListener != null) {
                onChangedListener.mo91086a(this.f63506a.getProgress());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDProgress(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.progress.UDProgress$c */
    public static final class C25768c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ UDProgress f63505a;

        C25768c(UDProgress uDProgress) {
            this.f63505a = uDProgress;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            UDProgress uDProgress = this.f63505a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                uDProgress.setProgress(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public final void setIndicatorColor(int i) {
        if (this.f63502a.mo91099d() != i) {
            this.f63502a.mo91100d(i);
            invalidate();
        }
    }

    public final void setIndicatorCornerRadius(float f) {
        if (Math.abs(this.f63502a.mo91101e() - f) > this.f63503c) {
            this.f63502a.mo91093a(f);
            invalidate();
        }
    }

    public void setProgress(int i) {
        if (getProgress() != i) {
            super.setProgress(i);
            OnChangeListener bVar = this.f63504d;
            if (bVar != null) {
                bVar.mo91086a(i);
            }
            UDProgressSpec aVar = this.f63502a;
            if (aVar != null) {
                aVar.mo91102e(i);
                invalidate();
            }
        }
    }

    public final void setThickness(int i) {
        if (this.f63502a.mo91095b() != i) {
            this.f63502a.mo91096b(i);
            requestLayout();
            invalidate();
        }
    }

    public final void setTrackColor(int i) {
        if (this.f63502a.mo91097c() != i) {
            this.f63502a.mo91098c(i);
            invalidate();
        }
    }

    /* renamed from: a */
    private final void m92902a(int i) {
        Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
        ofInt.addUpdateListener(new C25768c(this));
        ofInt.addListener(new C25769d(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public final void setType(int i) {
        int i2;
        if (this.f63502a.mo91092a() != i) {
            UDProgressSpec aVar = this.f63502a;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            aVar.mo91094a(i2);
            if (i == 1) {
                this.f63502a.mo91105f(Math.min(getLayoutParams().width, getLayoutParams().height));
            }
            m92901a();
            requestLayout();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getProgressDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setProgress(int i, boolean z) {
        if (getProgress() == i) {
            return;
        }
        if (z) {
            m92902a(i);
            return;
        }
        super.setProgress(i, z);
        OnChangeListener bVar = this.f63504d;
        if (bVar != null) {
            bVar.mo91086a(i);
        }
        UDProgressSpec aVar = this.f63502a;
        if (aVar != null) {
            aVar.mo91102e(i);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            ProgressDrawable cVar = (ProgressDrawable) progressDrawable;
            int a = cVar.mo91109a();
            int b = cVar.mo91113b();
            if (a <= 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = a + getPaddingLeft() + getPaddingRight();
            }
            if (b <= 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = b + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.progress.drawable.ProgressDrawable");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDProgress(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92903a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.ud_progress_indicatorColor, R.attr.ud_progress_indicatorCornerRadius, R.attr.ud_progress_thickness, R.attr.ud_progress_trackColor, R.attr.ud_progress_type}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        this.f63502a.mo91094a(obtainStyledAttributes.getInt(6, 0));
        this.f63502a.mo91096b(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        this.f63502a.mo91098c(obtainStyledAttributes.getColor(5, 0));
        this.f63502a.mo91100d(obtainStyledAttributes.getColor(2, 0));
        this.f63502a.mo91093a((float) obtainStyledAttributes.getDimensionPixelSize(3, 0));
        this.f63502a.mo91102e(getProgress());
        this.f63502a.mo91105f(Math.min(obtainStyledAttributes.getLayoutDimension(0, 0), obtainStyledAttributes.getLayoutDimension(0, 0)));
        obtainStyledAttributes.recycle();
        m92901a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int min = Math.min(i, i2);
        if (this.f63502a.mo91106g() != min) {
            this.f63502a.mo91105f(min);
            if (this.f63502a.mo91092a() == 1) {
                requestLayout();
                invalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDProgress(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63503c = 0.1f;
        this.f63502a = new UDProgressSpec(0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, SmActions.ACTION_ONTHECALL_ENTRY, null);
        m92903a(attributeSet, i, i2);
    }
}
