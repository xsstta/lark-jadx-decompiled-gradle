package com.ss.android.lark.moments.impl.mainview.title;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsBadgeView;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.pb.moments_entities.NotificationCount;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/title/NotificationIconDelegate;", "Lcom/ss/android/lark/moments/impl/mainview/title/INotificationIconDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bellCoverIcon", "Landroid/widget/ImageView;", "getBellCoverIcon", "()Landroid/widget/ImageView;", "bellCoverIcon$delegate", "Lkotlin/Lazy;", "bellPlummetIcon", "getBellPlummetIcon", "bellPlummetIcon$delegate", "getContext", "()Landroid/content/Context;", "executedNotificationAnim", "", "notificationIconLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getNotificationIconLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "notificationIconLayout$delegate", "notificationObserver", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "redDotNum", "", "redDotView", "Lcom/ss/android/lark/widget/tab/RedDotView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "destroyNotificationIcon", "", "getBellCoverRotate", "", "time", "getBellPlummetRotate", "getNotificationIcon", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "getRedDot", "runNotificationIconAnim", "setUnClipChildren", "showNotificationBadge", "count", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.a.d */
public final class NotificationIconDelegate {

    /* renamed from: a */
    public int f120240a;

    /* renamed from: b */
    public boolean f120241b;

    /* renamed from: c */
    private C59204a<LKUIBadgeView, Integer> f120242c;

    /* renamed from: d */
    private final AbstractC1178x<NotificationCount> f120243d = new C47714e(this);

    /* renamed from: e */
    private final Lazy f120244e = LazyKt.lazy(new C47710a(this));

    /* renamed from: f */
    private final Lazy f120245f = LazyKt.lazy(new C47711b(this));

    /* renamed from: g */
    private final Lazy f120246g = LazyKt.lazy(new C47713d(this));

    /* renamed from: h */
    private final Context f120247h;

    /* renamed from: g */
    private final ConstraintLayout m188673g() {
        return (ConstraintLayout) this.f120246g.getValue();
    }

    /* renamed from: c */
    public final ImageView mo167366c() {
        return (ImageView) this.f120244e.getValue();
    }

    /* renamed from: d */
    public final ImageView mo167367d() {
        return (ImageView) this.f120245f.getValue();
    }

    /* renamed from: f */
    public final Context mo167369f() {
        return this.f120247h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$c */
    static final class RunnableC47712c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NotificationIconDelegate f120248a;

        RunnableC47712c(NotificationIconDelegate dVar) {
            this.f120248a = dVar;
        }

        public final void run() {
            this.f120248a.mo167368e();
        }
    }

