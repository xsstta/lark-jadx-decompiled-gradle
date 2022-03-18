package com.appsflyer;

import com.appsflyer.internal.C2016b;
import com.appsflyer.internal.C2027q;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C2016b.C2017d.C2018e r2 = C2016b.C2017d.C2018e.m8907(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C2016b.C2017d.C2018e eVar = new C2016b.C2017d.C2018e(currentTimeMillis, str);
            if (r2.mo10078(eVar)) {
                C2027q.C20284.m8924(getApplicationContext(), eVar.f6915);
            }
        }
    }
}
