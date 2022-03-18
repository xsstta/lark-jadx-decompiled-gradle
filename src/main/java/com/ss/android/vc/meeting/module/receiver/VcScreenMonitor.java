package com.ss.android.vc.meeting.module.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.p034e.p035a.C0978a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

public class VcScreenMonitor extends BroadcastReceiver {

    /* renamed from: a */
    private List<AbstractC62891b> f158404a;

    /* renamed from: b */
    private final Object f158405b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.receiver.VcScreenMonitor$a */
    public static class C62890a {

        /* renamed from: a */
        static VcScreenMonitor f158406a = new VcScreenMonitor();
    }

    /* renamed from: com.ss.android.vc.meeting.module.receiver.VcScreenMonitor$b */
    public interface AbstractC62891b {
        /* renamed from: a */
        void mo212174a();

        /* renamed from: b */
        void mo212175b();

        /* renamed from: c */
        void mo212176c();
    }

    /* renamed from: a */
    public static VcScreenMonitor m246178a() {
        return C62890a.f158406a;
    }

    private VcScreenMonitor() {
        this.f158404a = new ArrayList();
        this.f158405b = new Object();
    }

    /* renamed from: b */
    private static IntentFilter m246179b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("vc_enter_meeting_when_screen_lock");
        return intentFilter;
    }

    /* renamed from: b */
    public static boolean m246180b(Context context) {
        return ((PowerManager) context.getSystemService("power")).isScreenOn();
    }

    /* renamed from: a */
    public void mo217318a(Context context) {
        if (context != null) {
            C60700b.m235851b("VcScreenMonitor", "init", "register Screen Monitor Receiver");
            IntentFilter b = m246179b();
            m246177a(context, C62890a.f158406a, b);
            C0978a.m4782a(ar.m236694a()).mo4991a(this, b);
        }
    }

    /* renamed from: b */
    public void mo217320b(AbstractC62891b bVar) {
        if (bVar != null) {
            synchronized (this.f158405b) {
                this.f158404a.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo217319a(AbstractC62891b bVar) {
        if (bVar != null) {
            synchronized (this.f158405b) {
                if (!this.f158404a.contains(bVar)) {
                    this.f158404a.add(bVar);
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            C60700b.m235851b("VcScreenMonitor", "[onReceiveAction]", "onScreenOn");
            synchronized (this.f158405b) {
                for (AbstractC62891b bVar : this.f158404a) {
                    bVar.mo212174a();
                }
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            C60700b.m235851b("VcScreenMonitor", "[onReceiveAction2]", "onScreenOff");
            synchronized (this.f158405b) {
                for (AbstractC62891b bVar2 : this.f158404a) {
                    bVar2.mo212175b();
                }
            }
        } else if ("android.intent.action.USER_PRESENT".equals(action)) {
            C60700b.m235851b("VcScreenMonitor", "[onReceiveAction3]", "onUserPresent");
            synchronized (this.f158405b) {
                for (AbstractC62891b bVar3 : this.f158404a) {
                    bVar3.mo212176c();
                }
            }
        } else if ("vc_enter_meeting_when_screen_lock".equals(action)) {
            C60700b.m235851b("VcScreenMonitor", "[onReceiveAction4]", "onEnterMeetingWhenLock");
            synchronized (this.f158405b) {
                for (AbstractC62891b bVar4 : this.f158404a) {
                    bVar4.mo212175b();
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m246177a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
