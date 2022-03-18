package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.e */
public final class C22761e<T> {

    /* renamed from: a */
    private final T f56294a;

    /* renamed from: b */
    private final AbstractC22764b<T> f56295b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.components.e$b */
    public interface AbstractC22764b<T> {
        /* renamed from: a */
        List<String> mo79181a(T t);
    }

    /* renamed from: a */
    public List<ComponentRegistrar> mo79179a() {
        return m82729a(this.f56295b.mo79181a(this.f56294a));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.e$a */
    public static class C22763a implements AbstractC22764b<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f56296a;

        private C22763a(Class<? extends Service> cls) {
            this.f56296a = cls;
        }

        /* renamed from: b */
        private Bundle m82731b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f56296a), SmActions.ACTION_ONTHECALL_EXIT);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f56296a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public List<String> mo79181a(Context context) {
            Bundle b = m82731b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private static List<ComponentRegistrar> m82729a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } else {
                    arrayList.add((ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e);
            } catch (IllegalAccessException e2) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e2);
            } catch (InstantiationException e3) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e3);
            } catch (NoSuchMethodException e4) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e4);
            } catch (InvocationTargetException e5) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e5);
            }
        }
        return arrayList;
    }

    C22761e(T t, AbstractC22764b<T> bVar) {
        this.f56294a = t;
        this.f56295b = bVar;
    }

    /* renamed from: a */
    public static C22761e<Context> m82728a(Context context, Class<? extends Service> cls) {
        return new C22761e<>(context, new C22763a(cls));
    }
}
