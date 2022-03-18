package com.tt.miniapp.debug;

import android.os.Debug;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.core.util.C0844e;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import com.tt.miniapp.p3323q.HandlerC66687g;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;
import java.util.LinkedList;
import java.util.List;

public class PerformanceService extends AppbrandServiceManager.ServiceBase {
    private HandlerC66687g mMonitorHandler;
    private HandlerThread mMonitorThread;

    /* renamed from: com.tt.miniapp.debug.PerformanceService$a */
    public static class C65982a {

        /* renamed from: a */
        public long f166544a = 5000;

        /* renamed from: b */
        public boolean f166545b;

        /* renamed from: c */
        public final LinkedList<C0844e<Boolean, Integer>> f166546c = new LinkedList<>();

        /* renamed from: d */
        public final LinkedList<C0844e<Boolean, Integer>> f166547d = new LinkedList<>();

        /* renamed from: e */
        public final LinkedList<C0844e<Boolean, Integer>> f166548e = new LinkedList<>();

        /* renamed from: f */
        public final LinkedList<C0844e<Boolean, Debug.MemoryInfo>> f166549f = new LinkedList<>();

        /* renamed from: g */
        public final SparseArray<List<Integer>> f166550g = new SparseArray<>();
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public HandlerC66687g getMonitorHandler() {
        return this.mMonitorHandler;
    }

    public void cancelReportPerformance() {
        HandlerC66687g gVar = this.mMonitorHandler;
        if (gVar != null) {
            AppBrandLogger.m52828d("PerformanceService", "cancelReportPerformance ", gVar.toString());
            this.mMonitorHandler.mo232438b();
        }
    }

    public void reportPerformance() {
        if (this.mMonitorHandler == null) {
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("TmaMonitorThread");
            this.mMonitorThread = new_android_os_HandlerThread_by_knot;
            new_android_os_HandlerThread_by_knot.start();
            this.mMonitorHandler = new HandlerC66687g(this.mMonitorThread.getLooper(), this.mApp.getiAppContext());
        }
        this.mMonitorHandler.mo232436a();
    }

    private PerformanceService(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public static C65982a getInstance(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170181h;
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_INFO_INITED})
    public void onAppInfoInited(LifeCycleManager.LifeCycleEvent lifeCycleEvent, final AppInfoEntity appInfoEntity) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.debug.PerformanceService.C659811 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                boolean z;
                C65982a instance = PerformanceService.getInstance(PerformanceService.this.mApp.getiAppContext());
                if (C67556a.m262948e() || DebugUtil.debug()) {
                    z = true;
                } else {
                    z = false;
                }
                instance.f166545b = z;
                if (instance.f166545b || appInfoEntity.isLocalTest()) {
                    HandlerC66687g.m260442a(5000, PerformanceService.this.mApp.getiAppContext());
                    PerformanceService.this.reportPerformance();
                    return;
                }
                PerformanceService.this.cancelReportPerformance();
            }
        }, C67554l.m262725b());
    }
}
