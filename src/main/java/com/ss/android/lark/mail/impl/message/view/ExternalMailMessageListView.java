package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.ChatToDraftMailAction;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import java.util.List;

public class ExternalMailMessageListView extends MailMessageListView {
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 5;
    }

    public ExternalMailMessageListView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView, com.ss.android.lark.mail.impl.message.view.MailMessageListView
    /* renamed from: b */
    public void mo154337b(C42099l lVar) {
        List<MailDraft> b = lVar.mo151979b();
        if (b == null || b.isEmpty()) {
            Log.m165389i("ExternalMailMessageList", "ExternalMailMessageListActivity empty data");
            return;
        }
        MailDraft mailDraft = b.get(0);
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107485a);
        C42699a.m170221a(this.f109706n, mailDraft, lVar.mo151988e(), (String) null, new ChatToDraftMailAction(mailDraft.mo151321a(), "im_card"));
    }

    public ExternalMailMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
