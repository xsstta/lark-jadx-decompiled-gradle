package com.bytedance.crash.util;

import android.os.Build;
import com.bytedance.crash.util.C3943h;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.bytedance.crash.util.ad */
public final class C3930ad {

    /* renamed from: a */
    private static final StackTraceElement f12028a = new StackTraceElement("", "", "", 0);

    /* renamed from: c */
    private static boolean m16314c(String str) {
        return false;
    }

    /* renamed from: a */
    private static void m16307a(Throwable th, PrintWriter printWriter) {
        if (!(th == null || printWriter == null)) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            printWriter.println(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (z && i2 > 256) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\t... skip ");
                    sb.append((stackTrace.length - i2) - 128);
                    sb.append(" lines");
                    printWriter.println(sb.toString());
                    break;
                }
                printWriter.println("\tat " + stackTraceElement);
                i2++;
                i++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable th2 : th.getSuppressed()) {
                    m16308a(th2, printWriter, stackTrace, "Suppressed: ", "\t", newSetFromMap, SmActions.ACTION_ONTHECALL_EXIT);
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m16308a(cause, printWriter, stackTrace, "Caused by: ", "", newSetFromMap, SmActions.ACTION_ONTHECALL_EXIT);
            }
        }
    }

    /* renamed from: a */
    private static void m16306a(Throwable th, int i, String str, String str2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        try {
            NativeTools.m16236b().mo15591a(i, str2);
            NativeTools.m16236b().mo15591a(i, str);
        } catch (Throwable unused) {
        }
        m16311b(th, i);
        for (StackTraceElement stackTraceElement : stackTrace) {
            m16303a(stackTraceElement, i);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (Throwable th2 : th.getSuppressed()) {
                m16306a(th2, i, "Suppressed: ", str2 + "\t");
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m16306a(cause, i, "Caused by: ", str2);
        }
    }

    /* renamed from: a */
    private static void m16308a(Throwable th, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        if (set.contains(th)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th + "]");
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i;
        printWriter.println(str2 + str + th);
        int length = stackTrace.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (z && i3 > i) {
                printWriter.println("\t... skip " + ((stackTrace.length - i3) - (i / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i3++;
            i2++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            for (Throwable th2 : th.getSuppressed()) {
                int i4 = i / 2;
                m16308a(th2, printWriter, stackTrace, "Suppressed: ", str2 + "\t", set, i4 > 10 ? i4 : 10);
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i5 = i / 2;
            m16308a(cause, printWriter, stackTrace, "Caused by: ", str2, set, i5 > 10 ? i5 : 10);
        }
    }

    /* renamed from: a */
    public static boolean m16309a(String str, String str2) {
        String str3;
        String str4 = "";
        if (str == str4 && str2 == str4) {
            return true;
        }
        String[] strArr = null;
        String[] split = str != str4 ? str.split("\n") : null;
        if (str2 != str4) {
            strArr = str2.split("\n");
        }
        if (!(strArr == null || split == null)) {
            int i = 0;
            while (true) {
                if (i >= split.length) {
                    str3 = str4;
                    break;
                } else if (split[i].startsWith("  at ")) {
                    str3 = split[i];
                    if (str3.contains("(")) {
                        str3 = str3.split("\\(")[0];
                    }
                } else {
                    i++;
                }
            }
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                } else if (strArr[i2].startsWith("  at ")) {
                    str4 = strArr[i2];
                    if (str4.contains("(")) {
                        str4 = str4.split("\\(")[0];
                    }
                } else {
                    i2++;
                }
            }
            if (str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m16298a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m16307a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m16312b(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if (th instanceof OutOfMemoryError) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m16300a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: c */
    public static boolean m16315c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16297a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C3930ad.m16297a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0029 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m16310b(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C3930ad.m16310b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public static String m16301a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m16302a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m16305a(Throwable th, int i) {
        try {
            m16313c(th, i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m16304a(String str, int i) {
        NativeTools.m16236b().mo15591a(i, str);
    }

    /* renamed from: b */
    private static void m16311b(Throwable th, int i) {
        String localizedMessage = th.getLocalizedMessage();
        try {
            m16304a(th.getClass().getName(), i);
            if (localizedMessage != null) {
                m16304a(": ", i);
                m16304a(localizedMessage, i);
            }
            m16304a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m16313c(Throwable th, int i) {
        if (th != null && i > 0) {
            m16311b(th, i);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                m16303a(stackTraceElement, i);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                for (Throwable th2 : th.getSuppressed()) {
                    m16306a(th2, i, "Suppressed: ", "\t");
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m16306a(cause, i, "Caused by: ", "");
            }
        }
    }

    /* renamed from: a */
    public static StringBuilder m16302a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    /* renamed from: a */
    private static void m16303a(StackTraceElement stackTraceElement, int i) {
        try {
            m16304a("\tat ", i);
            m16304a(stackTraceElement.getClassName(), i);
            m16304a(".", i);
            m16304a(stackTraceElement.getMethodName(), i);
            if (stackTraceElement.isNativeMethod()) {
                m16304a("(Native Method)", i);
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    m16304a("(", i);
                    m16304a(stackTraceElement.getFileName(), i);
                    m16304a(":", i);
                    m16304a(String.valueOf(stackTraceElement.getLineNumber()), i);
                    m16304a(")", i);
                } else {
                    m16304a("(", i);
                    m16304a(stackTraceElement.getFileName(), i);
                    m16304a(")", i);
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                m16304a("(Unknown Source:", i);
                m16304a(String.valueOf(stackTraceElement.getLineNumber()), i);
                m16304a(")", i);
            } else {
                m16304a("(Unknown Source)", i);
            }
            m16304a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m16299a(Throwable th, Thread thread, PrintStream printStream, C3943h.C3944a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        C3943h hVar = new C3943h(printStream, messageDigest, aVar);
        try {
            m16307a(th, hVar);
        } catch (Throwable unused2) {
        }
        hVar.close();
        if (messageDigest != null) {
            return m16300a(messageDigest.digest());
        }
        return null;
    }
}
