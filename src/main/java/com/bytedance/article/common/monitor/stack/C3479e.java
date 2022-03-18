package com.bytedance.article.common.monitor.stack;

import android.os.Build;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.bytedance.article.common.monitor.stack.e */
public final class C3479e {
    /* renamed from: a */
    public static String m14715a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m14716a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* renamed from: a */
    private static void m14716a(Throwable th, PrintWriter printWriter) {
        boolean z;
        if (!(th == null || printWriter == null)) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            printWriter.println(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 384) {
                z = true;
            } else {
                z = false;
            }
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
                    m14717a(th2, printWriter, stackTrace, "Suppressed: ", "\t", newSetFromMap, SmActions.ACTION_ONTHECALL_EXIT);
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m14717a(cause, printWriter, stackTrace, "Caused by: ", "", newSetFromMap, SmActions.ACTION_ONTHECALL_EXIT);
            }
        }
    }

    /* renamed from: a */
    private static void m14717a(Throwable th, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        boolean z;
        int i2;
        int i3;
        if (set.contains(th)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th + "]");
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > i) {
            z = true;
        } else {
            z = false;
        }
        printWriter.println(str2 + str + th);
        int length = stackTrace.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (z && i5 > i) {
                printWriter.println("\t... skip " + ((stackTrace.length - i5) - (i / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i5++;
            i4++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            for (Throwable th2 : suppressed) {
                String str3 = str2 + "\t";
                int i6 = i / 2;
                if (i6 > 10) {
                    i3 = i6;
                } else {
                    i3 = 10;
                }
                m14717a(th2, printWriter, stackTrace, "Suppressed: ", str3, set, i3);
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i7 = i / 2;
            if (i7 > 10) {
                i2 = i7;
            } else {
                i2 = 10;
            }
            m14717a(cause, printWriter, stackTrace, "Caused by: ", str2, set, i2);
        }
    }
}
