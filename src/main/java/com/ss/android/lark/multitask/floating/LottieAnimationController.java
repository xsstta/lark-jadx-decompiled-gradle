package com.ss.android.lark.multitask.floating;

import android.content.Context;
import androidx.core.p028b.C0745a;
import com.airbnb.lottie.AbstractC1807g;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.C1798e;
import com.airbnb.lottie.LottieAnimationView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48335j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/multitask/floating/LottieAnimationController;", "", "()V", "confirmedBasketSize", "", "pendingTask", "Ljava/lang/Runnable;", "reset", "", "setBasketIcon", "size", "icon", "Lcom/airbnb/lottie/LottieAnimationView;", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.k */
public final class LottieAnimationController {

    /* renamed from: c */
    public static final Companion f121697c = new Companion(null);

    /* renamed from: a */
    public Runnable f121698a;

    /* renamed from: b */
    public int f121699b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/multitask/floating/LottieAnimationController$Companion;", "", "()V", "TAG", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo169028a() {
        this.f121698a = null;
        this.f121699b = 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.k$b */
    public static final class RunnableC48327b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LottieAnimationController f121700a;

        /* renamed from: b */
        final /* synthetic */ int f121701b;

        /* renamed from: c */
        final /* synthetic */ LottieAnimationView f121702c;

        /* renamed from: d */
        final /* synthetic */ int f121703d;

        RunnableC48327b(LottieAnimationController kVar, int i, LottieAnimationView lottieAnimationView, int i2) {
            this.f121700a = kVar;
            this.f121701b = i;
            this.f121702c = lottieAnimationView;
            this.f121703d = i2;
        }

        public final void run() {
            this.f121700a.f121698a = null;
            Log.m165389i("LottieAnimationController", "animate basket icon index = " + this.f121701b);
            Context a = C48335j.m190643a().mo168869a();
            C1798e.m8078b(a, "multitask_" + this.f121701b + ".json").mo9114a(new AbstractC1807g<C1792d>(this) {
                /* class com.ss.android.lark.multitask.floating.LottieAnimationController.RunnableC48327b.C483281 */

                /* renamed from: a */
                final /* synthetic */ RunnableC48327b f121704a;

                {
                    this.f121704a = r1;
                }

                /* renamed from: a */
                public final void mo8835a(C1792d dVar) {
                    this.f121704a.f121702c.setComposition(dVar);
                    this.f121704a.f121702c.playAnimation();
                }
            });
            this.f121700a.f121699b = this.f121703d;
        }
    }

    /* renamed from: a */
    public final void mo169029a(int i, LottieAnimationView lottieAnimationView) {
        Intrinsics.checkParameterIsNotNull(lottieAnimationView, "icon");
        Runnable runnable = this.f121698a;
        if (runnable != null) {
            lottieAnimationView.removeCallbacks(runnable);
            this.f121698a = null;
        }
        if (i == 0) {
            lottieAnimationView.clearAnimation();
            this.f121699b = 0;
            return;
        }
        int a = C0745a.m3627a(i, 1, 10);
        if (this.f121699b != i) {
            RunnableC48327b bVar = new RunnableC48327b(this, a, lottieAnimationView, i);
            this.f121698a = bVar;
            lottieAnimationView.post(bVar);
        }
    }
}
