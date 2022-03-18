package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.MailOutboxStateChangeResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42100n;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43325l;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mail.impl.service.a.c */
public class C43294c extends AbstractC43286a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_OUTBOX_SEND_STATE_CHANGE;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final MailOutboxStateChangeResponse decode = MailOutboxStateChangeResponse.ADAPTER.decode(bArr);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.mail.impl.service.p2215a.C43294c.RunnableC432951 */

                public void run() {
                    ((AbstractC43325l) Watchers.m167205a(AbstractC43325l.class)).onOutboxChange(new C42100n(decode.thread_id, decode.message_id, decode.delivery_state, decode.count.intValue(), decode.last_update_time.longValue()));
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
