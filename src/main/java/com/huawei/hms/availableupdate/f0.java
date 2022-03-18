package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.Serializable;

public class f0 extends AbstractC23484n implements AbstractC23474f {

    /* renamed from: j */
    public AbstractC23471e f57902j;

    /* renamed from: k */
    public C23477g f57903k;

    /* renamed from: l */
    public int f57904l = 0;

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    /* renamed from: a */
    public final boolean mo82144a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.f57922c.mo85486c())) {
            return true;
        }
        mo82166a();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    /* renamed from: a */
    public final void mo82143a(File file) {
        Activity b = mo82172b();
        if (b != null && !b.isFinishing()) {
            Uri a = m85145a(b, file);
            if (a == null) {
                HMSLog.m86964e("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
                mo82148e();
            } else if (mo82144a(b)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(a, "application/vnd.android.package-archive");
                intent.setFlags(3);
                intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                try {
                    b.startActivityForResult(intent, getRequestCode());
                } catch (ActivityNotFoundException e) {
                    HMSLog.m86964e("UpdateWizard", "In startInstaller, Failed to start package installer." + e.getMessage());
                    mo82148e();
                }
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82129a(Class<? extends AbstractC23485o> cls) {
        if (mo82144a(mo82172b())) {
            mo82166a();
            try {
                AbstractC23485o oVar = (AbstractC23485o) cls.newInstance();
                if (!TextUtils.isEmpty(this.f57927h) && (oVar instanceof C23500y)) {
                    this.f57927h = ResourceLoaderUtil.getString("hms_update_title");
                    ((C23500y) oVar).mo82197a(this.f57927h);
                }
                int i = this.f57904l;
                if (i > 0 && (oVar instanceof C23496w)) {
                    ((C23496w) oVar).mo82191a(i);
                }
                oVar.mo82176a(this);
                this.f57923d = oVar;
            } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
                HMSLog.m86964e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public void mo82150g() {
        mo82174c(13, this.f57925f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityDestroy() {
        mo82146c();
        super.onBridgeActivityDestroy();
    }

    /* renamed from: com.huawei.hms.availableupdate.f0$a */
    public static class RunnableC23475a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC23474f f57905a;

        /* renamed from: b */
        public final /* synthetic */ int f57906b;

        /* renamed from: c */
        public final /* synthetic */ C23477g f57907c;

        public void run() {
            this.f57905a.mo82118a(this.f57906b, this.f57907c);
        }

        public RunnableC23475a(AbstractC23474f fVar, int i, C23477g gVar) {
            this.f57905a = fVar;
            this.f57906b = i;
            this.f57907c = gVar;
        }
    }

    /* renamed from: c */
    public final void mo82146c() {
        AbstractC23471e eVar = this.f57902j;
        if (eVar != null) {
            eVar.mo82115a();
            this.f57902j = null;
        }
    }

    /* renamed from: e */
    public final void mo82148e() {
        if (!mo82171a(false)) {
            mo82174c(8, this.f57925f);
        } else {
            mo82167a(8, this.f57925f);
        }
    }

    /* renamed from: f */
    public final void mo82149f() {
        Activity b = mo82172b();
        if (b == null || b.isFinishing()) {
            mo82129a(c0.class);
        } else if (mo82144a(b)) {
            mo82146c();
            C23464c cVar = new C23464c(new C23469d(b));
            this.f57902j = cVar;
            cVar.mo82116a(this, this.f57903k);
        }
    }

    /* renamed from: d */
    public final void mo82147d() {
        String str;
        Activity b = mo82172b();
        if (b != null) {
            str = SystemUtils.getNetType(b.getBaseContext());
        } else {
            str = "";
        }
        HMSLog.m86966i("UpdateWizard", "current network is " + str);
        if ("WIFI".equals(str)) {
            mo82129a(C23496w.class);
            mo82149f();
            HMSLog.m86966i("UpdateWizard", "current network is wifi");
            return;
        }
        mo82129a(C23493t.class);
        HMSLog.m86966i("UpdateWizard", "current network is not wifi");
    }

    /* renamed from: com.huawei.hms.availableupdate.f0$b */
    public class C23476b implements CheckUpdateCallBack {

        /* renamed from: a */
        public final /* synthetic */ AbstractC23474f f57908a;

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent != null) {
                f0.this.mo82140a((f0) intent, (Intent) this.f57908a);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            HMSLog.m86964e("UpdateWizard", "onMarketStoreError responseCode: " + i);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            HMSLog.m86964e("UpdateWizard", "onUpdateStoreError responseCode: " + i);
        }

        public C23476b(AbstractC23474f fVar) {
            this.f57908a = fVar;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.f57922c != null) {
            this.f57925f = 6;
            if (mo82144a(activity)) {
                if (!this.f57922c.isNeedConfirm() || TextUtils.isEmpty(this.f57927h)) {
                    mo82129a(C23488q.class);
                    mo82141a(this);
                    return;
                }
                mo82129a(C23500y.class);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: b */
    public void mo82145b(AbstractC23485o oVar) {
        HMSLog.m86966i("UpdateWizard", "Enter onDoWork.");
        if (oVar instanceof C23500y) {
            oVar.mo82177b();
            mo82129a(C23488q.class);
            mo82141a(this);
        } else if (oVar instanceof C23495v) {
            oVar.mo82177b();
            mo82150g();
        } else if (oVar instanceof C23494u) {
            mo82129a(C23496w.class);
            mo82149f();
        } else if (oVar instanceof C23493t) {
            mo82129a(C23496w.class);
            mo82149f();
        } else if (oVar instanceof b0) {
            mo82148e();
        } else if (oVar instanceof c0) {
            mo82148e();
        } else if (oVar instanceof d0) {
            mo82148e();
        }
    }

    /* renamed from: a */
    public final void mo82141a(AbstractC23474f fVar) {
        if (fVar != null) {
            Activity b = mo82172b();
            if (b == null || b.isFinishing()) {
                m85147a(fVar, 1201, (C23477g) null);
            } else if (mo82144a(b)) {
                UpdateSdkAPI.checkTargetAppUpdate(b, this.f57922c.mo85485b(), new C23476b(fVar));
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23484n
    /* renamed from: a */
    public void mo82142a(AbstractC23485o oVar) {
        HMSLog.m86966i("UpdateWizard", "Enter onCancel.");
        if (oVar instanceof C23500y) {
            mo82150g();
        } else if (oVar instanceof C23488q) {
            mo82146c();
            mo82150g();
        } else if (oVar instanceof C23496w) {
            mo82146c();
            mo82129a(C23495v.class);
        } else if (oVar instanceof C23495v) {
            mo82129a(C23496w.class);
            mo82149f();
        } else if (oVar instanceof C23494u) {
            mo82150g();
        } else if (oVar instanceof C23493t) {
            mo82150g();
        } else {
            mo82148e();
        }
    }

    /* renamed from: a */
    public static Uri m85145a(Context context, File file) {
        boolean z;
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String str = packageName + UpdateProvider.AUTHORITIES_SUFFIX;
        if (Build.VERSION.SDK_INT <= 23 || (context.getApplicationInfo().targetSdkVersion <= 23 && !packageManagerHelper.hasProvider(packageName, str))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return UpdateProvider.getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.availableupdate.AbstractC23484n
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.m86966i("UpdateWizard", "In onKeyUp, Call finish.");
            Activity b = mo82172b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23474f
    /* renamed from: a */
    public void mo82118a(int i, C23477g gVar) {
        HMSLog.m86966i("UpdateWizard", "Enter onCheckUpdate, status: " + C23478h.m85163a(i));
        if (i != 1000) {
            switch (i) {
                case 1201:
                case 1202:
                case 1203:
                    mo82129a(b0.class);
                    return;
                default:
                    mo82129a(b0.class);
                    return;
            }
        } else {
            this.f57903k = gVar;
            mo82147d();
        }
    }

    /* renamed from: a */
    public final void mo82140a(Intent intent, AbstractC23474f fVar) {
        try {
            int intExtra = intent.getIntExtra(UpdateKey.STATUS, -99);
            HMSLog.m86966i("UpdateWizard", "CheckUpdateCallBack status is " + intExtra);
            String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.m86964e("UpdateWizard", "checkTargetAppUpdate reason is " + stringExtra);
            }
            if (intExtra == 7) {
                Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                if (serializableExtra instanceof ApkUpgradeInfo) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                    String package_ = apkUpgradeInfo.getPackage_();
                    int versionCode_ = apkUpgradeInfo.getVersionCode_();
                    String downurl_ = apkUpgradeInfo.getDownurl_();
                    int size_ = apkUpgradeInfo.getSize_();
                    String sha256_ = apkUpgradeInfo.getSha256_();
                    if (TextUtils.isEmpty(package_) || !package_.equals(this.f57922c.mo85485b())) {
                        m85147a(fVar, 1201, (C23477g) null);
                    } else if (versionCode_ < this.f57922c.mo85486c()) {
                        HMSLog.m86964e("UpdateWizard", "CheckUpdateCallBack versionCode is " + versionCode_ + "bean.getClientVersionCode() is " + this.f57922c.mo85486c());
                        m85147a(fVar, 1203, (C23477g) null);
                    } else if (TextUtils.isEmpty(downurl_) || TextUtils.isEmpty(sha256_)) {
                        m85147a(fVar, 1201, (C23477g) null);
                    } else {
                        m85147a(fVar, 1000, new C23477g(package_, versionCode_, downurl_, size_, sha256_));
                    }
                }
            } else if (intExtra == 3) {
                m85147a(fVar, 1202, (C23477g) null);
            } else {
                m85147a(fVar, 1201, (C23477g) null);
            }
        } catch (Exception e) {
            HMSLog.m86964e("UpdateWizard", "intent has some error" + e.getMessage());
            m85147a(fVar, 1201, (C23477g) null);
        }
    }

    /* renamed from: a */
    public static void m85147a(AbstractC23474f fVar, int i, C23477g gVar) {
        if (fVar != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC23475a(fVar, i, gVar));
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f57925f != 6 || i != getRequestCode()) {
            return false;
        }
        if (mo82170a(this.f57926g, this.f57928i)) {
            mo82174c(0, this.f57925f);
            return true;
        }
        mo82148e();
        return true;
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23474f
    /* renamed from: a */
    public void mo82117a(int i, int i2, int i3, File file) {
        HMSLog.m86966i("UpdateWizard", "Enter onDownloadPackage, status: " + C23478h.m85163a(i) + ", reveived: " + i2 + ", total: " + i3);
        if (i == 2000) {
            mo82166a();
            if (file == null) {
                mo82148e();
            } else if (FileUtil.verifyHash(this.f57903k.f57914e, file)) {
                mo82143a(file);
            } else {
                HMSLog.m86966i("UpdateWizard", "Hash value mismatch for download file");
            }
        } else if (i == 2100) {
            AbstractC23485o oVar = this.f57923d;
            if (oVar != null && (oVar instanceof C23496w)) {
                int i4 = 0;
                if (i2 >= 0 && i3 > 0) {
                    i4 = (int) ((((long) i2) * 100) / ((long) i3));
                }
                this.f57904l = i4;
                ((C23496w) this.f57923d).mo82192b(i4);
            }
        } else if (i != 2101) {
            switch (i) {
                case 2201:
                    mo82129a(c0.class);
                    return;
                case 2202:
                    mo82129a(C23494u.class);
                    return;
                case 2203:
                case 2204:
                    mo82129a(d0.class);
                    return;
                default:
                    return;
            }
        }
    }
}
