package com.ss.android.lark.sticker.p2714a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sticker.api.custom.PushCustomizedStickersRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.sticker.a.j */
public class C55020j {

    /* renamed from: a */
    public List<AbstractC55025a> f135973a;

    /* renamed from: com.ss.android.lark.sticker.a.j$a */
    public interface AbstractC55025a {
        /* renamed from: a */
        void mo143359a(PushCustomizedStickersRequest pushCustomizedStickersRequest, boolean z, boolean z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.j$b */
    public static class C55026b {

        /* renamed from: a */
        static C55020j f135981a = new C55020j();
    }

    /* renamed from: a */
    public static C55020j m213679a() {
        return C55026b.f135981a;
    }

    private C55020j() {
        this.f135973a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo187841a(AbstractC55025a aVar) {
        C53246j.m205910a(this.f135973a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55020j.C550222 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_CUSTOMIZED_STICKERS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.sticker.p2714a.C55020j.C550222.C550231 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        Log.m165379d("StickerPushV2", "receive PUSH_CUSTOMIZED_STICKERS push.");
                        C55020j.this.mo187842a(bArr, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo187843b(AbstractC55025a aVar) {
        C53246j.m205911b(this.f135973a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55020j.C550243 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_CUSTOMIZED_STICKERS);
            }
        });
    }

    /* renamed from: a */
    private void m213680a(final PushCustomizedStickersRequest pushCustomizedStickersRequest, final boolean z, final boolean z2) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.sticker.p2714a.C55020j.RunnableC550211 */

            public void run() {
                for (AbstractC55025a aVar : C55020j.this.f135973a) {
                    aVar.mo143359a(pushCustomizedStickersRequest, z, z2);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo187842a(byte[] bArr, boolean z, boolean z2) {
        try {
            m213680a(new PushCustomizedStickersRequest(com.bytedance.lark.pb.im.v1.PushCustomizedStickersRequest.ADAPTER.decode(bArr)), z, z2);
        } catch (IOException e) {
            Log.m165384e("StickerPushV2", e.getMessage(), e);
        }
    }
}
