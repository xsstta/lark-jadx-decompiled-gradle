package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

final class OperatorChecks$checks$2 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$2 INSTANCE = new OperatorChecks$checks$2();

    OperatorChecks$checks$2() {
        super(1);
    }

    public final String invoke(FunctionDescriptor functionDescriptor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(functionDescriptor, "$receiver");
        C692821 r0 = C692821.INSTANCE;
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "containingDeclaration");
        boolean invoke = r0.invoke(containingDeclaration);
        boolean z2 = true;
        if (!invoke) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "overriddenDescriptors");
            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    C692821 r3 = C692821.INSTANCE;
                    Intrinsics.checkExpressionValueIsNotNull(next, "it");
                    DeclarationDescriptor containingDeclaration2 = next.getContainingDeclaration();
                    Intrinsics.checkExpressionValueIsNotNull(containingDeclaration2, "it.containingDeclaration");
                    if (r3.invoke(containingDeclaration2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            return "must override ''equals()'' in Any";
        }
        return null;
    }
}
