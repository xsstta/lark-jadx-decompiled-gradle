package com.ss.android.lark.leanmode;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.device.v1.PushCleanDataResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.leanmode.dto.C41262a;
import com.ss.android.lark.leanmode.p2119a.C41240a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.leanmode.g */
public final class C41265g {

    /* renamed from: a */
    private List<AbstractC41242b> f105033a = new ArrayList();

    /* renamed from: com.ss.android.lark.leanmode.g$a */
    private static class C41266a {

        /* renamed from: a */
        static C41265g f105034a = new C41265g();
    }

    /* renamed from: a */
    public static C41265g m163589a() {
        return C41266a.f105034a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m163592b() {
        C53248k.m205912a().mo181696a(Command.PUSH_CLEAN_DATA);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m163595c() {
        C53248k.m205912a().mo181697a(Command.PUSH_CLEAN_DATA, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$g$ezIAoI8jXTsXCAns4qqISj8rzGc */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C41265g.this.m163594b(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo148654b(AbstractC41242b bVar) {
        C53246j.m205911b(this.f105033a, bVar, $$Lambda$g$sMtWHC652SkFJrf4c9lHRCybc.INSTANCE);
    }

    /* renamed from: a */
    public void mo148653a(AbstractC41242b bVar) {
        C53246j.m205910a(this.f105033a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.leanmode.$$Lambda$g$3fv7Zk0bmnNzz0oc3SKcA5PKEgQ */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C41265g.this.m163595c();
            }
        });
    }

    /* renamed from: a */
    private void m163590a(C41262a aVar) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(aVar) {
            /* class com.ss.android.lark.leanmode.$$Lambda$g$t_ydOInDjs8yrFywd3bpJRVqD0 */
            public final /* synthetic */ C41262a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C41265g.this.m163593b((C41265g) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m163593b(C41262a aVar) {
        for (AbstractC41242b bVar : this.f105033a) {
            bVar.onUpdate(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m163594b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m163590a(C41240a.m163536a(PushCleanDataResponse.ADAPTER.decode(bArr)));
        } catch (IOException e) {
            Log.m165386e("LeanModeCleanDataPush", e);
        }
    }
}
