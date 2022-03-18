package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.availableupdate.x */
public class C23499x extends AbstractC23484n {
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2005;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    /* renamed from: d */
    public void mo82196d() {
        mo82174c(13, this.f57925f);
    }

    /* renamed from: c */
    public final boolean mo82195c() {
        Activity b = mo82172b();
        if (b == null || b.isFinishing() || TextUtils.isEmpty(this.f57926g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.f57926g);
            if (SystemUtils.isTVDevice()) {
                int packageVersionCode = new PackageManagerHelper(b).getPackageVersionCode("com.hisilicon.android.hiRMService");
                HMSLog.m86966i("HiappWizard", "version " + packageVersionCode);
                if (packageVersionCode == 1) {
                    HMSLog.m86966i("HiappWizard", "startActivity");
                    intent.addFlags(268435456);
                    mo82194a(intent);
                    b.startActivity(intent);
                    return true;
                }
            }
            HMSLog.m86966i("HiappWizard", "startActivityForResult");
            mo82194a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.m86964e("HiappWizard", "can not open hiapp");
            return false;
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82142a(AbstractC23485o oVar) {
        HMSLog.m86966i("HiappWizard", "Enter onCancel.");
        if (oVar instanceof C23500y) {
            mo82196d();
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: b */
    public void mo82145b(AbstractC23485o oVar) {
        HMSLog.m86966i("HiappWizard", "Enter onDoWork.");
        if (oVar instanceof C23500y) {
            oVar.mo82177b();
            if (mo82195c()) {
                return;
            }
            if (!mo82171a(false)) {
                mo82174c(8, this.f57925f);
            } else {
                mo82167a(8, this.f57925f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.f57922c;
        if (updateBean != null) {
            this.f57925f = 5;
            if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.f57927h)) {
                mo82129a(C23500y.class);
            } else if (mo82195c()) {
            } else {
                if (!mo82171a(false)) {
                    mo82174c(8, this.f57925f);
                } else {
                    mo82167a(8, this.f57925f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82194a(Intent intent) {
        List<ResolveInfo> queryIntentActivities = mo82172b().getPackageManager().queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_TV);
            arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_CAR);
            arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET);
            if (queryIntentActivities.size() != 1) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82129a(Class<? extends AbstractC23485o> cls) {
        mo82166a();
        try {
            AbstractC23485o oVar = (AbstractC23485o) cls.newInstance();
            if (!TextUtils.isEmpty(this.f57927h) && (oVar instanceof C23500y)) {
                this.f57927h = ResourceLoaderUtil.getString("hms_update_title");
                ((C23500y) oVar).mo82197a(this.f57927h);
            }
            oVar.mo82176a(this);
            this.f57923d = oVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.m86964e("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.m86966i("HiappWizard", "In onKeyUp, Call finish.");
            Activity b = mo82172b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f57925f != 5 || i != getRequestCode()) {
            return false;
        }
        if (mo82170a(this.f57926g, this.f57928i)) {
            mo82174c(0, this.f57925f);
            return true;
        }
        mo82174c(8, this.f57925f);
        return true;
    }
}
