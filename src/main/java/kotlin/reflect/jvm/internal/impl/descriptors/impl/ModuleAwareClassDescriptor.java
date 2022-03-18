package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* access modifiers changed from: protected */
    public abstract MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    /* access modifiers changed from: protected */
    public abstract MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            ClassDescriptor classDescriptor2;
            MemberScope unsubstitutedMemberScope;
            Intrinsics.checkParameterIsNotNull(classDescriptor, "$this$getRefinedUnsubstitutedMemberScopeIfPossible");
            Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (!(classDescriptor instanceof ModuleAwareClassDescriptor)) {
                classDescriptor2 = null;
            } else {
                classDescriptor2 = classDescriptor;
            }
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = (ModuleAwareClassDescriptor) classDescriptor2;
            if (moduleAwareClassDescriptor != null && (unsubstitutedMemberScope = moduleAwareClassDescriptor.getUnsubstitutedMemberScope(kotlinTypeRefiner)) != null) {
                return unsubstitutedMemberScope;
            }
            MemberScope unsubstitutedMemberScope2 = classDescriptor.getUnsubstitutedMemberScope();
            Intrinsics.checkExpressionValueIsNotNull(unsubstitutedMemberScope2, "this.unsubstitutedMemberScope");
            return unsubstitutedMemberScope2;
        }

        public final MemberScope getRefinedMemberScopeIfPossible$descriptors(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
            ClassDescriptor classDescriptor2;
            MemberScope memberScope;
            Intrinsics.checkParameterIsNotNull(classDescriptor, "$this$getRefinedMemberScopeIfPossible");
            Intrinsics.checkParameterIsNotNull(typeSubstitution, "typeSubstitution");
            Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (!(classDescriptor instanceof ModuleAwareClassDescriptor)) {
                classDescriptor2 = null;
            } else {
                classDescriptor2 = classDescriptor;
            }
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = (ModuleAwareClassDescriptor) classDescriptor2;
            if (moduleAwareClassDescriptor != null && (memberScope = moduleAwareClassDescriptor.getMemberScope(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScope;
            }
            MemberScope memberScope2 = classDescriptor.getMemberScope(typeSubstitution);
            Intrinsics.checkExpressionValueIsNotNull(memberScope2, "this.getMemberScope(\n   …ubstitution\n            )");
            return memberScope2;
        }
    }
}
