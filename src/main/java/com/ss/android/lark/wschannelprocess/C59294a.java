package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.wschannelprocess.a */
public class C59294a {

    /* renamed from: a */
    private boolean f147265a;

    /* renamed from: com.ss.android.lark.wschannelprocess.a$a */
    private static class C59296a {

        /* renamed from: a */
        public static final C59294a f147266a = new C59294a();
    }

    private C59294a() {
    }

    /* renamed from: a */
    public static final C59294a m230246a() {
        return C59296a.f147266a;
    }

    /* renamed from: a */
    public void mo201567a(Context context) {
        synchronized (this) {
            if (this.f147265a) {
                Log.m165389i("GlobalAppstateObserverMgr", "setupGlobalAppstateObserver found Observer have already setup");
            } else if (context == null) {
                Log.m165397w("GlobalAppstateObserverMgr", "setupGlobalAppstateObserver found context is invalid");
            } else if (!C59300b.m230259a(context)) {
                Log.m165389i("GlobalAppstateObserverMgr", "setupGlobalAppstateObserver found main process is not exist");
            } else if (C59307d.m230286b() == null) {
                Log.m165397w("GlobalAppstateObserverMgr", "setupGlobalAppstateObserver found WschannelProcessModule.getDependency is null");
            } else {
                C59307d.m230286b().mo177789g();
                Log.m165389i("GlobalAppstateObserverMgr", "setupGlobalAppstateObserver success");
                this.f147265a = true;
            }
        }
    }
}
