package com.tt.miniapphost.data;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.recent.DataChangeListener;
import com.tt.miniapphost.recent.IRecentAppsManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapphost.data.g */
public class C67494g implements IRecentAppsManager {

    /* renamed from: a */
    private IRecentAppsManager f170205a;

    /* renamed from: com.tt.miniapphost.data.g$a */
    public interface AbstractC67495a {
    }

    /* renamed from: com.tt.miniapphost.data.g$b */
    public interface AbstractC67496b {
        /* renamed from: a */
        void mo88545a(List<AppLaunchInfo> list, boolean z);

        /* renamed from: a */
        void mo88546a(boolean z);
    }

    C67494g() {
    }

    /* renamed from: a */
    public IRecentAppsManager mo234321a() {
        if (this.f170205a == null) {
            try {
                this.f170205a = (IRecentAppsManager) Class.forName("com.tt.miniapp.manager.SynHistoryManager").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                AppBrandLogger.m52829e("RecentAppsManager", e);
            }
        }
        return this.f170205a;
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public void addDataChangeListener(DataChangeListener dataChangeListener) {
        if (mo234321a() != null) {
            this.f170205a.addDataChangeListener(dataChangeListener);
        }
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public boolean removeDataChangeListener(DataChangeListener dataChangeListener) {
        if (mo234321a() != null) {
            return this.f170205a.removeDataChangeListener(dataChangeListener);
        }
        return false;
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public List<AppLaunchInfo> getRecentAppList(AbstractC67496b bVar, IAppContext iAppContext) {
        if (mo234321a() != null) {
            return this.f170205a.getRecentAppList(bVar, iAppContext);
        }
        return new ArrayList();
    }

    @Override // com.tt.miniapphost.recent.IRecentAppsManager
    public void deleteRecentApp(String str, AbstractC67495a aVar, IAppContext iAppContext) {
        if (mo234321a() != null) {
            this.f170205a.deleteRecentApp(str, aVar, iAppContext);
        }
    }
}
