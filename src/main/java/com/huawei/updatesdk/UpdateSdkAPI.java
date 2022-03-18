package com.huawei.updatesdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23848b;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import com.huawei.updatesdk.p1046b.p1050b.C23878a;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23888b;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.AppInfoAdapter;
import com.huawei.updatesdk.service.otaupdate.AppUpdateActivity;
import com.huawei.updatesdk.service.otaupdate.AsyncTaskC23931e;
import com.huawei.updatesdk.service.otaupdate.C23930d;
import com.huawei.updatesdk.service.otaupdate.C23935g;
import com.huawei.updatesdk.service.otaupdate.C23936h;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.huawei.updatesdk.service.otaupdate.UpdateParams;
import java.util.List;
import java.util.concurrent.Executors;

public final class UpdateSdkAPI {
    public static final String TAG = "UpdateSdk";

    public static void checkAppUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, boolean z2) {
        if (context != null) {
            if (C23848b.m87195d(context)) {
                init(context);
                new AsyncTaskC23931e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).build(), checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                return;
            }
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra(UpdateKey.STATUS, 2);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
            Toast.makeText(context, C23935g.m87507e(context, "upsdk_no_available_network_prompt_toast"), 0).show();
        }
    }

    public static void checkAppUpdate(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context != null && updateParams != null && checkUpdateCallBack != null) {
            init(context);
            updateParams.resetParamList();
            checkAppUpdateForHMSKit(context, updateParams, checkUpdateCallBack);
        }
    }

    public static void checkAppUpdateByAppInfo(Context context, CheckUpdateCallBack checkUpdateCallBack, AppInfoAdapter appInfoAdapter) {
        String str;
        C23936h hVar;
        if (context != null) {
            UpdateParams.Builder builder = new UpdateParams.Builder();
            if (appInfoAdapter == null || TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
                hVar = C23936h.m87510g();
                str = null;
            } else {
                hVar = C23936h.m87510g();
                str = appInfoAdapter.getBusiness();
            }
            hVar.mo85881c(str);
            if (appInfoAdapter != null) {
                if (!TextUtils.isEmpty(appInfoAdapter.getServiceZone())) {
                    builder.setServiceZone(appInfoAdapter.getServiceZone());
                }
                setAppStorePkgName(appInfoAdapter.getAppStorePkgName());
                builder.setTargetPkgName(appInfoAdapter.getTargetPkgName()).setPackageList(appInfoAdapter.getPackageList()).setMustBtnOne(appInfoAdapter.isMustBtnOne()).setIsShowImmediate(appInfoAdapter.isShowImmediate()).setMinIntervalDay(appInfoAdapter.getMinIntervalDay());
            }
            checkAppUpdate(context, builder.build(), checkUpdateCallBack);
        }
    }

    public static void checkAppUpdateForHMSKit(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context != null && updateParams != null && checkUpdateCallBack != null) {
            init(context);
            long currentTimeMillis = System.currentTimeMillis();
            long b = C23878a.m87310c().mo85666b();
            if (updateParams.getMinIntervalDay() != 0 && Math.abs(currentTimeMillis - b) < ((long) updateParams.getMinIntervalDay()) * 86400000) {
                return;
            }
            if (C23848b.m87195d(context)) {
                C23878a.m87310c().mo85663a(currentTimeMillis);
                new AsyncTaskC23931e(context, updateParams, checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.STATUS, 2);
            checkUpdateCallBack.onUpdateInfo(intent);
        }
    }

    public static void checkClientOTAUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, int i, boolean z2) {
        if (context != null && C23848b.m87195d(context)) {
            init(context);
            long currentTimeMillis = System.currentTimeMillis();
            long b = C23878a.m87310c().mo85666b();
            if (i == 0 || Math.abs(currentTimeMillis - b) >= ((long) i) * 86400000) {
                C23878a.m87310c().mo85663a(currentTimeMillis);
                AsyncTaskC23931e eVar = new AsyncTaskC23931e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).setMinIntervalDay(i).build(), checkUpdateCallBack);
                eVar.mo85870a(true);
                eVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            }
        }
    }

    public static void checkTargetAppUpdate(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || TextUtils.isEmpty(str) || checkUpdateCallBack == null) {
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra(UpdateKey.STATUS, 1);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
        } else if (C23848b.m87195d(context)) {
            init(context);
            new AsyncTaskC23931e(context, new UpdateParams.Builder().setMustBtnOne(false).setTargetPkgName(str).build(), checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra(UpdateKey.STATUS, 2);
            checkUpdateCallBack.onUpdateInfo(intent2);
        }
    }

    private static void init(Context context) {
        C23854a.m87209a(context);
        Log.i("updatesdk", "UpdateSDK version is: 2.0.7.302 ,flavor: envrelease ,pkgName: " + context.getPackageName());
    }

    public static void releaseCallBack() {
        C23930d.m87479a().mo85866a((CheckUpdateCallBack) null);
        List<AsyncTask> a = C23888b.m87347a();
        if (!(a == null || a.isEmpty())) {
            for (AsyncTask asyncTask : a) {
                if (asyncTask != null) {
                    asyncTask.cancel(true);
                }
                Log.d(TAG, "cancel task");
            }
            a.clear();
        }
    }

    public static void setAppStorePkgName(String str) {
        C23936h.m87510g().mo85882d(str);
    }

    public static void setServiceZone(String str) {
        C23936h.m87510g().mo85879b(str);
    }

    public static void showUpdateDialog(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        StringBuilder sb;
        String str;
        if (context != null && apkUpgradeInfo != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("app_update_parm", apkUpgradeInfo);
            bundle.putBoolean("app_must_btn", z);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                sb = new StringBuilder();
                sb.append("go AppUpdateActivity error: ");
                str = e.toString();
            } catch (SecurityException e2) {
                sb = new StringBuilder();
                sb.append("go AppUpdateActivity security error: ");
                str = e2.toString();
            }
        } else {
            return;
        }
        sb.append(str);
        Log.e(TAG, sb.toString());
    }

    public static void showUpdateDialogByAppInfo(Context context, ApkUpgradeInfo apkUpgradeInfo, AppInfoAdapter appInfoAdapter) {
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName()) && !TextUtils.equals(C23936h.m87510g().mo85880c(), appInfoAdapter.getAppStorePkgName())) {
            C23936h.m87510g().mo85882d(appInfoAdapter.getAppStorePkgName());
        }
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
            C23936h.m87510g().mo85881c(appInfoAdapter.getBusiness());
        }
        showUpdateDialog(context, apkUpgradeInfo, appInfoAdapter != null && appInfoAdapter.isMustBtnOne());
    }
}
