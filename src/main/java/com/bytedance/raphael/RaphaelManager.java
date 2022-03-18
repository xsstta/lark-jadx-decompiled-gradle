package com.bytedance.raphael;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.upload.CrashUploader;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class RaphaelManager {
    static AtomicBoolean isRunning = new AtomicBoolean(false);

    static boolean isOV23() {
        if (("OPPO".equals(Build.MANUFACTURER) || "vivo".equals(Build.MANUFACTURER)) && Build.VERSION.SDK_INT == 23) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int getVmPeak() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.raphael.RaphaelManager.getVmPeak():int");
    }

    /* renamed from: com.bytedance.raphael.RaphaelManager$a */
    static class C20562a implements ICrashCallback {

        /* renamed from: a */
        Context f50136a;

        public C20562a(Context context) {
            this.f50136a = context;
        }

        @Override // com.bytedance.crash.ICrashCallback
        public void onCrash(CrashType crashType, String str, Thread thread) {
            if (RaphaelManager.isRunning.compareAndSet(true, false) && RaphaelManager.getVmPeak() > 3600000) {
                Raphael.print();
            }
        }
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void checkAndUpload(Context context) {
        File externalFilesDir = context.getExternalFilesDir("raphael");
        if (externalFilesDir == null) {
            System.err.println("RAPHAEL >>> upload failed: space is null");
            return;
        }
        File file = new File(externalFilesDir, "raphael.zip");
        if (new File(externalFilesDir, "reports").exists()) {
            compress(file, new File(externalFilesDir, "maps"), new File(externalFilesDir, "fds"), new File(externalFilesDir, "thread"), new File(externalFilesDir, "reports"));
        }
        if (!file.exists()) {
            System.err.println("RAPHAEL >>> upload failed: file not exist");
        } else if (CrashUploader.m16091a(file)) {
            file.delete();
            System.err.println("RAPHAEL >>> upload success");
        } else {
            System.err.println("RAPHAEL >>> upload failed: network error");
        }
    }

    public static void compress(File file, File... fileArr) {
        CheckedOutputStream checkedOutputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        ZipOutputStream zipOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
            } catch (Exception unused) {
                checkedOutputStream = null;
                close(zipOutputStream);
                close(checkedOutputStream);
                close(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                checkedOutputStream = null;
                close(zipOutputStream);
                close(checkedOutputStream);
                close(fileOutputStream);
                throw th;
            }
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(checkedOutputStream);
                try {
                    for (File file2 : fileArr) {
                        if (file2.exists()) {
                            compressFile(file2, zipOutputStream2, "");
                        }
                    }
                    for (File file3 : fileArr) {
                        file3.delete();
                    }
                    close(zipOutputStream2);
                } catch (Exception unused2) {
                    zipOutputStream = zipOutputStream2;
                    close(zipOutputStream);
                    close(checkedOutputStream);
                    close(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    zipOutputStream = zipOutputStream2;
                    close(zipOutputStream);
                    close(checkedOutputStream);
                    close(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused3) {
                close(zipOutputStream);
                close(checkedOutputStream);
                close(fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                close(zipOutputStream);
                close(checkedOutputStream);
                close(fileOutputStream);
                throw th;
            }
        } catch (Exception unused4) {
            checkedOutputStream = null;
            fileOutputStream = null;
            close(zipOutputStream);
            close(checkedOutputStream);
            close(fileOutputStream);
        } catch (Throwable th5) {
            th = th5;
            checkedOutputStream = null;
            fileOutputStream = null;
            close(zipOutputStream);
            close(checkedOutputStream);
            close(fileOutputStream);
            throw th;
        }
        close(checkedOutputStream);
        close(fileOutputStream);
    }

    public static void start(final Context context, boolean z) {
        File externalFilesDir = context.getExternalFilesDir("raphael");
        if (externalFilesDir != null && !isOV23()) {
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdir();
            }
            isRunning.set(true);
            Npth.registerCrashCallback(new C20562a(context), CrashType.JAVA);
            Npth.registerCrashCallback(new C20562a(context), CrashType.NATIVE);
            Raphael.start(Raphael.MAP64_MODE | Raphael.ALLOC_MODE | Raphael.DIFF_CACHE | 983040 | 4096, externalFilesDir.getAbsolutePath(), null);
            if (z) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    /* class com.bytedance.raphael.RaphaelManager.RunnableC205601 */

                    public void run() {
                        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
                            /* class com.bytedance.raphael.RaphaelManager.RunnableC205601.RunnableC205611 */

                            public void run() {
                                RaphaelManager.checkAndUpload(context);
                            }
                        });
                    }
                }, 10000);
            }
        }
    }

    private static void compressFile(File file, ZipOutputStream zipOutputStream, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        if (file.exists()) {
            BufferedInputStream bufferedInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr, 0, 1024);
                            if (read == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        close(bufferedInputStream2);
                    } catch (Exception unused) {
                        bufferedInputStream = bufferedInputStream2;
                        close(bufferedInputStream);
                        close(fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        close(bufferedInputStream);
                        close(fileInputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                    close(bufferedInputStream);
                    close(fileInputStream);
                } catch (Throwable th3) {
                    th = th3;
                    close(bufferedInputStream);
                    close(fileInputStream);
                    throw th;
                }
            } catch (Exception unused3) {
                fileInputStream = null;
                close(bufferedInputStream);
                close(fileInputStream);
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                close(bufferedInputStream);
                close(fileInputStream);
                throw th;
            }
            close(fileInputStream);
        }
    }
}
