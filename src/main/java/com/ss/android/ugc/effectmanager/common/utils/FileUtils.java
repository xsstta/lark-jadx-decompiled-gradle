package com.ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.io.C69104g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010(J\u001a\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020\u0011J\u0010\u0010,\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010*J\u0010\u0010.\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010*J\u000e\u0010/\u001a\u00020\u00112\u0006\u0010-\u001a\u00020*J\u000e\u00100\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ\u0012\u00101\u001a\u0004\u0018\u00010%2\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0012\u00102\u001a\u0004\u0018\u00010#2\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0010\u00103\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u00010*J\u000e\u00105\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u00106\u001a\u00020\b2\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u00010*J\u0010\u00109\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u00010\bJ\u0010\u0010;\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ$\u0010<\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010*2\b\u0010>\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010?\u001a\u00020\u0011J.\u0010<\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010*2\b\u0010>\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010?\u001a\u00020\u00112\b\b\u0002\u0010@\u001a\u00020\u0011J$\u0010<\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010?\u001a\u00020\u0011J.\u0010<\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010?\u001a\u00020\u00112\b\b\u0002\u0010@\u001a\u00020\u0011J\u001a\u0010C\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\bJ\u0018\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u00020#2\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0016\u0010F\u001a\u00020!2\u0006\u0010H\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/FileUtils;", "", "()V", "BUFFER_SIZE", "", "getBUFFER_SIZE", "()I", "TAG", "", "US_ASCII", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "getUS_ASCII", "()Ljava/nio/charset/Charset;", "UTF_8", "getUTF_8", "isSdcardAvailable", "", "()Z", "isSdcardWritable", "addPathSuffix", "originPath", "suffix", "checkFileExists", "path", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "combineFilePath", "path1", "path2", "copyStream", "", ShareHitPoint.f121868c, "Ljava/io/InputStream;", "sink", "Ljava/io/OutputStream;", "contentLength", "listener", "Lcom/ss/android/ugc/effectmanager/common/download/DownloadListener;", "createFile", "Ljava/io/File;", "isFile", "deleteContents", "dir", "deleteDir", "ensureDirExists", "getFileContent", "getFileOutputStream", "getFileStream", "getFolderSize", "folder", "joinSeparator", "readFully", "reader", "Ljava/io/Reader;", "removeDir", "fileOrDirectory", "removeFile", "rename", "from", "to", "deleteIfExists", "deleteAfterRename", "fromPath", "toPath", "unZip", "zipFilePath", "outPath", "writeToExternal", "inputStream", "cache", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.l */
public final class FileUtils {

    /* renamed from: a */
    public static final FileUtils f151342a = new FileUtils();

    /* renamed from: b */
    private static final Charset f151343b = Charset.forName("US-ASCII");

    /* renamed from: c */
    private static final Charset f151344c = Charset.forName("UTF-8");

    /* renamed from: d */
    private static final int f151345d = f151345d;

    private FileUtils() {
    }

    /* renamed from: a */
    public final Charset mo207246a() {
        return f151343b;
    }

    /* renamed from: a */
    public final void mo207247a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo207257c(File file) {
        try {
            mo207252b(file);
            if (file != null) {
                return file.delete();
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo207254b(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final synchronized void mo207259d(String str) {
        if (str != null) {
            mo207248a(new File(str));
        }
    }

    /* renamed from: c */
    public final InputStream mo207255c(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!mo207251a(file.getPath())) {
            return null;
        }
        InputStream inputStream = null;
        try {
            return new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
            return inputStream;
        }
    }

    /* renamed from: d */
    public final long mo207258d(File file) {
        File[] listFiles;
        long j;
        long j2 = 0;
        if (!(file == null || (listFiles = file.listFiles()) == null)) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                Intrinsics.checkExpressionValueIsNotNull(file2, "files[i]");
                if (file2.isFile()) {
                    j = listFiles[i].length();
                } else {
                    j = mo207258d(listFiles[i]);
                }
                j2 += j;
            }
        }
        return j2;
    }

    /* renamed from: b */
    public final void mo207252b(File file) throws IOException {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    if (file2.isDirectory()) {
                        mo207252b(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete file: " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }
    }

    /* renamed from: a */
    public final void mo207248a(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                Intrinsics.checkExpressionValueIsNotNull(file2, "child");
                if (file2.isDirectory()) {
                    mo207248a(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public final boolean mo207251a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public final File mo207245a(String str, boolean z) {
        File file = null;
        if (str != null && !TextUtils.isEmpty(str)) {
            file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (parentFile == null) {
                            Intrinsics.throwNpe();
                        }
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        kotlin.io.C69101b.m265907a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        throw r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A[SYNTHETIC, Splitter:B:35:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC, Splitter:B:41:0x0074] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo207244a(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.mo207244a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: c */
    public final String mo207256c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "suffix");
        if (str == null) {
            return null;
        }
        String str3 = File.separator;
        Intrinsics.checkExpressionValueIsNotNull(str3, "File.separator");
        if (StringsKt.endsWith$default(str, str3, false, 2, (Object) null)) {
            return StringsKt.dropLast(str, 1) + str2 + File.separator;
        }
        return str + str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0157 A[Catch:{ all -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0158 A[Catch:{ all -> 0x014c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo207253b(java.lang.String r10, java.lang.String r11) throws com.ss.android.ugc.effectmanager.common.exception.UnzipException {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.mo207253b(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo207250a(String str, String str2, boolean z, boolean z2) throws IOException {
        if (str == null) {
            return;
        }
        if (str2 != null) {
            mo207249a(new File(str), new File(str2), z, z2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo207249a(File file, File file2, boolean z, boolean z2) throws IOException {
        if (file == null) {
            return;
        }
        if (file2 != null) {
            if (z && !z2) {
                if (file2.exists()) {
                    C69104g.m265937f(file2);
                }
            }
            if (!file.renameTo(file2)) {
                if (!z2 || !z) {
                    EPLog.m235180c("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    throw new IOException();
                }
                C69104g.m265937f(file2);
                if (!file.renameTo(file2)) {
                    EPLog.m235180c("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    throw new IOException();
                }
            }
        }
    }
}
