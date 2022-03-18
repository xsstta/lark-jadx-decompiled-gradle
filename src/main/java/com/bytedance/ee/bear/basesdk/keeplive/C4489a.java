package com.bytedance.ee.bear.basesdk.keeplive;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.basesdk.keeplive.a */
public class C4489a {

    /* renamed from: a */
    public Context f13158a;

    /* renamed from: b */
    public C10917c f13159b;

    /* renamed from: c */
    public volatile boolean f13160c;

    /* renamed from: d */
    public ServiceConnection f13161d = new ServiceConnection() {
        /* class com.bytedance.ee.bear.basesdk.keeplive.C4489a.ServiceConnectionC44901 */

        public void onServiceDisconnected(ComponentName componentName) {
            C13479a.m54775e("KeepLiveService", "onServiceDisconnected " + componentName);
            try {
                C4489a.this.f13158a.unbindService(C4489a.this.f13161d);
                if (C5102ai.m20872j().mo20212d()) {
                    C4489a.this.mo17261a();
                } else {
                    C4489a.this.f13160c = true;
                }
            } catch (Throwable th) {
                C13479a.m54761a("KeepLiveService", th);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C13479a.m54764b("KeepLiveService", "onServiceConnected " + componentName);
            if (!C4438x.m18352d()) {
                C13479a.m54775e("KeepLiveService", "onServiceConnected  not init" + componentName);
                return;
            }
            try {
                C5234y.m21391b().mo21079a("keepliveservice_process_restart", new HashMap());
                C4489a.this.f13159b.mo41508c(ak.class).mo238020d($$Lambda$a$1$oBXbnfIe9pDsrIR1OHJQasWiNP4.INSTANCE).mo238001b($$Lambda$a$1$l1oZCOWMkqGRD6h3UD7CUv1cM.INSTANCE, $$Lambda$a$1$WUkAx5Sj4tE7ToW1bekAOQu5CCI.INSTANCE);
            } catch (Throwable th) {
                C13479a.m54761a("KeepLiveService", th);
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18506b() {
        C5102ai.m20872j().mo20208a().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.basesdk.keeplive.$$Lambda$a$Pd6f8704EiWWzVCjNv3aIY6Mrp0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C4489a.this.m18505a((Boolean) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo17261a() {
        try {
            C13479a.m54764b("KeepLiveService", "startService=== ");
            this.f13158a.bindService(new Intent(this.f13158a, KeepLiveService.class), this.f13161d, 1);
        } catch (Exception e) {
            C13479a.m54761a("KeepLiveService", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18505a(Boolean bool) {
        C13479a.m54764b("KeepLiveService", "KeepLiveService========  isVisible: " + bool + "    needStartService: " + this.f13160c);
        if (bool.booleanValue() && this.f13160c) {
            this.f13160c = false;
            mo17261a();
        }
    }

    public C4489a(Context context, C10917c cVar) {
        this.f13158a = context;
        this.f13159b = cVar;
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.basesdk.keeplive.$$Lambda$a$EILNQmmgpS66k21hz5XyjUmBYJQ */

            public final void run() {
                C4489a.this.m18506b();
            }
        });
    }
}
