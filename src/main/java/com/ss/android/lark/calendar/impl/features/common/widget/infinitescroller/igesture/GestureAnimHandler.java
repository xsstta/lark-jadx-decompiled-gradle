package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.CoordinateUtil;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 62\u00020\u0001:\u000256B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\u001a\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0010J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0012J\u001c\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170(J\u0006\u0010)\u001a\u00020\u0017J$\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170(J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\rJ\u0018\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u000200H\u0002J\u001c\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170(J\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\rJ \u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0015¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler;", "", "context", "Landroid/content/Context;", "coordApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;)V", "isAnimationOnGoing", "", "mAnimatorX", "Landroid/animation/ValueAnimator;", "mAnimatorY", "mGestureSource", "", "mIsInterceptScrollY", "mMotionAction", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/IMotionAction;", "mMotionHandler", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler;", "mMotionLister", "com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$mMotionLister$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$mMotionLister$1;", "addGenericMotion", "", "ev", "Landroid/view/MotionEvent;", "addMotion", "isInterceptScrollY", "getGestureSource", "isAnimationGoing", "isTouchMotionMoving", "setForbidGesture", "isForbidGesture", "setMotionAction", "motionAction", "setMotionHandler", "motionHandler", "smoothDeltaSnap", "deltaSnap", "movedListener", "Lkotlin/Function0;", "smoothNearbySnap", "smoothToSnap", "targetSnap", "gestureSource", "xSmoothScrollTo", "toOffsetX", "duration", "", "xSmoothScrollToOrigin", "isLongMove", "ySmoothScrollTo", "toOffsetY", "AbsAnimatorListener", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c */
public final class GestureAnimHandler {

    /* renamed from: h */
    public static final Companion f78987h = new Companion(null);

    /* renamed from: a */
    public final ValueAnimator f78988a;

    /* renamed from: b */
    public final ValueAnimator f78989b;

    /* renamed from: c */
    public IMotionAction f78990c;

    /* renamed from: d */
    public boolean f78991d;

    /* renamed from: e */
    public int f78992e;

    /* renamed from: f */
    public boolean f78993f;

    /* renamed from: g */
    public final ICoordinateApi f78994g;

    /* renamed from: i */
    private BaseMotionHandler f78995i;

    /* renamed from: j */
    private C31229c f78996j = new C31229c(this);

    /* renamed from: k */
    private final Context f78997k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$AbsAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "()V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$a */
    public static abstract class AbsAnimatorListener implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$Companion;", "", "()V", "SMOOTH_SCROLL_TIME", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo113280b() {
        return this.f78992e;
    }

    /* renamed from: d */
    public final boolean mo113282d() {
        return this.f78991d;
    }

    /* renamed from: a */
    public final void mo113279a(boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "movedListener");
        this.f78988a.cancel();
        this.f78992e = z ? 3 : 2;
        this.f78988a.addListener(new C31232f(this, function0));
        this.f78988a.setIntValues(this.f78994g.mo113242a(), 0);
        this.f78988a.setDuration(200L);
        this.f78988a.start();
    }

    /* renamed from: a */
    public final void mo113278a(boolean z) {
        this.f78995i.mo113258a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$mMotionLister$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler$OnMotionLister;", "onCancelAnimation", "", "onSmoothNearbySnap", "onXScroll", "deltaX", "", "onXSmoothTo", "toXOffset", "duration", "", "onYScroll", "deltaY", "isInterceptScrollY", "", "onYSmoothTo", "toYOffset", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$c */
    public static final class C31229c implements BaseMotionHandler.OnMotionLister {

        /* renamed from: a */
        final /* synthetic */ GestureAnimHandler f79006a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: a */
        public void mo113262a() {
            this.f79006a.mo113268a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: b */
        public void mo113267b() {
            this.f79006a.f78988a.cancel();
            this.f79006a.f78989b.cancel();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31229c(GestureAnimHandler cVar) {
            this.f79006a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: a */
        public void mo113263a(int i) {
            IMotionAction dVar = this.f79006a.f78990c;
            if (dVar != null) {
                dVar.mo113240a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: a */
        public void mo113264a(int i, long j) {
            this.f79006a.mo113271a(i, j);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: a */
        public void mo113266a(int i, boolean z) {
            IMotionAction dVar = this.f79006a.f78990c;
            if (dVar != null) {
                dVar.mo113241a(i, z);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler.OnMotionLister
        /* renamed from: a */
        public void mo113265a(int i, long j, boolean z) {
            this.f79006a.mo113272a(i, j, z);
        }
    }

    /* renamed from: c */
    public final boolean mo113281c() {
        return this.f78995i.mo113260b();
    }

    /* renamed from: a */
    public final void mo113268a() {
        int a = this.f78994g.mo113242a();
        int a2 = CoordinateUtil.m114508a(a, this.f78994g.mo113244c());
        if (a2 != a) {
            this.f78988a.setIntValues(a, a2);
            this.f78988a.setDuration(200L);
            this.f78988a.start();
        }
    }

    /* renamed from: a */
    public final void mo113269a(int i) {
        mo113272a(i, 200L, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$smoothDeltaSnap$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$AbsAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$d */
    public static final class C31230d extends AbsAnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GestureAnimHandler f79007a;

        /* renamed from: b */
        final /* synthetic */ Function0 f79008b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.AbsAnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f79008b.invoke();
            this.f79007a.f78988a.removeListener(this);
        }

        C31230d(GestureAnimHandler cVar, Function0 function0) {
            this.f79007a = cVar;
            this.f79008b = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$smoothToSnap$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$AbsAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$e */
    public static final class C31231e extends AbsAnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GestureAnimHandler f79009a;

        /* renamed from: b */
        final /* synthetic */ Function0 f79010b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.AbsAnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f79010b.invoke();
            this.f79009a.f78988a.removeListener(this);
        }

        C31231e(GestureAnimHandler cVar, Function0 function0) {
            this.f79009a = cVar;
            this.f79010b = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$xSmoothScrollToOrigin$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler$AbsAnimatorListener;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.c$f */
    public static final class C31232f extends AbsAnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GestureAnimHandler f79011a;

        /* renamed from: b */
        final /* synthetic */ Function0 f79012b;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.AbsAnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f79012b.invoke();
            this.f79011a.f78988a.removeListener(this);
        }

        C31232f(GestureAnimHandler cVar, Function0 function0) {
            this.f79011a = cVar;
            this.f79012b = function0;
        }
    }

    /* renamed from: a */
    public final void mo113274a(MotionEvent motionEvent) {
        this.f78995i.mo113255a(motionEvent);
    }

    /* renamed from: a */
    public final void mo113276a(BaseMotionHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "motionHandler");
        this.f78995i = aVar;
        aVar.mo113257a(this.f78996j);
    }

    /* renamed from: a */
    public final void mo113277a(IMotionAction dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "motionAction");
        this.f78990c = dVar;
    }

    /* renamed from: a */
    public final void mo113275a(MotionEvent motionEvent, boolean z) {
        this.f78995i.mo113256a(motionEvent, z);
    }

    public GestureAnimHandler(Context context, ICoordinateApi aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "coordApi");
        this.f78997k = context;
        this.f78994g = aVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f78988a = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.f78989b = valueAnimator2;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        valueAnimator.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.C312251 */

            /* renamed from: a */
            final /* synthetic */ GestureAnimHandler f78998a;

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                this.f78998a.f78991d = false;
                this.f78998a.f78992e = 0;
            }

            public void onAnimationEnd(Animator animator) {
                this.f78998a.f78991d = false;
                this.f78998a.f78992e = 0;
            }

            public void onAnimationStart(Animator animator) {
                this.f78998a.f78991d = true;
                intRef.element = this.f78998a.f78994g.mo113242a();
            }

            {
                this.f78998a = r1;
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.C312262 */

            /* renamed from: a */
            final /* synthetic */ GestureAnimHandler f79000a;

            {
                this.f79000a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    IMotionAction dVar = this.f79000a.f78990c;
                    if (dVar != null) {
                        dVar.mo113240a(intRef.element - intValue);
                    }
                    intRef.element = intValue;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = 0;
        valueAnimator2.addListener(new Animator.AnimatorListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.C312273 */

            /* renamed from: a */
            final /* synthetic */ GestureAnimHandler f79002a;

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                this.f79002a.f78991d = false;
            }

            public void onAnimationEnd(Animator animator) {
                this.f79002a.f78991d = false;
            }

            public void onAnimationStart(Animator animator) {
                this.f79002a.f78991d = true;
                intRef2.element = this.f79002a.f78994g.mo113243b();
            }

            {
                this.f79002a = r1;
            }
        });
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler.C312284 */

            /* renamed from: a */
            final /* synthetic */ GestureAnimHandler f79004a;

            {
                this.f79004a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    IMotionAction dVar = this.f79004a.f78990c;
                    if (dVar != null) {
                        dVar.mo113241a(intRef2.element - intValue, this.f79004a.f78993f);
                    }
                    intRef2.element = intValue;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        valueAnimator2.setInterpolator(new DecelerateInterpolator());
        GeneralMotionHandler bVar = new GeneralMotionHandler(context, aVar);
        this.f78995i = bVar;
        bVar.mo113257a(this.f78996j);
    }

    /* renamed from: a */
    public final void mo113271a(int i, long j) {
        this.f78988a.cancel();
        int a = this.f78994g.mo113242a();
        this.f78988a.setIntValues(a, i);
        this.f78988a.setDuration(j);
        this.f78988a.start();
    }

    /* renamed from: a */
    public final void mo113273a(int i, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "movedListener");
        this.f78988a.cancel();
        this.f78988a.addListener(new C31230d(this, function0));
        int c = this.f78994g.mo113244c();
        int a = this.f78994g.mo113242a();
        int a2 = CoordinateUtil.m114508a(((-i) * c) + a, c);
        this.f78988a.setIntValues(a, a2);
        this.f78988a.setDuration(200L);
        this.f78988a.start();
    }

    /* renamed from: a */
    public final void mo113270a(int i, int i2, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "movedListener");
        this.f78988a.cancel();
        this.f78988a.addListener(new C31231e(this, function0));
        this.f78992e = i2;
        int c = this.f78994g.mo113244c();
        int a = this.f78994g.mo113242a();
        int a2 = CoordinateUtil.m114508a((-i) * c, c);
        this.f78988a.setIntValues(a, a2);
        this.f78988a.setDuration(200L);
        this.f78988a.start();
    }

    /* renamed from: a */
    public final void mo113272a(int i, long j, boolean z) {
        this.f78989b.cancel();
        this.f78993f = z;
        int b = this.f78994g.mo113243b();
        this.f78989b.setIntValues(b, i);
        this.f78989b.setDuration(j);
        this.f78989b.start();
    }
}
