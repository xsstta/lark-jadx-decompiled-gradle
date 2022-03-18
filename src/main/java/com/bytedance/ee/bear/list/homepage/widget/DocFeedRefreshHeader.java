package com.bytedance.ee.bear.list.homepage.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J \u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016J \u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0014J(\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J\"\u00103\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J(\u00104\u001a\u00020\u001a2\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J \u00105\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016J&\u00106\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u00010!2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010;\u001a\u00020\u00002\b\b\u0001\u0010<\u001a\u00020\nH\u0002J\u0014\u0010=\u001a\u00020\u001a2\n\u0010>\u001a\u00020?\"\u00020\nH\u0016J\u0006\u0010@\u001a\u00020\u001aJ\u0006\u0010A\u001a\u00020\u001aR\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/bytedance/ee/bear/list/homepage/widget/DocFeedRefreshHeader;", "Landroid/widget/RelativeLayout;", "Lcom/scwang/smartrefresh/layout/api/RefreshHeader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackgroundColor", "mFinishDuration", "mFooterPaddingBottom", "mFooterPaddingTop", "mLottieAnimationView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "mRefreshKernel", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", "mSpinnerStyle", "Lcom/scwang/smartrefresh/layout/constant/SpinnerStyle;", "getSpinnerStyle", "getView", "Landroid/view/View;", "init", "", "initView", "isSupportHorizontalDrag", "", "onAttachedToWindow", "onFinish", "layout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "success", "onHorizontalDrag", "percentX", "", "offsetX", "offsetMax", "onInitialized", "kernel", "height", "extendHeight", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onPullingDown", "percent", "offset", "headerHeight", "onRefreshReleased", "onReleasing", "onStartAnimator", "onStateChanged", "refreshLayout", "oldState", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "newState", "setPrimaryColor", "primaryColor", "setPrimaryColors", "colors", "", "startAnimation", "stopAnimation", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocFeedRefreshHeader extends RelativeLayout implements AbstractC27126e {

    /* renamed from: a */
    private BearLottieView f23012a;

    /* renamed from: b */
    private SpinnerStyle f23013b = SpinnerStyle.Translate;

    /* renamed from: c */
    private int f23014c = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: d */
    private AbstractC27128g f23015d;

    /* renamed from: e */
    private int f23016e;

    /* renamed from: f */
    private int f23017f;

    /* renamed from: g */
    private int f23018g;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(hVar, "layout");
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return this.f23013b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo33262b();
    }

    /* renamed from: b */
    public final void mo33262b() {
        BearLottieView bearLottieView = new BearLottieView(getContext());
        this.f23012a = bearLottieView;
        if (bearLottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView.setAnimation("loading.json");
        BearLottieView bearLottieView2 = this.f23012a;
        if (bearLottieView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView2.setRepeatCount(-1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C13749l.m55758d(getContext(), 66));
        layoutParams.addRule(13);
        BearLottieView bearLottieView3 = this.f23012a;
        if (bearLottieView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        addView(bearLottieView3, layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocFeedRefreshHeader(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m35276a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final DocFeedRefreshHeader m35275a(int i) {
        this.f23016e = i;
        setBackgroundColor(i);
        AbstractC27128g gVar = this.f23015d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefreshKernel");
        }
        gVar.mo96461b(this.f23016e);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iArr, "colors");
        if (this.f23013b == SpinnerStyle.FixedBehind) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && !(getBackground() instanceof BitmapDrawable)) {
                m35275a(iArr[0]);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocFeedRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m35276a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(hVar, "layout");
        BearLottieView bearLottieView = this.f23012a;
        if (bearLottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView.cancelAnimation();
        BearLottieView bearLottieView2 = this.f23012a;
        if (bearLottieView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView2.setVisibility(4);
        return this.f23014c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), this.f23017f, getPaddingRight(), this.f23018g);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private final void m35276a(Context context, AttributeSet attributeSet) {
        setBackgroundColor(context.getResources().getColor(R.color.space_kit_trans));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.srlDrawableSize, R.attr.srlFinishDuration, R.attr.srlPrimaryColor, R.attr.srlSpinnerStyle});
        this.f23014c = obtainStyledAttributes.getInt(1, this.f23014c);
        this.f23013b = SpinnerStyle.values()[obtainStyledAttributes.getInt(3, this.f23013b.ordinal())];
        if (obtainStyledAttributes.hasValue(2)) {
            m35275a(obtainStyledAttributes.getColor(2, 0));
        }
        obtainStyledAttributes.recycle();
        this.f23017f = C13749l.m55758d(context, this.f23017f);
        this.f23018g = C13749l.m55758d(context, this.f23018g);
        if (getPaddingTop() == 0) {
            if (getPaddingBottom() == 0) {
                setPadding(getPaddingLeft(), this.f23017f, getPaddingRight(), this.f23018g);
            } else {
                setPadding(getPaddingLeft(), this.f23017f, getPaddingRight(), this.f23018g);
            }
        } else if (getPaddingBottom() == 0) {
            setPadding(getPaddingLeft(), this.f23017f, getPaddingRight(), this.f23018g);
        } else {
            this.f23017f = getPaddingTop();
            this.f23018g = getPaddingBottom();
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        BearLottieView bearLottieView = this.f23012a;
        if (bearLottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView.setVisibility(0);
        BearLottieView bearLottieView2 = this.f23012a;
        if (bearLottieView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
        }
        bearLottieView2.playAnimation();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocFeedRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m35276a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(gVar, "kernel");
        this.f23015d = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefreshKernel");
        }
        gVar.mo96461b(this.f23016e);
    }
}
