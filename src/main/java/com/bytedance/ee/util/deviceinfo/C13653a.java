package com.bytedance.ee.util.deviceinfo;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.util.deviceinfo.a */
public class C13653a {

    /* renamed from: a */
    private static String f35846a = null;

    /* renamed from: b */
    private static int f35847b = -1;

    /* renamed from: c */
    private static int f35848c = -1;

    /* renamed from: d */
    private static String f35849d;

    /* renamed from: c */
    public static int m55398c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                /* class com.bytedance.ee.util.deviceinfo.C13653a.C136541 */

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
    public static long m55401e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            return (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
        }
        return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
    }

    /* renamed from: f */
    public static boolean m55402f() {
        boolean z;
        if (f35847b == -1) {
            f35847b = m55407k().contains("64") ? 1 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("is64BitDevice:");
            if (f35847b == 1) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DeviceInfoUtils", sb.toString());
        }
        if (f35847b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m55403g() {
        boolean z;
        if (f35848c == -1) {
            f35848c = m55408l() ? 1 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("is64BitApp:");
            if (f35848c == 1) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("DeviceInfoUtils", sb.toString());
        }
        if (f35848c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static long m55405i() {
        try {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = (((runtime.maxMemory() - runtime.totalMemory()) + runtime.freeMemory()) / 1024) / 1024;
            C13479a.m54764b("DeviceInfoUtils", "current JavaHeapFreeSize:" + maxMemory + "m");
            return maxMemory;
        } catch (Throwable th) {
            C13479a.m54761a("DeviceInfoUtils", th);
            return -1;
        }
    }

    /* renamed from: l */
    private static boolean m55408l() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return Process.is64Bit();
            }
            String property = System.getProperty("os.arch");
            if (property == null || !property.contains("64")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C13479a.m54761a("DeviceInfoUtils", e);
            return false;
        }
    }

    /* renamed from: b */
    public static String m55396b() {
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

    /* renamed from: h */
    public static long m55404h() {
        try {
            long a = C13721c.m55642a(Pattern.compile("[^0-9]").matcher(Status.get(Process.myPid()).getValue("VmSize")).replaceAll("").trim(), 0L) / 1024;
            C13479a.m54764b("DeviceInfoUtils", "vmSize:" + a + "M");
            return a;
        } catch (Throwable th) {
            C13479a.m54761a("DeviceInfoUtils", th);
            return -1;
        }
    }

    /* renamed from: j */
    public static long m55406j() {
        long j;
        long j2;
        long j3;
        if (m55404h() <= 0) {
            return -1;
        }
        if (!m55402f()) {
            j3 = 2764;
            j2 = m55404h();
        } else if (m55403g()) {
            j = Long.MAX_VALUE;
            C13479a.m54764b("DeviceInfoUtils", "free vm memory size:" + j + "m");
            return j;
        } else {
            j3 = 3788;
            j2 = m55404h();
        }
        j = j3 - j2;
        C13479a.m54764b("DeviceInfoUtils", "free vm memory size:" + j + "m");
        return j;
    }

    /* renamed from: k */
    private static String m55407k() {
        if (f35846a == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f35846a = "";
                }
                f35846a = sb.toString();
            } catch (Exception e) {
                C13479a.m54761a("DeviceInfoUtils", e);
                f35846a = "";
            }
        }
        return f35846a;
    }

    /* renamed from: a */
    public static String m55393a() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        String str = "";
        if (!TextUtils.isEmpty(f35849d)) {
            return f35849d;
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (IOException unused) {
                m55395a(bufferedReader2);
                m55395a(fileReader);
                return str;
            } catch (Throwable th2) {
                th = th2;
                m55395a(bufferedReader2);
                m55395a(fileReader);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                while (true) {
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                        String substring = readLine.substring(readLine.indexOf(":") + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            f35849d = substring.trim();
                            break;
                        }
                    }
                    readLine = bufferedReader.readLine();
                }
                if (TextUtils.isEmpty(f35849d)) {
                    f35849d = m55394a("ro.board.platform");
                }
                if (!TextUtils.isEmpty(f35849d)) {
                    str = f35849d;
                }
                m55395a(bufferedReader);
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                m55395a(bufferedReader2);
                m55395a(fileReader);
                return str;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                m55395a(bufferedReader2);
                m55395a(fileReader);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            m55395a(bufferedReader2);
            m55395a(fileReader);
            return str;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            m55395a(bufferedReader2);
            m55395a(fileReader);
            throw th;
        }
        m55395a(fileReader);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC, Splitter:B:31:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[SYNTHETIC, Splitter:B:36:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088 A[SYNTHETIC, Splitter:B:45:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC, Splitter:B:50:0x0092] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m55400d() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.deviceinfo.C13653a.m55400d():long");
    }

    /* renamed from: a */
    private static void m55395a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static String m55397b(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception unused) {
            C13479a.m54775e("DeviceInfoUtils", "No permission");
            return "";
        }
    }

    /* renamed from: a */
    public static long m55392a(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Exception unused) {
            str = "/sdcard";
        }
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
            }
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (Exception unused2) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m55399c(Context context) {
        if (context == null) {
            C13479a.m54775e("DeviceInfoUtils", "context can't be null");
            return false;
        } else if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static String m55394a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
