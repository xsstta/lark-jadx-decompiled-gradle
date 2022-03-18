package com.larksuite.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ar {

    /* renamed from: com.larksuite.framework.utils.ar$b */
    public static class C26263b {

        /* renamed from: a */
        private static int f64861a = 4096;

        /* renamed from: a */
        public void mo93372a(File file) throws IOException {
            mo93373a(file, file.getParentFile(), false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo93373a(java.io.File r9, java.io.File r10, boolean r11) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 191
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.ar.C26263b.mo93373a(java.io.File, java.io.File, boolean):void");
        }
    }

    /* renamed from: a */
    public static void m95061a(File file) throws IOException {
        new C26263b().mo93372a(file);
    }

    /* renamed from: com.larksuite.framework.utils.ar$a */
    public static class C26262a {

        /* renamed from: a */
        private static int f64860a = 4096;

        /* renamed from: a */
        private boolean m95062a(File file, List<String> list) {
            if (file == null || !CollectionUtils.isNotEmpty(list)) {
                return false;
            }
            String absolutePath = file.getAbsolutePath();
            for (String str : list) {
                if (absolutePath.endsWith(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo93370a(File file, File file2, ZipOutputStream zipOutputStream, List<String> list) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (file3.isDirectory()) {
                        mo93370a(file3, file2, zipOutputStream, list);
                    } else {
                        mo93371b(file3, file2, zipOutputStream, list);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo93371b(File file, File file2, ZipOutputStream zipOutputStream, List<String> list) throws IOException {
            if (!m95062a(file, list)) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getPath().substring(file2.getPath().length() + 1)));
                    byte[] bArr = new byte[f64860a];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            zipOutputStream.flush();
                            C26266d.m95082a(fileInputStream);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    C26266d.m95082a(fileInputStream);
                    throw th;
                }
            }
        }
    }
}
