package com.bytedance.ee.util.io;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ee.util.io.i */
public final class C13683i {
    /* renamed from: a */
    public static void m55567a(ZipInputStream zipInputStream, String str, boolean z) throws IOException {
        Throwable th;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null || TextUtils.isEmpty(nextEntry.getName()) || !nextEntry.getName().contains("../")) {
                C13479a.m54764b("ZipUtils", " unzipFile(): ");
                byte[] bArr = new byte[1048576];
                while (nextEntry != null) {
                    if (nextEntry.isDirectory()) {
                        File file2 = new File(str + File.separator + nextEntry.getName());
                        if (z || !file2.exists()) {
                            file2.mkdir();
                        }
                    } else {
                        File file3 = new File(str + File.separator + nextEntry.getName());
                        if (z || !file3.exists()) {
                            File parentFile = file3.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            file3.createNewFile();
                            FileOutputStream fileOutputStream = null;
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                while (true) {
                                    try {
                                        int read = zipInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, read);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream2;
                                        C13675f.m55497a(fileOutputStream);
                                        throw th;
                                    }
                                }
                                C13675f.m55497a(fileOutputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                                C13675f.m55497a(fileOutputStream);
                                throw th;
                            }
                        }
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                C13675f.m55497a(zipInputStream);
                return;
            }
            C13479a.m54775e("ZipUtils", "unzipFile: zip name inValid, contains ../");
        } finally {
            C13675f.m55497a(zipInputStream);
        }
    }

    /* renamed from: a */
    public static void m55566a(Context context, String str, String str2, boolean z) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            m55567a(new ZipInputStream(inputStream), str2, z);
        } finally {
            C13675f.m55497a(inputStream);
        }
    }
}
