package com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper;

import android.view.MotionEvent;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/PiecesClickTrigger;", "", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnPieceClickedListener;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnPieceClickedListener;)V", "clickTarget", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/PiecesClickTarget;", "customSlop", "", "downX", "", "downY", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnPieceClickedListener;", "onActionCancel", "", "onActionDown", "event", "Landroid/view/MotionEvent;", "onActionMove", "onActionUp", "", "onScaledTouchSlopRange", "lastX", "lastY", "x", "y", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.j */
public final class PiecesClickTrigger {

    /* renamed from: a */
    private float f77388a;

    /* renamed from: b */
    private float f77389b;

    /* renamed from: c */
    private final int f77390c = UIHelper.dp2px(2.0f);

    /* renamed from: d */
    private PiecesClickTarget f77391d;

    /* renamed from: e */
    private final OnPieceClickedListener f77392e;

    /* renamed from: a */
    public final void mo111363a() {
        PiecesClickTarget iVar = this.f77391d;
        if (iVar != null) {
            iVar.mo110966c(false);
        }
        this.f77391d = null;
    }

    public PiecesClickTrigger(OnPieceClickedListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        this.f77392e = hVar;
    }

    /* renamed from: b */
    public final void mo111366b(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!m114838a(this.f77388a, this.f77389b, motionEvent.getRawX(), motionEvent.getRawY())) {
            PiecesClickTarget iVar = this.f77391d;
            if (iVar != null) {
                iVar.mo110966c(false);
            }
            this.f77391d = null;
        }
    }

    /* renamed from: a */
    public final boolean mo111365a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        PiecesClickTarget iVar = this.f77391d;
        if (iVar == null || !iVar.mo110967c() || !m114838a(this.f77388a, this.f77389b, motionEvent.getRawX(), motionEvent.getRawY())) {
            this.f77391d = null;
            return false;
        }
        this.f77392e.mo111332a(iVar);
        return true;
    }

    /* renamed from: a */
    public final void mo111364a(MotionEvent motionEvent, PiecesClickTarget iVar) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        this.f77388a = motionEvent.getRawX();
        this.f77389b = motionEvent.getRawY();
        this.f77391d = iVar;
        if (iVar != null) {
            iVar.mo110966c(true);
        }
    }

    /* renamed from: a */
    private final boolean m114838a(float f, float f2, float f3, float f4) {
        if (Math.abs(f - f3) >= ((float) this.f77390c) || Math.abs(f2 - f4) >= ((float) this.f77390c)) {
            return false;
        }
        return true;
    }
}
