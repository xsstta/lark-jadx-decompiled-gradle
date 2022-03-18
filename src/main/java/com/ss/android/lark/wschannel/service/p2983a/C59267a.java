package com.ss.android.lark.wschannel.service.p2983a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DynamicNetStatusResponse;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.wschannel.service.a.a */
class C59267a {

    /* renamed from: a */
    private static final Object f147221a = new Object();

    /* renamed from: b */
    private NetworkLevelListener.NetworkLevel f147222b;

    /* renamed from: c */
    private Map<NetworkLevelListener, Object> f147223c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.wschannel.service.a.a$a */
    public static class C59269a {

        /* renamed from: a */
        public static final C59267a f147226a = new C59267a();
    }

    /* renamed from: a */
    public static C59267a m230194a() {
        return C59269a.f147226a;
    }

    /* renamed from: b */
    public NetworkLevelListener.NetworkLevel mo201526b() {
        return this.f147222b;
    }

    private C59267a() {
        this.f147223c = new ConcurrentHashMap();
        this.f147222b = NetworkLevelListener.NetworkLevel.EXCELLENT;
    }

    /* renamed from: b */
    public void mo201527b(NetworkLevelListener networkLevelListener) {
        if (networkLevelListener != null) {
            this.f147223c.remove(networkLevelListener);
        }
    }

    /* renamed from: a */
    public void mo201523a(final Context context) {
        C53248k.m205912a().mo181697a(Command.PUSH_DYNAMIC_NET_STATUS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.wschannel.service.p2983a.C59267a.C592681 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C59267a.this.mo201524a(context, bArr, str, z, z2);
            }
        });
    }

    /* renamed from: a */
    public void mo201525a(NetworkLevelListener networkLevelListener) {
        if (networkLevelListener != null) {
            this.f147223c.put(networkLevelListener, f147221a);
        }
    }

    /* renamed from: a */
    private void m230195a(NetworkLevelListener.NetworkLevel networkLevel) {
        Log.m165389i("LarkNetworkLevelManager", "notifyNetLevel, level:" + networkLevel);
        if (this.f147222b.getValue() != networkLevel.getValue()) {
            this.f147222b = networkLevel;
            for (NetworkLevelListener networkLevelListener : this.f147223c.keySet()) {
                if (networkLevelListener != null) {
                    networkLevelListener.onNetworkLevelChanged(networkLevel);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo201524a(Context context, byte[] bArr, String str, boolean z, boolean z2) {
        try {
            NetworkLevelListener.NetworkLevel forNumber = NetworkLevelListener.NetworkLevel.forNumber(DynamicNetStatusResponse.ADAPTER.decode(bArr).net_status.getValue());
            Log.m165389i("LarkNetworkLevelManager", "onPushNetLevel, level:" + forNumber);
            m230195a(forNumber);
        } catch (IOException e) {
            e.printStackTrace();
            Log.m165383e("LarkNetworkLevelManager", "onPushNetLevel parser failed:" + e.getMessage());
        }
    }
}
