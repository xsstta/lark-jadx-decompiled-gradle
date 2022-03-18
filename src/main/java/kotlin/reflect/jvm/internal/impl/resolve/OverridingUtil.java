package kotlin.reflect.jvm.internal.impl.resolve;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

public class OverridingUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final OverridingUtil DEFAULT;
    private static final KotlinTypeChecker.TypeConstructorEquality DEFAULT_TYPE_CONSTRUCTOR_EQUALITY;
    private static final List<ExternalOverridabilityCondition> EXTERNAL_CONDITIONS = CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public final KotlinTypeChecker.TypeConstructorEquality equalityAxioms;
    private final KotlinTypeRefiner kotlinTypeRefiner;

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0162 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r24) {
        /*
        // Method dump skipped, instructions count: 1282
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.$$$reportNull$$$0(int):void");
    }

    public static class OverrideCompatibilityInfo {
        private static final OverrideCompatibilityInfo SUCCESS = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        private final String debugMessage;
        private final Result overridable;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void $$$reportNull$$$0(int r10) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.$$$reportNull$$$0(int):void");
        }

        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = SUCCESS;
            if (overrideCompatibilityInfo == null) {
                $$$reportNull$$$0(0);
            }
            return overrideCompatibilityInfo;
        }

        public Result getResult() {
            Result result = this.overridable;
            if (result == null) {
                $$$reportNull$$$0(5);
            }
            return result;
        }

        public static OverrideCompatibilityInfo conflict(String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo incompatible(String str) {
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                $$$reportNull$$$0(3);
            }
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            this.overridable = result;
            this.debugMessage = str;
        }
    }

    static {
        C692541 r0 = new KotlinTypeChecker.TypeConstructorEquality() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692541 */

            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = AbstractC60044a.f149675a;
                } else {
                    objArr[0] = C63954b.f161494a;
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
                objArr[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                if (typeConstructor == null) {
                    $$$reportNull$$$0(0);
                }
                if (typeConstructor2 == null) {
                    $$$reportNull$$$0(1);
                }
                return typeConstructor.equals(typeConstructor2);
            }
        };
        DEFAULT_TYPE_CONSTRUCTOR_EQUALITY = r0;
        DEFAULT = new OverridingUtil(r0, KotlinTypeRefiner.Default.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$9 */
    public static /* synthetic */ class C692629 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$descriptors$Modality;
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result;
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692629.<clinit>():void");
        }
    }

    public static OverridingUtil createWithEqualityAxioms(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (typeConstructorEquality == null) {
            $$$reportNull$$$0(0);
        }
        return new OverridingUtil(typeConstructorEquality, KotlinTypeRefiner.Default.INSTANCE);
    }

    public static OverridingUtil createWithTypeRefiner(KotlinTypeRefiner kotlinTypeRefiner2) {
        if (kotlinTypeRefiner2 == null) {
            $$$reportNull$$$0(1);
        }
        return new OverridingUtil(DEFAULT_TYPE_CONSTRUCTOR_EQUALITY, kotlinTypeRefiner2);
    }

    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(11);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectOverriddenDeclarations(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static boolean allHasSameContainingDeclaration(Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(59);
        }
        if (collection.size() < 2) {
            return true;
        }
        final DeclarationDescriptor containingDeclaration = collection.iterator().next().getContainingDeclaration();
        return CollectionsKt.all(collection, new Function1<CallableMemberDescriptor, Boolean>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692574 */

            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z;
                if (callableMemberDescriptor.getContainingDeclaration() == containingDeclaration) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private static List<KotlinType> compiledValueParameters(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        for (ValueParameterDescriptor valueParameterDescriptor : callableDescriptor.getValueParameters()) {
            arrayList.add(valueParameterDescriptor.getType());
        }
        return arrayList;
    }

    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(Set<D> set) {
        boolean z;
        if (set == null) {
            $$$reportNull$$$0(4);
        }
        if (set.isEmpty() || !DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(set.iterator().next()))) {
            z = false;
        } else {
            z = true;
        }
        return filterOverrides(set, z, null, new Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692552 */

            public Pair<CallableDescriptor, CallableDescriptor> invoke(D d, D d2) {
                return new Pair<>(d, d2);
            }
        });
    }

    private static Visibility computeVisibilityToInherit(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(103);
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Visibility findMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (findMaxVisibility == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return findMaxVisibility.normalize();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
            if (!(callableMemberDescriptor2.getModality() == Modality.ABSTRACT || callableMemberDescriptor2.getVisibility().equals(findMaxVisibility))) {
                return null;
            }
        }
        return findMaxVisibility;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.descriptors.Visibility findMaxVisibility(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 104(0x68, float:1.46E-43)
            $$$reportNull$$$0(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r5 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.DEFAULT_VISIBILITY
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r0 = r0.getVisibility()
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.findMaxVisibility(java.util.Collection):kotlin.reflect.jvm.internal.impl.descriptors.Visibility");
    }

    private static boolean isAccessorMoreSpecific(PropertyAccessorDescriptor propertyAccessorDescriptor, PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return isVisibilityMoreSpecific(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    private OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, KotlinTypeRefiner kotlinTypeRefiner2) {
        if (typeConstructorEquality == null) {
            $$$reportNull$$$0(2);
        }
        if (kotlinTypeRefiner2 == null) {
            $$$reportNull$$$0(3);
        }
        this.equalityAxioms = typeConstructorEquality;
        this.kotlinTypeRefiner = kotlinTypeRefiner2;
    }

    private static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(final ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(91);
        }
        if (collection == null) {
            $$$reportNull$$$0(92);
        }
        List filter = CollectionsKt.filter(collection, new Function1<CallableMemberDescriptor, Boolean>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692596 */

            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z;
                if (Visibilities.isPrivate(callableMemberDescriptor.getVisibility()) || !Visibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, classDescriptor)) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        if (filter == null) {
            $$$reportNull$$$0(93);
        }
        return filter;
    }

    private static OverrideCompatibilityInfo checkReceiverAndParameterCount(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z;
        boolean z2 = true;
        if (callableDescriptor.getExtensionReceiverParameter() == null) {
            z = true;
        } else {
            z = false;
        }
        if (callableDescriptor2.getExtensionReceiverParameter() != null) {
            z2 = false;
        }
        if (z != z2) {
            return OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        }
        if (callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size()) {
            return OverrideCompatibilityInfo.incompatible("Value parameter number mismatch");
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = DEFAULT;
        OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        if (result == OverrideCompatibilityInfo.Result.OVERRIDABLE && result2 == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            return OverrideCompatibilityInfo.Result.OVERRIDABLE;
        }
        if (result == OverrideCompatibilityInfo.Result.CONFLICT || result2 == OverrideCompatibilityInfo.Result.CONFLICT) {
            return OverrideCompatibilityInfo.Result.CONFLICT;
        }
        return OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    private static boolean isMoreSpecificThenAllOf(CallableDescriptor callableDescriptor, Collection<CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(67);
        }
        if (collection == null) {
            $$$reportNull$$$0(68);
        }
        for (CallableDescriptor callableDescriptor2 : collection) {
            if (!isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isVisibilityMoreSpecific(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(65);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            $$$reportNull$$$0(66);
        }
        Integer compare = Visibilities.compare(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        if (compare == null || compare.intValue() >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isVisibleForOverride(MemberDescriptor memberDescriptor, MemberDescriptor memberDescriptor2) {
        if (memberDescriptor == null) {
            $$$reportNull$$$0(53);
        }
        if (memberDescriptor2 == null) {
            $$$reportNull$$$0(54);
        }
        if (Visibilities.isPrivate(memberDescriptor2.getVisibility()) || !Visibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor)) {
            return false;
        }
        return true;
    }

    private static void collectOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (set == null) {
            $$$reportNull$$$0(14);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else if (!callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
                collectOverriddenDeclarations(callableMemberDescriptor2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
    }

    private KotlinTypeChecker createTypeChecker(List<TypeParameterDescriptor> list, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(38);
        }
        if (list2 == null) {
            $$$reportNull$$$0(39);
        }
        if (list.isEmpty()) {
            KotlinTypeChecker withAxioms = KotlinTypeCheckerImpl.withAxioms(this.equalityAxioms);
            if (withAxioms == null) {
                $$$reportNull$$$0(40);
            }
            return withAxioms;
        }
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).getTypeConstructor(), list2.get(i).getTypeConstructor());
        }
        KotlinTypeChecker withAxioms2 = KotlinTypeCheckerImpl.withAxioms(new KotlinTypeChecker.TypeConstructorEquality() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692563 */

            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = AbstractC60044a.f149675a;
                } else {
                    objArr[0] = C63954b.f161494a;
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
                objArr[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                if (typeConstructor == null) {
                    $$$reportNull$$$0(0);
                }
                if (typeConstructor2 == null) {
                    $$$reportNull$$$0(1);
                }
                if (OverridingUtil.this.equalityAxioms.equals(typeConstructor, typeConstructor2)) {
                    return true;
                }
                TypeConstructor typeConstructor3 = (TypeConstructor) hashMap.get(typeConstructor);
                TypeConstructor typeConstructor4 = (TypeConstructor) hashMap.get(typeConstructor2);
                if ((typeConstructor3 == null || !typeConstructor3.equals(typeConstructor2)) && (typeConstructor4 == null || !typeConstructor4.equals(typeConstructor))) {
                    return false;
                }
                return true;
            }
        });
        if (withAxioms2 == null) {
            $$$reportNull$$$0(41);
        }
        return withAxioms2;
    }

    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            $$$reportNull$$$0(36);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(37);
        }
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        } else if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.incompatible("Name mismatch");
        } else {
            OverrideCompatibilityInfo checkReceiverAndParameterCount = checkReceiverAndParameterCount(callableDescriptor, callableDescriptor2);
            if (checkReceiverAndParameterCount != null) {
                return checkReceiverAndParameterCount;
            }
            return null;
        }
    }

    private static Modality determineModalityForFakeOverride(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor) {
        Modality modality;
        if (collection == null) {
            $$$reportNull$$$0(83);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(84);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = C692629.$SwitchMap$org$jetbrains$kotlin$descriptors$Modality[callableMemberDescriptor.getModality().ordinal()];
            if (i == 1) {
                Modality modality2 = Modality.FINAL;
                if (modality2 == null) {
                    $$$reportNull$$$0(85);
                }
                return modality2;
            } else if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            } else if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (!(!classDescriptor.isExpect() || classDescriptor.getModality() == Modality.ABSTRACT || classDescriptor.getModality() == Modality.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality3 = Modality.OPEN;
            if (modality3 == null) {
                $$$reportNull$$$0(86);
            }
            return modality3;
        } else if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                hashSet.addAll(getOverriddenDeclarations(callableMemberDescriptor2));
            }
            return getMinimalModality(filterOutOverridden(hashSet), z, classDescriptor.getModality());
        } else {
            if (z) {
                modality = classDescriptor.getModality();
            } else {
                modality = Modality.ABSTRACT;
            }
            if (modality == null) {
                $$$reportNull$$$0(87);
            }
            return modality;
        }
    }

    public static boolean isMoreSpecific(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(63);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(64);
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!isVisibilityMoreSpecific(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        if (callableDescriptor instanceof FunctionDescriptor) {
            return isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        if (callableDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
            PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
            if (!isAccessorMoreSpecific(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
                return false;
            }
            if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
                return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).equalTypes(returnType, returnType2);
            }
            if ((propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
    }

    public static void resolveUnknownVisibilityForMember(CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, Unit> function1) {
        Visibility visibility;
        Function1<CallableMemberDescriptor, Unit> function12;
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(102);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == Visibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() == Visibilities.INHERITED) {
            Visibility computeVisibilityToInherit = computeVisibilityToInherit(callableMemberDescriptor);
            if (computeVisibilityToInherit == null) {
                if (function1 != null) {
                    function1.invoke(callableMemberDescriptor);
                }
                visibility = Visibilities.PUBLIC;
            } else {
                visibility = computeVisibilityToInherit;
            }
            if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
                ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
                for (PropertyAccessorDescriptor propertyAccessorDescriptor : ((PropertyDescriptor) callableMemberDescriptor).getAccessors()) {
                    if (computeVisibilityToInherit == null) {
                        function12 = null;
                    } else {
                        function12 = function1;
                    }
                    resolveUnknownVisibilityForMember(propertyAccessorDescriptor, function12);
                }
            } else if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
                ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(visibility);
            } else {
                PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
                propertyAccessorDescriptorImpl.setVisibility(visibility);
                if (visibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
                    propertyAccessorDescriptorImpl.setDefault(false);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H selectMostSpecificMember(Collection<H> collection, Function1<H, CallableDescriptor> function1) {
        if (collection == null) {
            $$$reportNull$$$0(73);
        }
        if (function1 == 0) {
            $$$reportNull$$$0(74);
        }
        if (collection.size() == 1) {
            H h = (H) CollectionsKt.first(collection);
            if (h == null) {
                $$$reportNull$$$0(75);
            }
            return h;
        }
        ArrayList arrayList = new ArrayList(2);
        List map = CollectionsKt.map(collection, function1);
        H h2 = (H) CollectionsKt.first(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h2);
        for (H h3 : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(h3);
            if (isMoreSpecificThenAllOf(callableDescriptor2, map)) {
                arrayList.add(h3);
            }
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                h2 = h3;
            }
        }
        if (arrayList.isEmpty()) {
            if (h2 == null) {
                $$$reportNull$$$0(76);
            }
            return h2;
        } else if (arrayList.size() == 1) {
            H h4 = (H) CollectionsKt.first((Iterable) arrayList);
            if (h4 == null) {
                $$$reportNull$$$0(77);
            }
            return h4;
        } else {
            H h5 = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!FlexibleTypesKt.isFlexible(((CallableDescriptor) function1.invoke(next)).getReturnType())) {
                    h5 = next;
                    break;
                }
            }
            if (h5 != null) {
                if (h5 == null) {
                    $$$reportNull$$$0(78);
                }
                return h5;
            }
            H h6 = (H) CollectionsKt.first((Iterable) arrayList);
            if (h6 == null) {
                $$$reportNull$$$0(79);
            }
            return h6;
        }
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(15);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(16);
        }
        OverrideCompatibilityInfo isOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (isOverridableBy == null) {
            $$$reportNull$$$0(17);
        }
        return isOverridableBy;
    }

    private boolean areTypesEquivalent(KotlinType kotlinType, KotlinType kotlinType2, KotlinTypeChecker kotlinTypeChecker) {
        boolean z;
        if (kotlinType == null) {
            $$$reportNull$$$0(42);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(43);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(44);
        }
        if (!KotlinTypeKt.isError(kotlinType) || !KotlinTypeKt.isError(kotlinType2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return kotlinTypeChecker.equalTypes(this.kotlinTypeRefiner.refineType(kotlinType), this.kotlinTypeRefiner.refineType(kotlinType2));
    }

    private static Collection<CallableMemberDescriptor> extractMembersOverridableInBothWays(final CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, final OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        if (queue == null) {
            $$$reportNull$$$0(100);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(101);
        }
        return extractMembersOverridableInBothWays(callableMemberDescriptor, queue, new Function1<CallableMemberDescriptor, CallableDescriptor>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692607 */

            public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        }, new Function1<CallableMemberDescriptor, Unit>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692618 */

            public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
                overridingStrategy.inheritanceConflict(callableMemberDescriptor, callableMemberDescriptor);
                return Unit.INSTANCE;
            }
        });
    }

    private static Modality getMinimalModality(Collection<CallableMemberDescriptor> collection, boolean z, Modality modality) {
        Modality modality2;
        if (collection == null) {
            $$$reportNull$$$0(88);
        }
        if (modality == null) {
            $$$reportNull$$$0(89);
        }
        Modality modality3 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            if (!z || callableMemberDescriptor.getModality() != Modality.ABSTRACT) {
                modality2 = callableMemberDescriptor.getModality();
            } else {
                modality2 = modality;
            }
            if (modality2.compareTo((Enum) modality3) < 0) {
                modality3 = modality2;
            }
        }
        if (modality3 == null) {
            $$$reportNull$$$0(90);
        }
        return modality3;
    }

    private boolean areTypeParametersEquivalent(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, KotlinTypeChecker kotlinTypeChecker) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(45);
        }
        if (typeParameterDescriptor2 == null) {
            $$$reportNull$$$0(46);
        }
        if (kotlinTypeChecker == null) {
            $$$reportNull$$$0(47);
        }
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (KotlinType kotlinType : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (areTypesEquivalent(kotlinType, (KotlinType) listIterator.next(), kotlinTypeChecker)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static void createAndBindFakeOverride(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        Visibility visibility;
        if (collection == null) {
            $$$reportNull$$$0(80);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(81);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(82);
        }
        Collection<CallableMemberDescriptor> filterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean isEmpty = filterVisibleFakeOverrides.isEmpty();
        if (!isEmpty) {
            collection = filterVisibleFakeOverrides;
        }
        Modality determineModalityForFakeOverride = determineModalityForFakeOverride(collection, classDescriptor);
        if (isEmpty) {
            visibility = Visibilities.INVISIBLE_FAKE;
        } else {
            visibility = Visibilities.INHERITED;
        }
        CallableMemberDescriptor copy = ((CallableMemberDescriptor) selectMostSpecificMember(collection, new Function1<CallableMemberDescriptor, CallableDescriptor>() {
            /* class kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C692585 */

            public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        })).copy(classDescriptor, determineModalityForFakeOverride, visibility, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(copy, collection);
        overridingStrategy.addFakeOverride(copy);
    }

    private static void createAndBindFakeOverrides(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection, OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(60);
        }
        if (collection == null) {
            $$$reportNull$$$0(61);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(62);
        }
        if (allHasSameContainingDeclaration(collection)) {
            for (CallableMemberDescriptor callableMemberDescriptor : collection) {
                createAndBindFakeOverride(Collections.singleton(callableMemberDescriptor), classDescriptor, overridingStrategy);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            createAndBindFakeOverride(extractMembersOverridableInBothWays(VisibilityUtilKt.findMemberWithMaxVisibility(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
        }
    }

    public static <D extends CallableDescriptor> boolean overrides(D d, D d2, boolean z) {
        if (d == null) {
            $$$reportNull$$$0(9);
        }
        if (d2 == null) {
            $$$reportNull$$$0(10);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal(), z)) {
            return true;
        }
        CallableDescriptor original = d2.getOriginal();
        for (CallableDescriptor callableDescriptor : DescriptorUtils.getAllOverriddenDescriptors(d)) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, callableDescriptor, z)) {
                return true;
            }
        }
        return false;
    }

    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(26);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(27);
        }
        OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            if (basicOverridabilityProblem == null) {
                $$$reportNull$$$0(28);
            }
            return basicOverridabilityProblem;
        }
        List<KotlinType> compiledValueParameters = compiledValueParameters(callableDescriptor);
        List<KotlinType> compiledValueParameters2 = compiledValueParameters(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < compiledValueParameters.size()) {
                if (!KotlinTypeChecker.DEFAULT.equalTypes(compiledValueParameters.get(i), compiledValueParameters2.get(i))) {
                    OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (incompatible == null) {
                        $$$reportNull$$$0(29);
                    }
                    return incompatible;
                }
                i++;
            }
            OverrideCompatibilityInfo conflict = OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (conflict == null) {
                $$$reportNull$$$0(30);
            }
            return conflict;
        }
        KotlinTypeChecker createTypeChecker = createTypeChecker(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!areTypeParametersEquivalent(typeParameters.get(i2), typeParameters2.get(i2), createTypeChecker)) {
                OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
                if (incompatible2 == null) {
                    $$$reportNull$$$0(31);
                }
                return incompatible2;
            }
        }
        for (int i3 = 0; i3 < compiledValueParameters.size(); i3++) {
            if (!areTypesEquivalent(compiledValueParameters.get(i3), compiledValueParameters2.get(i3), createTypeChecker)) {
                OverrideCompatibilityInfo incompatible3 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                if (incompatible3 == null) {
                    $$$reportNull$$$0(32);
                }
                return incompatible3;
            }
        }
        if (!(callableDescriptor instanceof FunctionDescriptor) || !(callableDescriptor2 instanceof FunctionDescriptor) || ((FunctionDescriptor) callableDescriptor).isSuspend() == ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            if (z) {
                KotlinType returnType = callableDescriptor.getReturnType();
                KotlinType returnType2 = callableDescriptor2.getReturnType();
                if (!(returnType == null || returnType2 == null)) {
                    if (KotlinTypeKt.isError(returnType2) && KotlinTypeKt.isError(returnType)) {
                        i = 1;
                    }
                    if (i == 0 && !createTypeChecker.isSubtypeOf(this.kotlinTypeRefiner.refineType(returnType2), this.kotlinTypeRefiner.refineType(returnType))) {
                        OverrideCompatibilityInfo conflict2 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                        if (conflict2 == null) {
                            $$$reportNull$$$0(34);
                        }
                        return conflict2;
                    }
                }
            }
            OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
            if (success == null) {
                $$$reportNull$$$0(35);
            }
            return success;
        }
        OverrideCompatibilityInfo conflict3 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
        if (conflict3 == null) {
            $$$reportNull$$$0(33);
        }
        return conflict3;
    }

    private static boolean isReturnTypeMoreSpecific(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(69);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(70);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(71);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(72);
        }
        return DEFAULT.createTypeChecker(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters()).isSubtypeOf(kotlinType, kotlinType2);
    }

    private Collection<CallableMemberDescriptor> extractAndBindOverridesForMember(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(55);
        }
        if (collection == null) {
            $$$reportNull$$$0(56);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(57);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(58);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        SmartSet create = SmartSet.create();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
            boolean isVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2);
            int i = C692629.$SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[result.ordinal()];
            if (i == 1) {
                if (isVisibleForOverride) {
                    create.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (isVisibleForOverride) {
                    overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, create);
        return arrayList;
    }

    public static <H> Collection<H> extractMembersOverridableInBothWays(H h, Collection<H> collection, Function1<H, CallableDescriptor> function1, Function1<H, Unit> function12) {
        if (h == null) {
            $$$reportNull$$$0(94);
        }
        if (collection == null) {
            $$$reportNull$$$0(95);
        }
        if (function1 == null) {
            $$$reportNull$$$0(96);
        }
        if (function12 == null) {
            $$$reportNull$$$0(97);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        CallableDescriptor invoke = function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor invoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(invoke, invoke2);
                if (bothWaysOverridability == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D> Set<D> filterOverrides(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> kVar) {
        if (set == null) {
            $$$reportNull$$$0(5);
        }
        if (kVar == null) {
            $$$reportNull$$$0(6);
        }
        if (set.size() <= 1) {
            if (set == null) {
                $$$reportNull$$$0(7);
            }
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D d : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(d);
                    break;
                }
                Pair<CallableDescriptor, CallableDescriptor> invoke = kVar.invoke(d, (Object) it.next());
                CallableDescriptor component1 = invoke.component1();
                CallableDescriptor component2 = invoke.component2();
                if (overrides(component1, component2, z)) {
                    it.remove();
                } else if (overrides(component2, component1, z)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z) {
        boolean z2;
        if (callableDescriptor == null) {
            $$$reportNull$$$0(18);
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(19);
        }
        OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
        if (isOverridableByWithoutExternalConditions.getResult() == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = C692629.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    OverrideCompatibilityInfo conflict = OverrideCompatibilityInfo.conflict("External condition failed");
                    if (conflict == null) {
                        $$$reportNull$$$0(20);
                    }
                    return conflict;
                } else if (i == 3) {
                    OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible == null) {
                        $$$reportNull$$$0(21);
                    }
                    return incompatible;
                }
            }
        }
        if (!z2) {
            if (isOverridableByWithoutExternalConditions == null) {
                $$$reportNull$$$0(22);
            }
            return isOverridableByWithoutExternalConditions;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = C692629.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i2 == 2) {
                    OverrideCompatibilityInfo conflict2 = OverrideCompatibilityInfo.conflict("External condition failed");
                    if (conflict2 == null) {
                        $$$reportNull$$$0(23);
                    }
                    return conflict2;
                } else if (i2 == 3) {
                    OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible2 == null) {
                        $$$reportNull$$$0(24);
                    }
                    return incompatible2;
                }
            }
        }
        OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
        if (success == null) {
            $$$reportNull$$$0(25);
        }
        return success;
    }

    public void generateOverridesInFunctionGroup(Name name, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (name == null) {
            $$$reportNull$$$0(48);
        }
        if (collection == null) {
            $$$reportNull$$$0(49);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(50);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(51);
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(52);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            linkedHashSet.removeAll(extractAndBindOverridesForMember(callableMemberDescriptor, collection, classDescriptor, overridingStrategy));
        }
        createAndBindFakeOverrides(classDescriptor, linkedHashSet, overridingStrategy);
    }
}
