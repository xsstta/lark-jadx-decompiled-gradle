package com.larksuite.component.universe_design.toast;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.radius.UDRadius;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.larksuite.component.universe_design.toast.f */
public final class UDToastViewController {

    /* renamed from: c */
    public static final Companion f63815c = new Companion(null);

    /* renamed from: a */
    public final View f63816a;

    /* renamed from: b */
    public ViewPropertyAnimator f63817b;

    /* renamed from: d */
    private final Context f63818d;

    /* renamed from: com.larksuite.component.universe_design.toast.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo91700a() {
        return this.f63816a;
    }

    /* renamed from: com.larksuite.component.universe_design.toast.f$e */
    public static final class C25812e extends Lambda implements Function0<Unit> {
        final /* synthetic */ UDToastViewController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25812e(UDToastViewController fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f63816a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo91709c() {
        ViewPropertyAnimator viewPropertyAnimator = this.f63817b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f63817b = null;
    }

    /* renamed from: com.larksuite.component.universe_design.toast.f$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC25811d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f63825a;

        /* renamed from: b */
        final /* synthetic */ UDToastViewController f63826b;

        /* renamed from: c */
        final /* synthetic */ boolean f63827c;

        public void onGlobalLayout() {
            TextView textView = (TextView) this.f63826b.f63816a.findViewById(R.id.ud_toast_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.ud_toast_text");
            textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView textView2 = (TextView) this.f63826b.f63816a.findViewById(R.id.ud_toast_text);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.ud_toast_text");
            if (textView2.getLineCount() > 1) {
                ((LinearLayout) this.f63826b.f63816a.findViewById(R.id.ud_toast_root)).setBackgroundResource(R.drawable.ud_bg_toast_multi_lines);
                UDRadius uDRadius = UDRadius.L;
                Context context = this.f63825a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                ((UDShadowLayout) this.f63826b.f63816a.findViewById(R.id.ud_toast_shadow)).setShadowRadius(new UDDimension.Px(uDRadius.getRadiusSize(context)));
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC25811d(TextView textView, UDToastViewController fVar, boolean z) {
            this.f63825a = textView;
            this.f63826b = fVar;
            this.f63827c = z;
        }
    }

    /* renamed from: b */
    public final void mo91706b() {
        boolean z;
        int i;
        ImageView imageView = (ImageView) this.f63816a.findViewById(R.id.ud_toast_icon);
        if (imageView.getDrawable() != null) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof Animatable)) {
            drawable = null;
        }
        Animatable animatable = (Animatable) drawable;
        if (animatable != null) {
            this.f63816a.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC25810c(animatable, this, z));
        }
        TextView textView = (TextView) this.f63816a.findViewById(R.id.ud_toast_text);
        if (z) {
            i = 8388611;
        } else {
            i = 17;
        }
        textView.setGravity(i);
        textView.setMaxWidth(m93261d());
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC25811d(textView, this, z));
    }

