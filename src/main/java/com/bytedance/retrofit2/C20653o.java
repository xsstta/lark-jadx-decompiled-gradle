package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.RequestBody;
import okio.AbstractC69698d;
import okio.C69705k;

/* renamed from: com.bytedance.retrofit2.o */
public final class C20653o {

    /* renamed from: a */
    static final Type[] f50389a = new Type[0];

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.o$a */
    public static final class C20655a implements GenericArrayType {

        /* renamed from: a */
        private final Type f50391a;

        public Type getGenericComponentType() {
            return this.f50391a;
        }

        public int hashCode() {
            return this.f50391a.hashCode();
        }

        public String toString() {
            return C20653o.m75108b(this.f50391a) + "[]";
        }

        public C20655a(Type type) {
            this.f50391a = type;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C20653o.m75105a((Type) this, (Type) ((GenericArrayType) obj))) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.o$b */
    public static final class C20656b implements ParameterizedType {

        /* renamed from: a */
        private final Type f50392a;

        /* renamed from: b */
        private final Type f50393b;

        /* renamed from: c */
        private final Type[] f50394c;

        public Type getOwnerType() {
            return this.f50392a;
        }

        public Type getRawType() {
            return this.f50393b;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f50394c.clone();
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f50394c) ^ this.f50393b.hashCode()) ^ C20653o.m75092a((Object) this.f50392a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f50394c.length + 1) * 30);
            sb.append(C20653o.m75108b(this.f50393b));
            if (this.f50394c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C20653o.m75108b(this.f50394c[0]));
            for (int i = 1; i < this.f50394c.length; i++) {
                sb.append(", ");
                sb.append(C20653o.m75108b(this.f50394c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C20653o.m75105a((Type) this, (Type) ((ParameterizedType) obj))) {
                return false;
            }
            return true;
        }

        public C20656b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() != null ? false : z2)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f50392a = type;
            this.f50393b = type2;
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f50394c = typeArr2;
            for (Type type3 : typeArr2) {
                Objects.requireNonNull(type3);
                C20653o.m75111c(type3);
            }
        }
    }

    /* renamed from: a */
    static byte[] m75107a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    static boolean m75105a(Type type, Type type2) {
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
            if (!m75103a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m75105a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    private static boolean m75103a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static boolean m75106a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m75104a(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.o$c */
    public static final class C20657c implements WildcardType {

        /* renamed from: a */
        private final Type f50395a;

        /* renamed from: b */
        private final Type f50396b;

        public Type[] getLowerBounds() {
            Type type = this.f50396b;
            if (type == null) {
                return C20653o.f50389a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f50395a};
        }

        public int hashCode() {
            int i;
            Type type = this.f50396b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f50395a.hashCode() + 31);
        }

        public String toString() {
            if (this.f50396b != null) {
                return "? super " + C20653o.m75108b(this.f50396b);
            } else if (this.f50395a == Object.class) {
                return "?";
            } else {
                return "? extends " + C20653o.m75108b(this.f50395a);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C20653o.m75105a((Type) this, (Type) ((WildcardType) obj))) {
                return false;
            }
            return true;
        }

        public C20657c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C20653o.m75111c(typeArr2[0]);
                if (typeArr[0] == Object.class) {
                    this.f50396b = typeArr2[0];
                    this.f50395a = Object.class;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C20653o.m75111c(typeArr[0]);
                this.f50396b = null;
                this.f50395a = typeArr[0];
            }
        }
    }

    /* renamed from: a */
    public static TypedOutput m75094a(final RequestBody requestBody) {
        return new TypedOutput() {
            /* class com.bytedance.retrofit2.C20653o.C206541 */

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public String fileName() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public String md5Stub() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public long length() {
                try {
                    return requestBody.contentLength();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return -1;
                }
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public String mimeType() {
                if (requestBody.contentType() != null) {
                    return requestBody.contentType().toString();
                }
                return "";
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public void writeTo(OutputStream outputStream) throws IOException {
                AbstractC69698d a = C69705k.m267589a(C69705k.m267592a(outputStream));
                requestBody.writeTo(a);
                a.flush();
                a.close();
            }
        };
    }

    /* renamed from: a */
    static int m75092a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: b */
    static String m75108b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m75111c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    static Type m75113e(Type type) {
        if (type instanceof ParameterizedType) {
            return m75098a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    private static Class<?> m75096a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m75110b(String str) {
        if (m75104a(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static Class<?> m75095a(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m75095a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m75095a(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: d */
    static boolean m75112d(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m75112d(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m75112d(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
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
    static <T> void m75102a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static <T> T m75097a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    private static int m75093a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    static Type m75098a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    /* renamed from: b */
    static Type m75109b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m75100a(type, cls, m75099a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static Type m75099a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m75099a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m75099a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:? */
    /* renamed from: a */
    static Type m75100a(Type type, Class<?> cls, Type type2) {
        boolean z;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type a = m75101a(type, cls, (TypeVariable<?>) typeVariable);
            if (a == typeVariable) {
                return a;
            }
            type2 = a;
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type a2 = m75100a(type, cls, (Type) componentType);
                if (componentType == a2) {
                    return cls2;
                }
                return new C20655a(a2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type a3 = m75100a(type, cls, genericComponentType);
            if (genericComponentType == a3) {
                return genericArrayType;
            }
            return new C20655a(a3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type a4 = m75100a(type, cls, ownerType);
            if (a4 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type a5 = m75100a(type, cls, actualTypeArguments[i]);
                if (a5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = a5;
                }
            }
            if (z) {
                return new C20656b(a4, parameterizedType.getRawType(), actualTypeArguments);
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
                Type a6 = m75100a(type, cls, lowerBounds[0]);
                wildcardType = wildcardType2;
                if (a6 != lowerBounds[0]) {
                    return new C20657c(new Type[]{Object.class}, new Type[]{a6});
                }
            } else {
                wildcardType = wildcardType2;
                if (upperBounds.length == 1) {
                    Type a7 = m75100a(type, cls, upperBounds[0]);
                    wildcardType = wildcardType2;
                    if (a7 != upperBounds[0]) {
                        return new C20657c(new Type[]{a7}, f50389a);
                    }
                }
            }
        }
        return wildcardType;
    }

    /* renamed from: a */
    private static Type m75101a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m75096a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m75099a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m75093a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }
}
