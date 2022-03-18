package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailBatchChangesEnd;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43329p;
import java.io.IOException;

/* renamed from: com.ss.android.lark.mail.impl.service.a.g */
public class C43302g extends AbstractC43286a {
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_CHANGE_ASYNC_RESULT;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            Log.m165388i("cleanAll SelectAllPushProcessor :");
            MailBatchChangesEnd decode = MailBatchChangesEnd.ADAPTER.decode(bArr);
            AbstractC43329p pVar = (AbstractC43329p) Watchers.m167205a(AbstractC43329p.class);
            String str2 = decode.session_id;
            boolean z3 = true;
            if (decode.code.intValue() != 1) {
                z3 = false;
            }
            pVar.mo153183a(str2, z3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
