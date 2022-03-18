package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    public static final Companion Companion = new Companion(null);
    public final ModuleDescriptor module;
    private final Set<KotlinType> possibleTypes;
    private final Lazy supertypes$delegate;
    public final SimpleType type;
    public final long value;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    private final List<KotlinType> getSupertypes() {
        return (List) this.supertypes$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public static final class Companion {

        /* access modifiers changed from: private */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleType findIntersectionType(Collection<? extends SimpleType> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "types");
            return findCommonSuperTypeOrIntersectionType(collection, Mode.INTERSECTION_TYPE);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }

        private final SimpleType findCommonSuperTypeOrIntersectionType(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                SimpleType next = it.next();
                while (it.hasNext()) {
                    Companion companion = IntegerLiteralTypeConstructor.Companion;
                    next = companion.fold(next, it.next(), mode);
                }
                return next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final SimpleType fold(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType == null || simpleType2 == null) {
                return null;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            TypeConstructor constructor2 = simpleType2.getConstructor();
            boolean z = constructor instanceof IntegerLiteralTypeConstructor;
            if (z && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                return fold((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, mode);
            }
            if (z) {
                return fold((IntegerLiteralTypeConstructor) constructor, simpleType2);
            }
            if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                return fold((IntegerLiteralTypeConstructor) constructor2, simpleType);
            }
            return null;
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set set;
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                set = CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else if (i == 2) {
                set = CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, set, null), false);
        }
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getSupertypes  reason: collision with other method in class */
    public Collection<KotlinType> m271583getSupertypes() {
        return getSupertypes();
    }

    public String toString() {
        return "IntegerLiteralType" + valueToString();
    }

    private final String valueToString() {
        return '[' + CollectionsKt.joinToString$default(this.possibleTypes, ",", null, null, 0, null, IntegerLiteralTypeConstructor$valueToString$1.INSTANCE, 30, null) + ']';
    }

    public final boolean isContainsOnlyUnsignedTypes() {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if ((allSignedLiteralTypes instanceof Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (!(!this.possibleTypes.contains(it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final boolean checkConstructor(TypeConstructor typeConstructor) {
        Intrinsics.checkParameterIsNotNull(typeConstructor, "constructor");
        Set<KotlinType> set = this.possibleTypes;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getConstructor(), typeConstructor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Set<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> */
    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.type = KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), this, false);
        this.supertypes$delegate = LazyKt.lazy(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.value = j;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }
}
