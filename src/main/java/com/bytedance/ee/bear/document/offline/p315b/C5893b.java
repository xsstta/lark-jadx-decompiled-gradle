package com.bytedance.ee.bear.document.offline.p315b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.p315b.C5893b;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.diskmanage.p1807a.AbstractC36802f;
import com.ss.android.lark.diskmanage.p1807a.C36804g;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.b.b */
public class C5893b {

    /* renamed from: b */
    private static volatile C5893b f16491b;

    /* renamed from: a */
    public final AbstractC36802f f16492a;

    /* renamed from: c */
    private File f16493c;

    /* renamed from: d */
    private final boolean f16494d;

    /* renamed from: com.bytedance.ee.bear.document.offline.b.b$c */
    public interface AbstractC5899c {
        /* renamed from: a */
        void mo20417a(String str);

        /* renamed from: a */
        void mo20418a(String str, C5896a aVar);

        /* renamed from: a */
        void mo20419a(String str, String str2, int i);
    }

    /* renamed from: com.bytedance.ee.bear.document.offline.b.b$a */
    public static class C5896a {

        /* renamed from: a */
        public long f16495a = -1;

        /* renamed from: b */
        private InputStream f16496b;

        /* renamed from: c */
        private File f16497c;

        /* renamed from: d */
        private String f16498d = "0";

        /* renamed from: e */
        private int f16499e = -1;

        /* renamed from: a */
        public InputStream mo23812a() {
            return this.f16496b;
        }

        /* renamed from: b */
        public File mo23817b() {
            return this.f16497c;
        }

        /* renamed from: c */
        public String mo23818c() {
            return this.f16498d;
        }

        /* renamed from: d */
        public long mo23819d() {
            return this.f16495a;
        }

        /* renamed from: e */
        public int mo23820e() {
            return this.f16499e;
        }

        public C5896a() {
        }

        /* renamed from: a */
        public void mo23813a(int i) {
            this.f16499e = i;
        }

        /* renamed from: a */
        public void mo23814a(File file) {
            this.f16497c = file;
        }

        /* renamed from: a */
        public void mo23815a(InputStream inputStream) {
            this.f16496b = inputStream;
        }

        /* renamed from: a */
        public void mo23816a(String str) {
            this.f16498d = str;
        }

        public C5896a(InputStream inputStream, File file, String str, long j, int i) {
            this.f16496b = inputStream;
            this.f16497c = file;
            this.f16498d = str;
            this.f16495a = j;
            this.f16499e = i;
        }
    }

    /* renamed from: a */
    public C5896a mo23807a(String str, DownloadRequestInfo.DownloadType downloadType, String str2, int i) {
        File a = m23728a(str);
        if (a != null && a.exists()) {
            try {
                return new C5896a(new FileInputStream(a), a, "1", a.length(), 0);
            } catch (FileNotFoundException e) {
                C13479a.m54761a("DriveFileManager", e);
            }
        }
        return m23734b(new C5897b.C5898a().mo23825a(str).mo23824a(downloadType).mo23828b(str2).mo23822a(i).mo23827a());
    }

    /* renamed from: a */
    public int mo23806a(long j, long j2) {
        AbstractC36802f fVar = this.f16492a;
        if (fVar == null || j2 <= 0) {
            return 0;
        }
        fVar.mo135521a(j2);
        return 0;
    }

