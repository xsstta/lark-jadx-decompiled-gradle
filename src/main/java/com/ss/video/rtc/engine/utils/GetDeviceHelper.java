package com.ss.video.rtc.engine.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetDeviceHelper {
    public static String getGpuName() {
        String str;
        if (Build.VERSION.SDK_INT >= 22) {
            str = GPUUtil.getGPURenderer();
        } else {
            str = GPUUtil.getGPURendererFallback();
        }
        if (str == null) {
            return "null-null";
        }
        return str;
    }

    public static int getTotalMemory(Context context) {
        double ceil;
        Throwable th;
        BufferedReader bufferedReader;
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return -1;
            }
            activityManager.getMemoryInfo(memoryInfo);
            ceil = Math.ceil(((double) (((memoryInfo.totalMem / 1024) / 1024) / 1024)) * 1.024d);
        } else {
            long j = -1;
            BufferedReader bufferedReader2 = null;
            String str = "";
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (readLine.contains("MemTotal")) {
                                str = readLine.split(":")[1].trim();
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        bufferedReader2.close();
                        ceil = Math.ceil(((double) (((j / 1024) / 1024) / 1024)) * 1.024d);
                        return (int) ceil;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                j = Long.parseLong(str.split(" ")[0].trim());
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception unused2) {
                bufferedReader2.close();
                ceil = Math.ceil(((double) (((j / 1024) / 1024) / 1024)) * 1.024d);
                return (int) ceil;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                bufferedReader.close();
                throw th;
            }
            ceil = Math.ceil(((double) (((j / 1024) / 1024) / 1024)) * 1.024d);
        }
        return (int) ceil;
    }
}
