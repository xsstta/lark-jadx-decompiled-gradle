package com.huawei.hms.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

public class ResolutionDelegate implements IBridgeActivityDelegate {
    public static final String CALLBACK_METHOD = "CALLBACK_METHOD";

    /* renamed from: a */
    private WeakReference<Activity> f57860a;

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1002;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.f57860a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }

    /* renamed from: b */
    private Activity m85083b() {
        WeakReference<Activity> weakReference = this.f57860a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    private void m85082a() {
        Activity b = m85083b();
        if (b != null && !b.isFinishing()) {
            b.finish();
        }
    }

    /* renamed from: a */
    private BusResponseCallback m85081a(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f57860a = new WeakReference<>(activity);
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            activity.startActivityForResult((Intent) extras.getParcelable(CommonCode.MapKey.HAS_RESOLUTION), 1002);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        BusResponseCallback a = m85081a(CALLBACK_METHOD);
        int isHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f57860a.get(), 30000000);
        if (i2 == -1 && isHuaweiMobileServicesAvailable == 0) {
            HMSLog.m86966i("ResolutionDelegate", "Make service available success.");
        } else {
            a.innerError(this.f57860a.get(), i2, "Make service available failed.");
        }
        m85082a();
        return true;
    }
}
