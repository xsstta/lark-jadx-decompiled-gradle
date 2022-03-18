package com.ss.android.lark.larkconfig.p2098a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushAllAppConfigV2Response;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.larkconfig.p2098a.p2099a.C41129a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.larkconfig.a.b */
public class C41130b {

    /* renamed from: a */
    private List<AbstractC41138e> f104904a = new ArrayList();

    /* renamed from: com.ss.android.lark.larkconfig.a.b$a */
    private static class C41131a {

        /* renamed from: a */
        static C41130b f104905a = new C41130b();
    }

    /* renamed from: a */
    public static C41130b m163208a() {
        return C41131a.f104905a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m163211b() {
        C53248k.m205912a().mo181696a(Command.PUSH_ALL_APP_CONFIG_V2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m163214c() {
        C53248k.m205912a().mo181697a(Command.PUSH_ALL_APP_CONFIG_V2, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.larkconfig.p2098a.$$Lambda$b$iUiPcVVJeIn2LJYBnuNQf4KQYk */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C41130b.this.m163213b(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo148360b(AbstractC41138e eVar) {
        C53246j.m205911b(this.f104904a, eVar, $$Lambda$b$4CbAHae799gaamLgizJwbaHE3yI.INSTANCE);
    }

    /* renamed from: a */
    public void mo148359a(AbstractC41138e eVar) {
        C53246j.m205910a(this.f104904a, eVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.larkconfig.p2098a.$$Lambda$b$ZbrxhfnVUgKrl1ncyDcEZ82v3I */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C41130b.this.m163214c();
            }
        });
    }

    /* renamed from: a */
    private void m163209a(AppConfig appConfig) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(appConfig) {
            /* class com.ss.android.lark.larkconfig.p2098a.$$Lambda$b$e8zax2gVmcpCRR_MqdTpAzfilWQ */
            public final /* synthetic */ AppConfig f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C41130b.this.m163212b((C41130b) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m163212b(AppConfig appConfig) {
        for (AbstractC41138e eVar : this.f104904a) {
            eVar.onUpdate(appConfig);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m163213b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m163209a(C41129a.m163207a(PushAllAppConfigV2Response.ADAPTER.decode(bArr).config));
        } catch (IOException e) {
            Log.m165383e("AppConfigPush", "failed to onPushFeatureConfig, e:" + e);
        }
    }
}
