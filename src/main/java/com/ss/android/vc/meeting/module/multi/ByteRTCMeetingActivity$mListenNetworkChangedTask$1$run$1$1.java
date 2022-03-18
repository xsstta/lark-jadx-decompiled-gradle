package com.ss.android.vc.meeting.module.multi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity$mListenNetworkChangedTask$1$run$1$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ByteRTCMeetingActivity$mListenNetworkChangedTask$1$run$1$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ByteRTCMeetingActivity.RunnableC62447d.RunnableC62448a f157069a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ByteRTCMeetingActivity$mListenNetworkChangedTask$1$run$1$1(ByteRTCMeetingActivity.RunnableC62447d.RunnableC62448a aVar) {
        this.f157069a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!C60752f.m236080a(intent) && !C60752f.m236080a(intent.getAction()) && Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C60735ab.m236015d().postDelayed(this.f157069a.f157065a.f157064a.f157056e, 1000);
        }
    }
}
