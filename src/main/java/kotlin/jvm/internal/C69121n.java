package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: kotlin.jvm.internal.n */
public class C69121n {
    /* renamed from: a */
    public static ClassCastException m265978a(ClassCastException classCastException) {
        throw ((ClassCastException) m265980a((Throwable) classCastException));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m265980a(T t) {
        return (T) Intrinsics.sanitizeStackTrace(t, C69121n.class.getName());
    }

    /* renamed from: b */
    public static Iterable m265984b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m265978a(e);
        }
    }

    /* renamed from: d */
    public static Collection m265987d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m265978a(e);
        }
    }

    /* renamed from: e */
    public static boolean m265988e(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static List m265990g(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m265978a(e);
        }
    }

    /* renamed from: i */
    public static Set m265992i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m265978a(e);
        }
    }

    /* renamed from: k */
    public static Map m265994k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m265978a(e);
        }
    }

    /* renamed from: a */
    public static Iterable m265979a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            m265981a(obj, "kotlin.collections.MutableIterable");
        }
        return m265984b(obj);
    }

    /* renamed from: c */
    public static Collection m265986c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            m265981a(obj, "kotlin.collections.MutableCollection");
        }
        return m265987d(obj);
    }

    /* renamed from: f */
    public static List m265989f(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            m265981a(obj, "kotlin.collections.MutableList");
        }
        return m265990g(obj);
    }

    /* renamed from: h */
    public static Set m265991h(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            m265981a(obj, "kotlin.collections.MutableSet");
        }
        return m265992i(obj);
    }

    /* renamed from: j */
    public static Map m265993j(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            m265981a(obj, "kotlin.collections.MutableMap");
        }
        return m265994k(obj);
    }

    /* renamed from: a */
    public static void m265982a(String str) {
        throw m265978a(new ClassCastException(str));
    }

    /* renamed from: l */
    public static int m265995l(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        if (obj instanceof Function22) {
            return 22;
        }
        return -1;
    }

    /* renamed from: b */
    public static Object m265985b(Object obj, int i) {
        if (obj != null && !m265983a(obj, i)) {
            m265981a(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m265981a(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m265982a(str2 + " cannot be cast to " + str);
    }

    /* renamed from: a */
    public static boolean m265983a(Object obj, int i) {
        if (!(obj instanceof Function) || m265995l(obj) != i) {
            return false;
        }
        return true;
    }
}
