package com.ss.android.vc.meeting.module.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.vc.common.p3077b.C60700b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "screenStateListener", "Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver$ScreenStateListener;", "getScreenStateListener", "()Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver$ScreenStateListener;", "setScreenStateListener", "(Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver$ScreenStateListener;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "ScreenStateListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoChatScreenBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public ScreenStateListener f158407a;

    /* renamed from: b */
    private final String f158408b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/receiver/VideoChatScreenBroadcastReceiver$ScreenStateListener;", "", "onScreenOff", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.receiver.VideoChatScreenBroadcastReceiver$a */
    public interface ScreenStateListener {
        /* renamed from: b */
        void mo212175b();
    }

    public VideoChatScreenBroadcastReceiver() {
        String simpleName = VideoChatScreenBroadcastReceiver.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "VideoChatScreenBroadcast…er::class.java.simpleName");
        this.f158408b = simpleName;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.intent.action.SCREEN_OFF".equals(str)) {
            C60700b.m235851b(this.f158408b, "[onReceive]", "screen off");
            ScreenStateListener aVar = this.f158407a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenStateListener");
            }
            if (aVar != null) {
                aVar.mo212175b();
            }
        }
    }
}
