package com.bytedance.ee.bear.debug.p289a;

import android.content.Context;
import android.os.Process;
import com.bytedance.ee.bear.debug.C5293e;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5468h;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.io.File;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.debug.a.a */
public class C5251a {

    /* renamed from: a */
    public volatile boolean f15014a;

    /* renamed from: b */
    public boolean f15015b;

    /* renamed from: c */
    private Context f15016c;

    /* renamed from: d */
    private C5293e f15017d;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21458b() {
        C5293e eVar = this.f15017d;
        if (eVar != null) {
            eVar.mo21279b();
            this.f15017d = null;
        }
    }

    /* renamed from: a */
    public void mo21164a() {
        C13742g.m55705a(new Runnable() {
            /* class com.bytedance.ee.bear.debug.p289a.$$Lambda$a$oaje7KQi9FHEpnbeHulPdFw0Bg */

            public final void run() {
                C5251a.m269145lambda$oaje7KQi9FHEpnbeHulPdFw0Bg(C5251a.this);
            }
        });
    }

    public C5251a(Context context) {
        this.f15016c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21459c(String str) {
        C5293e eVar = this.f15017d;
        if (eVar == null) {
            C5293e eVar2 = new C5293e(this.f15016c, str);
            this.f15017d = eVar2;
            eVar2.mo21278a(false);
            this.f15017d.mo21276a();
            return;
        }
        eVar.mo21277a(str);
    }

    /* renamed from: b */
    public void mo21166b(String str) {
        C13742g.m55705a(new Runnable(str) {
            /* class com.bytedance.ee.bear.debug.p289a.$$Lambda$a$kNvjLxStXPX397EhUmKHbIedknA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5251a.lambda$kNvjLxStXPX397EhUmKHbIedknA(C5251a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo21165a(String str) {
        if (this.f15014a) {
            C13479a.m54772d("DownloadScmPresenter", "download, isDownloading");
            return;
        }
        this.f15015b = false;
        ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21872a(this.f15016c, str, new AbstractC5468h() {
            /* class com.bytedance.ee.bear.debug.p289a.C5251a.C52521 */

            @Override // com.bytedance.ee.bear.p379f.AbstractC7658a
            /* renamed from: a */
            public void mo21167a() {
                C13479a.m54772d("DownloadScmPresenter", "onStart");
                C5251a.this.f15014a = true;
                C5251a.this.mo21166b("下载中...");
            }

            @Override // com.bytedance.ee.bear.p379f.AbstractC7658a
            /* renamed from: a */
            public void mo21168a(int i) {
                if (C5251a.this.f15015b) {
                    C5251a aVar = C5251a.this;
                    aVar.mo21166b("下载完整包..." + i + "%");
                    return;
                }
                C5251a aVar2 = C5251a.this;
                aVar2.mo21166b("下载中..." + i + "%");
            }

            @Override // com.bytedance.ee.bear.p379f.AbstractC7658a
            /* renamed from: a */
            public void mo21169a(File file) {
                C13479a.m54772d("DownloadScmPresenter", "onDownloadComplete");
                C5251a.this.f15014a = false;
                C5251a.this.mo21164a();
                Process.killProcess(Process.myPid());
            }

            @Override // com.bytedance.ee.bear.p379f.AbstractC7658a
            /* renamed from: a */
            public void mo21170a(Exception exc) {
                C13479a.m54769c("DownloadScmPresenter", "onDownloadError", exc);
                C5251a.this.f15014a = false;
                C5251a.this.mo21164a();
            }

            @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5468h
            /* renamed from: a */
            public void mo21171a(String str) {
                C13479a.m54772d("DownloadScmPresenter", "onStartDownloadFullRes, version: " + str);
                C5251a.this.f15015b = true;
                C5251a.this.mo21166b("下载完整包...");
            }
        });
    }
}
