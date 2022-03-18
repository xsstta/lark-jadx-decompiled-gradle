package com.bytedance.ee.bear.drive.mimetype;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.biz.plugin.C6527a;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.bytedance.ee.bear.drive.mimetype.a */
public class C7093a implements AbstractC7095c {

    /* renamed from: a */
    private static C7094b f19107a = new C7094b(MimeTypeCategory.NONE, "*/*", C7096d.m28340a(), C7096d.m28345b(), C7096d.m28350d(), C7096d.m28348c(), C7096d.m28353e());

    /* renamed from: b */
    private final Object f19108b = new Object();

    /* renamed from: c */
    private volatile boolean f19109c = false;

    /* renamed from: d */
    private Map<String, ArrayList<C7094b>> f19110d;

    /* renamed from: e */
    private Map<String, C7094b> f19111e;

    /* renamed from: f */
    private Throwable f19112f;

    /* renamed from: g */
    private C7128a f19113g;

    /* renamed from: a */
    private void m28299a() {
        if (!this.f19109c) {
            C13479a.m54764b("MimeTypeManager", Thread.currentThread().getName() + " waiting mime type loading from disk...");
        }
        while (!this.f19109c) {
            try {
                this.f19108b.wait();
            } catch (InterruptedException e) {
                C13479a.m54761a("MimeTypeManager", e);
            }
        }
        if (this.f19112f != null) {
            C13479a.m54759a("MimeTypeManager", Thread.currentThread().getName() + " load from disk throw error", this.f19112f);
            this.f19113g.mo27898c(this.f19112f);
        }
    }

