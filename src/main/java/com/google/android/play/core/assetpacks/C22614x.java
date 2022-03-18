package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.x */
public final class C22614x {

    /* renamed from: a */
    private static final C22630b f55989a = new C22630b("AssetPackStorage");

    /* renamed from: b */
    private static final long f55990b = TimeUnit.DAYS.toMillis(14);

    /* renamed from: c */
    private static final long f55991c = TimeUnit.DAYS.toMillis(28);

    /* renamed from: d */
    private final Context f55992d;

    /* renamed from: e */
    private final ch f55993e;

    C22614x(Context context, ch chVar) {
        this.f55992d = context;
        this.f55993e = chVar;
    }

    /* renamed from: a */
    private final File m82186a(String str, int i) {
        return new File(m82192f(str), String.valueOf(i));
    }

    /* renamed from: a */
    private static void m82187a(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b = m82188b(file);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(b)) && !file2.getName().equals("stale.tmp")) {
                    m82189c(file2);
                }
            }
        }
    }

    /* renamed from: b */
    private static long m82188b(File file) {
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e) {
                f55989a.mo78872a(e, "Corrupt asset pack directories.", new Object[0]);
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static boolean m82189c(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!m82189c(file2)) {
                    z = false;
                }
            }
        }
        if (file.delete()) {
            return z;
        }
        return false;
    }

    /* renamed from: e */
    private final List<File> m82190e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (!m82193g().exists() || m82193g().listFiles() == null) {
                return arrayList;
            }
            File[] listFiles = m82193g().listFiles();
            for (File file : listFiles) {
                if (!file.getCanonicalPath().equals(m82191f().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        } catch (IOException e) {
            f55989a.mo78873b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: f */
    private final File m82191f() {
        return new File(m82193g(), "_tmp");
    }

    /* renamed from: f */
    private final File m82192f(String str) {
        return new File(m82193g(), str);
    }

    /* renamed from: g */
    private final File m82193g() {
        return new File(this.f55992d.getFilesDir(), "assetpacks");
    }

    /* renamed from: g */
    private final File m82194g(String str, int i, long j) {
        return new File(mo78833c(str, i, j), "merge.tmp");
    }

    /* renamed from: h */
    private final File m82195h(String str, int i, long j) {
        return new File(new File(new File(m82191f(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC22575a mo78823a(String str) throws IOException {
        String b = mo78831b(str);
        if (b == null) {
            return null;
        }
        File file = new File(b, "assets");
        if (file.isDirectory()) {
            return AbstractC22575a.m81933a(b, file.getCanonicalPath());
        }
        f55989a.mo78873b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo78824a(String str, int i, long j) {
        return new File(m82186a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo78825a(String str, int i, long j, String str2) {
        return new File(new File(new File(m82195h(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, AbstractC22575a> mo78826a() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m82190e()) {
                AbstractC22575a a = mo78823a(file.getName());
                if (a != null) {
                    hashMap.put(file.getName(), a);
                }
            }
        } catch (IOException e) {
            f55989a.mo78873b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78827a(String str, int i, long j, int i2) throws IOException {
        File g = m82194g(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        g.getParentFile().mkdirs();
        g.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(g);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78828a(List<String> list) {
        int a = this.f55993e.mo78791a();
        List<File> e = m82190e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            File file = e.get(i);
            if (!list.contains(file.getName()) && m82188b(file) != ((long) a)) {
                m82189c(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo78829b(String str, int i, long j) {
        return new File(mo78824a(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo78830b(String str, int i, long j, String str2) {
        return new File(new File(new File(m82195h(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo78831b(String str) throws IOException {
        int length;
        File file = new File(m82193g(), str);
        if (!file.exists()) {
            f55989a.mo78871a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f55993e.mo78791a()));
        if (!file2.exists()) {
            f55989a.mo78871a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f55993e.mo78791a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f55989a.mo78871a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f55993e.mo78791a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f55989a.mo78873b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f55993e.mo78791a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<String, Long> mo78832b() {
        HashMap hashMap = new HashMap();
        for (String str : mo78826a().keySet()) {
            hashMap.put(str, Long.valueOf(mo78841e(str)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo78833c(String str, int i, long j) {
        return new File(m82195h(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo78834c(String str, int i, long j, String str2) {
        return new File(mo78844f(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo78835c() {
        List<File> e = m82190e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            File file = e.get(i);
            if (file.listFiles() != null) {
                m82187a(file);
                long b = m82188b(file);
                if (((long) this.f55993e.mo78791a()) != b) {
                    try {
                        new File(new File(file, String.valueOf(b)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f55989a.mo78873b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m82187a(file2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo78836c(String str) {
        if (m82192f(str).exists()) {
            return m82189c(m82192f(str));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo78837d(String str) {
        return (int) m82188b(m82192f(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo78838d(String str, int i, long j) throws IOException {
        File g = m82194g(str, i, j);
        if (!g.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(g);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new ay("Merge checkpoint file corrupt.", e);
                }
            } else {
                throw new ay("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            bx.m82371a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final File mo78839d(String str, int i, long j, String str2) {
        return new File(mo78844f(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo78840d() {
        m82189c(m82193g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo78841e(String str) {
        return m82188b(m82186a(str, mo78837d(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final File mo78842e(String str, int i, long j) {
        return new File(new File(m82195h(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final File mo78843e(String str, int i, long j, String str2) {
        return new File(mo78844f(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final File mo78844f(String str, int i, long j, String str2) {
        return new File(mo78842e(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo78845f(String str, int i, long j) {
        if (m82195h(str, i, j).exists()) {
            m82189c(m82195h(str, i, j));
        }
    }
}
