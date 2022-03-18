package com.ss.android.lark.mm.module.player.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.mm.module.player.notification.e */
public class C46709e {

    /* renamed from: a */
    public ServiceConnection f117503a;

    /* renamed from: b */
    public AbstractBinderC46708d f117504b;

    /* renamed from: c */
    public AbstractC46705a f117505c;

    /* renamed from: d */
    public String f117506d = "";

    /* renamed from: e */
    public AbstractC46706b f117507e;

    /* renamed from: f */
    public long f117508f;

    /* renamed from: g */
    private BroadcastReceiver f117509g;

    /* renamed from: b */
    public void mo164074b() {
        if (this.f117504b != null && mo164073a()) {
            this.f117504b.mo164059a();
        }
    }

    /* renamed from: c */
    public void mo164075c() {
        if (this.f117504b != null && mo164073a()) {
            this.f117504b.mo164062b();
        }
    }

    /* renamed from: f */
    private void m184871f() {
        if (this.f117505c == null) {
            this.f117505c = new AbstractC46705a() {
                /* class com.ss.android.lark.mm.module.player.notification.C46709e.C467101 */

                @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46705a
                /* renamed from: a */
                public void mo164063a() {
                    C46709e.this.f117507e.mo164041a();
                }

                @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46705a
                /* renamed from: b */
                public void mo164065b() {
                    C46709e.this.f117507e.mo164043b();
                }

                @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46705a
                /* renamed from: a */
                public void mo164064a(long j) {
                    C46709e.this.f117507e.mo164042a(j);
                }
            };
        }
        if (this.f117503a == null) {
            this.f117503a = new ServiceConnection() {
                /* class com.ss.android.lark.mm.module.player.notification.C46709e.ServiceConnectionC467112 */

                public void onServiceDisconnected(ComponentName componentName) {
                    C45855f.m181663b("MmServiceClient", "onServiceDisconnected");
                    if (C46709e.this.f117504b != null) {
                        C46709e.this.f117504b.mo164066b(C46709e.this.f117505c);
                        C46709e.this.f117504b = null;
                    }
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    C45855f.m181663b("MmServiceClient", "onServiceConnected");
                    C46709e.this.f117504b = (AbstractBinderC46708d) iBinder;
                    C46709e.this.f117504b.mo164061a(C46709e.this.f117505c);
                    C46709e eVar = C46709e.this;
                    eVar.mo164072a(eVar.f117506d, (long) C46709e.this.f117507e.mo164046e(), C46709e.this.f117508f);
                    C46709e.this.mo164070a("foreground");
                }
            };
        }
        C45857i.m181676a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.notification.C46709e.RunnableC467123 */

            public void run() {
                C45851c.m181646a().bindService(new Intent(C45851c.m181646a(), MmVideoService.class), C46709e.this.f117503a, 1);
            }
        });
    }

    /* renamed from: e */
    public void mo164077e() {
        AbstractBinderC46708d dVar = this.f117504b;
        if (dVar != null) {
            dVar.mo164061a(this.f117505c);
            mo164072a(this.f117506d, (long) this.f117507e.mo164046e(), this.f117508f);
        }
    }

    /* renamed from: g */
    private void m184872g() {
        this.f117509g = new BroadcastReceiver() {
            /* class com.ss.android.lark.mm.module.player.notification.C46709e.C467134 */

            public void onReceive(Context context, Intent intent) {
                if (C46709e.this.mo164073a()) {
                    String action = intent.getAction();
                    if ("pause".equals(action)) {
                        C46709e.this.f117507e.mo164041a();
                        C46709e.this.mo164070a(action);
                    } else if ("resume".equals(action)) {
                        C46709e.this.f117507e.mo164043b();
                        C46709e.this.mo164070a(action);
                    } else if ("next_15s".equals(action)) {
                        C46709e.this.f117507e.mo164045d();
                        C46709e.this.mo164070a(action);
                    } else if ("prev_15s".equals(action)) {
                        C46709e.this.f117507e.mo164044c();
                        C46709e.this.mo164070a(action);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("resume");
        intentFilter.addAction("pause");
        intentFilter.addAction("next_15s");
        intentFilter.addAction("prev_15s");
        m184870a(C45851c.m181646a(), this.f117509g, intentFilter);
    }

    /* renamed from: a */
    public boolean mo164073a() {
        AbstractBinderC46708d dVar = this.f117504b;
        if (dVar == null || dVar.mo164067c() != this.f117505c) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo164076d() {
        AbstractBinderC46708d dVar = this.f117504b;
        if (dVar != null) {
            dVar.mo164066b(this.f117505c);
            this.f117504b = null;
        }
        try {
            C45851c.m181646a().unbindService(this.f117503a);
        } catch (Exception e) {
            C45855f.m181666e("MmServiceClient", "unbindService failed: " + e.getMessage());
        }
        try {
            C45851c.m181646a().unregisterReceiver(this.f117509g);
        } catch (Exception e2) {
            C45855f.m181666e("MmServiceClient", "unregisterReceiver failed: " + e2.getMessage());
        }
        C45851c.m181646a().stopService(new Intent(C45851c.m181646a(), MmVideoService.class));
    }

    /* renamed from: a */
    public void mo164069a(AbstractC46706b bVar) {
        this.f117507e = bVar;
    }

    /* renamed from: a */
    public void mo164068a(long j) {
        if (this.f117504b != null && mo164073a()) {
            this.f117504b.mo164060a(j);
        }
    }

    /* renamed from: a */
    public void mo164070a(String str) {
        try {
            Intent intent = new Intent(C45851c.m181646a(), MmVideoService.class);
            intent.setAction(str);
            if (Build.VERSION.SDK_INT >= 26) {
                C45851c.m181646a().startForegroundService(intent);
            } else {
                C45851c.m181646a().startService(intent);
            }
        } catch (Exception e) {
            C45855f.m181666e("MmServiceClient", "startCommand action: " + str + ", message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo164071a(String str, long j) {
        this.f117506d = str;
        this.f117508f = j;
    }

    public C46709e(String str, long j) {
        this.f117506d = str;
        this.f117508f = j;
        m184872g();
        m184871f();
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m184870a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public void mo164072a(String str, long j, long j2) {
        Intent intent = new Intent(C45851c.m181646a(), MmVideoService.class);
        intent.setAction("update_mm_meta");
        intent.putExtra("key_title", str);
        intent.putExtra("key_position", j);
        intent.putExtra("key_duration", j2);
        intent.putExtra("key_is_playing", false);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                C45851c.m181646a().startForegroundService(intent);
            } else {
                C45851c.m181646a().startService(intent);
            }
        } catch (Exception e) {
            C45855f.m181666e("MmServiceClient", "startCommand Exception, ex: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
