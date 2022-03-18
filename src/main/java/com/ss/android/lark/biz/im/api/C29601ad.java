package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.biz.im.api.ad */
public class C29601ad extends AbstractC34011b<C29601ad, C29603a> {

    /* renamed from: a */
    public final RichText f74172a;

    /* renamed from: com.ss.android.lark.biz.im.api.ad$a */
    public static final class C29603a extends AbstractC34011b.AbstractC34012a<C29601ad, C29603a> {

        /* renamed from: a */
        public RichText f74173a;

        protected C29603a() {
        }

        /* renamed from: a */
        public C29601ad mo106660a() {
            return new C29601ad((C29603a) mo125327a(Message.Type.TEXT));
        }

        /* renamed from: a */
        public C29603a mo106659a(RichText richText) {
            this.f74173a = richText;
            return this;
        }
    }

    /* renamed from: a */
    public static C29603a m109464a() {
        return new C29603a();
    }

    private C29601ad(C29603a aVar) {
        super(aVar);
        this.f74172a = aVar.f74173a;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.TEXT);
        TextContent textContent = new TextContent();
        textContent.setRichText(this.f74172a);
        b.setMessageContent(textContent);
        return b;
    }
}
