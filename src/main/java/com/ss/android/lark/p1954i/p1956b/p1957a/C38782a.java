package com.ss.android.lark.p1954i.p1956b.p1957a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.media.v1.PushSaveToNutStoreStateResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1954i.C38777a;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.i.b.a.a */
public class C38782a {

    /* renamed from: a */
    public List<C38777a.AbstractC38779a> f99713a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.i.b.a.a$a */
    public static class C38787a {

        /* renamed from: a */
        public static final C38782a f99720a = new C38782a();
    }

    /* renamed from: a */
    public static C38782a m153094a() {
        return C38787a.f99720a;
    }

    private C38782a() {
        this.f99713a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo142142a(C38777a.AbstractC38779a aVar) {
        C53246j.m205910a(this.f99713a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38782a.C387831 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_SAVE_TO_NUT_STORE_STATE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38782a.C387831.C387841 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38782a.this.mo142143a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo142144b(C38777a.AbstractC38779a aVar) {
        C53246j.m205911b(this.f99713a, aVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38782a.C387852 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_SAVE_TO_NUT_STORE_STATE);
            }
        });
    }

    /* renamed from: a */
    public void mo142143a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushSaveToNutStoreStateResponse decode = PushSaveToNutStoreStateResponse.ADAPTER.decode(bArr);
            final String str2 = decode.message_id;
            final int value = decode.state.getValue();
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.p1954i.p1956b.p1957a.C38782a.RunnableC387863 */

                public void run() {
                    for (C38777a.AbstractC38779a aVar : C38782a.this.f99713a) {
                        aVar.onPushSaveToNutStoreState(str2, value);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
