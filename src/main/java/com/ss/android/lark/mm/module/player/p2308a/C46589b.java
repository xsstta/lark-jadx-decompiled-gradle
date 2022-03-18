package com.ss.android.lark.mm.module.player.p2308a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.ss.android.lark.mm.module.player.a.b */
public class C46589b {
    /* renamed from: a */
    public static void m184219a(final SeekBar seekBar) {
        if (seekBar.getParent() != null && (seekBar.getParent() instanceof View)) {
            ((View) seekBar.getParent()).setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.mm.module.player.p2308a.C46589b.View$OnTouchListenerC465901 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Rect rect = new Rect();
                    seekBar.getHitRect(rect);
                    if (motionEvent.getY() < ((float) (rect.top - 500)) || motionEvent.getY() > ((float) (rect.bottom + ParticipantRepo.f117150c))) {
                        return false;
                    }
                    float height = (float) (rect.top + (rect.height() >> 1));
                    float x = motionEvent.getX() - ((float) rect.left);
                    if (x <= (-UIUtils.dip2Px(view.getContext(), 5.0f)) || x >= ((float) rect.width()) + UIUtils.dip2Px(view.getContext(), 5.0f)) {
                        return false;
                    }
                    return seekBar.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
                }
            });
        }
    }
}
