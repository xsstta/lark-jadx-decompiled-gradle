package com.facebook.react.modules.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.netinfo.types.CellularGeneration;
import com.facebook.react.modules.netinfo.types.ConnectionType;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.facebook.react.modules.netinfo.a */
public class C21196a extends AbstractC21199b {

    /* renamed from: a */
    private final C21198a f51671a = new C21198a();

    /* renamed from: com.facebook.react.modules.netinfo.a$a */
    private class C21198a extends BroadcastReceiver {

        /* renamed from: b */
        private boolean f51673b;

        /* renamed from: a */
        public boolean mo72021a() {
            return this.f51673b;
        }

        /* renamed from: a */
        public void mo72020a(boolean z) {
            this.f51673b = z;
        }

        private C21198a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C21196a.this.mo72019c();
            }
        }
    }

    @Override // com.facebook.react.modules.netinfo.AbstractC21199b
    /* renamed from: b */
    public void mo72018b() {
        if (this.f51671a.mo72021a()) {
            mo72024d().unregisterReceiver(this.f51671a);
            this.f51671a.mo72020a(false);
        }
    }

    @Override // com.facebook.react.modules.netinfo.AbstractC21199b
    /* renamed from: a */
    public void mo72016a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m76939a(mo72024d(), this.f51671a, intentFilter);
        this.f51671a.mo72020a(true);
        mo72019c();
    }

    /* renamed from: c */
    public void mo72019c() {
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        CellularGeneration cellularGeneration = null;
        boolean z = false;
        try {
            NetworkInfo activeNetworkInfo = mo72025e().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z = activeNetworkInfo.isConnected();
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            connectionType = ConnectionType.WIFI;
                        } else if (type != 4) {
                            if (type == 9) {
                                connectionType = ConnectionType.ETHERNET;
                            } else if (type == 17) {
                                connectionType = ConnectionType.VPN;
                            } else if (type == 6) {
                                connectionType = ConnectionType.WIMAX;
                            } else if (type == 7) {
                                connectionType = ConnectionType.BLUETOOTH;
                            }
                        }
                        mo72023a(connectionType, cellularGeneration, z);
                    }
                    connectionType = ConnectionType.CELLULAR;
                    cellularGeneration = CellularGeneration.fromNetworkInfo(activeNetworkInfo);
                    mo72023a(connectionType, cellularGeneration, z);
                }
            }
            connectionType = ConnectionType.NONE;
        } catch (SecurityException unused) {
            connectionType = ConnectionType.UNKNOWN;
        }
        mo72023a(connectionType, cellularGeneration, z);
    }

    @Override // com.facebook.react.modules.netinfo.AbstractC21199b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo72017a(Promise promise) {
        super.mo72017a(promise);
    }

    public C21196a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m76939a(ReactApplicationContext reactApplicationContext, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return reactApplicationContext.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
