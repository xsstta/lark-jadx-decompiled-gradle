package com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2165d.C42041b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0011R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreView;", "", "parentView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mItemView", "Landroid/widget/RelativeLayout;", "getMItemView", "()Landroid/widget/RelativeLayout;", "mItemView$delegate", "Lkotlin/Lazy;", "mViewHolder", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeEmptyFooterLayoutBinding;", "getMViewHolder", "()Lcom/ss/android/lark/mail/impl/databinding/MailHomeEmptyFooterLayoutBinding;", "mViewHolder$delegate", "finishAnimator", "", "getView", "Landroid/view/View;", "hide", "showNoMoreTips", "success", "", "startAnimator", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.c */
public final class LoadMoreView {

    /* renamed from: b */
    public static final Companion f108463b = new Companion(null);

    /* renamed from: a */
    public final ViewGroup f108464a;

    /* renamed from: c */
    private final Lazy f108465c = LazyKt.lazy(new C42614c(this));

    /* renamed from: d */
    private final Lazy f108466d = LazyKt.lazy(new C42613b(this));

    /* renamed from: f */
    private final RelativeLayout m169989f() {
        return (RelativeLayout) this.f108466d.getValue();
    }

    /* renamed from: a */
    public final C42041b mo153161a() {
        return (C42041b) this.f108465c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreView$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final View mo153163b() {
        return m169989f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/RelativeLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.c$b */
    static final class C42613b extends Lambda implements Function0<RelativeLayout> {
        final /* synthetic */ LoadMoreView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42613b(LoadMoreView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RelativeLayout invoke() {
            return this.this$0.mo153161a().mo151056a();
        }
    }

    /* renamed from: e */
    public final void mo153166e() {
        m169989f().setVisibility(4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/databinding/MailHomeEmptyFooterLayoutBinding;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.c$c */
    static final class C42614c extends Lambda implements Function0<C42041b> {
        final /* synthetic */ LoadMoreView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42614c(LoadMoreView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C42041b invoke() {
            return C42041b.m167226a(LayoutInflater.from(this.this$0.f108464a.getContext()), this.this$0.f108464a, false);
        }
    }

    /* renamed from: d */
    public final void mo153165d() {
        LottieAnimationView lottieAnimationView = mo153161a().f106684a;
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "mViewHolder.mLottieAnimationView");
        lottieAnimationView.setVisibility(4);
        mo153161a().f106684a.cancelAnimation();
    }

    /* renamed from: c */
    public final void mo153164c() {
        Log.m165389i("LoadMoreView", "startAnimator");
        m169989f().setVisibility(0);
        LottieAnimationView lottieAnimationView = mo153161a().f106684a;
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "mViewHolder.mLottieAnimationView");
        lottieAnimationView.setVisibility(0);
        TextView textView = mo153161a().f106685b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mViewHolder.mNoMoreTipsTextView");
        textView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = mo153161a().f106684a;
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView2, "mViewHolder.mLottieAnimationView");
        if (!lottieAnimationView2.isAnimating()) {
            try {
                mo153161a().f106684a.playAnimation();
            } catch (Exception e) {
                Log.m165384e("LoadMoreView", "startAnimator play lottieView fail", e);
            }
        }
    }

    public LoadMoreView(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        this.f108464a = viewGroup;
    }

    /* renamed from: a */
    public final void mo153162a(boolean z) {
        m169989f().setVisibility(0);
        LottieAnimationView lottieAnimationView = mo153161a().f106684a;
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "mViewHolder.mLottieAnimationView");
        lottieAnimationView.setVisibility(8);
        mo153161a().f106684a.cancelAnimation();
        TextView textView = mo153161a().f106685b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mViewHolder.mNoMoreTipsTextView");
        textView.setVisibility(0);
        if (!z) {
            mo153161a().f106685b.setText(R.string.Mail_Refresh_ServerError);
        } else {
            mo153161a().f106685b.setText(R.string.Mail_Refresh_NoMoreMessage);
        }
    }
}
