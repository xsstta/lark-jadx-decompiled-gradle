package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J(\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010%\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010&\u001a\u00020\u001fH\u0016J\u0012\u0010'\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013¨\u0006,"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/MomentsPtrHeaderView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/widget/ptr/LKUIPtrUIHandler;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "mFlipAnimation", "Landroid/view/animation/RotateAnimation;", "getMFlipAnimation", "()Landroid/view/animation/RotateAnimation;", "mFlipAnimation$delegate", "mReverseFlipAnimation", "getMReverseFlipAnimation", "mReverseFlipAnimation$delegate", "hideLoading", "", "hideRotateView", "onUIPositionChange", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "isUnderTouch", "", UpdateKey.STATUS, "", "ptrIndicator", "Lcom/ss/android/lark/widget/ptr/indicator/LKUIPtrIndicator;", "onUIRefreshBegin", "onUIRefreshComplete", "isHeader", "onUIRefreshPrepare", "onUIReset", "resetView", "showLoading", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsPtrHeaderView extends FrameLayout implements AbstractC58934a {

    /* renamed from: b */
    public static final Companion f119270b = new Companion(null);

    /* renamed from: a */
    public final Context f119271a;

    /* renamed from: c */
    private final Lazy f119272c;

    /* renamed from: d */
    private final Lazy f119273d;

    /* renamed from: e */
    private final Lazy f119274e;

    /* renamed from: f */
    private HashMap f119275f;

    public MomentsPtrHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MomentsPtrHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final CircularProgressDrawable getLoadingDrawable() {
        return (CircularProgressDrawable) this.f119274e.getValue();
    }

    private final RotateAnimation getMFlipAnimation() {
        return (RotateAnimation) this.f119272c.getValue();
    }

    private final RotateAnimation getMReverseFlipAnimation() {
        return (RotateAnimation) this.f119273d.getValue();
    }

    /* renamed from: a */
    public View mo166242a(int i) {
        if (this.f119275f == null) {
            this.f119275f = new HashMap();
        }
        View view = (View) this.f119275f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119275f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/MomentsPtrHeaderView$Companion;", "", "()V", "ROTATE_ANIMATION_DURATION", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m187275a() {
        m187278d();
        m187277c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/RotateAnimation;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView$c */
    static final class C47289c extends Lambda implements Function0<RotateAnimation> {
        public static final C47289c INSTANCE = new C47289c();

        C47289c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RotateAnimation invoke() {
            return new RotateAnimation(BitmapDescriptorFactory.HUE_RED, -180.0f, 1, 0.5f, 1, 0.5f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/RotateAnimation;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView$d */
    static final class C47290d extends Lambda implements Function0<RotateAnimation> {
        public static final C47290d INSTANCE = new C47290d();

        C47290d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RotateAnimation invoke() {
            return new RotateAnimation(-180.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView$b */
    static final class C47288b extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ MomentsPtrHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47288b(MomentsPtrHeaderView momentsPtrHeaderView) {
            super(0);
            this.this$0 = momentsPtrHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            return SpinDrawableUtils.f119255a.mo166216a(this.this$0.f119271a, UIHelper.getColor(R.color.ud_N600), UIHelper.dp2px(6.0f), UIHelper.dp2px(2.0f));
        }
    }

    /* renamed from: b */
    private final void m187276b() {
        LinearLayout linearLayout = (LinearLayout) mo166242a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(0);
        getLoadingDrawable().start();
    }

    /* renamed from: d */
    private final void m187278d() {
        ((ImageView) mo166242a(R.id.rotateView)).clearAnimation();
        LinearLayout linearLayout = (LinearLayout) mo166242a(R.id.rotateViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rotateViewContainer");
        linearLayout.setVisibility(4);
    }

    /* renamed from: c */
    private final void m187277c() {
        LinearLayout linearLayout = (LinearLayout) mo166242a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(4);
        if (getLoadingDrawable().isRunning()) {
            getLoadingDrawable().stop();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187275a();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187278d();
        m187276b();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187277c();
        LinearLayout linearLayout = (LinearLayout) mo166242a(R.id.rotateViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rotateViewContainer");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) mo166242a(R.id.rotateHeaderText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rotateHeaderText");
        textView.setText(UIHelper.getString(R.string.Lark_Groups_Pulldowntorefresh));
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        m187275a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPtrHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f119271a = context;
        this.f119272c = LazyKt.lazy(C47289c.INSTANCE);
        this.f119273d = LazyKt.lazy(C47290d.INSTANCE);
        this.f119274e = LazyKt.lazy(new C47288b(this));
        LayoutInflater.from(context).inflate(R.layout.moments_ptr_header, (ViewGroup) this, true);
        ((ImageView) mo166242a(R.id.ivLoading)).setImageDrawable(getLoadingDrawable());
        m187275a();
        getMFlipAnimation().setInterpolator(new LinearInterpolator());
        getMFlipAnimation().setDuration(150);
        getMFlipAnimation().setFillAfter(true);
        getMReverseFlipAnimation().setInterpolator(new LinearInterpolator());
        getMReverseFlipAnimation().setDuration(150);
        getMReverseFlipAnimation().setFillAfter(true);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        ((ImageView) mo166242a(R.id.rotateView)).setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_arrow_down_outlined, UIUtils.getColor(getContext(), R.color.icon_n2)));
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        Intrinsics.checkParameterIsNotNull(aVar, "ptrIndicator");
        int offsetToRefresh = lKUIPtrFrameLayout.getOffsetToRefresh();
        int m = aVar.mo199922m();
        int l = aVar.mo199921l();
        if (z && b == 2) {
            if (m + 1 <= offsetToRefresh && l >= offsetToRefresh) {
                TextView textView = (TextView) mo166242a(R.id.rotateHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rotateHeaderText");
                textView.setText(UIHelper.getString(R.string.Lark_Groups_Pulldowntorefresh));
                ((ImageView) mo166242a(R.id.rotateView)).clearAnimation();
                ((ImageView) mo166242a(R.id.rotateView)).startAnimation(getMReverseFlipAnimation());
            } else if (l <= offsetToRefresh && m > offsetToRefresh) {
                TextView textView2 = (TextView) mo166242a(R.id.rotateHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "rotateHeaderText");
                textView2.setText(UIHelper.getString(R.string.Lark_Groups_Releasetorefresh));
                ((ImageView) mo166242a(R.id.rotateView)).clearAnimation();
                ((ImageView) mo166242a(R.id.rotateView)).startAnimation(getMFlipAnimation());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsPtrHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
