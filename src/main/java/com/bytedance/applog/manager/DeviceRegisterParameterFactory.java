package com.bytedance.applog.manager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.applog.p201e.C3400a;
import com.bytedance.applog.util.AbstractC3463l;
import com.bytedance.applog.util.C3456e;
import com.bytedance.applog.util.C3457f;
import com.bytedance.applog.util.C3469r;

public class DeviceRegisterParameterFactory {
    private static C3435g config;
    private static C3400a mAccountCache;
    private static volatile AbstractC3463l sDeviceRegisterParameterProvider;
    private static Boolean sIsNewUserMode;
    private static final Object sNewUserModeLocker = new Object();

    private static boolean notLocalTest() {
        C3435g gVar = config;
        if (gVar == null || !"local_test".equals(gVar.mo13836o())) {
            return true;
        }
        return false;
    }

    private static void getAccountCache(Context context) {
        if (mAccountCache == null) {
            mAccountCache = new C3400a(context);
        }
    }

    private static Boolean isNewUserModeAccount(Context context) {
        String str;
        C3469r.m14665a("DeviceRegisterParameterFactory#isNewUserModeAccount");
        getAccountCache(context);
        try {
            str = mAccountCache.mo13653a("new_user");
        } catch (Exception e) {
            e.printStackTrace();
            C3469r.m14668b("DeviceRegisterParameterFactory#isNewUserModeAccount", e);
            str = null;
        }
        return Boolean.valueOf(str);
    }

    public static boolean isNewUserMode(Context context) {
        boolean booleanValue;
        boolean z;
        if (context == null || notLocalTest()) {
            return false;
        }
        synchronized (sNewUserModeLocker) {
            if (sIsNewUserMode == null) {
                Boolean isNewUserModeClipboard = isNewUserModeClipboard(context);
                if (isNewUserModeClipboard != null) {
                    if (isNewUserModeAccount(context) != isNewUserModeClipboard) {
                        saveNewUserModeToAccount(context, isNewUserModeClipboard.booleanValue());
                    }
                    z = isNewUserModeClipboard.booleanValue();
                } else {
                    z = isNewUserModeAccount(context).booleanValue();
                }
                sIsNewUserMode = Boolean.valueOf(z);
                C3469r.m14665a("DeviceRegisterParameterFactory#isNewUserMode() returned: " + sIsNewUserMode);
            }
            booleanValue = sIsNewUserMode.booleanValue();
        }
        return booleanValue;
    }

    private static Boolean isNewUserModeClipboard(Context context) {
        ClipData primaryClip;
        boolean z;
        C3469r.m14665a("DeviceRegisterParameterFactory#isNewUserModeClipboard");
        Boolean bool = null;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (!(clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0)) {
                CharSequence text = primaryClip.getItemAt(0).getText();
                C3469r.m14665a("DeviceRegisterParameterFactory#isNewUserModeClipboard clipboard text=" + ((Object) text));
                if (getNewUserModeClipboardContent(context, true).equals(text)) {
                    z = true;
                } else if (getNewUserModeClipboardContent(context, false).equals(text)) {
                    z = false;
                }
                bool = z;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C3469r.m14668b("DeviceRegisterParameterFactory#isNewUserModeClipboard failed", th);
        }
        C3469r.m14665a("DeviceRegisterParameterFactory#isNewUserModeClipboard result=" + bool);
        return bool;
    }

    private static CharSequence getNewUserModeClipboardContent(Context context, boolean z) {
        return C3457f.m14599a(context.getPackageName() + "." + z);
    }

    public static void setNewUserMode(Context context, boolean z) {
        if (context != null && !notLocalTest()) {
            saveNewUserModeToAccount(context, z);
            saveNewUserModeToClipboard(context, z);
            synchronized (sNewUserModeLocker) {
                sIsNewUserMode = Boolean.valueOf(z);
            }
        }
    }

    private static void saveNewUserModeToAccount(Context context, boolean z) {
        C3469r.m14665a("DeviceRegisterParameterFactory#saveNewUserModeToAccount open=" + z);
        getAccountCache(context);
        try {
            mAccountCache.mo13655a("new_user", String.valueOf(z));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveNewUserModeToClipboard(Context context, boolean z) {
        C3469r.m14665a("DeviceRegisterParameterFactory#saveNewUserModeToClipboard open=" + z);
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", getNewUserModeClipboardContent(context, z)));
                C3469r.m14665a("DeviceRegisterParameterFactory#saveNewUserModeToClipboard success");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C3469r.m14668b("DeviceRegisterParameterFactory#saveNewUserModeToClipboard failed", th);
        }
    }

    public static AbstractC3463l getProvider(Context context, C3435g gVar) throws IllegalArgumentException {
        if (sDeviceRegisterParameterProvider == null) {
            synchronized (DeviceRegisterParameterFactory.class) {
                if (sDeviceRegisterParameterProvider == null) {
                    if (context != null) {
                        config = gVar;
                        getAccountCache(context);
                        if (isNewUserMode(context)) {
                            try {
                                sDeviceRegisterParameterProvider = (AbstractC3463l) Class.forName("com.bytedance.applog.manager.newuser.DeviceParamsProvider").getConstructor(Context.class, C3400a.class, C3435g.class).newInstance(context, mAccountCache, gVar);
                                C3469r.m14665a("DeviceRegisterParameterFactory create new user device param provider success");
                            } catch (Exception e) {
                                e.printStackTrace();
                                C3469r.m14668b("DeviceRegisterParameterFactoryclass com.bytedance.applog.manager.newuser.DeviceParamsProvider not fount", e);
                            }
                        }
                        if (sDeviceRegisterParameterProvider == null) {
                            sDeviceRegisterParameterProvider = new C3456e(context, gVar, mAccountCache);
                        }
                    } else {
                        throw new IllegalArgumentException("context == null");
                    }
                }
            }
        }
        return sDeviceRegisterParameterProvider;
    }
}
