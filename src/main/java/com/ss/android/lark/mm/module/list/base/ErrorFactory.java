package com.ss.android.lark.mm.module.list.base;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.EmptyState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011J\"\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/ErrorFactory;", "", "()V", "animShow", "", "container", "Landroid/widget/FrameLayout;", "visibility", "", "checkStateAndSet", "", "tag", "", "create", "error", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataError;", "retryAction", "Lkotlin/Function0;", "emptyAndRetry", "emptyHomeList", "emptyListSearch", "emptyMyList", "emptyTrashList", "hide", "resetState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.base.a */
public final class ErrorFactory {

    /* renamed from: a */
    public static final ErrorFactory f116755a = new ErrorFactory();

    private ErrorFactory() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$c */
    public static final class RunnableC46353c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116760a;

        /* renamed from: b */
        final /* synthetic */ Function0 f116761b;

        RunnableC46353c(FrameLayout frameLayout, Function0 function0) {
            this.f116760a = frameLayout;
            this.f116761b = function0;
        }

        public final void run() {
            this.f116760a.removeAllViews();
            Context context = this.f116760a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_SomethingWentWrong));
            if (this.f116761b != null) {
                emptyState.setSecondaryText(ResString.f118656a.mo165504a(R.string.MMWeb_G_Reload));
                emptyState.setSecondaryClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.mm.module.list.base.ErrorFactory.RunnableC46353c.View$OnClickListenerC463541 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC46353c f116762a;

                    {
                        this.f116762a = r1;
                    }

                    public final void onClick(View view) {
                        this.f116762a.f116761b.invoke();
                    }
                });
            }
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f116760a);
            ErrorFactory.m183530a(ErrorFactory.f116755a, this.f116760a, 0, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$d */
    public static final class RunnableC46355d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116763a;

        RunnableC46355d(FrameLayout frameLayout) {
            this.f116763a = frameLayout;
        }

        public final void run() {
            this.f116763a.removeAllViews();
            Context context = this.f116763a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_List_NoFilesYet_EmptyState));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f116763a);
            ErrorFactory.m183530a(ErrorFactory.f116755a, this.f116763a, 0, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$e */
    public static final class RunnableC46356e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116764a;

        RunnableC46356e(FrameLayout frameLayout) {
            this.f116764a = frameLayout;
        }

        public final void run() {
            this.f116764a.removeAllViews();
            Context context = this.f116764a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_List_FilterNoResults_EmptyState));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f116764a);
            ErrorFactory.m183530a(ErrorFactory.f116755a, this.f116764a, 0, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$f */
    public static final class RunnableC46357f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116765a;

        RunnableC46357f(FrameLayout frameLayout) {
            this.f116765a = frameLayout;
        }

        public final void run() {
            this.f116765a.removeAllViews();
            Context context = this.f116765a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_List_NoFilesYet_EmptyState));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f116765a);
            ErrorFactory.m183530a(ErrorFactory.f116755a, this.f116765a, 0, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$g */
    public static final class RunnableC46358g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116766a;

        RunnableC46358g(FrameLayout frameLayout) {
            this.f116766a = frameLayout;
        }

        public final void run() {
            this.f116766a.removeAllViews();
            Context context = this.f116766a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
            EmptyState emptyState = new EmptyState(context);
            emptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            emptyState.setImageBottomMargin(8.0f);
            emptyState.setDesc(ResString.f118656a.mo165504a(R.string.MMWeb_G_Trash_NoRecentlyDeletedFiles_EmptyState));
            emptyState.setId(View.generateViewId());
            emptyState.setContainer(this.f116766a);
            ErrorFactory.m183530a(ErrorFactory.f116755a, this.f116766a, 0, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/base/ErrorFactory$animShow$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$b */
    public static final class C46352b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116758a;

        /* renamed from: b */
        final /* synthetic */ int f116759b;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f116758a.setVisibility(this.f116759b);
        }

        C46352b(FrameLayout frameLayout, int i) {
            this.f116758a = frameLayout;
            this.f116759b = i;
        }
    }

    /* renamed from: f */
    private final void m183536f(FrameLayout frameLayout) {
        frameLayout.setTag(R.id.EmptyStateState, "");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.a$a */
    public static final class C46351a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f116756a;

        /* renamed from: b */
        final /* synthetic */ int f116757b;

        C46351a(FrameLayout frameLayout, int i) {
            this.f116756a = frameLayout;
            this.f116757b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            FrameLayout frameLayout = this.f116756a;
            if (this.f116757b == 0) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                f = valueAnimator.getAnimatedFraction();
            } else {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                f = ((float) 1) - valueAnimator.getAnimatedFraction();
            }
            frameLayout.setAlpha(f);
        }
    }

    /* renamed from: b */
    private final void m183532b(FrameLayout frameLayout) {
        if (!mo162924a(frameLayout, "emptyMyList")) {
            C26171w.m94675a(new RunnableC46357f(frameLayout));
        }
    }

    /* renamed from: c */
    private final void m183533c(FrameLayout frameLayout) {
        if (!mo162924a(frameLayout, "emptyHomeList")) {
            C26171w.m94675a(new RunnableC46355d(frameLayout));
        }
    }

    /* renamed from: d */
    private final void m183534d(FrameLayout frameLayout) {
        if (!mo162924a(frameLayout, "emptyListSearch")) {
            C26171w.m94675a(new RunnableC46356e(frameLayout));
        }
    }

    /* renamed from: e */
    private final void m183535e(FrameLayout frameLayout) {
        if (!mo162924a(frameLayout, "emptyTrashList")) {
            C26171w.m94675a(new RunnableC46358g(frameLayout));
        }
    }

    /* renamed from: a */
    public final void mo162921a(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        m183536f(frameLayout);
        if (frameLayout.getVisibility() == 0) {
            mo162922a(frameLayout, 8);
        }
    }

    /* renamed from: a */
    private final void m183529a(FrameLayout frameLayout, Function0<Unit> function0) {
        if (!mo162924a(frameLayout, "emptyAndRetry")) {
            C26171w.m94675a(new RunnableC46353c(frameLayout, function0));
        }
    }

    /* renamed from: a */
    public final void mo162922a(FrameLayout frameLayout, int i) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        frameLayout.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new C46351a(frameLayout, i));
        ofFloat.addListener(new C46352b(frameLayout, i));
        ofFloat.start();
    }

    /* renamed from: a */
    public final boolean mo162924a(FrameLayout frameLayout, String str) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        if (frameLayout.getVisibility() == 0 && Intrinsics.areEqual(frameLayout.getTag(R.id.EmptyStateState), str)) {
            return true;
        }
        frameLayout.setTag(R.id.EmptyStateState, str);
        return false;
    }

    /* renamed from: a */
    public final void mo162923a(MmListControl.DataError dataError, FrameLayout frameLayout, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(dataError, "error");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        switch (C46359b.f116767a[dataError.ordinal()]) {
            case 1:
                mo162921a(frameLayout);
                return;
            case 2:
                m183532b(frameLayout);
                return;
            case 3:
                m183533c(frameLayout);
                return;
            case 4:
                m183532b(frameLayout);
                return;
            case 5:
                m183535e(frameLayout);
                return;
            case 6:
                m183529a(frameLayout, function0);
                return;
            case 7:
                m183534d(frameLayout);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m183530a(ErrorFactory aVar, FrameLayout frameLayout, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        aVar.mo162922a(frameLayout, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.list.base.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m183531a(ErrorFactory aVar, MmListControl.DataError dataError, FrameLayout frameLayout, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        aVar.mo162923a(dataError, frameLayout, function0);
    }
}
