package com.ss.android.lark.chat.api.service.p1597a.p1598a.p1599a;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;

/* renamed from: com.ss.android.lark.chat.api.service.a.a.a.a */
public class C32817a extends AbstractC34011b<C32817a, C32818a> {

    /* renamed from: a */
    public final LocationContent f84249a;

    /* renamed from: b */
    public final String f84250b;

    /* renamed from: c */
    public final int f84251c;

    /* renamed from: d */
    public final int f84252d;

    /* renamed from: com.ss.android.lark.chat.api.service.a.a.a.a$a */
    public static final class C32818a extends AbstractC34011b.AbstractC34012a<C32817a, C32818a> {

        /* renamed from: a */
        public LocationContent f84253a;

        /* renamed from: b */
        public String f84254b;

        /* renamed from: c */
        public int f84255c;

        /* renamed from: d */
        public int f84256d;

        protected C32818a() {
        }

        /* renamed from: a */
        public C32817a mo121118a() {
            return new C32817a((C32818a) mo125327a(Message.Type.LOCATION));
        }

        /* renamed from: a */
        public C32818a mo121115a(int i) {
            this.f84255c = i;
            return this;
        }

        /* renamed from: b */
        public C32818a mo121119b(int i) {
            this.f84256d = i;
            return this;
        }

        /* renamed from: a */
        public C32818a mo121116a(LocationContent locationContent) {
            this.f84253a = locationContent;
            return this;
        }

        /* renamed from: a */
        public C32818a mo121117a(String str) {
            this.f84254b = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C32818a m126093a() {
        return new C32818a();
    }

    protected C32817a(C32818a aVar) {
        super(aVar);
        this.f84249a = aVar.f84253a;
        this.f84250b = aVar.f84254b;
        this.f84251c = aVar.f84255c;
        this.f84252d = aVar.f84256d;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.LOCATION);
        b.setMessageContent(this.f84249a);
        return b;
    }
}
