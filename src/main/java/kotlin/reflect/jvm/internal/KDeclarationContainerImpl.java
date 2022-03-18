package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\b \u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020(H&J\"\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0004J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001d\u001a\u00020%H&J\u001a\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00102\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002JE\u00106\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010:\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010;J(\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t01H\u0002J=\u0010=\u001a\u0004\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0010\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t082\n\u00109\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010>R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006B"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "", "returnType", "isStaticDefault", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    public static final Companion Companion = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
    public static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    public abstract Collection<FunctionDescriptor> getFunctions(Name name);

    public abstract PropertyDescriptor getLocalProperty(int i);

    public abstract Collection<PropertyDescriptor> getProperties(Name name);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive != null) {
            return wrapperByPrimitive;
        }
        return getJClass();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, mo238835k = 1, mv = {1, 1, 16})
    public abstract class Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        private final ReflectProperties.LazySoftVal moduleData$delegate = ReflectProperties.lazySoft(new KDeclarationContainerImpl$Data$moduleData$2(this));

        public final RuntimeModuleData getModuleData() {
            return (RuntimeModuleData) this.moduleData$delegate.getValue(this, $$delegatedProperties[0]);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Data() {
        }
    }

    private final Class<?> loadReturnType(String str) {
        return parseType(str, StringsKt.indexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    public final Constructor<?> findConstructorBySignature(String str) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        return tryGetConstructor(getJClass(), loadParameterTypes(str));
    }

    public final Constructor<?> findDefaultConstructor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        Class<?> jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, str, true);
        return tryGetConstructor(jClass, arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, mo238835k = 1, mv = {1, 1, 16})
    protected enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "member");
            CallableMemberDescriptor.Kind kind = callableMemberDescriptor.getKind();
            Intrinsics.checkExpressionValueIsNotNull(kind, "member.kind");
            boolean isReal = kind.isReal();
            if (this == DECLARED) {
                z = true;
            } else {
                z = false;
            }
            if (isReal == z) {
                return true;
            }
            return false;
        }
    }

    private final List<Class<?>> loadParameterTypes(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (StringsKt.contains$default((CharSequence) "VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = StringsKt.indexOf$default((CharSequence) str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(parseType(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    public final KPropertyImpl<?> createProperty(PropertyDescriptor propertyDescriptor) {
        int i;
        int i2 = 0;
        if (propertyDescriptor.getDispatchReceiverParameter() != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (propertyDescriptor.getExtensionReceiverParameter() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        if (propertyDescriptor.isVar()) {
            if (i3 == 0) {
                return new KMutableProperty0Impl(this, propertyDescriptor);
            }
            if (i3 == 1) {
                return new KMutableProperty1Impl(this, propertyDescriptor);
            }
            if (i3 == 2) {
                return new KMutableProperty2Impl(this, propertyDescriptor);
            }
        } else if (i3 == 0) {
            return new KProperty0Impl(this, propertyDescriptor);
        } else {
            if (i3 == 1) {
                return new KProperty1Impl(this, propertyDescriptor);
            }
            if (i3 == 2) {
                return new KProperty2Impl(this, propertyDescriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + propertyDescriptor);
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method findMethodBySignature(String str, String str2) {
        Method lookupMethod;
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "desc");
        if (Intrinsics.areEqual(str, "<init>")) {
            return null;
        }
        Object[] array = loadParameterTypes(str2).toArray(new Class[0]);
        if (array != null) {
            Class<?>[] clsArr = (Class[]) array;
            Class<?> loadReturnType = loadReturnType(str2);
            Method lookupMethod2 = lookupMethod(getMethodOwner(), str, clsArr, loadReturnType, false);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
            if (!getMethodOwner().isInterface() || (lookupMethod = lookupMethod(Object.class, str, clsArr, loadReturnType, false)) == null) {
                return null;
            }
            return lookupMethod;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    public final FunctionDescriptor findFunctionDescriptor(String str, String str2) {
        List list;
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "signature");
        if (Intrinsics.areEqual(str, "<init>")) {
            list = CollectionsKt.toList(getConstructorDescriptors());
        } else {
            Name identifier = Name.identifier(str);
            Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(name)");
            list = getFunctions(identifier);
        }
        Collection<FunctionDescriptor> collection = list;
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapSignature(t).asString(), str2)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        boolean z = true;
        if (arrayList2.size() == 1) {
            return (FunctionDescriptor) CollectionsKt.single((List) arrayList2);
        }
        String joinToString$default = CollectionsKt.joinToString$default(collection, "\n", null, null, 0, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.INSTANCE, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (joinToString$default.length() != 0) {
            z = false;
        }
        sb.append(z ? " no members found" : '\n' + joinToString$default);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public final PropertyDescriptor findPropertyDescriptor(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "signature");
        MatchResult matchEntire = LOCAL_PROPERTY_SIGNATURE.matchEntire(str2);
        boolean z = true;
        if (matchEntire != null) {
            String str3 = matchEntire.mo242583d().mo242585a().mo242582c().get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str3));
            if (localProperty != null) {
                return localProperty;
            }
            throw new KotlinReflectionInternalError("Local property #" + str3 + " not found in " + getJClass());
        }
        Name identifier = Name.identifier(str);
        Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(name)");
        ArrayList arrayList = new ArrayList();
        for (T t : getProperties(identifier)) {
            if (Intrinsics.areEqual(RuntimeTypeMapper.INSTANCE.mapPropertySignature(t).asString(), str2)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        } else if (arrayList2.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.single((List) arrayList2);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList2) {
                Visibility visibility = ((PropertyDescriptor) obj).getVisibility();
                Object obj2 = linkedHashMap.get(visibility);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(visibility, obj2);
                }
                ((List) obj2).add(obj);
            }
            Collection values = MapsKt.toSortedMap(linkedHashMap, KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2.INSTANCE).values();
            Intrinsics.checkExpressionValueIsNotNull(values, "properties\n             …                }).values");
            List list = (List) CollectionsKt.last(values);
            if (list.size() == 1) {
                Intrinsics.checkExpressionValueIsNotNull(list, "mostVisibleProperties");
                return (PropertyDescriptor) CollectionsKt.first(list);
            }
            Name identifier2 = Name.identifier(str);
            Intrinsics.checkExpressionValueIsNotNull(identifier2, "Name.identifier(name)");
            String joinToString$default = CollectionsKt.joinToString$default(getProperties(identifier2), "\n", null, null, 0, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.INSTANCE, 30, null);
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str);
            sb.append("' (JVM signature: ");
            sb.append(str2);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            if (joinToString$default.length() != 0) {
                z = false;
            }
            sb.append(z ? " no members found" : '\n' + joinToString$default);
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    private final void addParametersAndMasks(List<Class<?>> list, String str, boolean z) {
        Class<?> cls;
        List<Class<?>> loadParameterTypes = loadParameterTypes(str);
        list.addAll(loadParameterTypes);
        int size = ((loadParameterTypes.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls2 = Integer.TYPE;
            Intrinsics.checkExpressionValueIsNotNull(cls2, "Integer.TYPE");
            list.add(cls2);
        }
        if (z) {
            cls = DEFAULT_CONSTRUCTOR_MARKER;
        } else {
            cls = Object.class;
        }
        Intrinsics.checkExpressionValueIsNotNull(cls, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls);
    }

    public final Method findDefaultMethod(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "desc");
        if (Intrinsics.areEqual(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getJClass());
        }
        addParametersAndMasks(arrayList, str2, false);
        Class<?> methodOwner = getMethodOwner();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return lookupMethod(methodOwner, str3, (Class[]) array, loadReturnType(str2), z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final Class<?> parseType(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            int i3 = i + 1;
            int i4 = i2 - 1;
            if (str != null) {
                String substring = str.substring(i3, i4);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Class<?> loadClass = safeClassLoader.loadClass(StringsKt.replace$default(substring, '/', '.', false, 4, (Object) null));
                Intrinsics.checkExpressionValueIsNotNull(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return loadClass;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                Intrinsics.checkExpressionValueIsNotNull(cls, "Void.TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return ReflectClassUtilKt.createArrayType(parseType(str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:6:0x0029->B:20:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method tryGetMethod(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.String r2 = "result"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005f }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r10)     // Catch:{ NoSuchMethodException -> 0x005f }
            if (r2 == 0) goto L_0x001d
            r0 = r1
            goto L_0x005f
        L_0x001d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.String r1 = "declaredMethods"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r1)     // Catch:{ NoSuchMethodException -> 0x005f }
            int r1 = r7.length     // Catch:{ NoSuchMethodException -> 0x005f }
            r2 = 0
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x005f
            r4 = r7[r3]     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.String r5 = "method"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)     // Catch:{ NoSuchMethodException -> 0x005f }
            java.lang.String r5 = r4.getName()     // Catch:{ NoSuchMethodException -> 0x005f }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)     // Catch:{ NoSuchMethodException -> 0x005f }
            if (r5 == 0) goto L_0x0057
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ NoSuchMethodException -> 0x005f }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r10)     // Catch:{ NoSuchMethodException -> 0x005f }
            if (r5 == 0) goto L_0x0057
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x005f }
            if (r5 != 0) goto L_0x004f
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ NoSuchMethodException -> 0x005f }
        L_0x004f:
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch:{ NoSuchMethodException -> 0x005f }
            if (r5 == 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            r0 = r4
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method lookupMethod;
        if (z) {
            clsArr[0] = cls;
        }
        Method tryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (tryGetMethod != null) {
            return tryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (!(superclass == null || (lookupMethod = lookupMethod(superclass, str, clsArr, cls2, z)) == null)) {
            return lookupMethod;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> cls3 : interfaces) {
            Intrinsics.checkExpressionValueIsNotNull(cls3, "superInterface");
            Method lookupMethod2 = lookupMethod(cls3, str, clsArr, cls2, z);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
            if (z) {
                ClassLoader classLoader = cls3.getClassLoader();
                Intrinsics.checkExpressionValueIsNotNull(classLoader, "superInterface.classLoader");
                Class<?> tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(classLoader, cls3.getName() + "$DefaultImpls");
                if (tryLoadClass != null) {
                    clsArr[0] = cls3;
                    Method tryGetMethod2 = tryGetMethod(tryLoadClass, str, clsArr, cls2);
                    if (tryGetMethod2 != null) {
                        return tryGetMethod2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
