package com.ss.android.videoshop.kits.autopause;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.lang.ref.WeakReference;
import me.ele.lancet.base.annotations.Skip;

public final class VideoScreenStateController extends BroadcastReceiver {

    /* renamed from: a */
    private final Context f162144a;

    /* renamed from: b */
    private final KeyguardManager f162145b;

    /* renamed from: c */
    private final PowerManager f162146c;

    /* renamed from: d */
    private final WeakReference<AbstractC64178a> f162147d;

    /* renamed from: e */
    private boolean f162148e;

    /* renamed from: f */
    private boolean f162149f;

    /* renamed from: g */
    private boolean f162150g;

    /* renamed from: com.ss.android.videoshop.kits.autopause.VideoScreenStateController$a */
    public interface AbstractC64178a {
        void onScreenOff();

        void onScreenOn();

        void onScreenUserPresent(boolean z);
    }

    /* renamed from: b */
    public void mo222329b() {
    }

    /* renamed from: c */
    public void mo222330c() {
        mo222329b();
    }

    /* renamed from: d */
    private boolean m252228d() {
        try {
            if (Build.VERSION.SDK_INT >= 20) {
                PowerManager powerManager = this.f162146c;
                if (powerManager == null || powerManager.isInteractive()) {
                    return true;
                }
                return false;
            }
            PowerManager powerManager2 = this.f162146c;
            if (powerManager2 == null || powerManager2.isScreenOn()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private boolean m252229e() {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                KeyguardManager keyguardManager = this.f162145b;
                if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m252230f() {
        try {
            if (!this.f162150g) {
                this.f162150g = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                m252227a(this.f162144a, this, intentFilter);
            }
        } catch (Exception unused) {
            this.f162150g = false;
        }
    }

    /* renamed from: a */
    public void mo222328a() {
        boolean z;
        boolean d = m252228d();
        this.f162148e = d;
        if (!d || !m252229e()) {
            z = false;
        } else {
            z = true;
        }
        this.f162149f = z;
        m252230f();
    }

    public VideoScreenStateController(Context context, AbstractC64178a aVar) {
        KeyguardManager keyguardManager;
        this.f162144a = context.getApplicationContext();
        this.f162146c = (PowerManager) context.getSystemService("power");
        if (Build.VERSION.SDK_INT >= 16) {
            keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        } else {
            keyguardManager = null;
        }
        this.f162145b = keyguardManager;
        this.f162147d = new WeakReference<>(aVar);
        m252230f();
    }

    public void onReceive(Context context, Intent intent) {
        AbstractC64178a aVar = this.f162147d.get();
        if (aVar == null) {
            mo222330c();
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.f162149f = false;
            aVar.onScreenOff();
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            aVar.onScreenOn();
            if (!this.f162149f && !m252229e()) {
                this.f162149f = true;
                aVar.onScreenUserPresent(true);
            }
        } else if ("android.intent.action.USER_PRESENT".equals(action) && !this.f162149f) {
            this.f162149f = true;
            aVar.onScreenUserPresent(false);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m252227a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
