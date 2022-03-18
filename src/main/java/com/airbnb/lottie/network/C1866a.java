package com.airbnb.lottie.network;

import android.content.Context;
import androidx.core.util.C0844e;
import com.airbnb.lottie.p071c.C1787d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.network.a */
public class C1866a {

    /* renamed from: a */
    private final Context f6471a;

    /* renamed from: a */
    private File m8389a() {
        File file = new File(this.f6471a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public C1866a(Context context) {
        this.f6471a = context.getApplicationContext();
    }

    /* renamed from: b */
    private File m8391b(String str) throws FileNotFoundException {
        File file = new File(m8389a(), m8390a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m8389a(), m8390a(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0844e<FileExtension, InputStream> mo9308a(String str) {
        FileExtension fileExtension;
        try {
            File b = m8391b(str);
            if (b == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(b);
            if (b.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            C1787d.m7971a("Cache hit for " + str + " at " + b.getAbsolutePath());
            return new C0844e<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9310a(String str, FileExtension fileExtension) {
        File file = new File(m8389a(), m8390a(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C1787d.m7971a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C1787d.m7973b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: a */
    private static String m8390a(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.tempExtension();
        } else {
            str2 = fileExtension.extension;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo9309a(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m8389a(), m8390a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