    /* renamed from: b */
    public void mo167365b() {
        MomentsNotificationManager.f120258a.mo167386b(this.f120243d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$f */
    static final class RunnableC47715f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NotificationIconDelegate f120250a;

        RunnableC47715f(NotificationIconDelegate dVar) {
            this.f120250a = dVar;
        }

        public final void run() {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                /* class com.ss.android.lark.moments.impl.mainview.title.NotificationIconDelegate.RunnableC47715f.C477161 */

                /* renamed from: a */
                final /* synthetic */ RunnableC47715f f120251a;

                {
                    this.f120251a = r1;
                }

                public final boolean queueIdle() {
                    if (this.f120251a.f120250a.f120240a > 0 && !this.f120251a.f120250a.f120241b) {
                        this.f120251a.f120250a.f120241b = true;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 5.0f);
                        ofFloat.setDuration(5000L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.start();
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            /* class com.ss.android.lark.moments.impl.mainview.title.NotificationIconDelegate.RunnableC47715f.C477161.C477171 */

                            /* renamed from: a */
                            final /* synthetic */ C477161 f120252a;

                            {
                                this.f120252a = r1;
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                NotificationIconDelegate dVar = this.f120252a.f120251a.f120250a;
                                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                if (animatedValue != null) {
                                    float a = dVar.mo167360a(((Float) animatedValue).floatValue());
                                    NotificationIconDelegate dVar2 = this.f120252a.f120251a.f120250a;
                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                    if (animatedValue2 != null) {
                                        float b = dVar2.mo167364b(((Float) animatedValue2).floatValue());
                                        this.f120252a.f120251a.f120250a.mo167366c().setRotation(a);
                                        this.f120252a.f120251a.f120250a.mo167367d().setRotation(b);
                                        return;
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                            }
                        });
                    }
                    return false;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/constraintlayout/widget/ConstraintLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$d */
    static final class C47713d extends Lambda implements Function0<ConstraintLayout> {
        final /* synthetic */ NotificationIconDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47713d(NotificationIconDelegate dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConstraintLayout invoke() {
            ConstraintLayout constraintLayout = new ConstraintLayout(this.this$0.mo167369f());
            constraintLayout.setId(R.id.parent);
            constraintLayout.setClipChildren(false);
            constraintLayout.setClipToPadding(false);
            constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            constraintLayout.addView(this.this$0.mo167366c());
            constraintLayout.addView(this.this$0.mo167367d());
            return constraintLayout;
        }
    }

    /* renamed from: e */
    public final void mo167368e() {
        ViewParent viewParent;
        ViewParent parent = m188673g().getParent();
        ViewGroup viewGroup = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
        }
        if (viewGroup2 != null) {
            viewParent = viewGroup2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = viewParent;
        }
        ViewGroup viewGroup3 = viewGroup;
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
        }
        if (viewGroup3 != null) {
            viewGroup3.setClipToPadding(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$a */
    static final class C47710a extends Lambda implements Function0<ImageView> {
        final /* synthetic */ NotificationIconDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47710a(NotificationIconDelegate dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = new ImageView(this.this$0.mo167369f());
            imageView.setId(R.id.icon);
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.moments_icon_bell_cover, UIHelper.getColor(R.color.icon_n1)));
            imageView.setClickable(false);
            imageView.setPivotX((float) UIHelper.dp2px(10.0f));
            imageView.setPivotY(BitmapDescriptorFactory.HUE_RED);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2812d = R.id.parent;
            layoutParams.f2815g = R.id.parent;
            layoutParams.f2816h = R.id.parent;
            layoutParams.f2818j = R.id.image_icon;
            layoutParams.f2790H = 2;
            imageView.setLayoutParams(layoutParams);
            return imageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$b */
    static final class C47711b extends Lambda implements Function0<ImageView> {
        final /* synthetic */ NotificationIconDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47711b(NotificationIconDelegate dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = new ImageView(this.this$0.mo167369f());
            imageView.setId(R.id.image_icon);
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.moments_icon_bell_plummet, UIHelper.getColor(R.color.icon_n1)));
            imageView.setClickable(false);
            ImageView imageView2 = imageView;
            imageView2.setPadding(imageView2.getPaddingLeft(), UIHelper.dp2px(1.5f), imageView2.getPaddingRight(), imageView2.getPaddingBottom());
            imageView.setPivotX((float) UIHelper.dp2px(3.0f));
            imageView.setPivotY((float) UIHelper.dp2px(-20.0f));
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2812d = R.id.parent;
            layoutParams.f2815g = R.id.parent;
            layoutParams.f2817i = R.id.icon;
            layoutParams.f2819k = R.id.parent;
            imageView.setLayoutParams(layoutParams);
            return imageView;
        }
    }

    /* renamed from: h */
    private final LKUIBadgeView m188674h() {
        LKUIBadgeView b;
        C59204a<LKUIBadgeView, Integer> aVar = this.f120242c;
        if (aVar == null || (b = aVar.mo201282b()) == null) {
            MomentsBadgeView aVar2 = new MomentsBadgeView(this.f120247h);
            LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) aVar2.mo201282b();
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView, "contentView");
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2812d = R.id.icon;
            layoutParams.f2816h = R.id.icon;
            layoutParams.f2818j = R.id.icon;
            LKUIBadgeView lKUIBadgeView2 = (LKUIBadgeView) aVar2.mo201282b();
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView2, "contentView");
            lKUIBadgeView2.setClickable(false);
            lKUIBadgeView.setLayoutParams(layoutParams);
            this.f120242c = aVar2;
            LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) aVar2.mo201282b();
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView3, "contentView");
            return lKUIBadgeView3;
        }
        ViewParent parent = b.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo167362a() {
        if (!this.f120241b) {
            UICallbackExecutor.executeDelayed(new RunnableC47715f(this), 500);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "count", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.a.d$e */
    static final class C47714e<T> implements AbstractC1178x<NotificationCount> {

        /* renamed from: a */
        final /* synthetic */ NotificationIconDelegate f120249a;

        C47714e(NotificationIconDelegate dVar) {
            this.f120249a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(NotificationCount notificationCount) {
            NotificationIconDelegate dVar = this.f120249a;
            int intValue = notificationCount.mmessage_count.intValue();
            Integer num = notificationCount.mreaction_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "count.mreaction_count");
            dVar.f120240a = intValue + num.intValue();
            NotificationIconDelegate dVar2 = this.f120249a;
            dVar2.mo167363a(dVar2.f120240a);
        }
    }

    /* renamed from: a */
    public final float mo167360a(float f) {
        return (((float) Math.sin((double) (16.0f * f))) * 50.0f) / ((float) Math.exp((double) (f * 4.0f)));
    }

    public NotificationIconDelegate(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f120247h = context;
    }

    /* renamed from: a */
    public View mo167361a(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        m188673g().setOnClickListener(onClickListener);
        m188673g().addView(m188674h());
        MomentsNotificationManager.f120258a.mo167380a(this.f120243d);
        m188673g().post(new RunnableC47712c(this));
        return m188673g();
    }

    /* renamed from: b */
    public final float mo167364b(float f) {
        if (f <= 0.02f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f2 = f - 0.02f;
        if (f > ((float) 1)) {
            return ((((float) Math.sin((double) (8.0f * f2))) * f) * 14.0f) / ((float) Math.exp((double) (f2 * 1.7f)));
        }
        return (((float) Math.sin((double) (14.0f * f2))) * ((float) 10)) / ((float) Math.exp((double) f2));
    }

    /* renamed from: a */
    public final void mo167363a(int i) {
        LKUIBadgeView b;
        this.f120240a = i;
        C59204a<LKUIBadgeView, Integer> aVar = this.f120242c;
        if (aVar != null) {
            aVar.mo31307a(Integer.valueOf(i));
        }
        C59204a<LKUIBadgeView, Integer> aVar2 = this.f120242c;
        if (aVar2 != null && (b = aVar2.mo201282b()) != null) {
            b.invalidate();
        }
    }
}
