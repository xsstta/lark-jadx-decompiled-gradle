package com.ss.android.lark.mail.impl.compose.attachment;

import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import com.ss.android.lark.mail.impl.compose.image.AbstractC42000a;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.compose.attachment.a */
public class C41936a extends AbstractC42000a<LocalAttachment> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LocalAttachment mo150779d() {
        return (LocalAttachment) this.f106602j;
    }

    /* renamed from: b */
    public long mo150776b() {
        return ((LocalAttachment) this.f106602j).mo151231h();
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: c */
    public void mo150778c() {
        if (this.f106602j != null) {
            ((LocalAttachment) this.f106602j).mo150764b(true);
        }
        super.mo150778c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LocalAttachment mo150777b(String str, long j) {
        ((LocalAttachment) this.f106602j).mo151226d(str);
        ((LocalAttachment) this.f106602j).mo151218a(j);
        if (this.f106597e != null) {
            String a = LarkUriUtil.m95300a(C41816b.m166115a().mo150132b(), this.f106597e);
            if (!TextUtils.isEmpty(a)) {
                ((LocalAttachment) this.f106602j).mo151222b(a);
            }
        } else {
            File file = new File(this.f106596d);
            if (file.exists()) {
                ((LocalAttachment) this.f106602j).mo151222b(file.getName());
            }
        }
        return (LocalAttachment) this.f106602j;
    }

    public C41936a(Uri uri, String str, String str2, String str3, LocalAttachment localAttachment, AbstractC41999i<LocalAttachment> iVar) {
        super(iVar, uri, str, str2, str3);
        this.f106602j = localAttachment;
    }
}
