package com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\u0017\u001a\u00020\u0015J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u0015J(\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayStyleClicker;", "", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnClickStyleChangedListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnClickStyleChangedListener;)V", "clickTarget", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayClickerTarget;", "customSlop", "", "downX", "", "downY", "isTapFlowFinished", "", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnClickStyleChangedListener;", "getView", "()Landroid/view/View;", "hideClickStyle", "", "improveClickProcess", "onActionCancel", "onActionDown", "event", "Landroid/view/MotionEvent;", "onActionMove", "onActionUp", "onScaledTouchSlopRange", "lastX", "lastY", "x", "y", "resetClickStyle", "showClickStyle", "startClickProcess", "chipData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.f */
public final class DelayStyleClicker {

    /* renamed from: b */
    public static final Companion f77376b = new Companion(null);

    /* renamed from: a */
    public boolean f77377a;

    /* renamed from: c */
    private DelayClickerTarget f77378c;

    /* renamed from: d */
    private final int f77379d = UIHelper.dp2px(2.0f);

    /* renamed from: e */
    private float f77380e;

    /* renamed from: f */
    private float f77381f;

    /* renamed from: g */
    private final View f77382g;

    /* renamed from: h */
    private final OnClickStyleChangedListener f77383h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayStyleClicker$Companion;", "", "()V", "TAP_TIMEOUT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo111358b() {
        m114826d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.f$b */
    public static final class RunnableC30786b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DelayStyleClicker f77384a;

        RunnableC30786b(DelayStyleClicker fVar) {
            this.f77384a = fVar;
        }

        public final void run() {
            this.f77384a.mo111359c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.f$c */
    public static final class RunnableC30787c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DelayStyleClicker f77385a;

        RunnableC30787c(DelayStyleClicker fVar) {
            this.f77385a = fVar;
        }

        public final void run() {
            this.f77385a.mo111359c();
        }
    }

    /* renamed from: a */
    public final void mo111354a() {
        DelayClickerTarget eVar = this.f77378c;
        if (eVar != null) {
            m114825c(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.f$d */
    public static final class RunnableC30788d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DelayStyleClicker f77386a;

        /* renamed from: b */
        final /* synthetic */ DelayClickerTarget f77387b;

        RunnableC30788d(DelayStyleClicker fVar, DelayClickerTarget eVar) {
            this.f77386a = fVar;
            this.f77387b = eVar;
        }

        public final void run() {
            if (!this.f77386a.f77377a) {
                this.f77386a.mo111357a(this.f77387b);
            }
        }
    }

    /* renamed from: d */
    private final void m114826d() {
        this.f77377a = true;
        if (this.f77378c != null) {
            mo111359c();
        }
    }

    /* renamed from: c */
    public final void mo111359c() {
        DelayClickerTarget eVar = this.f77378c;
        if (eVar != null) {
            eVar.mo110962a(false);
            this.f77383h.mo111331b(eVar);
        }
        this.f77378c = null;
    }

    /* renamed from: b */
    private final void m114824b(DelayClickerTarget eVar) {
        this.f77382g.postDelayed(new RunnableC30788d(this, eVar), 50);
    }

    /* renamed from: a */
    public final void mo111357a(DelayClickerTarget eVar) {
        this.f77378c = eVar;
        eVar.mo110962a(true);
        this.f77383h.mo111330a(eVar);
    }

    /* renamed from: c */
    private final void m114825c(DelayClickerTarget eVar) {
        if (!this.f77377a) {
            this.f77377a = true;
            if (!eVar.mo110963a()) {
                mo111357a(eVar);
                this.f77382g.post(new RunnableC30786b(this));
                return;
            }
            this.f77382g.post(new RunnableC30787c(this));
        }
    }

    /* renamed from: a */
    public final void mo111355a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!m114823a(this.f77380e, this.f77381f, motionEvent.getRawX(), motionEvent.getRawY())) {
            m114826d();
        }
    }

    public DelayStyleClicker(View view, OnClickStyleChangedListener gVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        this.f77382g = view;
        this.f77383h = gVar;
    }

    /* renamed from: a */
    public final void mo111356a(MotionEvent motionEvent, DelayClickerTarget eVar) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        this.f77380e = motionEvent.getRawX();
        this.f77381f = motionEvent.getRawY();
        this.f77377a = false;
        this.f77378c = eVar;
        if (eVar != null) {
            m114824b(eVar);
        }
    }

    /* renamed from: a */
    private final boolean m114823a(float f, float f2, float f3, float f4) {
        if (Math.abs(f - f3) >= ((float) this.f77379d) || Math.abs(f2 - f4) >= ((float) this.f77379d)) {
            return false;
        }
        return true;
    }
}
