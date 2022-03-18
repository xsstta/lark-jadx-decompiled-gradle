package com.ss.android.lark.leanmode;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushLeanModeSwitchFailedByAuthorityChangeResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.leanmode.i */
public final class C41268i {

    /* renamed from: a */
    private List<AbstractC41248c> f105036a = new ArrayList();

    /* renamed from: com.ss.android.lark.leanmode.i$a */
    private static class C41269a {

        /* renamed from: a */
        static C41268i f105037a = new C41268i();
    }

    /* renamed from: a */
    public static C41268i m163607a() {
        return C41269a.f105037a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m163612d() {
        C53248k.m205912a().mo181696a(Command.PUSH_LEAN_MODE_PATCH_TASK_FAILED);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m163613e() {
        C53248k.m205912a().mo181697a(Command.PUSH_LEAN_MODE_PATCH_TASK_FAILED, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$i$Lk9noH0bjAnQV_BSbSL7qSRMQw */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C41268i.this.m163610b(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    private void m163609b() {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.leanmode.$$Lambda$i$6LcdVlsuURYtZrPiSJBleiWnpzc */

            public final void run() {
                C41268i.this.m163611c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m163611c() {
        for (AbstractC41248c cVar : this.f105036a) {
            cVar.onUpdate();
        }
    }

    /* renamed from: b */
    public void mo148664b(AbstractC41248c cVar) {
        C53246j.m205911b(this.f105036a, cVar, $$Lambda$i$b5X_tssssX0mi5gpXlVmv2QDg3c.INSTANCE);
    }

    /* renamed from: a */
    public void mo148663a(AbstractC41248c cVar) {
        C53246j.m205910a(this.f105036a, cVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$i$Fq8KAXRKP867YFv8FHWxVoutV8 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C41268i.this.m163613e();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m163610b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushLeanModeSwitchFailedByAuthorityChangeResponse.ADAPTER.decode(bArr);
            m163609b();
        } catch (IOException e) {
            Log.m165386e("LeanModePatchTaskFailedPush", e);
        }
    }
}
