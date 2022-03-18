package com.ss.android.lark.corrupt;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.PushDataCorruptResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;

/* renamed from: com.ss.android.lark.corrupt.c */
public class C36241c {

    /* renamed from: a */
    private AbstractC36243b f93526a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.corrupt.c$a */
    public static class C36242a {

        /* renamed from: a */
        public static final C36241c f93527a = new C36241c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.corrupt.c$b */
    public interface AbstractC36243b {
        void onUpdate(Reason reason);
    }

    /* renamed from: a */
    public static C36241c m142725a() {
        return C36242a.f93527a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m142728b(Reason reason) {
        AbstractC36243b bVar = this.f93526a;
        if (bVar == null) {
            Log.m165383e("DataCorruptPush", "dispatch called. but listener is null.");
        } else {
            bVar.onUpdate(reason);
        }
    }

    /* renamed from: a */
    private void m142726a(Reason reason) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(reason) {
            /* class com.ss.android.lark.corrupt.$$Lambda$c$t_IGaclfPQDkx3SxksgmyiLPaK8 */
            public final /* synthetic */ Reason f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C36241c.lambda$t_IGaclfPQDkx3SxksgmyiLPaK8(C36241c.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo133686a(AbstractC36243b bVar) {
        this.f93526a = bVar;
        C53248k.m205912a().mo181697a(Command.PUSH_DATA_CORRUPT, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.corrupt.$$Lambda$c$EdanFfbm7o4VSiK2AgyP4u1HuA */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C36241c.m270512lambda$EdanFfbm7o4VSiK2AgyP4u1HuA(C36241c.this, bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m142729b(byte[] bArr, String str, boolean z, boolean z2) {
        m142727a(bArr, str, z, z2);
        Log.m165389i("DataCorruptPush", "PUSH_DATA_CORRUPT receive,");
    }

    /* renamed from: a */
    private void m142727a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushDataCorruptResponse decode = PushDataCorruptResponse.ADAPTER.decode(bArr);
            if (decode == null) {
                Log.m165383e("DataCorruptPush", "PUSH_DATA_CORRUPT receive, but response is null.");
            } else {
                m142726a(Reason.convert(decode.reason));
            }
        } catch (IOException e) {
            Log.m165386e("DataCorruptPush", e);
        }
    }
}
