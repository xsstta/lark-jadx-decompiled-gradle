package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/StatusBarAnimHelper;", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "color", "", "(Lkotlin/jvm/functions/Function1;)V", "colorRange", "currentColor", "endColor", "hideAnimator", "Landroid/animation/ValueAnimator;", "hideTitleRunnable", "Ljava/lang/Runnable;", "mCancelableUIExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "showAnimator", "showTitleRunnable", "startColor", "hideTitle", "isSupportStatusAnim", "", "showTitle", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.p */
public final class StatusBarAnimHelper {

    /* renamed from: a */
    public final ValueAnimator f87159a;

    /* renamed from: b */
    public final ValueAnimator f87160b;

    /* renamed from: c */
    public final int f87161c;

    /* renamed from: d */
    public final int f87162d;

    /* renamed from: e */
    public final int f87163e;

    /* renamed from: f */
    public int f87164f = UIHelper.getColor(R.color.bg_body_overlay);

    /* renamed from: g */
    private final C25969c f87165g = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: h */
    private final Runnable f87166h = new RunnableC33831a(this);

    /* renamed from: i */
    private final Runnable f87167i = new RunnableC33832b(this);

    /* renamed from: c */
    public final boolean mo123853c() {
        return RomUtils.m94953h();
    }

    /* renamed from: a */
    public final void mo123851a() {
        if (this.f87163e != 0) {
            this.f87165g.mo92350b(this.f87167i);
            this.f87165g.mo92346a(this.f87166h, 100);
        }
    }

    /* renamed from: b */
    public final void mo123852b() {
        if (this.f87163e != 0) {
            this.f87165g.mo92350b(this.f87166h);
            this.f87165g.mo92346a(this.f87167i, 300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.p$a */
    static final class RunnableC33831a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StatusBarAnimHelper f87172a;

        RunnableC33831a(StatusBarAnimHelper pVar) {
            this.f87172a = pVar;
        }

        public final void run() {
            this.f87172a.f87160b.cancel();
            this.f87172a.f87159a.setIntValues(this.f87172a.f87164f, this.f87172a.f87161c);
            this.f87172a.f87159a.setDuration(((long) (Math.abs(this.f87172a.f87164f - this.f87172a.f87161c) * 100)) / ((long) this.f87172a.f87163e));
            this.f87172a.f87159a.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.p$b */
    static final class RunnableC33832b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StatusBarAnimHelper f87173a;

        RunnableC33832b(StatusBarAnimHelper pVar) {
            this.f87173a = pVar;
        }

        public final void run() {
            this.f87173a.f87159a.cancel();
            this.f87173a.f87160b.setIntValues(this.f87173a.f87164f, this.f87173a.f87162d);
            this.f87173a.f87160b.setDuration(((long) (Math.abs(this.f87173a.f87164f - this.f87173a.f87162d) * MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)) / ((long) this.f87173a.f87163e));
            this.f87173a.f87160b.start();
        }
    }

    public StatusBarAnimHelper(final Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f87159a = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f87160b = valueAnimator2;
        int color = UIHelper.getColor(R.color.bg_body);
        this.f87161c = color;
        int color2 = UIHelper.getColor(R.color.bg_body_overlay);
        this.f87162d = color2;
        this.f87163e = Math.abs(color2 - color);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.StatusBarAnimHelper.C338291 */

            /* renamed from: a */
            final /* synthetic */ StatusBarAnimHelper f87168a;

            {
                this.f87168a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (this.f87168a.mo123853c()) {
                    StatusBarAnimHelper pVar = this.f87168a;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        pVar.f87164f = ((Integer) animatedValue).intValue();
                        function1.invoke(Integer.valueOf(this.f87168a.f87164f));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                if (valueAnimator.getAnimatedFraction() == 1.0f) {
                    StatusBarAnimHelper pVar2 = this.f87168a;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        pVar2.f87164f = ((Integer) animatedValue2).intValue();
                        function1.invoke(Integer.valueOf(this.f87168a.f87164f));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.StatusBarAnimHelper.C338302 */

            /* renamed from: a */
            final /* synthetic */ StatusBarAnimHelper f87170a;

            {
                this.f87170a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (this.f87170a.mo123853c()) {
                    StatusBarAnimHelper pVar = this.f87170a;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        pVar.f87164f = ((Integer) animatedValue).intValue();
                        function1.invoke(Integer.valueOf(this.f87170a.f87164f));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                if (valueAnimator.getAnimatedFraction() == 1.0f) {
                    StatusBarAnimHelper pVar2 = this.f87170a;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        pVar2.f87164f = ((Integer) animatedValue2).intValue();
                        function1.invoke(Integer.valueOf(this.f87170a.f87164f));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
        });
    }
}
