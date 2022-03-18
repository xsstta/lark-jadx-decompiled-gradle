package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;

/* renamed from: com.ss.android.lark.biz.im.api.z */
public class C29634z extends AbstractC34011b<C29634z, C29636a> {

    /* renamed from: a */
    public final String f74293a;

    /* renamed from: b */
    public final String f74294b;

    /* renamed from: c */
    public final String f74295c;

    /* renamed from: com.ss.android.lark.biz.im.api.z$a */
    public static final class C29636a extends AbstractC34011b.AbstractC34012a<C29634z, C29636a> {

        /* renamed from: a */
        public String f74296a;

        /* renamed from: b */
        public String f74297b;

        /* renamed from: c */
        public String f74298c;

        protected C29636a() {
        }

        /* renamed from: a */
        public C29634z mo106780a() {
            return new C29634z((C29636a) mo125327a(Message.Type.SHARE_USER_CARD));
        }

        /* renamed from: a */
        public C29636a mo106779a(String str) {
            this.f74296a = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C29636a m109576a() {
        return new C29636a();
    }

    private C29634z(C29636a aVar) {
        super(aVar);
        this.f74293a = aVar.f74296a;
        this.f74294b = aVar.f74297b;
        this.f74295c = aVar.f74298c;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.SHARE_USER_CARD);
        ProfileContent profileContent = new ProfileContent();
        profileContent.setId(this.f74293a);
        profileContent.setAvatarKey(this.f74294b);
        profileContent.setDisplayName(this.f74295c);
        b.setMessageContent(profileContent);
        return b;
    }
}
