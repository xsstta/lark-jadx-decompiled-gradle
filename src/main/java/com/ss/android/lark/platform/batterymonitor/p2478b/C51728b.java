package com.ss.android.lark.platform.batterymonitor.p2478b;

import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.platform.batterymonitor.AbstractC51718a;

/* renamed from: com.ss.android.lark.platform.batterymonitor.b.b */
public final class C51728b extends AbstractC51718a {

    /* renamed from: a */
    public int f128620a;

    /* renamed from: b */
    private AbstractC38769a f128621b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.b.b$a */
    public static class C51730a {

        /* renamed from: a */
        public static final C51728b f128623a = new C51728b();
    }

    /* renamed from: g */
    public static C51728b m200577g() {
        return C51730a.f128623a;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: b */
    public void mo177814b() {
        if (this.f128621b != null) {
            C38770b.m153078a().mo142129b(this.f128621b);
        }
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: e */
    public int mo177817e() {
        int i = !NetworkUtils.m153074g(mo177815c()) ? 1 : 0;
        this.f128620a = i;
        return i;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177812a() {
        this.f128620a = 0;
        if (this.f128621b == null) {
            this.f128621b = new AbstractC38769a() {
                /* class com.ss.android.lark.platform.batterymonitor.p2478b.C51728b.C517291 */

                @Override // com.ss.android.lark.http.netstate.AbstractC38769a
                public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                    int i;
                    C51728b bVar = C51728b.this;
                    if (networkType == NetworkUtils.NetworkType.WIFI) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    bVar.f128620a = i;
                    C51728b.this.mo177816d();
                }
            };
        }
        C38770b.m153078a().mo142127a(this.f128621b);
    }
}
