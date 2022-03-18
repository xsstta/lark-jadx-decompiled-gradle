package com.ss.ttm.player;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

public final class TTCrashUtil {
    private static void deleteTrackFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static String getBase64SampleCrash(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public static void checkTrackDir(String str) {
        File file = new File(String.format("%s/ttplayer_logs", str));
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public static final String existsCrashFilePath(Context context) {
        if (TTPlayerConfiger.getValue(18, 1) == 1) {
            String appCrashFilePath = TTPlayerConfiger.getAppCrashFilePath(context);
            if (appCrashFilePath == null || !new File(appCrashFilePath).exists()) {
                return null;
            }
            return appCrashFilePath;
        }
        String appCrashFilePath2 = TTPlayerConfiger.getAppCrashFilePath2(context);
        if (appCrashFilePath2 != null && new File(appCrashFilePath2).exists()) {
            return appCrashFilePath2;
        }
        String plugerCrashFilePath = TTPlayerConfiger.getPlugerCrashFilePath(context);
        if (plugerCrashFilePath != null && new File(plugerCrashFilePath).exists()) {
            return plugerCrashFilePath;
        }
        String externalStorageDirectoryCrashFilePath = TTPlayerConfiger.getExternalStorageDirectoryCrashFilePath(context);
        if (externalStorageDirectoryCrashFilePath == null || new File(externalStorageDirectoryCrashFilePath).exists()) {
            return externalStorageDirectoryCrashFilePath;
        }
        return null;
    }

    public static void checkLogDir(String str) {
        File file = new File(String.format("%s/ttplayer_logs", str));
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
            if (!mkdir) {
                Log.d("ttmp", "mkdir:" + file.getName() + "," + mkdir);
            }
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    boolean delete = file2.delete();
                    if (!delete) {
                        Log.d("ttmp", "delete file:" + file2.getName() + "," + delete);
                    }
                }
            }
            boolean delete2 = file.delete();
            if (!delete2) {
                Log.d("ttmp", "delete dir file:" + file.getName() + "," + delete2);
            }
        }
    }

    public static void deleteDebugTrackFile(long j, String str) {
        deleteTrackFile(getDebugTrackFilePath(j, str));
    }

    public static void deleteTrackFile(long j, String str) {
        deleteTrackFile(getTrackFilePath(j, str));
    }

    public static void deleteCrashFile(Context context, String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean existsCrashFile(Context context, String str) {
        if (context == null && str == null) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean existsTrackFile(long j, String str) {
        return new File(getTrackFilePath(j, str)).exists();
    }

    public static void compress(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }

    private static String getDebugTrackFilePath(long j, String str) {
        return String.format(Locale.US, "%s/ttplayer_logs/%d_d.log", str, Long.valueOf(j));
    }

    public static String getTrackFilePath(long j, String str) {
        return String.format(Locale.US, "%s/ttplayer_logs/%d.log", str, Long.valueOf(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.io.File r5, java.lang.StringBuilder r6) {
        /*
            r0 = 0
            boolean r1 = r5.exists()     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 != 0) goto L_0x0009
            return r2
        L_0x0009:
            r1 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r1]     // Catch:{ all -> 0x0024 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0024 }
            r4.<init>(r5)     // Catch:{ all -> 0x0024 }
        L_0x0012:
            int r5 = r4.read(r3)     // Catch:{ all -> 0x0021 }
            if (r5 <= 0) goto L_0x001d
            r6.append(r3, r2, r5)     // Catch:{ all -> 0x0021 }
            if (r5 >= r1) goto L_0x0012
        L_0x001d:
            r4.close()     // Catch:{ all -> 0x0021 }
            goto L_0x003b
        L_0x0021:
            r5 = move-exception
            r0 = r4
            goto L_0x0025
        L_0x0024:
            r5 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L_0x003b:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.io.File, java.lang.StringBuilder):boolean");
    }

    public static boolean existLogsFile(long j, String str) {
        File[] listFiles;
        String valueOf = String.valueOf(j);
        File file = new File(String.format("%s/ttplayer_logs", str));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            Log.i("ttmp", "<TTCrashUtils,existLogsFile,375>file:" + name + ",pname:" + valueOf);
            if (!(name == null || name.startsWith(valueOf))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[SYNTHETIC, Splitter:B:17:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.lang.String r5, java.lang.StringBuilder r6) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0036 }
            r1.<init>(r5)     // Catch:{ all -> 0x0036 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0036 }
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "path"
            r6.append(r1)     // Catch:{ all -> 0x0036 }
            r6.append(r5)     // Catch:{ all -> 0x0036 }
            java.lang.String r5 = " not exists.\r\n"
            r6.append(r5)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x001b:
            r5 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r5]     // Catch:{ all -> 0x0036 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0036 }
            r4.<init>(r1)     // Catch:{ all -> 0x0036 }
        L_0x0024:
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0033 }
            if (r0 <= 0) goto L_0x002f
            r6.append(r2, r3, r0)     // Catch:{ all -> 0x0033 }
            if (r0 >= r5) goto L_0x0024
        L_0x002f:
            r4.close()     // Catch:{ all -> 0x0033 }
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
            r0 = r4
            goto L_0x0037
        L_0x0036:
            r5 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            java.lang.String r0 = "track message:"
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = "\r\n"
            r6.append(r5)
        L_0x004d:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.lang.String, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f A[SYNTHETIC, Splitter:B:27:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void saveException(java.lang.Throwable r2, java.lang.String r3) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x000f
            return
        L_0x000f:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0048, all -> 0x0036 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0036 }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.String r3 = "EXCE"
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r0.write(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r2.printStackTrace(r0)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r0.close()
            r1.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0058
        L_0x002d:
            r2 = move-exception
            r3 = r0
            goto L_0x0038
        L_0x0030:
            r3 = r0
            goto L_0x0049
        L_0x0032:
            r2 = move-exception
            goto L_0x0038
        L_0x0034:
            goto L_0x0049
        L_0x0036:
            r2 = move-exception
            r1 = r3
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3.close()
        L_0x003d:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0047:
            throw r2
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.close()
        L_0x004e:
            if (r1 == 0) goto L_0x0058
            r1.close()
            goto L_0x0058
        L_0x0054:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveException(java.lang.Throwable, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC, Splitter:B:23:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveLowMemoryInfo(int r2, java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0032 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0032 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r3.<init>()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.lang.String r0 = "LOWM\r\nrecv low memory warring info.level:"
            r3.append(r0)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r3.append(r2)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.write(r2)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x002a:
            r2 = move-exception
            r3 = r1
            goto L_0x0041
        L_0x002d:
            r2 = move-exception
            r3 = r1
            goto L_0x0033
        L_0x0030:
            r2 = move-exception
            goto L_0x0041
        L_0x0032:
            r2 = move-exception
        L_0x0033:
            r2.printStackTrace()     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0040
            r3.close()
            goto L_0x0040
        L_0x003c:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r3 = move-exception
            r3.printStackTrace()
        L_0x004b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveLowMemoryInfo(int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[SYNTHETIC, Splitter:B:23:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveStopInfo(java.lang.String r2, java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x000c
            return
        L_0x000c:
            r2 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0041, all -> 0x003d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0041, all -> 0x003d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003b }
            r2.<init>()     // Catch:{ IOException -> 0x003b }
            java.lang.String r0 = "STOP recv stop info:"
            r2.append(r0)     // Catch:{ IOException -> 0x003b }
            r2.append(r3)     // Catch:{ IOException -> 0x003b }
            java.lang.String r3 = ".time:"
            r2.append(r3)     // Catch:{ IOException -> 0x003b }
            java.lang.String r3 = com.ss.ttm.utils.AVTime.getFormatNow()     // Catch:{ IOException -> 0x003b }
            r2.append(r3)     // Catch:{ IOException -> 0x003b }
            java.lang.String r3 = "\r\n"
            r2.append(r3)     // Catch:{ IOException -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x003b }
            r1.write(r2)     // Catch:{ IOException -> 0x003b }
            r1.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0051
        L_0x003b:
            r2 = move-exception
            goto L_0x0044
        L_0x003d:
            r3 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0053
        L_0x0041:
            r3 = move-exception
            r1 = r2
            r2 = r3
        L_0x0044:
            r2.printStackTrace()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0051
            r1.close()
            goto L_0x0051
        L_0x004d:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0051:
            return
        L_0x0052:
            r2 = move-exception
        L_0x0053:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r3 = move-exception
            r3.printStackTrace()
        L_0x005d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveStopInfo(java.lang.String, java.lang.String):void");
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    public static void addTrackInfo(long j, String str, String str2) {
        appendTrackInfo(getTrackFilePath(j, str), true, str2);
    }

    public static boolean readDebugTrackInfos(long j, String str, StringBuilder sb) {
        return getTrackFileInfos(getDebugTrackFilePath(j, str), sb);
    }

    public static boolean readTrackInfos(long j, String str, StringBuilder sb) {
        return getTrackFileInfos(getTrackFilePath(j, str), sb);
    }

    public static boolean moveTrackFile(long j, long j2, String str) {
        return new File(getTrackFilePath(j, str)).renameTo(new File(getTrackFilePath(j2, str)));
    }

    private static void appendTrackInfo(String str, boolean z, String str2) {
        Throwable th;
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(str, z);
            try {
                fileWriter2.write(str2);
                try {
                    fileWriter2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                fileWriter = fileWriter2;
                fileWriter.close();
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                try {
                    fileWriter.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileWriter.close();
        } catch (Throwable th3) {
            th = th3;
            fileWriter.close();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[SYNTHETIC, Splitter:B:24:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r7, java.lang.String r8, java.lang.StringBuilder r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    public static boolean readLogsInfo(long j, String str, StringBuilder sb) {
        File[] listFiles;
        String valueOf = String.valueOf(j);
        File file = new File(String.format("%s/ttplayer_logs", str));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (name != null && !name.startsWith(valueOf) && getTrackFileInfos(file2, sb)) {
                boolean delete = file2.delete();
                if (!delete) {
                    Log.d("ttmp", "delete file:" + file2.getName() + "," + delete);
                }
                return delete;
            }
        }
        return false;
    }

    public static void addDebugTrackInfo(long j, String str, String str2, boolean z) {
        appendTrackInfo(getDebugTrackFilePath(j, str), z, str2);
    }

    public static void addTrackInfo(long j, String str, String str2, boolean z) {
        appendTrackInfo(getTrackFilePath(j, str), z, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC, Splitter:B:45:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0082 A[Catch:{ IOException -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008d A[SYNTHETIC, Splitter:B:57:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0095 A[Catch:{ IOException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC, Splitter:B:69:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00a8 A[Catch:{ IOException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
