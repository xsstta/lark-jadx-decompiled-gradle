package com.bytedance.ee.android.file.picker.lib.dependency;

import android.os.Bundle;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.android.file.picker.lib.dependency.c */
public class C4048c {

    /* renamed from: a */
    private static IPickerLogger f12296a;

    /* renamed from: a */
    public static IPickerLogger m16851a() {
        return f12296a;
    }

    /* renamed from: b */
    private static void m16855b() {
        Log.m165383e("FilePicker", "Logger not init");
    }

    /* renamed from: a */
    public static void m16853a(IPickerLogger iPickerLogger) {
        f12296a = iPickerLogger;
    }

    /* renamed from: a */
    public static void m16852a(Bundle bundle) {
        IPickerLogger iPickerLogger;
        if (bundle != null && (iPickerLogger = f12296a) != null) {
            bundle.putParcelable("FilePickerLogger", iPickerLogger);
        }
    }

    /* renamed from: b */
    public static void m16857b(String str) {
        IPickerLogger iPickerLogger = f12296a;
        if (iPickerLogger != null) {
            iPickerLogger.mo15867b("FilePicker", str);
        } else {
            m16855b();
        }
    }

    /* renamed from: c */
    public static void m16858c(String str) {
        IPickerLogger iPickerLogger = f12296a;
        if (iPickerLogger != null) {
            iPickerLogger.mo15868c("FilePicker", str);
        } else {
            m16855b();
        }
    }

    /* renamed from: d */
    public static void m16859d(String str) {
        IPickerLogger iPickerLogger = f12296a;
        if (iPickerLogger != null) {
            iPickerLogger.mo15869d("FilePicker", str);
        } else {
            m16855b();
        }
    }

    /* renamed from: a */
    public static void m16854a(String str) {
        IPickerLogger iPickerLogger = f12296a;
        if (iPickerLogger != null) {
            iPickerLogger.mo15866a("FilePicker", str);
        } else {
            m16855b();
        }
    }

    /* renamed from: b */
    public static void m16856b(Bundle bundle) {
        if (f12296a == null && bundle != null) {
            f12296a = (IPickerLogger) bundle.getParcelable("FilePickerLogger");
        }
    }
}
