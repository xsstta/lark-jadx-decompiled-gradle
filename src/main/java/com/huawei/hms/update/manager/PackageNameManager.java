package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;

public class PackageNameManager {

    /* renamed from: b */
    public static final Object f58936b = new Object();

    /* renamed from: c */
    public static PackageNameManager f58937c;

    /* renamed from: a */
    public Context f58938a;

    public interface QueryPublishCallback {
        void onQueryResult();
    }

    public PackageNameManager(Context context) {
        this.f58938a = context;
    }

    public void queryPackageName(QueryPublishCallback queryPublishCallback) {
        UpdateSdkAPI.checkTargetAppUpdate(this.f58938a, PackageConstants.SERVICES_PACKAGE_ALL_SCENE, new C23799a(this, queryPublishCallback));
    }

    /* renamed from: com.huawei.hms.update.manager.PackageNameManager$a */
    public class C23799a implements CheckUpdateCallBack {

        /* renamed from: a */
        public final /* synthetic */ QueryPublishCallback f58939a;

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            if (HMSPublishStateHolder.getPublishState() != 1) {
                HMSPublishStateHolder.setPublishState(2);
            }
            this.f58939a.onQueryResult();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            HMSLog.m86964e("PackageNameManager", "onMarketStoreError responseCode: " + i);
            if (HMSPublishStateHolder.getPublishState() != 1) {
                HMSPublishStateHolder.setPublishState(2);
            }
            this.f58939a.onQueryResult();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            HMSLog.m86964e("PackageNameManager", "onUpdateStoreError responseCode: " + i);
            if (HMSPublishStateHolder.getPublishState() != 1) {
                HMSPublishStateHolder.setPublishState(2);
            }
            this.f58939a.onQueryResult();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent != null) {
                try {
                    int intExtra = intent.getIntExtra(UpdateKey.STATUS, -99);
                    HMSLog.m86966i("PackageNameManager", "CheckUpdateCallBack status is " + intExtra);
                    String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        HMSLog.m86964e("PackageNameManager", "checkTargetAppUpdate reason is " + stringExtra);
                    }
                    if (intExtra == 7) {
                        Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                        if ((serializableExtra instanceof ApkUpgradeInfo) && ((ApkUpgradeInfo) serializableExtra).getPackage_().equalsIgnoreCase(PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                            HMSLog.m86966i("PackageNameManager", "com.huawei.hms has already be published");
                            HMSPublishStateHolder.setPublishState(1);
                        }
                    }
                } catch (Exception e) {
                    HMSLog.m86964e("PackageNameManager", "intent has some error" + e.getMessage());
                }
            }
            if (HMSPublishStateHolder.getPublishState() != 1) {
                HMSPublishStateHolder.setPublishState(2);
            }
            this.f58939a.onQueryResult();
        }

        public C23799a(PackageNameManager packageNameManager, QueryPublishCallback queryPublishCallback) {
            this.f58939a = queryPublishCallback;
        }
    }

    public static PackageNameManager getInstance(Context context) {
        synchronized (f58936b) {
            if (f58937c == null) {
                f58937c = new PackageNameManager(context);
            }
        }
        return f58937c;
    }
}
