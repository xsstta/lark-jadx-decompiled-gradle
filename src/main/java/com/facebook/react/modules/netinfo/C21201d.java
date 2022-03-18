package com.facebook.react.modules.netinfo;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.netinfo.types.CellularGeneration;
import com.facebook.react.modules.netinfo.types.ConnectionType;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.netinfo.d */
public class C21201d extends AbstractC21199b {

    /* renamed from: a */
    public Network f51681a;

    /* renamed from: b */
    public NetworkCapabilities f51682b;

    /* renamed from: c */
    private final C21203a f51683c = new C21203a();

    /* renamed from: com.facebook.react.modules.netinfo.d$a */
    private class C21203a extends ConnectivityManager.NetworkCallback {
        public void onUnavailable() {
            C21201d.this.f51681a = null;
            C21201d.this.f51682b = null;
            C21201d.this.mo72019c();
        }

        private C21203a() {
        }

        public void onLost(Network network) {
            C21201d.this.f51681a = null;
            C21201d.this.f51682b = null;
            C21201d.this.mo72019c();
        }

        public void onAvailable(Network network) {
            C21201d.this.f51681a = network;
            C21201d dVar = C21201d.this;
            dVar.f51682b = dVar.mo72025e().getNetworkCapabilities(network);
            C21201d.this.mo72019c();
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C21201d.this.f51681a = network;
            C21201d.this.f51682b = networkCapabilities;
            C21201d.this.mo72019c();
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            C21201d.this.f51681a = network;
            C21201d dVar = C21201d.this;
            dVar.f51682b = dVar.mo72025e().getNetworkCapabilities(network);
            C21201d.this.mo72019c();
        }

        public void onLosing(Network network, int i) {
            C21201d.this.f51681a = network;
            C21201d dVar = C21201d.this;
            dVar.f51682b = dVar.mo72025e().getNetworkCapabilities(network);
            C21201d.this.mo72019c();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.react.modules.netinfo.AbstractC21199b
    /* renamed from: a */
    public void mo72016a() {
        try {
            mo72025e().registerDefaultNetworkCallback(this.f51683c);
        } catch (SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.react.modules.netinfo.AbstractC21199b
    /* renamed from: b */
    public void mo72018b() {
        try {
            mo72025e().unregisterNetworkCallback(this.f51683c);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* renamed from: c */
    public void mo72019c() {
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        NetworkCapabilities networkCapabilities = this.f51682b;
        boolean z = false;
        CellularGeneration cellularGeneration = null;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                connectionType = ConnectionType.BLUETOOTH;
            } else if (this.f51682b.hasTransport(0)) {
                connectionType = ConnectionType.CELLULAR;
            } else if (this.f51682b.hasTransport(3)) {
                connectionType = ConnectionType.ETHERNET;
            } else if (this.f51682b.hasTransport(1)) {
                connectionType = ConnectionType.WIFI;
            } else if (this.f51682b.hasTransport(4)) {
                connectionType = ConnectionType.VPN;
            }
            if (this.f51682b.hasCapability(12) && this.f51682b.hasCapability(16)) {
                z = true;
            }
            if (this.f51681a != null && connectionType == ConnectionType.CELLULAR) {
                cellularGeneration = CellularGeneration.fromNetworkInfo(mo72025e().getNetworkInfo(this.f51681a));
            }
        } else {
            connectionType = ConnectionType.NONE;
        }
        mo72023a(connectionType, cellularGeneration, z);
    }

    public C21201d(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
