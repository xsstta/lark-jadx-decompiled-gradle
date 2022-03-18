package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.glue.Brotli;
import com.bytedance.lynx.webview.glue.Lzma;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20040b;
import com.bytedance.lynx.webview.util.C20041c;
import com.bytedance.lynx.webview.util.C20043d;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20050i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lynx.webview.internal.j */
public class C19971j {

    /* renamed from: a */
    private static volatile boolean f48797a;

    /* renamed from: b */
    private static AtomicBoolean f48798b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f48799c = new AtomicBoolean(false);

    C19971j() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.internal.j$a */
    public class C19973a {

        /* renamed from: b */
        private FileChannel f48801b;

        /* renamed from: c */
        private FileLock f48802c;

        /* renamed from: d */
        private String f48803d;

        /* renamed from: b */
        public void mo67801b() {
            FileLock fileLock = this.f48802c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                    this.f48802c = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileChannel fileChannel = this.f48801b;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                    this.f48801b = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public boolean mo67800a() {
            try {
                if (TextUtils.isEmpty(this.f48803d)) {
                    this.f48803d = String.valueOf(System.currentTimeMillis()) + ".guard";
                }
                FileChannel channel = new FileOutputStream(C20050i.m73175b() + this.f48803d, true).getChannel();
                this.f48801b = channel;
                this.f48802c = channel.tryLock();
            } catch (Exception e) {
                C20048g.m73164d("Lock file error :" + e.toString());
                e.printStackTrace();
            }
            if (this.f48802c != null) {
                return true;
            }
            return false;
        }

        public C19973a(String str) {
            this.f48803d = str;
            File file = new File(C20050i.m73175b());
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.internal.j$b */
    public class AsyncTaskC19974b extends AsyncTask<File, Void, Boolean> {
        private AsyncTaskC19974b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(File... fileArr) {
            if (fileArr.length < 2) {
                return false;
            }
            return Boolean.valueOf(Lzma.decompress(fileArr[0], fileArr[1]));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121 A[SYNTHETIC, Splitter:B:37:0x0121] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m72841a(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19971j.m72841a(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146 A[LOOP:6: B:47:0x0144->B:48:0x0146, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0159 A[LOOP:7: B:51:0x0157->B:52:0x0159, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m72846b(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19971j.m72846b(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m72842a(File file, String str) throws IOException {
        if (!file.getAbsolutePath().equals(str)) {
            C20044e.m73148a(new File(str), file);
        }
    }

    /* renamed from: b */
    private static boolean m72847b(String str, String str2) {
        try {
            InputStream open = C20011y.m72976a().mo67938u().getResources().getAssets().open(str);
            File file = new File(str2);
            if (file.exists()) {
                if (file.length() != 0) {
                    C20048g.m73161a("so 文件已存在，无需复制");
                    return true;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    open.close();
                    fileOutputStream.close();
                    C20048g.m73161a("so 文件复制完毕");
                    return true;
                }
            }
        } catch (IOException e) {
            C20048g.m73164d("copyAssetsFile2Phone " + e.toString());
            return false;
        }
    }

    /* renamed from: c */
    private boolean m72848c(String str, String str2) {
        C20026a.m73079a(DownloadEventType.PrepareFromDataDir_begin);
        File file = new File(C20050i.m73190h(str));
        try {
            if (!file.exists() || file.isDirectory() || !C20041c.m73128a(str2) || !m72849d(str, "tryLoadTTWebView local libbytedance.so")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C19938b.m72701a("prepareFromDataDir" + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public void mo67798a(String str, String str2) {
        C20011y.m72976a().mo67939v();
        if (!C20043d.m73137a()) {
            C20011y.m72976a().mo67939v().mo67811a(EventType.DISABLED_BY_ABI);
            C20048g.m73161a("abi is disable! -> use system webview");
        } else {
            C20026a.m73079a(DownloadEventType.Prepare_abi_enable);
            if (f48798b.compareAndSet(false, true)) {
                try {
                    C20026a.m73079a(DownloadEventType.Prepare_prepare_once);
                    C19973a aVar = new C19973a("prepare.guard");
                    if (aVar.mo67800a()) {
                        m72843a(C20011y.m72976a().mo67938u(), str, str2);
                    } else {
                        C19943g.m72724a(EventType.DISABLED_BY_FILELOCK_FAILED, (Object) null);
                        C20048g.m73164d("FileLock failed.");
                    }
                    aVar.mo67801b();
                    C20026a.m73079a(DownloadEventType.Prepare_download_end);
                } catch (Throwable th) {
                    f48798b.set(false);
                    throw th;
                }
                f48798b.set(false);
            } else {
                C20048g.m73161a("someone doing prepare at same time!");
            }
        }
        C20026a.m73086e();
    }

    /* renamed from: b */
    private boolean m72844b(Context context, String str) {
        boolean z;
        C20026a.m73079a(DownloadEventType.PrepareFromAssets_begin);
        try {
            if (C20011y.m73004d()) {
                if (!C19941e.m72704a().mo67726b()) {
                    if (!C20044e.m73152a(context, C20050i.m73185f())) {
                        return false;
                    }
                    if (f48799c.getAndSet(true)) {
                        C20048g.m73161a("skip builtin because of loaded ever");
                        return false;
                    }
                    m72847b(C20050i.m73185f(), C20050i.m73190h(str));
                    long currentTimeMillis = System.currentTimeMillis();
                    int a = m72841a(str);
                    if (a == 1) {
                        z = m72846b(str);
                    } else if (a == 0) {
                        File file = new File(C20050i.m73192i(str));
                        boolean decompress = Brotli.decompress(file.getAbsolutePath(), C20050i.m73174a(str));
                        if (file.exists()) {
                            file.delete();
                        }
                        z = decompress;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        new File(C20050i.m73177b(str)).createNewFile();
                        C20011y.m72976a().mo67902F().mo67782e(str);
                        C20011y.m72976a().mo67939v().mo67812a(str);
                        if (!TextUtils.isEmpty(str)) {
                            C19996t c = C19986s.m72924a().mo67862c(str);
                            String c2 = c.mo67876c();
                            String str2 = "";
                            if (c != null) {
                                str2 = c.mo67875b();
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "0620010001";
                            }
                            C19984r v = C20011y.m72976a().mo67939v();
                            v.mo67820b(str2);
                            v.mo67810a(Build.VERSION.SDK_INT);
                            v.mo67825c(c2);
                        }
                        C20048g.m73161a("tryLoadTTWebView libbytedance.so from assets time_cost=" + currentTimeMillis2);
                        return true;
                    }
                    C20048g.m73164d("tryLoadTTWebView libbytedance.so from assets Erro!");
                    C20044e.m73149a(new File(C20050i.m73174a(str)), false);
                }
            }
            return false;
        } catch (Throwable th) {
            C19938b.m72701a("prepareFromAssets:" + th.toString());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0207  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m72849d(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19971j.m72849d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean mo67799a(Context context, String str) {
        C20026a.m73079a(DownloadEventType.PrepareFromDebugPath_begin);
        if (!C20040b.m73121a()) {
            C20048g.m73161a("debug json file not exists. so file should be downloaded online");
            return false;
        }
        File file = new File(C20050i.m73173a(context));
        if (!file.exists()) {
            C20048g.m73164d(C20050i.m73173a(context) + " not exists");
            return false;
        }
        try {
            File file2 = new File(C20050i.m73190h(str));
            if (file2.exists()) {
                file2.delete();
            }
            file2.getParentFile().mkdirs();
            file2.createNewFile();
            C20044e.m73148a(file, file2);
            return m72849d(str, "tryload so from debug so file ");
        } catch (Throwable th) {
            C19938b.m72701a("prepareByDebugPath:" + th.toString());
            C20048g.m73164d(th.toString());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0164 A[Catch:{ all -> 0x01b3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m72843a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19971j.m72843a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    private boolean m72845b(Context context, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && C20043d.m73138a(context)) {
                File file = new File(C20050i.m73190h(str2));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C19984r v = C20011y.m72976a().mo67939v();
                    String j = C20050i.m73193j(str2);
                    v.mo67811a(EventType.DOWNLOAD_START);
                    C19943g.m72725a(EventType.DOWNLOAD_STATUS_START, C19986s.m72924a().mo67859b("sdk_upto_so_versioncode"), false);
                    C20026a.m73079a(DownloadEventType.PrepareByDownload_start);
                    C20048g.m73161a("download path is ", j);
                    boolean a = C19986s.m72924a().mo67858a("sdk_use_app_download_handler", false);
                    TTWebSdk.AbstractC19911c n = C20011y.m73016n();
                    if (n == null || !a) {
                        C20048g.m73161a("Sdk-download start");
                        if (!C20041c.m73129a(str, j)) {
                            C19943g.m72725a(EventType.DOWNLOAD_STATUS_FAILED, C19986s.m72924a().mo67859b("sdk_upto_so_versioncode"), false);
                            C20048g.m73161a("Sdk-download failed");
                            return false;
                        }
                    } else {
                        try {
                            if (!v.mo67818a(str, 9999)) {
                                v.mo67821b(str, v.mo67849p());
                                v.mo67813a(str, 9999, false);
                                C20048g.m73161a("App-download start");
                                if (!n.mo67447a(str, j)) {
                                    C20048g.m73161a("App-download failed");
                                    C19943g.m72725a(EventType.DOWNLOAD_STATUS_FAILED, C19986s.m72924a().mo67859b("sdk_upto_so_versioncode"), false);
                                    return false;
                                }
                                v.mo67813a(str, 9999, true);
                            }
                        } catch (Throwable unused) {
                            C19943g.m72725a(EventType.DOWNLOAD_STATUS_FAILED, C19986s.m72924a().mo67859b("sdk_upto_so_versioncode"), false);
                            return false;
                        }
                    }
                    v.mo67840i(str2);
                    v.mo67811a(EventType.DOWNLOAD_END);
                    C19943g.m72725a(EventType.DOWNLOAD_STATUS_END, C19986s.m72924a().mo67859b("sdk_upto_so_versioncode"), true);
                    C20026a.m73079a(DownloadEventType.PrepareByDownload_end);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C20048g.m73161a("prepareByDownload time_cost=" + currentTimeMillis2);
                    C19943g.m72724a(EventType.DOWNLOAD_TIME, Long.valueOf(currentTimeMillis2));
                    m72842a(file, j);
                    C20044e.m73147a(context, file, j);
                    C20048g.m73161a("download finished. " + file.length());
                    return m72849d(str2, "tryLoadTTWebView so by download");
                } catch (Exception e) {
                    e.printStackTrace();
                    C20011y.m72976a().mo67939v().mo67811a(EventType.DOWNLOAD_CRASHED);
                    C20048g.m73164d("download error " + e.toString());
                    C19938b.m72701a("download:" + e.toString());
                    return false;
                }
            }
        } catch (Exception e2) {
            C19938b.m72701a("prepareByDownload:" + e2.toString());
        }
        return false;
    }
}
