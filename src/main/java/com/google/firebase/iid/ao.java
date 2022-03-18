package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.an;
import java.io.IOException;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
public class ao implements Runnable {

    /* renamed from: a */
    public final FirebaseInstanceId f56416a;

    /* renamed from: b */
    private final long f56417b;

    /* renamed from: c */
    private final PowerManager.WakeLock f56418c;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo79337b() {
        return this.f56416a.getApp().getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo79338c() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo79337b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.google.firebase.iid.ao$a */
    static class C22820a extends BroadcastReceiver {
        @Nullable

        /* renamed from: a */
        private ao f56419a;

        /* renamed from: a */
        public void mo79340a() {
            if (FirebaseInstanceId.isDebugLogEnabled()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            m82920a(this.f56419a.mo79337b(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public C22820a(ao aoVar) {
            this.f56419a = aoVar;
        }

        public void onReceive(Context context, Intent intent) {
            ao aoVar = this.f56419a;
            if (aoVar != null && aoVar.mo79338c()) {
                if (FirebaseInstanceId.isDebugLogEnabled()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f56419a.f56416a.enqueueTaskWithDelaySeconds(this.f56419a, 0);
                this.f56419a.mo79337b().unregisterReceiver(this);
                this.f56419a = null;
            }
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m82920a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo79336a() throws IOException {
        an.C22819a tokenWithoutTriggeringSync = this.f56416a.getTokenWithoutTriggeringSync();
        if (!this.f56416a.tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return true;
        }
        try {
            String blockingGetMasterToken = this.f56416a.blockingGetMasterToken();
            if (blockingGetMasterToken == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (tokenWithoutTriggeringSync == null || (tokenWithoutTriggeringSync != null && !blockingGetMasterToken.equals(tokenWithoutTriggeringSync.f56413a))) {
                m82916a(blockingGetMasterToken);
            }
            return true;
        } catch (IOException e) {
            if (C22839q.m82954a(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (am.m82890a().mo79323a(mo79337b())) {
            this.f56418c.acquire();
        }
        try {
            this.f56416a.setSyncScheduledOrRunning(true);
            if (!this.f56416a.isGmsCorePresent()) {
                this.f56416a.setSyncScheduledOrRunning(false);
                if (am.m82890a().mo79323a(mo79337b())) {
                    this.f56418c.release();
                }
            } else if (!am.m82890a().mo79326b(mo79337b()) || mo79338c()) {
                if (mo79336a()) {
                    this.f56416a.setSyncScheduledOrRunning(false);
                } else {
                    this.f56416a.syncWithDelaySecondsInternal(this.f56417b);
                }
                if (am.m82890a().mo79323a(mo79337b())) {
                    this.f56418c.release();
                }
            } else {
                new C22820a(this).mo79340a();
                if (am.m82890a().mo79323a(mo79337b())) {
                    this.f56418c.release();
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f56416a.setSyncScheduledOrRunning(false);
            if (am.m82890a().mo79323a(mo79337b())) {
                this.f56418c.release();
            }
        } catch (Throwable th) {
            if (am.m82890a().mo79323a(mo79337b())) {
                this.f56418c.release();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m82916a(String str) {
        String str2;
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.f56416a.getApp().getName())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(this.f56416a.getApp().getName());
                if (valueOf.length() != 0) {
                    str2 = "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    str2 = new String("Invoking onNewToken for app: ");
                }
                Log.d("FirebaseInstanceId", str2);
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            am.m82891a(mo79337b(), intent);
        }
    }

    ao(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f56416a = firebaseInstanceId;
        this.f56417b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo79337b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f56418c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
