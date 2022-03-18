package com.ss.android.lark.mm.module.floatwindow.view.progress;

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
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.CircularDrawable;
import com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.LinearDrawable;
import com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002./B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002J\"\u0010\u0018\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0014J(\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0014J\b\u0010$\u001a\u00020\u0016H\u0002J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tJ\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onChangedListener", "Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress$OnChangeListener;", "getOnChangedListener", "()Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress$OnChangeListener;", "setOnChangedListener", "(Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress$OnChangeListener;)V", "progressSpec", "Lcom/ss/android/lark/mm/module/floatwindow/view/progress/ProgressSpec;", "animateProgress", "", "newProgress", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "resetDrawable", "setIndicatorStartEndColor", "startColor", "endColor", "setProgress", "progress", "animate", "", "setType", ShareHitPoint.f121869d, "Companion", "OnChangeListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Progress extends ProgressBar {

    /* renamed from: b */
    public static final Companion f116681b = new Companion(null);

    /* renamed from: a */
    public ProgressSpec f116682a;

    /* renamed from: c */
    private OnChangeListener f116683c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress$OnChangeListener;", "", "onChange", "", "progress", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.Progress$b */
    public interface OnChangeListener {
        /* renamed from: a */
        void mo162812a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/progress/Progress$Companion;", "", "()V", "TYPE_CIRCULAR", "", "TYPE_LINEAR", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.Progress$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final OnChangeListener getOnChangedListener() {
        return this.f116683c;
    }

    /* renamed from: a */
    private final void m183420a() {
        CircularDrawable aVar;
        if (this.f116682a.mo162818a() == 0) {
            aVar = new LinearDrawable(this.f116682a);
        } else {
            aVar = new CircularDrawable(this.f116682a);
        }
        setProgressDrawable(aVar);
    }

    public final void setOnChangedListener(OnChangeListener bVar) {
        this.f116683c = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/floatwindow/view/progress/Progress$animateProgress$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.Progress$d */
    public static final class C46325d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Progress f116685a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46325d(Progress progress) {
            this.f116685a = progress;
        }

        public void onAnimationCancel(Animator animator) {
            this.f116685a.f116682a.mo162834g(this.f116685a.getProgress());
        }

        public void onAnimationEnd(Animator animator) {
            this.f116685a.f116682a.mo162834g(this.f116685a.getProgress());
            OnChangeListener onChangedListener = this.f116685a.getOnChangedListener();
            if (onChangedListener != null) {
                onChangedListener.mo162812a(this.f116685a.getProgress());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Progress(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.view.progress.Progress$c */
    public static final class C46324c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Progress f116684a;

        C46324c(Progress progress) {
            this.f116684a = progress;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Progress progress = this.f116684a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                progress.setProgress(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public void setProgress(int i) {
        if (getProgress() != i) {
            super.setProgress(i);
            OnChangeListener bVar = this.f116683c;
            if (bVar != null) {
                bVar.mo162812a(i);
            }
            ProgressSpec aVar = this.f116682a;
            if (aVar != null) {
                aVar.mo162834g(i);
                invalidate();
            }
        }
    }

    /* renamed from: a */
    private final void m183421a(int i) {
        Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
        ofInt.addUpdateListener(new C46324c(this));
        ofInt.addListener(new C46325d(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public final void setType(int i) {
        int i2;
        if (this.f116682a.mo162818a() != i) {
            ProgressSpec aVar = this.f116682a;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            aVar.mo162820a(i2);
            if (i == 1) {
                this.f116682a.mo162836h(Math.min(getLayoutParams().width, getLayoutParams().height));
            }
            m183420a();
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
    public Progress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setProgress(int i, boolean z) {
        if (getProgress() == i) {
            return;
        }
        if (z) {
            m183421a(i);
            return;
        }
        super.setProgress(i, z);
        OnChangeListener bVar = this.f116683c;
        if (bVar != null) {
            bVar.mo162812a(i);
        }
        ProgressSpec aVar = this.f116682a;
        if (aVar != null) {
            aVar.mo162834g(i);
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
            int a = cVar.mo162841a();
            int b = cVar.mo162845b();
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
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.floatwindow.view.progress.drawable.ProgressDrawable");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Progress(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m183422a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.progress_indicatorColor, R.attr.progress_indicatorCornerRadius, R.attr.progress_indicatorEndColor, R.attr.progress_indicatorStartColor, R.attr.progress_thickness, R.attr.progress_trackColor, R.attr.progress_trackThicknessFraction, R.attr.progress_type}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…tr, defStyleRes\n        )");
        this.f116682a.mo162820a(obtainStyledAttributes.getInt(9, 0));
        this.f116682a.mo162823b(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        this.f116682a.mo162825c(obtainStyledAttributes.getColor(7, 0));
        this.f116682a.mo162827d(obtainStyledAttributes.getColor(2, 0));
        this.f116682a.mo162829e(obtainStyledAttributes.getColor(5, 0));
        this.f116682a.mo162832f(obtainStyledAttributes.getColor(4, 0));
        this.f116682a.mo162819a((float) obtainStyledAttributes.getDimensionPixelSize(3, 0));
        this.f116682a.mo162834g(getProgress());
        this.f116682a.mo162836h(Math.min(obtainStyledAttributes.getLayoutDimension(0, 0), obtainStyledAttributes.getLayoutDimension(0, 0)));
        this.f116682a.mo162822b(obtainStyledAttributes.getFloat(8, 1.0f));
        obtainStyledAttributes.recycle();
        m183420a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int min = Math.min(i, i2);
        if (this.f116682a.mo162838i() != min) {
            this.f116682a.mo162836h(min);
            if (this.f116682a.mo162818a() == 1) {
                requestLayout();
                invalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Progress(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f116682a = new ProgressSpec(0, 0, 0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
        m183422a(attributeSet, i, i2);
    }
}
