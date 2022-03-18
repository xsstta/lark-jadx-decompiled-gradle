package com.ss.android.lark.eetroublebase;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Log {

    /* renamed from: a */
    private static AbstractC36959a f95018a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Tags {
    }

    /* renamed from: com.ss.android.lark.eetroublebase.Log$a */
    public interface AbstractC36959a {
        /* renamed from: a */
        void mo103084a(String str, String str2);

        /* renamed from: a */
        void mo103085a(String str, String str2, String str3);

        /* renamed from: a */
        void mo103086a(String str, String str2, Throwable th);

        /* renamed from: b */
        void mo103087b(String str, String str2);
    }

    /* renamed from: a */
    public static void m145904a(AbstractC36959a aVar) {
        f95018a = aVar;
    }

    /* renamed from: a */
    public static void m145905a(String str) {
        AbstractC36959a aVar = f95018a;
        if (aVar != null) {
            aVar.mo103084a("troublekiller.log", str);
        }
    }

    /* renamed from: b */
    public static void m145907b(String str) {
        AbstractC36959a aVar = f95018a;
        if (aVar != null) {
            aVar.mo103087b("troublekiller.log", str);
        }
    }

    /* renamed from: c */
    public static void m145908c(String str) {
        AbstractC36959a aVar = f95018a;
        if (aVar != null) {
            aVar.mo103084a("troublekiller.p", str);
        }
    }

    /* renamed from: d */
    public static void m145909d(String str) {
        AbstractC36959a aVar = f95018a;
        if (aVar != null) {
            aVar.mo103084a("troublekiller.t", str);
        }
    }

    /* renamed from: a */
    public static void m145906a(String str, Throwable th) {
        AbstractC36959a aVar = f95018a;
        if (aVar != null) {
            aVar.mo103086a("troublekiller.log", str, th);
        }
    }

    /* renamed from: a */
    public static void m145903a(int i, String str, int i2, String str2) {
        String str3;
        if (f95018a != null) {
            if (C36960a.m145914a().mo136424j()) {
                str3 = "main";
            } else {
                str3 = C36960a.m145914a().mo136423i();
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "null";
            }
            Date date = new Date();
            String format = String.format("capture-%s-%s.log", str3, new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date));
            String format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS", Locale.CHINA).format(date);
            StringBuilder sb = new StringBuilder(10240);
            sb.append(format2);
            sb.append(" ");
            sb.append(str);
            sb.append("-");
            sb.append(i2);
            sb.append(" ");
            sb.append(i);
            sb.append(" ");
            sb.append(str2);
            sb.append("\n");
            String sb2 = sb.toString();
            AbstractC36959a aVar = f95018a;
            if (aVar != null) {
                aVar.mo103084a("troublekiller.capture", sb2);
                AbstractC36959a aVar2 = f95018a;
                aVar2.mo103085a("capture_logs/" + str3, format, sb2);
            }
        }
    }
}
