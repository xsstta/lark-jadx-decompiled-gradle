package com.ss.android.photoeditor.ve.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/PaintCircleView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/photoeditor/ve/base/IAnimationShow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circleView", "Landroid/view/View;", "layoutId", "showAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "bindView", "", "hideWithAnimation", "setPaintSize", "progress", "", "showWithAnimation", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PaintCircleView extends FrameLayout {

    /* renamed from: a */
    public static final Companion f149454a = new Companion(null);

    /* renamed from: b */
    private final int f149455b = R.layout.view_paint_circle;

    /* renamed from: c */
    private View f149456c;

    /* renamed from: d */
    private final ValueAnimator f149457d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/PaintCircleView$Companion;", "", "()V", "getPaintSize", "", "context", "Landroid/content/Context;", "progress", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.PaintCircleView$d */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float mo204155a(Context context, float f) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return C60275a.m234185a(context, (f * 0.32f) + 36.0f);
        }
    }

    /* renamed from: c */
    private final void m232667c() {
        this.f149456c = findViewById(R.id.circle_view);
    }

    /* renamed from: a */
    public void mo204149a() {
        this.f149457d.cancel();
        this.f149457d.start();
    }

    /* renamed from: b */
    public void mo204150b() {
        this.f149457d.cancel();
        this.f149457d.reverse();
    }

    public final void setPaintSize(float f) {
        Companion dVar = f149454a;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        float a = dVar.mo204155a(context, f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i = (int) a;
            layoutParams.width = i;
            layoutParams.height = i;
            setLayoutParams(layoutParams);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/PaintCircleView$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.PaintCircleView$a */
    static final class C59952a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PaintCircleView f149458a;

        C59952a(PaintCircleView paintCircleView) {
            this.f149458a = paintCircleView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                this.f149458a.setAlpha(f2.floatValue());
                if (this.f149458a.getAlpha() <= BitmapDescriptorFactory.HUE_RED) {
                    this.f149458a.setVisibility(8);
                }
                if (this.f149458a.getAlpha() > BitmapDescriptorFactory.HUE_RED) {
                    this.f149458a.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/PaintCircleView$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.PaintCircleView$b */
    static final class C59953b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PaintCircleView f149459a;

        C59953b(PaintCircleView paintCircleView) {
            this.f149459a = paintCircleView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                this.f149459a.setAlpha(f2.floatValue());
                if (this.f149459a.getAlpha() <= BitmapDescriptorFactory.HUE_RED) {
                    this.f149459a.setVisibility(8);
                }
                if (this.f149459a.getAlpha() > BitmapDescriptorFactory.HUE_RED) {
                    this.f149459a.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/PaintCircleView$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.PaintCircleView$c */
    static final class C59954c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PaintCircleView f149460a;

        C59954c(PaintCircleView paintCircleView) {
            this.f149460a = paintCircleView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                this.f149460a.setAlpha(f2.floatValue());
                if (this.f149460a.getAlpha() <= BitmapDescriptorFactory.HUE_RED) {
                    this.f149460a.setVisibility(8);
                }
                if (this.f149460a.getAlpha() > BitmapDescriptorFactory.HUE_RED) {
                    this.f149460a.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaintCircleView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59952a(this));
        this.f149457d = ofFloat;
        View.inflate(getContext(), R.layout.view_paint_circle, this);
        m232667c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaintCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59953b(this));
        this.f149457d = ofFloat;
        View.inflate(getContext(), R.layout.view_paint_circle, this);
        m232667c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaintCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59954c(this));
        this.f149457d = ofFloat;
        View.inflate(getContext(), R.layout.view_paint_circle, this);
        m232667c();
    }
}
