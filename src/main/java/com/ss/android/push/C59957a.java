package com.ss.android.push;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.ss.android.push.a */
public class C59957a {
    /* renamed from: a */
    public static int m232682a(Intent intent, String str, int i) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException unused2) {
                return i;
            }
        }
    }

    /* renamed from: a */
    public static long m232683a(Intent intent, String str, long j) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return j;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return j;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException unused2) {
                return j;
            }
        }
    }

    /* renamed from: a */
    public static boolean m232684a(Intent intent, String str, boolean z) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || (obj = extras.get(str)) == null) {
            return z;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException unused) {
                return z;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException unused2) {
                return z;
            }
        }
    }
}
