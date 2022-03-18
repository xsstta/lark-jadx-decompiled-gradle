package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* renamed from: com.huawei.hms.availableupdate.p */
public class C23487p extends AbstractC23484n {
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2007;
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
    public void mo82185d() {
        mo82174c(13, this.f57925f);
    }

    /* renamed from: c */
    public final boolean mo82184c() {
        Activity b = mo82172b();
        if (b == null || b.isFinishing() || TextUtils.isEmpty(this.f57926g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.f57926g);
            mo82183a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.m86964e("AppTouchWizard", "can not open AppTouch detail page");
            return false;
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82142a(AbstractC23485o oVar) {
        HMSLog.m86966i("AppTouchWizard", "Enter onCancel.");
        if (oVar instanceof C23500y) {
            mo82185d();
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: b */
    public void mo82145b(AbstractC23485o oVar) {
        HMSLog.m86966i("AppTouchWizard", "Enter onDoWork.");
        if (oVar instanceof C23500y) {
            oVar.mo82177b();
            if (!mo82184c()) {
                mo82167a(8, this.f57925f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.f57922c;
        if (updateBean != null) {
            this.f57925f = 7;
            if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.f57927h)) {
                mo82129a(C23500y.class);
            } else if (!mo82184c()) {
                mo82167a(8, this.f57925f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82183a(android.content.Intent r4) {
        /*
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.apptouch.intent.action.update_hms"
            r0.<init>(r1)
            android.app.Activity r1 = r3.mo82172b()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            java.util.List r0 = r1.queryIntentServices(r0, r2)
            if (r0 == 0) goto L_0x0039
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0039
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.packageName
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0020
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0043
            r4.setPackage(r1)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.availableupdate.C23487p.mo82183a(android.content.Intent):void");
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
            HMSLog.m86964e("AppTouchWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.m86966i("AppTouchWizard", "In onKeyUp, Call finish.");
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
        if (this.f57925f != 7 || i != getRequestCode()) {
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