    /* renamed from: a */
    public void mo23809a(String str, DownloadRequestInfo.DownloadType downloadType, boolean z, AbstractC5899c cVar, String str2, int i) {
        AbstractC68307f.m265083a((Object) true).mo238004b(C11678b.m48479c()).mo238020d(new Function(str, cVar, downloadType, z, str2, i) {
            /* class com.bytedance.ee.bear.document.offline.p315b.$$Lambda$b$xSBNLw2v7g13NhvywSVKs6n8ZB4 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C5893b.AbstractC5899c f$2;
            public final /* synthetic */ DownloadRequestInfo.DownloadType f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ int f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5893b.this.m23729a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Boolean) obj);
            }
        }).mo238001b($$Lambda$b$ZLGzFnJQVdCqxCd8p8kdHNqDkVQ.INSTANCE, $$Lambda$b$iIRJybi5iTJaMAImnsxpIfvEVJo.INSTANCE);
    }

    /* renamed from: a */
    public String mo23808a(C5897b bVar) {
        if (bVar.f16501b != DownloadRequestInfo.DownloadType.COVER || !this.f16494d) {
            return bVar.f16504e.toLowerCase();
        }
        return bVar.f16504e.toLowerCase() + "_cover";
    }

    /* renamed from: a */
    public void mo23810a(String str, String str2, AbstractC5899c cVar, C5896a aVar) {
        m23732a(str, str2, cVar, aVar, true);
    }

    /* renamed from: a */
    public static C5893b m23724a() {
        if (f16491b == null) {
            synchronized (C5893b.class) {
                if (f16491b == null) {
                    f16491b = new C5893b();
                }
            }
        }
        return f16491b;
    }

    private C5893b() {
        String b = CCMStorage.m21715b(C13615c.f35773a, Biz.DOCS, "cover");
        File file = new File(b);
        this.f16493c = file;
        if (!file.exists()) {
            this.f16493c.mkdirs();
        }
        this.f16492a = new C36804g(b, 1, 314572800).mo135556b();
        this.f16494d = C4211a.m17514a().mo16536a("spacekit.mobile.doc.image.cover", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.b.b$b */
    public static class C5897b {

        /* renamed from: a */
        public boolean f16500a;

        /* renamed from: b */
        public DownloadRequestInfo.DownloadType f16501b;

        /* renamed from: c */
        public boolean f16502c;

        /* renamed from: d */
        public String f16503d;

        /* renamed from: e */
        public String f16504e;

        /* renamed from: f */
        public String f16505f;

        /* renamed from: g */
        public String f16506g;

        /* renamed from: h */
        public AbstractC5899c f16507h;

        /* renamed from: i */
        public String f16508i;

        /* renamed from: j */
        public int f16509j;

        /* renamed from: a */
        private String m23752a(int i) {
            return i != 2 ? i != 3 ? i != 8 ? i != 11 ? i != 12 ? i != 15 ? i != 16 ? "" : "doc_image" : "slide_image" : "explorer" : "mindnote_image" : "bitable_image" : "sheet_image" : "doc_image";
        }

        /* renamed from: com.bytedance.ee.bear.document.offline.b.b$b$a */
        public static final class C5898a {

            /* renamed from: a */
            public boolean f16510a;

            /* renamed from: b */
            public DownloadRequestInfo.DownloadType f16511b = DownloadRequestInfo.DownloadType.DRIVE;

            /* renamed from: c */
            public boolean f16512c = true;

            /* renamed from: d */
            public String f16513d = "";

            /* renamed from: e */
            public String f16514e = "";

            /* renamed from: f */
            public String f16515f = "";

            /* renamed from: g */
            public String f16516g = "";

            /* renamed from: h */
            public String f16517h = "";

            /* renamed from: i */
            public int f16518i = 2;

            /* renamed from: j */
            public AbstractC5899c f16519j;

            /* renamed from: a */
            public C5897b mo23827a() {
                return new C5897b(this.f16510a, this.f16511b, this.f16512c, this.f16513d, this.f16514e, this.f16515f, this.f16516g, this.f16517h, this.f16518i, this.f16519j);
            }

            /* renamed from: a */
            public C5898a mo23822a(int i) {
                this.f16518i = i;
                return this;
            }

            /* renamed from: b */
            public C5898a mo23828b(String str) {
                this.f16517h = str;
                return this;
            }

            /* renamed from: a */
            public C5898a mo23823a(AbstractC5899c cVar) {
                this.f16519j = cVar;
                return this;
            }

            /* renamed from: b */
            public C5898a mo23829b(boolean z) {
                this.f16512c = z;
                return this;
            }

            /* renamed from: a */
            public C5898a mo23824a(DownloadRequestInfo.DownloadType downloadType) {
                this.f16511b = downloadType;
                return this;
            }

            /* renamed from: a */
            public C5898a mo23825a(String str) {
                this.f16513d = str;
                return this;
            }

            /* renamed from: a */
            public C5898a mo23826a(boolean z) {
                this.f16510a = z;
                return this;
            }
        }

        public String toString() {
            return "Params{fileToken='" + C13598b.m55197d(this.f16504e) + '\'' + ", isAsync='" + this.f16500a + '\'' + ", downloadType='" + this.f16501b + '\'' + ", connect='" + this.f16502c + '\'' + ", mountNodeToken='" + C13598b.m55197d(this.f16505f) + '\'' + ", mountPoint='" + this.f16506g + '\'' + ", docToken='" + C13598b.m55197d(this.f16508i) + '\'' + ", docType='" + this.f16509j + '\'' + '}';
        }

        /* renamed from: a */
        private void m23755a() {
            if (!TextUtils.isEmpty(this.f16503d) && TextUtils.isEmpty(this.f16504e)) {
                Uri parse = Uri.parse(this.f16503d);
                this.f16504e = parse.getLastPathSegment();
                String queryParameter = parse.getQueryParameter("mount_node_token");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.f16505f = queryParameter;
                this.f16506g = m23753a(parse);
            }
        }

        /* renamed from: a */
        private String m23753a(Uri uri) {
            String queryParameter = uri.getQueryParameter("mount_point");
            if ("doc".equals(queryParameter)) {
                queryParameter = "doc_image";
            }
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = m23754a(this.f16505f);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = m23752a(this.f16509j);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return "unknown";
            }
            return queryParameter;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r7.equals("sld") == false) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m23754a(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 160
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.offline.p315b.C5893b.C5897b.m23754a(java.lang.String):java.lang.String");
        }

        private C5897b(boolean z, DownloadRequestInfo.DownloadType downloadType, boolean z2, String str, String str2, String str3, String str4, String str5, int i, AbstractC5899c cVar) {
            this.f16500a = z;
            this.f16501b = downloadType;
            this.f16502c = z2;
            this.f16503d = str;
            this.f16504e = str2;
            this.f16505f = str3;
            this.f16506g = str4;
            this.f16507h = cVar;
            this.f16508i = str5;
            this.f16509j = i;
            m23755a();
        }
    }

    /* renamed from: a */
    private DownloadRequestInfo.DownloadType m23727a(DownloadRequestInfo.DownloadType downloadType) {
        if (downloadType != DownloadRequestInfo.DownloadType.COVER || this.f16494d) {
            return downloadType;
        }
        return DownloadRequestInfo.DownloadType.IMG;
    }

    /* renamed from: a */
    private File m23728a(String str) {
        C5937c e;
        Uri parse = Uri.parse(str);
        if (parse == null || (e = C5955d.m24025b().mo24099e(parse.getLastPathSegment())) == null || TextUtils.isEmpty(e.mo23963e())) {
            return null;
        }
        return new File(e.mo23961d());
    }

    /* renamed from: b */
    private C5896a m23734b(C5897b bVar) {
        C13479a.m54764b("DriveFileManager", "downloadDriveFileInternal()... request = " + bVar);
        if (bVar.f16507h != null) {
            bVar.f16507h.mo20417a(bVar.f16503d);
        }
        C5896a c = m23736c(bVar);
        if (c != null) {
            c.mo23816a("2");
            c.mo23813a(0);
            return c;
        }
        C5896a aVar = new C5896a();
        String a = mo23808a(bVar);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m23730a(bVar, aVar, countDownLatch);
        if (!bVar.f16500a) {
            try {
                countDownLatch.await(5, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                C13479a.m54761a("DriveFileManager", e);
            }
            mo23810a(bVar.f16503d, a, bVar.f16507h, aVar);
        }
        return aVar;
    }

    /* renamed from: c */
    private C5896a m23736c(C5897b bVar) {
        String str;
        if (this.f16492a == null) {
            return null;
        }
        try {
            String a = mo23808a(bVar);
            C5896a aVar = new C5896a();
            m23732a(bVar.f16503d, a, bVar.f16507h, aVar, false);
            if (aVar.mo23812a() != null && aVar.mo23812a().available() > 0) {
                C13479a.m54772d("DriveFileManager", " downloadDrive success from lru cache");
                return aVar;
            } else if (bVar.f16502c || !this.f16494d) {
                return null;
            } else {
                if (bVar.f16501b != DownloadRequestInfo.DownloadType.COVER) {
                    str = bVar.f16504e.toLowerCase() + "_cover";
                } else {
                    str = bVar.f16504e.toLowerCase();
                }
                m23732a(bVar.f16503d, str, bVar.f16507h, aVar, false);
                if (aVar.mo23812a() == null || aVar.mo23812a().available() <= 0) {
                    return null;
                }
                C13479a.m54772d("DriveFileManager", " downloadDrive success from lru cache use other key");
                return aVar;
            }
        } catch (IOException e) {
            C13479a.m54761a("DriveFileManager", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23731a(Boolean bool) throws Exception {
        C13479a.m54772d("DriveFileManager", " downloadDriveFileAsync success from preload cache = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23733a(Throwable th) throws Exception {
        C13479a.m54758a("DriveFileManager", " downloadDriveFileAsync fail throwable = " + th);
    }

    /* renamed from: a */
    private DownloadCallback m23725a(final String str, final C5897b bVar) {
        return new DownloadCallback() {
            /* class com.bytedance.ee.bear.document.offline.p315b.C5893b.C58952 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                if (bVar.f16507h != null) {
                    bVar.f16507h.mo20419a(bVar.f16503d, str, i);
                }
                C13479a.m54758a("DriveFileManager", "onFailed()... key = " + str + ", errorCode = " + i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                C5896a aVar = new C5896a();
                if (status != DriveFile.Status.SUCCESS) {
                    return false;
                }
                C13479a.m54764b("DriveFileManager", "download success key = " + str);
                String a = C5893b.this.mo23808a(bVar);
                if (C5893b.this.f16492a != null) {
                    try {
                        File file = new File(str);
                        C5893b.this.f16492a.mo135516a(a, file);
                        C13675f.m55498a(file);
                    } catch (IOException e) {
                        C13479a.m54761a("DriveFileManager", e);
                    }
                }
                C5893b.this.mo23810a(bVar.f16503d, a, bVar.f16507h, aVar);
                return false;
            }
        };
    }

    /* renamed from: a */
    private String m23730a(C5897b bVar, C5896a aVar, CountDownLatch countDownLatch) {
        String str = this.f16493c.getAbsolutePath() + File.separator + mo23808a(bVar);
        return ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19649a(new DownloadRequestInfo.C9355a().mo35662a(str).mo35668c(bVar.f16505f).mo35669d(bVar.f16506g).mo35661a(DrivePriority.DownloadPriority.USER_INTERACTION).mo35658a(m23726a(bVar.f16500a, str, aVar, countDownLatch, bVar)).mo35666b(bVar.f16504e).mo35659a(m23727a(bVar.f16501b)).mo35672g(bVar.f16508i).mo35665b(bVar.f16509j).mo35664a());
    }

    /* renamed from: a */
    public void mo23811a(List<String> list, String str, int i, DownloadRequestInfo.DownloadType downloadType, AbstractC5899c cVar) {
        m23735b(list, str, i, downloadType, cVar);
    }

    /* renamed from: a */
    private DownloadCallback m23726a(final boolean z, final String str, final C5896a aVar, final CountDownLatch countDownLatch, final C5897b bVar) {
        return new DownloadCallback() {
            /* class com.bytedance.ee.bear.document.offline.p315b.C5893b.C58941 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                if (!z) {
                    countDownLatch.countDown();
                }
                aVar.mo23813a(i);
                aVar.mo23816a("0");
                if (bVar.f16507h != null) {
                    bVar.f16507h.mo20419a(bVar.f16503d, str, i);
                }
                C13479a.m54758a("DriveFileManager", "onFailed()... key = " + str + ", errorCode = " + i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                if (status == DriveFile.Status.SUCCESS) {
                    C13479a.m54764b("DriveFileManager", "download success key = " + str);
                    String a = C5893b.this.mo23808a(bVar);
                    if (C5893b.this.f16492a != null) {
                        try {
                            File file = new File(str);
                            C5893b.this.f16492a.mo135516a(a, file);
                            C13675f.m55498a(file);
                        } catch (IOException e) {
                            C13479a.m54761a("DriveFileManager", e);
                        }
                    }
                    aVar.mo23813a(0);
                    aVar.mo23816a("0");
                    if (!z) {
                        countDownLatch.countDown();
                    } else {
                        C5893b.this.mo23810a(bVar.f16503d, a, bVar.f16507h, aVar);
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: b */
    private void m23735b(List<String> list, String str, int i, DownloadRequestInfo.DownloadType downloadType, AbstractC5899c cVar) {
        ArrayList<C5897b> arrayList = new ArrayList();
        for (String str2 : list) {
            C5897b a = new C5897b.C5898a().mo23826a(true).mo23824a(downloadType).mo23825a(str2).mo23828b(str).mo23822a(i).mo23823a(cVar).mo23827a();
            if (cVar != null) {
                cVar.mo20417a(str2);
            }
            if (m23736c(a) == null) {
                arrayList.add(a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C5897b bVar : arrayList) {
            String str3 = this.f16493c.getAbsolutePath() + File.separator + mo23808a(bVar);
            arrayList2.add(new DownloadRequestInfo.C9355a().mo35666b(bVar.f16504e).mo35662a(str3).mo35669d(bVar.f16506g).mo35658a(m23725a(str3, bVar)).mo35659a(m23727a(bVar.f16501b)).mo35672g(bVar.f16508i).mo35665b(bVar.f16509j).mo35664a());
        }
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35622a(arrayList2);
    }

    /* renamed from: a */
    private void m23732a(String str, String str2, AbstractC5899c cVar, C5896a aVar, boolean z) {
        InputStream c;
        try {
            AbstractC36802f fVar = this.f16492a;
            if (!(fVar == null || (c = fVar.mo135524c(str2)) == null)) {
                aVar.mo23815a(c);
                File b = this.f16492a.mo135519b(str2);
                aVar.mo23814a(b);
                if (b != null) {
                    aVar.f16495a = b.length();
                }
                aVar.mo23813a(0);
                if (cVar != null) {
                    cVar.mo20418a(str, aVar);
                    return;
                }
            }
        } catch (Exception e) {
            C13479a.m54761a("DriveFileManager", e);
        }
        if (z && cVar != null) {
            cVar.mo20419a(str, str2, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m23729a(String str, AbstractC5899c cVar, DownloadRequestInfo.DownloadType downloadType, boolean z, String str2, int i, Boolean bool) throws Exception {
        File a = m23728a(str);
        if (a != null && a.exists()) {
            C5896a aVar = new C5896a();
            aVar.mo23814a(a);
            if (cVar != null) {
                cVar.mo20418a(str, aVar);
                return true;
            }
        }
        m23734b(new C5897b.C5898a().mo23826a(true).mo23824a(downloadType).mo23829b(z).mo23825a(str).mo23823a(cVar).mo23828b(str2).mo23822a(i).mo23827a());
        return false;
    }
}
