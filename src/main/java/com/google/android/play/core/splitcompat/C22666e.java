package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.e */
public final class C22666e {

    /* renamed from: a */
    private final long f56083a;

    /* renamed from: b */
    private final Context f56084b;

    /* renamed from: c */
    private File f56085c;

    public C22666e(Context context) throws PackageManager.NameNotFoundException {
        this.f56084b = context;
        this.f56083a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: a */
    private static File m82501a(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: c */
    public static void m82502c(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m82502c(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    /* renamed from: d */
    private static void m82503d(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() == 0 ? new String("Unable to create directory: ") : "Unable to create directory: ".concat(valueOf));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: f */
    private final File m82504f() throws IOException {
        File file = new File(m82505g(), "verified-splits");
        m82503d(file);
        return file;
    }

    /* renamed from: g */
    private final File m82505g() throws IOException {
        File file = new File(m82507h(), Long.toString(this.f56083a));
        m82503d(file);
        return file;
    }

    /* renamed from: g */
    private final File m82506g(String str) throws IOException {
        File a = m82501a(m82509i(), str);
        m82503d(a);
        return a;
    }

    /* renamed from: h */
    private final File m82507h() throws IOException {
        if (this.f56085c == null) {
            Context context = this.f56084b;
            if (context != null) {
                this.f56085c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f56085c, "splitcompat");
        m82503d(file);
        return file;
    }

    /* renamed from: h */
    private static String m82508h(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: i */
    private final File m82509i() throws IOException {
        File file = new File(m82505g(), "native-libraries");
        m82503d(file);
        return file;
    }

    /* renamed from: a */
    public final File mo78981a(File file) throws IOException {
        return m82501a(m82504f(), file.getName());
    }

    /* renamed from: a */
    public final File mo78982a(String str) throws IOException {
        return m82501a(mo78988c(), m82508h(str));
    }

    /* renamed from: a */
    public final File mo78983a(String str, String str2) throws IOException {
        return m82501a(m82506g(str), str2);
    }

    /* renamed from: a */
    public final void mo78984a() throws IOException {
        File h = m82507h();
        String[] list = h.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f56083a))) {
                    File file = new File(h, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f56083a;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    m82502c(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo78985b() throws IOException {
        return new File(m82505g(), "lock.tmp");
    }

    /* renamed from: b */
    public final File mo78986b(String str) throws IOException {
        return m82501a(m82504f(), m82508h(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78987b(File file) throws IOException {
        C22679r.m82540a(file.getParentFile().getParentFile().equals(m82509i()), "File to remove is not a native library");
        m82502c(file);
    }

    /* renamed from: c */
    public final File mo78988c() throws IOException {
        File file = new File(m82505g(), "unverified-splits");
        m82503d(file);
        return file;
    }

    /* renamed from: c */
    public final File mo78989c(String str) throws IOException {
        File file = new File(m82505g(), "dex");
        m82503d(file);
        File a = m82501a(file, str);
        m82503d(a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<AbstractC22680s> mo78990d() throws IOException {
        File f = m82504f();
        HashSet hashSet = new HashSet();
        File[] listFiles = f.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C22664c(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo78991d(String str) throws IOException {
        m82502c(m82506g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List<String> mo78992e() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m82509i().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<File> mo78993e(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m82506g(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo78994f(String str) throws IOException {
        m82502c(mo78986b(str));
    }
}
