package com.ss.video.rtc.engine.utils;

import android.content.Context;
import android.os.Build;
import com.ss.video.rtc.engine.RtcSharedContext;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public final class RtcBuildInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class com.ss.video.rtc.engine.utils.RtcBuildInfo.C655891 */

        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getCpuName() {
        return Build.HARDWARE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static int getCpuThreads() {
        return getCpuCores();
    }

    public static String getGpuName() {
        return GetDeviceHelper.getGpuName();
    }

    public static int getMemSize() {
        try {
            Context applicationContext = RtcSharedContext.getApplicationContext();
            if (applicationContext == null) {
                return 0;
            }
            return GetDeviceHelper.getTotalMemory(applicationContext);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getCpuCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
            }
            return coresFromFileInfo;
        } catch (Exception | SecurityException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float getCpuFrequency() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.utils.RtcBuildInfo.getCpuFrequency():float");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[SYNTHETIC, Splitter:B:15:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002b, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002b, all -> 0x0024 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            int r2 = getCoresFromFileString(r0)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r2
        L_0x001f:
            r2 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0022:
            r0 = r1
            goto L_0x002c
        L_0x0024:
            r2 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            throw r2
        L_0x002b:
        L_0x002c:
            r2 = -1
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.utils.RtcBuildInfo.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int extractValue(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        if (i2 >= read) {
                            continue;
                            break;
                        }
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return extractValue(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }
}
