package com.google.gson.reflect;

import com.google.gson.internal.C22954a;
import com.google.gson.internal.C22998b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class TypeToken<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C22998b.m83443f(this.type);
    }

    protected TypeToken() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) C22998b.m83442e(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public static TypeToken<?> get(Type type2) {
        return new TypeToken<>(type2);
    }

    public static TypeToken<?> getArray(Type type2) {
        return new TypeToken<>(C22998b.m83428a(type2));
    }

    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C22998b.m83441d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeToken) || !C22998b.m83436a(this.type, ((TypeToken) obj).type)) {
            return false;
        }
        return true;
    }

    TypeToken(Type type2) {
        Type d = C22998b.m83441d((Type) C22954a.m83316a(type2));
        this.type = d;
        this.rawType = (Class<? super T>) C22998b.m83442e(d);
        this.hashCode = d.hashCode();
    }

    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C22998b.m83442e(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(C22998b.m83442e(type2)) || !isAssignableFrom(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    public static TypeToken<?> getParameterized(Type type2, Type... typeArr) {
        return new TypeToken<>(C22998b.m83429a((Type) null, type2, typeArr));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            type2 = (Class) type2;
            while (type2.isArray()) {
                type2 = type2.getComponentType();
            }
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        if (type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())))) {
            return true;
        }
        return false;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class<?> e = C22998b.m83442e(type2);
        ParameterizedType parameterizedType2 = null;
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = e.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable<Class<?>> typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type4 : e.getGenericInterfaces()) {
            if (isAssignableFrom(type4, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(e.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
