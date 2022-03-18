package com.tt.miniapphost.recent;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67494g;
import com.tt.miniapphost.entity.AppLaunchInfo;
import java.util.List;

public interface IRecentAppsManager {
    void addDataChangeListener(DataChangeListener dataChangeListener);

    void deleteRecentApp(String str, C67494g.AbstractC67495a aVar, IAppContext iAppContext);

    List<AppLaunchInfo> getRecentAppList(C67494g.AbstractC67496b bVar, IAppContext iAppContext);

    boolean removeDataChangeListener(DataChangeListener dataChangeListener);
}
