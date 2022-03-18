package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.b */
public final class C22630b {

    /* renamed from: a */
    private final String f56028a;

    public C22630b(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f56028a = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    private final int m82297a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m82298a(this.f56028a, str, objArr));
        }
        return 0;
    }

    /* renamed from: a */
    private static String m82298a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() == 0 ? new String("Unable to format ") : "Unable to format ".concat(valueOf), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo78871a(String str, Object... objArr) {
        m82297a(3, str, objArr);
    }

    /* renamed from: a */
    public final void mo78872a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m82298a(this.f56028a, str, objArr), th);
        }
    }

    /* renamed from: b */
    public final void mo78873b(String str, Object... objArr) {
        m82297a(6, str, objArr);
    }

    /* renamed from: c */
    public final void mo78874c(String str, Object... objArr) {
        m82297a(4, str, objArr);
    }

    /* renamed from: d */
    public final void mo78875d(String str, Object... objArr) {
        m82297a(5, str, objArr);
    }
}
