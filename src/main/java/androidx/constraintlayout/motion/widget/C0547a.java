package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* renamed from: androidx.constraintlayout.motion.widget.a */
public class C0547a {
    /* renamed from: a */
    public static String m2557a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: a */
    public static String m2559a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: a */
    public static String m2558a(Context context, int i) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    /* renamed from: a */
    public static String m2560a(MotionLayout motionLayout, int i) {
        if (i == -1) {
            return "UNDEFINED";
        }
        return motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    /* renamed from: a */
    public static void m2561a(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str3);
        }
    }
}
