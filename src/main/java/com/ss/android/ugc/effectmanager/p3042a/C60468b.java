package com.ss.android.ugc.effectmanager.p3042a;

import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3053h.C60531j;
import com.ss.android.ugc.effectmanager.common.p3053h.C60536o;
import com.ss.android.ugc.effectmanager.model.C60633c;
import com.ss.android.ugc.effectmanager.p3044c.C60485a;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.a.b */
public class C60468b implements IModelCache {

    /* renamed from: e */
    private static C60468b f151117e;

    /* renamed from: a */
    private C60485a f151118a;

    /* renamed from: b */
    private final String f151119b;

    /* renamed from: c */
    private final String f151120c;

    /* renamed from: d */
    private C60467a f151121d;

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    /* renamed from: b */
    public String mo207020b() {
        return this.f151119b;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.a.b$1 */
    static /* synthetic */ class C604691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f151122a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.ugc.effectmanager.FetchModelType[] r0 = com.ss.android.ugc.effectmanager.FetchModelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.ugc.effectmanager.p3042a.C60468b.C604691.f151122a = r0
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.ss.android.ugc.effectmanager.FetchModelType.ZIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.ugc.effectmanager.p3042a.C60468b.C604691.f151122a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.ss.android.ugc.effectmanager.FetchModelType.ORIGIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.p3042a.C60468b.C604691.<clinit>():void");
        }
    }

    /* renamed from: c */
    private synchronized void m234953c() {
        C60485a aVar = this.f151118a;
        if (aVar == null || !aVar.mo207080b()) {
            try {
                this.f151118a = C60485a.m235035a(new File(this.f151119b), m234954d(this.f151120c), 1, Long.MAX_VALUE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    /* renamed from: a */
    public Map<String, C60633c> mo207018a() {
        String str;
        m234953c();
        HashMap hashMap = new HashMap();
        try {
            String[] list = this.f151121d.mo207013a().list("model");
            if (list != null) {
                for (String str2 : list) {
                    String[] list2 = this.f151121d.mo207013a().list("model/" + str2);
                    if (list2 != null) {
                        for (String str3 : list2) {
                            try {
                                str = C60512d.m235165a(str3);
                            } catch (Exception unused) {
                                str = "";
                            }
                            if (!str.equals("")) {
                                String b = C60512d.m235167b(str3);
                                C60633c cVar = new C60633c();
                                cVar.mo208110b(str);
                                cVar.mo208111c(b);
                                cVar.mo208108a(true);
                                hashMap.put(str, cVar);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            EPLog.m235177a("DownloadedModelStorage", "getLocalModelInfoList built in error", e);
        }
        try {
            for (String str4 : this.f151118a.mo207088h()) {
                String a = C60512d.m235165a(str4);
                C60485a.C60491c a2 = this.f151118a.mo207076a(str4);
                if (a2 != null) {
                    C60633c a3 = C60633c.m235628a(a2.mo207104a(0).getAbsolutePath());
                    a3.mo208108a(false);
                    hashMap.put(a, a3);
                }
            }
            return hashMap;
        } catch (IOException e2) {
            EPLog.m235177a("DownloadedModelStorage", "error while getLocalModelInfoList", e2);
            return new HashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.a.b$a */
    public static class C60470a extends FilterOutputStream {

        /* renamed from: a */
        long f151123a;

        public C60470a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(int i) throws IOException {
            this.out.write(i);
            this.f151123a++;
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.out.write(bArr, i, i2);
            this.f151123a += (long) i2;
        }
    }

    /* renamed from: d */
    private int m234954d(String str) {
        return str.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo207022c(String str) {
        m234953c();
        try {
            this.f151118a.mo207082c(str);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<String> mo207021b(String str) {
        m234953c();
        ArrayList<String> arrayList = new ArrayList<>();
        String a = C60531j.m235261a(str);
        try {
            for (String str2 : this.f151118a.mo207088h()) {
                if (C60512d.m235165a(str2).equals(a)) {
                    C60485a.C60491c cVar = null;
                    try {
                        cVar = this.f151118a.mo207076a(str2);
                        if (cVar != null) {
                            arrayList.add(str2);
                            if (cVar == null) {
                            }
                            cVar.close();
                        } else if (cVar != null) {
                            cVar.close();
                        }
                    } catch (IOException unused) {
                        if (0 == 0) {
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            cVar.close();
                        }
                        throw th;
                    }
                }
            }
        } catch (IOException unused2) {
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    /* renamed from: a */
    public boolean mo207019a(String str) {
        C60467a aVar = this.f151121d;
        if (aVar == null) {
            EPLog.m235180c("DownloadedModelStorage", "mAssetManagerWrapper is null!");
            return false;
        }
        return aVar.mo207015b("model/" + str);
    }

    /* renamed from: a */
    private static long m234949a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    @Override // com.ss.android.ugc.effectmanager.common.cache.IModelCache
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.effectmanager.model.C60633c mo207017a(java.lang.String r5, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r6) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.p3042a.C60468b.mo207017a(java.lang.String, com.ss.android.ugc.effectmanager.common.e.b):com.ss.android.ugc.effectmanager.model.c");
    }

    private C60468b(String str, String str2, C60467a aVar) {
        this.f151119b = str;
        this.f151120c = str2;
        this.f151121d = aVar;
        m234953c();
    }

    /* renamed from: a */
    public static synchronized C60468b m234951a(String str, String str2, C60467a aVar) {
        C60468b bVar;
        synchronized (C60468b.class) {
            if (f151117e == null) {
                f151117e = new C60468b(str, str2, aVar);
            }
            bVar = f151117e;
        }
        return bVar;
    }

    /* renamed from: b */
    private long m234952b(String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace bVar) {
        m234953c();
        String a = C60531j.m235261a(str);
        EPMonitor.m235192a(bVar, "checkDiskLruCache success, model file type is ORIGIN, fileName = " + a);
        C60485a.C60488a aVar = null;
        try {
            C60485a.C60488a b = this.f151118a.mo207079b(a);
            C60470a aVar2 = new C60470a(new DigestOutputStream(b.mo207092a(0), messageDigest));
            m234949a(inputStream, aVar2);
            aVar2.close();
            String a2 = C60536o.m235319a(messageDigest.digest());
            if (a2.equals(str2)) {
                EPMonitor.m235192a(bVar, "model file md5 check success");
                b.mo207093a();
                long j = aVar2.f151123a;
                if (b != null) {
                    b.mo207095c();
                }
                return j;
            }
            EPMonitor.m235192a(bVar, "model file md5 check failure, expected md5 : " + str2 + ", actual md5 : " + a2);
            b.mo207094b();
            if (b == null) {
                return -1;
            }
            b.mo207095c();
            return -1;
        } catch (IOException e) {
            EPMonitor.m235192a(bVar, "writeModelToDisk, exception occurred, cause = " + e.getMessage());
            throw new RuntimeException(e);
        } catch (Throwable th) {
            if (0 != 0) {
                aVar.mo207095c();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.effectmanager.c.a$a */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: com.ss.android.ugc.effectmanager.c.a$a */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: com.ss.android.ugc.effectmanager.c.a$a */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: com.ss.android.ugc.effectmanager.c.a$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012c A[SYNTHETIC, Splitter:B:48:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134 A[Catch:{ IOException -> 0x0130 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m234950a(java.lang.String r4, java.io.InputStream r5, java.security.MessageDigest r6, java.lang.String r7, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r8) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.p3042a.C60468b.m234950a(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String, com.ss.android.ugc.effectmanager.common.e.b):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo207016a(FetchModelType fetchModelType, String str, InputStream inputStream, MessageDigest messageDigest, String str2, MonitorTrace bVar) {
        m234953c();
        if (C604691.f151122a[fetchModelType.ordinal()] != 1) {
            return m234952b(str, inputStream, messageDigest, str2, bVar);
        }
        return m234950a(str, inputStream, messageDigest, str2, bVar);
    }
}
