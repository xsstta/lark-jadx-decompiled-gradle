package com.bytedance.apm.util;

import android.content.Context;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.apm.util.e */
public class C3117e {

    /* renamed from: a */
    public static final String f10044a = "e";

    /* renamed from: a */
    public static File m12979a(Context context) {
        File file = null;
        if (context == null) {
            return null;
        }
        try {
            file = context.getExternalFilesDir(null);
            do {
                file = file.getParentFile();
            } while (file.getAbsolutePath().contains("/Android"));
        } catch (Throwable unused) {
        }
        return file;
    }

    /* renamed from: a */
    public static String m12980a(File file) {
        String[] split = file.getName().split("\\.");
        if (split.length > 1) {
            return split[split.length - 2];
        }
        return "";
    }

    /* renamed from: b */
    public static long m12985b(File file) {
        if (!file.exists()) {
            return -1;
        }
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        if (!file.isDirectory()) {
            return -1;
        }
        for (File file2 : file.listFiles()) {
            j += m12985b(file2);
        }
        return j;
    }

    /* renamed from: a */
    public static void m12982a(String str, String... strArr) {
        Throwable th;
        ZipOutputStream zipOutputStream;
        FileOutputStream fileOutputStream;
        CheckedOutputStream checkedOutputStream;
        Exception e;
        Exception e2;
        Throwable th2;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                try {
                    zipOutputStream = new ZipOutputStream(checkedOutputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    zipOutputStream = null;
                    e = e2;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th3) {
                        th = th3;
                        C20172c.m73614a(zipOutputStream);
                        C20172c.m73614a(checkedOutputStream);
                        C20172c.m73614a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    zipOutputStream = null;
                    th = th2;
                    C20172c.m73614a(zipOutputStream);
                    C20172c.m73614a(checkedOutputStream);
                    C20172c.m73614a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                checkedOutputStream = null;
                zipOutputStream = null;
                e = e2;
                throw new RuntimeException(e);
            } catch (Throwable th5) {
                th2 = th5;
                checkedOutputStream = null;
                zipOutputStream = null;
                th = th2;
                C20172c.m73614a(zipOutputStream);
                C20172c.m73614a(checkedOutputStream);
                C20172c.m73614a(fileOutputStream);
                throw th;
            }
            try {
                for (String str2 : strArr) {
                    File file = new File(str2);
                    if (file.exists()) {
                        m12981a(file, zipOutputStream, "");
                    } else {
                        throw new RuntimeException(str2 + "not exist！");
                    }
                }
                C20172c.m73614a(zipOutputStream);
                C20172c.m73614a(checkedOutputStream);
                C20172c.m73614a(fileOutputStream);
            } catch (Exception e5) {
                e = e5;
                throw new RuntimeException(e);
            }
        } catch (Exception e6) {
            e2 = e6;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            e = e2;
            throw new RuntimeException(e);
        } catch (Throwable th6) {
            th2 = th6;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            th = th2;
            C20172c.m73614a(zipOutputStream);
            C20172c.m73614a(checkedOutputStream);
            C20172c.m73614a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m12983a(List<String> list, String str) throws Exception {
        Throwable th;
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String str2 : list) {
                    File file = new File(str2);
                    m12984a(zipOutputStream2, file, file.getName());
                }
                C20172c.m73614a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                C20172c.m73614a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C20172c.m73614a(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private static void m12986b(File file, ZipOutputStream zipOutputStream, String str) {
        File[] listFiles;
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                m12981a(file2, zipOutputStream, str);
            }
        }
    }

    /* renamed from: a */
    private static void m12981a(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            m12986b(file, zipOutputStream, str + file.getName() + File.separator);
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("compress：" + str + file.getName());
        m12987c(file, zipOutputStream, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.io.BufferedInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static void m12987c(File file, ZipOutputStream zipOutputStream, String str) {
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Exception e;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        BufferedInputStream bufferedInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream5 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream4 = null;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream5;
                        fileInputStream2 = fileInputStream3;
                        fileInputStream5 = fileInputStream2;
                        C20172c.m73614a(fileInputStream5);
                        C20172c.m73614a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C20172c.m73614a(fileInputStream5);
                    C20172c.m73614a(fileInputStream);
                    throw th;
                }
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            C20172c.m73614a(bufferedInputStream);
                            C20172c.m73614a(fileInputStream);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream4 = bufferedInputStream;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    throw new RuntimeException(e);
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream2 = bufferedInputStream;
                    fileInputStream5 = fileInputStream2;
                    C20172c.m73614a(fileInputStream5);
                    C20172c.m73614a(fileInputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStream3 = null;
                throw new RuntimeException(e);
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                C20172c.m73614a(fileInputStream5);
                C20172c.m73614a(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m12984a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (int i = 0; i < listFiles.length; i++) {
                m12984a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }
}
