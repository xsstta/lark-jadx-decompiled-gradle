package com.bytedance.ee.util.io;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.system.Os;
import android.text.TextUtils;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.info.AppInfoUtils;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.CipherException;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.ttvecamera.p3038g.C60375c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.ee.util.io.f */
public class C13675f {

    /* renamed from: a */
    private static final String[][] f35873a;

    /* renamed from: b */
    private static final Map<String, String> f35874b = new HashMap();

    /* renamed from: c */
    private static final Map<String, String> f35875c = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m55544l(String str) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.io.f$a */
    public static class C13678a {

        /* renamed from: a */
        public static final String[][] f35876a = {new String[]{"application/zip", "application/x-zip-compressed"}};

        /* renamed from: b */
        private static final Map<String, String> f35877b = new HashMap<String, String>() {
            /* class com.bytedance.ee.util.io.C13675f.C13678a.C136791 */

            {
                for (int i = 0; i < C13678a.f35876a.length; i++) {
                    put(C13678a.f35876a[i][0], C13678a.f35876a[i][1]);
                    put(C13678a.f35876a[i][1], C13678a.f35876a[i][0]);
                }
            }
        };

        private C13678a() {
        }

        /* renamed from: a */
        public String mo50646a(String str) {
            return f35877b.get(str);
        }
    }

