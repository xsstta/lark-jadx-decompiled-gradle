package com.ss.android.lark.dto.p1816e;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;

/* renamed from: com.ss.android.lark.dto.e.a */
public class C36872a extends AbstractC34011b<C36872a, C36873a> {

    /* renamed from: a */
    public final CardContent f94795a;

    /* renamed from: com.ss.android.lark.dto.e.a$a */
    public static final class C36873a extends AbstractC34011b.AbstractC34012a<C36872a, C36873a> {

        /* renamed from: a */
        public CardContent f94796a;

        protected C36873a() {
        }

        /* renamed from: a */
        public C36872a mo136115a() {
            return new C36872a((C36873a) mo125327a(Message.Type.CARD));
        }

        /* renamed from: a */
        public C36873a mo136114a(CardContent cardContent) {
            this.f94796a = cardContent;
            return this;
        }
    }

    /* renamed from: a */
    public static C36873a m145522a() {
        return new C36873a();
    }

    protected C36872a(C36873a aVar) {
        super(aVar);
        this.f94795a = aVar.f94796a;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.CARD);
        b.setMessageContent(this.f94795a);
        return b;
    }
}
