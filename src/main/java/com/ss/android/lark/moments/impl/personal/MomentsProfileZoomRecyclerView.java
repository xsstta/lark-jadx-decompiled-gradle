package com.ss.android.lark.moments.impl.personal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020#J\b\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020#H\u0002J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0015J\u000e\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u001eJ\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0011H\u0002J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u001eR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011XD¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileZoomRecyclerView;", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "backToInitialAnim", "backToLoadingAnim", "loadingDownRate", "", "loadingShowPosition", "mFirstPosition", "mLoadingAPI", "Lcom/ss/android/lark/moments/impl/personal/LoadingAPI;", "mLoadingView", "Lcom/airbnb/lottie/LottieAnimationView;", "mResetRate", "mScaling", "", "mScrollRate", "mViewParentHeight", "mZoomView", "Landroid/view/View;", "mZoomViewHeight", "mZoomViewWidth", "process", "backToInitialPosition", "", "backToLoadingPosition", "closeLoading", "getDistance", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "resetImage", "setLoadingApi", "api", "setLoadingView", "loadingView", "setZoom", "distance", "setZoomView", "zoomView", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsProfileZoomRecyclerView extends PointRecoderRecyclerView {

    /* renamed from: a */
    public LottieAnimationView f120494a;

    /* renamed from: b */
    private View f120495b;

    /* renamed from: c */
    private LoadingAPI f120496c;

    /* renamed from: d */
    private int f120497d;

    /* renamed from: e */
    private int f120498e;

    /* renamed from: f */
    private int f120499f;

    /* renamed from: g */
    private final int f120500g = UIUtils.dp2px(getContext(), 24.0f);

    /* renamed from: h */
    private final float f120501h = 0.5f;

    /* renamed from: i */
    private final float f120502i = 0.3f;

    /* renamed from: j */
    private final float f120503j = 3.0f;

    /* renamed from: k */
    private float f120504k;

    /* renamed from: l */
    private boolean f120505l;

    /* renamed from: q */
    private final ValueAnimator f120506q;

    /* renamed from: r */
    private float f120507r;

    /* renamed from: s */
    private ValueAnimator f120508s;

    /* renamed from: t */
    private ValueAnimator f120509t;

    /* renamed from: a */
    public final void mo166921a() {
        m189023e();
    }

    private final float getDistance() {
        int i;
        View view = this.f120495b;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        return (float) (i - this.f120498e);
    }

    /* renamed from: b */
    private final void m189022b() {
        if (getDistance() <= ((float) this.f120500g)) {
            m189023e();
        } else {
            m189024f();
        }
    }

    /* renamed from: e */
    private final void m189023e() {
        float distance = getDistance();
        LottieAnimationView lottieAnimationView = this.f120494a;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
            this.f120506q.end();
        }
        ValueAnimator valueAnimator = this.f120509t;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.f120509t = null;
        ValueAnimator duration = ValueAnimator.ofFloat(distance, 0.0f).setDuration((long) (distance * this.f120503j));
        duration.addUpdateListener(new C47842a(this));
        this.f120508s = duration;
        if (duration != null) {
            duration.start();
        }
    }

    /* renamed from: f */
    private final void m189024f() {
        float distance = getDistance();
        LottieAnimationView lottieAnimationView = this.f120494a;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        this.f120506q.addUpdateListener(new C47844c(this));
        this.f120506q.start();
        ValueAnimator valueAnimator = this.f120508s;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.f120508s = null;
        ValueAnimator duration = ValueAnimator.ofFloat(distance, (float) this.f120500g).setDuration((long) ((distance - ((float) this.f120500g)) * this.f120502i));
        duration.addUpdateListener(new C47843b(this));
        this.f120509t = duration;
        if (duration != null) {
            duration.start();
        }
        LoadingAPI bVar = this.f120496c;
        if (bVar != null) {
            bVar.mo167642a();
        }
    }

    public final void setLoadingApi(LoadingAPI bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "api");
        this.f120496c = bVar;
    }

    public final void setZoomView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "zoomView");
        this.f120495b = view;
    }

    public final void setLoadingView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "loadingView");
        if (!(view instanceof LottieAnimationView)) {
            view = null;
        }
        this.f120494a = (LottieAnimationView) view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/moments/impl/personal/MomentsProfileZoomRecyclerView$backToInitialPosition$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileZoomRecyclerView$a */
    public static final class C47842a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileZoomRecyclerView f120510a;

        C47842a(MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView) {
            this.f120510a = momentsProfileZoomRecyclerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView = this.f120510a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                momentsProfileZoomRecyclerView.setZoom(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/moments/impl/personal/MomentsProfileZoomRecyclerView$backToLoadingPosition$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileZoomRecyclerView$b */
    public static final class C47843b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileZoomRecyclerView f120511a;

        C47843b(MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView) {
            this.f120511a = momentsProfileZoomRecyclerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView = this.f120511a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                momentsProfileZoomRecyclerView.setZoom(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.MomentsProfileZoomRecyclerView$c */
    public static final class C47844c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileZoomRecyclerView f120512a;

        C47844c(MomentsProfileZoomRecyclerView momentsProfileZoomRecyclerView) {
            this.f120512a = momentsProfileZoomRecyclerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LottieAnimationView lottieAnimationView = this.f120512a.f120494a;
            if (lottieAnimationView != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    public final void setZoom(float f) {
        View view = this.f120495b;
        if (view != null && this.f120497d > 0 && this.f120498e > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(layoutParams, "zoomView.layoutParams");
            int i = this.f120497d;
            layoutParams.width = (int) (((float) i) * ((((float) i) + f) / ((float) i)));
            int i2 = this.f120497d;
            layoutParams.height = (int) (((float) this.f120498e) * ((((float) i2) + f) / ((float) i2)));
            view.setLayoutParams(layoutParams);
            view.invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileZoomRecyclerView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setDuration(800L);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f120506q = ofFloat;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        View view = this.f120495b;
        if (view == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f120497d <= 0 || this.f120498e <= 0) {
            this.f120497d = view.getMeasuredWidth();
            this.f120498e = view.getMeasuredHeight();
        }
        if (this.f120499f <= 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((RelativeLayout) parent).getLayoutParams();
                Intrinsics.checkExpressionValueIsNotNull(layoutParams, "parent.layoutParams");
                this.f120499f = layoutParams.height;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout");
            }
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            this.f120505l = false;
            m189022b();
        } else if (action == 2) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                View findViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition());
                if (!this.f120505l) {
                    if (findViewByPosition == null) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (findViewByPosition.getTop() != 0) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f120504k = motionEvent.getRawY();
                }
                int rawY = (int) ((motionEvent.getRawY() - this.f120504k) * this.f120501h);
                if (rawY < 0) {
                    return super.onTouchEvent(motionEvent);
                }
                int i = this.f120500g;
                if (rawY > i) {
                    LottieAnimationView lottieAnimationView = this.f120494a;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setVisibility(0);
                    }
                    float f = ((float) ((rawY - this.f120500g) % 360)) / 360.0f;
                    this.f120507r = f;
                    LottieAnimationView lottieAnimationView2 = this.f120494a;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setProgress(f);
                    }
                } else if (rawY <= i) {
                    LottieAnimationView lottieAnimationView3 = this.f120494a;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setVisibility(8);
                    }
                    this.f120507r = BitmapDescriptorFactory.HUE_RED;
                    LottieAnimationView lottieAnimationView4 = this.f120494a;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.setProgress(BitmapDescriptorFactory.HUE_RED);
                    }
                }
                this.f120505l = true;
                setZoom((float) rawY);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        return super.onTouchEvent(motionEvent);
    }

    public MomentsProfileZoomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setDuration(800L);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f120506q = ofFloat;
    }

    public MomentsProfileZoomRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setDuration(800L);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f120506q = ofFloat;
    }
}
