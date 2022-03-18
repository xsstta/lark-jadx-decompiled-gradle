package com.bytedance.common.utility.tools;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.C1711a;
import com.bytedance.common.utility.io.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SafelyLibraryLoader {
    private static List<String> sLoadedLibs = new ArrayList();

    private static File getLibraryFolder(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            IOUtils.mkdir(file.getAbsolutePath());
        }
        return file;
    }

    private static File getLibraryFile(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File libraryFolder = getLibraryFolder(context);
        if (libraryFolder != null) {
            return new File(libraryFolder, mapLibraryName);
        }
        return null;
    }

    public static synchronized boolean loadLibrary(Context context, String str) {
        synchronized (SafelyLibraryLoader.class) {
            if (sLoadedLibs.contains(str)) {
                return true;
            }
            try {
                C1711a.m7628a(str);
                sLoadedLibs.add(str);
            } catch (UnsatisfiedLinkError e) {
                File libraryFile = getLibraryFile(context, str);
                if (libraryFile == null) {
                    return false;
                }
                if (libraryFile.exists()) {
                    libraryFile.delete();
                }
                String unpackLibrary = unpackLibrary(context, str, libraryFile);
                if (unpackLibrary != null) {
                    Log.e("loadLibrary", e.getMessage() + "[" + unpackLibrary + "]");
                    return false;
                }
                System.load(libraryFile.getAbsolutePath());
                sLoadedLibs.add(str);
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    private static String unpackLibrary(Context context, String str, File file) {
        InputStream inputStream;
        Throwable th;
        ZipFile zipFile;
        String message;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder();
                    sb.append("lib/");
                    String str2 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb.append(str2.substring(0, indexOf));
                    sb.append("/");
                    sb.append(System.mapLibraryName(str));
                    String sb2 = sb.toString();
                    ZipEntry entry2 = zipFile.getEntry(sb2);
                    if (entry2 == null) {
                        message = "Library entry not found:" + sb2;
                        IOUtils.close((Closeable) null);
                        IOUtils.close((Closeable) null);
                        IOUtils.close(zipFile);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                inputStream2 = zipFile.getInputStream(entry);
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                try {
                    message = th.getMessage();
                    IOUtils.close(fileOutputStream2);
                    IOUtils.close(inputStream);
                    IOUtils.close(zipFile);
                    return message;
                } catch (Throwable th3) {
                    IOUtils.close(fileOutputStream2);
                    IOUtils.close(inputStream);
                    IOUtils.close(zipFile);
                    throw th3;
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th4) {
                inputStream = inputStream2;
                th = th4;
                message = th.getMessage();
                IOUtils.close(fileOutputStream2);
                IOUtils.close(inputStream);
                IOUtils.close(zipFile);
                return message;
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        IOUtils.setPermissions(file.getAbsolutePath(), 493);
                        IOUtils.close(fileOutputStream);
                        IOUtils.close(inputStream2);
                        IOUtils.close(zipFile);
                        return null;
                    }
                }
            } catch (Throwable th5) {
                fileOutputStream2 = fileOutputStream;
                inputStream = inputStream2;
                th = th5;
                message = th.getMessage();
                IOUtils.close(fileOutputStream2);
                IOUtils.close(inputStream);
                IOUtils.close(zipFile);
                return message;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            message = th.getMessage();
            IOUtils.close(fileOutputStream2);
            IOUtils.close(inputStream);
            IOUtils.close(zipFile);
            return message;
        }
    }
}
