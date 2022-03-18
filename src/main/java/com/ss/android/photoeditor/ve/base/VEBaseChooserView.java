package com.ss.android.photoeditor.ve.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.crop.p3015a.animationInterpolatorC59853c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u00016B%\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010$\u001a\u00020%H&J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020%H\u0016J\u0006\u0010+\u001a\u00020%J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020%H\u0014J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020%H\u0016J\u0006\u00104\u001a\u00020%J\b\u00105\u001a\u00020%H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00067"}, d2 = {"Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView;", "T", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "Landroid/widget/RelativeLayout;", "Lcom/ss/android/photoeditor/ve/base/IAnimationShow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionButtonClickedListener", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "getActionButtonClickedListener", "()Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "setActionButtonClickedListener", "(Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;)V", "hideAnimator", "Landroid/animation/ValueAnimator;", "hideToolBarAnimator", "isShow", "", "layoutId", "getLayoutId", "()I", "setLayoutId", "(I)V", "showAnimator", "showToolBarAnimator", "veController", "getVeController", "()Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "setVeController", "(Lcom/ss/android/photoeditor/ve/base/VEBaseController;)V", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "bindView", "", "getToolbarContainerView", "Landroid/view/View;", "gone", "hide", "hideAndResetView", "hideToolBarWithAnimation", "hideWithAnimation", "isToolbarShow", "onFinishInflate", "setContentView", "setPosition", "progress", "", "show", "showToolBarWithAnimation", "showWithAnimation", "OnActionButtonClickedListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class VEBaseChooserView<T extends VEBaseController> extends RelativeLayout {

    /* renamed from: a */
    private T f148767a;

    /* renamed from: b */
    private boolean f148768b;

    /* renamed from: c */
    private OnActionButtonClickedListener f148769c;

    /* renamed from: d */
    private final ValueAnimator f148770d;

    /* renamed from: e */
    private final ValueAnimator f148771e;

    /* renamed from: f */
    private final ValueAnimator f148772f;

    /* renamed from: g */
    private final ValueAnimator f148773g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "", "onCancelButtonClicked", "", "onConfirmButtonClicked", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$f */
    public interface OnActionButtonClickedListener {
        /* renamed from: a */
        void mo203630a();

        /* renamed from: b */
        void mo203631b();
    }

    public VEBaseChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public abstract void mo203648a();

    /* renamed from: b */
    public void mo203649b() {
    }

    public abstract int getLayoutId();

    public View getToolbarContainerView() {
        return null;
    }

    public abstract void setLayoutId(int i);

    public OnActionButtonClickedListener getActionButtonClickedListener() {
        return this.f148769c;
    }

    public T getVeController() {
        return this.f148767a;
    }

    /* renamed from: j */
    public boolean mo203661j() {
        return this.f148768b;
    }

    /* renamed from: c */
    public void mo203650c() {
        setVisibility(0);
    }

    /* renamed from: d */
    public void mo203651d() {
        setVisibility(4);
    }

    /* renamed from: e */
    public void mo203652e() {
        setVisibility(8);
    }

    /* renamed from: h */
    public final void mo203659h() {
        this.f148773g.cancel();
        this.f148772f.cancel();
        this.f148772f.start();
    }

    /* renamed from: i */
    public final void mo203660i() {
        this.f148772f.cancel();
        this.f148773g.cancel();
        this.f148773g.start();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo204000k();
        mo203648a();
    }

    /* renamed from: k */
    private final void mo204000k() {
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
    }

    /* renamed from: g */
    public void mo203654g() {
        T veController = getVeController();
        if (veController != null) {
            veController.mo203700k();
        }
        this.f148768b = false;
        this.f148770d.cancel();
        this.f148771e.cancel();
        this.f148771e.start();
    }

    /* renamed from: f */
    public void mo203653f() {
        View toolbarContainerView = getToolbarContainerView();
        if (toolbarContainerView != null) {
            toolbarContainerView.setClickable(true);
        }
        T veController = getVeController();
        if (veController != null) {
            veController.mo203699j();
        }
        this.f148768b = true;
        this.f148771e.cancel();
        this.f148770d.cancel();
        this.f148770d.start();
    }

    public void setActionButtonClickedListener(OnActionButtonClickedListener fVar) {
        this.f148769c = fVar;
    }

    public void setVeController(T t) {
        this.f148767a = t;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/photoeditor/ve/base/VEBaseChooserView$hideAnimator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$c */
    public static final class C59836c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VEBaseChooserView f148776a;

        C59836c(VEBaseChooserView vEBaseChooserView) {
            this.f148776a = vEBaseChooserView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f148776a.mo203649b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/base/VEBaseChooserView$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$a */
    static final class C59834a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseChooserView f148774a;

        C59834a(VEBaseChooserView vEBaseChooserView) {
            this.f148774a = vEBaseChooserView;
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
                float floatValue = f2.floatValue();
                this.f148774a.setPosition(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED) {
                    this.f148774a.mo203651d();
                }
                if (floatValue > ((float) 0)) {
                    this.f148774a.mo203650c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/base/VEBaseChooserView$hideAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$b */
    static final class C59835b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseChooserView f148775a;

        C59835b(VEBaseChooserView vEBaseChooserView) {
            this.f148775a = vEBaseChooserView;
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
                float floatValue = f2.floatValue();
                this.f148775a.setPosition(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED) {
                    this.f148775a.mo203651d();
                }
                if (floatValue > ((float) 0)) {
                    this.f148775a.mo203650c();
                }
            }
        }
    }

    public final void setPosition(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            mo203652e();
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            mo203650c();
        }
        View toolbarContainerView = getToolbarContainerView();
        if (toolbarContainerView != null) {
            int height = toolbarContainerView.getHeight();
            int height2 = getHeight() - height;
            if (height > 0) {
                toolbarContainerView.setY(((float) height2) + (((float) height) * (((float) 1) - f)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/base/VEBaseChooserView$showToolBarAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$d */
    static final class C59837d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseChooserView f148777a;

        C59837d(VEBaseChooserView vEBaseChooserView) {
            this.f148777a = vEBaseChooserView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            View toolbarContainerView;
            View toolbarContainerView2;
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
                float floatValue = f2.floatValue();
                this.f148777a.setPosition(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED && (toolbarContainerView2 = this.f148777a.getToolbarContainerView()) != null) {
                    toolbarContainerView2.setVisibility(8);
                }
                if (floatValue > ((float) 0) && (toolbarContainerView = this.f148777a.getToolbarContainerView()) != null) {
                    toolbarContainerView.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/base/VEBaseChooserView$hideToolBarAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.base.VEBaseChooserView$e */
    static final class C59838e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VEBaseChooserView f148778a;

        C59838e(VEBaseChooserView vEBaseChooserView) {
            this.f148778a = vEBaseChooserView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            View toolbarContainerView;
            View toolbarContainerView2;
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
                float floatValue = f2.floatValue();
                this.f148778a.setPosition(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED && (toolbarContainerView2 = this.f148778a.getToolbarContainerView()) != null) {
                    toolbarContainerView2.setVisibility(8);
                }
                if (floatValue > ((float) 0) && (toolbarContainerView = this.f148778a.getToolbarContainerView()) != null) {
                    toolbarContainerView.setVisibility(0);
                }
            }
        }
    }

    public VEBaseChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new animationInterpolatorC59853c(4.0f));
        ofFloat.addUpdateListener(new C59834a(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(0f…        }\n        }\n    }");
        this.f148770d = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new animationInterpolatorC59853c(4.0f));
        ofFloat2.addUpdateListener(new C59835b(this));
        ofFloat2.addListener(new C59836c(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ValueAnimator.ofFloat(1f…       }\n        })\n    }");
        this.f148771e = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(new animationInterpolatorC59853c(4.0f));
        ofFloat3.addUpdateListener(new C59837d(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ValueAnimator.ofFloat(0f…        }\n        }\n    }");
        this.f148772f = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(new animationInterpolatorC59853c(4.0f));
        ofFloat4.addUpdateListener(new C59838e(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "ValueAnimator.ofFloat(1f…        }\n        }\n    }");
        this.f148773g = ofFloat4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VEBaseChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
