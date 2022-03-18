package com.ss.android.lark.biz.im.api.p1409b;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.biz.im.api.b.a */
public class C29609a extends AbstractC34011b<C29609a, C29610a> {

    /* renamed from: a */
    public final String f74214a;

    /* renamed from: b */
    public final RichText f74215b;

    /* renamed from: c */
    public final boolean f74216c;

    /* renamed from: d */
    public final boolean f74217d;

    /* renamed from: a */
    public static C29610a m109497a() {
        return new C29610a();
    }

    /* renamed from: com.ss.android.lark.biz.im.api.b.a$a */
    public static final class C29610a extends AbstractC34011b.AbstractC34012a<C29609a, C29610a> {

        /* renamed from: a */
        public String f74218a;

        /* renamed from: b */
        public RichText f74219b;

        /* renamed from: c */
        public boolean f74220c;

        /* renamed from: d */
        public boolean f74221d;

        /* renamed from: a */
        public C29609a mo106694a() {
            return new C29609a((C29610a) mo125327a(Message.Type.POST));
        }

        /* renamed from: a */
        public C29610a mo106691a(RichText richText) {
            this.f74219b = richText;
            return this;
        }

        /* renamed from: b */
        public C29610a mo106695b(boolean z) {
            this.f74221d = z;
            return this;
        }

        /* renamed from: a */
        public C29610a mo106692a(String str) {
            this.f74218a = str;
            return this;
        }

        /* renamed from: a */
        public C29610a mo106693a(boolean z) {
            this.f74220c = z;
            return this;
        }
    }

    protected C29609a(C29610a aVar) {
        super(aVar);
        this.f74214a = aVar.f74218a;
        this.f74215b = aVar.f74219b;
        this.f74216c = aVar.f74220c;
        this.f74217d = aVar.f74221d;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.POST);
        PostContent postContent = new PostContent();
        postContent.setRichText(this.f74215b);
        postContent.setGroupAnnouncement(this.f74217d);
        postContent.setTitle(this.f74214a);
        postContent.setNotified(this.f74216c);
        b.setMessageContent(postContent);
        return b;
    }
}
