package com.ss.android.ttve.monitor;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ttve.monitor.d */
public class C60221d {

    /* renamed from: a */
    private static String f150311a;

    /* renamed from: c */
    public static int m234064c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                /* class com.ss.android.ttve.monitor.C60221d.C602221 */

                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* renamed from: e */
    public static long m234067e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            return (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
        }
        return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
    }

    /* renamed from: a */
    public static String m234058a() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        if (!TextUtils.isEmpty(f150311a)) {
            return f150311a;
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String readLine = bufferedReader.readLine();
                    while (true) {
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                            String substring = readLine.substring(readLine.indexOf(":") + 1);
                            if (!TextUtils.isEmpty(substring)) {
                                f150311a = substring.trim();
                                break;
                            }
                        }
                        readLine = bufferedReader.readLine();
                    }
                    if (TextUtils.isEmpty(f150311a)) {
                        f150311a = m234059a("ro.board.platform");
                    }
                    String str = f150311a;
                    m234060a(bufferedReader);
                    m234060a(fileReader);
                    return str;
                } catch (IOException unused) {
                    m234060a(bufferedReader);
                    m234060a(fileReader);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    m234060a(bufferedReader2);
                    m234060a(fileReader);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                m234060a(bufferedReader);
                m234060a(fileReader);
                return null;
            } catch (Throwable th3) {
                th = th3;
                m234060a(bufferedReader2);
                m234060a(fileReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            bufferedReader = null;
            m234060a(bufferedReader);
            m234060a(fileReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            m234060a(bufferedReader2);
            m234060a(fileReader);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m234063b() {
        String str;
        InputStream inputStream = null;
        try {
            inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            str = "0";
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
        return str.trim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC, Splitter:B:31:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[SYNTHETIC, Splitter:B:36:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088 A[SYNTHETIC, Splitter:B:45:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC, Splitter:B:50:0x0092] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m234066d() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.monitor.C60221d.m234066d():long");
    }

    /* renamed from: a */
    private static void m234060a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static long m234057a(Context context) {
        if (Environment.getDataDirectory() != null) {
            return m234062b(context.getFilesDir().getParent());
        }
        return -1;
    }

    /* renamed from: b */
    public static int m234061b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static String m234059a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    private static long m234062b(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
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

    /* renamed from: c */
    public static int m234065c(Context context) {
        if (context == null) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point.y;
        }
        try {
            return ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 0;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return 0;
        }
    }
}
