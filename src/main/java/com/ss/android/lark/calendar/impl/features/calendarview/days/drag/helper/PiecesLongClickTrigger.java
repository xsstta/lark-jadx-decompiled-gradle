package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.helper;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/helper/PiecesLongClickTrigger;", "", "()V", "customSlop", "", "downView", "Landroid/view/View;", "downX", "", "downY", "needTriggerLongClick", "", "slop", "view", "onScaledTouchSlopRange", "lastX", "lastY", "x", "y", "onTouch", "", "event", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.c.a */
public final class PiecesLongClickTrigger {

    /* renamed from: a */
    private float f77246a;

    /* renamed from: b */
    private float f77247b;

    /* renamed from: c */
    private View f77248c;

    /* renamed from: d */
    private boolean f77249d = true;

    /* renamed from: e */
    private final int f77250e = ao.m125215a();

    /* renamed from: f */
    private final int f77251f = UIHelper.dp2px(1.0f);

    /* renamed from: a */
    public final boolean mo111209a(View view) {
        if (!Intrinsics.areEqual(view, this.f77248c)) {
            return false;
        }
        return this.f77249d;
    }

    /* renamed from: a */
    public final void mo111208a(MotionEvent motionEvent, View view) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f77249d = true;
            this.f77246a = motionEvent.getRawX();
            this.f77247b = motionEvent.getRawY();
            this.f77248c = view;
        } else if (this.f77249d && !m114597a(this.f77246a, this.f77247b, motionEvent.getRawX(), motionEvent.getRawY())) {
            this.f77249d = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f77248c = null;
        }
    }

    /* renamed from: a */
    private final boolean m114597a(float f, float f2, float f3, float f4) {
        if (Math.abs(f - f3) >= ((float) this.f77251f) || Math.abs(f2 - f4) >= ((float) this.f77251f)) {
            return false;
        }
        return true;
    }
}
