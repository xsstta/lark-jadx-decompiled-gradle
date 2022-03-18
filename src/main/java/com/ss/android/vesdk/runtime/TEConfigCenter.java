package com.ss.android.vesdk.runtime;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEConfigCenter;

public class TEConfigCenter {
    public static native void nativeClear();

    public static native void nativeSetBoolConfig(String str, boolean z, boolean z2, int i);

    public static native void nativeSetFloatConfig(String str, float f, boolean z, int i);

    public static native void nativeSetIntConfig(String str, int i, boolean z, int i2);

    public static native void nativeSetStringConfig(String str, String str2, boolean z, int i);

    static {
        TENativeLibsLoader.m234143a();
    }

    /* renamed from: a */
    public static void m251373a(String str, VEConfigCenter.C63827a aVar) {
        boolean z;
        if (aVar.mo220641d() == VEConfigCenter.ABType.FOREFFECT) {
            z = true;
        } else {
            z = false;
        }
        int ordinal = aVar.mo220639b().ordinal();
        if (ordinal == 0) {
            nativeSetBoolConfig(str, ((Boolean) aVar.mo220637a()).booleanValue(), z, aVar.mo220640c().ordinal());
        } else if (ordinal == 1 || ordinal == 2) {
            nativeSetIntConfig(str, ((Integer) aVar.mo220637a()).intValue(), z, aVar.mo220640c().ordinal());
        } else if (ordinal == 3) {
            nativeSetFloatConfig(str, ((Float) aVar.mo220637a()).floatValue(), z, aVar.mo220640c().ordinal());
        } else if (ordinal == 4) {
            nativeSetStringConfig(str, (String) aVar.mo220637a(), z, aVar.mo220640c().ordinal());
        }
    }
}
