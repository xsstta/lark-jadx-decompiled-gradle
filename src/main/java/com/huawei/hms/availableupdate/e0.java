package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e0 extends AbstractC23484n {

    /* renamed from: j */
    public BroadcastReceiver f57896j;

    /* renamed from: k */
    public Handler f57897k = new Handler();

    /* renamed from: l */
    public int f57898l = 0;

    /* renamed from: m */
    public Handler f57899m = new HandlerC23472a();

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2000;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    /* renamed from: com.huawei.hms.availableupdate.e0$b */
    public class RunnableC23473b implements Runnable {
        public void run() {
            e0.this.mo82134c((e0) 14);
        }

        public RunnableC23473b() {
        }

        public /* synthetic */ RunnableC23473b(e0 e0Var, HandlerC23472a aVar) {
            this();
        }
    }

    /* renamed from: e */
    public void mo82137e() {
        mo82174c(13, this.f57925f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityDestroy() {
        this.f57897k.removeCallbacksAndMessages(null);
        mo82136d();
        super.onBridgeActivityDestroy();
    }

    /* renamed from: d */
    public final void mo82136d() {
        BroadcastReceiver broadcastReceiver;
        Activity b = mo82172b();
        if (b != null && (broadcastReceiver = this.f57896j) != null) {
            b.unregisterReceiver(broadcastReceiver);
            this.f57896j = null;
        }
    }

    /* renamed from: c */
    public final void mo82133c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.progress.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.installerservice.Receiver");
        this.f57896j = new C23483m(this.f57899m);
        Activity b = mo82172b();
        if (b != null) {
            INVOKEVIRTUAL_com_huawei_hms_availableupdate_e0_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(b, this.f57896j, intentFilter);
        }
    }

    /* renamed from: com.huawei.hms.availableupdate.e0$a */
    public class HandlerC23472a extends Handler {
        public HandlerC23472a() {
        }

        public void handleMessage(Message message) {
            SafeBundle safeBundle = new SafeBundle((Bundle) message.obj);
            switch (message.what) {
                case 101:
                    e0.this.mo82128a((e0) safeBundle);
                    return;
                case 102:
                    e0.this.mo82132b((e0) safeBundle);
                    return;
                case 103:
                    e0.this.mo82135c((e0) safeBundle);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void mo82131b(int i) {
        this.f57897k.removeCallbacksAndMessages(null);
        this.f57897k.postDelayed(new RunnableC23473b(this, null), (long) i);
    }

    /* renamed from: c */
    public final void mo82134c(int i) {
        this.f57897k.removeCallbacksAndMessages(null);
        mo82136d();
        mo82166a();
        if (!mo82171a(false)) {
            mo82174c(i, this.f57925f);
        } else {
            mo82167a(i, this.f57925f);
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82129a(Class<? extends AbstractC23485o> cls) {
        try {
            AbstractC23485o oVar = (AbstractC23485o) cls.newInstance();
            int i = this.f57898l;
            if (i > 0 && (oVar instanceof C23496w)) {
                ((C23496w) oVar).mo82191a(i);
            }
            oVar.mo82176a(this);
            this.f57923d = oVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.m86964e("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.f57922c != null) {
            this.f57925f = 0;
            if (mo82130a(activity)) {
                return;
            }
            if (!mo82171a(true)) {
                mo82174c(8, this.f57925f);
            } else {
                mo82167a(8, this.f57925f);
            }
        }
    }

    /* renamed from: a */
    public final void mo82128a(SafeBundle safeBundle) {
        String str;
        if (safeBundle.containsKey("UpgradePkgName")) {
            str = safeBundle.getString("UpgradePkgName");
        } else {
            str = null;
        }
        if (str != null && str.equals(this.f57926g) && safeBundle.containsKey("downloadtask.status")) {
            int i = safeBundle.getInt("downloadtask.status");
            HMSLog.m86966i("SilentUpdateWizard", "handleDownloadStatus-status is " + i);
            if (i == 3 || i == 5 || i == 6 || i == 8) {
                mo82134c(i);
            } else if (i == 4) {
                mo82131b(CalendarSearchResultRv.f82652c);
            } else {
                mo82131b(20000);
            }
        }
    }

    /* renamed from: b */
    public final void mo82132b(SafeBundle safeBundle) {
        String str;
        if (safeBundle.containsKey("UpgradePkgName")) {
            str = safeBundle.getString("UpgradePkgName");
        } else {
            str = null;
        }
        if (str != null && str.equals(this.f57926g) && safeBundle.containsKey("UpgradeDownloadProgress") && safeBundle.containsKey("UpgradeAppName")) {
            int i = safeBundle.getInt("UpgradeDownloadProgress");
            HMSLog.m86966i("SilentUpdateWizard", "handlerDownloadProgress-progress is " + i);
            mo82131b(20000);
            if (i >= 99) {
                i = 99;
            }
            this.f57898l = i;
            if (this.f57923d == null) {
                mo82129a(C23496w.class);
            }
            AbstractC23485o oVar = this.f57923d;
            if (oVar != null) {
                ((C23496w) oVar).mo82192b(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo82135c(SafeBundle safeBundle) {
        if (safeBundle.containsKey("packagename") && safeBundle.containsKey(UpdateKey.STATUS)) {
            String string = safeBundle.getString("packagename");
            int i = safeBundle.getInt(UpdateKey.STATUS);
            HMSLog.m86966i("SilentUpdateWizard", "handlerInstallStatus-status is " + i);
            if (string != null && string.equals(this.f57926g)) {
                if (i == 2) {
                    this.f57897k.removeCallbacksAndMessages(null);
                    AbstractC23485o oVar = this.f57923d;
                    if (oVar != null) {
                        ((C23496w) oVar).mo82192b(100);
                    }
                    mo82174c(0, this.f57925f);
                } else if (i == -1 || i == -2) {
                    mo82134c(i);
                } else {
                    mo82131b(CalendarSearchResultRv.f82652c);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo82130a(Activity activity) {
        if (TextUtils.isEmpty(this.f57926g)) {
            return false;
        }
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pkgName", this.f57926g);
            jSONObject.put("versioncode", this.f57928i);
            jSONArray.put(jSONObject);
            intent.putExtra("params", jSONArray.toString());
            intent.putExtra("isHmsOrApkUpgrade", this.f57922c.mo85487d());
            intent.putExtra("buttonDlgY", ResourceLoaderUtil.getString("hms_install"));
            intent.putExtra("buttonDlgN", ResourceLoaderUtil.getString("hms_cancel"));
            intent.putExtra("upgradeDlgContent", ResourceLoaderUtil.getString("hms_update_message_new", "%P"));
            try {
                HMSLog.m86966i("SilentUpdateWizard", "start silent activity of AppMarket");
                activity.startActivityForResult(intent, getRequestCode());
                HMSLog.m86966i("SilentUpdateWizard", "start silent activity finished");
                return true;
            } catch (ActivityNotFoundException unused) {
                HMSLog.m86964e("SilentUpdateWizard", "ActivityNotFoundException");
                return false;
            }
        } catch (JSONException e) {
            HMSLog.m86964e("SilentUpdateWizard", "create hmsJsonObject fail" + e.getMessage());
            return false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_huawei_hms_availableupdate_e0_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        HMSLog.m86966i("SilentUpdateWizard", "onBridgeActivityResult requestCode is " + i + "resultCode is " + i2);
        if (i != getRequestCode()) {
            return false;
        }
        if (i2 == 0) {
            mo82133c();
            mo82131b(20000);
            return true;
        } else if (i2 == 4) {
            mo82137e();
            return true;
        } else {
            if (!mo82171a(true)) {
                mo82174c(i2, this.f57925f);
            } else {
                mo82167a(i2, this.f57925f);
            }
            return true;
        }
    }
}
