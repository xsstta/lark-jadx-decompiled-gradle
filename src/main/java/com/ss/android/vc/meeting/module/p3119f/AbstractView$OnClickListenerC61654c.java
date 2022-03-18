package com.ss.android.vc.meeting.module.p3119f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.vc.meeting.module.f.c */
public abstract class AbstractView$OnClickListenerC61654c implements View.OnClickListener {

    /* renamed from: b */
    private static final int f154658b = ViewConfiguration.getDoubleTapTimeout();

    /* renamed from: a */
    public int f154659a;

    /* renamed from: c */
    private Handler f154660c = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.vc.meeting.module.p3119f.AbstractView$OnClickListenerC61654c.HandlerC616551 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 3) {
                if (AbstractView$OnClickListenerC61654c.this.f154659a == 1) {
                    AbstractView$OnClickListenerC61654c.this.mo213555b();
                } else if (AbstractView$OnClickListenerC61654c.this.f154659a >= 2) {
                    AbstractView$OnClickListenerC61654c.this.mo213554a();
                }
                AbstractView$OnClickListenerC61654c.this.f154659a = 0;
            }
        }
    };

    /* renamed from: a */
    public abstract void mo213554a();

    /* renamed from: b */
    public abstract void mo213555b();

    public final void onClick(View view) {
        this.f154659a++;
        if (!this.f154660c.hasMessages(3)) {
            this.f154660c.sendEmptyMessageDelayed(3, (long) f154658b);
        }
    }
}
