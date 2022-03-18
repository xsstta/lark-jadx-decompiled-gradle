package com.bytedance.services.apm.api;

import java.util.Collection;
import java.util.Map;

public class EnsureManager {
    private static IEnsure sEnsure;

    private EnsureManager() {
    }

    public static IEnsure getEnsureImpl() {
        return sEnsure;
    }

    public static void ensureNotReachHere() {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere();
        }
    }

    public static void setEnsureImpl(IEnsure iEnsure) {
        sEnsure = iEnsure;
    }

    public static boolean ensureFalse(boolean z) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureFalse(z);
        return z;
    }

    public static boolean ensureNotNull(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj);
        return z;
    }

    public static boolean ensureTrue(boolean z) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureTrue(z);
        return z;
    }

    public static boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (collection == null || collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotEmpty(collection);
        return z;
    }

    public static void ensureNotReachHere(String str) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str);
        }
    }

    public static void ensureNotReachHere(Throwable th) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th);
        }
    }

    public static boolean ensureFalse(boolean z, String str) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureFalse(z, str);
        return z;
    }

    public static boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj, str);
        return z;
    }

    public static boolean ensureTrue(boolean z, String str) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureTrue(z, str);
        return z;
    }

    public static void ensureNotReachHere(String str, Map<String, String> map) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str, map);
        }
    }

    public static void ensureNotReachHere(Throwable th, String str) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th, str);
        }
    }

    public static boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureFalse(z, str, map);
        return z;
    }

    public static boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureTrue(z, str, map);
        return z;
    }

    public static void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th, str, map);
        }
    }

    public static void reportLogEException(int i, Throwable th, String str, boolean z) {
        IEnsure iEnsure = sEnsure;
        if (iEnsure != null) {
            iEnsure.reportLogException(i, th, str);
        }
    }
}
