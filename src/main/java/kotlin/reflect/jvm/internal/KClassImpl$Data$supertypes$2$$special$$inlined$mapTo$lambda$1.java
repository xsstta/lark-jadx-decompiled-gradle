package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
public final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl$Data$supertypes$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(KotlinType kotlinType, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        super(0);
        this.$kotlinType = kotlinType;
        this.this$0 = kClassImpl$Data$supertypes$2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Type invoke() {
        ClassifierDescriptor declarationDescriptor = this.$kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (javaClass == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + this.this$0.this$0 + ": " + declarationDescriptor);
            } else if (Intrinsics.areEqual(KClassImpl.this.getJClass().getSuperclass(), javaClass)) {
                Type genericSuperclass = KClassImpl.this.getJClass().getGenericSuperclass();
                Intrinsics.checkExpressionValueIsNotNull(genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class<?>[] interfaces = KClassImpl.this.getJClass().getInterfaces();
                Intrinsics.checkExpressionValueIsNotNull(interfaces, "jClass.interfaces");
                int c = C69043h.m265770c(interfaces, javaClass);
                if (c >= 0) {
                    Type type = KClassImpl.this.getJClass().getGenericInterfaces()[c];
                    Intrinsics.checkExpressionValueIsNotNull(type, "jClass.genericInterfaces[index]");
                    return type;
                }
                throw new KotlinReflectionInternalError("No superclass of " + this.this$0.this$0 + " in Java reflection for " + declarationDescriptor);
            }
        } else {
            throw new KotlinReflectionInternalError("Supertype not a class: " + declarationDescriptor);
        }
    }
}
