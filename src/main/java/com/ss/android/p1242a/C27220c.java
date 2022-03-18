package com.ss.android.p1242a;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.compressors.C69789c;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: com.ss.android.a.c */
class C27220c {

    /* renamed from: h */
    private static C27223f f67716h;

    /* renamed from: a */
    public List<String> f67717a;

    /* renamed from: b */
    public Context f67718b;

    /* renamed from: c */
    private ExecutorService f67719c = Executors.newSingleThreadExecutor();

    /* renamed from: d */
    private AbstractC27227h f67720d;

    /* renamed from: e */
    private AbstractC27222d f67721e;

    /* renamed from: f */
    private String f67722f;

    /* renamed from: g */
    private boolean f67723g;

    /* renamed from: a */
    public void mo97081a(boolean z, final String[] strArr, final AbstractC27219b bVar) {
        mo97083b("NativeLibDecompression", "======= decompression function invoke ======");
        final long currentTimeMillis = System.currentTimeMillis();
        RunnableC272211 r0 = new Runnable() {
            /* class com.ss.android.p1242a.C27220c.RunnableC272211 */

            public void run() {
                String a = C27220c.this.mo97077a();
                C27220c cVar = C27220c.this;
                cVar.mo97079a("NativeLibDecompression", "======= decompress processKey: " + a + " groups: " + strArr);
                try {
                    if (!C27220c.m98937a(C27220c.this.f67718b)) {
                        C27220c.this.mo97083b("NativeLibDecompression", "so info not loaded");
                        return;
                    }
                    C27220c.this.f67717a.clear();
                    try {
                        C27220c.this.mo97082a(strArr, a);
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        C27220c cVar2 = C27220c.this;
                        cVar2.mo97079a("NativeLibDecompression", "NativeLibDecompression decompressAssetSo cost " + currentTimeMillis);
                        if (C27220c.this.f67717a.size() > 0) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            try {
                                if (!TextUtils.isEmpty(a)) {
                                    C27220c.this.mo97078a(a);
                                }
                                C27220c.this.mo97078a("");
                                C27220c cVar3 = C27220c.this;
                                cVar3.mo97079a("NativeLibDecompression", "NativeLibDecompression injectExtraSoFilePath cost " + (System.currentTimeMillis() - currentTimeMillis2));
                            } catch (Exception e) {
                                C27220c.this.mo97080a("NativeLibDecompression", "injectExtraSoFilePath exception", e);
                                AbstractC27219b bVar = bVar;
                                if (bVar != null) {
                                    bVar.mo97072a(false);
                                    return;
                                }
                                return;
                            }
                        }
                        AbstractC27219b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.mo97072a(true);
                        }
                    } catch (Exception e2) {
                        C27220c.this.mo97080a("NativeLibDecompression", "decompressAssetSo exception", e2);
                        AbstractC27219b bVar3 = bVar;
                        if (bVar3 != null) {
                            bVar3.mo97072a(false);
                        }
                    }
                } catch (IOException unused) {
                    AbstractC27219b bVar4 = bVar;
                    if (bVar4 != null) {
                        bVar4.mo97072a(true);
                    }
                }
            }
        };
        if (z) {
            this.f67719c.execute(r0);
        } else {
            r0.run();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97082a(java.lang.String[] r14, java.lang.String r15) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.p1242a.C27220c.mo97082a(java.lang.String[], java.lang.String):void");
    }

    /* renamed from: a */
    public void mo97078a(String str) throws Exception {
        Object[] objArr = new Object[this.f67717a.size()];
        File[] fileArr = new File[this.f67717a.size()];
        for (int i = 0; i < this.f67717a.size(); i++) {
            File filesDir = this.f67718b.getApplicationContext().getFilesDir();
            File file = new File(filesDir, "so_decompressed/" + m98934a(str, this.f67717a.get(i)));
            objArr[i] = NativeLibraryPathIncrementUtils.m98950a(file);
            fileArr[i] = file;
        }
        mo97079a("NativeLibDecompression", "nativeLibraryElementArray " + objArr);
        ClassLoader classLoader = this.f67718b.getApplicationContext().getClassLoader();
        mo97079a("NativeLibDecompression", "before injectExtraSoFilePath classLoader " + classLoader);
        try {
            Field a = NativeLibraryPathIncrementUtils.m98952a(classLoader, "pathList");
            a.setAccessible(true);
            Object obj = a.get(classLoader);
            if (Build.VERSION.SDK_INT >= 23) {
                NativeLibraryPathIncrementUtils.m98954b(obj, "nativeLibraryDirectories", fileArr);
                NativeLibraryPathIncrementUtils.m98953a(obj, "nativeLibraryPathElements", objArr);
            } else {
                NativeLibraryPathIncrementUtils.m98953a(obj, "nativeLibraryDirectories", fileArr);
            }
            a.set(classLoader, obj);
            mo97079a("NativeLibDecompression", "after injectExtraSoFilePath classLoader " + classLoader);
        } catch (NoSuchFieldException e) {
            mo97083b("NativeLibDecompression", "NoSuchFieldException " + e);
            throw e;
        } catch (IllegalAccessException e2) {
            mo97083b("NativeLibDecompression", "IllegalAccessException " + e2);
            throw e2;
        } catch (Exception e3) {
            mo97083b("NativeLibDecompression", "Exception " + e3);
            throw e3;
        }
    }

    /* renamed from: b */
    private String m98938b() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f67718b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo97077a() {
        String b = m98938b();
        if (!m98939b(this.f67718b.getPackageName()) && b != null) {
            return b.replace(".", "_").replace(":", "_");
        }
        return "";
    }

    /* renamed from: a */
    private String m98934a(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        String str = "";
        for (String str2 : strArr2) {
            if (!TextUtils.isEmpty(str2)) {
                str = TextUtils.isEmpty(str) ? str2 : str + "_" + str2;
            }
        }
        return str;
    }

    /* renamed from: b */
    private boolean m98939b(String str) {
        boolean z;
        String b = m98938b();
        if (str != null) {
            z = str.equals(b);
        } else {
            z = false;
        }
        mo97079a("NativeLibDecompression", "isMainProcess processName:" + b + " packageName:" + str + " result:" + z);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r2 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r2 != null) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[SYNTHETIC, Splitter:B:36:0x008a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m98933a(java.io.File r8) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.p1242a.C27220c.m98933a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized boolean m98937a(Context context) throws IOException {
        boolean z;
        synchronized (C27220c.class) {
            if (f67716h == null) {
                try {
                    f67716h = C27226g.m98964a(context.getAssets().open("so_compressed/soinfo.json"));
                } catch (IOException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            if (f67716h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo97079a(String str, String str2) {
        AbstractC27222d dVar;
        if (this.f67723g && (dVar = this.f67721e) != null) {
            dVar.mo97087b(str, str2);
        }
    }

    /* renamed from: b */
    public void mo97083b(String str, String str2) {
        AbstractC27222d dVar;
        if (this.f67723g && (dVar = this.f67721e) != null) {
            dVar.mo97085a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo97080a(String str, String str2, Throwable th) {
        AbstractC27222d dVar;
        if (this.f67723g && (dVar = this.f67721e) != null) {
            dVar.mo97086a(str, str2, th);
        }
    }

    /* renamed from: a */
    private void m98935a(String str, String str2, String str3) {
        try {
            File filesDir = this.f67718b.getApplicationContext().getFilesDir();
            File file = new File(filesDir, "so_decompressed/" + m98934a(str, str2));
            if (file.exists()) {
                File file2 = new File(file, str3);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            mo97083b("NativeLibDecompression", "deleteSoFile " + m98934a(str, str2, str3) + "fail " + e);
        }
    }

    /* renamed from: a */
    private File m98932a(String str, String str2, String str3, String str4) throws Exception {
        try {
            InputStream open = this.f67718b.getAssets().open(str);
            File filesDir = this.f67718b.getApplicationContext().getFilesDir();
            File file = new File(filesDir, "so_decompressed/" + m98934a(str4, str2));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str3);
            if (file2.exists()) {
                file2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(open);
            AbstractC69780a a = new C69789c().mo244838a(this.f67722f, bufferedInputStream);
            C69753g.m267722a(a, fileOutputStream);
            a.close();
            bufferedInputStream.close();
            open.close();
            fileOutputStream.close();
            return file2;
        } catch (Exception e) {
            mo97083b("NativeLibDecompression", "fileDecompression error: " + e);
            throw e;
        }
    }

    public C27220c(Context context, String str, boolean z, AbstractC27227h hVar, AbstractC27222d dVar) {
        ArrayList arrayList = new ArrayList();
        this.f67717a = arrayList;
        this.f67718b = context;
        this.f67722f = str;
        this.f67723g = z;
        this.f67720d = hVar;
        this.f67721e = dVar;
        arrayList.add("armeabi-v7a");
    }

    /* renamed from: a */
    private void m98936a(String str, String str2, String str3, String str4, String str5) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        File a = m98932a(str, str2, str3, str5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        mo97079a("NativeLibDecompression", "soDecompression " + str + " fileName " + a.getName() + "  cost " + currentTimeMillis2);
        long currentTimeMillis3 = System.currentTimeMillis();
        String a2 = m98933a(a);
        mo97079a("NativeLibDecompression", "soDecompression " + str + " fileName " + a.getName() + "  recal md5 cost " + (System.currentTimeMillis() - currentTimeMillis3));
        if (TextUtils.isEmpty(str4) || !str4.equals(a2)) {
            throw new RuntimeException("so decompress md5 invalid fileName: " + a.getName());
        }
        this.f67720d.mo97098a(m98934a(str5, str2, str3), str4);
    }
}
