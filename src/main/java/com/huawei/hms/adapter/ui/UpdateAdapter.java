package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.PackageNameManager;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.lang.ref.WeakReference;

public class UpdateAdapter implements IBridgeActivityDelegate, PackageNameManager.QueryPublishCallback {

    /* renamed from: a */
    public WeakReference<Activity> f57781a;

    /* renamed from: b */
    public int f57782b;

    /* renamed from: c */
    public UpdateBean f57783c;

    /* renamed from: d */
    public String f57784d;

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return CommonCode.StatusCode.API_CLIENT_EXPIRED;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m86966i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    /* renamed from: b */
    public final Activity mo81957b() {
        WeakReference<Activity> weakReference = this.f57781a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    public final void mo81958c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        mo81955a();
    }

    /* renamed from: d */
    public final void mo81959d() {
        PackageNameManager.getInstance(mo81957b()).queryPackageName(this);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m86966i("UpdateAdapter", "onBridgeActivityDestroy");
        this.f57781a = null;
    }

    /* renamed from: a */
    public final void mo81955a() {
        Activity b = mo81957b();
        if (b != null && !b.isFinishing()) {
            b.finish();
        }
    }

    @Override // com.huawei.hms.update.manager.PackageNameManager.QueryPublishCallback
    public void onQueryResult() {
        if (HMSPublishStateHolder.getPublishState() == 1) {
            this.f57784d = PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
        } else {
            this.f57784d = "com.huawei.hwid";
        }
        mo81960e();
    }

    /* renamed from: e */
    public final void mo81960e() {
        Activity b = mo81957b();
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        HMSLog.m86966i("UpdateAdapter", "target HMS Core packageName is " + this.f57784d);
        updateBean.setClientPackageName(this.f57784d);
        updateBean.setClientVersionCode(this.f57782b);
        updateBean.setClientAppId("C10132067");
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(b.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        this.f57783c = updateBean;
        HMSLog.m86966i("UpdateAdapter", "old framework HMSCore upgrade process");
        UpdateManager.startUpdate(b, CommonCode.StatusCode.API_CLIENT_EXPIRED, updateBean);
        this.f57783c = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f57781a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            mo81958c();
            return;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
        this.f57782b = intExtra;
        if (intExtra == 0) {
            mo81958c();
        } else if (intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            HMSLog.m86966i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
            String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
            Intent intent2 = new Intent();
            intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
            intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
            intent2.setComponent(componentName);
            activity.startActivityForResult(intent2, CommonCode.StatusCode.API_CLIENT_EXPIRED);
        } else {
            HMSPackageManager instance = HMSPackageManager.getInstance(activity);
            if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(instance.getHMSPackageStates())) {
                this.f57784d = instance.getHMSPackageName();
                mo81960e();
            } else if (HMSPublishStateHolder.getPublishState() == 0) {
                mo81959d();
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                this.f57784d = PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
                mo81960e();
            } else {
                this.f57784d = "com.huawei.hwid";
                mo81960e();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m86966i("UpdateAdapter", "On key up when resolve conn error");
    }

    /* renamed from: a */
    public final boolean mo81956a(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str) || i == 0) {
            return false;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) && packageManagerHelper.getPackageVersionCode(str) >= i) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            this.f57783c = null;
            return false;
        }
        HMSLog.m86966i("UpdateAdapter", "onBridgeActivityResult");
        if (i2 == 1214) {
            HMSLog.m86966i("UpdateAdapter", "Enter update escape route");
            Activity b = mo81957b();
            if (b == null) {
                HMSLog.m86964e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.f57783c = null;
                return true;
            }
            UpdateManager.startUpdate(b, CommonCode.StatusCode.API_CLIENT_EXPIRED, this.f57783c);
            this.f57783c = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.m86966i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.f57783c = null;
                    mo81955a();
                    return true;
                }
                int intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
                if (intExtra == 0) {
                    HMSLog.m86966i("UpdateAdapter", "Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                } else if (intExtra == 13) {
                    HMSLog.m86966i("UpdateAdapter", "Resolve error process canceled by user!");
                    SystemManager.getInstance().notifyUpdateResult(13);
                } else if (intExtra == 8) {
                    HMSLog.m86966i("UpdateAdapter", "Internal error occurred, recommended retry.");
                    SystemManager.getInstance().notifyUpdateResult(8);
                } else {
                    HMSLog.m86966i("UpdateAdapter", "Other error codes.");
                    SystemManager.getInstance().notifyUpdateResult(intExtra);
                }
            }
        } else if (i2 == 0) {
            HMSLog.m86966i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.f57783c = null;
            Activity b2 = mo81957b();
            if (b2 == null) {
                return true;
            }
            if (mo81956a(b2, HMSPackageManager.getInstance(b2.getApplicationContext()).getHMSPackageName(), this.f57782b)) {
                HMSLog.m86966i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        mo81955a();
        return true;
    }
}
