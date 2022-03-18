package com.ss.android.lark.biz.im.api;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.image.entity.Image;
import java.io.File;

/* renamed from: com.ss.android.lark.biz.im.api.w */
public class C29631w extends AbstractC34011b<C29631w, C29633a> {

    /* renamed from: a */
    public long f74274a;

    /* renamed from: b */
    public long f74275b;

    /* renamed from: c */
    public String f74276c;

    /* renamed from: d */
    public final File f74277d;

    /* renamed from: e */
    public File f74278e;

    /* renamed from: f */
    public final String f74279f;

    /* renamed from: g */
    public final String f74280g;

    /* renamed from: h */
    public final MediaContent.Source f74281h;

    /* renamed from: com.ss.android.lark.biz.im.api.w$a */
    public static final class C29633a extends AbstractC34011b.AbstractC34012a<C29631w, C29633a> {

        /* renamed from: a */
        protected long f74282a;

        /* renamed from: b */
        protected long f74283b;

        /* renamed from: c */
        protected String f74284c;

        /* renamed from: d */
        protected File f74285d;

        /* renamed from: e */
        protected File f74286e;

        /* renamed from: f */
        protected String f74287f;

        /* renamed from: g */
        protected String f74288g;

        /* renamed from: h */
        protected MediaContent.Source f74289h;

        private C29633a() {
            this.f74289h = MediaContent.Source.LARK;
        }

        /* renamed from: a */
        public C29631w mo106769a() {
            return new C29631w((C29633a) mo125327a(Message.Type.MEDIA));
        }

        /* renamed from: a */
        public C29633a mo106766a(long j) {
            this.f74283b = j;
            return this;
        }

        /* renamed from: b */
        public C29633a mo106770b(long j) {
            this.f74282a = j;
            return this;
        }

        /* renamed from: a */
        public C29633a mo106767a(File file) {
            this.f74285d = file;
            return this;
        }

        /* renamed from: b */
        public C29633a mo106771b(String str) {
            this.f74287f = str;
            return this;
        }

        /* renamed from: a */
        public C29633a mo106768a(String str) {
            this.f74284c = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C29633a m109564a() {
        return new C29633a();
    }

    protected C29631w(C29633a aVar) {
        super(aVar);
        String str;
        this.f74275b = aVar.f74283b;
        this.f74274a = aVar.f74282a;
        this.f74276c = aVar.f74284c;
        this.f74277d = aVar.f74285d;
        this.f74278e = aVar.f74286e;
        this.f74279f = aVar.f74287f;
        this.f74281h = aVar.f74289h;
        if (!TextUtils.isEmpty(aVar.f74288g)) {
            str = aVar.f74288g;
        } else {
            str = aVar.f74285d.getName();
        }
        this.f74280g = str;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        Message b = mo125326b(str, str2);
        MediaContent mediaContent = new MediaContent();
        Image image = new Image();
        mediaContent.setImageSet(new ImageSet(b.getcId(), image, image));
        if (!TextUtils.isEmpty(this.f74280g)) {
            str3 = this.f74280g;
        } else {
            str3 = this.f74277d.getName();
        }
        mediaContent.setName(str3);
        mediaContent.setFileState(FileState.COMPRESSING);
        mediaContent.setDuration(this.f74274a);
        mediaContent.setSource(this.f74281h);
        long j = this.f74275b;
        if (j <= 0) {
            File file = this.f74277d;
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
        }
        mediaContent.setSize(j);
        if (this.f74277d != null) {
            if (!TextUtils.isEmpty(this.f74276c)) {
                str5 = this.f74276c;
            } else {
                str5 = C26311p.m95279b(this.f74277d);
            }
            mediaContent.setMime(str5);
            mediaContent.setOriginPath(this.f74277d.getPath());
        } else {
            if (!TextUtils.isEmpty(this.f74276c)) {
                str4 = this.f74276c;
            } else {
                str4 = "";
            }
            mediaContent.setMime(str4);
            mediaContent.setOriginPath("");
        }
        mediaContent.setFilePath(mediaContent.getOriginPath());
        mediaContent.setCompressPath(this.f74279f);
        b.setMessageContent(mediaContent);
        return b;
    }
}
