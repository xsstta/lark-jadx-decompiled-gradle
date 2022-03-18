package com.ss.android.lark.mail.impl.home.threadlist.refresh_header;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smart.refresh.layout.constant.C27099b;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27082d;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27083e;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27084f;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0016J0\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0016J \u0010&\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0016J \u0010'\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013H\u0016J \u0010(\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\u000e\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0004J\u0014\u0010.\u001a\u00020\u00182\n\u0010/\u001a\u000200\"\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/MailRefreshHeader;", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "()V", "mHasNewMail", "", "mItemView", "Landroid/widget/RelativeLayout;", "getMItemView", "()Landroid/widget/RelativeLayout;", "mItemView$delegate", "Lkotlin/Lazy;", "mRefreshingAnim", "Landroid/animation/ObjectAnimator;", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "getView", "Landroid/view/View;", "isSupportHorizontalDrag", "onFinish", "", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "success", "onHorizontalDrag", "", "percentX", "", "offsetX", "offsetMax", "onInitialized", "kernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "height", "maxDragHeight", "onMoving", "isDragging", "percent", "offset", "onReleased", "onStartAnimator", "onStateChanged", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "setHasNewMail", "hasNewMail", "setPrimaryColors", "colors", "", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.a */
public final class MailRefreshHeader implements AbstractC27082d {

    /* renamed from: a */
    public static final Companion f108490a = new Companion(null);

    /* renamed from: b */
    private final Lazy f108491b = LazyKt.lazy(C42630b.INSTANCE);

    /* renamed from: c */
    private boolean f108492c;

    /* renamed from: d */
    private ObjectAnimator f108493d;

    /* renamed from: b */
    private final RelativeLayout m170009b() {
        return (RelativeLayout) this.f108491b.getValue();
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96290a(float f, int i, int i2) {
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96292a(AbstractC27084f fVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fVar, "refreshLayout");
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public boolean mo96294a() {
        return false;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public void setPrimaryColors(int... iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "colors");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/refresh_header/MailRefreshHeader$Companion;", "", "()V", "DRAG_ROTATE_RATIO", "", "ONE_CYCLE_DEGREE", "SHOW_REFRESHING_ANIM_DURATION", "", "SHOW_RESULT_TIPS_ANIM_DURATION", "SHOW_RESULT_TIPS_DURATION", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public C27099b getSpinnerStyle() {
        C27099b bVar = C27099b.f67337a;
        Intrinsics.checkExpressionValueIsNotNull(bVar, "SpinnerStyle.Translate");
        return bVar;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public View getView() {
        return m170009b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.b.a$b */
    static final class C42630b extends Lambda implements Function0<RelativeLayout> {
        public static final C42630b INSTANCE = new C42630b();

        C42630b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RelativeLayout invoke() {
            View inflate = UIHelper.inflate(R.layout.mail_home_refresh_header_layout, null);
            if (inflate != null) {
                return (RelativeLayout) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
    }

    /* renamed from: a */
    public final void mo153195a(boolean z) {
        this.f108492c = z;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public int mo96289a(AbstractC27084f fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "refreshLayout");
        ImageView imageView = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mItemView.mLoadingImg");
        imageView.setRotation(BitmapDescriptorFactory.HUE_RED);
        ImageView imageView2 = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mItemView.mLoadingImg");
        imageView2.setVisibility(4);
        ObjectAnimator objectAnimator = this.f108493d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        TextView textView = (TextView) m170009b().findViewById(R.id.mTipsText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mItemView.mTipsText");
        textView.setVisibility(0);
        TextView textView2 = (TextView) m170009b().findViewById(R.id.mTipsText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mItemView.mTipsText");
        textView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        TextView textView3 = (TextView) m170009b().findViewById(R.id.mTipsText);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "mItemView.mTipsText");
        textView3.setVisibility(0);
        if (!z) {
            ((TextView) m170009b().findViewById(R.id.mTipsText)).setText(R.string.Mail_Refresh_ServerError);
        } else if (this.f108492c) {
            TextView textView4 = (TextView) m170009b().findViewById(R.id.mTipsText);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "mItemView.mTipsText");
            textView4.setText("");
        } else {
            ((TextView) m170009b().findViewById(R.id.mTipsText)).setText(R.string.Mail_Refresh_NoMoreMessage);
        }
        ((TextView) m170009b().findViewById(R.id.mTipsText)).animate().alpha(1.0f).setDuration(300).start();
        return 1200;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96291a(AbstractC27083e eVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(eVar, "kernel");
        ((ImageView) m170009b().findViewById(R.id.mLoadingImg)).setColorFilter(C43761d.m173472c(R.color.primary_pri_500));
    }

    @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27093i
    /* renamed from: a */
    public void mo96324a(AbstractC27084f fVar, RefreshState refreshState, RefreshState refreshState2) {
        Intrinsics.checkParameterIsNotNull(fVar, "refreshLayout");
        Intrinsics.checkParameterIsNotNull(refreshState, "oldState");
        Intrinsics.checkParameterIsNotNull(refreshState2, "newState");
        if (C42631b.f108494a[refreshState2.ordinal()] == 1) {
            ImageView imageView = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mItemView.mLoadingImg");
            imageView.setVisibility(0);
            TextView textView = (TextView) m170009b().findViewById(R.id.mTipsText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mItemView.mTipsText");
            textView.setVisibility(4);
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: b */
    public void mo96295b(AbstractC27084f fVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fVar, "refreshLayout");
        ImageView imageView = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mItemView.mLoadingImg");
        ImageView imageView2 = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mItemView.mLoadingImg");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m170009b().findViewById(R.id.mLoadingImg), "rotation", imageView.getRotation(), imageView2.getRotation() + 360.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "anim");
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        ObjectAnimator objectAnimator = this.f108493d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f108493d = ofFloat;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96293a(boolean z, float f, int i, int i2, int i3) {
        if (z) {
            ImageView imageView = (ImageView) m170009b().findViewById(R.id.mLoadingImg);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mItemView.mLoadingImg");
            imageView.setRotation(((float) i) * 5.0f);
        }
    }
}
