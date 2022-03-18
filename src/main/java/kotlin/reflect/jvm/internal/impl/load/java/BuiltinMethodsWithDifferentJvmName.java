package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public final class BuiltinMethodsWithDifferentJvmName {
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE = new BuiltinMethodsWithDifferentJvmName();
    private static final Map<Name, List<Name>> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final Map<NameAndSignature, Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    private static final List<Name> ORIGINAL_SHORT_NAMES;
    private static final NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    private static final Map<String, Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    private BuiltinMethodsWithDifferentJvmName() {
    }

    public final List<Name> getORIGINAL_SHORT_NAMES() {
        return ORIGINAL_SHORT_NAMES;
    }

    static {
        String desc = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.INT.desc");
        NameAndSignature method = SpecialBuiltinMembers.method("java/util/List", "removeAt", desc, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = method;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents.javaLang("Number");
        String desc2 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc2, "JvmPrimitiveType.BYTE.desc");
        String javaLang2 = signatureBuildingComponents.javaLang("Number");
        String desc3 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc3, "JvmPrimitiveType.SHORT.desc");
        String javaLang3 = signatureBuildingComponents.javaLang("Number");
        String desc4 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc4, "JvmPrimitiveType.INT.desc");
        String javaLang4 = signatureBuildingComponents.javaLang("Number");
        String desc5 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc5, "JvmPrimitiveType.LONG.desc");
        String javaLang5 = signatureBuildingComponents.javaLang("Number");
        String desc6 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc6, "JvmPrimitiveType.FLOAT.desc");
        String javaLang6 = signatureBuildingComponents.javaLang("Number");
        String desc7 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc7, "JvmPrimitiveType.DOUBLE.desc");
        String javaLang7 = signatureBuildingComponents.javaLang("CharSequence");
        String desc8 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc8, "JvmPrimitiveType.INT.desc");
        String desc9 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc9, "JvmPrimitiveType.CHAR.desc");
        Map<NameAndSignature, Name> mapOf = MapsKt.mapOf(TuplesKt.to(SpecialBuiltinMembers.method(javaLang, "toByte", "", desc2), Name.identifier("byteValue")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang2, "toShort", "", desc3), Name.identifier("shortValue")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang3, "toInt", "", desc4), Name.identifier("intValue")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang4, "toLong", "", desc5), Name.identifier("longValue")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang5, "toFloat", "", desc6), Name.identifier("floatValue")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang6, "toDouble", "", desc7), Name.identifier("doubleValue")), TuplesKt.to(method, Name.identifier("remove")), TuplesKt.to(SpecialBuiltinMembers.method(javaLang7, "get", desc8, desc9), Name.identifier("charAt")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapOf.size()));
        for (T t : mapOf.entrySet()) {
            linkedHashMap.put(((NameAndSignature) t.getKey()).getSignature(), t.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap;
        Set<NameAndSignature> keySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        ORIGINAL_SHORT_NAMES = arrayList;
        Set<Map.Entry<NameAndSignature, Name>> entrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        ArrayList<Pair> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        for (T t2 : entrySet) {
            arrayList2.add(new Pair(((NameAndSignature) t2.getKey()).getName(), t2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Pair pair : arrayList2) {
            Name name = (Name) pair.getSecond();
            Object obj = linkedHashMap2.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(name, obj);
            }
            ((List) obj).add((Name) pair.getFirst());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap2;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "$this$sameAsRenamedInJvmBuiltin");
        return ORIGINAL_SHORT_NAMES.contains(name);
    }

    public final List<Name> getBuiltinFunctionNamesByJvmName(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        List<Name> list = JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP.get(name);
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    public final Name getJvmName(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "functionDescriptor");
        Map<String, Name> map = SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        String computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor);
        if (computeJvmSignature != null) {
            return map.get(computeJvmSignature);
        }
        return null;
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "functionDescriptor");
        if (!KotlinBuiltIns.isBuiltIn(simpleFunctionDescriptor) || DescriptorUtilsKt.firstOverridden$default(simpleFunctionDescriptor, false, new BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(simpleFunctionDescriptor), 1, null) == null) {
            return false;
        }
        return true;
    }

    public final boolean isRemoveAtByIndex(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "$this$isRemoveAtByIndex");
        if (!Intrinsics.areEqual(simpleFunctionDescriptor.getName().asString(), "removeAt") || !Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor), REMOVE_AT_NAME_AND_SIGNATURE.getSignature())) {
            return false;
        }
        return true;
    }
}
