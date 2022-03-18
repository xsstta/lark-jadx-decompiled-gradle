package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.am;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public final class BuiltinMethodsWithSpecialGenericSignature {
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final List<NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final Set<Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final Map<NameAndSignature, TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();
    private static final Map<String, TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class TypeSafeBarrierDescription extends Enum<TypeSafeBarrierDescription> {
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        public static final TypeSafeBarrierDescription FALSE;
        public static final TypeSafeBarrierDescription INDEX;
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final TypeSafeBarrierDescription NULL;
        private final Object defaultValue;

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, false);
            FALSE = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);
            MAP_GET_OR_DEFAULT = map_get_or_default;
            $VALUES = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, null, null);
            }
        }

        private TypeSafeBarrierDescription(String str, int i, Object obj) {
            this.defaultValue = obj;
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }
    }

    static {
        Set<String> a = am.m265689a((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        for (String str : a) {
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(SpecialBuiltinMembers.method("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        ArrayList arrayList2 = arrayList;
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList2;
        ArrayList<NameAndSignature> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (NameAndSignature nameAndSignature : arrayList3) {
            arrayList4.add(nameAndSignature.getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList4;
        List<NameAndSignature> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList5.add(it.next().getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList5;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String javaUtil = signatureBuildingComponents.javaUtil("Collection");
        String desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc2, "JvmPrimitiveType.BOOLEAN.desc");
        String javaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc3, "JvmPrimitiveType.BOOLEAN.desc");
        String javaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc4, "JvmPrimitiveType.BOOLEAN.desc");
        String javaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc5, "JvmPrimitiveType.BOOLEAN.desc");
        String javaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc6, "JvmPrimitiveType.BOOLEAN.desc");
        String javaUtil6 = signatureBuildingComponents.javaUtil("List");
        String desc7 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc7, "JvmPrimitiveType.INT.desc");
        String javaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkExpressionValueIsNotNull(desc8, "JvmPrimitiveType.INT.desc");
        Map<NameAndSignature, TypeSafeBarrierDescription> mapOf = MapsKt.mapOf(TuplesKt.to(SpecialBuiltinMembers.method(javaUtil, "contains", "Ljava/lang/Object;", desc2), TypeSafeBarrierDescription.FALSE), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil2, "remove", "Ljava/lang/Object;", desc3), TypeSafeBarrierDescription.FALSE), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil3, "containsKey", "Ljava/lang/Object;", desc4), TypeSafeBarrierDescription.FALSE), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil4, "containsValue", "Ljava/lang/Object;", desc5), TypeSafeBarrierDescription.FALSE), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), TypeSafeBarrierDescription.FALSE), TuplesKt.to(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), TuplesKt.to(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL), TuplesKt.to(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil6, "indexOf", "Ljava/lang/Object;", desc7), TypeSafeBarrierDescription.INDEX), TuplesKt.to(SpecialBuiltinMembers.method(javaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), TypeSafeBarrierDescription.INDEX));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapOf.size()));
        for (T t : mapOf.entrySet()) {
            linkedHashMap.put(((NameAndSignature) t.getKey()).getSignature(), t.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        Set<NameAndSignature> a2 = am.m265692a((Set) GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        for (NameAndSignature nameAndSignature2 : a2) {
            arrayList6.add(nameAndSignature2.getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = CollectionsKt.toSet(arrayList6);
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        for (NameAndSignature nameAndSignature3 : a2) {
            arrayList7.add(nameAndSignature3.getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = CollectionsKt.toSet(arrayList7);
    }

    public final boolean getHasErasedValueParametersInJava(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt.contains(ERASED_VALUE_PARAMETERS_SIGNATURES, MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(name);
    }

    @JvmStatic
    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(FunctionDescriptor functionDescriptor) {
        Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "functionDescriptor.name");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return null;
        }
        return (FunctionDescriptor) DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1.INSTANCE, 1, null);
    }

    @JvmStatic
    public static final SpecialSignatureInfo getSpecialSignatureInfo(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor firstOverridden$default;
        String computeJvmSignature;
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "$this$getSpecialSignatureInfo");
        if (!ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(callableMemberDescriptor.getName()) || (firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1.INSTANCE, 1, null)) == null || (computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(firstOverridden$default)) == null) {
            return null;
        }
        if (ERASED_COLLECTION_PARAMETER_SIGNATURES.contains(computeJvmSignature)) {
            return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
        }
        if (((TypeSafeBarrierDescription) MapsKt.getValue(SIGNATURE_TO_DEFAULT_VALUES_MAP, computeJvmSignature)) == TypeSafeBarrierDescription.NULL) {
            return SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
        }
        return SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
    }

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        private SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }
}
