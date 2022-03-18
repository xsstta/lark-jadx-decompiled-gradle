package com.ss.android.lark.mail.impl.compose.image;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.f */
public class C42008f {

    /* renamed from: a */
    C42003c f106617a = new C42003c();

    /* renamed from: b */
    private boolean f106618b = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.image.multi.copy");

    /* renamed from: com.ss.android.lark.mail.impl.compose.image.f$a */
    public interface AbstractC42009a {
        void addImageUploadingTask(String str, AbstractC42000a<UploadImage> aVar);
    }

    /* renamed from: a */
    public void mo151007a(String str, String str2, String str3, AbstractC41999i<UploadImage> iVar, AbstractC42009a aVar) {
        C42007e eVar = new C42007e(str2, str, str3, iVar);
        aVar.addImageUploadingTask(str, eVar);
        eVar.mo150988e();
    }

    /* renamed from: a */
    public void mo151006a(Context context, String str, String str2, String str3, String str4, String str5, AbstractC41999i<UploadImage> iVar, AbstractC42009a aVar, int i) {
        if (!this.f106618b || TextUtils.isEmpty(str3)) {
            C42005d dVar = new C42005d(context, str, str2, str4, iVar, str5);
            aVar.addImageUploadingTask(str, dVar);
            dVar.mo150988e();
            return;
        }
        C42002b bVar = new C42002b(str, str3, str2, str4, iVar, i, str5);
        aVar.addImageUploadingTask(str, bVar);
        this.f106617a.mo150998a(bVar);
    }
}
