package com.ss.android.lark.mediapicker;

import android.os.Bundle;
import com.ss.android.lark.mediapicker.dependency.C44675a;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.dependency.IPickerImageLoader;
import com.ss.android.lark.mediapicker.dependency.IPickerLogger;

/* renamed from: com.ss.android.lark.mediapicker.a */
public class C44614a {

    /* renamed from: a */
    private static volatile boolean f113094a;

    /* renamed from: a */
    public static boolean m176966a() {
        return f113094a;
    }

    /* renamed from: a */
    public static void m176964a(Bundle bundle) {
        C44677b.m177233a(bundle);
        C44675a.m177229a(bundle);
    }

    /* renamed from: b */
    public static void m176967b(Bundle bundle) {
        C44677b.m177238b(bundle);
        C44675a.m177231b(bundle);
    }

    /* renamed from: b */
    private static void m176968b(IPickerLogger iPickerLogger, IPickerImageLoader iPickerImageLoader) {
        C44677b.m177234a(iPickerLogger);
        C44675a.m177230a(iPickerImageLoader);
    }

    /* renamed from: a */
    public static void m176965a(IPickerLogger iPickerLogger, IPickerImageLoader iPickerImageLoader) {
        if (!f113094a) {
            synchronized (C44614a.class) {
                if (!f113094a) {
                    m176968b(iPickerLogger, iPickerImageLoader);
                    C44677b.m177240c("init media picker success");
                    return;
                }
            }
        }
        C44677b.m177240c("media picker has init");
    }
}
