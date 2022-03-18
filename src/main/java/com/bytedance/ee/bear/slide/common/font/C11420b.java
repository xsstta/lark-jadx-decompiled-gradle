package com.bytedance.ee.bear.slide.common.font;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.slide.common.font.C11420b;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13683i;
import com.bytedance.ee.util.p700c.C13602d;
import com.larksuite.framework.utils.C26317s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipInputStream;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.slide.common.font.b */
public class C11420b {

    /* renamed from: a */
    public C11430h f30702a;

    /* renamed from: b */
    public AbstractC11422a f30703b;

    /* renamed from: c */
    public final Handler f30704c;

    /* renamed from: d */
    private String f30705d;

    /* renamed from: e */
    private C11419a f30706e;

    /* renamed from: f */
    private final LinkedList<C11419a> f30707f = new LinkedList<>();

    /* renamed from: g */
    private String f30708g;

    /* renamed from: h */
    private String f30709h;

    /* renamed from: com.bytedance.ee.bear.slide.common.font.b$a */
    public interface AbstractC11422a {
        /* renamed from: a */
        void mo43761a();

        /* renamed from: a */
        void mo43762a(long j, C11419a aVar);

        /* renamed from: a */
        void mo43763a(C11419a aVar);

        /* renamed from: a */
        void mo43764a(String str, List<C11419a> list);

        /* renamed from: b */
        void mo43765b();
    }