    /* renamed from: a */
    public static void m55498a(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                m55513b(file);
            } else if (file.isFile()) {
                m55527d(file);
            }
        }
    }

    /* renamed from: a */
    public static void m55494a(Context context, File file) throws IOException {
        if (file.getPath().contains(AppInfoUtils.m55455c(context))) {
            m55498a(file);
        } else {
            C13479a.m54775e("FileUtils", "safeDeleteFile, not allow to delete user files");
        }
    }

    /* renamed from: a */
    public static void m55500a(File file, File file2, boolean z) throws IOException {
        m55523c(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        } else if (!file2.exists() || file2.canWrite()) {
            String[] list = file.list();
            if (list != null && list.length > 0) {
                for (String str : list) {
                    File file3 = new File(file, str);
                    File file4 = new File(file2, str);
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                        m55500a(file3, file4, z);
                    } else {
                        m55515b(file3, file4, z);
                    }
                }
            }
        } else {
            throw new IOException("Destination '" + file2 + "' exists but is read-only");
        }
    }

    /* renamed from: a */
    public static void m55504a(boolean z, String str, File file) {
        if (z) {
            try {
                if (C13615c.f35773a == null) {
                    C13479a.m54775e("FileUtils", "copyFile failed because baseApplication is null");
                    return;
                }
                InputStream openInputStream = C13615c.f35773a.getContentResolver().openInputStream(Uri.parse(str));
                if (openInputStream != null) {
                    m55501a(openInputStream, new FileOutputStream(file));
                    return;
                }
                C13479a.m54775e("FileUtils", "copyFile failed because inputStream is null");
                throw new FileNotFoundException("Source uri " + str + "' does not exist");
            } catch (IOException e) {
                C13479a.m54759a("FileUtils", "Copy file exception, ", e);
            }
        } else {
            m55514b(new File(str), file);
        }
    }

    /* renamed from: a */
    public static void m55501a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    C26266d.m95082a(inputStream);
                    C26266d.m95082a(outputStream);
                    return;
                }
            }
        } catch (IOException e) {
            C13479a.m54759a("FileUtils", "Copy file exception, ", e);
            C26266d.m95082a(inputStream);
            C26266d.m95082a(outputStream);
        } catch (Throwable th) {
            C26266d.m95082a(inputStream);
            C26266d.m95082a(outputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m55506a(Context context, File file, Uri uri) {
        try {
            C13671b.m55469a(context, file.toString(), uri);
            return true;
        } catch (Exception e) {
            C13479a.m54761a("FileUtils", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m55507a(byte[] bArr, File file) {
        boolean z;
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream = null;
        if (!(bArr == null || file == null)) {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream = fileOutputStream2;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C13479a.m54761a("FileUtils", e);
                        z = false;
                        m55497a(fileOutputStream);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        m55497a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    m55497a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                C13479a.m54761a("FileUtils", e);
                z = false;
                m55497a(fileOutputStream);
                return z;
            }
        }
        z = true;
        m55497a(fileOutputStream);
        return z;
    }

    /* renamed from: a */
    public static void m55505a(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                m55497a(closeable);
            }
        }
    }

    /* renamed from: a */
    public static void m55497a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C13479a.m54761a("FileUtils", e);
            }
        }
    }

    /* renamed from: a */
    public static void m55496a(Context context, String str) {
        String d = C13598b.m55197d(str);
        C13479a.m54764b("FileUtils", "notifySystemScanFile... for path : " + d);
        m55537i(str).mo238020d(new Function(str) {
            /* class com.bytedance.ee.util.io.$$Lambda$f$zHOYUFn7HUn2ziLkHqMPbohgJI8 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C13675f.m55510b(this.f$0, (String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238020d(new Function(context) {
            /* class com.bytedance.ee.util.io.$$Lambda$f$m3DPlF4cmyZ1YTQB8Gt3eNfwN0 */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C13675f.m55502a((Context) ((String) obj), (String) this.f$0);
            }
        }).mo238001b($$Lambda$f$RXnunEnNVX0efSDwg9YQcLNxOw.INSTANCE, $$Lambda$f$F225UNzRTJvvwSt01NQrD7uYMCA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m55502a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT < 19) {
                context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + str)));
                return;
            }
            MediaScannerConnection.scanFile(context, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() {
                /* class com.bytedance.ee.util.io.C13675f.C136761 */

                public void onScanCompleted(String str, Uri uri) {
                    C13479a.m54764b("FileUtils", "onScanCompleted... " + C13598b.m55197d(str));
                }
            });
        }
    }

    /* renamed from: b */
    public static void m55517b(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        C13479a.m54761a("FileUtils", th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m55495a(Context context, File file, String str) {
        if (file == null || !file.exists()) {
            LKUIToast.show(context, (int) R.string.Doc_Util_OpenFail);
        } else if (!m55518b(context, file, str)) {
            String a = new C13678a().mo50646a(str);
            if (TextUtils.isEmpty(a)) {
                LKUIToast.show(context, (int) R.string.Doc_Util_OpenNoApp);
            } else if (!m55518b(context, file, a)) {
                LKUIToast.show(context, (int) R.string.Doc_Util_OpenNoApp);
            }
        }
    }

    /* renamed from: b */
    private static boolean m55518b(Context context, File file, String str) {
        C13479a.m54772d("FileUtils", "openFile: " + str);
        if (TextUtils.isEmpty(str)) {
            str = m55533g(file);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setDataAndType(C13681h.m55559a(context, file), str);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            C13479a.m54775e("FileUtils", "openFile: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static void m55503a(List<File> list) {
        Collections.sort(list, new Comparator<File>() {
            /* class com.bytedance.ee.util.io.C13675f.C136772 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return 1;
            }
        });
    }

    static {
        String[][] strArr = {new String[]{"3gp", "video/3gpp"}, new String[]{"apk", "application/vnd.android.package-archive"}, new String[]{"3g2", "video/3gpp2"}, new String[]{"asf", "video/x-ms-asf"}, new String[]{"avi", "video/x-msvideo"}, new String[]{"bin", "application/octet-stream"}, new String[]{"bmp", "image/bmp"}, new String[]{"wbmp", "image/vnd.wap.wbmp"}, new String[]{"webp", "image/webp"}, new String[]{"ico", "image/x-icon"}, new String[]{C60375c.f150914a, "text/plain"}, new String[]{"heif", "image/heif"}, new String[]{"heic", "image/heic"}, new String[]{"webm", "video/webm"}, new String[]{"mkv", "video/x-matroska"}, new String[]{"class", "application/octet-stream"}, new String[]{"conf", "text/plain"}, new String[]{"cpp", "text/plain"}, new String[]{"doc", "application/msword"}, new String[]{"docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, new String[]{"xls", "application/vnd.ms-excel"}, new String[]{"xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}, new String[]{"exe", "application/octet-stream"}, new String[]{"gif", "image/gif"}, new String[]{"gtar", "application/x-gtar"}, new String[]{"gz", "application/x-gzip"}, new String[]{C14002h.f36692e, "text/plain"}, new String[]{"htm", "text/html"}, new String[]{"html", "text/html"}, new String[]{"jar", "application/java-archive"}, new String[]{"java", "text/plain"}, new String[]{"jpeg", "image/jpeg"}, new String[]{"jpg", "image/jpeg"}, new String[]{"jpe", "image/jpeg"}, new String[]{"js", "application/x-javascript"}, new String[]{"log", "text/plain"}, new String[]{"m3u", "audio/x-mpegurl"}, new String[]{"m4a", "audio/mp4a-latm"}, new String[]{"m4b", "audio/mp4a-latm"}, new String[]{"m4p", "audio/mp4a-latm"}, new String[]{"m4u", "video/vnd.mpegurl"}, new String[]{"m4v", "video/x-m4v"}, new String[]{"mov", "video/quicktime"}, new String[]{"mp2", "audio/x-mpeg"}, new String[]{"mp3", "audio/x-mpeg"}, new String[]{"mpg4", "video/mp4"}, new String[]{"mpc", "application/vnd.mpohun.certificate"}, new String[]{"mpe", "video/mpeg"}, new String[]{"vob", "video/mpeg"}, new String[]{"mpg", "video/mpeg"}, new String[]{"mp4", "video/mp4"}, new String[]{"mpga", "audio/mpeg"}, new String[]{"mpeg", "video/mpeg"}, new String[]{"msg", "application/vnd.ms-outlook"}, new String[]{"ogg", "audio/ogg"}, new String[]{"pdf", "application/pdf"}, new String[]{"png", "image/png"}, new String[]{"pps", "application/vnd.ms-powerpoint"}, new String[]{"ppt", "application/vnd.ms-powerpoint"}, new String[]{"pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"}, new String[]{"prop", "text/plain"}, new String[]{"rc", "text/plain"}, new String[]{"rmvb", "audio/x-pn-realaudio"}, new String[]{"rtf", "application/rtf"}, new String[]{"sh", "text/plain"}, new String[]{"tar", "application/x-tar"}, new String[]{"tgz", "application/x-compressed"}, new String[]{"txt", "text/plain"}, new String[]{"wav", "audio/x-wav"}, new String[]{"wma", "audio/x-ms-wma"}, new String[]{"wmv", "audio/x-ms-wmv"}, new String[]{"wps", "application/vnd.ms-works"}, new String[]{"xml", "text/plain"}, new String[]{"z", "application/x-compress"}, new String[]{"zip", "application/x-zip-compressed"}, new String[]{"rar", "application/x-rar-compressed"}, new String[]{"ai", "application/postscript"}, new String[]{"", "*/*"}};
        f35873a = strArr;
        for (String[] strArr2 : strArr) {
            f35874b.put(strArr2[0], strArr2[1]);
            f35875c.put(strArr2[1], strArr2[0]);
        }
    }

    /* renamed from: a */
    public static String m55487a(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        return externalFilesDir.getPath();
    }

    /* renamed from: g */
    public static String m55533g(File file) {
        return m55532f(file.getPath());
    }

    /* renamed from: h */
    public static File m55536h(String str) {
        if (m55540j(str)) {
            return null;
        }
        return new File(str);
    }

    /* renamed from: j */
    public static List<String> m55539j(File file) {
        return m55492a(file, 0, Integer.MAX_VALUE, null);
    }

    /* renamed from: n */
    private static boolean m55546n(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m55488a(String str) {
        return f35875c.get(str);
    }

    /* renamed from: b */
    public static String m55509b(String str) {
        if (TextUtils.isEmpty(str) || Build.VERSION.SDK_INT <= 29) {
            return str;
        }
        return str.replaceAll("[\\\\/:*?\"<>|]", "");
    }

    /* renamed from: c */
    public static String m55521c(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: e */
    public static String m55528e(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) > -1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    /* renamed from: f */
    public static String m55532f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "*/*";
        }
        String str2 = f35874b.get(m55534g(str));
        if (TextUtils.isEmpty(str2)) {
            return "*/*";
        }
        return str2;
    }

    /* renamed from: g */
    public static String m55534g(String str) {
        if (str.lastIndexOf(".") > 0) {
            return str.substring(str.lastIndexOf(".") + 1, str.length()).toLowerCase();
        }
        return "";
    }

    /* renamed from: i */
    public static List<File> m55538i(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            arrayList.add(file2);
        }
        m55503a(arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static boolean m55540j(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static void m55543l(File file) throws IOException {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                m55547o(file);
            } else if (file.isFile()) {
                file.delete();
            }
        }
    }

    /* renamed from: d */
    public static long m55525d(String str) {
        File file = new File(str);
        long j = 0;
        try {
            if (file.exists()) {
                j = file.length();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            m55497a((Closeable) null);
            throw th;
        }
        m55497a((Closeable) null);
        return j;
    }

    /* renamed from: f */
    public static long m55531f(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                j = m55531f(listFiles[i]);
            } else {
                j = m55535h(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: i */
    private static AbstractC68307f<String> m55537i(String str) {
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.util.io.$$Lambda$f$lwY_AYF90JrDi8tKpKec_lbg8SQ */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C13675f.m55489a(this.f$0, (String) obj);
            }
        }).mo238020d($$Lambda$f$s4J4Y06hMQi98eaJpzLP6KyFRk.INSTANCE).mo238029f($$Lambda$f$szbpgOGft2stVD2gvm855zrMKA.INSTANCE);
    }

    /* renamed from: k */
    public static long m55541k(File file) {
        if (file != null && file.exists() && !file.isDirectory()) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    return Os.lstat(file.getAbsolutePath()).st_atime * 1000;
                }
                return file.lastModified();
            } catch (Exception e) {
                C13479a.m54759a("FileUtils", "getFileLastAccessTime... err happens : ", e);
            }
        }
        return 0;
    }

    /* renamed from: o */
    private static void m55547o(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m55547o(file2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: c */
    public static void m55522c(File file) throws IOException {
        IOException e = null;
        for (File file2 : m55545m(file)) {
            try {
                m55527d(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x000a] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m55530e(java.io.File r6) {
        /*
            java.lang.String r0 = "FileUtils"
            r1 = 0
            if (r6 == 0) goto L_0x004e
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0044 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0044 }
            long r3 = r6.length()     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            int r6 = (int) r3     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r6 <= r3) goto L_0x001d
            java.lang.String r6 = "this file is too large"
            com.bytedance.ee.log.C13479a.m54758a(r0, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            m55497a(r2)
            return r1
        L_0x001d:
            byte[] r3 = new byte[r6]
            r4 = 0
        L_0x0020:
            if (r4 >= r6) goto L_0x002e
            int r5 = r6 - r4
            int r5 = r2.read(r3, r4, r5)     // Catch:{ Exception -> 0x002c, all -> 0x003b }
            if (r5 < 0) goto L_0x002e
            int r4 = r4 + r5
            goto L_0x0020
        L_0x002c:
            r6 = move-exception
            goto L_0x0040
        L_0x002e:
            if (r4 >= r6) goto L_0x0039
            java.lang.String r6 = "file is error"
            com.bytedance.ee.log.C13479a.m54758a(r0, r6)     // Catch:{ Exception -> 0x002c, all -> 0x003b }
            m55497a(r2)
            return r1
        L_0x0039:
            r1 = r2
            goto L_0x004f
        L_0x003b:
            r6 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x003e:
            r6 = move-exception
            r3 = r1
        L_0x0040:
            r1 = r2
            goto L_0x0046
        L_0x0042:
            r6 = move-exception
            goto L_0x004a
        L_0x0044:
            r6 = move-exception
            r3 = r1
        L_0x0046:
            com.bytedance.ee.log.C13479a.m54761a(r0, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x004f
        L_0x004a:
            m55497a(r1)
            throw r6
        L_0x004e:
            r3 = r1
        L_0x004f:
            m55497a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.io.C13675f.m55530e(java.io.File):byte[]");
    }

    /* renamed from: h */
    public static long m55535h(File file) {
        Throwable th;
        FileNotFoundException e;
        IOException e2;
        FileInputStream fileInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e3) {
                e = e3;
                C13479a.m54758a("FileUtils", e.toString());
                m55517b(fileInputStream2);
                return 0;
            } catch (IOException e4) {
                e2 = e4;
                try {
                    C13479a.m54758a("FileUtils", e2.toString());
                    m55517b(fileInputStream2);
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    m55517b(fileInputStream2);
                    throw th;
                }
            }
            try {
                long available = (long) fileInputStream.available();
                m55517b(fileInputStream);
                return available;
            } catch (FileNotFoundException e5) {
                e = e5;
                fileInputStream2 = fileInputStream;
                C13479a.m54758a("FileUtils", e.toString());
                m55517b(fileInputStream2);
                return 0;
            } catch (IOException e6) {
                e2 = e6;
                fileInputStream2 = fileInputStream;
                C13479a.m54758a("FileUtils", e2.toString());
                m55517b(fileInputStream2);
                return 0;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                m55517b(fileInputStream2);
                throw th;
            }
        }
        return 0;
    }

    /* renamed from: m */
    private static File[] m55545m(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                return listFiles;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    /* renamed from: a */
    public static String m55486a(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j <= 0) {
            return "0 Byte";
        }
        if (j < 1024) {
            return decimalFormat.format((double) j) + " Byte";
        } else if (j < 1048576) {
            return decimalFormat.format(((double) j) / 1024.0d) + " KB";
        } else if (j < 1073741824) {
            return decimalFormat.format(((double) j) / 1048576.0d) + " MB";
        } else {
            return decimalFormat.format(((double) j) / 1.073741824E9d) + " GB";
        }
    }

    /* renamed from: b */
    public static String m55508b(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j <= 0) {
            return "0 B";
        }
        if (j < 1024) {
            return decimalFormat.format((double) j) + " B";
        } else if (j < 1048576) {
            return decimalFormat.format(((double) j) / 1024.0d) + " K";
        } else if (j < 1073741824) {
            return decimalFormat.format(((double) j) / 1048576.0d) + " M";
        } else {
            return decimalFormat.format(((double) j) / 1.073741824E9d) + " G";
        }
    }

    /* renamed from: d */
    public static void m55527d(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                m55513b(file);
                return;
            }
            boolean exists = file.exists();
            if (file.delete()) {
                return;
            }
            if (!exists) {
                throw new FileNotFoundException("File does not exist: " + file);
            }
            throw new IOException("Unable to delete file: " + file);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ String m55542k(String str) throws Exception {
        try {
            C13479a.m54772d("FileUtils", "encryptExportedFile... do reverse in Thread : " + Thread.currentThread().getName());
            String a = C36808a.m145200a(str);
            String d = C13598b.m55197d(a);
            C13479a.m54764b("FileUtils", "encryptExportedFile... reverse mapping path : " + d);
            File file = new File(a);
            if (!TextUtils.isEmpty(a) && file.exists()) {
                return a;
            }
            throw new RuntimeException("reverse mapping failed");
        } catch (CipherException e) {
            C13479a.m54759a("FileUtils", "encryptExportedFile... found error when reverse: " + e.getErrorCode(), e);
            if (C36808a.m145211c() != 1 || e.getErrorCode() != 40307) {
                return str;
            }
            C13479a.m54764b("FileUtils", "need encrypt again");
            try {
                C36808a.m145203a(new File(str));
                return str;
            } catch (EncryptException e2) {
                C13479a.m54759a("FileUtils", "encryptExportedFile... found error when encrpt: " + e2.getErrorCode(), e2);
                return "";
            }
        }
    }

    /* renamed from: b */
    public static void m55513b(File file) throws IOException {
        if (file.exists()) {
            m55522c(file);
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    /* renamed from: a */
    public static void m55499a(File file, File file2) throws IOException {
        m55500a(file, file2, true);
    }

    /* renamed from: b */
    public static void m55514b(File file, File file2) throws IOException {
        m55515b(file, file2, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m55489a(String str, String str2) throws Exception {
        File file = new File(str);
        if (!TextUtils.isEmpty(str) && file.exists()) {
            return str2;
        }
        throw new RuntimeException("target file is illegal");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m55510b(String str, String str2) throws Exception {
        C13479a.m54764b("FileUtils", "notifySystemScanFile... after reverse path is : " + C13598b.m55197d(str2));
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    /* renamed from: c */
    public static long m55519c(boolean z, String str) {
        if (!z) {
            return new File(str).length();
        }
        if (C13615c.f35773a != null) {
            return LarkUriUtil.m95302b(C13615c.f35773a, Uri.parse(str));
        }
        C13479a.m54775e("FileUtils", "getFileSize failed because baseApplication is null");
        return -1;
    }

    /* renamed from: e */
    public static boolean m55529e(boolean z, String str) {
        if (!z) {
            return new File(str).exists();
        }
        if (C13615c.f35773a != null) {
            return LarkUriUtil.m95311g(C13615c.f35773a, Uri.parse(str));
        }
        C13479a.m54775e("FileUtils", "isFileExists failed because baseApplication is null");
        return false;
    }

    /* renamed from: b */
    public static String m55511b(boolean z, String str) {
        if (!z) {
            return new File(str).getName();
        }
        if (C13615c.f35773a == null) {
            C13479a.m54775e("FileUtils", "getFileName failed because baseApplication is null");
            return "";
        }
        String a = LarkUriUtil.m95300a(C13615c.f35773a, Uri.parse(str));
        if (a != null) {
            return a;
        }
        C13479a.m54775e("FileUtils", "getFileName failed.");
        return "";
    }

    /* renamed from: d */
    public static long m55526d(boolean z, String str) {
        if (!z) {
            return m55541k(new File(str));
        }
        if (C13615c.f35773a == null) {
            C13479a.m54775e("FileUtils", "getFileLastAccessTime failed because baseApplication is null");
            return 0;
        }
        Long c = LarkUriUtil.m95305c(C13615c.f35773a, Uri.parse(str));
        if (c != null) {
            return c.longValue();
        }
        C13479a.m54775e("FileUtils", "getFileLastAccessTime failed");
        return 0;
    }

    /* renamed from: c */
    private static void m55523c(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    /* renamed from: a */
    public static String m55491a(boolean z, String str) {
        return m55521c(m55511b(z, str));
    }

    /* renamed from: b */
    public static void m55512b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (Build.VERSION.SDK_INT < 29 || Environment.isExternalStorageLegacy()) {
                DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                if (downloadManager != null) {
                    downloadManager.addCompletedDownload(file.getName(), file.getName(), true, m55533g(file), file.getAbsolutePath(), file.length(), true);
                    return;
                }
                return;
            }
            C13479a.m54758a("FileUtils", "target Build.VERSION_CODES Q or above and running under the scoped storage model!!! ");
        }
    }

    /* renamed from: a */
    public static void m55493a(long j, File file) throws Exception {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m55493a(j, file2);
                }
            } else if (file.lastModified() <= j && file != null && file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    private static void m55524c(File file, File file2, boolean z) throws IOException {
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel channel;
        long j;
        if (!file2.exists() || !file2.isDirectory()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        channel = fileInputStream.getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = null;
                        m55505a(null, fileOutputStream, fileChannel, fileInputStream);
                        throw th;
                    }
                    try {
                        FileChannel channel2 = fileOutputStream.getChannel();
                        long size = channel.size();
                        long j2 = 0;
                        while (j2 < size) {
                            long j3 = size - j2;
                            if (j3 > 31457280) {
                                j = 31457280;
                            } else {
                                j = j3;
                            }
                            long transferFrom = channel2.transferFrom(channel, j2, j);
                            if (transferFrom == 0) {
                                break;
                            }
                            j2 += transferFrom;
                        }
                        m55505a(channel2, fileOutputStream, channel, fileInputStream);
                        long length = file.length();
                        long length2 = file2.length();
                        if (length != length2) {
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                        } else if (z) {
                            file2.setLastModified(file.lastModified());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel;
                        m55505a(null, fileOutputStream, fileChannel, fileInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    fileChannel = fileOutputStream;
                    m55505a(null, fileOutputStream, fileChannel, fileInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                fileOutputStream = null;
                fileChannel = fileOutputStream;
                m55505a(null, fileOutputStream, fileChannel, fileInputStream);
                throw th;
            }
        } else {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
    }

    /* renamed from: b */
    public static void m55515b(File file, File file2, boolean z) throws IOException {
        m55523c(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                m55524c(file, file2, z);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    /* renamed from: a */
    public static List<String> m55492a(File file, int i, int i2, String str) {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        BufferedReader bufferedReader2 = null;
        if (!m55546n(file) || i > i2) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i3 = 1;
            if (m55540j(str)) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            }
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (i3 > i2) {
                        break;
                    } else {
                        if (i <= i3 && i3 <= i2) {
                            arrayList.add(readLine);
                        }
                        i3++;
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        m55497a(bufferedReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        m55497a(bufferedReader2);
                        throw th;
                    }
                }
            }
            m55497a(bufferedReader);
            return arrayList;
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            e.printStackTrace();
            m55497a(bufferedReader);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m55497a(bufferedReader2);
            throw th;
        }
    }
}