    /* renamed from: a */
    private void m28300a(Context context) {
        synchronized (this.f19108b) {
            this.f19109c = false;
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context) {
            /* class com.bytedance.ee.bear.drive.mimetype.$$Lambda$a$stXSG2yOvLcLNbAkuJpFYNnRlkw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7093a.this.m28303c(this.f$1);
            }
        });
    }

    /* renamed from: b */
    private C7094b m28301b(String str) {
        if (TextUtils.isEmpty(str)) {
            return f19107a;
        }
        synchronized (this.f19108b) {
            m28299a();
            ArrayList<C7094b> arrayList = this.f19110d.get(str.toLowerCase());
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    return arrayList.get(0);
                }
            }
            return f19107a;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28303c(Context context) {
        synchronized (this.f19108b) {
            if (!this.f19109c) {
                this.f19109c = true;
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                C13479a.m54772d("MimeTypeManager", "start loading from disk");
                try {
                    m28302b(context);
                    C13479a.m54772d("MimeTypeManager", "end  loading from disk, cost " + (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + " nanos");
                    this.f19108b.notifyAll();
                    C13479a.m54764b("MimeTypeManager", "work finish quit current handle thread");
                } catch (Throwable th) {
                    C13479a.m54772d("MimeTypeManager", "end  loading from disk, cost " + (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + " nanos");
                    this.f19108b.notifyAll();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    private C7094b m28298a(String[] strArr) {
        List arrayList = new ArrayList(3);
        try {
            if (!TextUtils.isEmpty(strArr[6])) {
                if (!TextUtils.isEmpty(strArr[6].trim())) {
                    String[] split = TextUtils.split(strArr[6], ">");
                    if (split != null) {
                        for (String str : split) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str.trim())));
                        }
                    }
                    return new C7094b(MimeTypeCategory.valueOf(strArr[0].trim()), strArr[1].trim(), Integer.parseInt(strArr[2].trim()), Integer.parseInt(strArr[3].trim()), Integer.parseInt(strArr[4].trim()), Integer.parseInt(strArr[5].trim()), arrayList);
                }
            }
            arrayList = C7096d.m28353e();
        } catch (Exception e) {
            C13479a.m54761a("MimeTypeManager", e);
            arrayList = C7096d.m28353e();
        }
        try {
            return new C7094b(MimeTypeCategory.valueOf(strArr[0].trim()), strArr[1].trim(), Integer.parseInt(strArr[2].trim()), Integer.parseInt(strArr[3].trim()), Integer.parseInt(strArr[4].trim()), Integer.parseInt(strArr[5].trim()), arrayList);
        } catch (Exception e2) {
            C13479a.m54761a("MimeTypeManager", e2);
            return null;
        }
    }

    /* renamed from: b */
    private void m28302b(Context context) {
        InputStream inputStream = null;
        try {
            this.f19110d = new ArrayMap();
            this.f19111e = new ArrayMap();
            InputStream openRawResource = context.getResources().openRawResource(R.raw.drive_preview_mime_types);
            Properties properties = new Properties();
            properties.load(openRawResource);
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()) {
                try {
                    String trim = ((String) keys.nextElement()).trim();
                    for (String str : properties.getProperty(trim).split(",")) {
                        C7094b a = m28298a(str.split("\\|"));
                        if (a != null) {
                            if (this.f19110d.get(trim) == null) {
                                ArrayList<C7094b> arrayList = new ArrayList<>();
                                arrayList.add(a);
                                this.f19110d.put(trim, arrayList);
                            } else {
                                this.f19110d.get(trim).add(a);
                            }
                            String str2 = trim + a.mo27727b().trim();
                            if (this.f19111e.get(str2) == null) {
                                this.f19111e.put(str2, a);
                            }
                        }
                    }
                } catch (Exception e) {
                    C13479a.m54759a("MimeTypeManager", "Fail to parse mime type", e);
                    this.f19112f = e;
                }
            }
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (IOException e2) {
                    C13479a.m54759a("MimeTypeManager", "Close Fail to load mime types raw file.", e2);
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    C13479a.m54759a("MimeTypeManager", "Close Fail to load mime types raw file.", e3);
                }
            }
            throw th;
        }
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: a */
    public boolean mo27712a(String str) {
        boolean z;
        boolean z2 = true;
        if (m28301b(str).mo27728c() != C7096d.m28340a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C6892d.m27246d(str)) {
                z = C6535d.m26239d(C6920b.m27342f().mo27168c());
            } else if (C6892d.m27247e(str) || C6892d.m27248f(str)) {
                z = C6535d.m26240e(C6920b.m27342f().mo27168c());
            } else if (C6892d.m27249g(str)) {
                z = C6535d.m26241f(C6920b.m27342f().mo27168c());
            } else if (mo27724m(str, null)) {
                boolean a = C4211a.m17514a().mo16536a("ccm.drive.local_archive_preview_enable", false);
                boolean c = C6527a.m26177a().mo26097c(C6920b.m27342f().mo27168c());
                C13479a.m54764b("MimeTypeManager", "DRIVE_LOCAL_ARCHIVE_PREVIEW_ENABLE=" + a + " archivePluginActive=" + c);
                if (!a || !C6892d.m27253k(str) || !c) {
                    z2 = false;
                }
                z = z2;
            }
        }
        if ("ogg".equalsIgnoreCase(str)) {
            return false;
        }
        return z;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: i */
    public boolean mo27720i(String str, String str2) {
        return TextUtils.equals(mo27711a(str, str2).mo27727b(), "text/html");
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: k */
    public boolean mo27722k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "csv".equalsIgnoreCase(str);
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: l */
    public boolean mo27723l(String str, String str2) {
        return TextUtils.equals(mo27711a(str, str2).mo27727b(), "text/markdown");
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: n */
    public boolean mo27725n(String str, String str2) {
        return TextUtils.equals(mo27711a(str, str2).mo27727b(), "application/vnd.android.package-archive");
    }

    public C7093a(Context context, C7128a aVar) {
        this.f19113g = aVar;
        m28300a(context);
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: b */
    public boolean mo27713b(String str, String str2) {
        if (m28301b(str).mo27726a().compareTo((Enum) m28301b(str2).mo27726a()) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: c */
    public boolean mo27714c(String str, String str2) {
        if (mo27711a(str, str2).mo27726a().compareTo((Enum) MimeTypeCategory.VIDEO) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: d */
    public boolean mo27715d(String str, String str2) {
        if (mo27711a(str, str2).mo27726a().compareTo((Enum) MimeTypeCategory.IMAGE) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: f */
    public boolean mo27717f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("pdf", str.toLowerCase());
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: g */
    public boolean mo27718g(String str, String str2) {
        if (mo27711a(str, str2).mo27726a().compareTo((Enum) MimeTypeCategory.AUDIO) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: h */
    public boolean mo27719h(String str, String str2) {
        if (mo27711a(str, str2).mo27726a().compareTo((Enum) MimeTypeCategory.TEXT) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: m */
    public boolean mo27724m(String str, String str2) {
        if (mo27711a(str, str2).mo27726a().compareTo((Enum) MimeTypeCategory.COMPRESS) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: e */
    public boolean mo27716e(String str, String str2) {
        boolean z;
        C7094b a = mo27711a(str, str2);
        if (a.mo27726a().compareTo((Enum) MimeTypeCategory.IMAGE) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !a.mo27727b().contains("gif")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: j */
    public boolean mo27721j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("xls".equalsIgnoreCase(str) || "xlsx".equalsIgnoreCase(str) || "xlsm".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.mimetype.AbstractC7095c
    /* renamed from: a */
    public C7094b mo27711a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return f19107a;
        }
        String lowerCase = C13721c.m55649c(str).toLowerCase();
        synchronized (this.f19108b) {
            m28299a();
            if (TextUtils.isEmpty(str2)) {
                return m28301b(lowerCase);
            }
            String concat = lowerCase.concat(str2.trim());
            if (this.f19111e.containsKey(concat)) {
                return this.f19111e.get(concat);
            }
            return m28301b(lowerCase);
        }
    }
}
