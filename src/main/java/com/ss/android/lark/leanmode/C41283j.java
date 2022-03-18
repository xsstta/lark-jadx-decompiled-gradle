package com.ss.android.lark.leanmode;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushLeanModeStatusAndAuthorityResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.leanmode.p2119a.C41241b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.leanmode.j */
public final class C41283j {

    /* renamed from: a */
    private List<AbstractC41261d> f105067a = new ArrayList();

    /* renamed from: com.ss.android.lark.leanmode.j$a */
    private static class C41284a {

        /* renamed from: a */
        static C41283j f105068a = new C41283j();
    }

    /* renamed from: a */
    public static C41283j m163674a() {
        return C41284a.f105068a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m163677b() {
        C53248k.m205912a().mo181696a(Command.PUSH_LEAN_MODE_STATUS_AND_AUTHORITY);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m163680c() {
        C53248k.m205912a().mo181697a(Command.PUSH_LEAN_MODE_STATUS_AND_AUTHORITY, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$j$5FgrWRMmafMKbniG1SDPr_HzlE */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C41283j.this.m163679b(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo148702b(AbstractC41261d dVar) {
        C53246j.m205911b(this.f105067a, dVar, $$Lambda$j$sQ_meIJOuNCnPT9rHEQPAm7whs.INSTANCE);
    }

    /* renamed from: a */
    public void mo148701a(AbstractC41261d dVar) {
        C53246j.m205910a(this.f105067a, dVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$j$gXgCpKTTTTKuL6v0fMpBivmSHI */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C41283j.this.m163680c();
            }
        });
    }

    /* renamed from: a */
    private void m163675a(LeanMode leanMode) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(leanMode) {
            /* class com.ss.android.lark.leanmode.$$Lambda$j$sVSktmSUaCtDNdwGU0Oymc22tg */
            public final /* synthetic */ LeanMode f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C41283j.this.m163678b((C41283j) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163678b(LeanMode leanMode) {
        for (AbstractC41261d dVar : this.f105067a) {
            dVar.onUpdate(leanMode);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m163679b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m163675a(C41241b.m163539a(PushLeanModeStatusAndAuthorityResponse.ADAPTER.decode(bArr)));
        } catch (IOException e) {
            Log.m165386e("LeanModePush", e);
        }
    }
}
