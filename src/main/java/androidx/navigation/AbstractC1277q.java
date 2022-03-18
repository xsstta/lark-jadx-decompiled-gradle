package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: androidx.navigation.q */
public abstract class AbstractC1277q<T> {

    /* renamed from: a */
    public static final AbstractC1277q<Integer> f4588a = new AbstractC1277q<Integer>(false) {
        /* class androidx.navigation.AbstractC1277q.C12781 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "integer";
        }

        /* renamed from: c */
        public Integer mo6400a(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: b */
        public Integer mo6398a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };

    /* renamed from: b */
    public static final AbstractC1277q<Integer> f4589b = new AbstractC1277q<Integer>(false) {
        /* class androidx.navigation.AbstractC1277q.C12814 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "reference";
        }

        /* renamed from: c */
        public Integer mo6400a(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: b */
        public Integer mo6398a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };

    /* renamed from: c */
    public static final AbstractC1277q<int[]> f4590c = new AbstractC1277q<int[]>(true) {
        /* class androidx.navigation.AbstractC1277q.C12825 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "integer[]";
        }

        /* renamed from: c */
        public int[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: b */
        public int[] mo6398a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    };

    /* renamed from: d */
    public static final AbstractC1277q<Long> f4591d = new AbstractC1277q<Long>(false) {
        /* class androidx.navigation.AbstractC1277q.C12836 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "long";
        }

        /* renamed from: c */
        public Long mo6400a(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        /* renamed from: b */
        public Long mo6398a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    };

    /* renamed from: e */
    public static final AbstractC1277q<long[]> f4592e = new AbstractC1277q<long[]>(true) {
        /* class androidx.navigation.AbstractC1277q.C12847 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "long[]";
        }

        /* renamed from: c */
        public long[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: b */
        public long[] mo6398a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    };

    /* renamed from: f */
    public static final AbstractC1277q<Float> f4593f = new AbstractC1277q<Float>(false) {
        /* class androidx.navigation.AbstractC1277q.C12858 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "float";
        }

        /* renamed from: c */
        public Float mo6400a(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: b */
        public Float mo6398a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    };

    /* renamed from: g */
    public static final AbstractC1277q<float[]> f4594g = new AbstractC1277q<float[]>(true) {
        /* class androidx.navigation.AbstractC1277q.C12869 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "float[]";
        }

        /* renamed from: c */
        public float[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: b */
        public float[] mo6398a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    };

    /* renamed from: h */
    public static final AbstractC1277q<Boolean> f4595h = new AbstractC1277q<Boolean>(false) {
        /* class androidx.navigation.AbstractC1277q.AnonymousClass10 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "boolean";
        }

        /* renamed from: c */
        public Boolean mo6400a(String str) {
            if ("true".equals(str)) {
                return true;
            }
            if ("false".equals(str)) {
                return false;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: b */
        public Boolean mo6398a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    };

    /* renamed from: i */
    public static final AbstractC1277q<boolean[]> f4596i = new AbstractC1277q<boolean[]>(true) {
        /* class androidx.navigation.AbstractC1277q.AnonymousClass11 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "boolean[]";
        }

        /* renamed from: c */
        public boolean[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: b */
        public boolean[] mo6398a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    };

    /* renamed from: j */
    public static final AbstractC1277q<String> f4597j = new AbstractC1277q<String>(true) {
        /* class androidx.navigation.AbstractC1277q.C12792 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "string";
        }

        /* renamed from: c */
        public String mo6400a(String str) {
            return str;
        }

        /* renamed from: b */
        public String mo6398a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        /* renamed from: b */
        public void mo6401a(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    };

    /* renamed from: k */
    public static final AbstractC1277q<String[]> f4598k = new AbstractC1277q<String[]>(true) {
        /* class androidx.navigation.AbstractC1277q.C12803 */

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return "string[]";
        }

        /* renamed from: c */
        public String[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: b */
        public String[] mo6398a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    };

    /* renamed from: l */
    private final boolean f4599l;

    /* renamed from: a */
    public abstract T mo6398a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract T mo6400a(String str);

    /* renamed from: a */
    public abstract void mo6401a(Bundle bundle, String str, T t);

    /* renamed from: b */
    public abstract String mo6403b();

    /* renamed from: androidx.navigation.q$a */
    public static final class C1287a<D extends Enum> extends C1291e<D> {

        /* renamed from: l */
        private final Class<D> f4600l;

        @Override // androidx.navigation.AbstractC1277q, androidx.navigation.AbstractC1277q.C1291e
        /* renamed from: b */
        public String mo6403b() {
            return this.f4600l.getName();
        }

        public C1287a(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f4600l = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        /* renamed from: c */
        public D mo6439d(String str) {
            D[] enumConstants = this.f4600l.getEnumConstants();
            for (D d : enumConstants) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f4600l.getName() + ".");
        }
    }

    /* renamed from: androidx.navigation.q$b */
    public static final class C1288b<D extends Parcelable> extends AbstractC1277q<D[]> {

        /* renamed from: l */
        private final Class<D[]> f4601l;

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return this.f4601l.getName();
        }

        public int hashCode() {
            return this.f4601l.hashCode();
        }

        /* renamed from: c */
        public D[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4601l.equals(((C1288b) obj).f4601l);
        }

        public C1288b(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f4601l = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        /* renamed from: b */
        public D[] mo6398a(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, D[] dArr) {
            this.f4601l.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* renamed from: androidx.navigation.q$c */
    public static final class C1289c<D> extends AbstractC1277q<D> {

        /* renamed from: l */
        private final Class<D> f4602l;

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return this.f4602l.getName();
        }

        public int hashCode() {
            return this.f4602l.hashCode();
        }

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: a */
        public D mo6400a(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4602l.equals(((C1289c) obj).f4602l);
        }

        public C1289c(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f4602l = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: a */
        public D mo6398a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, D d) {
            this.f4602l.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, d);
            }
        }
    }

    /* renamed from: androidx.navigation.q$d */
    public static final class C1290d<D extends Serializable> extends AbstractC1277q<D[]> {

        /* renamed from: l */
        private final Class<D[]> f4603l;

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return this.f4603l.getName();
        }

        public int hashCode() {
            return this.f4603l.hashCode();
        }

        /* renamed from: c */
        public D[] mo6400a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f4603l.equals(((C1290d) obj).f4603l);
        }

        public C1290d(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f4603l = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        /* renamed from: b */
        public D[] mo6398a(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: D extends java.io.Serializable[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, D[] dArr) {
            this.f4603l.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    /* renamed from: androidx.navigation.q$e */
    public static class C1291e<D extends Serializable> extends AbstractC1277q<D> {

        /* renamed from: l */
        private final Class<D> f4604l;

        public int hashCode() {
            return this.f4604l.hashCode();
        }

        @Override // androidx.navigation.AbstractC1277q
        /* renamed from: b */
        public String mo6403b() {
            return this.f4604l.getName();
        }

        /* renamed from: d */
        public D mo6400a(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1291e)) {
                return false;
            }
            return this.f4604l.equals(((C1291e) obj).f4604l);
        }

        public C1291e(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f4604l = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        /* renamed from: b */
        public D mo6398a(Bundle bundle, String str) {
            return (D) ((Serializable) bundle.get(str));
        }

        C1291e(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f4604l = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        /* renamed from: a */
        public void mo6401a(Bundle bundle, String str, D d) {
            this.f4604l.cast(d);
            bundle.putSerializable(str, d);
        }
    }

    public String toString() {
        return mo6403b();
    }

    /* renamed from: a */
    public boolean mo6402a() {
        return this.f4599l;
    }

    AbstractC1277q(boolean z) {
        this.f4599l = z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = androidx.navigation.AbstractC1277q.f4595h;
        r0.mo6400a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return androidx.navigation.AbstractC1277q.f4597j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = androidx.navigation.AbstractC1277q.f4591d;
        r0.mo6400a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = androidx.navigation.AbstractC1277q.f4593f;
        r0.mo6400a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.navigation.AbstractC1277q m5805b(java.lang.String r1) {
        /*
            androidx.navigation.q<java.lang.Integer> r0 = androidx.navigation.AbstractC1277q.f4588a     // Catch:{ IllegalArgumentException -> 0x0006 }
            r0.mo6400a(r1)     // Catch:{ IllegalArgumentException -> 0x0006 }
            return r0
        L_0x0006:
            androidx.navigation.q<java.lang.Long> r0 = androidx.navigation.AbstractC1277q.f4591d     // Catch:{ IllegalArgumentException -> 0x000c }
            r0.mo6400a(r1)     // Catch:{ IllegalArgumentException -> 0x000c }
            return r0
        L_0x000c:
            androidx.navigation.q<java.lang.Float> r0 = androidx.navigation.AbstractC1277q.f4593f     // Catch:{ IllegalArgumentException -> 0x0012 }
            r0.mo6400a(r1)     // Catch:{ IllegalArgumentException -> 0x0012 }
            return r0
        L_0x0012:
            androidx.navigation.q<java.lang.Boolean> r0 = androidx.navigation.AbstractC1277q.f4595h     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.mo6400a(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r0
        L_0x0018:
            androidx.navigation.q<java.lang.String> r1 = androidx.navigation.AbstractC1277q.f4597j
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.AbstractC1277q.m5805b(java.lang.String):androidx.navigation.q");
    }

    /* renamed from: a */
    static AbstractC1277q m5803a(Object obj) {
        if (obj instanceof Integer) {
            return f4588a;
        }
        if (obj instanceof int[]) {
            return f4590c;
        }
        if (obj instanceof Long) {
            return f4591d;
        }
        if (obj instanceof long[]) {
            return f4592e;
        }
        if (obj instanceof Float) {
            return f4593f;
        }
        if (obj instanceof float[]) {
            return f4594g;
        }
        if (obj instanceof Boolean) {
            return f4595h;
        }
        if (obj instanceof boolean[]) {
            return f4596i;
        }
        if ((obj instanceof String) || obj == null) {
            return f4597j;
        }
        if (obj instanceof String[]) {
            return f4598k;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C1288b(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C1290d(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new C1289c(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new C1287a(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new C1291e(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    /* renamed from: a */
    public static AbstractC1277q<?> m5804a(String str, String str2) {
        String str3;
        AbstractC1277q<Integer> qVar = f4588a;
        if (qVar.mo6403b().equals(str)) {
            return qVar;
        }
        AbstractC1277q qVar2 = f4590c;
        if (qVar2.mo6403b().equals(str)) {
            return qVar2;
        }
        AbstractC1277q<Long> qVar3 = f4591d;
        if (qVar3.mo6403b().equals(str)) {
            return qVar3;
        }
        AbstractC1277q qVar4 = f4592e;
        if (qVar4.mo6403b().equals(str)) {
            return qVar4;
        }
        AbstractC1277q<Boolean> qVar5 = f4595h;
        if (qVar5.mo6403b().equals(str)) {
            return qVar5;
        }
        AbstractC1277q qVar6 = f4596i;
        if (qVar6.mo6403b().equals(str)) {
            return qVar6;
        }
        AbstractC1277q<String> qVar7 = f4597j;
        if (qVar7.mo6403b().equals(str)) {
            return qVar7;
        }
        AbstractC1277q qVar8 = f4598k;
        if (qVar8.mo6403b().equals(str)) {
            return qVar8;
        }
        AbstractC1277q<Float> qVar9 = f4593f;
        if (qVar9.mo6403b().equals(str)) {
            return qVar9;
        }
        AbstractC1277q qVar10 = f4594g;
        if (qVar10.mo6403b().equals(str)) {
            return qVar10;
        }
        AbstractC1277q<Integer> qVar11 = f4589b;
        if (qVar11.mo6403b().equals(str)) {
            return qVar11;
        }
        if (str == null || str.isEmpty()) {
            return qVar7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new C1288b(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new C1290d(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new C1289c(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new C1287a(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new C1291e(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo6399a(Bundle bundle, String str, String str2) {
        T a = mo6400a(str2);
        mo6401a(bundle, str, (Object) a);
        return a;
    }
}
