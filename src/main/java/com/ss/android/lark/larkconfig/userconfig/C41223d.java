package com.ss.android.lark.larkconfig.userconfig;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetAppConfigResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;

/* renamed from: com.ss.android.lark.larkconfig.userconfig.d */
public class C41223d {

    /* renamed from: a */
    private AbstractC41226b f104997a;

    /* renamed from: com.ss.android.lark.larkconfig.userconfig.d$a */
    private static class C41225a {

        /* renamed from: a */
        public static final C41223d f104999a = new C41223d();
    }

    /* renamed from: com.ss.android.lark.larkconfig.userconfig.d$b */
    public interface AbstractC41226b {
        /* renamed from: a */
        void mo148574a(GetAppConfigResponse getAppConfigResponse);
    }

    private C41223d() {
    }

    /* renamed from: a */
    public static final C41223d m163482a() {
        return C41225a.f104999a;
    }

    /* renamed from: b */
    public void mo148573b() {
        C53248k.m205912a().mo181697a(Command.PUSH_APP_CONFIG, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.larkconfig.userconfig.C41223d.C412241 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C41223d.this.mo148572a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: a */
    public void mo148571a(AbstractC41226b bVar) {
        this.f104997a = bVar;
    }

    /* renamed from: a */
    public void mo148572a(byte[] bArr, String str, boolean z, boolean z2) {
        GetAppConfigResponse getAppConfigResponse;
        AbstractC41226b bVar;
        try {
            getAppConfigResponse = GetAppConfigResponse.ADAPTER.decode(bArr);
        } catch (IOException e) {
            Log.m165386e(e.getMessage(), e);
            getAppConfigResponse = null;
        }
        if (getAppConfigResponse != null && (bVar = this.f104997a) != null) {
            bVar.mo148574a(getAppConfigResponse);
        }
    }
}
