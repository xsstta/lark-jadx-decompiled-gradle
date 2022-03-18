package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    /* access modifiers changed from: protected */
    public void makeExtensionsImmutable() {
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {
        private ByteString unknownFields = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final ByteString getUnknownFields() {
            return this.unknownFields;
        }

        protected Builder() {
        }

        @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        final Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final WireFormat.FieldType type;

        public Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final Method enumValueOf;
        final MessageLite messageDefaultInstance;
        final Class singularType;

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        /* access modifiers changed from: package-private */
        public Object singularFromFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            return GeneratedMessageLite.invokeOrDie(this.enumValueOf, null, (Integer) obj);
        }

        /* access modifiers changed from: package-private */
        public Object singularToFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                arrayList.add(singularFromFieldSetType(obj2));
            }
            return arrayList;
        }

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.containingTypeDefaultInstance = containingtype;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
                this.singularType = cls;
                if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                    this.enumValueOf = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.enumValueOf = null;
            }
        }
    }

    protected GeneratedMessageLite() {
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        private FieldSet<ExtensionDescriptor> extensions = FieldSet.emptySet();
        private boolean extensionsIsMutable;

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected ExtendableBuilder() {
        }

        private void ensureExtensionsIsMutable() {
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
        }

        public FieldSet<ExtensionDescriptor> buildExtensions() {
            this.extensions.makeImmutable();
            this.extensionsIsMutable = false;
            return this.extensions;
        }

        @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* access modifiers changed from: protected */
        public final void mergeExtensionFields(MessageType messagetype) {
            ensureExtensionsIsMutable();
            this.extensions.mergeFrom(messagetype.extensions);
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        public final FieldSet<ExtensionDescriptor> extensions;

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        /* access modifiers changed from: protected */
        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.getRepeatedFieldCount(generatedExtension.descriptor);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage<MessageType>, Type> */
        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.hasField(generatedExtension.descriptor);
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage<MessageType>, Type> */
        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object field = this.extensions.getField(generatedExtension.descriptor);
            return field == null ? generatedExtension.defaultValue : (Type) generatedExtension.fromFieldSetType(field);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtension.descriptor, i));
        }

        protected class ExtensionWriter {
            private final Iterator<Map.Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<ExtensionDescriptor, Object> next;

            private ExtensionWriter(boolean z) {
                Iterator<Map.Entry<ExtensionDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<ExtensionDescriptor, Object> entry = this.next;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        ExtensionDescriptor key = this.next.getKey();
                        if (!this.messageSetWireFormat || key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated()) {
                            FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.writeMessageSetExtension(key.getNumber(), (MessageLite) this.next.getValue());
                        }
                        if (this.iter.hasNext()) {
                            this.next = this.iter.next();
                        } else {
                            this.next = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C692361 r3) {
                this(z);
            }
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    public static /* synthetic */ class C692361 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C692361.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C692361.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C692361.<clinit>():void");
        }
    }

    protected GeneratedMessageLite(Builder builder) {
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> r4, MessageType r5, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r6, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r8, int r9) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }
}
