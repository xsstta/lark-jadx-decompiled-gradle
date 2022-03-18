package androidx.navigation;

import androidx.navigation.Navigator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.navigation.s */
public class C1293s {

    /* renamed from: a */
    private static final HashMap<Class<?>, String> f4605a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, Navigator<? extends NavDestination>> f4606b = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, Navigator<? extends NavDestination>> mo6459a() {
        return this.f4606b;
    }

    /* renamed from: b */
    private static boolean m5923b(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Navigator<? extends NavDestination> mo6456a(Navigator<? extends NavDestination> navigator) {
        return mo6458a(m5922a((Class<? extends Navigator>) navigator.getClass()), navigator);
    }

    /* renamed from: b */
    public final <T extends Navigator<?>> T mo6460b(Class<T> cls) {
        return (T) mo6457a(m5922a(cls));
    }

    /* renamed from: a */
    static String m5922a(Class<? extends Navigator> cls) {
        HashMap<Class<?>, String> hashMap = f4605a;
        String str = hashMap.get(cls);
        if (str == null) {
            Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
            if (name != null) {
                str = name.value();
            } else {
                str = null;
            }
            if (m5923b(str)) {
                hashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
        }
        return str;
    }

    /* renamed from: a */
    public <T extends Navigator<?>> T mo6457a(String str) {
        if (m5923b(str)) {
            Navigator<? extends NavDestination> navigator = this.f4606b.get(str);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: a */
    public Navigator<? extends NavDestination> mo6458a(String str, Navigator<? extends NavDestination> navigator) {
        if (m5923b(str)) {
            return this.f4606b.put(str, navigator);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
