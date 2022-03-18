package com.ss.android.vc.meeting.framework.meeting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MeetingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private AbstractC61292a f153547a;

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.MeetingReceiver$a */
    public interface AbstractC61292a {
        /* renamed from: a */
        void mo212041a(boolean z);
    }

    public void onReceive(Context context, Intent intent) {
        AbstractC61292a aVar;
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            if (intent.getIntExtra("state", 0) == 0) {
                AbstractC61292a aVar2 = this.f153547a;
                if (aVar2 != null) {
                    aVar2.mo212041a(false);
                }
            } else if (intent.getIntExtra("state", 0) == 1 && (aVar = this.f153547a) != null) {
                aVar.mo212041a(true);
            }
        }
    }
}
