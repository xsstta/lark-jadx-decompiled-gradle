package com.ss.android.lark.mediapicker.dependency;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.ss.android.lark.mediapicker.dependency.b */
public class C44677b {

    /* renamed from: a */
    private static IPickerLogger f113226a;

    /* renamed from: a */
    public static IPickerLogger m177232a() {
        return f113226a;
    }

    /* renamed from: b */
    private static void m177237b() {
        Log.e("MediaPicker", "Logger not init");
    }

    /* renamed from: a */
    public static void m177234a(IPickerLogger iPickerLogger) {
        f113226a = iPickerLogger;
    }

    /* renamed from: a */
    public static void m177233a(Bundle bundle) {
        IPickerLogger iPickerLogger;
        if (bundle != null && (iPickerLogger = f113226a) != null) {
            bundle.putParcelable("mediaPickerLogger", iPickerLogger);
        }
    }

    /* renamed from: b */
    public static void m177239b(String str) {
        IPickerLogger iPickerLogger = f113226a;
        if (iPickerLogger != null) {
            iPickerLogger.mo158260b("MediaPicker", str);
        } else {
            m177237b();
        }
    }

    /* renamed from: c */
    public static void m177240c(String str) {
        IPickerLogger iPickerLogger = f113226a;
        if (iPickerLogger != null) {
            iPickerLogger.mo158261c("MediaPicker", str);
        } else {
            m177237b();
        }
    }

    /* renamed from: d */
    public static void m177241d(String str) {
        IPickerLogger iPickerLogger = f113226a;
        if (iPickerLogger != null) {
            iPickerLogger.mo158262d("MediaPicker", str);
        } else {
            m177237b();
        }
    }

    /* renamed from: a */
    public static void m177235a(Exception exc) {
        IPickerLogger iPickerLogger = f113226a;
        if (iPickerLogger != null) {
            iPickerLogger.mo158258a("MediaPicker", exc);
        } else {
            m177237b();
        }
    }

    /* renamed from: b */
    public static void m177238b(Bundle bundle) {
        if (f113226a == null && bundle != null) {
            f113226a = (IPickerLogger) bundle.getParcelable("mediaPickerLogger");
        }
    }

    /* renamed from: a */
    public static void m177236a(String str) {
        IPickerLogger iPickerLogger = f113226a;
        if (iPickerLogger != null) {
            iPickerLogger.mo158259a("MediaPicker", str);
        } else {
            m177237b();
        }
    }
}
