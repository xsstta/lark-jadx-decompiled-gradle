package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.huawei.hms.base.log.c */
public class C23506c {

    /* renamed from: a */
    public final StringBuilder f57944a = new StringBuilder();

    /* renamed from: b */
    public String f57945b = null;

    /* renamed from: c */
    public String f57946c = "HMS";

    /* renamed from: d */
    public int f57947d = 0;

    /* renamed from: e */
    public long f57948e = 0;

    /* renamed from: f */
    public long f57949f = 0;

    /* renamed from: g */
    public String f57950g;

    /* renamed from: h */
    public int f57951h;

    /* renamed from: i */
    public int f57952i;

    /* renamed from: j */
    public int f57953j = 0;

    /* renamed from: a */
    public String mo82210a() {
        StringBuilder sb = new StringBuilder();
        mo82211a(sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String mo82214c() {
        StringBuilder sb = new StringBuilder();
        mo82213b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo82213b(sb);
        mo82211a(sb);
        return sb.toString();
    }

    /* renamed from: b */
    public final C23506c mo82212b() {
        this.f57948e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f57949f = currentThread.getId();
        this.f57951h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.f57953j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f57950g = stackTraceElement.getFileName();
            this.f57952i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    /* renamed from: a */
    public <T> C23506c mo82208a(T t) {
        this.f57944a.append((Object) t);
        return this;
    }

    /* renamed from: a */
    public static String m85240a(int i) {
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i == 5) {
            return "W";
        }
        if (i != 6) {
            return String.valueOf(i);
        }
        return "E";
    }

    /* renamed from: a */
    public C23506c mo82209a(Throwable th) {
        mo82208a((Object) '\n').mo82208a(Log.getStackTraceString(th));
        return this;
    }

    /* renamed from: a */
    public final StringBuilder mo82211a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f57944a.toString());
        return sb;
    }

    /* renamed from: b */
    public final StringBuilder mo82213b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f57948e)));
        String a = m85240a(this.f57947d);
        sb.append(' ');
        sb.append(a);
        sb.append('/');
        sb.append(this.f57946c);
        sb.append('/');
        sb.append(this.f57945b);
        sb.append(' ');
        sb.append(this.f57951h);
        sb.append(':');
        sb.append(this.f57949f);
        sb.append(' ');
        sb.append(this.f57950g);
        sb.append(':');
        sb.append(this.f57952i);
        sb.append(']');
        return sb;
    }

    public C23506c(int i, String str, int i2, String str2) {
        this.f57953j = i;
        this.f57945b = str;
        this.f57947d = i2;
        if (str2 != null) {
            this.f57946c = str2;
        }
        mo82212b();
    }
}
