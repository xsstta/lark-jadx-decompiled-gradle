package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.AbstractC1917a;
import com.android.installreferrer.api.C1918b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* renamed from: com.appsflyer.internal.f */
public final class C2020f implements AbstractC1917a {

    /* renamed from: ı */
    private InstallReferrerClient f6942;

    /* renamed from: Ι */
    private AbstractC2021h f6943;

    @Override // com.android.installreferrer.api.AbstractC1917a
    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    @Override // com.android.installreferrer.api.AbstractC1917a
    public final void onInstallReferrerSetupFinished(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        C1918b bVar = null;
        if (i == 0) {
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (this.f6942.mo9717a()) {
                    bVar = this.f6942.mo9719c();
                    this.f6942.mo9718b();
                } else {
                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                    hashMap.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                AFLogger.afWarnLog(sb.toString());
                hashMap.put("err", th.getMessage());
            }
        } else if (i == 1) {
            AFLogger.afWarnLog("InstallReferrer not supported");
        } else if (i != 2) {
            AFLogger.afWarnLog("responseCode not found.");
        } else {
            AFLogger.afWarnLog("InstallReferrer not supported");
        }
        if (bVar != null) {
            try {
                if (bVar.mo9725a() != null) {
                    hashMap.put("val", bVar.mo9725a());
                }
                hashMap.put("clk", Long.toString(bVar.mo9726b()));
                hashMap.put("install", Long.toString(bVar.mo9727c()));
                try {
                    hashMap.put("instant", Boolean.valueOf(bVar.getGooglePlayInstantParam()));
                } catch (NoSuchMethodError unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
                hashMap.put("val", "-1");
                hashMap.put("clk", "-1");
                hashMap.put("install", "-1");
            }
        }
        AbstractC2021h hVar = this.f6943;
        if (hVar != null) {
            hVar.mo9989(hashMap);
        }
    }

    /* renamed from: Ι */
    public final void mo10079(Context context, AbstractC2021h hVar) {
        this.f6943 = hVar;
        try {
            InstallReferrerClient a = InstallReferrerClient.m8543a(context).mo9720a();
            this.f6942 = a;
            a.mo9716a(this);
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
