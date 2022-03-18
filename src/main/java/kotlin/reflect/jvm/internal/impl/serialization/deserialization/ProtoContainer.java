package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public abstract class ProtoContainer {
    private final NameResolver nameResolver;
    private final SourceElement source;
    private final TypeTable typeTable;

    public abstract FqName debugFqName();

    public static final class Class extends ProtoContainer {
        private final ClassId classId;
        private final ProtoBuf.Class classProto;
        private final boolean isInner;
        private final ProtoBuf.Class.Kind kind;
        private final Class outerClass;

        public final ClassId getClassId() {
            return this.classId;
        }

        public final ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        public final ProtoBuf.Class.Kind getKind() {
            return this.kind;
        }

        public final Class getOuterClass() {
            return this.outerClass;
        }

        public final boolean isInner() {
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            FqName asSingleFqName = this.classId.asSingleFqName();
            Intrinsics.checkExpressionValueIsNotNull(asSingleFqName, "classId.asSingleFqName()");
            return asSingleFqName;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class r2, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkParameterIsNotNull(r2, "classProto");
            Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
            this.classProto = r2;
            this.outerClass = r6;
            this.classId = NameResolverUtilKt.getClassId(nameResolver, r2.getFqName());
            ProtoBuf.Class.Kind kind2 = Flags.CLASS_KIND.get(r2.getFlags());
            this.kind = kind2 == null ? ProtoBuf.Class.Kind.CLASS : kind2;
            Boolean bool = Flags.IS_INNER.get(r2.getFlags());
            Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INNER.get(classProto.flags)");
            this.isInner = bool.booleanValue();
        }
    }

    public static final class Package extends ProtoContainer {
        private final FqName fqName;

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.fqName;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName2, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.checkParameterIsNotNull(fqName2, "fqName");
            Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
            this.fqName = fqName2;
        }
    }

    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    public final SourceElement getSource() {
        return this.source;
    }

    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }

    private ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement) {
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.source = sourceElement;
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver2, typeTable2, sourceElement);
    }
}
