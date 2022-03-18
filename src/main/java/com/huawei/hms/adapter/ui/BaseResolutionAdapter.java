package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import java.lang.ref.WeakReference;

public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a */
    public WeakReference<Activity> f57779a;

    /* renamed from: b */
    public String f57780b = "";

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return CommonCode.StatusCode.API_CLIENT_EXPIRED;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m86966i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    /* renamed from: b */
    public final Activity mo81953b() {
        WeakReference<Activity> weakReference = this.f57779a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    public final void mo81954c() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f57780b);
        mo81952a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m86966i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f57779a = null;
    }

    /* renamed from: a */
    public final void mo81952a() {
        Activity b = mo81953b();
        if (b != null && !b.isFinishing()) {
            b.finish();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f57779a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            mo81954c();
            return;
        }
        Bundle extras = intent.getExtras();
        this.f57780b = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
        if (extras == null) {
            mo81954c();
            return;
        }
        Parcelable parcelable = extras.getParcelable(CommonCode.MapKey.HAS_RESOLUTION);
        if (parcelable == null) {
            mo81954c();
        } else if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult((Intent) parcelable, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            } catch (ActivityNotFoundException unused) {
                mo81954c();
                HMSLog.m86964e("BaseResolutionAdapter", "ActivityNotFoundException:exception");
            }
        } else if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), CommonCode.StatusCode.API_CLIENT_EXPIRED, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                mo81954c();
                HMSLog.m86964e("BaseResolutionAdapter", "SendIntentException:exception");
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m86966i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.m86966i("BaseResolutionAdapter", "onBridgeActivityResult");
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f57780b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f57780b);
        }
        mo81952a();
        return true;
    }
}
