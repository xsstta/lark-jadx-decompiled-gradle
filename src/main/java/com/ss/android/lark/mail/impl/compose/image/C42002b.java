package com.ss.android.lark.mail.impl.compose.image;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.C5627ab;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.b */
public class C42002b extends AbstractC42000a<UploadImage> {

    /* renamed from: k */
    private final String f106606k;

    /* renamed from: j */
    private void m167131j() {
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: c */
    public void mo150778c() {
    }

    /* renamed from: b */
    public String mo150996b() {
        return this.f106606k;
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: e */
    public void mo150988e() {
        m167131j();
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: f */
    public void mo150989f() {
        m167131j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public UploadImage mo150779d() {
        return (UploadImage) this.f106602j;
    }

    /* renamed from: a */
    public void mo150774a() {
        Log.m165389i("DocImageCopyTask", "notifyResult fail");
        this.f106595c.mo150874a(((UploadImage) this.f106602j).mo151481g(), this.f106602j, false, 0);
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
        }
        return (UploadImage) this.f106602j;
    }

    /* renamed from: a */
    public void mo150995a(String str, String str2) {
        Log.m165389i("DocImageCopyTask", "notifyResult: oldToken:" + str + ", newToken:" + str2);
        ((UploadImage) this.f106602j).mo151473c(str2);
        ((UploadImage) this.f106602j).mo151469a(100L);
        this.f106595c.mo150874a(((UploadImage) this.f106602j).mo151481g(), this.f106602j, true, 0);
    }

    public C42002b(String str, String str2, String str3, String str4, AbstractC41999i<UploadImage> iVar, int i, String str5) {
        super(iVar, null, null, str, str4);
        this.f106606k = str2;
        this.f106602j = new UploadImage();
        ((UploadImage) this.f106602j).mo151475d(str);
        ((UploadImage) this.f106602j).mo150983b(true);
        if (TextUtils.isEmpty(str5)) {
            str5 = ".png";
        } else if (!str5.startsWith(".")) {
            str5 = "." + str5;
        }
        ((UploadImage) this.f106602j).mo151472b(str + str5);
        ((UploadImage) this.f106602j).mo151468a(i);
        ((UploadImage) this.f106602j).mo150981a(this.f106601i);
    }
}
