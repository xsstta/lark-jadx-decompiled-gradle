package com.ss.android.lark.create.groupchat.impl.f2f.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.transition.AutoTransition;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.impl.f2f.view.F2FCreateGroupView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0006\u0010\u0014\u001a\u00020\u0010JW\u0010\u0015\u001a\u00020\u0016*\u00020\u00172#\b\u0006\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u00192#\b\u0006\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u0019H\bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController;", "", "target", "Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView;", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView;)V", "footerContainer", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "handler", "Landroid/os/Handler;", "goneTips", "", "hideTips", "setupButtonAlpha", "setupDetailBodyHeight", "setupEnterAnimations", "", "setupExitAnimations", "setupNumberDisplayView", "showDetailBody", "toDetailPage", "addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "onStart", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a */
public final class SceneController {

    /* renamed from: b */
    public static final Companion f93605b = new Companion(null);

    /* renamed from: a */
    public final F2FCreateGroupView f93606a;

    /* renamed from: c */
    private final ViewGroup f93607c;

    /* renamed from: d */
    private final Handler f93608d = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController$Companion;", "", "()V", "ANIMATION_START_DELAY", "", "ANIMATION_VALUE", "", "BUTTON_FADE_IN_DELAY", "DETAIL_FADE_IN_DURATION", "KEYBOARD_FADE_OUT_DURATION", "LOG_TAG", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a$e */
    public static final class RunnableC36292e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SceneController f93614a;

        RunnableC36292e(SceneController aVar) {
            this.f93614a = aVar;
        }

        public final void run() {
            this.f93614a.mo133876b();
            this.f93614a.mo133878d();
        }
    }

    /* renamed from: a */
    public final boolean mo133875a() {
        return this.f93608d.postDelayed(new RunnableC36292e(this), 200);
    }

    /* renamed from: d */
    public final boolean mo133878d() {
        return this.f93608d.post(new RunnableC36291d(this));
    }

    /* renamed from: i */
    private final void m142882i() {
        this.f93606a.mo133931i().setVisibility(4);
        this.f93606a.mo133930h().setVisibility(4);
    }

    /* renamed from: c */
    public final void mo133877c() {
        this.f93606a.mo133931i().setVisibility(8);
        this.f93606a.mo133930h().setVisibility(8);
    }

    /* renamed from: b */
    public final void mo133876b() {
        Fade fade = new Fade(2);
        fade.setDuration(200);
        TransitionManager.beginDelayedTransition(this.f93606a.mo133927e(), fade);
        m142882i();
        this.f93607c.removeAllViews();
        this.f93607c.addView(this.f93606a.mo133929g());
    }

    /* renamed from: e */
    public final void mo133879e() {
        this.f93606a.mo133928f().mo133949a();
        ViewGroup.LayoutParams layoutParams = this.f93606a.mo133928f().getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.f2816h = 0;
            layoutParams2.f2819k = 0;
            this.f93606a.mo133928f().setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: f */
    public final void mo133880f() {
        int height = this.f93606a.mo133927e().getHeight();
        ViewGroup viewGroup = this.f93607c;
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "footerContainer");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = (int) (((float) height) * 0.6666667f);
        ViewGroup viewGroup2 = this.f93607c;
        Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "footerContainer");
        viewGroup2.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    public final void mo133881g() {
        Button l = this.f93606a.mo133934l();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1000.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C36289b(this, l));
        ofFloat.addListener(new C36290c(this, l));
        ofFloat.setStartDelay(200);
        ofFloat.start();
    }

    /* renamed from: h */
    public final void mo133882h() {
        this.f93606a.mo133933k().setVisibility(0);
        this.f93606a.mo133932j().setVisibility(0);
        this.f93606a.mo133926d().mo133907a(this.f93606a.mo133927e().getWidth());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a$d */
    public static final class RunnableC36291d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SceneController f93613a;

        RunnableC36291d(SceneController aVar) {
            this.f93613a = aVar;
        }

        public final void run() {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(500L);
            TransitionManager.beginDelayedTransition(this.f93613a.f93606a.mo133927e(), autoTransition.setInterpolator((TimeInterpolator) PathInterpolatorCompat.create(0.42f, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f)));
            this.f93613a.mo133877c();
            this.f93613a.mo133879e();
            this.f93613a.mo133880f();
            this.f93613a.mo133881g();
            this.f93613a.mo133882h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_create-group-chat_release", "com/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController$$special$$inlined$addListener$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a$c */
    public static final class C36290c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SceneController f93611a;

        /* renamed from: b */
        final /* synthetic */ Button f93612b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.f93612b.setAlpha(1.0f);
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.f93612b.setVisibility(0);
        }

        public C36290c(SceneController aVar, Button button) {
            this.f93611a = aVar;
            this.f93612b = button;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController$setupButtonAlpha$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.animation.a$b */
    public static final class C36289b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SceneController f93609a;

        /* renamed from: b */
        final /* synthetic */ Button f93610b;

        C36289b(SceneController aVar, Button button) {
            this.f93609a = aVar;
            this.f93610b = button;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f93610b.setAlpha(((float) ((int) (((double) ((Float) animatedValue).floatValue()) + 0.5d))) / 1000.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public SceneController(F2FCreateGroupView bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "target");
        this.f93606a = bVar;
        this.f93607c = (ViewGroup) bVar.mo133927e().findViewById(R.id.footer_container);
    }
}
