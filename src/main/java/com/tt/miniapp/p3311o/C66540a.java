package com.tt.miniapp.p3311o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.tt.miniapp.maplocate.AbstractC66485c;
import com.tt.miniapp.maplocate.TMALocation;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tt.miniapp.o.a */
public class C66540a implements Handler.Callback {

    /* renamed from: b */
    private static C66540a f167999b;

    /* renamed from: a */
    private ArrayList<C67577a> f168000a = new ArrayList<>();

    /* renamed from: c */
    private AbstractC66485c f168001c;

    /* renamed from: d */
    private AbstractC66485c.AbstractC66486a f168002d;

    /* renamed from: e */
    private boolean f168003e = false;

    /* renamed from: f */
    private Handler f168004f;

    /* renamed from: a */
    public static C66540a m259963a(Context context) {
        if (f167999b == null) {
            synchronized (C66540a.class) {
                if (f167999b == null) {
                    f167999b = new C66540a(context);
                }
            }
        }
        return f167999b;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.p3311o.C66540a.C665422 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66540a.this.mo232100a(new TMALocation(2));
            }
        }, C67554l.m262725b());
        return true;
    }

    private C66540a(Context context) {
        AbstractC66485c createLocateInstance = HostDependManager.getInst().createLocateInstance(context);
        this.f168001c = createLocateInstance;
        if (createLocateInstance == null) {
            AppBrandLogger.m52828d("no lcoate instance,return", new Object[0]);
            return;
        }
        this.f168002d = new AbstractC66485c.AbstractC66486a() {
            /* class com.tt.miniapp.p3311o.C66540a.C665411 */
        };
        this.f168004f = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private void m259964b(TMALocation tMALocation) {
        CrossProcessDataEntity c;
        if (tMALocation != null && (c = m259965c(tMALocation)) != null) {
            Iterator<C67577a> it = this.f168000a.iterator();
            while (it.hasNext()) {
                it.next().mo234767a(c);
            }
            this.f168000a.clear();
        }
    }

    /* renamed from: c */
    private static CrossProcessDataEntity m259965c(TMALocation tMALocation) {
        if (tMALocation == null) {
            return null;
        }
        if (tMALocation.mo232036a() != 0) {
            return CrossProcessDataEntity.C67574a.m263013a().mo234760a("code", (Object) -1).mo234760a("locationResult", tMALocation.mo232054j()).mo234763b();
        }
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("code", (Object) 1).mo234760a("locationResult", tMALocation.mo232054j()).mo234763b();
    }

    /* renamed from: a */
    public synchronized void mo232100a(TMALocation tMALocation) {
        this.f168004f.removeMessages(1);
        this.f168003e = false;
        this.f168001c.mo232060a(this.f168002d);
        if (TMALocation.m259831a(tMALocation)) {
            AppBrandLogger.m52828d("LocateCrossProcessHandler", "onLocationGot success");
            m259964b(tMALocation);
            return;
        }
        TMALocation a = this.f168001c.mo232059a();
        if (a != null) {
            m259964b(a);
            AppBrandLogger.m52828d("LocateCrossProcessHandler", "onLocationGot failed,call back cache");
            return;
        }
        AppBrandLogger.m52828d("LocateCrossProcessHandler", "onLocationGot callback failed");
        m259964b(tMALocation);
    }

    /* renamed from: a */
    public synchronized void mo232101a(C67577a aVar) {
        AppBrandLogger.m52828d("LocateCrossProcessHandler", "getLocation");
        TMALocation a = this.f168001c.mo232059a();
        if (a == null || a.mo232036a() != 0 || System.currentTimeMillis() - a.getTime() >= 60000) {
            this.f168000a.add(aVar);
            AppBrandLogger.m52828d("LocateCrossProcessHandler", "add listener");
            if (!this.f168003e) {
                this.f168004f.sendEmptyMessageDelayed(1, 7000);
                AbstractC66485c.C66487b bVar = new AbstractC66485c.C66487b();
                bVar.f167832a = false;
                bVar.f167833b = 7000;
                this.f168001c.mo232061a(bVar, this.f168002d);
                this.f168003e = true;
            }
            return;
        }
        AppBrandLogger.m52828d("LocateCrossProcessHandler", "call back lastknown");
        CrossProcessDataEntity c = m259965c(a);
        if (c != null) {
            aVar.mo234767a(c);
        }
    }
}
