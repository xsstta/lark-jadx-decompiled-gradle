package com.ss.android.lark.ai.smartreply.p1343a;

import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.message.Message;

/* renamed from: com.ss.android.lark.ai.smartreply.a.h */
public class C28597h extends AbstractC28589a {
    public C28597h(AbstractC28534a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem smartReplyItem, Message message) {
        if (smartReplyItem.mo101848i() != null && smartReplyItem.mo101848i().f72013a != null) {
            smartReplyItem.mo101848i().f72013a.mo101869a();
        }
    }
}
