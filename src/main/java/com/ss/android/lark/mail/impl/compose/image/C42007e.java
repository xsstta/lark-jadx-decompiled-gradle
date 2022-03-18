package com.ss.android.lark.mail.impl.compose.image;

import com.bytedance.ee.bear.document.C5627ab;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.e */
public class C42007e extends AbstractC42000a<UploadImage> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UploadImage mo150779d() {
        return (UploadImage) this.f106602j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m167160b() {
        new C43721e((MailImage) this.f106602j).mo155843b(this.f106596d);
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: c */
    public void mo150778c() {
        if (this.f106602j != null) {
            ((UploadImage) this.f106602j).mo150985c(true);
        }
        super.mo150778c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UploadImage mo150777b(String str, long j) {
        ((UploadImage) this.f106602j).mo151473c(str);
        ((UploadImage) this.f106602j).mo151469a(j);
        File file = new File(this.f106596d);
        if (file.exists()) {
            int[] a = C5627ab.m22837a(file);
            ((UploadImage) this.f106602j).mo151468a(a[0]);
            ((UploadImage) this.f106602j).mo151471b(a[1]);
            ((UploadImage) this.f106602j).mo151472b(file.getName());
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$e$hqMSlWC7qXdcGw1jQXiJka_HlYo */

                public final void run() {
                    C42007e.lambda$hqMSlWC7qXdcGw1jQXiJka_HlYo(C42007e.this);
                }
            });
        }
        return (UploadImage) this.f106602j;
    }

    public C42007e(String str, String str2, String str3, AbstractC41999i<UploadImage> iVar) {
        super(iVar, null, str, str2, str3);
        this.f106602j = new UploadImage();
        ((UploadImage) this.f106602j).mo151475d(str2);
        ((UploadImage) this.f106602j).mo150983b(false);
        ((UploadImage) this.f106602j).mo150981a(this.f106601i);
    }
}
