package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.image.entity.Image;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.lark.biz.im.api.v */
public class C29629v extends AbstractC34011b<C29629v, C29630a> {

    /* renamed from: a */
    public final String f74264a;

    /* renamed from: b */
    public final int f74265b;

    /* renamed from: c */
    public final int f74266c;

    /* renamed from: d */
    public final boolean f74267d;

    /* renamed from: e */
    public final boolean f74268e;

    /* renamed from: a */
    public static C29630a m109556a() {
        return new C29630a();
    }

    /* renamed from: com.ss.android.lark.biz.im.api.v$a */
    public static final class C29630a extends AbstractC34011b.AbstractC34012a<C29629v, C29630a> {

        /* renamed from: a */
        public String f74269a;

        /* renamed from: b */
        public int f74270b;

        /* renamed from: c */
        public int f74271c;

        /* renamed from: d */
        public boolean f74272d;

        /* renamed from: e */
        public boolean f74273e;

        /* renamed from: a */
        public C29629v mo106763a() {
            return new C29629v((C29630a) mo125327a(Message.Type.IMAGE));
        }

        /* renamed from: a */
        public C29630a mo106760a(int i) {
            this.f74270b = i;
            return this;
        }

        /* renamed from: b */
        public C29630a mo106764b(int i) {
            this.f74271c = i;
            return this;
        }

        /* renamed from: a */
        public C29630a mo106761a(String str) {
            this.f74269a = str;
            return this;
        }

        /* renamed from: b */
        public C29630a mo106765b(boolean z) {
            this.f74273e = z;
            return this;
        }

        /* renamed from: a */
        public C29630a mo106762a(boolean z) {
            this.f74272d = z;
            return this;
        }
    }

    protected C29629v(C29630a aVar) {
        super(aVar);
        this.f74264a = aVar.f74269a;
        this.f74265b = aVar.f74270b;
        this.f74266c = aVar.f74271c;
        this.f74267d = aVar.f74272d;
        this.f74268e = aVar.f74273e;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.IMAGE);
        Image image = new Image();
        image.setWidth(this.f74265b);
        image.setHeight(this.f74266c);
        image.setUrls(new ArrayList(Collections.singletonList(this.f74264a)));
        ImageContent imageContent = new ImageContent(new ImageSet(b.getcId(), image, image));
        imageContent.setProgress(0);
        b.setMessageContent(imageContent);
        return b;
    }
}
