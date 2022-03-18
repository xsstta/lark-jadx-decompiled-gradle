package com.bytedance.ee.bear.drive.common;

import com.bytedance.ee.log.C13479a;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.common.h */
public class C6895h {
    /* renamed from: b */
    public static void m27264b(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m27264b(listFiles[i].getAbsolutePath());
                } else {
                    m27261a(listFiles[i]);
                }
            }
            m27261a(file);
        }
    }

    /* renamed from: a */
    public static void m27260a(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m27264b(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    m27261a(listFiles[i]);
                }
            }
        }
    }

    /* renamed from: b */
    public static long m27262b(File file) {
        long j;
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isFile()) {
                        return file.length();
                    }
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        long j2 = 0;
                        for (int i = 0; i < listFiles.length; i++) {
                            if (listFiles[i].isDirectory()) {
                                j = m27262b(listFiles[i]);
                            } else {
                                j = listFiles[i].length();
                            }
                            j2 += j;
                        }
                        return j2;
                    }
                }
            } catch (Exception e) {
                C13479a.m54759a("FileUtils", "getDirSize ", e);
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static void m27265c(File file) throws Exception {
        C13479a.m54764b("FileUtils", "removeDownloadingFiles file =" + file);
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.getPath().endsWith(".drivedownload")) {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m27261a(File file) throws Exception {
        if (file != null && file.exists()) {
            String parent = file.getParent();
            File file2 = new File(parent, file.getName() + "_drive_delete");
            if (file.renameTo(file2)) {
                return file2.delete();
            }
            C13479a.m54758a("FileUtils", "rename temp delete file error, target rename file failed, file=" + file2.getName());
        }
        return false;
    }

    /* renamed from: a */
    public static void m27259a(long j, File file) throws Exception {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m27259a(j, file2);
                }
            } else if (file.lastModified() <= j) {
                m27261a(file);
            }
        }
    }

    /* renamed from: b */
    public static void m27263b(long j, File file) throws Exception {
        C13479a.m54764b("FileUtils", "removeDownloadingFiles beforeTime file = " + file);
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.getPath().endsWith(".drivedownload") && file2.lastModified() <= j) {
                    file2.delete();
                }
            }
        }
    }
}
