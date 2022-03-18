package com.ss.android.lark.chat.entity.message.p1669a;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.dependency.IStickerDependency;

/* renamed from: com.ss.android.lark.chat.entity.message.a.b */
public class C34009b extends AbstractC34011b<C34009b, C34010a> {

    /* renamed from: a */
    public final IStickerDependency.StickerFileInfo f87855a;

    /* renamed from: a */
    public static C34010a m131850a() {
        return new C34010a();
    }

    /* renamed from: com.ss.android.lark.chat.entity.message.a.b$a */
    public static final class C34010a extends AbstractC34011b.AbstractC34012a<C34009b, C34010a> {

        /* renamed from: a */
        public IStickerDependency.StickerFileInfo f87856a;

        /* renamed from: a */
        public C34009b mo125325a() {
            return new C34009b((C34010a) mo125327a(Message.Type.STICKER));
        }

        /* renamed from: a */
        public C34010a mo125324a(IStickerDependency.StickerFileInfo stickerFileInfo) {
            this.f87856a = stickerFileInfo;
            return this;
        }
    }

    protected C34009b(C34010a aVar) {
        super(aVar);
        this.f87855a = aVar.f87856a;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.STICKER);
        StickerContent stickerContent = new StickerContent();
        stickerContent.setKey(this.f87855a.key);
        stickerContent.setWidth(this.f87855a.width);
        stickerContent.setHeight(this.f87855a.height);
        stickerContent.setStickerSetId(this.f87855a.stickerSetId);
        stickerContent.setStickerId(this.f87855a.stickerId);
        b.setMessageContent(stickerContent);
        return b;
    }
}
