package com.ttnet.org.chromium.net;

import android.content.Context;
import android.util.Log;
import com.ttnet.org.chromium.net.CronetEngine;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class CronetProvider {
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + "]";
    }

    protected CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderImplByClassName(context, "com.google.android.gms.net.PlayServicesCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.google.android.gms.net.GmsCoreCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.ttnet.org.chromium.net.impl.NativeCronetProvider", linkedHashSet, false);
        addCronetProviderImplByClassName(context, "com.ttnet.org.chromium.net.impl.JavaCronetProvider", linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set<CronetProvider> set) {
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        boolean z = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string != null && !string.equals("com.google.android.gms.net.PlayServicesCronetProvider") && !string.equals("com.google.android.gms.net.GmsCoreCronetProvider") && !string.equals("com.ttnet.org.chromium.net.impl.JavaCronetProvider") && !string.equals("com.ttnet.org.chromium.net.impl.NativeCronetProvider")) {
            z = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                String str = TAG;
                Log.e(str, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under " + "CronetProviderClassName" + " key");
            }
        }
        return z;
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            String str2 = TAG;
            Log.e(str2, "Unable to load provider class: " + str, exc);
            return;
        }
        String str3 = TAG;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set<CronetProvider> set, boolean z) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (InstantiationException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (InvocationTargetException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (NoSuchMethodException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (IllegalAccessException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (ClassNotFoundException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }
}
