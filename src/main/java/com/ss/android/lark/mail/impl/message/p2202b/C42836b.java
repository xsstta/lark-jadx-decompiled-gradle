package com.ss.android.lark.mail.impl.message.p2202b;

import android.net.Uri;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.message.p2202b.C42836b;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.message.b.b */
public class C42836b {

    /* renamed from: a */
    private C42835a f109052a;

    /* renamed from: com.ss.android.lark.mail.impl.message.b.b$a */
    public interface AbstractC42838a {
        /* renamed from: a */
        void mo153763a();

        /* renamed from: b */
        void mo153764b();

        /* renamed from: c */
        void mo153765c();
    }

    /* renamed from: a */
    public String mo153760a() {
        if (C43819s.m173689a(this.f109052a.mo153756c())) {
            C42835a aVar = this.f109052a;
            aVar.mo153757c(C26320t.m95318a(aVar.mo153754b()));
        }
        String c = this.f109052a.mo153756c();
        if (c == null) {
            c = System.currentTimeMillis() + ".eml";
        }
        return Uri.encode(c);
    }

    public C42836b(C42835a aVar) {
        this.f109052a = aVar;
    }

    /* renamed from: a */
    public void mo153761a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: a */
    public boolean mo153762a(final AbstractC42838a aVar) {
        Log.m165389i("EmlHelper", "downloadEml localPath:" + this.f109052a.mo153752a() + " token:" + this.f109052a.mo153754b());
        File file = new File(this.f109052a.mo153752a());
        if (!file.exists()) {
            file.mkdirs();
        }
        Log.m165389i("EmlHelper", "downloadEml");
        final String str = this.f109052a.mo153752a() + File.separator + "temp" + File.separator + mo153760a();
        this.f109052a.mo153759d(str);
        String a = C41816b.m166115a().mo150158y().mo150168a(str, this.f109052a.mo153754b(), C41816b.m166115a().mo150139f(), "email", 0, "", new AbstractC43389a() {
            /* class com.ss.android.lark.mail.impl.message.p2202b.C42836b.C428371 */

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean onFailed(String str, int i) {
                Log.m165383e("EmlHelper", String.format("loadImage onFailed: key: %s, errorCode: %s", str, Integer.valueOf(i)));
                C42836b.this.mo153761a(str);
                AbstractC42838a aVar = aVar;
                if (aVar != null) {
                    aVar.mo153764b();
                }
                return false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m170681a(int i, AbstractC42838a aVar, String str) {
                if (i == PushDownloadCallback.Status.SUCCESS.getValue()) {
                    Log.m165389i("EmlHelper", "downloadImage SUCCESS");
                    if (aVar != null) {
                        aVar.mo153763a();
                    }
                } else if (i == PushDownloadCallback.Status.FAILED.getValue()) {
                    Log.m165383e("EmlHelper", "downloadImage FAILED");
                    C42836b.this.mo153761a(str);
                    if (aVar != null) {
                        aVar.mo153764b();
                    }
                } else if (i == PushDownloadCallback.Status.READY.getValue()) {
                    Log.m165389i("EmlHelper", "downloadImage READY");
                    if (aVar != null) {
                        aVar.mo153765c();
                    }
                }
            }

            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43389a
            public boolean updateProgress(String str, int i, long j, long j2) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable(i, aVar, str) {
                    /* class com.ss.android.lark.mail.impl.message.p2202b.$$Lambda$b$1$50DkIcqrQQpyI3Ls7bmUQcTf_U */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ C42836b.AbstractC42838a f$2;
                    public final /* synthetic */ String f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C42836b.C428371.m270774lambda$50DkIcqrQQpyI3Ls7bmUQcTf_U(C42836b.C428371.this, this.f$1, this.f$2, this.f$3);
                    }
                });
                return false;
            }
        });
        Log.m165389i("EmlHelper", "downloadImage, key: " + a);
        return !"-1".equals(a);
    }
}
