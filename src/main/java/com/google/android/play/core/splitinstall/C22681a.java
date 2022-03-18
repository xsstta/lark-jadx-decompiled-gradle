package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import com.C1711a;
import com.google.android.play.core.internal.C22630b;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.google.android.play.core.splitinstall.a */
public class C22681a {

    /* renamed from: a */
    private static final C22630b f56113a = new C22630b("SplitInstallHelper");

    /* renamed from: a */
    public static void m82549a(Context context) {
        if (Build.VERSION.SDK_INT > 25 && Build.VERSION.SDK_INT < 28) {
            C22630b bVar = f56113a;
            bVar.mo78874c("Calling dispatchPackageBroadcast", new Object[0]);
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method method = cls.getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mAppThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
                bVar.mo78874c("Called dispatchPackageBroadcast", new Object[0]);
            } catch (Exception e) {
                f56113a.mo78872a(e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m82550a(Context context, String str) throws UnsatisfiedLinkError {
        synchronized (az.class) {
            try {
                C1711a.m7628a(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    System.load(sb2);
                } else {
                    throw e;
                }
            }
        }
    }
}
