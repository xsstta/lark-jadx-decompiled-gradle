package com.ss.ttm.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;

public class HardWareInfo {
    private static int[] mArmArchitecture = new int[3];
    private static int mCpuType;

    private static boolean isAndroidJB2() {
        if (Build.VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    public static int getCpuFamily() {
        if (mCpuType == 0) {
            getCpuInfo();
            mCpuType = mArmArchitecture[0];
        }
        return mCpuType;
    }

    public static int[] getCpuArchitecture() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.replace("\t", "").split(":");
                    if (split.length == 2) {
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (trim.compareTo("Processor") == 0) {
                            StringBuilder sb = new StringBuilder();
                            for (int indexOf = trim2.indexOf("ARMv") + 4; indexOf < trim2.length(); indexOf++) {
                                String str = trim2.charAt(indexOf) + "";
                                if (!str.matches("\\d")) {
                                    break;
                                }
                                sb.append(str);
                            }
                            int[] iArr = mArmArchitecture;
                            iArr[0] = 1;
                            iArr[1] = Integer.parseInt(sb.toString());
                        } else if (trim.compareToIgnoreCase("Features") == 0) {
                            if (trim2.contains("neon")) {
                                mArmArchitecture[2] = 0;
                            }
                        } else if (trim.compareToIgnoreCase("model name") == 0) {
                            if (trim2.contains("Intel")) {
                                int[] iArr2 = mArmArchitecture;
                                iArr2[0] = 2;
                                iArr2[2] = 1;
                            }
                        } else if (trim.compareToIgnoreCase("cpu family") == 0) {
                            mArmArchitecture[1] = Integer.parseInt(trim2);
                        }
                    }
                } finally {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mArmArchitecture;
    }

    public static int[] getCpuInfo() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.replaceAll("\t", "").toLowerCase(Locale.US).split(":");
                    if (split.length == 2) {
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (trim2 == null) {
                            continue;
                        } else if (trim != null) {
                            if (trim.compareTo("processor") == 0) {
                                if (trim2.contains("armv") || trim2.contains("aarch64")) {
                                    mArmArchitecture[0] = 1;
                                } else if (trim2.contains("intel")) {
                                    mArmArchitecture[0] = 2;
                                    break;
                                }
                            } else if (trim.compareToIgnoreCase("features") == 0) {
                                if (trim2.contains("neon") || trim2.contains("thumb") || trim2.contains("vfpv") || trim2.contains("asimd") || trim2.contains("simd")) {
                                    mArmArchitecture[0] = 1;
                                }
                            } else if (trim.compareToIgnoreCase("model name") != 0) {
                                continue;
                            } else if (trim2.contains("intel")) {
                                mArmArchitecture[0] = 2;
                                break;
                            } else if (trim2.contains("arm")) {
                                mArmArchitecture[0] = 1;
                                break;
                            }
                        }
                    }
                } finally {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mArmArchitecture;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[SYNTHETIC, Splitter:B:22:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC, Splitter:B:29:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getProcessCpuInfo() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.HardWareInfo.getProcessCpuInfo():long");
    }

    private static long getAvailableStorageSize(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return getDirectoryAvailableSize(context.getFilesDir().getParent());
    }

    public static long[] getSDCardSize(Context context) {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            long availableStorageSize = getAvailableStorageSize(context);
            jArr[0] = getTotalStorageSize(context);
            jArr[1] = availableStorageSize;
        }
        return jArr;
    }

    private static long getTotalStorageSize(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return getDirectoryTotalSize(context.getFilesDir().getParent());
    }

    private static long getDirectoryAvailableSize(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (isAndroidJB2()) {
                j2 = statFs.getBlockSizeLong();
                j = statFs.getAvailableBlocksLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j = (long) statFs.getAvailableBlocks();
            }
            return j2 * j;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    private static long getDirectoryTotalSize(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (isAndroidJB2()) {
                j2 = statFs.getBlockSizeLong();
                j = statFs.getBlockCountLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j = (long) statFs.getBlockCount();
            }
            return j2 * j;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }
}
