package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.p041h.C1091a;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.startup.a */
public final class C1452a {

    /* renamed from: d */
    private static volatile C1452a f5108d;

    /* renamed from: e */
    private static final Object f5109e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f5110a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends AbstractC1453b<?>>> f5111b = new HashSet();

    /* renamed from: c */
    final Context f5112c;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: androidx.startup.a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.util.Set<java.lang.Class<? extends androidx.startup.b<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7690a() {
        try {
            C1091a.m5197a("Startup");
            Bundle bundle = this.f5112c.getPackageManager().getProviderInfo(new ComponentName(this.f5112c.getPackageName(), InitializationProvider.class.getName()), SmActions.ACTION_ONTHECALL_EXIT).metaData;
            String string = this.f5112c.getString(R.string.androidx_startup);
            if (bundle != null) {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (AbstractC1453b.class.isAssignableFrom(cls)) {
                            this.f5111b.add(cls);
                            mo7689a(cls, hashSet);
                        }
                    }
                }
            }
            C1091a.m5200b();
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new StartupException(e);
        } catch (Throwable th) {
            C1091a.m5200b();
            throw th;
        }
    }

    C1452a(Context context) {
        this.f5112c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1452a m6639a(Context context) {
        if (f5108d == null) {
            synchronized (f5109e) {
                if (f5108d == null) {
                    f5108d = new C1452a(context);
                }
            }
        }
        return f5108d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T mo7689a(Class<? extends AbstractC1453b<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f5109e) {
            if (C1091a.m5199a()) {
                try {
                    C1091a.m5197a(cls.getSimpleName());
                } catch (Throwable th) {
                    C1091a.m5200b();
                    throw th;
                }
            }
            if (!set.contains(cls)) {
                if (!this.f5110a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        AbstractC1453b bVar = (AbstractC1453b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends AbstractC1453b<?>>> a = bVar.mo7692a();
                        if (!a.isEmpty()) {
                            for (Class<? extends AbstractC1453b<?>> cls2 : a) {
                                if (!this.f5110a.containsKey(cls2)) {
                                    mo7689a(cls2, set);
                                }
                            }
                        }
                        t = (T) bVar.mo7691a(this.f5112c);
                        set.remove(cls);
                        this.f5110a.put(cls, t);
                    } catch (Throwable th2) {
                        throw new StartupException(th2);
                    }
                } else {
                    t = (T) this.f5110a.get(cls);
                }
                C1091a.m5200b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t;
    }
}
