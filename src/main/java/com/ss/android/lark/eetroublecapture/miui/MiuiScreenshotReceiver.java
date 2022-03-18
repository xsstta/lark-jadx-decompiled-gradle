package com.ss.android.lark.eetroublecapture.miui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.eetroublebase.Log;
import me.ele.lancet.base.annotations.Skip;

public class MiuiScreenshotReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static MiuiScreenshotReceiver f95108a = new MiuiScreenshotReceiver(null);

    /* renamed from: b */
    private long f95109b;

    /* renamed from: c */
    private AbstractC36996a f95110c;

    /* renamed from: com.ss.android.lark.eetroublecapture.miui.MiuiScreenshotReceiver$a */
    public interface AbstractC36996a {
        /* renamed from: a */
        void mo136473a();
    }

    public MiuiScreenshotReceiver(AbstractC36996a aVar) {
        this.f95110c = aVar;
    }

    /* renamed from: a */
    public static void m146010a(Context context) {
        MiuiScreenshotReceiver miuiScreenshotReceiver = f95108a;
        miuiScreenshotReceiver.f95110c = null;
        context.unregisterReceiver(miuiScreenshotReceiver);
    }

    /* renamed from: a */
    public static void m146011a(Context context, AbstractC36996a aVar) {
        MiuiScreenshotReceiver miuiScreenshotReceiver = f95108a;
        miuiScreenshotReceiver.f95110c = aVar;
        m146009a(context, miuiScreenshotReceiver, new IntentFilter("miui.intent.TAKE_SCREENSHOT"));
    }

    public void onReceive(Context context, Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f95109b >= 1000) {
            this.f95109b = elapsedRealtime;
            Log.m145905a("TroubleCapture: miui.intent.TAKE_SCREENSHOT " + elapsedRealtime);
            AbstractC36996a aVar = this.f95110c;
            if (aVar != null) {
                aVar.mo136473a();
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m146009a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