    /* renamed from: d */
    private final int m93261d() {
        int d = UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_max_wight) - (UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_padding_horizontal) * 2);
        ImageView imageView = (ImageView) this.f63816a.findViewById(R.id.ud_toast_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.ud_toast_icon");
        if (imageView.getVisibility() == 0) {
            d = (d - UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_icon_size)) - UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_padding_icon_text);
        }
        TextView textView = (TextView) this.f63816a.findViewById(R.id.ud_toast_action);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.ud_toast_action");
        if (textView.getVisibility() != 0) {
            return d;
        }
        int d2 = (d - (UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_padding_action_divider) * 2)) - UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_divider_size);
        int d3 = UDDimenUtils.m93313d(this.f63818d, R.dimen.ud_toast_action_max_wight);
        TextView textView2 = (TextView) this.f63816a.findViewById(R.id.ud_toast_action);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.ud_toast_action");
        TextPaint paint = textView2.getPaint();
        TextView textView3 = (TextView) this.f63816a.findViewById(R.id.ud_toast_action);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "mRootView.ud_toast_action");
        return d2 - Math.min((int) paint.measureText(textView3.getText().toString()), d3);
    }

    /* renamed from: com.larksuite.component.universe_design.toast.f$c */
    public static final class View$OnAttachStateChangeListenerC25810c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ Animatable f63822a;

        /* renamed from: b */
        final /* synthetic */ UDToastViewController f63823b;

        /* renamed from: c */
        final /* synthetic */ boolean f63824c;

        public void onViewAttachedToWindow(View view) {
            this.f63822a.start();
        }

        public void onViewDetachedFromWindow(View view) {
            this.f63822a.stop();
            this.f63823b.f63816a.removeOnAttachStateChangeListener(this);
        }

        View$OnAttachStateChangeListenerC25810c(Animatable animatable, UDToastViewController fVar, boolean z) {
            this.f63822a = animatable;
            this.f63823b = fVar;
            this.f63824c = z;
        }
    }

    /* renamed from: com.larksuite.component.universe_design.toast.f$b */
    public static final class C25809b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ UDToastViewController f63819a;

        /* renamed from: b */
        final /* synthetic */ Animator.AnimatorListener f63820b;

        /* renamed from: c */
        final /* synthetic */ Function0 f63821c;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            Animator.AnimatorListener animatorListener = this.f63820b;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            Animator.AnimatorListener animatorListener = this.f63820b;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f63819a.f63817b = null;
            Function0 function0 = this.f63821c;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
            Animator.AnimatorListener animatorListener = this.f63820b;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f63819a.f63817b = null;
            Function0 function0 = this.f63821c;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
            Animator.AnimatorListener animatorListener = this.f63820b;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        C25809b(UDToastViewController fVar, Animator.AnimatorListener animatorListener, Function0 function0) {
            this.f63819a = fVar;
            this.f63820b = animatorListener;
            this.f63821c = function0;
        }
    }

    /* renamed from: b */
    public final void mo91707b(int i) {
        mo91703a(UDIconUtils.getIconDrawable(this.f63818d, i));
    }

    public UDToastViewController(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63818d = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ud_toast_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ut.ud_toast_layout, null)");
        this.f63816a = inflate;
    }

    /* renamed from: a */
    public final void mo91701a(int i) {
        String string = this.f63818d.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(resId)");
        mo91704a(string);
    }

    /* renamed from: b */
    public final void mo91708b(Animator.AnimatorListener animatorListener) {
        this.f63816a.setAlpha(1.0f);
        ViewPropertyAnimator listener = this.f63816a.animate().setDuration(200).alpha(BitmapDescriptorFactory.HUE_RED).setListener(m93258a(animatorListener, new C25812e(this)));
        listener.start();
        this.f63817b = listener;
    }

    /* renamed from: a */
    public final void mo91702a(Animator.AnimatorListener animatorListener) {
        this.f63816a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ViewPropertyAnimator listener = this.f63816a.animate().setDuration(200).alpha(1.0f).setListener(m93259a(this, animatorListener, null, 2, null));
        listener.start();
        this.f63817b = listener;
    }

    /* renamed from: a */
    public final void mo91703a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        ((ImageView) this.f63816a.findViewById(R.id.ud_toast_icon)).setImageDrawable(drawable);
        ImageView imageView = (ImageView) this.f63816a.findViewById(R.id.ud_toast_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.ud_toast_icon");
        imageView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo91704a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        TextView textView = (TextView) this.f63816a.findViewById(R.id.ud_toast_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.ud_toast_text");
        textView.setText(charSequence);
    }

    /* renamed from: a */
    private final C25809b m93258a(Animator.AnimatorListener animatorListener, Function0<Unit> function0) {
        return new C25809b(this, animatorListener, function0);
    }

    /* renamed from: a */
    public final void mo91705a(CharSequence charSequence, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        Intrinsics.checkParameterIsNotNull(onClickListener, "action");
        TextView textView = (TextView) this.f63816a.findViewById(R.id.ud_toast_action);
        textView.setText(charSequence);
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(0);
        View findViewById = this.f63816a.findViewById(R.id.ud_toast_action_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.ud_toast_action_divider");
        findViewById.setVisibility(0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m93260a(UDToastViewController fVar, Animator.AnimatorListener animatorListener, int i, Object obj) {
        if ((i & 1) != 0) {
            animatorListener = null;
        }
        fVar.mo91702a(animatorListener);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.larksuite.component.universe_design.toast.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ C25809b m93259a(UDToastViewController fVar, Animator.AnimatorListener animatorListener, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            animatorListener = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return fVar.m93258a(animatorListener, function0);
    }
}
