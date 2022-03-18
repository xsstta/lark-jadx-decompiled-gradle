package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.C69043h;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

public class Reflection {
    private static final KClass[] EMPTY_K_CLASS_ARRAY = new KClass[0];
    private static final C69119k factory;

    static {
        C69119k kVar = null;
        try {
            kVar = (C69119k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new C69119k();
        }
        factory = kVar;
    }

    public static KClass createKotlinClass(Class cls) {
        return factory.createKotlinClass(cls);
    }

    public static KFunction function(FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static KMutableProperty2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static KProperty0 property0(PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static KProperty1 property1(PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static KProperty2 property2(PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static String renderLambdaToString(FunctionBase functionBase) {
        return factory.renderLambdaToString(functionBase);
    }

    public static KType nullableTypeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), true);
    }

    public static String renderLambdaToString(Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static KType typeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), false);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i = 0; i < length; i++) {
            kClassArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return kClassArr;
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return factory.getOrCreateKotlinPackage(cls, str);
    }

    public static KClass createKotlinClass(Class cls, String str) {
        return factory.createKotlinClass(cls, str);
    }

    public static KClass getOrCreateKotlinClass(Class cls, String str) {
        return factory.getOrCreateKotlinClass(cls, str);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection iVar) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(iVar), true);
    }

    public static KType typeOf(Class cls, KTypeProjection iVar) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(iVar), false);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection... iVarArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), C69043h.m265786k(iVarArr), true);
    }

    public static KType typeOf(Class cls, KTypeProjection... iVarArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), C69043h.m265786k(iVarArr), false);
    }

    public static KType nullableTypeOf(Class cls, KTypeProjection iVar, KTypeProjection iVar2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(iVar, iVar2), true);
    }

    public static KType typeOf(Class cls, KTypeProjection iVar, KTypeProjection iVar2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(iVar, iVar2), false);
    }
}
