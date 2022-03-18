package com.bytedance.p203b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.p203b.p204a.C3491f;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.b */
public class C3496b {

    /* renamed from: a */
    static final C3496b f11036a;

    /* renamed from: n */
    private static final String[] f11037n = {"log", "m", "stdc++", "dl", C60375c.f150914a, "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};

    /* renamed from: b */
    public final C3499c f11038b;

    /* renamed from: c */
    private final File f11039c;

    /* renamed from: d */
    private final Map<String, C3497a> f11040d = new HashMap();

    /* renamed from: e */
    private final File f11041e;

    /* renamed from: f */
    private volatile boolean f11042f;

    /* renamed from: g */
    private File f11043g;

    /* renamed from: h */
    private ZipFile[] f11044h;

    /* renamed from: i */
    private String f11045i;

    /* renamed from: j */
    private ApplicationInfo f11046j;

    /* renamed from: k */
    private Map<String, String> f11047k;

    /* renamed from: l */
    private String[] f11048l;

    /* renamed from: m */
    private String f11049m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b$a */
    public static class C3497a {

        /* renamed from: a */
        boolean f11050a;

        C3497a() {
        }

        public String toString() {
            return Boolean.toString(this.f11050a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b$b */
    public class C3498b {

        /* renamed from: b */
        private RandomAccessFile f11052b;

        /* renamed from: c */
        private FileLock f11053c;

        /* renamed from: d */
        private FileChannel f11054d;

        /* renamed from: e */
        private File f11055e;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo13944b() {
            FileLock fileLock = this.f11053c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            C3499c cVar = C3496b.this.f11038b;
            cVar.mo13945a("released lock " + this.f11055e.getPath());
            C3496b.this.mo13940a(this.f11054d);
            C3496b.this.mo13940a(this.f11052b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13943a() throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f11055e, "rw");
            this.f11052b = randomAccessFile;
            try {
                this.f11054d = randomAccessFile.getChannel();
                try {
                    C3499c cVar = C3496b.this.f11038b;
                    cVar.mo13945a("blocking on lock " + this.f11055e.getPath());
                    this.f11053c = this.f11054d.lock();
                    C3499c cVar2 = C3496b.this.f11038b;
                    cVar2.mo13945a("acquired on lock " + this.f11055e.getPath());
                } catch (IOException e) {
                    C3496b.this.mo13940a(this.f11054d);
                    throw e;
                }
            } catch (IOException e2) {
                C3496b.this.mo13940a(this.f11052b);
                throw e2;
            }
        }

        C3498b(File file) {
            this.f11055e = file;
        }
    }

    /* renamed from: b */
    private String m14742b() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ZipFile[] zipFileArr = this.f11044h;
        for (ZipFile zipFile : zipFileArr) {
            if (zipFile != null) {
                String name = zipFile.getName();
                File file = new File(name);
                sb.append(name);
                sb.append("#");
                sb.append(zipFile.size());
                sb.append(":");
                sb.append(file.length());
                sb.append("|");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        String str;
        C3499c cVar;
        Context context = C3481a.f11012a;
        C3481a.f11012a = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (C3481a.f11013b != null) {
                str = C3481a.f11013b;
            } else {
                str = "default.version";
            }
            File file = new File(applicationInfo.sourceDir);
            File file2 = new File(dir, str + "." + (file.lastModified() >> 8));
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (!file2.getName().equals(file3.getName())) {
                        File[] listFiles2 = file3.listFiles();
                        if (listFiles2 != null) {
                            for (File file4 : listFiles2) {
                                file4.delete();
                            }
                        }
                        file3.delete();
                    }
                }
            }
            file2.mkdirs();
            if (file2.exists()) {
                if (C3481a.f11014c != null) {
                    cVar = C3481a.f11014c;
                } else {
                    cVar = new C3499c();
                }
                f11036a = new C3496b(applicationInfo, file2, cVar);
                return;
            }
            f11036a = null;
            return;
        }
        throw new C3500d("you should call init first or use loadLibraryForModule.");
    }

    /* renamed from: a */
    private void m14740a() {
        String[] strArr;
        if (!this.f11042f) {
            synchronized (this) {
                if (!this.f11042f) {
                    File file = new File(this.f11046j.sourceDir);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file);
                    if (!(Build.VERSION.SDK_INT < 21 || (strArr = this.f11046j.splitSourceDirs) == null || strArr.length == 0)) {
                        for (String str : strArr) {
                            arrayList.add(new File(str));
                        }
                    }
                    ZipFile[] zipFileArr = new ZipFile[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        int i2 = i + 1;
                        try {
                            zipFileArr[i] = new ZipFile(file2);
                        } catch (IOException e) {
                            new C3500d("fail to get zip file " + file2.getName() + ", size " + file2.length() + ", exists " + file2.exists(), e).printStackTrace();
                        }
                        i = i2;
                    }
                    this.f11044h = zipFileArr;
                    this.f11043g = new File(this.f11046j.nativeLibraryDir);
                    HashMap hashMap = new HashMap();
                    this.f11047k = hashMap;
                    hashMap.put("arm64-v8a", "arm64");
                    this.f11047k.put("armeabi-v7a", "arm");
                    this.f11047k.put("armeabi", "arm");
                    String str2 = null;
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                            str2 = (String) cls.getDeclaredMethod("vmInstructionSet", new Class[0]).invoke(cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                        } catch (Exception e2) {
                            this.f11038b.mo13946a("fail to get vm instruction set", e2);
                        }
                    }
                    this.f11045i = str2;
                    this.f11038b.mo13945a("vm instruction set: " + this.f11045i);
                    this.f11048l = Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : Build.SUPPORTED_ABIS;
                    this.f11042f = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13940a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                this.f11038b.mo13946a("failed to close resource", e);
            }
        }
    }

    /* renamed from: a */
    private List<String> m14739a(File file) throws IOException {
        Throwable th;
        Closeable closeable = null;
        try {
            C3491f fVar = new C3491f(file);
            try {
                List<String> b = fVar.mo13935b();
                Collections.sort(b);
                mo13940a(fVar);
                return b;
            } catch (Throwable th2) {
                th = th2;
                closeable = fVar;
                mo13940a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mo13940a(closeable);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m14745c(String str) {
        if (this.f11045i == null) {
            return true;
        }
        String str2 = this.f11047k.get(str);
        String str3 = this.f11045i;
        if (str2 != null) {
            str = str2;
        }
        return str3.equals(str);
    }

    /* renamed from: d */
    private static String m14746d(String str) {
        return "lib" + str + ".so";
    }

    /* renamed from: a */
    private boolean m14741a(String str) {
        for (String str2 : f11037n) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m14743b(String str) {
        if (this.f11049m == null) {
            String[] strArr = this.f11048l;
            for (String str2 : strArr) {
                if (m14745c(str2)) {
                    String str3 = "lib/" + str2 + "/" + str;
                    ZipFile[] zipFileArr = this.f11044h;
                    for (ZipFile zipFile : zipFileArr) {
                        if (zipFile != null && zipFile.getEntry(str3) != null) {
                            this.f11049m = str2;
                            this.f11038b.mo13945a("ensure that abi is " + str2);
                            return;
                        }
                    }
                    continue;
                }
            }
            throw new C3500d("can not ensure abi for " + str + ", check " + this.f11045i + ", apks " + m14742b());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private boolean m14744b(File file) throws IOException {
        m14743b(file.getName());
        String str = "lib/" + this.f11049m + "/" + file.getName();
        ZipFile[] zipFileArr = this.f11044h;
        for (ZipFile zipFile : zipFileArr) {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    m14738a(inputStream, file);
                    this.f11038b.mo13945a("get lib file " + file.getPath() + " from " + str + " of " + zipFile.getName());
                    mo13940a(inputStream);
                    return true;
                } catch (Throwable th) {
                    mo13940a(inputStream);
                    throw th;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private File m14738a(InputStream inputStream, File file) throws IOException {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        C3499c cVar = this.f11038b;
        cVar.mo13945a("extracting " + createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                C3499c cVar2 = this.f11038b;
                cVar2.mo13945a("renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                throw new IOException("failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            mo13940a(fileOutputStream);
            createTempFile.delete();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1.f11050a == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r10 = r8.f11038b;
        r10.mo13945a("lib was already loaded before: " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r0 = new java.io.File(r8.f11039c, m14746d(r9));
        r2 = r0.exists();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r10 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r2 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r8.f11038b.mo13948c(r0.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r8.f11038b.mo13947b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r4 = r8.f11038b;
        r4.mo13945a("lib is loaded: " + r9);
        r1.f11050a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        r5 = r8.f11038b;
        r5.mo13946a("fail to load " + r0.getName() + ", out lib exists: " + r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        m14740a();
        r2 = new com.bytedance.p203b.C3496b.C3498b(r8, r8.f11041e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.mo13943a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (m14744b(r0) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r10 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r10 = r8.f11038b;
        r10.mo13945a("may be system lib, no found " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r2.mo13944b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        throw new com.bytedance.p203b.C3500d("fail to extract " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r2.mo13944b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r2 = m14739a(r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        if (r2.hasNext() != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        r4 = r2.next();
        r4 = r4.substring(3, r4.length() - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (m14741a(r4) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0109, code lost:
        r5 = r8.f11038b;
        r5.mo13945a("to load depended lib " + r4);
        mo13941a(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r8.f11038b.mo13948c(r0.getPath());
        r10 = r8.f11038b;
        r10.mo13945a("loaded the lib " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0142, code lost:
        r1.f11050a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0144, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0146, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0161, code lost:
        throw new com.bytedance.p203b.C3500d("finally fail to load " + r0.getPath(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        throw new com.bytedance.p203b.C3500d("fail to load depended lib", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0184, code lost:
        throw new com.bytedance.p203b.C3500d("fail to extract " + r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        r2.mo13944b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        throw r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13941a(java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p203b.C3496b.mo13941a(java.lang.String, boolean):void");
    }

    private C3496b(ApplicationInfo applicationInfo, File file, C3499c cVar) {
        this.f11039c = file;
        this.f11038b = cVar;
        this.f11046j = applicationInfo;
        this.f11041e = new File(file, "process.lock");
    }
}
