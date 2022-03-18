package com.ss.android.lark.chat.entity.message.p1669a;

import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;

/* renamed from: com.ss.android.lark.chat.entity.message.a.a */
public class C34007a extends AbstractC34011b<C34007a, C34008a> {

    /* renamed from: a */
    public final String f87843a;

    /* renamed from: b */
    public final int f87844b;

    /* renamed from: c */
    public final AudioContent.AudioState f87845c;

    /* renamed from: d */
    public final String f87846d;

    /* renamed from: e */
    public final String f87847e;

    /* renamed from: f */
    public final String f87848f;

    /* renamed from: a */
    public static C34008a m131841a() {
        return new C34008a();
    }

    /* renamed from: com.ss.android.lark.chat.entity.message.a.a$a */
    public static final class C34008a extends AbstractC34011b.AbstractC34012a<C34007a, C34008a> {

        /* renamed from: a */
        public String f87849a;

        /* renamed from: b */
        public int f87850b;

        /* renamed from: c */
        public AudioContent.AudioState f87851c;

        /* renamed from: d */
        public String f87852d;

        /* renamed from: e */
        public String f87853e;

        /* renamed from: f */
        public String f87854f;

        /* renamed from: a */
        public C34007a mo125320a() {
            return new C34007a((C34008a) mo125327a(Message.Type.AUDIO));
        }

        /* renamed from: a */
        public C34008a mo125317a(int i) {
            this.f87850b = i;
            return this;
        }

        /* renamed from: b */
        public C34008a mo125321b(String str) {
            this.f87852d = str;
            return this;
        }

        /* renamed from: c */
        public C34008a mo125322c(String str) {
            this.f87853e = str;
            return this;
        }

        /* renamed from: d */
        public C34008a mo125323d(String str) {
            this.f87854f = str;
            return this;
        }

        /* renamed from: a */
        public C34008a mo125318a(AudioContent.AudioState audioState) {
            this.f87851c = audioState;
            return this;
        }

        /* renamed from: a */
        public C34008a mo125319a(String str) {
            this.f87849a = str;
            return this;
        }
    }

    protected C34007a(C34008a aVar) {
        super(aVar);
        this.f87843a = aVar.f87849a;
        this.f87844b = aVar.f87850b;
        this.f87845c = aVar.f87851c;
        this.f87846d = aVar.f87852d;
        this.f87847e = aVar.f87853e;
        this.f87848f = aVar.f87854f;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        boolean z;
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.AUDIO);
        AudioContent audioContent = new AudioContent();
        audioContent.setLocalFilePath(this.f87843a);
        audioContent.setDuration(this.f87844b);
        audioContent.setFileState(this.f87845c);
        audioContent.setUploadId(this.f87846d);
        audioContent.setAudioToken(this.f87847e);
        if (this.f87848f != null) {
            z = true;
        } else {
            z = false;
        }
        audioContent.setAudioWithText(z);
        String str3 = this.f87848f;
        if (str3 == null) {
            str3 = "";
        }
        audioContent.setRecognizedText(str3);
        b.setMessageContent(audioContent);
        return b;
    }
}
