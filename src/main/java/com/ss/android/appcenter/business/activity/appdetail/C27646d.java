package com.ss.android.appcenter.business.activity.appdetail;

import android.app.Application;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1174u;
import com.ss.android.appcenter.business.dto.AppDetailInfo;

/* renamed from: com.ss.android.appcenter.business.activity.appdetail.d */
public class C27646d extends C1150b {
    private C1174u<AppDetailInfo> mAppDetailInfoMediatorLiveData;

    public C1174u<AppDetailInfo> getAppDetailInfoMediatorLiveData() {
        return this.mAppDetailInfoMediatorLiveData;
    }

    public /* synthetic */ void lambda$new$0$d(AppDetailInfo appDetailInfo) {
        this.mAppDetailInfoMediatorLiveData.mo5926a(appDetailInfo);
    }

    public C27646d(Application application) {
        super(application);
        C1174u<AppDetailInfo> uVar = new C1174u<>();
        this.mAppDetailInfoMediatorLiveData = uVar;
        uVar.mo6042a(C27637b.m100906a().mo98431b(), new AbstractC1178x() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$d$DV9Ba3BveEAZytcAJH88vRGsGBw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C27646d.this.lambda$new$0$d((AppDetailInfo) obj);
            }
        });
    }

    public C1174u<AppDetailInfo> getAppDetailInfoMediatorLiveData(String str, boolean z, String str2) {
        C27637b.m100906a().mo98428a(str, z, str2);
        return this.mAppDetailInfoMediatorLiveData;
    }

    public void sendNotificationSetChangeRequest(String str, AppDetailInfo appDetailInfo, String str2, int i) {
        C27637b.m100906a().mo98429a(str, appDetailInfo, str2, i);
    }
}
