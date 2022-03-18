package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.C69113a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public final class AnnotationConstructorCallerKt {
    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = C69113a.m265954a((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (!(objArr instanceof KClass[])) {
                obj = objArr;
            } else if (obj != null) {
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(C69113a.m265954a(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    public static final <T> T createAnnotationInstance(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        Intrinsics.checkParameterIsNotNull(cls, "annotationClass");
        Intrinsics.checkParameterIsNotNull(map, "values");
        Intrinsics.checkParameterIsNotNull(list, "methods");
        AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2 = new AnnotationConstructorCallerKt$createAnnotationInstance$2(cls, list, map);
        Lazy lazy = LazyKt.lazy(new AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(map));
        Lazy lazy2 = LazyKt.lazy(new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(cls, map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new AnnotationConstructorCallerKt$createAnnotationInstance$result$1(cls, lazy2, null, lazy, null, annotationConstructorCallerKt$createAnnotationInstance$2, map));
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    public static final Void throwIllegalArgumentType(int i, String str, Class<?> cls) {
        KClass kClass;
        String str2;
        if (Intrinsics.areEqual(cls, Class.class)) {
            kClass = Reflection.getOrCreateKotlinClass(KClass.class);
        } else if (!cls.isArray() || !Intrinsics.areEqual(cls.getComponentType(), Class.class)) {
            kClass = C69113a.m265955a((Class) cls);
        } else {
            kClass = Reflection.getOrCreateKotlinClass(KClass[].class);
        }
        if (Intrinsics.areEqual(kClass.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(kClass.getQualifiedName());
            sb.append('<');
            Class<?> componentType = C69113a.m265954a(kClass).getComponentType();
            Intrinsics.checkExpressionValueIsNotNull(componentType, "kotlinClass.java.componentType");
            sb.append(C69113a.m265955a((Class) componentType).getQualifiedName());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = kClass.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + str2);
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }
}
