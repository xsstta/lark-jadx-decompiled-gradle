package com.ss.android.appcenter.business.tab.fragmentv2.p1280a;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.LiveData;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.operationconfig.C27738a;
import com.ss.android.appcenter.business.net.operationconfig.OperationalConfigData;
import com.ss.android.appcenter.business.net.workplacehome.C27771a;
import com.ss.android.appcenter.business.net.workplacehome.WorkplaceHomeData;
import com.ss.android.appcenter.business.net.workplacesetting.C27778a;
import com.ss.android.appcenter.business.net.workplacesetting.WorkplaceSetting;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28012a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.CategoryGroupData;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.a.a */
public class C27986a extends C1150b {
    private boolean hasShowContent;
    private C27738a mApiGetOperationConfig;
    private C27771a mApiGetWorkplaceHome = C27771a.m101486a();
    private C27778a mApiGetWorkplaceSetting;
    public Map<Integer, List<ItemInfo>> mCategoryCacheData;

    public Map<Integer, List<ItemInfo>> getCategoryData() {
        return this.mCategoryCacheData;
    }

    public LiveData<OperationalConfigData> getOperationalConfigLiveData() {
        return this.mApiGetOperationConfig.mo98990d();
    }

    public LiveData<WorkplaceHomeData> getWorkplaceHomeLiveData() {
        return this.mApiGetWorkplaceHome.mo99119c();
    }

    public LiveData<WorkplaceSetting> getWorkplaceSettingLiveData() {
        return this.mApiGetWorkplaceSetting.mo99147a();
    }

    public void refreshOperationalConfig() {
        requestOperationalConfigFromNet(isOnboarding());
    }

    public void requestWorkplaceHomeNetworkData() {
        this.mApiGetWorkplaceHome.mo99121e();
    }

    public void requestWorkplaceSettingFromLocal() {
        this.mApiGetWorkplaceSetting.mo99148b();
    }

    public void requestWorkplaceSettingFromNet() {
        this.mApiGetWorkplaceSetting.mo99149c();
    }

    public OperationalConfigData getOperationalConfig() {
        return this.mApiGetOperationConfig.mo98990d().mo5927b();
    }

    public void requestWorkplaceHomeCacheData() {
        this.mApiGetWorkplaceHome.mo99118b();
        this.mApiGetWorkplaceHome.mo99120d();
    }

    public boolean checkOperationalConfigEnable() {
        if (DesktopUtil.m144307b()) {
            return false;
        }
        requestOperationalConfigFromNet(isOnboarding());
        return true;
    }

    private boolean isOnboarding() {
        boolean e = C27548m.m100547m().mo98216a().mo98165e("pc_appcenter_app_drag");
        if (e) {
            C27710b.m101318r("GetOnboardingKeyTrue");
            C27548m.m100547m().mo98216a().mo98164d("pc_appcenter_app_drag");
        }
        C28184h.m103250d("Workplace_Page", "get isOnboarding guide key :" + e);
        return e;
    }

    public boolean haveRecommendAppsToInstall() {
        if (this.mApiGetOperationConfig.mo98990d().mo5927b() == null || !this.mApiGetOperationConfig.mo98990d().mo5927b().haveRecommendAppsToInstall()) {
            return false;
        }
        return true;
    }

    public boolean needShowError() {
        if (!this.hasShowContent) {
            C28184h.m103250d("Workplace_Page", "needShowError true. has not show content.");
            return true;
        } else if (C27528a.m100471a().mo98147e()) {
            C28184h.m103250d("Workplace_Page", "needShowError true. tenant changed.");
            return true;
        } else {
            C28184h.m103250d("Workplace_Page", "needShowError false");
            return false;
        }
    }

    public boolean showTipButtonBubblt() {
        if (this.mApiGetOperationConfig.mo98990d().mo5927b() == null || !this.mApiGetOperationConfig.mo98990d().mo5927b().showTipButtonBubble()) {
            return false;
        }
        return true;
    }

    private void requestOperationalConfigFromNet(boolean z) {
        this.mApiGetOperationConfig.mo98989a(z);
    }

    public void setHasShowContent(boolean z) {
        this.hasShowContent = z;
        if (z) {
            C27528a.m100471a().mo98147e();
        }
    }

    public void updateCategoryCache(CategoryGroupData.C28011a aVar) {
        if (this.mCategoryCacheData == null) {
            this.mCategoryCacheData = new HashMap();
        }
        this.mCategoryCacheData.put(Integer.valueOf(aVar.mo99851f()), aVar.mo99854i());
    }

    public C27986a(Application application) {
        super(application);
        this.mApiGetWorkplaceSetting = new C27778a(application.getApplicationContext());
        this.mApiGetOperationConfig = new C27738a();
        C28012a.m102377a(new C28012a.AbstractC28014a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.p1280a.C27986a.C279871 */

            @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28012a.AbstractC28014a
            /* renamed from: a */
            public void mo99744a(Map<Integer, List<ItemInfo>> map) {
                C27986a.this.mCategoryCacheData = map;
            }
        });
    }
}
