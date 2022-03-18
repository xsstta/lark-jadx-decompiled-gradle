package com.ss.android.lark.integrator.p2018e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.e.a */
public class C39400a {

    /* renamed from: a */
    public boolean f100732a;

    /* renamed from: b */
    public volatile int f100733b;

    /* renamed from: c */
    private boolean f100734c;

    /* renamed from: d */
    private PhoneStateListener f100735d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.e.a$a */
    public static final class C39403a {

        /* renamed from: a */
        public static final C39400a f100739a = new C39400a();
    }

    /* renamed from: a */
    public static C39400a m155625a() {
        return C39403a.f100739a;
    }

    /* renamed from: b */
    public int mo143244b() {
        return this.f100733b;
    }

    private C39400a() {
        this.f100733b = -1;
    }

    /* renamed from: a */
    public void mo143242a(int i) {
        this.f100733b = i;
    }

    /* renamed from: a */
    public void mo143243a(final Context context) {
        if (!this.f100734c && Build.VERSION.SDK_INT >= 24) {
            Log.m165389i("TelephonyInfoManager", "init connectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.m165389i("TelephonyInfoManager", "connectivityManager is null");
                return;
            }
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() {
                /* class com.ss.android.lark.integrator.p2018e.C39400a.C394011 */

                public void onLost(Network network) {
                    super.onLost(network);
                    C39400a.this.f100733b = -1;
                    Log.m165389i("TelephonyInfoManager", "onLost");
                }

                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    C39400a.this.f100732a = false;
                    C39400a.this.mo143245b(context);
                    Log.m165389i("TelephonyInfoManager", "onCapabilitiesChanged ==>" + networkCapabilities.toString());
                }
            });
            this.f100734c = true;
        }
    }

    /* renamed from: b */
    public void mo143245b(Context context) {
        if (Build.VERSION.SDK_INT >= 24 && !this.f100732a) {
            Log.m165389i("TelephonyInfoManager", "init TelephonyManager");
            try {
                TelephonyManager createForSubscriptionId = ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
                if (this.f100735d == null) {
                    this.f100735d = new PhoneStateListener() {
                        /* class com.ss.android.lark.integrator.p2018e.C39400a.C394022 */

                        public void onDataConnectionStateChanged(int i, int i2) {
                            C39400a.this.f100733b = i2;
                            super.onDataConnectionStateChanged(i, i2);
                        }
                    };
                }
                if (createForSubscriptionId != null) {
                    createForSubscriptionId.listen(this.f100735d, 64);
                    this.f100732a = true;
                }
                Log.m165389i("TelephonyInfoManager", "init networkUtilDelegate");
            } catch (IllegalStateException e) {
                Log.m165383e("TelephonyInfoManager", "listener register failed");
                throw e;
            }
        }
    }
}
