package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.C4975c;
import com.bytedance.ee.bear.connection.NetStateChangeReceiver;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.contract.ad */
public class C5084ad implements ConnectionService {

    /* renamed from: a */
    private Context f14799a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.contract.ad$a */
    public static class C5086a {

        /* renamed from: a */
        public static final ConnectionService f14800a = new C5084ad();
    }

    /* renamed from: d */
    public static ConnectionService m20847d() {
        return C5086a.f14800a;
    }

    private C5084ad() {
        Application application = C13615c.f35773a;
        this.f14799a = application;
        NetStateChangeReceiver.m20611a(application);
    }

    @Override // com.bytedance.ee.bear.contract.ConnectionService
    /* renamed from: b */
    public ConnectionService.NetworkState mo20038b() {
        return m20846b(C4974b.m20620a(this.f14799a));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        NetStateChangeReceiver.m20614b(this.f14799a);
        super.finalize();
    }

    @Override // com.bytedance.ee.bear.contract.ConnectionService
    /* renamed from: a */
    public LiveData<ConnectionService.NetworkState> mo20037a() {
        return C1138ae.m5354a(new C4975c(this.f14799a), new AbstractC0193a() {
            /* class com.bytedance.ee.bear.contract.$$Lambda$ad$m3S8gdi7SUNsfcEB_qL25689i1g */

            @Override // androidx.p011a.p012a.p015c.AbstractC0193a
            public final Object apply(Object obj) {
                return C5084ad.this.m20846b((NetworkType) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.ConnectionService
    /* renamed from: c */
    public String mo20039c() {
        ConnectionService.NetworkState b = mo20038b();
        if (b == null) {
            return "unknown";
        }
        if (b.mo20041b()) {
            return "online";
        }
        return "offline";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ConnectionService.NetworkState m20846b(NetworkType networkType) {
        int i = 6;
        if (networkType == NetworkType.NETWORK_2G) {
            i = 4;
        } else if (networkType == NetworkType.NETWORK_3G) {
            i = 3;
        } else if (networkType == NetworkType.NETWORK_4G) {
            i = 2;
        } else if (networkType == NetworkType.NETWORK_MOBILE) {
            i = 5;
        } else if (networkType == NetworkType.NETWORK_WIFI) {
            i = 1;
        } else if (networkType == NetworkType.NETWORK_UNKNOWN) {
            i = 0;
        } else {
            NetworkType networkType2 = NetworkType.NETWORK_NO;
        }
        return new ConnectionService.NetworkState(i);
    }
}
