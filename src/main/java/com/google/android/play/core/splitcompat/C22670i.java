package com.google.android.play.core.splitcompat;

import android.util.Log;
import com.google.android.play.core.internal.bx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.i */
public final class C22670i implements AbstractC22672k {

    /* renamed from: a */
    final /* synthetic */ Set f56094a;

    /* renamed from: b */
    final /* synthetic */ AbstractC22680s f56095b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f56096c;

    C22670i(Set set, AbstractC22680s sVar, ZipFile zipFile) {
        this.f56094a = set;
        this.f56095b = sVar;
        this.f56096c = zipFile;
    }

    @Override // com.google.android.play.core.splitcompat.AbstractC22672k
    /* renamed from: a */
    public final void mo78995a(C22673l lVar, File file, boolean z) throws IOException {
        this.f56094a.add(file);
        if (!z) {
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f56095b.mo78976b(), lVar.f56097a, this.f56095b.mo78975a().getAbsolutePath(), lVar.f56098b.getName(), file.getAbsolutePath()));
            ZipFile zipFile = this.f56096c;
            ZipEntry zipEntry = lVar.f56098b;
            int i = C22674m.f56099a;
            byte[] bArr = new byte[4096];
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Throwable th) {
                        bx.m82371a(th, th);
                    }
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                bx.m82371a(th, th2);
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }
}
