package com.ss.android.lark.ai.smartreply.p1343a;

import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.message.Message;

/* renamed from: com.ss.android.lark.ai.smartreply.a.b */
public class C28590b extends AbstractC28589a {
    public C28590b(AbstractC28534a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem smartReplyItem, Message message) {
        if (smartReplyItem.mo101846g() != null && iSmartReplyInterface.mo101867a() != null) {
            this.f71946a.mo101557a(iSmartReplyInterface.mo101867a(), smartReplyItem.mo101846g().mo101849a());
        }
    }
}