    /* renamed from: b */
    public boolean mo43758b() {
        if (this.f30706e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m47451c() {
        AbstractC11422a aVar = this.f30703b;
        if (aVar != null) {
            aVar.mo43765b();
        }
        if (!mo43758b()) {
            mo43754a();
        }
    }

    /* renamed from: d */
    private void m47454d() {
        if (!TextUtils.isEmpty(this.f30705d)) {
            BearExecutors.m48467b().execute(new Runnable(this.f30705d) {
                /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$I3sqWxMqwYIrM6Z8ZrDBvl5Z0Q */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C11420b.m269982lambda$I3sqWxMqwYIrM6Z8ZrDBvl5Z0Q(this.f$0);
                }
            });
        }
    }

    /* renamed from: e */
    private void m47455e() {
        if (mo43758b()) {
            m47454d();
            this.f30707f.addFirst(this.f30706e);
        }
    }

    /* renamed from: f */
    private void m47457f() {
        this.f30706e = null;
        this.f30705d = null;
        AbstractC11422a aVar = this.f30703b;
        if (aVar != null) {
            aVar.mo43761a();
        }
        this.f30702a.mo43804f();
    }

    /* renamed from: g */
    private void m47458g() {
        File file = new File(this.f30708g);
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isFile()) {
            file.delete();
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo43754a() {
        if (C26317s.m95316a(this.f30707f)) {
            m47457f();
            return;
        }
        this.f30702a.mo43802d();
        final C11419a removeFirst = this.f30707f.removeFirst();
        String e = removeFirst.mo43748e();
        String f = removeFirst.mo43751f();
        if ((TextUtils.isEmpty(e) || !e.contains("../")) && (TextUtils.isEmpty(f) || !f.contains("../"))) {
            C13479a.m54772d("FontDownloadExecutor", "begin :" + removeFirst);
            final File file = new File(this.f30709h, "temp" + e + f);
            C114211 r1 = new DownloadCallback() {
                /* class com.bytedance.ee.bear.slide.common.font.C11420b.C114211 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m47466a() {
                    C11420b.this.mo43754a();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m47468a(C11419a aVar) {
                    if (C11420b.this.f30703b != null) {
                        C11420b.this.f30703b.mo43763a(aVar);
                    }
                    C11420b.this.mo43754a();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m47467a(long j, C11419a aVar) {
                    if (C11420b.this.f30703b != null) {
                        C11420b.this.f30703b.mo43762a(j, aVar);
                    }
                }

                @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
                public boolean onFailed(String str, int i) {
                    C13479a.m54758a("FontDownloadExecutor", "onFailed :" + i);
                    if (i != 1000) {
                        C11420b.this.mo43755a("net");
                        return false;
                    }
                    C11420b.this.f30702a.mo43798a("cancel");
                    C11420b.this.f30704c.post(new Runnable() {
                        /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$1$hSLLlDHtFnYy4RiGV7RBIW3k */

                        public final void run() {
                            C11420b.C114211.m269985lambda$hSLLlDHtFnYy4RiGV7RBIW3k(C11420b.C114211.this);
                        }
                    });
                    return false;
                }

                @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
                public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                    if (status == DriveFile.Status.READY) {
                        C11420b.this.f30702a.mo43799a("network_download", removeFirst.mo43751f(), removeFirst.mo43743c());
                        return false;
                    } else if (status == DriveFile.Status.INFLIGHT) {
                        C11420b.this.f30704c.post(new Runnable(j, removeFirst) {
                            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$1$Wdnv3LDoaYqaARqZkOGp8ZQ7kA */
                            public final /* synthetic */ long f$1;
                            public final /* synthetic */ C11419a f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r4;
                            }

                            public final void run() {
                                C11420b.C114211.m269984lambda$Wdnv3LDoaYqaARqZkOGp8ZQ7kA(C11420b.C114211.this, this.f$1, this.f$2);
                            }
                        });
                        return false;
                    } else if (status != DriveFile.Status.SUCCESS) {
                        return false;
                    } else {
                        C13479a.m54764b("FontDownloadExecutor", "updateProgress SUCCESS:");
                        C11420b.this.f30702a.mo43799a("file_verify", removeFirst.mo43751f(), removeFirst.mo43743c());
                        if (!C11420b.this.mo43757a(file, removeFirst)) {
                            return false;
                        }
                        C11420b.this.f30702a.mo43799a("total", removeFirst.mo43751f(), removeFirst.mo43743c());
                        C11420b.this.f30702a.mo43803e();
                        C11420b.this.f30704c.post(new Runnable(removeFirst) {
                            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$1$it7C9XCmmA_Mg9kxpMm1RZUAQk */
                            public final /* synthetic */ C11419a f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C11420b.C114211.m269986lambda$it7C9XCmmA_Mg9kxpMm1RZUAQk(C11420b.C114211.this, this.f$1);
                            }
                        });
                        return false;
                    }
                }
            };
            this.f30706e = removeFirst;
            BearExecutors.m48467b().execute(new Runnable(removeFirst, file, r1) {
                /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$Z7nya1iixYMCkpHbaCFYLgJ9izk */
                public final /* synthetic */ C11419a f$1;
                public final /* synthetic */ File f$2;
                public final /* synthetic */ DownloadCallback f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C11420b.lambda$Z7nya1iixYMCkpHbaCFYLgJ9izk(C11420b.this, this.f$1, this.f$2, this.f$3);
                }
            });
            return;
        }
        C13479a.m54775e("FontDownloadExecutor", "download  error: ../");
        mo43755a("file");
    }

    /* renamed from: a */
    public void mo43755a(String str) {
        this.f30704c.post(new Runnable(str) {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$b$uDP03bYzUX43pM5ZKB0fCtuqto */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C11420b.m269983lambda$uDP03bYzUX43pM5ZKB0fCtuqto(C11420b.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m47449b(String str) {
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19657a(new ArrayList<>(Arrays.asList(str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m47452c(String str) {
        ArrayList arrayList = new ArrayList(this.f30707f);
        if (mo43758b()) {
            arrayList.add(0, this.f30706e);
        }
        this.f30707f.clear();
        this.f30702a.mo43798a(str);
        AbstractC11422a aVar = this.f30703b;
        if (aVar != null) {
            aVar.mo43764a(str, arrayList);
        }
        m47457f();
    }

    /* renamed from: d */
    public static long m47453d(List<C11419a> list) {
        long j = 0;
        for (C11419a aVar : list) {
            try {
                j += Long.valueOf(aVar.mo43743c()).longValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return j;
    }

    /* renamed from: e */
    private void m47456e(List<C11419a> list) {
        if (!list.remove(this.f30706e)) {
            m47455e();
        }
        this.f30707f.removeAll(list);
        this.f30707f.addAll(0, list);
        C13479a.m54772d("FontDownloadExecutor", "addNewFontDownloadFontItems :" + this.f30707f);
    }

    /* renamed from: a */
    public void mo43756a(List<C11419a> list) {
        m47456e(list);
        C13479a.m54772d("FontDownloadExecutor", "download :" + this.f30707f);
        m47451c();
    }

    /* renamed from: b */
    public boolean mo43759b(List<C11419a> list) {
        ArrayList arrayList = new ArrayList(this.f30707f);
        if (mo43758b()) {
            arrayList.add(this.f30706e);
        }
        return arrayList.containsAll(list);
    }

    /* renamed from: c */
    public void mo43760c(List<C11419a> list) {
        this.f30707f.removeAll(list);
        if (list.contains(this.f30706e)) {
            m47454d();
        }
    }

    /* renamed from: a */
    private boolean m47448a(String str, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(C13602d.m55221a(file), str)) {
            return true;
        }
        C13479a.m54758a("FontDownloadExecutor", "md5 check err ");
        return false;
    }

    /* renamed from: b */
    private boolean m47450b(File file, C11419a aVar) {
        Throwable th;
        Exception e;
        File file2 = new File(this.f30708g);
        ZipInputStream zipInputStream = null;
        try {
            m47458g();
            ZipInputStream zipInputStream2 = new ZipInputStream(new FileInputStream(file));
            try {
                C13683i.m55567a(zipInputStream2, file2.getAbsolutePath(), true);
                file.delete();
                File file3 = new File(this.f30708g, aVar.mo43748e());
                if (!file3.exists()) {
                    file3.mkdirs();
                } else {
                    file3.delete();
                    file3.mkdirs();
                }
                C13675f.m55497a(zipInputStream2);
                return true;
            } catch (Exception e2) {
                e = e2;
                zipInputStream = zipInputStream2;
                try {
                    C13479a.m54759a("FontDownloadExecutor", "unzip ", e);
                    mo43755a("file");
                    C13675f.m55497a(zipInputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C13675f.m55497a(zipInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zipInputStream = zipInputStream2;
                C13675f.m55497a(zipInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            C13479a.m54759a("FontDownloadExecutor", "unzip ", e);
            mo43755a("file");
            C13675f.m55497a(zipInputStream);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo43757a(File file, C11419a aVar) {
        if (!m47448a(aVar.mo43751f(), file)) {
            mo43755a("md5");
            return false;
        } else if ("1".equals(aVar.mo43746d())) {
            if (m47450b(file, aVar)) {
                return true;
            }
            mo43755a("file");
            return true;
        } else if (!"2".equals(aVar.mo43746d())) {
            return true;
        } else {
            try {
                C13675f.m55514b(file, new File(this.f30708g, aVar.mo43748e()));
                file.delete();
                return true;
            } catch (IOException e) {
                C13479a.m54759a("FontDownloadExecutor", "copy file ", e);
                mo43755a("file");
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47447a(C11419a aVar, File file, DownloadCallback downloadCallback) {
        String b = ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19659b(new DownloadRequestInfo.C9355a().mo35671f(aVar.mo43741b()).mo35662a(file.getAbsolutePath()).mo35663a(true).mo35661a(DrivePriority.DownloadPriority.PREVIEW).mo35658a(downloadCallback).mo35664a());
        C13479a.m54772d("FontDownloadExecutor", "begin key:" + b);
        if (TextUtils.isEmpty(b) || TextUtils.equals(b, "-1")) {
            C13479a.m54775e("FontDownloadExecutor", "download begin error:" + b);
            mo43755a("net");
            return;
        }
        this.f30705d = b;
        this.f30702a.mo43799a("get_fileinfo", aVar.mo43751f(), aVar.mo43743c());
    }

    C11420b(String str, String str2, C11430h hVar, AbstractC11422a aVar) {
        this.f30702a = hVar;
        this.f30703b = aVar;
        this.f30708g = str;
        this.f30709h = str2;
        this.f30704c = new Handler(Looper.getMainLooper());
    }
}
