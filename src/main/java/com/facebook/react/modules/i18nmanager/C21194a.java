package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.text.C0835f;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.i18nmanager.a */
public class C21194a {

    /* renamed from: a */
    private static C21194a f51669a;

    private C21194a() {
    }

    /* renamed from: a */
    public static C21194a m76928a() {
        if (f51669a == null) {
            f51669a = new C21194a();
        }
        return f51669a;
    }

    /* renamed from: b */
    private boolean m76931b() {
        if (C0835f.m3981a(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m76932c(Context context) {
        return m76929a(context, "RCTI18nUtil_allowRTL", true);
    }

    /* renamed from: d */
    private boolean m76933d(Context context) {
        return m76929a(context, "RCTI18nUtil_forceRTL", false);
    }

    /* renamed from: a */
    public boolean mo72006a(Context context) {
        if (m76933d(context)) {
            return true;
        }
        if (!m76932c(context) || !m76931b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo72008b(Context context) {
        return m76929a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    /* renamed from: a */
    public void mo72005a(Context context, boolean z) {
        m76930b(context, "RCTI18nUtil_allowRTL", z);
    }

    /* renamed from: b */
    public void mo72007b(Context context, boolean z) {
        m76930b(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    /* renamed from: c */
    public void mo72009c(Context context, boolean z) {
        m76930b(context, "RCTI18nUtil_forceRTL", z);
    }

    /* renamed from: a */
    private boolean m76929a(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    /* renamed from: b */
    private void m76930b(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
