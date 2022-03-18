package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;

/* renamed from: com.ss.android.lark.biz.im.api.ac */
public class C29599ac extends AbstractC34011b<C29599ac, C29600a> {

    /* renamed from: a */
    public final Chat f74170a;

    /* renamed from: a */
    public static C29600a m109460a() {
        return new C29600a();
    }

    /* renamed from: com.ss.android.lark.biz.im.api.ac$a */
    public static final class C29600a extends AbstractC34011b.AbstractC34012a<C29599ac, C29600a> {

        /* renamed from: a */
        public Chat f74171a;

        /* renamed from: a */
        public C29599ac mo106658a() {
            return new C29599ac((C29600a) mo125327a(Message.Type.SHARE_GROUP_CHAT));
        }

        /* renamed from: a */
        public C29600a mo106657a(Chat chat) {
            this.f74171a = chat;
            return this;
        }
    }

    protected C29599ac(C29600a aVar) {
        super(aVar);
        this.f74170a = aVar.f74171a;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.SHARE_GROUP_CHAT);
        ShareGroupChatContent shareGroupChatContent = new ShareGroupChatContent();
        shareGroupChatContent.setChat(this.f74170a);
        b.setMessageContent(shareGroupChatContent);
        return b;
    }
}
