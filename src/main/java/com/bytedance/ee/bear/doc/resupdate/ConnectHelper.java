package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.C4975c;
import com.bytedance.ee.bear.connection.NetStateChangeReceiver;
import com.bytedance.ee.bear.connection.NetworkType;

public class ConnectHelper {

    /* renamed from: a */
    private Context f15508a;

    public static class NetworkState {

        /* renamed from: a */
        private final int f15509a;

        public @interface NetworkType {
        }

        /* renamed from: a */
        public int mo21811a() {
            return this.f15509a;
        }

        /* renamed from: b */
        public boolean mo21812b() {
            if (this.f15509a != 6) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "NetworkState{type=" + this.f15509a + '}';
        }

        public NetworkState(int i) {
            this.f15509a = i;
        }
    }

    /* renamed from: b */
    public NetworkState mo21810b() {
        return m22094b(C4974b.m20620a(this.f15508a));
    }

    /* renamed from: a */
    public LiveData<NetworkState> mo21809a() {
        return C1138ae.m5354a(new C4975c(this.f15508a), new AbstractC0193a() {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$ConnectHelper$dhp_HZ7J0zDBezlc51tFXJ7r8 */

            @Override // androidx.p011a.p012a.p015c.AbstractC0193a
            public final Object apply(Object obj) {
                return ConnectHelper.m269176lambda$dhp_HZ7J0zDBezlc51tFXJ7r8(ConnectHelper.this, (NetworkType) obj);
            }
        });
    }

    public ConnectHelper(Context context) {
        NetStateChangeReceiver.m20611a(context);
        this.f15508a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public NetworkState m22094b(NetworkType networkType) {
        int i = 4;
        if (networkType != NetworkType.NETWORK_2G) {
            if (networkType == NetworkType.NETWORK_3G) {
                i = 3;
            } else if (networkType == NetworkType.NETWORK_4G) {
                i = 2;
            } else if (networkType == NetworkType.NETWORK_MOBILE) {
                i = 5;
            } else if (networkType == NetworkType.NETWORK_WIFI) {
                i = 1;
            } else if (networkType != NetworkType.NETWORK_UNKNOWN) {
                NetworkType networkType2 = NetworkType.NETWORK_NO;
                i = 6;
            }
        }
        return new NetworkState(i);
    }
}
