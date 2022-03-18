package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.MailSyncEventResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43336x;

/* renamed from: com.ss.android.lark.mail.impl.service.a.i */
public class C43305i extends AbstractC43286a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_SYNC_EVENT_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        boolean z3;
        try {
            MailSyncEventResponse decode = MailSyncEventResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                if (decode.event == MailSyncEventResponse.SyncEvent.Sync) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Log.m165389i("SyncEventProcessor", "onSyncChange: " + z3);
                ((AbstractC43336x) Watchers.m167205a(AbstractC43336x.class)).mo152848a(z3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
