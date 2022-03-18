package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    private static final LinkedHashSet<ClassId> classIds;

    private CompanionObjectMapping() {
    }

    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        Set<ClassId> unmodifiableSet = Collections.unmodifiableSet(classIds);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        Intrinsics.checkExpressionValueIsNotNull(set, "PrimitiveType.NUMBER_TYPES");
        Set<PrimitiveType> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(KotlinBuiltIns.getPrimitiveFqName(it.next()));
        }
        LinkedHashSet<ClassId> linkedHashSet = new LinkedHashSet<>();
        for (FqName fqName : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Object) KotlinBuiltIns.FQ_NAMES.string.toSafe()), (Object) KotlinBuiltIns.FQ_NAMES._boolean.toSafe()), (Object) KotlinBuiltIns.FQ_NAMES._enum.toSafe())) {
            linkedHashSet.add(ClassId.topLevel(fqName));
        }
        classIds = linkedHashSet;
    }

    public final boolean isMappedIntrinsicCompanionObject(ClassDescriptor classDescriptor) {
        ClassId classId;
        Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            LinkedHashSet<ClassId> linkedHashSet = classIds;
            ClassId classId2 = DescriptorUtilsKt.getClassId(classDescriptor);
            if (classId2 != null) {
                classId = classId2.getOuterClassId();
            } else {
                classId = null;
            }
            if (CollectionsKt.contains(linkedHashSet, classId)) {
                return true;
            }
        }
        return false;
    }
}
