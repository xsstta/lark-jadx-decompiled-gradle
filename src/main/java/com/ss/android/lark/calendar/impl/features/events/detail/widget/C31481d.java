package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.d */
public class C31481d {
    /* renamed from: a */
    public static void m118441a(View view, C31475c.AbstractC31480a aVar) {
        m118442a(view, "", aVar);
    }

    /* renamed from: a */
    public static void m118442a(View view, String str, final C31475c.AbstractC31480a aVar) {
        final int[] iArr = new int[2];
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31481d.View$OnTouchListenerC314821 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                iArr[0] = (int) motionEvent.getRawX();
                iArr[1] = (int) motionEvent.getRawY();
                return false;
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31481d.View$OnLongClickListenerC314832 */

            public boolean onLongClick(View view) {
                GeneralHitPoint.m124245f();
                C31475c cVar = new C31475c(view, aVar);
                if (!aVar.mo114000a(iArr[0])) {
                    return false;
                }
                aVar.mo113999a();
                int[] iArr = iArr;
                cVar.mo114215a(iArr[0], iArr[1]);
                return true;
            }
        });
    }
}
