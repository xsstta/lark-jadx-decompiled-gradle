package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.hms.common.PackageConstants;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.AsyncTaskC23864b;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23868c;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d;
import com.huawei.updatesdk.p1046b.p1050b.C23878a;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23888b;
import com.huawei.updatesdk.p1046b.p1055f.C23891b;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.C23907a;
import com.huawei.updatesdk.service.appmgr.bean.C23909b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.otaupdate.e */
public class AsyncTaskC23931e extends AsyncTask<Void, Void, C23869d> {

    /* renamed from: a */
    private Context f59200a;

    /* renamed from: b */
    private CheckUpdateCallBack f59201b;

    /* renamed from: c */
    private UpdateParams f59202c;

    /* renamed from: d */
    private Toast f59203d;

    /* renamed from: e */
    private boolean f59204e = false;

    /* renamed from: f */
    private List<String> f59205f = new ArrayList();

    /* renamed from: g */
    private AsyncTaskC23864b f59206g;

    /* renamed from: h */
    private String f59207h;

    public AsyncTaskC23931e(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        this.f59202c = updateParams;
        this.f59200a = context;
        this.f59201b = checkUpdateCallBack;
        C23936h.m87510g().mo85879b(updateParams.getServiceZone());
        if (TextUtils.isEmpty(C23936h.m87510g().mo85880c())) {
            C23936h.m87510g().mo85882d(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        }
        this.f59207h = C23936h.m87510g().mo85880c();
    }

    /* renamed from: a */
    private PackageInfo m87484a(Context context, String str) {
        PackageInfo a = C23891b.m87357a(str, context);
        if (a != null) {
            return a;
        }
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionName = "1.0";
        packageInfo.versionCode = 1;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.targetSdkVersion = 19;
        packageInfo.applicationInfo = applicationInfo;
        return packageInfo;
    }

    /* renamed from: a */
    private C23869d m87485a(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(m87484a(context, str));
        }
        C23907a aVar = !C23939i.m87525a(this.f59202c.getParamList()) ? new C23907a(this.f59202c.getParamList()) : C23907a.m87393a(arrayList);
        aVar.mo85675a(C23936h.m87510g().mo85884e() ? 34 : 0);
        aVar.mo85812d(0);
        if (isCancelled()) {
            Log.w("UpdateSDKCheckTask", "UpdateSDK task is canceled and return empty upgradeInfo");
            return null;
        }
        AsyncTaskC23864b bVar = new AsyncTaskC23864b(aVar, null);
        this.f59206g = bVar;
        return bVar.mo85616c();
    }

    /* renamed from: a */
    private void m87486a() {
        Toast toast = this.f59203d;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* renamed from: a */
    private void m87487a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("app_update_parm", apkUpgradeInfo);
            bundle.putBoolean("app_must_btn", this.f59202c.isMustBtnOne());
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C23834a.m87118b("UpdateSDKCheckTask", "go AppUpdateActivity error: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    private void m87488a(List<ApkUpgradeInfo> list) {
        if (!C23939i.m87525a(list)) {
            for (ApkUpgradeInfo apkUpgradeInfo : list) {
                if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                    if (apkUpgradeInfo.getDiffSize_() > 0) {
                        apkUpgradeInfo.setDiffDownUrl_(apkUpgradeInfo.getDownurl_());
                    }
                    apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
                }
            }
        }
    }

