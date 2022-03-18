package com.ss.android.lark.sticker.p2714a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushStickerSetsRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sticker.dto.AbstractC55075a;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.sticker.a.m */
public class C55038m {

    /* renamed from: a */
    public List<AbstractC55075a> f135994a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.m$a */
    public static class C55043a {

        /* renamed from: a */
        static C55038m f136000a = new C55038m();
    }

    /* renamed from: a */
    public static C55038m m213715a() {
        return C55043a.f136000a;
    }

    private C55038m() {
        this.f135994a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo187866a(AbstractC55075a aVar) {
        C53246j.m205910a(this.f135994a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55038m.C550391 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_STICKER_SETS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.sticker.p2714a.C55038m.C550391.C550401 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C55038m.this.mo187867a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo187868b(AbstractC55075a aVar) {
        C53246j.m205911b(this.f135994a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55038m.C550412 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_STICKER_SETS);
            }
        });
    }

    /* renamed from: a */
    private void m213716a(final PushStickerSetsResponse pushStickerSetsResponse) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.sticker.p2714a.C55038m.RunnableC550423 */

            public void run() {
                for (AbstractC55075a aVar : C55038m.this.f135994a) {
                    aVar.mo143356a(pushStickerSetsResponse);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo187867a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m213716a(new PushStickerSetsResponse(PushStickerSetsRequest.ADAPTER.decode(bArr)));
        } catch (IOException e) {
            Log.m165386e("StickerSetPush", e);
        }
    }
}
