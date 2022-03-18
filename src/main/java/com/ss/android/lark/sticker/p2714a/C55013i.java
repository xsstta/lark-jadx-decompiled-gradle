package com.ss.android.lark.sticker.p2714a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushStickersResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sticker.dto.Sticker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.sticker.a.i */
public class C55013i {

    /* renamed from: a */
    public List<AbstractC55018a> f135964a;

    /* renamed from: com.ss.android.lark.sticker.a.i$a */
    public interface AbstractC55018a {
        /* renamed from: a */
        void mo143353a(boolean z, boolean z2, List<Sticker> list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.i$b */
    public static class C55019b {

        /* renamed from: a */
        static C55013i f135972a = new C55013i();
    }

    /* renamed from: a */
    public static C55013i m213673a() {
        return C55019b.f135972a;
    }

    private C55013i() {
        this.f135964a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo187837a(AbstractC55018a aVar) {
        C53246j.m205910a(this.f135964a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55013i.C550152 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_STICKERS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.sticker.p2714a.C55013i.C550152.C550161 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C55013i.this.mo187838a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo187839b(AbstractC55018a aVar) {
        C53246j.m205911b(this.f135964a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.sticker.p2714a.C55013i.C550173 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_STICKERS);
            }
        });
    }

    /* renamed from: a */
    private void m213674a(final boolean z, final boolean z2, final List<Sticker> list) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.sticker.p2714a.C55013i.RunnableC550141 */

            public void run() {
                for (AbstractC55018a aVar : C55013i.this.f135964a) {
                    aVar.mo143353a(z, z2, list);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo187838a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            m213674a(z, z2, C55003e.m213652a(new ArrayList(PushStickersResponse.ADAPTER.decode(bArr).keys), System.nanoTime()));
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