    /* renamed from: b */
    private void m87489b(C23869d dVar) {
        if (this.f59201b != null) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.STATUS, 6);
            if (dVar.mo85635a() != null) {
                intent.putExtra(UpdateKey.FAIL_CODE, dVar.mo85635a().ordinal());
            }
            intent.putExtra(UpdateKey.FAIL_REASON, dVar.mo85641c());
            intent.putExtra(UpdateKey.RESPONSE_CODE, dVar.mo85639b());
            this.f59201b.onUpdateInfo(intent);
            this.f59201b.onUpdateStoreError(dVar.mo85642d());
        }
    }

    /* renamed from: b */
    private boolean m87490b() {
        return !this.f59204e && TextUtils.isEmpty(this.f59202c.getTargetPkgName()) && C23939i.m87525a(this.f59202c.getPackageList()) && C23939i.m87525a(this.f59202c.getParamList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C23869d doInBackground(Void... voidArr) {
        C23834a.m87116a("UpdateSDKCheckTask", "CheckOtaAndUpdataTask doInBackground");
        C23888b.m87348a(this);
        C23936h.m87510g().mo85876a(this.f59200a, this.f59207h);
        C23868c.m87270c(C23845b.m87162c(this.f59200a, C23935g.m87508f(this.f59200a, C23936h.m87510g().mo85884e() ? "upsdk_apptouch_store_url" : "upsdk_store_url")));
        String targetPkgName = this.f59202c.getTargetPkgName();
        if (TextUtils.isEmpty(targetPkgName)) {
            targetPkgName = this.f59200a.getPackageName();
        }
        if (!C23939i.m87525a(this.f59202c.getPackageList())) {
            this.f59205f.addAll(this.f59202c.getPackageList());
        } else if (!TextUtils.isEmpty(targetPkgName)) {
            this.f59205f.add(targetPkgName);
        }
        C23878a.m87310c().mo85670d(C23936h.m87510g().mo85875a());
        return m87485a(this.f59200a, this.f59205f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C23869d dVar) {
        C23888b.m87347a().remove(this);
        m87486a();
        if (dVar != null) {
            int b = dVar.mo85639b();
            ArrayList<ApkUpgradeInfo> arrayList = null;
            if (dVar.mo85642d() == 0 && dVar.mo85643e() == 0) {
                C23909b bVar = (C23909b) dVar;
                arrayList = bVar.list_;
                if (!C23939i.m87525a(bVar.notRcmList_)) {
                    ApkUpgradeInfo apkUpgradeInfo = bVar.notRcmList_.get(0);
                    Log.w("UpdateSDKCheckTask", "UpdateSDK get update info is not recommend,reason: " + apkUpgradeInfo.getNotRcmReason_() + ",is same signature: " + apkUpgradeInfo.getSameS_());
                }
                m87488a(arrayList);
                if (C23939i.m87525a(arrayList) && this.f59201b != null) {
                    Intent intent = new Intent();
                    intent.putExtra(UpdateKey.STATUS, 3);
                    intent.putExtra(UpdateKey.RESPONSE_CODE, b);
                    this.f59201b.onUpdateInfo(intent);
                }
            } else {
                m87489b(dVar);
                Log.e("UpdateSDKCheckTask", "get app update msg failed,responseCode is " + dVar.mo85642d() + ",failreason: " + dVar.mo85641c());
            }
            if (!C23939i.m87525a(arrayList)) {
                ApkUpgradeInfo apkUpgradeInfo2 = arrayList.get(0);
                if (this.f59201b != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra(UpdateKey.INFO, (Serializable) apkUpgradeInfo2);
                    intent2.putParcelableArrayListExtra(UpdateKey.INFO_LIST, arrayList);
                    intent2.putExtra(UpdateKey.STATUS, 7);
                    intent2.putExtra(UpdateKey.RESPONSE_CODE, b);
                    this.f59201b.onUpdateInfo(intent2);
                }
                if (apkUpgradeInfo2 != null) {
                    Log.i("UpdateSDKCheckTask", "ApkUpgradeInfo,version = " + apkUpgradeInfo2.getVersion_() + ",versionCode = " + apkUpgradeInfo2.getVersionCode_() + ",detailId = " + apkUpgradeInfo2.getDetailId_() + ",devType = " + apkUpgradeInfo2.getDevType_() + ",packageName = " + apkUpgradeInfo2.getPackage_() + ",oldVersionCode = " + apkUpgradeInfo2.getOldVersionCode_());
                } else {
                    Log.e("UpdateSDKCheckTask", "info == null");
                }
                if (this.f59202c.isShowImmediate()) {
                    m87487a(this.f59200a, apkUpgradeInfo2);
                }
            } else if (m87490b()) {
                Context context = this.f59200a;
                Toast.makeText(context, C23935g.m87507e(context, "upsdk_update_check_no_new_version"), 0).show();
            }
        } else if (this.f59201b != null) {
            Intent intent3 = new Intent();
            intent3.putExtra(UpdateKey.STATUS, 3);
            this.f59201b.onUpdateInfo(intent3);
        }
    }

    /* renamed from: a */
    public void mo85870a(boolean z) {
        this.f59204e = z;
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        AsyncTaskC23864b bVar = this.f59206g;
        if (bVar != null) {
            bVar.mo85614b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        C23930d.m87479a().mo85866a(this.f59201b);
        if (m87490b()) {
            Context context = this.f59200a;
            Toast makeText = Toast.makeText(context, C23935g.m87507e(context, "upsdk_checking_update_prompt"), 1);
            this.f59203d = makeText;
            makeText.show();
        }
    }
}
