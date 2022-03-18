package com.bumptech.glide.p080a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.a.e */
public final class C2103e {

    /* renamed from: a */
    private final Context f7277a;

    /* renamed from: a */
    public List<AbstractC2101c> mo10320a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f7277a.getPackageManager().getApplicationInfo(this.f7277a.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m9114a(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    public C2103e(Context context) {
        this.f7277a = context;
    }

    /* renamed from: a */
    private static AbstractC2101c m9114a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m9115a(cls, e);
            } catch (IllegalAccessException e2) {
                m9115a(cls, e2);
            } catch (NoSuchMethodException e3) {
                m9115a(cls, e3);
            } catch (InvocationTargetException e4) {
                m9115a(cls, e4);
            }
            if (obj instanceof AbstractC2101c) {
                return (AbstractC2101c) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: a */
    private static void m9115a(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
