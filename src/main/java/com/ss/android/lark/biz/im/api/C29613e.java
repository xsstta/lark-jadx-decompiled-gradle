package com.ss.android.lark.biz.im.api;

import android.net.Uri;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;

/* renamed from: com.ss.android.lark.biz.im.api.e */
public class C29613e extends AbstractC34011b<C29613e, C29615a> {

    /* renamed from: a */
    public final String f74224a;

    /* renamed from: b */
    public String f74225b;

    /* renamed from: c */
    public final String f74226c;

    /* renamed from: d */
    public final int f74227d;

    /* renamed from: e */
    public final String f74228e;

    /* renamed from: f */
    public final long f74229f;

    /* renamed from: g */
    public final String f74230g;

    /* renamed from: h */
    public final String f74231h;

    /* renamed from: i */
    public final FileState f74232i;

    /* renamed from: j */
    public Uri f74233j;

    /* renamed from: a */
    public static C29615a m109504a() {
        return new C29615a();
    }

    /* renamed from: com.ss.android.lark.biz.im.api.e$a */
    public static final class C29615a extends AbstractC34011b.AbstractC34012a<C29613e, C29615a> {

        /* renamed from: a */
        protected String f74234a;

        /* renamed from: b */
        protected String f74235b;

        /* renamed from: c */
        protected String f74236c;

        /* renamed from: d */
        protected String f74237d;

        /* renamed from: e */
        protected long f74238e;

        /* renamed from: f */
        protected String f74239f;

        /* renamed from: g */
        protected int f74240g;

        /* renamed from: h */
        protected FileState f74241h;

        /* renamed from: i */
        protected String f74242i;

        /* renamed from: j */
        protected Uri f74243j;

        private C29615a() {
            this.f74237d = "";
            this.f74241h = FileState.UPLOADING;
        }

        /* renamed from: a */
        public C29613e mo106703a() {
            return new C29613e((C29615a) mo125327a(Message.Type.FILE));
        }

        /* renamed from: a */
        public C29615a mo106698a(int i) {
            this.f74240g = i;
            return this;
        }

        /* renamed from: b */
        public C29615a mo106704b(String str) {
            this.f74236c = str;
            return this;
        }

        /* renamed from: c */
        public C29615a mo106705c(String str) {
            this.f74237d = str;
            return this;
        }

        /* renamed from: d */
        public C29615a mo106706d(String str) {
            this.f74239f = str;
            return this;
        }

        /* renamed from: e */
        public C29615a mo106707e(String str) {
            this.f74242i = str;
            return this;
        }

        /* renamed from: a */
        public C29615a mo106699a(long j) {
            this.f74238e = j;
            return this;
        }

        /* renamed from: a */
        public C29615a mo106700a(Uri uri) {
            this.f74243j = uri;
            return this;
        }

        /* renamed from: a */
        public C29615a mo106701a(FileState fileState) {
            this.f74241h = fileState;
            return this;
        }

        /* renamed from: f */
        public C29615a mo106709g(String str) {
            return (C29615a) super.mo106709g("lan-trans:" + str);
        }

        /* renamed from: a */
        public C29615a mo106702a(String str) {
            this.f74234a = str;
            return this;
        }
    }

    protected C29613e(C29615a aVar) {
        super(aVar);
        this.f74224a = aVar.f74234a;
        this.f74225b = aVar.f74235b;
        this.f74226c = aVar.f74236c;
        this.f74228e = aVar.f74237d;
        this.f74229f = aVar.f74238e;
        this.f74230g = aVar.f74239f;
        this.f74231h = aVar.f74242i;
        this.f74227d = aVar.f74240g;
        this.f74232i = aVar.f74241h;
        this.f74233j = aVar.f74243j;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34011b
    /* renamed from: a */
    public Message mo106656a(String str, String str2) {
        String str3;
        Message b = mo125326b(str, str2);
        b.setType(Message.Type.FILE);
        b.setRootId("");
        b.setParentId("");
        FileContent fileContent = new FileContent();
        fileContent.setFilePath(this.f74224a);
        Uri uri = this.f74233j;
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = null;
        }
        fileContent.setUriString(str3);
        fileContent.setName(this.f74226c);
        fileContent.setKey(this.f74228e);
        fileContent.setMime(this.f74230g);
        fileContent.setSize(this.f74229f);
        fileContent.setSource(this.f74227d);
        fileContent.setFileState(this.f74232i);
        fileContent.setNameSpace(this.f74231h);
        b.setMessageContent(fileContent);
        return b;
    }
}
