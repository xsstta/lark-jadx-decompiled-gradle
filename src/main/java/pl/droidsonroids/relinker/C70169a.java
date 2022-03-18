package pl.droidsonroids.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import pl.droidsonroids.relinker.C70185b;

/* renamed from: pl.droidsonroids.relinker.a */
public class C70169a implements C70185b.AbstractC70186a {
    /* renamed from: a */
    private void m268962a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private String[] m268963a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr = new String[(applicationInfo.splitSourceDirs.length + 1)];
        strArr[0] = applicationInfo.sourceDir;
        System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr, 1, applicationInfo.splitSourceDirs.length);
        return strArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: pl.droidsonroids.relinker.a$a */
    public static class C70170a {

        /* renamed from: a */
        public ZipFile f175286a;

        /* renamed from: b */
        public ZipEntry f175287b;

        public C70170a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f175286a = zipFile;
            this.f175287b = zipEntry;
        }
    }

    /* renamed from: a */
    private long m268960a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    private String[] m268964a(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : m268963a(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: a */
    private C70170a m268961a(Context context, String[] strArr, String str, C70190c cVar) {
        String[] a = m268963a(context);
        int length = a.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = a[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i6] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str3;
                            objArr[1] = str2;
                            cVar.mo247350a("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new C70170a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                        c = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b5 A[SYNTHETIC, Splitter:B:72:0x00b5] */
    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70186a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo247324a(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, pl.droidsonroids.relinker.C70190c r15) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.relinker.C70169a.mo247324a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, pl.droidsonroids.relinker.c):void");
    }
}
