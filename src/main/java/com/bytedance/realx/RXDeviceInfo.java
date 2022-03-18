package com.bytedance.realx;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public class RXDeviceInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class com.bytedance.realx.RXDeviceInfo.C205681 */

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

    public static String GetDeviceBrand() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String GetDeviceModel() {
        if (Build.MODEL == null) {
            return "";
        }
        return Build.MODEL;
    }

    public static int getNumberOfCPUCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int getCPUMaxFreqKHz() {
        int i = -1;
        for (int i2 = 0; i2 < getNumberOfCPUCores(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[SmActions.ACTION_ONTHECALL_EXIT];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (Character.isDigit(bArr[i3]) && i3 < 128) {
                            i3++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                        if (valueOf.intValue() > i) {
                            i = valueOf.intValue();
                        }
                    } catch (NumberFormatException e) {
                        Log.e("DeviceInfo", "getCPUMaxFreqKHz failed!", e);
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused) {
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue > i) {
                    i = parseFileForValue;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7 A[SYNTHETIC, Splitter:B:35:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4 A[SYNTHETIC, Splitter:B:40:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3 A[SYNTHETIC, Splitter:B:47:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100 A[SYNTHETIC, Splitter:B:52:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String GetCpuModel() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetCpuModel():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5 A[SYNTHETIC, Splitter:B:38:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2 A[SYNTHETIC, Splitter:B:43:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[SYNTHETIC, Splitter:B:50:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e A[SYNTHETIC, Splitter:B:55:0x010e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int GetTotalMemSize() {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetTotalMemSize():int");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getTotalMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1024);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.getCoresFromFileInfo(java.lang.String):int");
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
