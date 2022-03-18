package com.ss.android.lark.mail.impl.compose.image;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.p2168g.C42150b;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.d */
public class C42005d extends AbstractC42000a<UploadImage> {

    /* renamed from: k */
    private final String f106611k;

    /* renamed from: l */
    private final String f106612l;

    /* renamed from: m */
    private final AbstractC43389a f106613m;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: a */
    public int mo150987a(long j, long j2) {
        return (int) ((((((double) j) / ((double) j2)) * 100.0d) / 2.0d) + 50.0d);
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: e */
    public void mo150988e() {
        m167147i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public UploadImage mo150779d() {
        return (UploadImage) this.f106602j;
    }

    /* renamed from: i */
    private void m167147i() {
        this.f106593a = 4;
        File file = new File(this.f106611k);
        if (!file.exists()) {
            file.mkdirs();
        }
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$d$Ftc2gd04zetJaBK4rA13Rwmrp2Q */

            public final void run() {
                C42005d.lambda$Ftc2gd04zetJaBK4rA13Rwmrp2Q(C42005d.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m167148j() {
        new C43721e((MailImage) this.f106602j).mo155843b(this.f106596d);
        mo150774a();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m167150l() {
        C41816b.m166115a().mo150158y().mo150171b(new String[]{this.f106598f});
    }

    /* renamed from: a */
    public void mo150774a() {
        File file = new File(this.f106596d);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: c */
    public void mo150778c() {
        if (this.f106602j != null) {
            ((UploadImage) this.f106602j).mo150985c(true);
        }
        if (this.f106593a != 4) {
            super.mo150778c();
        } else if (!TextUtils.isEmpty(this.f106598f)) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$d$EVTAoysro6ndeRT1nBrxrYd1Mew */

                public final void run() {
                    C42005d.lambda$EVTAoysro6ndeRT1nBrxrYd1Mew(C42005d.this);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.image.AbstractC42000a
    /* renamed from: f */
    public void mo150989f() {
        if (this.f106593a == 3) {
            File file = new File(this.f106596d);
            if (file.exists() && file.isFile()) {
                this.f106595c.mo150872a(this.f106594b, 50);
                mo150990g();
                return;
            }
        }
        this.f106595c.mo150872a(this.f106594b, 0);
        m167147i();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m167149k() {
        this.f106598f = C41816b.m166115a().mo150158y().mo150167a(this.f106612l, this.f106596d, 0, false, this.f106613m);
        Log.m165389i("DocImageUploadTask", "downloadDocImage key :" + this.f106598f + "download url:" + this.f106612l + " uuid: " + this.f106594b);
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
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$d$cS7XyHfNXxQgDD2V86LQmTI7gw8 */

                public final void run() {
                    C42005d.lambda$cS7XyHfNXxQgDD2V86LQmTI7gw8(C42005d.this);
                }
            });
        }
        return (UploadImage) this.f106602j;
    }

    public C42005d(Context context, final String str, String str2, String str3, final AbstractC41999i<UploadImage> iVar, String str4) {
        super(iVar, null, null, str, str3);
        if (context instanceof Activity) {
            this.f106611k = C42150b.m168218a().mo152115a((Activity) context);
        } else {
            this.f106611k = C42150b.m168218a().mo152117c();
        }
        this.f106612l = str2;
        if (TextUtils.isEmpty(str4)) {
            str4 = ".png";
        } else if (!str4.startsWith(".")) {
            str4 = "." + str4;
        }
        this.f106596d = this.f106611k + File.separator + "temp" + File.separator + C26320t.m95318a(str) + str4;
        this.f106613m = new AbstractC43389a() {
            /* class com.ss.android.lark.mail.impl.compose.image.C42005d.C420061 */

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean onFailed(String str, int i) {
                Log.m165389i("DocImageUploadTask", "download file fail:" + i + " key:" + str + " uuid: " + str);
                C42005d.this.f106593a = 5;
                AbstractC41999i iVar = iVar;
                if (iVar != null) {
                    iVar.mo150874a(str, C42005d.this.mo150779d(), false, 0);
                }
                C42005d.this.mo150774a();
                return false;
            }

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean updateProgress(String str, int i, long j, long j2) {
                if (i == PushDownloadCallback.Status.SUCCESS.getValue()) {
                    Log.m165389i("DocImageUploadTask", "download file updateProgress: success ,uuid :" + str);
                    C42005d.this.mo150990g();
                    return false;
                } else if (i == PushDownloadCallback.Status.FAILED.getValue()) {
                    Log.m165389i("DocImageUploadTask", "download file updateProgress: fail,uuid :" + str);
                    C42005d.this.f106593a = 5;
                    C42005d.this.mo150774a();
                    AbstractC41999i iVar = iVar;
                    if (iVar == null) {
                        return false;
                    }
                    iVar.mo150874a(str, C42005d.this.mo150779d(), false, j2);
                    return false;
                } else if (i != PushDownloadCallback.Status.INFLIGHT.getValue()) {
                    return false;
                } else {
                    int i2 = (int) (((((double) j) / ((double) j2)) * 100.0d) / 2.0d);
                    Log.m165389i("DocImageUploadTask", "download file updateProgress progress " + i2 + " uuid :" + str);
                    if (i2 < 0) {
                        Log.m165389i("DocImageUploadTask", "download file updateProgress progress error");
                        return false;
                    }
                    AbstractC41999i iVar2 = iVar;
                    if (iVar2 == null) {
                        return false;
                    }
                    iVar2.mo150872a(str, i2);
                    return false;
                }
            }
        };
        this.f106602j = new UploadImage();
        ((UploadImage) this.f106602j).mo151475d(str);
        ((UploadImage) this.f106602j).mo150983b(true);
        ((UploadImage) this.f106602j).mo150981a(this.f106601i);
    }
}
