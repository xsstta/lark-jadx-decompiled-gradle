package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.draglayer;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H$J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH$R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/DragLayerOnTouchListener;", "Landroid/view/View$OnTouchListener;", "()V", "downX", "", "downY", "onClick", "", "upX", "upY", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTouchDown", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.c */
public abstract class DragLayerOnTouchListener implements View.OnTouchListener {

    /* renamed from: a */
    private float f77234a;

    /* renamed from: b */
    private float f77235b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo111182a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo111183a();

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || view.onTouchEvent(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f77234a = motionEvent.getX();
            this.f77235b = motionEvent.getY();
            return true ^ mo111183a();
        } else if (action != 1) {
            return true;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ao.m125229a(this.f77234a, this.f77235b, x, y)) {
                return true;
            }
            mo111182a(x, y);
            return true;
        }
    }
}
