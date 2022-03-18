package com.ss.android.lark.mm.module.detail.translate;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.LineHeightTextView;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateOriginTextDialog;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isShowing", "", "()Z", "setShowing", "(Z)V", "onDismissCallback", "Lkotlin/Function0;", "", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "dismiss", "setOriginText", "originText", "", "show", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.translate.f */
public final class MmTranslateOriginTextDialog extends FrameLayout {

    /* renamed from: a */
    private Function0<Unit> f116658a;

    /* renamed from: b */
    private boolean f116659b;

    /* renamed from: c */
    private HashMap f116660c;

    /* renamed from: a */
    public View mo162780a(int i) {
        if (this.f116660c == null) {
            this.f116660c = new HashMap();
        }
        View view = (View) this.f116660c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116660c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo162781a() {
        return this.f116659b;
    }

    public final Function0<Unit> getOnDismissCallback() {
        return this.f116658a;
    }

    /* renamed from: c */
    public final void mo162783c() {
        this.f116659b = false;
        ((UDShadowLayout) mo162780a(R.id.originContentView)).animate().translationY((float) C57582a.m223609b(getContext())).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new C46311a(this)).setDuration(200).start();
    }

    /* renamed from: b */
    public final void mo162782b() {
        this.f116659b = true;
        UDShadowLayout uDShadowLayout = (UDShadowLayout) mo162780a(R.id.originContentView);
        Intrinsics.checkExpressionValueIsNotNull(uDShadowLayout, "originContentView");
        uDShadowLayout.setTranslationY((float) C57582a.m223609b(getContext()));
        ((UDShadowLayout) mo162780a(R.id.originContentView)).animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new C46312b(this)).setDuration(200).start();
    }

    public final void setOnDismissCallback(Function0<Unit> function0) {
        this.f116658a = function0;
    }

    public final void setShowing(boolean z) {
        this.f116659b = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/translate/MmTranslateOriginTextDialog$dismiss$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.f$a */
    public static final class C46311a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MmTranslateOriginTextDialog f116661a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46311a(MmTranslateOriginTextDialog fVar) {
            this.f116661a = fVar;
        }

        public void onAnimationEnd(Animator animator) {
            Function0<Unit> onDismissCallback = this.f116661a.getOnDismissCallback();
            if (onDismissCallback != null) {
                onDismissCallback.invoke();
            }
            Activity a = C47098d.m186533a(this.f116661a.getContext());
            Intrinsics.checkExpressionValueIsNotNull(a, "MmActivityUtils.getSafeActivity(context)");
            Window window = a.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "MmActivityUtils.getSafeActivity(context).window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((ViewGroup) decorView).removeView(this.f116661a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/translate/MmTranslateOriginTextDialog$show$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.f$b */
    public static final class C46312b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MmTranslateOriginTextDialog f116662a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46312b(MmTranslateOriginTextDialog fVar) {
            this.f116662a = fVar;
        }

        public void onAnimationStart(Animator animator) {
            Activity a = C47098d.m186533a(this.f116662a.getContext());
            Intrinsics.checkExpressionValueIsNotNull(a, "MmActivityUtils.getSafeActivity(context)");
            Window window = a.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "MmActivityUtils.getSafeActivity(context).window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = UIUtils.getNavigationBarHeight(this.f116662a.getContext());
                ((ViewGroup) decorView).addView(this.f116662a, layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void setOriginText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "originText");
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo162780a(R.id.originContentTv);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "originContentTv");
        lineHeightTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmTranslateOriginTextDialog(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.mm_origin_text_dialog, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo162780a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "crossIcon");
        C47110e.m186573a(appCompatImageView, new Function1<View, Unit>(this) {
            /* class com.ss.android.lark.mm.module.detail.translate.MmTranslateOriginTextDialog.C463101 */
            final /* synthetic */ MmTranslateOriginTextDialog this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c("MmTranslateOriginTextDialog", "click crossIcon");
                this.this$0.mo162783c();
            }
        });
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo162780a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "crossIcon");
        C47110e.m186572a(appCompatImageView2, C57582a.m223600a(15));
    }
}
