package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;

final class ax implements ak {
    ax() {
    }

    @Override // com.google.android.play.core.internal.ak
    /* renamed from: a */
    public final boolean mo78869a(Object obj, File file, File file2) {
        try {
            return !((Boolean) bd.m82314a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
