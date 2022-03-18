package com.bytedance.ee.bear.onboarding.p515b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13683i;
import com.bytedance.ee.util.p700c.C13598b;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.onboarding.b.a */
public class C10380a {

    /* renamed from: a */
    private Context f27923a;

    /* renamed from: b */
    private String f27924b;

    /* renamed from: c */
    private String f27925c;

    /* renamed from: a */
    private void m43170a() {
        File file = new File(this.f27925c);
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isFile()) {
            file.delete();
            file.mkdirs();
        }
    }

    public C10380a(Context context) {
        this.f27923a = context;
        this.f27924b = new File(CCMStorage.m21713a(context, Biz.DOCS, "onboardingimages")).getAbsolutePath();
        this.f27925c = new File(CCMStorage.m21717c(context, Biz.DOCS, "onboardingimages")).getAbsolutePath();
    }

    /* renamed from: c */
    private static boolean m43176c(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        if (i >= str.length()) {
            return false;
        }
        return "zip".equals(str.substring(i).toLowerCase());
    }

    /* renamed from: b */
    public static String m43175b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf(".");
        if (lastIndexOf < 0) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        if (lastIndexOf2 == -1) {
            lastIndexOf2 = str.length();
        }
        if (i <= lastIndexOf2) {
            return str.substring(i, lastIndexOf2);
        }
        C13479a.m54758a("OnBoardingImageDownloader", "Parsing image originalUrl error, startIndex[" + i + "] < endIndex[" + lastIndexOf2 + "]");
        return "";
    }

    /* renamed from: a */
    private boolean m43173a(File file) {
        Throwable th;
        Exception e;
        File file2 = new File(this.f27925c);
        ZipInputStream zipInputStream = null;
        try {
            m43170a();
            ZipInputStream zipInputStream2 = new ZipInputStream(new FileInputStream(file));
            try {
                C13683i.m55567a(zipInputStream2, file2.getAbsolutePath(), true);
                file.delete();
                C13675f.m55497a(zipInputStream2);
                C13479a.m54764b("OnBoardingImageDownloader", "unzip successfully.");
                return true;
            } catch (Exception e2) {
                e = e2;
                zipInputStream = zipInputStream2;
                try {
                    C13479a.m54759a("OnBoardingImageDownloader", "unzip failed", e);
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
            C13479a.m54759a("OnBoardingImageDownloader", "unzip failed", e);
            C13675f.m55497a(zipInputStream);
            return false;
        }
    }

    /* renamed from: a */
    public void mo39535a(final String str) {
        String str2;
        if (TextUtils.isEmpty(str) || m43172a(this.f27923a, str)) {
            C13479a.m54764b("OnBoardingImageDownloader", "Image file exists, don't download.");
            return;
        }
        C13479a.m54764b("OnBoardingImageDownloader", "startDownload url: " + C13598b.m55197d(str));
        if (m43176c(str)) {
            str2 = "temp_" + m43175b(str);
        } else {
            str2 = m43175b(str);
        }
        final File file = new File(this.f27924b, str2);
        BearExecutors.m48467b().execute(new Runnable(str, file, new DownloadCallback() {
            /* class com.bytedance.ee.bear.onboarding.p515b.C10380a.C103811 */

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean onFailed(String str, int i) {
                C13479a.m54758a("OnBoardingImageDownloader", "onFailed :" + i);
                return false;
            }

            @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
            public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
                if (status != DriveFile.Status.SUCCESS) {
                    return false;
                }
                C10380a.this.mo39536a(file, str);
                C13479a.m54764b("OnBoardingImageDownloader", "updateProgress SUCCESS: temoFile length: " + file.length() + "; path: " + C13598b.m55197d(file.getAbsolutePath()));
                return false;
            }
        }) {
            /* class com.bytedance.ee.bear.onboarding.p515b.$$Lambda$a$xwLh9vSROiLkrCRfyByzcM1DCSs */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ File f$1;
            public final /* synthetic */ DownloadCallback f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10380a.m43171a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public static boolean m43172a(Context context, String str) {
        return new File(new File(CCMStorage.m21715b(context, Biz.DOCS, "onboardingimages")).getAbsolutePath(), m43175b(str)).exists();
    }

    /* renamed from: b */
    public static String m43174b(Context context, String str) {
        File file = new File(new File(CCMStorage.m21717c(context, Biz.DOCS, "onboardingimages")).getAbsolutePath(), m43175b(str));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo39536a(File file, String str) {
        boolean c = m43176c(str);
        C13479a.m54764b("OnBoardingImageDownloader", "isZipFile : " + c);
        if (c) {
            return m43173a(file);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m43171a(String str, File file, DownloadCallback downloadCallback) {
        String b = ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19659b(new DownloadRequestInfo.C9355a().mo35671f(str).mo35662a(file.getAbsolutePath()).mo35663a(true).mo35661a(DrivePriority.DownloadPriority.PREVIEW).mo35658a(downloadCallback).mo35664a());
        C13479a.m54772d("OnBoardingImageDownloader", "download key:" + b);
    }
}
