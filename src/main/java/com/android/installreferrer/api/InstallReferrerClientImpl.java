package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.p077a.C1912a;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

class InstallReferrerClientImpl extends InstallReferrerClient {

    /* renamed from: a */
    public int f6551a;

    /* renamed from: b */
    public IGetInstallReferrerService f6552b;

    /* renamed from: c */
    private final Context f6553c;

    /* renamed from: d */
    private ServiceConnection f6554d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
    }

    /* renamed from: d */
    private boolean m8549d() {
        try {
            if (this.f6553c.getPackageManager().getPackageInfo("com.android.vending", SmActions.ACTION_ONTHECALL_EXIT).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public boolean mo9717a() {
        if (this.f6551a != 2 || this.f6552b == null || this.f6554d == null) {
            return false;
        }
        return true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public void mo9718b() {
        this.f6551a = 3;
        if (this.f6554d != null) {
            C1912a.m8541a("InstallReferrerClient", "Unbinding from service.");
            this.f6553c.unbindService(this.f6554d);
            this.f6554d = null;
        }
        this.f6552b = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: c */
    public C1918b mo9719c() throws RemoteException {
        if (mo9717a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6553c.getPackageName());
            try {
                return new C1918b(this.f6552b.getInstallReferrer(bundle));
            } catch (RemoteException e) {
                C1912a.m8542b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f6551a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f6553c = context.getApplicationContext();
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$a */
    private final class ServiceConnectionC1916a implements ServiceConnection {

        /* renamed from: b */
        private final AbstractC1917a f6556b;

        public void onServiceDisconnected(ComponentName componentName) {
            C1912a.m8542b("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f6552b = null;
            InstallReferrerClientImpl.this.f6551a = 0;
            this.f6556b.onInstallReferrerServiceDisconnected();
        }

        private ServiceConnectionC1916a(AbstractC1917a aVar) {
            if (aVar != null) {
                this.f6556b = aVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1912a.m8541a("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f6552b = IGetInstallReferrerService.Stub.asInterface(iBinder);
            InstallReferrerClientImpl.this.f6551a = 2;
            this.f6556b.onInstallReferrerSetupFinished(0);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo9716a(AbstractC1917a aVar) {
        if (mo9717a()) {
            C1912a.m8541a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            aVar.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f6551a;
        if (i == 1) {
            C1912a.m8542b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            aVar.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            C1912a.m8542b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            aVar.onInstallReferrerSetupFinished(3);
        } else {
            C1912a.m8541a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f6554d = new ServiceConnectionC1916a(aVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f6553c.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !m8549d()) {
                        C1912a.m8542b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.f6551a = 0;
                        aVar.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    if (this.f6553c.bindService(new Intent(intent), this.f6554d, 1)) {
                        C1912a.m8541a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    C1912a.m8542b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f6551a = 0;
                    aVar.onInstallReferrerSetupFinished(1);
                    return;
                }
            }
            this.f6551a = 0;
            C1912a.m8541a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            aVar.onInstallReferrerSetupFinished(2);
        }
    }
}
