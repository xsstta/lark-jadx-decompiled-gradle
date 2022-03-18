package com.ss.android.vc.meeting.module.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/receiver/AudioReceiverHolder$mHeadPhoneReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AudioReceiverHolder$mHeadPhoneReceiver$1 extends BroadcastReceiver {
    AudioReceiverHolder$mHeadPhoneReceiver$1() {
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        AudioReceiverHolder aVar = AudioReceiverHolder.f158409a;
        if (!AudioReceiverHolder.f158411c.isEmpty() && Intrinsics.areEqual("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            AudioReceiverHolder aVar2 = AudioReceiverHolder.f158409a;
            C60700b.m235851b(AudioReceiverHolder.f158410b, "[onReceive]", "HEADSET_PLUG");
            if (intent.hasExtra("state")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra == 0) {
                    AudioReceiverHolder aVar3 = AudioReceiverHolder.f158409a;
                    for (AudioReceiverHolder.IAction aVar4 : AudioReceiverHolder.f158411c) {
                        aVar4.mo212709n();
                    }
                } else if (intExtra == 1) {
                    AudioReceiverHolder aVar5 = AudioReceiverHolder.f158409a;
                    for (AudioReceiverHolder.IAction aVar6 : AudioReceiverHolder.f158411c) {
                        aVar6.mo212710o();
                    }
                }
            }
        }
    }
}
