package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import com.bytedance.lark.pb.email.client.v1.MailGetDraftItemResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2195i.C42699a;

/* renamed from: com.ss.android.lark.mail.impl.view.undo.a */
public abstract class AbstractC43975a<T> extends AbstractC43977b<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156521a(final Context context, String str) {
        MailDraft mailDraft = (MailDraft) C42107a.m168074a().mo152036c(str);
        if (mailDraft != null) {
            C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
            C42699a.m170223a(context, mailDraft, PermissionCode.fromValue(mailDraft.mo151317B()), "", "undo");
            return;
        }
        C42176e.m168344a().mo152266o(str, new AbstractC41870b<MailGetDraftItemResponse>() {
            /* class com.ss.android.lark.mail.impl.view.undo.AbstractC43975a.C439761 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void mo150435a(MailGetDraftItemResponse mailGetDraftItemResponse) {
                MailDraft a;
                if (mailGetDraftItemResponse != null && mailGetDraftItemResponse.draft != null && (a = C42130j.m168150a().mo152078a(mailGetDraftItemResponse.draft)) != null) {
                    C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
                    C42699a.m170223a(context, a, PermissionCode.fromValue(a.mo151317B()), "", "undo");
                }
            }
        });
    }

    public AbstractC43975a(T t, String str, String str2) {
        super(t, str, str2);
    }
}
