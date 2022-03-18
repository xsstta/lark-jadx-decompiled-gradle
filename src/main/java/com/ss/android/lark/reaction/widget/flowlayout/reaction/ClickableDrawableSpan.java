package com.ss.android.lark.reaction.widget.flowlayout.reaction;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.core.content.res.C0760e;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJR\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0016J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ClickableDrawableSpan;", "Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/OffsetDynamicDrawableSpan;", "mContext", "Landroid/content/Context;", "mReactionKey", "", "mReactionClickListener", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionBaseFlowLayout$OnReactionItemClickListener;", "realEmojiWidth", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionBaseFlowLayout$OnReactionItemClickListener;I)V", "mDrawable", "Landroid/graphics/drawable/Drawable;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getDisplayHeight", "getDrawable", "onClick", "view", "Landroid/widget/TextView;", "updateDrawable", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.a */
public final class ClickableDrawableSpan extends OffsetDynamicDrawableSpan {

    /* renamed from: a */
    public Drawable f131167a;

    /* renamed from: b */
    public final String f131168b;

    /* renamed from: c */
    public final ReactionBaseFlowLayout.AbstractC53049d f131169c;

    /* renamed from: d */
    public final int f131170d;

    /* renamed from: e */
    private final Context f131171e;

    public Drawable getDrawable() {
        Drawable drawable = this.f131167a;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        return drawable;
    }

    /* renamed from: a */
    public final int mo181259a() {
        Drawable drawable = this.f131167a;
        if (drawable == null) {
            return ReactionTextView.f131145e.mo181254a();
        }
        int i = this.f131170d;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        int intrinsicHeight = i * drawable.getIntrinsicHeight();
        Drawable drawable2 = this.f131167a;
        if (drawable2 == null) {
            Intrinsics.throwNpe();
        }
        return intrinsicHeight / drawable2.getIntrinsicWidth();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/reaction/widget/flowlayout/reaction/ClickableDrawableSpan$onClick$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.a$b */
    public static final class C53067b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ClickableDrawableSpan f131175a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53067b(ClickableDrawableSpan aVar) {
            this.f131175a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f131175a.f131169c.onReactionClicked(this.f131175a.f131168b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.a$a */
    public static final class C53066a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ClickableDrawableSpan f131173a;

        /* renamed from: b */
        final /* synthetic */ TextView f131174b;

        C53066a(ClickableDrawableSpan aVar, TextView textView) {
            this.f131173a = aVar;
            this.f131174b = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = (float) this.f131173a.f131170d;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = f * ((Float) animatedValue).floatValue();
                int a = this.f131173a.mo181259a();
                float f2 = (float) 2;
                int i = (int) ((((float) this.f131173a.f131170d) - floatValue) / f2);
                float f3 = (float) a;
                int i2 = (int) ((f3 - floatValue) / f2);
                int i3 = (int) ((((float) this.f131173a.f131170d) + floatValue) / f2);
                int i4 = (int) ((f3 + floatValue) / f2);
                Drawable drawable = this.f131173a.f131167a;
                if (drawable != null) {
                    drawable.setBounds(i, i2, i3, i4);
                }
                this.f131174b.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public final void mo181260a(Drawable drawable) {
        if (drawable == null) {
            drawable = C0760e.m3682a(this.f131171e.getResources(), R.drawable.icon_default_reaction, null);
        }
        this.f131167a = drawable;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        drawable.setBounds(0, 0, this.f131170d, mo181259a());
    }

    /* renamed from: a */
    public final void mo181261a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.75f, 1.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addUpdateListener(new C53066a(this, textView));
        ofFloat.addListener(new C53067b(this));
        ofFloat.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableDrawableSpan(Context context, String str, ReactionBaseFlowLayout.AbstractC53049d dVar, int i) {
        super(1);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(str, "mReactionKey");
        Intrinsics.checkParameterIsNotNull(dVar, "mReactionClickListener");
        this.f131171e = context;
        this.f131168b = str;
        this.f131169c = dVar;
        this.f131170d = i;
        Drawable a = C0760e.m3682a(context.getResources(), R.drawable.icon_default_reaction, null);
        this.f131167a = a;
        if (a == null) {
            Intrinsics.throwNpe();
        }
        a.setBounds(0, 0, i, ReactionTextView.f131145e.mo181254a());
        C52977a.m205190a().mo180994a(context, str, new C52977a.AbstractC52981b<Drawable>(this) {
            /* class com.ss.android.lark.reaction.widget.flowlayout.reaction.ClickableDrawableSpan.C530651 */

            /* renamed from: a */
            final /* synthetic */ ClickableDrawableSpan f131172a;

            @Override // com.ss.android.lark.reaction.p2557b.C52977a.AbstractC52981b
            /* renamed from: a */
            public void mo181001a() {
                this.f131172a.mo181260a((Drawable) null);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f131172a = r1;
            }

            /* renamed from: a */
            public void onSuccess(Drawable drawable) {
                if (drawable != null) {
                    this.f131172a.mo181260a(drawable);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f131172a.mo181260a((Drawable) null);
            }
        });
    }

    @Override // com.ss.android.lark.reaction.widget.flowlayout.reaction.OffsetDynamicDrawableSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.save();
        canvas.translate(f, (float) (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
