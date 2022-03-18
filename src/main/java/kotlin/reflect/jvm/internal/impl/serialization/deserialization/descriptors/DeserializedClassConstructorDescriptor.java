package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;

public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {
    private final DeserializedContainerSource containerSource;
    private DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesExperimentalCompatibilityMode;
    private final NameResolver nameResolver;
    private final ProtoBuf.Constructor proto;
    private final TypeTable typeTable;
    private final VersionRequirementTable versionRequirementTable;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean isTailrec() {
        return false;
    }

    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    public DeserializedMemberDescriptor.CoroutinesCompatibilityMode getCoroutinesExperimentalCompatibilityMode() {
        return this.coroutinesExperimentalCompatibilityMode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.Constructor getProto() {
        return this.proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public List<VersionRequirement> getVersionRequirements() {
        return DeserializedCallableMemberDescriptor.DefaultImpls.getVersionRequirements(this);
    }

    public void setCoroutinesExperimentalCompatibilityMode$deserialization(DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode) {
        Intrinsics.checkParameterIsNotNull(coroutinesCompatibilityMode, "<set-?>");
        this.coroutinesExperimentalCompatibilityMode = coroutinesCompatibilityMode;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public DeserializedClassConstructorDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "newOwner");
        Intrinsics.checkParameterIsNotNull(kind, "kind");
        Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        Intrinsics.checkParameterIsNotNull(sourceElement, ShareHitPoint.f121868c);
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (ConstructorDescriptor) functionDescriptor, annotations, this.isPrimary, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), sourceElement);
        deserializedClassConstructorDescriptor.setCoroutinesExperimentalCompatibilityMode$deserialization(getCoroutinesExperimentalCompatibilityMode());
        return deserializedClassConstructorDescriptor;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r13, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r14, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r15, boolean r16, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r17, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r18, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r19, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r20, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r21, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r22, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r23) {
        /*
            r12 = this;
            r7 = r12
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "containingDeclaration"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            java.lang.String r0 = "annotations"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r17
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            if (r23 == 0) goto L_0x0035
            r6 = r23
            goto L_0x0038
        L_0x0035:
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r0 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            r6 = r0
        L_0x0038:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.proto = r8
            r7.nameResolver = r9
            r7.typeTable = r10
            r7.versionRequirementTable = r11
            r0 = r22
            r7.containerSource = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
            r7.coroutinesExperimentalCompatibilityMode = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor.<init>(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DeserializedClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r14, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r15, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r16, boolean r17, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r18, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r19, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r20, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r21, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r22, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r23, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r0 = (kotlin.reflect.jvm.internal.impl.descriptors.SourceElement) r0
            r12 = r0
            goto L_0x000d
        L_0x000b:
            r12 = r24
        L_0x000d:
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor.<init>(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
