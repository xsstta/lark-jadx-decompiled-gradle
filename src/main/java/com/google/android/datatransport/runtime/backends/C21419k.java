package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.k */
class C21419k implements AbstractC21412e {

    /* renamed from: a */
    private final C21420a f52017a;

    /* renamed from: b */
    private final C21417i f52018b;

    /* renamed from: c */
    private final Map<String, AbstractC21422m> f52019c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class C21420a {

        /* renamed from: a */
        private final Context f52020a;

        /* renamed from: b */
        private Map<String, String> f52021b;

        /* renamed from: a */
        private Map<String, String> m77496a() {
            if (this.f52021b == null) {
                this.f52021b = m77497a(this.f52020a);
            }
            return this.f52021b;
        }

        C21420a(Context context) {
            this.f52020a = context;
        }

        /* renamed from: b */
        private static Bundle m77498b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), SmActions.ACTION_ONTHECALL_EXIT);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        private Map<String, String> m77497a(Context context) {
            Bundle b = m77498b(context);
            if (b == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : b.keySet()) {
                Object obj = b.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC21411d mo72659a(String str) {
            String str2 = m77496a().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (AbstractC21411d) Class.forName(str2).asSubclass(AbstractC21411d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21412e
    /* renamed from: a */
    public synchronized AbstractC21422m mo72656a(String str) {
        if (this.f52019c.containsKey(str)) {
            return this.f52019c.get(str);
        }
        AbstractC21411d a = this.f52017a.mo72659a(str);
        if (a == null) {
            return null;
        }
        AbstractC21422m create = a.create(this.f52018b.mo72657a(str));
        this.f52019c.put(str, create);
        return create;
    }

    @Inject
    C21419k(Context context, C21417i iVar) {
        this(new C21420a(context), iVar);
    }

    C21419k(C21420a aVar, C21417i iVar) {
        this.f52019c = new HashMap();
        this.f52017a = aVar;
        this.f52018b = iVar;
    }
}
