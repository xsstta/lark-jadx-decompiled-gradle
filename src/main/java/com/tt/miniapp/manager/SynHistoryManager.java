package com.tt.miniapp.manager;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67494g;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.recent.DataChangeListener;
import com.tt.miniapphost.recent.IRecentAppsManager;
import com.tt.option.p3392m.C67657c;
import java.util.ArrayList;
import java.util.List;

public class SynHistoryManager implements IRecentAppsManager {
    public final List<DataChangeListener> dataChangeListeners = new ArrayList();
    public final List<C67494g.AbstractC67496b> dataGetListeners = new ArrayList();
    public boolean isRequestingServer;
    public final List<AppLaunchInfo> recentAppList = new ArrayList();

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public void addDataChangeListener(DataChangeListener dataChangeListener) {
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public boolean removeDataChangeListener(DataChangeListener dataChangeListener) {
        return false;
    }

    public static SynHistoryManager getInstance() {
        return ContextSingletonInstance.getInstance().getSynHistoryManager();
    }

    public void clearDB() {
        AppBrandLogger.m52828d("SynHistoryManager", "clearDB ");
        Observable.create(new Action() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663624 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66417c.m259663a().mo231956c().mo231514e();
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public void addToDB(final AppLaunchInfo appLaunchInfo) {
        AppBrandLogger.m52828d("SynHistoryManager", "addToDB ", appLaunchInfo.appId);
        Observable.create(new Action() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663602 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66417c.m259663a().mo231956c().mo231510a(appLaunchInfo);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public synchronized void getDataFromDB(final C67494g.AbstractC67496b bVar) {
        AppBrandLogger.m52828d("SynHistoryManager", "getDataFromDB");
        Observable.create(new Function<Object>() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663657 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Function
            public Object fun() {
                return C66417c.m259663a().mo231956c().mo231513d();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<List<AppLaunchInfo>>() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663668 */

            /* renamed from: a */
            public void onSuccess(List<AppLaunchInfo> list) {
                synchronized (SynHistoryManager.this.recentAppList) {
                    SynHistoryManager.this.recentAppList.clear();
                    SynHistoryManager.this.recentAppList.addAll(list);
                }
                C67494g.AbstractC67496b bVar = bVar;
                if (bVar != null) {
                    bVar.mo88545a(list, true);
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C67494g.AbstractC67496b bVar = bVar;
                if (bVar != null) {
                    bVar.mo88546a(true);
                }
                AppBrandLogger.m52829e("SynHistoryManager", th);
            }
        });
    }

    public void removeFromDB(final String str) {
        AppBrandLogger.m52828d("SynHistoryManager", "removeFromDB appId ", str);
        Observable.create(new Action() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663613 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66417c.m259663a().mo231956c().mo231511a(str);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public void saveDataToDB(final List<AppLaunchInfo> list) {
        AppBrandLogger.m52828d("SynHistoryManager", "saveDataToDB ", Integer.valueOf(list.size()));
        Observable.create(new Action() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663591 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66417c.m259663a().mo231956c().mo231512a(list);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public synchronized void addToRecentApps(AppInfoEntity appInfoEntity, IAppContext iAppContext) {
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public synchronized List<AppLaunchInfo> getRecentAppList(C67494g.AbstractC67496b bVar, IAppContext iAppContext) {
        return new ArrayList(this.recentAppList);
    }

    private synchronized void getDataFromServer(final C67494g.AbstractC67496b bVar, final IAppContext iAppContext) {
        Observable.create(new Function<Object>() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663635 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Function
            public Object fun() {
                C67531h initParams = AppbrandContext.getInst().getInitParams();
                String b = C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), iAppContext);
                CrossProcessDataEntity f = C67556a.m262949f();
                String str = "";
                if (f != null) {
                    str = f.mo234740a("sessionId", str);
                }
                String a = C67657c.m263250a();
                if (TextUtils.isEmpty(a) && TextUtils.isEmpty(str)) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(AppbrandConstant.C65701b.m257612c().mo230149n());
                sb.append("?device_id=");
                sb.append(a);
                sb.append("&tma_jssdk_version=");
                sb.append(b);
                sb.append("&device_type=");
                sb.append(Build.MODEL);
                if (initParams != null) {
                    sb.append("&aid=");
                    sb.append(initParams.mo234510j());
                    sb.append("&host_version_name=");
                    sb.append(initParams.mo234508h());
                    sb.append("&channel=");
                    sb.append(initParams.mo234502b());
                    sb.append("&os_version=");
                    sb.append(initParams.mo234504d());
                    sb.append("&device_platform=");
                    sb.append(initParams.mo234503c());
                }
                AppBrandLogger.m52828d("SynHistoryManager", sb.toString());
                C12827e eVar = new C12827e(sb.toString(), "GET");
                eVar.mo48434a("X-Tma-Host-Sessionid", str);
                return C66434g.m259707a().mo231984a(eVar, iAppContext);
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<C12830f>() {
            /* class com.tt.miniapp.manager.SynHistoryManager.C663646 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C67494g.AbstractC67496b bVar = bVar;
                if (bVar != null) {
                    bVar.mo88546a(false);
                }
                AppBrandLogger.m52829e("SynHistoryManager", th);
            }

            /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
            /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f r9) {
                /*
                // Method dump skipped, instructions count: 287
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.manager.SynHistoryManager.C663646.onSuccess(com.bytedance.ee.lark.infra.network.c.a.f):void");
            }
        });
        AppBrandLogger.m52828d("SynHistoryManager", "request data from server");
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public synchronized void deleteRecentApp(String str, C67494g.AbstractC67495a aVar, IAppContext iAppContext) {
    }
}
