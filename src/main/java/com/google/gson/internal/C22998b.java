package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
public final class C22998b {

    /* renamed from: a */
    static final Type[] f56838a = new Type[0];

    /* access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$a */
    public static final class C22999a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return C22998b.m83443f(this.componentType) + "[]";
        }

        public C22999a(Type type) {
            this.componentType = C22998b.m83441d(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C22998b.m83436a((Type) this, (Type) ((GenericArrayType) obj))) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$b */
    public static final class C23000b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public Type getOwnerType() {
            return this.ownerType;
        }

        public Type getRawType() {
            return this.rawType;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C22998b.m83425a((Object) this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C22998b.m83443f(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C22998b.m83443f(this.rawType));
            sb.append("<");
            sb.append(C22998b.m83443f(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C22998b.m83443f(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C22998b.m83436a((Type) this, (Type) ((ParameterizedType) obj))) {
                return false;
            }
            return true;
        }

        public C23000b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C22954a.m83317a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C22998b.m83441d(type);
            }
            this.ownerType = type3;
            this.rawType = C22998b.m83441d(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C22954a.m83316a(this.typeArguments[i]);
                C22998b.m83445h(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = C22998b.m83441d(typeArr3[i]);
            }
        }
    }

    /* renamed from: a */
    static boolean m83435a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m83436a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m83435a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m83436a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static Type m83434a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m83427a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m83431a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m83426a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$c */
    public static final class C23001c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            if (type == null) {
                return C22998b.f56838a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            int i;
            Type type = this.lowerBound;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + C22998b.m83443f(this.lowerBound);
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                return "? extends " + C22998b.m83443f(this.upperBound);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C22998b.m83436a((Type) this, (Type) ((WildcardType) obj))) {
                return false;
            }
            return true;
        }

        public C23001c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C22954a.m83317a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C22954a.m83317a(z2);
            if (typeArr2.length == 1) {
                C22954a.m83316a(typeArr2[0]);
                C22998b.m83445h(typeArr2[0]);
                C22954a.m83317a(typeArr[0] != Object.class ? false : z3);
                this.lowerBound = C22998b.m83441d(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            C22954a.m83316a(typeArr[0]);
            C22998b.m83445h(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C22998b.m83441d(typeArr[0]);
        }
    }

    /* renamed from: a */
    public static GenericArrayType m83428a(Type type) {
        return new C22999a(type);
    }

    /* renamed from: a */
    static int m83425a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: f */
    public static String m83443f(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    public static WildcardType m83440c(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C23001c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: g */
    public static Type m83444g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    static void m83445h(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        C22954a.m83317a(z);
    }

    /* renamed from: a */
    private static Class<?> m83427a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: b */
    public static WildcardType m83438b(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C23001c(typeArr, f56838a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m83441d(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m83441d(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.b$b r0 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.b$a r0 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.b$c r0 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C22998b.m83441d(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: e */
    public static Class<?> m83442e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C22954a.m83317a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m83442e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m83442e(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: a */
    private static int m83426a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public static Type[] m83439b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m83437b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    public static Type m83430a(Type type, Class<?> cls) {
        Type b = m83437b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    static Type m83437b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C22954a.m83317a(cls2.isAssignableFrom(cls));
        return m83432a(type, cls, m83431a(type, cls, cls2));
    }

    /* renamed from: a */
    public static ParameterizedType m83429a(Type type, Type type2, Type... typeArr) {
        return new C23000b(type, type2, typeArr);
    }

    /* renamed from: a */
    static Type m83431a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m83431a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m83431a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m83432a(Type type, Class<?> cls, Type type2) {
        return m83433a(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:? */
    /* renamed from: a */
    private static Type m83433a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        boolean z;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m83434a(type, cls, (TypeVariable<?>) typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type a = m83433a(type, cls, componentType, collection);
                if (componentType == a) {
                    return cls2;
                }
                return m83428a(a);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type a2 = m83433a(type, cls, genericComponentType, collection);
            if (genericComponentType == a2) {
                return genericArrayType;
            }
            return m83428a(a2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type a3 = m83433a(type, cls, ownerType, collection);
            if (a3 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type a4 = m83433a(type, cls, actualTypeArguments[i], collection);
                if (a4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = a4;
                }
            }
            if (z) {
                return m83429a(a3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        WildcardType wildcardType = type2;
        if (z2) {
            WildcardType wildcardType2 = (WildcardType) type2;
            Type[] lowerBounds = wildcardType2.getLowerBounds();
            Type[] upperBounds = wildcardType2.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type a5 = m83433a(type, cls, lowerBounds[0], collection);
                wildcardType = wildcardType2;
                if (a5 != lowerBounds[0]) {
                    return m83440c(a5);
                }
            } else {
                wildcardType = wildcardType2;
                if (upperBounds.length == 1) {
                    Type a6 = m83433a(type, cls, upperBounds[0], collection);
                    wildcardType = wildcardType2;
                    if (a6 != upperBounds[0]) {
                        return m83438b(a6);
                    }
                }
            }
        }
        return wildcardType;
    }
}
