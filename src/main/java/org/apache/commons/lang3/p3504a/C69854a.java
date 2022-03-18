package org.apache.commons.lang3.p3504a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.C69853a;
import org.apache.commons.lang3.C69882g;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;

/* renamed from: org.apache.commons.lang3.a.a */
public class C69854a {

    /* renamed from: a */
    public static final WildcardType f174632a = m268083a().mo245045a(Object.class).mo245044a();

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.lang3.a.a$1 */
    public static class C698551 {
    }

    /* renamed from: org.apache.commons.lang3.a.a$a */
    public static class C69856a {

        /* renamed from: a */
        private Type[] f174633a;

        /* renamed from: b */
        private Type[] f174634b;

        private C69856a() {
        }

        /* renamed from: a */
        public WildcardType mo245044a() {
            return new C69857b(this.f174633a, this.f174634b, null);
        }

        /* renamed from: a */
        public C69856a mo245045a(Type... typeArr) {
            this.f174633a = typeArr;
            return this;
        }

        /* synthetic */ C69856a(C698551 r1) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m268089a(Type type, Type type2) {
        return m268090a(type, type2, (Map<TypeVariable<?>, Type>) null);
    }

    /* renamed from: a */
    private static boolean m268090a(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 == null || (type2 instanceof Class)) {
            return m268101b(type, (Class<?>) ((Class) type2));
        }
        if (type2 instanceof ParameterizedType) {
            return m268088a(type, (ParameterizedType) type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return m268087a(type, (GenericArrayType) type2, map);
        }
        if (type2 instanceof WildcardType) {
            return m268092a(type, (WildcardType) type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return m268091a(type, (TypeVariable<?>) ((TypeVariable) type2), map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    /* renamed from: a */
    private static boolean m268088a(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> a = m268070a(parameterizedType);
        Map<TypeVariable<?>, Type> a2 = m268082a(type, a, (Map<TypeVariable<?>, Type>) null);
        if (a2 == null) {
            return false;
        }
        if (a2.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> a3 = m268080a(parameterizedType, a, map);
        for (TypeVariable<?> typeVariable : a3.keySet()) {
            Type a4 = m268078a(typeVariable, a3);
            Type a5 = m268078a(typeVariable, a2);
            if ((a4 != null || !(a5 instanceof Class)) && a5 != null && !a4.equals(a5)) {
                if (!(a4 instanceof WildcardType) || !m268090a(a5, a4, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Type m268078a(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                return type;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    /* renamed from: a */
    private static boolean m268087a(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || !m268090a(cls.getComponentType(), genericComponentType, map)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            return m268090a(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        } else {
            if (type instanceof WildcardType) {
                for (Type type2 : m268097a((WildcardType) type)) {
                    if (m268089a(type2, genericArrayType)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof TypeVariable) {
                for (Type type3 : m268096a((TypeVariable<?>) ((TypeVariable) type))) {
                    if (m268089a(type3, genericArrayType)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof ParameterizedType) {
                return false;
            } else {
                throw new IllegalStateException("found an unhandled type: " + type);
            }
        }
    }

    /* renamed from: a */
    private static boolean m268092a(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] a = m268097a(wildcardType);
        Type[] b = m268103b(wildcardType);
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] a2 = m268097a(wildcardType2);
            Type[] b2 = m268103b(wildcardType2);
            for (Type type2 : a) {
                Type a3 = m268077a(type2, map);
                for (Type type3 : a2) {
                    if (!m268090a(type3, a3, map)) {
                        return false;
                    }
                }
            }
            for (Type type4 : b) {
                Type a4 = m268077a(type4, map);
                for (Type type5 : b2) {
                    if (!m268090a(a4, type5, map)) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (Type type6 : a) {
            if (!m268090a(type, m268077a(type6, map), map)) {
                return false;
            }
        }
        for (Type type7 : b) {
            if (!m268090a(m268077a(type7, map), type, map)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m268091a(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : m268096a((TypeVariable<?>) ((TypeVariable) type))) {
                if (m268091a(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    /* renamed from: a */
    private static Map<TypeVariable<?>, Type> m268082a(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return m268079a((Class<?>) ((Class) type), cls, map);
        }
        if (type instanceof ParameterizedType) {
            return m268080a((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return m268082a(genericComponentType, cls, map);
        }
        int i = 0;
        if (type instanceof WildcardType) {
            Type[] a = m268097a((WildcardType) type);
            int length = a.length;
            while (i < length) {
                Type type2 = a[i];
                if (m268101b(type2, cls)) {
                    return m268082a(type2, cls, map);
                }
                i++;
            }
            return null;
        } else if (type instanceof TypeVariable) {
            Type[] a2 = m268096a((TypeVariable<?>) ((TypeVariable) type));
            int length2 = a2.length;
            while (i < length2) {
                Type type3 = a2[i];
                if (m268101b(type3, cls)) {
                    return m268082a(type3, cls, map);
                }
                i++;
            }
            return null;
        } else {
            throw new IllegalStateException("found an unhandled type: " + type);
        }
    }

    /* renamed from: a */
    private static Map<TypeVariable<?>, Type> m268080a(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> map2;
        Class<?> a = m268070a(parameterizedType);
        if (!m268101b((Type) a, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = m268080a(parameterizedType2, m268070a(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = a.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            TypeVariable<Class<?>> typeVariable = typeParameters[i];
            if (map2.containsKey(type)) {
                type = map2.get(type);
            }
            map2.put(typeVariable, type);
        }
        if (cls.equals(a)) {
            return map2;
        }
        return m268082a(m268076a(a, cls), cls, map2);
    }

    /* renamed from: a */
    private static Map<TypeVariable<?>, Type> m268079a(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!m268101b((Type) cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = ClassUtils.m268049c(cls);
        }
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (cls2.equals(cls)) {
            return hashMap;
        }
        return m268082a(m268076a(cls, cls2), cls2, (Map<TypeVariable<?>, Type>) hashMap);
    }

    /* renamed from: a */
    public static Type[] m268098a(Type[] typeArr) {
        boolean z;
        C69882g.m268177a((Object) typeArr, "null value specified for bounds array", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                Type type2 = typeArr[i];
                if (type != type2 && m268090a(type2, type, (Map<TypeVariable<?>, Type>) null)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                hashSet.add(type);
            }
        }
        return (Type[]) hashSet.toArray(new Type[hashSet.size()]);
    }

    /* renamed from: a */
    public static Type[] m268096a(TypeVariable<?> typeVariable) {
        C69882g.m268177a(typeVariable, "typeVariable is null", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            return m268098a(bounds);
        }
        return new Type[]{Object.class};
    }

    /* renamed from: a */
    public static Type[] m268097a(WildcardType wildcardType) {
        C69882g.m268177a(wildcardType, "wildcardType is null", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 0) {
            return m268098a(upperBounds);
        }
        return new Type[]{Object.class};
    }

    /* renamed from: a */
    public static C69856a m268083a() {
        return new C69856a(null);
    }

    /* renamed from: a */
    public static boolean m268086a(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (!m268102b(parameterizedType.getRawType(), parameterizedType2.getRawType()) || !m268102b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return false;
        }
        return m268095a(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
    }

    /* renamed from: a */
    public static boolean m268085a(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && m268102b(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    /* renamed from: a */
    public static boolean m268094a(WildcardType wildcardType, Type type) {
        if (!(type instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        if (!m268095a(m268103b(wildcardType), m268103b(wildcardType2)) || !m268095a(m268097a(wildcardType), m268097a(wildcardType2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m268095a(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i = 0; i < typeArr.length; i++) {
            if (!m268102b(typeArr[i], typeArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m268084a(StringBuilder sb, int[] iArr, Type[] typeArr) {
        for (int i = 0; i < iArr.length; i++) {
            sb.append('<');
            m268075a(sb, ", ", typeArr[i].toString()).append('>');
        }
        Type[] typeArr2 = (Type[]) C69853a.m268065a((Object[]) typeArr, iArr);
        if (typeArr2.length > 0) {
            sb.append('<');
            m268075a(sb, ", ", typeArr2).append('>');
        }
    }

    /* renamed from: a */
    private static boolean m268093a(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return C69853a.m268067b(typeVariable.getBounds(), parameterizedType);
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.lang3.a.a$b */
    public static final class C69857b implements WildcardType {

        /* renamed from: a */
        private static final Type[] f174635a = new Type[0];

        /* renamed from: b */
        private final Type[] f174636b;

        /* renamed from: c */
        private final Type[] f174637c;

        public String toString() {
            return C69854a.m268074a((Type) this);
        }

        public Type[] getLowerBounds() {
            return (Type[]) this.f174637c.clone();
        }

        public Type[] getUpperBounds() {
            return (Type[]) this.f174636b.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f174636b) | 18688) << 8) | Arrays.hashCode(this.f174637c);
        }

        public boolean equals(Object obj) {
            if (obj == this || ((obj instanceof WildcardType) && C69854a.m268094a((WildcardType) this, (Type) ((WildcardType) obj)))) {
                return true;
            }
            return false;
        }

        private C69857b(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = f174635a;
            this.f174636b = (Type[]) ObjectUtils.m268051a(typeArr, typeArr3);
            this.f174637c = (Type[]) ObjectUtils.m268051a(typeArr2, typeArr3);
        }

        /* synthetic */ C69857b(Type[] typeArr, Type[] typeArr2, C698551 r3) {
            this(typeArr, typeArr2);
        }
    }

    /* renamed from: a */
    private static <T> String m268072a(T t) {
        if (t instanceof Type) {
            return m268074a((Type) t);
        }
        return t.toString();
    }

    /* renamed from: a */
    private static String m268073a(GenericArrayType genericArrayType) {
        return String.format("%s[]", m268074a(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: b */
    public static Type[] m268103b(WildcardType wildcardType) {
        C69882g.m268177a(wildcardType, "wildcardType is null", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds;
        }
        return new Type[]{null};
    }

    /* renamed from: a */
    private static Class<?> m268070a(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
    }

    /* renamed from: b */
    private static String m268100b(TypeVariable<?> typeVariable) {
        StringBuilder sb = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb.append(" extends ");
            m268075a(sb, " & ", typeVariable.getBounds());
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static int[] m268105c(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArr = new int[0];
        for (int i = 0; i < typeArr.length; i++) {
            if ((typeArr[i] instanceof TypeVariable) && m268093a((TypeVariable<?>) ((TypeVariable) typeArr[i]), parameterizedType)) {
                iArr = C69853a.m268064a(iArr, i);
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static String m268071a(Class<?> cls) {
        if (cls.isArray()) {
            return m268074a((Type) cls.getComponentType()) + "[]";
        }
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(m268071a(cls.getEnclosingClass()));
            sb.append('.');
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb.append('<');
            m268075a(sb, ", ", cls.getTypeParameters());
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m268099b(ParameterizedType parameterizedType) {
        StringBuilder sb = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb.append(((Class) ownerType).getName());
            } else {
                sb.append(ownerType.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        int[] c = m268105c(parameterizedType);
        if (c.length > 0) {
            m268084a(sb, c, parameterizedType.getActualTypeArguments());
        } else {
            sb.append('<');
            m268075a(sb, ", ", parameterizedType.getActualTypeArguments()).append('>');
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static String m268104c(WildcardType wildcardType) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
            sb.append(" super ");
            m268075a(sb, " & ", lowerBounds);
        } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
            sb.append(" extends ");
            m268075a(sb, " & ", upperBounds);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m268074a(Type type) {
        C69882g.m268176a(type);
        if (type instanceof Class) {
            return m268071a((Class<?>) ((Class) type));
        }
        if (type instanceof ParameterizedType) {
            return m268099b((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return m268104c((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return m268100b((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return m268073a((GenericArrayType) type);
        }
        throw new IllegalArgumentException(ObjectUtils.m268052a(type));
    }

    /* renamed from: a */
    public static Map<TypeVariable<?>, Type> m268081a(Type type, Class<?> cls) {
        return m268082a(type, cls, (Map<TypeVariable<?>, Type>) null);
    }

    /* renamed from: b */
    private static boolean m268101b(Type type, Class<?> cls) {
        if (type == null) {
            if (cls == null || !cls.isPrimitive()) {
                return true;
            }
            return false;
        } else if (cls == null) {
            return false;
        } else {
            if (cls.equals(type)) {
                return true;
            }
            if (type instanceof Class) {
                return ClassUtils.m268046a((Class) type, cls);
            }
            if (type instanceof ParameterizedType) {
                return m268101b((Type) m268070a((ParameterizedType) type), cls);
            }
            if (type instanceof TypeVariable) {
                for (Type type2 : ((TypeVariable) type).getBounds()) {
                    if (m268101b(type2, cls)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (cls.equals(Object.class)) {
                    return true;
                }
                if (!cls.isArray() || !m268101b(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType())) {
                    return false;
                }
                return true;
            } else if (type instanceof WildcardType) {
                return false;
            } else {
                throw new IllegalStateException("found an unhandled type: " + type);
            }
        }
    }

    /* renamed from: b */
    public static boolean m268102b(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return m268086a((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return m268085a((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return m268094a((WildcardType) type, type2);
        }
        return false;
    }

    /* renamed from: a */
    private static Type m268076a(Class<?> cls, Class<?> cls2) {
        Class<?> cls3;
        if (cls2.isInterface()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            Type type = null;
            for (Type type2 : genericInterfaces) {
                if (type2 instanceof ParameterizedType) {
                    cls3 = m268070a((ParameterizedType) type2);
                } else if (type2 instanceof Class) {
                    cls3 = (Class) type2;
                } else {
                    throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                }
                if (m268101b((Type) cls3, cls2) && m268089a(type, (Type) cls3)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    /* renamed from: a */
    private static Type m268077a(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalArgumentException("missing assignment type for type variable " + type);
    }

    /* renamed from: a */
    private static <T> StringBuilder m268075a(StringBuilder sb, String str, T... tArr) {
        C69882g.m268180a(C69882g.m268182b(tArr));
        if (tArr.length > 0) {
            sb.append(m268072a((Object) tArr[0]));
            for (int i = 1; i < tArr.length; i++) {
                sb.append(str);
                sb.append(m268072a((Object) tArr[i]));
            }
        }
        return sb;
    }
}
