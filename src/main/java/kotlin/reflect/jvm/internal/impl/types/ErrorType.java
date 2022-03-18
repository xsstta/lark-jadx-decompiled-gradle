package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public class ErrorType extends SimpleType {
    private final List<TypeProjection> arguments;
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final MemberScope memberScope;
    private final String presentableName;

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2) {
        this(typeConstructor, memberScope2, null, false, null, 28, null);
    }

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2, List<? extends TypeProjection> list, boolean z) {
        this(typeConstructor, memberScope2, list, z, null, 16, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public ErrorType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public String getPresentableName() {
        return this.presentableName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getConstructor().toString());
        if (getArguments().isEmpty()) {
            str = "";
        } else {
            str = CollectionsKt.joinToString(getArguments(), ", ", "<", ">", -1, "...", null);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType replaceAnnotations(Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(annotations, "newAnnotations");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType makeNullableAsSpecified(boolean z) {
        return new ErrorType(getConstructor(), getMemberScope(), getArguments(), z, null, 16, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2, List<? extends TypeProjection> list, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(typeConstructor, "constructor");
        Intrinsics.checkParameterIsNotNull(memberScope2, "memberScope");
        Intrinsics.checkParameterIsNotNull(list, "arguments");
        Intrinsics.checkParameterIsNotNull(str, "presentableName");
        this.constructor = typeConstructor;
        this.memberScope = memberScope2;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.presentableName = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ErrorType(kotlin.reflect.jvm.internal.impl.types.TypeConstructor r7, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, java.util.List r9, boolean r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0008
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0008:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0010
            r10 = 0
            r4 = 0
            goto L_0x0011
        L_0x0010:
            r4 = r10
        L_0x0011:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0017
            java.lang.String r11 = "???"
        L_0x0017:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.ErrorType.<init>(kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, java.util.List, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
