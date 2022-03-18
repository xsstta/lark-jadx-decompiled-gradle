package com.ss.android.lark.ai.smartreply.p1343a;

import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28619b;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.widget.linked_emojicon.base.C58503b;

/* renamed from: com.ss.android.lark.ai.smartreply.a.g */
public class C28596g extends AbstractC28589a {

    /* renamed from: b */
    private AbstractC28619b f71958b;

    /* renamed from: c */
    private Chat f71959c;

    public C28596g(AbstractC28534a aVar, AbstractC28619b bVar, Chat chat) {
        super(aVar);
        this.f71958b = bVar;
        this.f71959c = chat;
    }

    @Override // com.ss.android.lark.ai.smartreply.p1343a.AbstractC28594e
    /* renamed from: a */
    public void mo101791a(ISmartReplyInterface iSmartReplyInterface, SmartReplyItem smartReplyItem, Message message) {
        if (this.f71946a.mo101558a("smart_reply_text_action")) {
            this.f71958b.mo101782a(this.f71959c.getId(), smartReplyItem.mo101841b());
            return;
        }
        this.f71958b.mo101781a(C58503b.m226963a((CharSequence) smartReplyItem.mo101841b()));
    }
}
