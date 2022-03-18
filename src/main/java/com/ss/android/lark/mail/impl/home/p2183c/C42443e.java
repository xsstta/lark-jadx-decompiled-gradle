package com.ss.android.lark.mail.impl.home.p2183c;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.C41814a;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.c.e */
public class C42443e extends AbstractC42440b {

    /* renamed from: a */
    private String f108047a = "";

    @Override // com.ss.android.lark.mail.impl.home.p2183c.AbstractC42442d
    /* renamed from: a */
    public void mo152733a(String str) {
        this.f108047a = str;
    }

    @Override // com.ss.android.lark.mail.impl.home.p2183c.AbstractC42440b
    /* renamed from: a */
    public String mo152735a(MailLabelEntity mailLabelEntity) {
        return C43819s.m173684a((int) R.string.Mail_ThreadList_ReadAllTip).replace("{{filterType}}", mailLabelEntity.mo151528l());
    }

    @Override // com.ss.android.lark.mail.impl.home.p2183c.AbstractC42440b
    /* renamed from: a */
    public void mo152734a(List<MailThread> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            MailThread mailThread = list.get(size);
            if (mailThread.mo151716k() && !TextUtils.equals(mailThread.mo151676a(), this.f108047a)) {
                list.remove(size);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.p2183c.AbstractC42440b
    /* renamed from: a */
    public void mo152732a(C41814a aVar) {
        if (aVar.mo150375c() == AbsChangeMailAction.OP.INSERT) {
            if (aVar.mo150374b().mo151716k()) {
                aVar.mo150373a(AbsChangeMailAction.OP.UNKNOWN);
            }
        } else if ((aVar.mo150375c() == AbsChangeMailAction.OP.UPDATE || aVar.mo150375c() == AbsChangeMailAction.OP.DELETE_AND_INSERT) && aVar.mo150374b().mo151716k() && !aVar.mo150374b().mo151676a().equals(this.f108047a)) {
            aVar.mo150373a(AbsChangeMailAction.OP.DELETE);
        }
    }
}
