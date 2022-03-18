package org.webrtc;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RXPerformanceMonitorAndroid {
    private static long sClkTck = -1;

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float getCurrentAppCPUTime() {
        Throwable th;
        String[] strArr = new String[0];
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                if (readLine != null) {
                    strArr = readLine.split(" ");
                }
                if (strArr.length > 17) {
                    float parseFloat = Float.parseFloat(strArr[13]) + Float.parseFloat(strArr[14]) + Float.parseFloat(strArr[15]) + Float.parseFloat(strArr[16]);
                    close(bufferedReader2);
                    return parseFloat;
                }
                close(bufferedReader2);
                return BitmapDescriptorFactory.HUE_RED;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                return BitmapDescriptorFactory.HUE_RED;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            return BitmapDescriptorFactory.HUE_RED;
        } catch (Throwable th3) {
            th = th3;
            close(bufferedReader);
            throw th;
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static int getPidMemorySize(int i, Context context) {
        if (context == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }
}
