package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

public final class OverridingUtilsKt {
    public static final <D extends CallableDescriptor> void retainMostSpecificInEachOverridableGroup(Collection<D> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "$this$retainMostSpecificInEachOverridableGroup");
        Collection<?> selectMostSpecificInEachOverridableGroup = selectMostSpecificInEachOverridableGroup(collection, OverridingUtilsKt$retainMostSpecificInEachOverridableGroup$newResult$1.INSTANCE);
        if (collection.size() != selectMostSpecificInEachOverridableGroup.size()) {
            collection.retainAll(selectMostSpecificInEachOverridableGroup);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Collection<? extends H> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> function1) {
        Intrinsics.checkParameterIsNotNull(collection, "$this$selectMostSpecificInEachOverridableGroup");
        Intrinsics.checkParameterIsNotNull(function1, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (true) {
            LinkedList linkedList2 = linkedList;
            if (!(!linkedList2.isEmpty())) {
                return create;
            }
            Object first = CollectionsKt.first((List) linkedList);
            SmartSet create2 = SmartSet.Companion.create();
            Collection<? super H> extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(first, linkedList2, function1, new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(create2));
            Intrinsics.checkExpressionValueIsNotNull(extractMembersOverridableInBothWays, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            if (extractMembersOverridableInBothWays.size() != 1 || !create2.isEmpty()) {
                Object obj = (Object) OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, function1);
                Intrinsics.checkExpressionValueIsNotNull(obj, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(obj);
                for (Object obj2 : extractMembersOverridableInBothWays) {
                    Intrinsics.checkExpressionValueIsNotNull(obj2, "it");
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(obj2))) {
                        create2.add(obj2);
                    }
                }
                SmartSet smartSet = create2;
                if (!smartSet.isEmpty()) {
                    create.addAll(smartSet);
                }
                create.add(obj);
            } else {
                Object single = CollectionsKt.single(extractMembersOverridableInBothWays);
                Intrinsics.checkExpressionValueIsNotNull(single, "overridableGroup.single()");
                create.add(single);
            }
        }
    }
}
