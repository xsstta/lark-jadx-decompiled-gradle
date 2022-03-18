package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.util.concurrent.atomic.AtomicBoolean;

public class AvailableAdapter {

    /* renamed from: d */
    public static AtomicBoolean f57769d = new AtomicBoolean(false);

    /* renamed from: e */
    public static int f57770e = 0;

    /* renamed from: a */
    public final int f57771a;

    /* renamed from: b */
    public AvailableCallBack f57772b;

    /* renamed from: c */
    public SystemObserver f57773c = new C23438a();

    public interface AvailableCallBack {
        void onComplete(int i);
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: a */
    public final AvailableCallBack mo81900a() {
        return this.f57772b;
    }

    /* renamed from: com.huawei.hms.adapter.AvailableAdapter$a */
    public class C23438a implements SystemObserver {
        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        public C23438a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.mo81900a();
            if (a == null) {
                HMSLog.m86964e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            a.onComplete(i);
            int unused = AvailableAdapter.f57770e = i;
            HMSLog.m86966i("AvailableAdapter", "user response " + AvailableAdapter.f57770e);
            AvailableAdapter.f57769d.set(false);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.f57771a = i;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        if (Build.VERSION.SDK_INT < 16) {
            HMSLog.m86966i("AvailableAdapter", "HMS can not be supported under android 4.1");
            return 21;
        }
        HMSPackageManager instance = HMSPackageManager.getInstance(context);
        PackageManagerHelper.PackageStates hMSPackageStates = instance.getHMSPackageStates();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStates)) {
            HMSLog.m86966i("AvailableAdapter", "HMS is not installed");
            return 1;
        } else if (PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStates)) {
            HMSLog.m86966i("AvailableAdapter", "HMS is disabled");
            return 3;
        } else if (!instance.isApkUpdateNecessary(this.f57771a)) {
            return 0;
        } else {
            HMSLog.m86966i("AvailableAdapter", "The current version does not meet the minimum version requirements");
            return 2;
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        boolean z;
        int i = 0;
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() >= 40000000) {
            HMSLog.m86966i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
            z = true;
        } else {
            z = false;
        }
        if (f57769d.compareAndSet(false, true)) {
            HMSLog.m86966i("AvailableAdapter", "Start to resolution for the 1st time.");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            HMSLog.m86966i("AvailableAdapter", "main thread invokes resolution.");
        } else {
            HMSLog.m86966i("AvailableAdapter", "Another thread start to resolution.");
            while (f57769d.get()) {
                if (i >= 300) {
                    HMSLog.m86966i("AvailableAdapter", "Previous popup is not handled by user or download has not finished within 1min.");
                    if (availableCallBack != null) {
                        availableCallBack.onComplete(27);
                        return;
                    }
                    return;
                }
                try {
                    HMSLog.m86961d("AvailableAdapter", "Concurrent startResolution thread is waiting.");
                    Thread.sleep(200);
                    i++;
                } catch (InterruptedException unused) {
                    HMSLog.m86961d("AvailableAdapter", "Concurrent startResolution thread waiting is interrupted.");
                }
            }
            HMSLog.m86966i("AvailableAdapter", "Concurrent startResolution thread waiting finished.");
            if (availableCallBack != null) {
                availableCallBack.onComplete(f57770e);
                return;
            }
            return;
        }
        HMSLog.m86966i("AvailableAdapter", "startResolution");
        if (activity != null && availableCallBack != null) {
            this.f57772b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f57773c);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f57771a);
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, z);
            activity.startActivity(intentStartBridgeActivity);
        }
    }
}
