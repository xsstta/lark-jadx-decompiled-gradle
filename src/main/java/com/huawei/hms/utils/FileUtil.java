package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a */
    public static boolean f58949a;

    /* renamed from: b */
    public static ScheduledExecutorService f58950b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: com.huawei.hms.utils.FileUtil$a */
    public static class RunnableC23800a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f58951a;

        /* renamed from: b */
        public final /* synthetic */ long f58952b;

        /* renamed from: c */
        public final /* synthetic */ String f58953c;

        public void run() {
            Throwable th;
            IOException e;
            File file = this.f58951a;
            if (file == null) {
                HMSLog.m86964e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                HMSLog.m86964e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile = null;
            try {
                long length = this.f58951a.length();
                if (length > this.f58952b) {
                    String canonicalPath = this.f58951a.getCanonicalPath();
                    if (!this.f58951a.delete()) {
                        HMSLog.m86964e("FileUtil", "last file delete failed.");
                    }
                    randomAccessFile = new RandomAccessFile(new File(canonicalPath), "rw");
                } else {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f58951a, "rw");
                    try {
                        randomAccessFile2.seek(length);
                        randomAccessFile = randomAccessFile2;
                    } catch (IOException e2) {
                        e = e2;
                        randomAccessFile = randomAccessFile2;
                        try {
                            HMSLog.m86965e("FileUtil", "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = randomAccessFile2;
                        IOUtils.closeQuietly(randomAccessFile);
                        throw th;
                    }
                }
                randomAccessFile.writeBytes(this.f58953c + System.getProperty("line.separator"));
            } catch (IOException e3) {
                e = e3;
                HMSLog.m86965e("FileUtil", "writeFile exception:", e);
                IOUtils.closeQuietly(randomAccessFile);
            }
            IOUtils.closeQuietly(randomAccessFile);
        }

        public RunnableC23800a(File file, long j, String str) {
            this.f58951a = file;
            this.f58952b = j;
            this.f58953c = str;
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        if (digest == null || !HEX.encodeHexString(digest, true).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static void writeFile(File file, String str, long j) {
        f58950b.execute(new RunnableC23800a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f58949a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.m86964e("FileUtil", "file delete failed.");
                }
                f58949a = true;
            }
            writeFile(file2, str + "|" + j + "|" + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
