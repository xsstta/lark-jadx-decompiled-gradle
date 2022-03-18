package com.tt.miniapp.manager;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import com.tt.miniapphost.AppbrandContext;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;

public class AppbrandBroadcastService extends AppbrandServiceManager.ServiceBase {
    public static final C66357a[] mBroadCastObjs = {new C66357a(0, "android.intent.action.TIME_SET", ParticipantRepo.f117150c), new C66357a(1, "android.intent.action.TIMEZONE_CHANGED", 1000)};

    /* renamed from: com.tt.miniapp.manager.AppbrandBroadcastService$b */
    public interface AbstractC66358b {
        /* renamed from: a */
        void mo231876a(int i, Context context, Intent intent);
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_CREATE})
    public void onAppCreate() {
        IntentFilter intentFilter = new IntentFilter();
        for (C66357a aVar : mBroadCastObjs) {
            intentFilter.addAction(aVar.f167518b);
        }
        INVOKEVIRTUAL_com_tt_miniapp_manager_AppbrandBroadcastService_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(AppbrandContext.getInst().getApplicationContext(), new BroadcastReceiver() {
            /* class com.tt.miniapp.manager.AppbrandBroadcastService.C663561 */

            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                C66357a[] aVarArr = AppbrandBroadcastService.mBroadCastObjs;
                for (C66357a aVar : aVarArr) {
                    if (TextUtils.equals(aVar.f167518b, action)) {
                        aVar.mo231873a(context, intent);
                    }
                }
            }
        }, intentFilter);
    }

    public AppbrandBroadcastService(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.manager.AppbrandBroadcastService$a */
    public static class C66357a {

        /* renamed from: a */
        public final int f167517a;

        /* renamed from: b */
        public final String f167518b;

        /* renamed from: c */
        private final long f167519c;

        /* renamed from: d */
        private long f167520d;

        /* renamed from: e */
        private volatile CopyOnWriteArrayList<AbstractC66358b> f167521e;

        /* renamed from: b */
        public void mo231875b(AbstractC66358b bVar) {
            if (this.f167521e != null) {
                this.f167521e.remove(bVar);
            }
        }

        /* renamed from: a */
        public void mo231874a(AbstractC66358b bVar) {
            if (this.f167521e == null) {
                synchronized (this) {
                    if (this.f167521e == null) {
                        this.f167521e = new CopyOnWriteArrayList<>();
                    }
                }
            }
            this.f167521e.addIfAbsent(bVar);
        }

        /* renamed from: a */
        public void mo231873a(Context context, Intent intent) {
            if (this.f167521e != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis >= this.f167520d + this.f167519c) {
                    this.f167520d = uptimeMillis;
                    AppBrandLogger.m52830i("AppbrandBroadcastService", "receive broadcast", intent.getAction());
                    Iterator<AbstractC66358b> it = this.f167521e.iterator();
                    while (it.hasNext()) {
                        it.next().mo231876a(this.f167517a, context, intent);
                    }
                }
            }
        }

        C66357a(int i, String str, int i2) {
            this.f167517a = i;
            this.f167518b = str;
            this.f167519c = (long) i2;
        }
    }

    private C66357a getBroadcastObjForType(int i) {
        C66357a[] aVarArr = mBroadCastObjs;
        for (C66357a aVar : aVarArr) {
            if (aVar.f167517a == i) {
                return aVar;
            }
        }
        return null;
    }

    public void registerReceiver(int i, AbstractC66358b bVar) {
        C66357a broadcastObjForType = getBroadcastObjForType(i);
        if (broadcastObjForType != null) {
            broadcastObjForType.mo231874a(bVar);
            return;
        }
        AppBrandLogger.m52829e("AppbrandBroadcastService", "LightBroadcastObj is null at register: ", Integer.valueOf(i));
    }

    public void unregisterReceiver(int i, AbstractC66358b bVar) {
        C66357a broadcastObjForType = getBroadcastObjForType(i);
        if (broadcastObjForType != null) {
            broadcastObjForType.mo231875b(bVar);
            return;
        }
        AppBrandLogger.m52829e("AppbrandBroadcastService", "LightBroadcastObj is null at unregister: ", Integer.valueOf(i));
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_tt_miniapp_manager_AppbrandBroadcastService_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
