package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26320t;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.p2168g.C42150b;
import com.ss.android.lark.mail.impl.p2168g.p2170b.C42154a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.e */
public class C43721e {

    /* renamed from: a */
    private final String f110950a = "ImageCidHelper";

    /* renamed from: b */
    private boolean f110951b = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile.message.list.reuse.downloaded.images");

    /* renamed from: c */
    private MailImage f110952c;

    /* renamed from: d */
    private String f110953d;

    /* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.e$a */
    public interface AbstractC43724a {
        /* renamed from: a */
        void mo155835a();

        /* renamed from: a */
        void mo155836a(String str, int i);

        /* renamed from: b */
        void mo155837b();
    }

    /* renamed from: e */
    public boolean mo155846e() {
        return this.f110951b;
    }

    /* renamed from: f */
    public MailImage mo155847f() {
        return this.f110952c;
    }

    /* renamed from: b */
    public WebResourceResponse mo155842b() {
        Log.m165389i("ImageCidHelper", "fetchResponse");
        return m173345g();
    }

    /* renamed from: d */
    public String mo155845d() {
        MailImage mailImage = this.f110952c;
        if (mailImage != null) {
            return mailImage.mo151480f();
        }
        return null;
    }

    /* renamed from: g */
    private WebResourceResponse m173345g() {
        try {
            C42154a.C42160c a = C42150b.m168218a().mo152116b().mo152120a(mo155838a());
            if (a != null) {
                return new WebResourceResponse("*/*", "utf-8", a.mo152144a(0));
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public String mo155844c() {
        if (this.f110952c == null) {
            return "";
        }
        return this.f110952c.mo151481g() + ", " + this.f110952c.mo151480f();
    }

    /* renamed from: h */
    private String m173346h() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        List<String> a = C41816b.m166115a().mo150121a(DomainSettings.Alias.DOCS_DRIVE);
        if (!CollectionUtils.isEmpty(a)) {
            sb.append(a.get(0));
        }
        sb.append("/space/api/box/stream/download/all/");
        sb.append(mo155845d());
        sb.append("?mount_node_token=");
        sb.append(C41816b.m166115a().mo150139f());
        sb.append("&mount_point=");
        sb.append("email");
        return sb.toString();
    }

    /* renamed from: a */
    public String mo155838a() {
        if (C43819s.m173689a(this.f110953d)) {
            if (!this.f110951b) {
                this.f110953d = C26320t.m95318a(this.f110952c.mo151481g() + ";" + this.f110952c.mo151480f() + ";" + this.f110952c.mo151474d());
            } else if (TextUtils.isEmpty(this.f110952c.mo151480f())) {
                this.f110953d = C26320t.m95318a(this.f110952c.mo151481g());
            } else {
                this.f110953d = C26320t.m95318a(this.f110952c.mo151480f());
            }
        }
        return this.f110953d;
    }

    /* renamed from: a */
    public void mo155839a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public C43721e(MailImage mailImage) {
        this.f110952c = mailImage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo155843b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.mo155843b(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m173344b(AbstractC43724a aVar, int i) {
        if (aVar != null) {
            try {
                C42154a b = C42150b.m168218a().mo152116b();
                if (b == null || b.mo152120a(mo155838a()) == null) {
                    int i2 = i + 1;
                    if (i2 > 10) {
                        aVar.mo155836a("saveToLruCache retry fail", -1);
                    } else {
                        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(aVar, i2) {
                            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.$$Lambda$e$QGmTsnYDgGYZRZxvRkkp6ty7E8 */
                            public final /* synthetic */ C43721e.AbstractC43724a f$1;
                            public final /* synthetic */ int f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C43721e.this.m173344b(this.f$1, this.f$2);
                            }
                        }, 100);
                    }
                } else {
                    aVar.mo155835a();
                }
            } catch (Exception e) {
                String message = e.getMessage();
                if (("saveToLruCache exception, message: " + message) == null) {
                    message = "";
                }
                aVar.mo155836a(message, -1);
            }
        }
    }

    /* renamed from: a */
    public boolean mo155841a(String str, final AbstractC43724a aVar) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        Log.m165389i("ImageCidHelper", "downloadImage");
        final String str2 = str + File.separator + "temp" + File.separator + mo155838a();
        String a = C41816b.m166115a().mo150158y().mo150167a(m173346h(), str2, 0, false, (AbstractC43389a) new AbstractC43389a() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.C437221 */

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean onFailed(String str, int i) {
                Log.m165383e("ImageCidHelper", String.format("loadImage onFailed: key: %s, errorCode: %s", str, Integer.valueOf(i)));
                C43721e.this.mo155839a(str2);
                AbstractC43724a aVar = aVar;
                if (aVar != null) {
                    aVar.mo155836a(str, i);
                }
                return false;
            }

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean updateProgress(String str, int i, long j, long j2) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable(str, i, j, j2, str2, aVar) {
                    /* class com.ss.android.lark.mail.impl.uiframework.view.webview.$$Lambda$e$1$lvTKvSLK_sRqlMsFh9EUCO8uXg */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ long f$3;
                    public final /* synthetic */ long f$4;
                    public final /* synthetic */ String f$5;
                    public final /* synthetic */ C43721e.AbstractC43724a f$6;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r6;
                        this.f$5 = r8;
                        this.f$6 = r9;
                    }

                    public final void run() {
                        C43721e.C437221.this.m173357a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                    }
                });
                return false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m173357a(String str, int i, long j, long j2, String str2, AbstractC43724a aVar) {
                Log.m165379d("ImageCidHelper", "downloadImage updateProgress: " + C43721e.this.mo155844c() + "; " + str + "," + i + "," + j + "," + j2);
                if (i == PushDownloadCallback.Status.SUCCESS.getValue()) {
                    Log.m165389i("ImageCidHelper", "downloadImage SUCCESS");
                    C43721e.this.mo155840a(str2, 0, aVar);
                } else if (i == PushDownloadCallback.Status.FAILED.getValue()) {
                    Log.m165383e("ImageCidHelper", "downloadImage FAILED");
                    C43721e.this.mo155839a(str2);
                    if (aVar != null) {
                        aVar.mo155836a(str, -10);
                    }
                } else if (i == PushDownloadCallback.Status.READY.getValue() && aVar != null) {
                    aVar.mo155837b();
                }
            }
        });
        Log.m165389i("ImageCidHelper", "downloadImage, key: " + a);
        return !"-1".equals(a);
    }

    /* renamed from: a */
    public void mo155840a(final String str, final int i, final AbstractC43724a aVar) {
        final File file = new File(str);
        if (file.exists()) {
            mo155843b(str);
            m173344b(new AbstractC43724a() {
                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.C437232 */

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: b */
                public void mo155837b() {
                }

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: a */
                public void mo155835a() {
                    Log.m165388i("loadImage saveFileToDiskLru success : " + C43721e.this.mo155838a());
                    file.delete();
                    AbstractC43724a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo155835a();
                    }
                }

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: a */
                public void mo155836a(String str, int i) {
                    Log.m165388i("loadImage saveFileToDiskLru error : " + C43721e.this.mo155838a() + "; " + i);
                    if (i <= 3) {
                        try {
                            C42150b.m168218a().mo152116b().mo152126c(C43721e.this.mo155838a());
                        } catch (IOException e) {
                            Log.m165384e("ImageCidHelper", "saveFileToDiskLru", e);
                            e.printStackTrace();
                        }
                        C43721e.this.mo155840a(str, i + 1, aVar);
                        return;
                    }
                    AbstractC43724a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo155836a(str, i);
                    }
                }
            }, 0);
        }
    }
}
