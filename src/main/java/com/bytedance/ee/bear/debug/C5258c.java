package com.bytedance.ee.bear.debug;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5468h;
import com.bytedance.ee.bear.doc.resupdate.C5483n;
import com.bytedance.ee.bear.p379f.C7659b;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.larksuite.suite.R;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.ee.bear.debug.c */
public class C5258c {

    /* renamed from: a */
    public Context f15051a;

    /* renamed from: b */
    public String f15052b;

    /* renamed from: c */
    public boolean f15053c;

    public C5258c(Context context) {
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        this.f15051a = context;
        this.f15052b = context.getString(R.string.config_gecko_channel);
        this.f15053c = aVar.getBoolean("offline_auto_download_full_res", true);
    }

    /* renamed from: b */
    private String m21509b(String str) {
        if (C5483n.m22262a(str)) {
            return str;
        }
        return String.format("1.0.1.%s", str);
    }

    /* renamed from: a */
    private String m21508a(String str) {
        if (str.contains(".")) {
            str = str.replaceAll("\\.", "_");
        }
        return String.format("http://tosv.byted.org/obj/bytedance-oss-bear-web-test/scm_zip/%s/android/%s.zip", str, this.f15052b);
    }

    /* renamed from: a */
    public void mo21201a(String str, AbstractC5468h hVar) {
        if (!TextUtils.isEmpty(str)) {
            C11678b.m48477a().scheduleDirect(new Runnable(str, hVar) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$c$XFvU5mEhR9ZSXO_P32KFbd84iw */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ AbstractC5468h f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C5258c.m269149lambda$XFvU5mEhR9ZSXO_P32KFbd84iw(C5258c.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21510b(String str, AbstractC5468h hVar) {
        String b = m21509b(str);
        String a = m21508a(str);
        C13479a.m54764b("DownloadScm", "download url: " + a);
        mo21202a(b, a, hVar);
    }

    /* renamed from: a */
    public void mo21202a(final String str, String str2, final AbstractC5468h hVar) {
        try {
            File file = new File(C5483n.m22264b(this.f15051a), "specific_temp");
            C13675f.m55498a(file);
            if (file.mkdirs()) {
                new C7659b().mo30075a(str2, new File(file, str + ".zip").getAbsolutePath(), new C5253b() {
                    /* class com.bytedance.ee.bear.debug.C5258c.C52591 */

                    @Override // com.bytedance.ee.bear.debug.C5253b, com.bytedance.ee.bear.p379f.AbstractC7658a
                    /* renamed from: a */
                    public void mo21167a() {
                        C13479a.m54764b("DownloadScm", "onStart, version: " + str);
                        AbstractC5468h hVar = hVar;
                        if (hVar != null) {
                            hVar.mo21167a();
                        }
                    }

                    @Override // com.bytedance.ee.bear.debug.C5253b, com.bytedance.ee.bear.p379f.AbstractC7658a
                    /* renamed from: a */
                    public void mo21168a(int i) {
                        AbstractC5468h hVar = hVar;
                        if (hVar != null) {
                            hVar.mo21168a(i);
                        }
                    }

                    @Override // com.bytedance.ee.bear.debug.C5253b, com.bytedance.ee.bear.p379f.AbstractC7658a
                    /* renamed from: a */
                    public void mo21170a(Exception exc) {
                        C13479a.m54759a("DownloadScm", "onDownloadError", exc);
                        try {
                            C13675f.m55498a(new File(C5483n.m22264b(C5258c.this.f15051a), "specific_temp"));
                        } catch (IOException unused) {
                            C13479a.m54759a("DownloadScm", "onDownloadError", exc);
                        }
                        AbstractC5468h hVar = hVar;
                        if (hVar != null) {
                            hVar.mo21170a(exc);
                        }
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:37:0x0103 A[Catch:{ all -> 0x00f7 }] */
                    @Override // com.bytedance.ee.bear.debug.C5253b, com.bytedance.ee.bear.p379f.AbstractC7658a
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void mo21169a(java.io.File r9) {
                        /*
                        // Method dump skipped, instructions count: 270
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.debug.C5258c.C52591.mo21169a(java.io.File):void");
                    }
                });
                return;
            }
            throw new IOException("mkdir fail");
        } catch (IOException e) {
            C13479a.m54759a("DownloadScm", "download", e);
            if (hVar != null) {
                hVar.mo21170a(e);
            }
        }
    }
}
