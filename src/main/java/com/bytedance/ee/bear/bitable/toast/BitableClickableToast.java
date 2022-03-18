package com.bytedance.ee.bear.bitable.toast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\b\u0010(\u001a\u00020$H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "toastType", "", "toastContent", "", "actionText", "duration", "", "toastDismissListener", "Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$OnToastDismissListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$OnToastDismissListener;)V", "actionTv", "Landroid/widget/TextView;", "cancelRunnable", "Ljava/lang/Runnable;", "contentTv", "dismissEndAction", "getDismissEndAction", "()Ljava/lang/Runnable;", "setDismissEndAction", "(Ljava/lang/Runnable;)V", "divider", "Landroid/view/View;", "Ljava/lang/Long;", "iconIv", "Landroid/widget/ImageView;", "params", "Landroid/widget/FrameLayout$LayoutParams;", "rootView", "showRunnable", "getToastDismissListener", "()Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$OnToastDismissListener;", "dismiss", "", "initRunnable", "removeViewWithAnimation", "show", "showViewWithAnimation", "Companion", "OnToastDismissListener", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.toast.a */
public final class BitableClickableToast {

    /* renamed from: g */
    public static final Companion f14227g = new Companion(null);

    /* renamed from: a */
    public final View f14228a;

    /* renamed from: b */
    public FrameLayout.LayoutParams f14229b;

    /* renamed from: c */
    public Runnable f14230c;

    /* renamed from: d */
    public Runnable f14231d;

    /* renamed from: e */
    public final FragmentActivity f14232e;

    /* renamed from: f */
    public final Long f14233f;

    /* renamed from: h */
    private final TextView f14234h;

    /* renamed from: i */
    private final TextView f14235i;

    /* renamed from: j */
    private final ImageView f14236j;

    /* renamed from: k */
    private final View f14237k;

    /* renamed from: l */
    private Runnable f14238l;

    /* renamed from: m */
    private final OnToastDismissListener f14239m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$OnToastDismissListener;", "", "onActionClick", "", "onTimeout", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$b */
    public interface OnToastDismissListener {
        /* renamed from: a */
        void mo18956a();

        /* renamed from: b */
        void mo18957b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$Companion;", "", "()V", "ANIMATION_DURATION", "", "LENGTH_LONG", "TAG", "", "TRANSLATION_Y_DP", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Runnable mo18971a() {
        return this.f14238l;
    }

    /* renamed from: f */
    public final OnToastDismissListener mo18977f() {
        return this.f14239m;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$c */
    public static final class RunnableC4845c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableClickableToast f14241a;

        RunnableC4845c(BitableClickableToast aVar) {
            this.f14241a = aVar;
        }

        public final void run() {
            Runnable runnable = this.f14241a.f14231d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$g */
    public static final class RunnableC4849g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableClickableToast f14245a;

        RunnableC4849g(BitableClickableToast aVar) {
            this.f14245a = aVar;
        }

        public final void run() {
            Runnable runnable = this.f14245a.f14230c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: d */
    public final void mo18975d() {
        C13742g.m55711d(new RunnableC4849g(this));
    }

    /* renamed from: e */
    public final void mo18976e() {
        C13742g.m55710c(this.f14231d);
        C13742g.m55711d(new RunnableC4845c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$e */
    public static final class RunnableC4847e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableClickableToast f14243a;

        RunnableC4847e(BitableClickableToast aVar) {
            this.f14243a = aVar;
        }

        public final void run() {
            this.f14243a.mo18974c();
            OnToastDismissListener f = this.f14243a.mo18977f();
            if (f != null) {
                f.mo18957b();
            }
        }
    }

    /* renamed from: g */
    private final void m19986g() {
        this.f14230c = new RunnableC4846d(this);
        this.f14231d = new RunnableC4847e(this);
    }

    /* renamed from: b */
    public final void mo18973b() {
        this.f14228a.animate().setDuration(200).alpha(1.0f).start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f14228a, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f14228a, "translationY", (float) C13749l.m55738a(28), 0.0f);
        this.f14228a.getTranslationY();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* renamed from: c */
    public final void mo18974c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f14228a, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f14228a, "translationY", 0.0f, (float) C13749l.m55738a(28));
        this.f14228a.getTranslationY();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new C4848f(this));
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$d */
    public static final class RunnableC4846d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitableClickableToast f14242a;

        RunnableC4846d(BitableClickableToast aVar) {
            this.f14242a = aVar;
        }

        public final void run() {
            long j;
            if (!C13726a.m55676b(this.f14242a.f14232e)) {
                C13479a.m54775e("STClickableToast", "activity is not active");
                return;
            }
            if (this.f14242a.f14228a.getParent() instanceof ViewGroup) {
                ViewParent parent = this.f14242a.f14228a.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f14242a.f14228a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            this.f14242a.f14228a.setAlpha(BitmapDescriptorFactory.HUE_RED);
            Window window = this.f14242a.f14232e.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((ViewGroup) decorView).addView(this.f14242a.f14228a, this.f14242a.f14229b);
                this.f14242a.mo18973b();
                Runnable runnable = this.f14242a.f14231d;
                Long l = this.f14242a.f14233f;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 4000;
                }
                C13742g.m55706a(runnable, j);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/toast/BitableClickableToast$removeViewWithAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.a$f */
    public static final class C4848f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ BitableClickableToast f14244a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4848f(BitableClickableToast aVar) {
            this.f14244a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (C13726a.m55676b(this.f14244a.f14232e) && (this.f14244a.f14228a.getParent() instanceof ViewGroup)) {
                ViewParent parent = this.f14244a.f14228a.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f14244a.f14228a);
                    Runnable a = this.f14244a.mo18971a();
                    if (a != null) {
                        a.run();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    /* renamed from: a */
    public final void mo18972a(Runnable runnable) {
        this.f14238l = runnable;
    }

    public BitableClickableToast(FragmentActivity fragmentActivity, Integer num, String str, String str2, Long l, OnToastDismissListener bVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "toastContent");
        this.f14232e = fragmentActivity;
        this.f14233f = l;
        this.f14239m = bVar;
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.bitable_card_clickable_toast, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti…_toast,\n            null)");
        this.f14228a = inflate;
        View findViewById = inflate.findViewById(R.id.tv_toast_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.tv_toast_content)");
        TextView textView = (TextView) findViewById;
        this.f14234h = textView;
        View findViewById2 = inflate.findViewById(R.id.tv_toast_action);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.tv_toast_action)");
        TextView textView2 = (TextView) findViewById2;
        this.f14235i = textView2;
        View findViewById3 = inflate.findViewById(R.id.iv_toast_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.iv_toast_icon)");
        ImageView imageView = (ImageView) findViewById3;
        this.f14236j = imageView;
        View findViewById4 = inflate.findViewById(R.id.toast_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.toast_divider)");
        this.f14237k = findViewById4;
        textView.setText(str);
        String str3 = str2;
        if (!TextUtils.isEmpty(str3)) {
            textView2.setText(str3);
            textView2.setVisibility(0);
            findViewById4.setVisibility(0);
            textView2.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
                /* class com.bytedance.ee.bear.bitable.toast.BitableClickableToast.C48441 */

                /* renamed from: a */
                final /* synthetic */ BitableClickableToast f14240a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f14240a = r1;
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C13742g.m55710c(this.f14240a.f14231d);
                    OnToastDismissListener f = this.f14240a.mo18977f();
                    if (f != null) {
                        f.mo18956a();
                    }
                    this.f14240a.mo18974c();
                }
            });
        }
        ToastTypeEnum[] values = ToastTypeEnum.values();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int imageRes = values[i].getImageRes();
        if (imageRes > 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(imageRes);
        }
        this.f14229b = new FrameLayout.LayoutParams(-1, -1, 81);
        m19986g();
    }
}
