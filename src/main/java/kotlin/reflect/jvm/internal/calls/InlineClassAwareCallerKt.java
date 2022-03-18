package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class InlineClassAwareCallerKt {
    private static final boolean hasInlineClassReceiver(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        if (expectedReceiverType == null || !InlineClassesUtilsKt.isInlineClassType(expectedReceiverType)) {
            return false;
        }
        return true;
    }

    public static final Class<?> toInlineClass(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$toInlineClass");
        return toInlineClass(kotlinType.getConstructor().getDeclarationDescriptor());
    }

    private static final KotlinType getExpectedReceiverType(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        SimpleType simpleType = null;
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            simpleType = classDescriptor.getDefaultType();
        }
        return simpleType;
    }

    public static final Class<?> toInlineClass(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            if (classDescriptor.isInline()) {
                Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                if (javaClass != null) {
                    return javaClass;
                }
                throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + ')');
            }
        }
        return null;
    }

    public static final Object coerceToExpectedReceiverType(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType;
        Class<?> inlineClass;
        Method unboxMethod;
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "descriptor");
        if (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) callableMemberDescriptor)) || (expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor)) == null || (inlineClass = toInlineClass(expectedReceiverType)) == null || (unboxMethod = getUnboxMethod(inlineClass, callableMemberDescriptor)) == null) {
            return obj;
        }
        return unboxMethod.invoke(obj, new Object[0]);
    }

    public static final Method getUnboxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkParameterIsNotNull(cls, "$this$getUnboxMethod");
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final Method getBoxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkParameterIsNotNull(cls, "$this$getBoxMethod");
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.reflect.jvm.internal.calls.Caller<? extends M extends java.lang.reflect.Member> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r0) != true) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (hasInlineClassReceiver(r6) == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.Caller<M> createInlineClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    public static /* synthetic */ Caller createInlineClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createInlineClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z);
    }
}
