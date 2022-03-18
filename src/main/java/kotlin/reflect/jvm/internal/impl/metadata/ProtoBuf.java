package kotlin.reflect.jvm.internal.impl.metadata;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new AbstractParser<Class>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.C691921 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Class defaultInstance;
        public int bitField0_;
        public int companionObjectName_;
        public List<Constructor> constructor_;
        public List<EnumEntry> enumEntry_;
        public int flags_;
        public int fqName_;
        public List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nestedClassNameMemoizedSerializedSize;
        public List<Integer> nestedClassName_;
        public List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        public List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        public List<Integer> supertypeId_;
        public List<Type> supertype_;
        public List<TypeAlias> typeAlias_;
        public List<TypeParameter> typeParameter_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public VersionRequirementTable versionRequirementTable_;
        public List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            private int bitField0_;
            private int companionObjectName_;
            private List<Constructor> constructor_ = Collections.emptyList();
            private List<EnumEntry> enumEntry_ = Collections.emptyList();
            private int flags_ = 6;
            private int fqName_;
            private List<Function> function_ = Collections.emptyList();
            private List<Integer> nestedClassName_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<Integer> sealedSubclassFqName_ = Collections.emptyList();
            private List<Integer> supertypeId_ = Collections.emptyList();
            private List<Type> supertype_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public static Builder create() {
                return new Builder();
            }

            public int getConstructorCount() {
                return this.constructor_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            public int getEnumEntryCount() {
                return this.enumEntry_.size();
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public int getSupertypeCount() {
                return this.supertype_.size();
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasFqName() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasTypeTable() {
                if ((this.bitField0_ & 8192) == 8192) {
                    return true;
                }
                return false;
            }

            private void ensureConstructorIsMutable() {
                if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) != 128) {
                    this.constructor_ = new ArrayList(this.constructor_);
                    this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                }
            }

            private void ensureEnumEntryIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.enumEntry_ = new ArrayList(this.enumEntry_);
                    this.bitField0_ |= 2048;
                }
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & DynamicModule.f58006b) != 256) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= DynamicModule.f58006b;
                }
            }

            private void ensureNestedClassNameIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 512) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                }
            }

            private void ensureSealedSubclassFqNameIsMutable() {
                if ((this.bitField0_ & 4096) != 4096) {
                    this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                    this.bitField0_ |= 4096;
                }
            }

            private void ensureSupertypeIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.supertypeId_ = new ArrayList(this.supertypeId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureSupertypeIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.supertype_ = new ArrayList(this.supertype_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                    if (!getConstructor(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                    if (!getFunction(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                    if (!getProperty(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                    if (!getTypeAlias(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                    if (!getEnumEntry(i7).isInitialized()) {
                        return false;
                    }
                }
                if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public Class buildPartial() {
                Class r0 = new Class(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                r0.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.fqName_ = this.fqName_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.companionObjectName_ = this.companionObjectName_;
                if ((this.bitField0_ & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                r0.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                r0.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                r0.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                r0.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -129;
                }
                r0.constructor_ = this.constructor_;
                if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -257;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -513;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -1025;
                }
                r0.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -2049;
                }
                r0.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -4097;
                }
                r0.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                r0.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                r0.versionRequirement_ = this.versionRequirement_;
                if ((i & 32768) == 32768) {
                    i2 |= 16;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                r0.bitField0_ = i2;
                return r0;
            }

            public Constructor getConstructor(int i) {
                return this.constructor_.get(i);
            }

            public EnumEntry getEnumEntry(int i) {
                return this.enumEntry_.get(i);
            }

            public Function getFunction(int i) {
                return this.function_.get(i);
            }

            public Property getProperty(int i) {
                return this.property_.get(i);
            }

            public Type getSupertype(int i) {
                return this.supertype_.get(i);
            }

            public TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            public TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public Builder setCompanionObjectName(int i) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setFqName(int i) {
                this.bitField0_ |= 2;
                this.fqName_ = i;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8192) != 8192 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8192;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 32768) != 32768 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 32768;
                return this;
            }

            public Builder mergeFrom(Class r3) {
                if (r3 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r3.hasFlags()) {
                    setFlags(r3.getFlags());
                }
                if (r3.hasFqName()) {
                    setFqName(r3.getFqName());
                }
                if (r3.hasCompanionObjectName()) {
                    setCompanionObjectName(r3.getCompanionObjectName());
                }
                if (!r3.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = r3.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(r3.typeParameter_);
                    }
                }
                if (!r3.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = r3.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSupertypeIsMutable();
                        this.supertype_.addAll(r3.supertype_);
                    }
                }
                if (!r3.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = r3.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureSupertypeIdIsMutable();
                        this.supertypeId_.addAll(r3.supertypeId_);
                    }
                }
                if (!r3.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = r3.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureNestedClassNameIsMutable();
                        this.nestedClassName_.addAll(r3.nestedClassName_);
                    }
                }
                if (!r3.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = r3.constructor_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureConstructorIsMutable();
                        this.constructor_.addAll(r3.constructor_);
                    }
                }
                if (!r3.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r3.function_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r3.property_;
                        this.bitField0_ &= -513;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r3.typeAlias_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r3.typeAlias_);
                    }
                }
                if (!r3.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = r3.enumEntry_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureEnumEntryIsMutable();
                        this.enumEntry_.addAll(r3.enumEntry_);
                    }
                }
                if (!r3.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = r3.sealedSubclassFqName_;
                        this.bitField0_ &= -4097;
                    } else {
                        ensureSealedSubclassFqNameIsMutable();
                        this.sealedSubclassFqName_.addAll(r3.sealedSubclassFqName_);
                    }
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (!r3.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = r3.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(r3.versionRequirement_);
                    }
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Class r4;
                Class r0 = null;
                try {
                    Class parsePartialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    r4 = (Class) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r4;
                }
                if (r0 != null) {
                    mergeFrom(r0);
                }
                throw th;
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);
            
            private static Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.C691931 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i) {
                    return Kind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            private Kind(int i, int i2) {
                this.value = i2;
            }
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        public List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        public List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasCompanionObjectName() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasFqName() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasTypeTable() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasVersionRequirementTable() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        static {
            Class r0 = new Class(true);
            defaultInstance = r0;
            r0.initFields();
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.supertype_ = Collections.emptyList();
            this.supertypeId_ = Collections.emptyList();
            this.nestedClassName_ = Collections.emptyList();
            this.constructor_ = Collections.emptyList();
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.enumEntry_ = Collections.emptyList();
            this.sealedSubclassFqName_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = Collections.emptyList();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                if (!getConstructor(i3).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                if (!getFunction(i4).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                if (!getProperty(i5).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                if (!getTypeAlias(i6).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                if (!getEnumEntry(i7).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.flags_) + 0;
            } else {
                i = 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.supertypeId_.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(this.supertypeId_.get(i4).intValue());
            }
            int i5 = i + i3;
            if (!getSupertypeIdList().isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.computeInt32SizeNoTag(i3);
            }
            this.supertypeIdMemoizedSerializedSize = i3;
            if ((this.bitField0_ & 2) == 2) {
                i5 += CodedOutputStream.computeInt32Size(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i5 += CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
            }
            for (int i6 = 0; i6 < this.typeParameter_.size(); i6++) {
                i5 += CodedOutputStream.computeMessageSize(5, this.typeParameter_.get(i6));
            }
            for (int i7 = 0; i7 < this.supertype_.size(); i7++) {
                i5 += CodedOutputStream.computeMessageSize(6, this.supertype_.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.nestedClassName_.size(); i9++) {
                i8 += CodedOutputStream.computeInt32SizeNoTag(this.nestedClassName_.get(i9).intValue());
            }
            int i10 = i5 + i8;
            if (!getNestedClassNameList().isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.computeInt32SizeNoTag(i8);
            }
            this.nestedClassNameMemoizedSerializedSize = i8;
            for (int i11 = 0; i11 < this.constructor_.size(); i11++) {
                i10 += CodedOutputStream.computeMessageSize(8, this.constructor_.get(i11));
            }
            for (int i12 = 0; i12 < this.function_.size(); i12++) {
                i10 += CodedOutputStream.computeMessageSize(9, this.function_.get(i12));
            }
            for (int i13 = 0; i13 < this.property_.size(); i13++) {
                i10 += CodedOutputStream.computeMessageSize(10, this.property_.get(i13));
            }
            for (int i14 = 0; i14 < this.typeAlias_.size(); i14++) {
                i10 += CodedOutputStream.computeMessageSize(11, this.typeAlias_.get(i14));
            }
            for (int i15 = 0; i15 < this.enumEntry_.size(); i15++) {
                i10 += CodedOutputStream.computeMessageSize(13, this.enumEntry_.get(i15));
            }
            int i16 = 0;
            for (int i17 = 0; i17 < this.sealedSubclassFqName_.size(); i17++) {
                i16 += CodedOutputStream.computeInt32SizeNoTag(this.sealedSubclassFqName_.get(i17).intValue());
            }
            int i18 = i10 + i16;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                i18 = i18 + 2 + CodedOutputStream.computeInt32SizeNoTag(i16);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = i16;
            if ((this.bitField0_ & 8) == 8) {
                i18 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.versionRequirement_.size(); i20++) {
                i19 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i20).intValue());
            }
            int size = i18 + i19 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public static Builder newBuilder(Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        public Constructor getConstructor(int i) {
            return this.constructor_.get(i);
        }

        public EnumEntry getEnumEntry(int i) {
            return this.enumEntry_.get(i);
        }

        public Function getFunction(int i) {
            return this.function_.get(i);
        }

        public Property getProperty(int i) {
            return this.property_.get(i);
        }

        public Type getSupertype(int i) {
            return this.supertype_.get(i);
        }

        public TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        private Class(boolean z) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.writeInt32NoTag(this.supertypeId_.get(i).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.writeMessage(5, this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.writeMessage(6, this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.nestedClassName_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.writeMessage(8, this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.writeMessage(9, this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.writeMessage(10, this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.writeMessage(11, this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.sealedSubclassFqName_.get(i10).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i11 = 0; i11 < this.versionRequirement_.size(); i11++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i11).intValue());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v23, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v26, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v34, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v37, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v40, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v43, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v46, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> */
        /* JADX WARN: Multi-variable type inference failed */
        private Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    TypeTable.Builder builder = null;
                    VersionRequirementTable.Builder builder2 = null;
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            break;
                        case 16:
                            if (!(z2 & true)) {
                                this.supertypeId_ = new ArrayList();
                                z2 |= true;
                            }
                            this.supertypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            break;
                        case 18:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.supertypeId_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.supertypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            break;
                        case 24:
                            this.bitField0_ |= 2;
                            this.fqName_ = codedInputStream.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 4;
                            this.companionObjectName_ = codedInputStream.readInt32();
                            break;
                        case 42:
                            if (!(z2 & true)) {
                                this.typeParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            break;
                        case MmListControl.f116813f:
                            if (!(z2 & true)) {
                                this.supertype_ = new ArrayList();
                                z2 |= true;
                            }
                            this.supertype_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            break;
                        case 56:
                            if (!(z2 & true)) {
                                this.nestedClassName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.nestedClassName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            break;
                        case 58:
                            int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.nestedClassName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.nestedClassName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit2);
                            break;
                        case 66:
                            if (!(z2 & true)) {
                                this.constructor_ = new ArrayList();
                                z2 |= true;
                            }
                            this.constructor_.add(codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                            break;
                        case 74:
                            if (!(z2 & true)) {
                                this.function_ = new ArrayList();
                                z2 |= true;
                            }
                            this.function_.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            break;
                        case 82:
                            if (!(z2 & true)) {
                                this.property_ = new ArrayList();
                                z2 |= true;
                            }
                            this.property_.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            break;
                        case CameraPosition.TILT_90:
                            if (!(z2 & true)) {
                                this.typeAlias_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeAlias_.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            break;
                        case 106:
                            if (!(z2 & true)) {
                                this.enumEntry_ = new ArrayList();
                                z2 |= true;
                            }
                            this.enumEntry_.add(codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                            break;
                        case SmActions.ACTION_ONTHECALL_EXIT:
                            if (!(z2 & true)) {
                                this.sealedSubclassFqName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.sealedSubclassFqName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            break;
                        case 130:
                            int pushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.sealedSubclassFqName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.sealedSubclassFqName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit3);
                            break;
                        case 242:
                            builder = (this.bitField0_ & 8) == 8 ? this.typeTable_.toBuilder() : builder;
                            TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder != null) {
                                builder.mergeFrom(typeTable);
                                this.typeTable_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                            break;
                        case 248:
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            break;
                        case 250:
                            int pushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit4);
                            break;
                        case 258:
                            builder2 = (this.bitField0_ & 16) == 16 ? this.versionRequirementTable_.toBuilder() : builder2;
                            VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                            this.versionRequirementTable_ = versionRequirementTable;
                            if (builder2 != null) {
                                builder2.mergeFrom(versionRequirementTable);
                                this.versionRequirementTable_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    }
                    if (z2 & true) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (z2 & true) {
                        this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    }
                    if (z2 & true) {
                        this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    }
                    if (z2 & true) {
                        this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    }
                    if (z2 & true) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if (z2 & true) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if (z2 & true) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    }
                    if (z2 & true) {
                        this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    }
                    if (z2 & true) {
                        this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
            }
            if (z2 & true) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if (z2 & true) {
                this.supertype_ = Collections.unmodifiableList(this.supertype_);
            }
            if (z2 & true) {
                this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
            }
            if (z2 & true) {
                this.constructor_ = Collections.unmodifiableList(this.constructor_);
            }
            if (z2 & true) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (z2 & true) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (z2 & true) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            if (z2 & true) {
                this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
            }
            if (z2 & true) {
                this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new AbstractParser<Effect>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.C691961 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Effect defaultInstance;
        public int bitField0_;
        public Expression conclusionOfConditionalEffect_;
        public List<Expression> effectConstructorArgument_;
        public EffectType effectType_;
        public InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            private int bitField0_;
            private Expression conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            private List<Expression> effectConstructorArgument_ = Collections.emptyList();
            private EffectType effectType_ = EffectType.RETURNS_CONSTANT;
            private InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;

            private void maybeForceBuilderInitialization() {
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.conclusionOfConditionalEffect_;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            public int getEffectConstructorArgumentCount() {
                return this.effectConstructorArgument_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasConclusionOfConditionalEffect() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureEffectConstructorArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                    return true;
                }
                return false;
            }

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                effect.effectType_ = this.effectType_;
                if ((this.bitField0_ & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.kind_;
                effect.bitField0_ = i2;
                return effect;
            }

            public Expression getEffectConstructorArgument(int i) {
                return this.effectConstructorArgument_.get(i);
            }

            public Builder setEffectType(EffectType effectType) {
                Objects.requireNonNull(effectType);
                this.bitField0_ |= 1;
                this.effectType_ = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                Objects.requireNonNull(invocationKind);
                this.bitField0_ |= 8;
                this.kind_ = invocationKind;
                return this;
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.getDefaultInstance()) {
                    this.conclusionOfConditionalEffect_ = expression;
                } else {
                    this.conclusionOfConditionalEffect_ = Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEffectConstructorArgumentIsMutable();
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Effect effect;
                Effect effect2 = null;
                try {
                    Effect parsePartialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    effect = (Effect) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    effect2 = effect;
                }
                if (effect2 != null) {
                    mergeFrom(effect2);
                }
                throw th;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);
            
            private static Internal.EnumLiteMap<EffectType> internalValueMap = new Internal.EnumLiteMap<EffectType>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.EffectType.C691971 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public EffectType findValueByNumber(int i) {
                    return EffectType.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            private EffectType(int i, int i2) {
                this.value = i2;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);
            
            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new Internal.EnumLiteMap<InvocationKind>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.InvocationKind.C691981 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public InvocationKind findValueByNumber(int i) {
                    return InvocationKind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            private InvocationKind(int i, int i2) {
                this.value = i2;
            }
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        public EffectType getEffectType() {
            return this.effectType_;
        }

        public InvocationKind getKind() {
            return this.kind_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasConclusionOfConditionalEffect() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasEffectType() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasKind() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        static {
            Effect effect = new Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        private void initFields() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.emptyList();
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.effectConstructorArgument_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(2, this.effectConstructorArgument_.get(i3));
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
            }
            int size = i + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getEffectConstructorArgument(int i) {
            return this.effectConstructorArgument_.get(i);
        }

        private Effect(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(4, this.kind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> */
        /* JADX WARN: Multi-variable type inference failed */
        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            int readEnum = codedInputStream.readEnum();
                            EffectType valueOf = EffectType.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = valueOf;
                            }
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.effectConstructorArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.effectConstructorArgument_.add(codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                        } else if (readTag == 26) {
                            Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                            this.conclusionOfConditionalEffect_ = expression;
                            if (builder != null) {
                                builder.mergeFrom(expression);
                                this.conclusionOfConditionalEffect_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 2;
                        } else if (readTag == 32) {
                            int readEnum2 = codedInputStream.readEnum();
                            InvocationKind valueOf2 = InvocationKind.valueOf(readEnum2);
                            if (valueOf2 == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum2);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = valueOf2;
                            }
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new AbstractParser<Expression>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.C692001 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Expression defaultInstance;
        public List<Expression> andArgument_;
        public int bitField0_;
        public ConstantValue constantValue_;
        public int flags_;
        public int isInstanceTypeId_;
        public Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public List<Expression> orArgument_;
        public final ByteString unknownFields;
        public int valueParameterReference_;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            private List<Expression> andArgument_ = Collections.emptyList();
            private int bitField0_;
            private ConstantValue constantValue_ = ConstantValue.TRUE;
            private int flags_;
            private int isInstanceTypeId_;
            private Type isInstanceType_ = Type.getDefaultInstance();
            private List<Expression> orArgument_ = Collections.emptyList();
            private int valueParameterReference_;

            private void maybeForceBuilderInitialization() {
            }

            public Type getIsInstanceType() {
                return this.isInstanceType_;
            }

            public static Builder create() {
                return new Builder();
            }

            public int getAndArgumentCount() {
                return this.andArgument_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            public int getOrArgumentCount() {
                return this.orArgument_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasIsInstanceType() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureAndArgumentIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.andArgument_ = new ArrayList(this.andArgument_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureOrArgumentIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.orArgument_ = new ArrayList(this.orArgument_);
                    this.bitField0_ |= 64;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                expression.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.constantValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.isInstanceType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                expression.orArgument_ = this.orArgument_;
                expression.bitField0_ = i2;
                return expression;
            }

            public Expression getAndArgument(int i) {
                return this.andArgument_.get(i);
            }

            public Expression getOrArgument(int i) {
                return this.orArgument_.get(i);
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                Objects.requireNonNull(constantValue);
                this.bitField0_ |= 4;
                this.constantValue_ = constantValue;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setIsInstanceTypeId(int i) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i;
                return this;
            }

            public Builder setValueParameterReference(int i) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i;
                return this;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.getDefaultInstance()) {
                    this.isInstanceType_ = type;
                } else {
                    this.isInstanceType_ = Type.newBuilder(this.isInstanceType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureAndArgumentIsMutable();
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureOrArgumentIsMutable();
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Expression expression;
                Expression expression2 = null;
                try {
                    Expression parsePartialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    expression = (Expression) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    expression2 = expression;
                }
                if (expression2 != null) {
                    mergeFrom(expression2);
                }
                throw th;
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);
            
            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new Internal.EnumLiteMap<ConstantValue>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.ConstantValue.C692011 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public ConstantValue findValueByNumber(int i) {
                    return ConstantValue.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            private ConstantValue(int i, int i2) {
                this.value = i2;
            }
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        public ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasConstantValue() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasIsInstanceType() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasIsInstanceTypeId() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasValueParameterReference() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        static {
            Expression expression = new Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            this.andArgument_ = Collections.emptyList();
            this.orArgument_ = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasIsInstanceType() || getIsInstanceType().isInitialized()) {
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.flags_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
            }
            for (int i3 = 0; i3 < this.andArgument_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(6, this.andArgument_.get(i3));
            }
            for (int i4 = 0; i4 < this.orArgument_.size(); i4++) {
                i += CodedOutputStream.computeMessageSize(7, this.orArgument_.get(i4));
            }
            int size = i + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i) {
            return this.andArgument_.get(i);
        }

        public Expression getOrArgument(int i) {
            return this.orArgument_.get(i);
        }

        private Expression(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.writeMessage(6, this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.writeMessage(7, this.orArgument_.get(i2));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v20, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v23, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> */
        /* JADX WARN: Multi-variable type inference failed */
        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.valueParameterReference_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            int readEnum = codedInputStream.readEnum();
                            ConstantValue valueOf = ConstantValue.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 4;
                                this.constantValue_ = valueOf;
                            }
                        } else if (readTag == 34) {
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.isInstanceType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.isInstanceType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                        } else if (readTag == 40) {
                            this.bitField0_ |= 16;
                            this.isInstanceTypeId_ = codedInputStream.readInt32();
                        } else if (readTag == 50) {
                            if (!(z2 & true)) {
                                this.andArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.andArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                        } else if (readTag == 58) {
                            if (!(z2 & true)) {
                                this.orArgument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.orArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    }
                    if (z2 & true) {
                        this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if (z2 & true) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new AbstractParser<Function>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.C692021 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Function defaultInstance;
        public int bitField0_;
        public Contract contract_;
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public int oldFlags_;
        public int receiverTypeId_;
        public Type receiverType_;
        public int returnTypeId_;
        public Type returnType_;
        public List<TypeParameter> typeParameter_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public List<ValueParameter> valueParameter_;
        public List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            private int bitField0_;
            private Contract contract_ = Contract.getDefaultInstance();
            private int flags_ = 6;
            private int name_;
            private int oldFlags_ = 6;
            private int receiverTypeId_;
            private Type receiverType_ = Type.getDefaultInstance();
            private int returnTypeId_;
            private Type returnType_ = Type.getDefaultInstance();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public Contract getContract() {
                return this.contract_;
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasContract() {
                if ((this.bitField0_ & 2048) == 2048) {
                    return true;
                }
                return false;
            }

            public boolean hasName() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasReceiverType() {
                if ((this.bitField0_ & 64) == 64) {
                    return true;
                }
                return false;
            }

            public boolean hasReturnType() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean hasTypeTable() {
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    return true;
                }
                return false;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & DynamicModule.f58006b) != 256) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= DynamicModule.f58006b;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 1024;
                }
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                    if (!getValueParameter(i2).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if ((!hasContract() || getContract().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                function.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                function.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.receiverType_;
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -257;
                }
                function.valueParameter_ = this.valueParameter_;
                if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    i2 |= SmActions.ACTION_ONTHECALL_EXIT;
                }
                function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -1025;
                }
                function.versionRequirement_ = this.versionRequirement_;
                if ((i & 2048) == 2048) {
                    i2 |= DynamicModule.f58006b;
                }
                function.contract_ = this.contract_;
                function.bitField0_ = i2;
                return function;
            }

            public TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                this.receiverTypeId_ = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.bitField0_ & 2048) != 2048 || this.contract_ == Contract.getDefaultInstance()) {
                    this.contract_ = contract;
                } else {
                    this.contract_ = Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 512 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                return this;
            }

            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Function function;
                Function function2 = null;
                try {
                    Function parsePartialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    function = (Function) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    function2 = function;
                }
                if (function2 != null) {
                    mergeFrom(function2);
                }
                throw th;
            }
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        public Contract getContract() {
            return this.contract_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasContract() {
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                return true;
            }
            return false;
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasName() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasOldFlags() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasReceiverType() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        public boolean hasReceiverTypeId() {
            if ((this.bitField0_ & 64) == 64) {
                return true;
            }
            return false;
        }

        public boolean hasReturnType() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasReturnTypeId() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasTypeTable() {
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                return true;
            }
            return false;
        }

        static {
            Function function = new Function(true);
            defaultInstance = function;
            function.initFields();
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.valueParameter_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = Collections.emptyList();
            this.contract_ = Contract.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 2) == 2) {
                i = CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i3));
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            for (int i4 = 0; i4 < this.valueParameter_.size(); i4++) {
                i += CodedOutputStream.computeMessageSize(6, this.valueParameter_.get(i4));
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i += CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                i += CodedOutputStream.computeInt32Size(9, this.flags_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                i += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
                i5 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i6).intValue());
            }
            int size = i + i5 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.contract_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasReturnType() || getReturnType().isInitialized()) {
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!hasReceiverType() || getReceiverType().isInitialized()) {
                    for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                        if (!getValueParameter(i2).isInitialized()) {
                            this.memoizedIsInitialized = 0;
                            return false;
                        }
                    }
                    if (hasTypeTable() && !getTypeTable().isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else if (hasContract() && !getContract().isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else if (!extensionsAreInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    } else {
                        this.memoizedIsInitialized = 1;
                        return true;
                    }
                } else {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        public ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        private Function(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(9, this.flags_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                codedOutputStream.writeMessage(32, this.contract_);
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v17, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v29, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> */
        /* JADX WARN: Multi-variable type inference failed */
        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Type.Builder builder = null;
                    Contract.Builder builder2 = null;
                    TypeTable.Builder builder3 = null;
                    Type.Builder builder4 = null;
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.readInt32();
                            continue;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.readInt32();
                            continue;
                        case 26:
                            builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.returnType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                            continue;
                        case 34:
                            if (!(z2 & true)) {
                                this.typeParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            continue;
                        case 42:
                            builder4 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : builder4;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder4 != null) {
                                builder4.mergeFrom(type2);
                                this.receiverType_ = builder4.buildPartial();
                            }
                            this.bitField0_ |= 32;
                            continue;
                        case MmListControl.f116813f:
                            if (!(z2 & true)) {
                                this.valueParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.valueParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            continue;
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.readInt32();
                            continue;
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.readInt32();
                            continue;
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            continue;
                        case 242:
                            builder3 = (this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128 ? this.typeTable_.toBuilder() : builder3;
                            TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder3 != null) {
                                builder3.mergeFrom(typeTable);
                                this.typeTable_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                            continue;
                        case 248:
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            continue;
                        case 250:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            continue;
                        case 258:
                            builder2 = (this.bitField0_ & DynamicModule.f58006b) == 256 ? this.contract_.toBuilder() : builder2;
                            Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                            this.contract_ = contract;
                            if (builder2 != null) {
                                builder2.mergeFrom(contract);
                                this.contract_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= DynamicModule.f58006b;
                            continue;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                continue;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (z2 & true) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if (z2 & true) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new AbstractParser<Package>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.C692051 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Package defaultInstance;
        public int bitField0_;
        public List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public List<Property> property_;
        public List<TypeAlias> typeAlias_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public VersionRequirementTable versionRequirementTable_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            private int bitField0_;
            private List<Function> function_ = Collections.emptyList();
            private List<Property> property_ = Collections.emptyList();
            private List<TypeAlias> typeAlias_ = Collections.emptyList();
            private TypeTable typeTable_ = TypeTable.getDefaultInstance();
            private VersionRequirementTable versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasTypeTable() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            private void ensureFunctionIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.function_ = new ArrayList(this.function_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensurePropertyIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.property_ = new ArrayList(this.property_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureTypeAliasIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeAlias_ = new ArrayList(this.typeAlias_);
                    this.bitField0_ |= 4;
                }
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public Package buildPartial() {
                Package r0 = new Package(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                r0.typeAlias_ = this.typeAlias_;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                r0.typeTable_ = this.typeTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                if ((!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public Function getFunction(int i) {
                return this.function_.get(i);
            }

            public Property getProperty(int i) {
                return this.property_.get(i);
            }

            public TypeAlias getTypeAlias(int i) {
                return this.typeAlias_.get(i);
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder mergeFrom(Package r3) {
                if (r3 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r3.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r3.function_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFunctionIsMutable();
                        this.function_.addAll(r3.function_);
                    }
                }
                if (!r3.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r3.property_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePropertyIsMutable();
                        this.property_.addAll(r3.property_);
                    }
                }
                if (!r3.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r3.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeAliasIsMutable();
                        this.typeAlias_.addAll(r3.typeAlias_);
                    }
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Package r4;
                Package r0 = null;
                try {
                    Package parsePartialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    r4 = (Package) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r4;
                }
                if (r0 != null) {
                    mergeFrom(r0);
                }
                throw th;
            }
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasTypeTable() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasVersionRequirementTable() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        static {
            Package r0 = new Package(true);
            defaultInstance = r0;
            r0.initFields();
        }

        private void initFields() {
            this.function_ = Collections.emptyList();
            this.property_ = Collections.emptyList();
            this.typeAlias_ = Collections.emptyList();
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.function_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(3, this.function_.get(i3));
            }
            for (int i4 = 0; i4 < this.property_.size(); i4++) {
                i2 += CodedOutputStream.computeMessageSize(4, this.property_.get(i4));
            }
            for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
                i2 += CodedOutputStream.computeMessageSize(5, this.typeAlias_.get(i5));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        public Function getFunction(int i) {
            return this.function_.get(i);
        }

        public Property getProperty(int i) {
            return this.property_.get(i);
        }

        public TypeAlias getTypeAlias(int i) {
            return this.typeAlias_.get(i);
        }

        private Package(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.function_.size(); i++) {
                codedOutputStream.writeMessage(3, this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.writeMessage(5, this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> */
        /* JADX WARN: Multi-variable type inference failed */
        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 26) {
                            if (!z2 || !true) {
                                this.function_ = new ArrayList();
                                z2 |= true;
                            }
                            this.function_.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                        } else if (readTag == 34) {
                            if (!(z2 & true)) {
                                this.property_ = new ArrayList();
                                z2 |= true;
                            }
                            this.property_.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                        } else if (readTag != 42) {
                            TypeTable.Builder builder = null;
                            VersionRequirementTable.Builder builder2 = null;
                            if (readTag == 242) {
                                builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : builder;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.typeTable_ = typeTable;
                                if (builder != null) {
                                    builder.mergeFrom(typeTable);
                                    this.typeTable_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (readTag == 258) {
                                builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : builder2;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.versionRequirementTable_ = versionRequirementTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(versionRequirementTable);
                                    this.versionRequirementTable_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.typeAlias_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeAlias_.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if (z2 & true) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if (z2 & true) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (z2 & true) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (z2 & true) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new AbstractParser<PackageFragment>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.C692061 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        };
        private static final PackageFragment defaultInstance;
        public int bitField0_;
        public List<Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public Package package_;
        public QualifiedNameTable qualifiedNames_;
        public StringTable strings_;
        public final ByteString unknownFields;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            private int bitField0_;
            private List<Class> class__ = Collections.emptyList();
            private Package package_ = Package.getDefaultInstance();
            private QualifiedNameTable qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            private StringTable strings_ = StringTable.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            public Package getPackage() {
                return this.package_;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.qualifiedNames_;
            }

            public static Builder create() {
                return new Builder();
            }

            public int getClass_Count() {
                return this.class__.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasPackage() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasQualifiedNames() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureClass_IsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.class__ = new ArrayList(this.class__);
                    this.bitField0_ |= 8;
                }
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                packageFragment.strings_ = this.strings_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.qualifiedNames_ = this.qualifiedNames_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.package_ = this.package_;
                if ((this.bitField0_ & 8) == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                    this.bitField0_ &= -9;
                }
                packageFragment.class__ = this.class__;
                packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public Class getClass_(int i) {
                return this.class__.get(i);
            }

            public Builder mergePackage(Package r4) {
                if ((this.bitField0_ & 4) != 4 || this.package_ == Package.getDefaultInstance()) {
                    this.package_ = r4;
                } else {
                    this.package_ = Package.newBuilder(this.package_).mergeFrom(r4).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 2) != 2 || this.qualifiedNames_ == QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNames_ = qualifiedNameTable;
                } else {
                    this.qualifiedNames_ = QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.bitField0_ & 1) != 1 || this.strings_ == StringTable.getDefaultInstance()) {
                    this.strings_ = stringTable;
                } else {
                    this.strings_ = StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.class__.isEmpty()) {
                        this.class__ = packageFragment.class__;
                        this.bitField0_ &= -9;
                    } else {
                        ensureClass_IsMutable();
                        this.class__.addAll(packageFragment.class__);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                PackageFragment packageFragment;
                PackageFragment packageFragment2 = null;
                try {
                    PackageFragment parsePartialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    packageFragment = (PackageFragment) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    packageFragment2 = packageFragment;
                }
                if (packageFragment2 != null) {
                    mergeFrom(packageFragment2);
                }
                throw th;
            }
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        public List<Class> getClass_List() {
            return this.class__;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Package getPackage() {
            return this.package_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        public StringTable getStrings() {
            return this.strings_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasPackage() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasQualifiedNames() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasStrings() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        private void initFields() {
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeMessageSize(1, this.strings_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeMessageSize(3, this.package_);
            }
            for (int i3 = 0; i3 < this.class__.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(4, this.class__.get(i3));
            }
            int extensionsSerializedSize = i + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasPackage() || getPackage().isInitialized()) {
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public Class getClass_(int i) {
            return this.class__.get(i);
        }

        private PackageFragment(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.writeMessage(4, this.class__.get(i));
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v29, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> */
        /* JADX WARN: Multi-variable type inference failed */
        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        StringTable.Builder builder = null;
                        Package.Builder builder2 = null;
                        QualifiedNameTable.Builder builder3 = null;
                        if (readTag == 10) {
                            builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : builder;
                            StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                            this.strings_ = stringTable;
                            if (builder != null) {
                                builder.mergeFrom(stringTable);
                                this.strings_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 1;
                        } else if (readTag == 18) {
                            builder3 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : builder3;
                            QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                            this.qualifiedNames_ = qualifiedNameTable;
                            if (builder3 != null) {
                                builder3.mergeFrom(qualifiedNameTable);
                                this.qualifiedNames_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= 2;
                        } else if (readTag == 26) {
                            builder2 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : builder2;
                            Package r6 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                            this.package_ = r6;
                            if (builder2 != null) {
                                builder2.mergeFrom(r6);
                                this.package_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= 4;
                        } else if (readTag == 34) {
                            if (!(z2 & true)) {
                                this.class__ = new ArrayList();
                                z2 |= true;
                            }
                            this.class__.add(codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.class__ = Collections.unmodifiableList(this.class__);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new AbstractParser<Property>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.C692071 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Property defaultInstance;
        public int bitField0_;
        public int flags_;
        public int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public int oldFlags_;
        public int receiverTypeId_;
        public Type receiverType_;
        public int returnTypeId_;
        public Type returnType_;
        public int setterFlags_;
        public ValueParameter setterValueParameter_;
        public List<TypeParameter> typeParameter_;
        public final ByteString unknownFields;
        public List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            private int bitField0_;
            private int flags_ = 518;
            private int getterFlags_;
            private int name_;
            private int oldFlags_ = 2054;
            private int receiverTypeId_;
            private Type receiverType_ = Type.getDefaultInstance();
            private int returnTypeId_;
            private Type returnType_ = Type.getDefaultInstance();
            private int setterFlags_;
            private ValueParameter setterValueParameter_ = ValueParameter.getDefaultInstance();
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public ValueParameter getSetterValueParameter() {
                return this.setterValueParameter_;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasName() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasReceiverType() {
                if ((this.bitField0_ & 64) == 64) {
                    return true;
                }
                return false;
            }

            public boolean hasReturnType() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean hasSetterValueParameter() {
                if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                    return true;
                }
                return false;
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 2048) != 2048) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 2048;
                }
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                if ((!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                property.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.returnTypeId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                property.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.receiverType_;
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.receiverTypeId_;
                if ((i & DynamicModule.f58006b) == 256) {
                    i2 |= SmActions.ACTION_ONTHECALL_EXIT;
                }
                property.setterValueParameter_ = this.setterValueParameter_;
                if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    i2 |= DynamicModule.f58006b;
                }
                property.getterFlags_ = this.getterFlags_;
                if ((i & 1024) == 1024) {
                    i2 |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                }
                property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -2049;
                }
                property.versionRequirement_ = this.versionRequirement_;
                property.bitField0_ = i2;
                return property;
            }

            public TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setGetterFlags(int i) {
                this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                this.getterFlags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                this.receiverTypeId_ = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            public Builder setSetterFlags(int i) {
                this.bitField0_ |= 1024;
                this.setterFlags_ = i;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.bitField0_ & DynamicModule.f58006b) != 256 || this.setterValueParameter_ == ValueParameter.getDefaultInstance()) {
                    this.setterValueParameter_ = valueParameter;
                } else {
                    this.setterValueParameter_ = ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                }
                this.bitField0_ |= DynamicModule.f58006b;
                return this;
            }

            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -2049;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Property property;
                Property property2 = null;
                try {
                    Property parsePartialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    property = (Property) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    property2 = property;
                }
                if (property2 != null) {
                    mergeFrom(property2);
                }
                throw th;
            }
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasGetterFlags() {
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                return true;
            }
            return false;
        }

        public boolean hasName() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasOldFlags() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasReceiverType() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        public boolean hasReceiverTypeId() {
            if ((this.bitField0_ & 64) == 64) {
                return true;
            }
            return false;
        }

        public boolean hasReturnType() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasReturnTypeId() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasSetterFlags() {
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                return true;
            }
            return false;
        }

        public boolean hasSetterValueParameter() {
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                return true;
            }
            return false;
        }

        static {
            Property property = new Property(true);
            defaultInstance = property;
            property.initFields();
        }

        private void initFields() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasReturnType() || getReturnType().isInitialized()) {
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 2) == 2) {
                i = CodedOutputStream.computeInt32Size(1, this.oldFlags_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(4, this.typeParameter_.get(i3));
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                i += CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                i += CodedOutputStream.computeInt32Size(7, this.getterFlags_);
            }
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                i += CodedOutputStream.computeInt32Size(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i += CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                i += CodedOutputStream.computeInt32Size(11, this.flags_);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i5).intValue());
            }
            int size = i + i4 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        private Property(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                codedOutputStream.writeMessage(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                codedOutputStream.writeInt32(7, this.getterFlags_);
            }
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                codedOutputStream.writeInt32(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v17, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> */
        /* JADX WARN: Multi-variable type inference failed */
        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Type.Builder builder = null;
                    ValueParameter.Builder builder2 = null;
                    Type.Builder builder3 = null;
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.readInt32();
                            continue;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.readInt32();
                            continue;
                        case 26:
                            builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.returnType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                            continue;
                        case 34:
                            if (!(z2 & true)) {
                                this.typeParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            continue;
                        case 42:
                            builder3 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : builder3;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type2;
                            if (builder3 != null) {
                                builder3.mergeFrom(type2);
                                this.receiverType_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= 32;
                            continue;
                        case MmListControl.f116813f:
                            builder2 = (this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128 ? this.setterValueParameter_.toBuilder() : builder2;
                            ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                            this.setterValueParameter_ = valueParameter;
                            if (builder2 != null) {
                                builder2.mergeFrom(valueParameter);
                                this.setterValueParameter_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                            continue;
                        case 56:
                            this.bitField0_ |= DynamicModule.f58006b;
                            this.getterFlags_ = codedInputStream.readInt32();
                            continue;
                        case 64:
                            this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                            this.setterFlags_ = codedInputStream.readInt32();
                            continue;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.readInt32();
                            continue;
                        case CalendarSearchResultRv.f82651b:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.readInt32();
                            continue;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            continue;
                        case 248:
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            continue;
                        case 250:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            continue;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                continue;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new AbstractParser<Type>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.C692121 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Type defaultInstance;
        public int abbreviatedTypeId_;
        public Type abbreviatedType_;
        public List<Argument> argument_;
        public int bitField0_;
        public int className_;
        public int flags_;
        public int flexibleTypeCapabilitiesId_;
        public int flexibleUpperBoundId_;
        public Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public boolean nullable_;
        public int outerTypeId_;
        public Type outerType_;
        public int typeAliasName_;
        public int typeParameterName_;
        public int typeParameter_;
        public final ByteString unknownFields;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.C692131 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            public Projection projection_;
            public int typeId_;
            public Type type_;
            public final ByteString unknownFields;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private Projection projection_ = Projection.INV;
                private int typeId_;
                private Type type_ = Type.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                public Type getType() {
                    return this.type_;
                }

                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public boolean hasType() {
                    if ((this.bitField0_ & 2) == 2) {
                        return true;
                    }
                    return false;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasType() || getType().isInitialized()) {
                        return true;
                    }
                    return false;
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    argument.projection_ = this.projection_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.type_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.typeId_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                public Builder setProjection(Projection projection) {
                    Objects.requireNonNull(projection);
                    this.bitField0_ |= 1;
                    this.projection_ = projection;
                    return this;
                }

                public Builder setTypeId(int i) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i;
                    return this;
                }

                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public Builder mergeType(Type type) {
                    if ((this.bitField0_ & 2) != 2 || this.type_ == Type.getDefaultInstance()) {
                        this.type_ = type;
                    } else {
                        this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Throwable th;
                    Argument argument;
                    Argument argument2 = null;
                    try {
                        Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        mergeFrom(argument2);
                    }
                    throw th;
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);
                
                private static Internal.EnumLiteMap<Projection> internalValueMap = new Internal.EnumLiteMap<Projection>() {
                    /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.C692141 */

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Projection findValueByNumber(int i) {
                        return Projection.valueOf(i);
                    }
                };
                private final int value;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                private Projection(int i, int i2) {
                    this.value = i2;
                }
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.projection_;
            }

            public Type getType() {
                return this.type_;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public boolean hasProjection() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean hasType() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasTypeId() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
                this.memoizedIsInitialized = 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeEnumSize(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeMessageSize(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += CodedOutputStream.computeInt32Size(3, this.typeId_);
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.typeId_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                int readEnum = codedInputStream.readEnum();
                                Projection valueOf = Projection.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.projection_ = valueOf;
                                }
                            } else if (readTag == 18) {
                                Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.type_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.type_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 24) {
                                this.bitField0_ |= 4;
                                this.typeId_ = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            private int abbreviatedTypeId_;
            private Type abbreviatedType_ = Type.getDefaultInstance();
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int className_;
            private int flags_;
            private int flexibleTypeCapabilitiesId_;
            private int flexibleUpperBoundId_;
            private Type flexibleUpperBound_ = Type.getDefaultInstance();
            private boolean nullable_;
            private int outerTypeId_;
            private Type outerType_ = Type.getDefaultInstance();
            private int typeAliasName_;
            private int typeParameterName_;
            private int typeParameter_;

            private void maybeForceBuilderInitialization() {
            }

            public Type getAbbreviatedType() {
                return this.abbreviatedType_;
            }

            public Type getFlexibleUpperBound() {
                return this.flexibleUpperBound_;
            }

            public Type getOuterType() {
                return this.outerType_;
            }

            public static Builder create() {
                return new Builder();
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasAbbreviatedType() {
                if ((this.bitField0_ & 2048) == 2048) {
                    return true;
                }
                return false;
            }

            public boolean hasFlexibleUpperBound() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean hasOuterType() {
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (hasOuterType() && !getOuterType().isInitialized()) {
                    return false;
                }
                if ((!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public Type buildPartial() {
                Type type = new Type(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                type.argument_ = this.argument_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                type.nullable_ = this.nullable_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.className_ = this.className_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.typeParameter_ = this.typeParameter_;
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                    i2 |= 64;
                }
                type.typeParameterName_ = this.typeParameterName_;
                if ((i & DynamicModule.f58006b) == 256) {
                    i2 |= SmActions.ACTION_ONTHECALL_EXIT;
                }
                type.typeAliasName_ = this.typeAliasName_;
                if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                    i2 |= DynamicModule.f58006b;
                }
                type.outerType_ = this.outerType_;
                if ((i & 1024) == 1024) {
                    i2 |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                }
                type.outerTypeId_ = this.outerTypeId_;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.abbreviatedType_ = this.abbreviatedType_;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.flags_ = this.flags_;
                type.bitField0_ = i2;
                return type;
            }

            public Argument getArgument(int i) {
                return this.argument_.get(i);
            }

            public Builder setAbbreviatedTypeId(int i) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i;
                return this;
            }

            public Builder setClassName(int i) {
                this.bitField0_ |= 32;
                this.className_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 8192;
                this.flags_ = i;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i;
                return this;
            }

            public Builder setNullable(boolean z) {
                this.bitField0_ |= 2;
                this.nullable_ = z;
                return this;
            }

            public Builder setOuterTypeId(int i) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i;
                return this;
            }

            public Builder setTypeAliasName(int i) {
                this.bitField0_ |= DynamicModule.f58006b;
                this.typeAliasName_ = i;
                return this;
            }

            public Builder setTypeParameter(int i) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i;
                return this;
            }

            public Builder setTypeParameterName(int i) {
                this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                this.typeParameterName_ = i;
                return this;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.bitField0_ & 2048) != 2048 || this.abbreviatedType_ == Type.getDefaultInstance()) {
                    this.abbreviatedType_ = type;
                } else {
                    this.abbreviatedType_ = Type.newBuilder(this.abbreviatedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.getDefaultInstance()) {
                    this.flexibleUpperBound_ = type;
                } else {
                    this.flexibleUpperBound_ = Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 512 || this.outerType_ == Type.getDefaultInstance()) {
                    this.outerType_ = type;
                } else {
                    this.outerType_ = Type.newBuilder(this.outerType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                return this;
            }

            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Type type;
                Type type2 = null;
                try {
                    Type parsePartialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    type = (Type) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    type2 = type;
                }
                if (type2 != null) {
                    mergeFrom(type2);
                }
                throw th;
            }
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        public Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getClassName() {
            return this.className_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public Type getOuterType() {
            return this.outerType_;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasAbbreviatedType() {
            if ((this.bitField0_ & 1024) == 1024) {
                return true;
            }
            return false;
        }

        public boolean hasAbbreviatedTypeId() {
            if ((this.bitField0_ & 2048) == 2048) {
                return true;
            }
            return false;
        }

        public boolean hasClassName() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 4096) == 4096) {
                return true;
            }
            return false;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasFlexibleUpperBound() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasFlexibleUpperBoundId() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasNullable() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasOuterType() {
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                return true;
            }
            return false;
        }

        public boolean hasOuterTypeId() {
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                return true;
            }
            return false;
        }

        public boolean hasTypeAliasName() {
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                return true;
            }
            return false;
        }

        public boolean hasTypeParameter() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        public boolean hasTypeParameterName() {
            if ((this.bitField0_ & 64) == 64) {
                return true;
            }
            return false;
        }

        static {
            Type type = new Type(true);
            defaultInstance = type;
            type.initFields();
        }

        private void initFields() {
            this.argument_ = Collections.emptyList();
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 4096) == 4096) {
                i = CodedOutputStream.computeInt32Size(1, this.flags_) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.argument_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(2, this.argument_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                i += CodedOutputStream.computeBoolSize(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeInt32Size(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.computeInt32Size(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                i += CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                i += CodedOutputStream.computeMessageSize(10, this.outerType_);
            }
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                i += CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                i += CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                i += CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                i += CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
            }
            int extensionsSerializedSize = i + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        public Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        private Type(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                codedOutputStream.writeMessage(10, this.outerType_);
            }
            if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                codedOutputStream.writeInt32(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                codedOutputStream.writeInt32(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> */
        /* JADX WARN: Multi-variable type inference failed */
        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Builder builder = null;
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = codedInputStream.readInt32();
                            continue;
                        case 18:
                            if (!z2 || !true) {
                                this.argument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            continue;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = codedInputStream.readBool();
                            continue;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = codedInputStream.readInt32();
                            continue;
                        case 42:
                            builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.flexibleUpperBound_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.flexibleUpperBound_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = codedInputStream.readInt32();
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = codedInputStream.readInt32();
                            continue;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = codedInputStream.readInt32();
                            continue;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = codedInputStream.readInt32();
                            continue;
                        case 82:
                            builder = (this.bitField0_ & DynamicModule.f58006b) == 256 ? this.outerType_.toBuilder() : builder;
                            Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.outerType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.outerType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= DynamicModule.f58006b;
                            continue;
                        case 88:
                            this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                            this.outerTypeId_ = codedInputStream.readInt32();
                            continue;
                        case 96:
                            this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                            this.typeAliasName_ = codedInputStream.readInt32();
                            continue;
                        case 106:
                            builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : builder;
                            Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                            this.abbreviatedType_ = type3;
                            if (builder != null) {
                                builder.mergeFrom(type3);
                                this.abbreviatedType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 1024;
                            continue;
                        case SmEvents.EVENT_NE_RR:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = codedInputStream.readInt32();
                            continue;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                continue;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new AbstractParser<TypeAlias>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.C692151 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeAlias defaultInstance;
        public List<Annotation> annotation_;
        public int bitField0_;
        public int expandedTypeId_;
        public Type expandedType_;
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public List<TypeParameter> typeParameter_;
        public int underlyingTypeId_;
        public Type underlyingType_;
        public final ByteString unknownFields;
        public List<Integer> versionRequirement_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            private List<Annotation> annotation_ = Collections.emptyList();
            private int bitField0_;
            private int expandedTypeId_;
            private Type expandedType_ = Type.getDefaultInstance();
            private int flags_ = 6;
            private int name_;
            private List<TypeParameter> typeParameter_ = Collections.emptyList();
            private int underlyingTypeId_;
            private Type underlyingType_ = Type.getDefaultInstance();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public Type getExpandedType() {
                return this.expandedType_;
            }

            public Type getUnderlyingType() {
                return this.underlyingType_;
            }

            public static Builder create() {
                return new Builder();
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasExpandedType() {
                if ((this.bitField0_ & 32) == 32) {
                    return true;
                }
                return false;
            }

            public boolean hasName() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasUnderlyingType() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            private void ensureAnnotationIsMutable() {
                if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) != 128) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                }
            }

            private void ensureTypeParameterIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & DynamicModule.f58006b) != 256) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= DynamicModule.f58006b;
                }
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                typeAlias.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.name_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                typeAlias.typeParameter_ = this.typeParameter_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.underlyingType_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.expandedType_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                typeAlias.versionRequirement_ = this.versionRequirement_;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            public Annotation getAnnotation(int i) {
                return this.annotation_.get(i);
            }

            public TypeParameter getTypeParameter(int i) {
                return this.typeParameter_.get(i);
            }

            public Builder setExpandedTypeId(int i) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setUnderlyingTypeId(int i) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i;
                return this;
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.getDefaultInstance()) {
                    this.expandedType_ = type;
                } else {
                    this.expandedType_ = Type.newBuilder(this.expandedType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.getDefaultInstance()) {
                    this.underlyingType_ = type;
                } else {
                    this.underlyingType_ = Type.newBuilder(this.underlyingType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeParameterIsMutable();
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureAnnotationIsMutable();
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                TypeAlias typeAlias;
                TypeAlias typeAlias2 = null;
                try {
                    TypeAlias parsePartialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeAlias = (TypeAlias) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeAlias2 = typeAlias;
                }
                if (typeAlias2 != null) {
                    mergeFrom(typeAlias2);
                }
                throw th;
            }
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Type getExpandedType() {
            return this.expandedType_;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasExpandedType() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasExpandedTypeId() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasName() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasUnderlyingType() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasUnderlyingTypeId() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            this.typeParameter_ = Collections.emptyList();
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasExpandedType() || getExpandedType().isInitialized()) {
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.flags_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(3, this.typeParameter_.get(i3));
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeMessageSize(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i += CodedOutputStream.computeMessageSize(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i += CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
            }
            for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
                i += CodedOutputStream.computeMessageSize(8, this.annotation_.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
                i5 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i6).intValue());
            }
            int size = i + i5 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public TypeParameter getTypeParameter(int i) {
            return this.typeParameter_.get(i);
        }

        private TypeAlias(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(3, this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(8, this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i3).intValue());
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v35, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> */
        /* JADX WARN: Multi-variable type inference failed */
        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    Type.Builder builder = null;
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            continue;
                        case 16:
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                            continue;
                        case 26:
                            if (!(z2 & true)) {
                                this.typeParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            continue;
                        case 34:
                            builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : builder;
                            Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.underlyingType_ = type;
                            if (builder != null) {
                                builder.mergeFrom(type);
                                this.underlyingType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = codedInputStream.readInt32();
                            continue;
                        case MmListControl.f116813f:
                            builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : builder;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.expandedType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.expandedType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = codedInputStream.readInt32();
                            continue;
                        case 66:
                            if (!(z2 & true)) {
                                this.annotation_ = new ArrayList();
                                z2 |= true;
                            }
                            this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            continue;
                        case 248:
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            continue;
                        case 250:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            continue;
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                continue;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (z2 & true) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
            }
            if (z2 & true) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new AbstractParser<TypeParameter>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.C692161 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeParameter defaultInstance;
        public int bitField0_;
        public int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public boolean reified_;
        public final ByteString unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        public List<Integer> upperBoundId_;
        public List<Type> upperBound_;
        public Variance variance_;

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);
            
            private static Internal.EnumLiteMap<Variance> internalValueMap = new Internal.EnumLiteMap<Variance>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.C692171 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Variance findValueByNumber(int i) {
                    return Variance.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            private Variance(int i, int i2) {
                this.value = i2;
            }
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getId() {
            return this.id_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.reified_;
        }

        public List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        public List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public Variance getVariance() {
            return this.variance_;
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            private int bitField0_;
            private int id_;
            private int name_;
            private boolean reified_;
            private List<Integer> upperBoundId_ = Collections.emptyList();
            private List<Type> upperBound_ = Collections.emptyList();
            private Variance variance_ = Variance.INV;

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            public int getUpperBoundCount() {
                return this.upperBound_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasId() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean hasName() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureUpperBoundIdIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureUpperBoundIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!(hasId() && hasName())) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                typeParameter.id_ = this.id_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.reified_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.variance_;
                if ((this.bitField0_ & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                typeParameter.upperBoundId_ = this.upperBoundId_;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            public Type getUpperBound(int i) {
                return this.upperBound_.get(i);
            }

            public Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setReified(boolean z) {
                this.bitField0_ |= 4;
                this.reified_ = z;
                return this;
            }

            public Builder setVariance(Variance variance) {
                Objects.requireNonNull(variance);
                this.bitField0_ |= 8;
                this.variance_ = variance;
                return this;
            }

            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureUpperBoundIsMutable();
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureUpperBoundIdIsMutable();
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                TypeParameter typeParameter;
                TypeParameter typeParameter2 = null;
                try {
                    TypeParameter parsePartialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeParameter = (TypeParameter) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeParameter2 = typeParameter;
                }
                if (typeParameter2 != null) {
                    mergeFrom(typeParameter2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasId() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasName() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasReified() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasVariance() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            this.upperBound_ = Collections.emptyList();
            this.upperBoundId_ = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.id_) + 0;
            } else {
                i = 0;
            }
            if ((this.bitField0_ & 2) == 2) {
                i += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i += CodedOutputStream.computeBoolSize(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i += CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
            }
            for (int i3 = 0; i3 < this.upperBound_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(5, this.upperBound_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.upperBoundId_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(this.upperBoundId_.get(i5).intValue());
            }
            int i6 = i + i4;
            if (!getUpperBoundIdList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.upperBoundIdMemoizedSerializedSize = i4;
            int extensionsSerializedSize = i6 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        private TypeParameter(boolean z) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        public Type getUpperBound(int i) {
            return this.upperBound_.get(i);
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.writeMessage(5, this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.writeInt32NoTag(this.upperBoundId_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> */
        /* JADX WARN: Multi-variable type inference failed */
        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = codedInputStream.readBool();
                        } else if (readTag == 32) {
                            int readEnum = codedInputStream.readEnum();
                            Variance valueOf = Variance.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = valueOf;
                            }
                        } else if (readTag == 42) {
                            if (!(z2 & true)) {
                                this.upperBound_ = new ArrayList();
                                z2 |= true;
                            }
                            this.upperBound_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                        } else if (readTag == 48) {
                            if (!(z2 & true)) {
                                this.upperBoundId_ = new ArrayList();
                                z2 |= true;
                            }
                            this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                        } else if (readTag == 50) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if (z2 & true) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if (z2 & true) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new AbstractParser<ValueParameter>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.C692191 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        };
        private static final ValueParameter defaultInstance;
        public int bitField0_;
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public int typeId_;
        public Type type_;
        public final ByteString unknownFields;
        public int varargElementTypeId_;
        public Type varargElementType_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            private int bitField0_;
            private int flags_;
            private int name_;
            private int typeId_;
            private Type type_ = Type.getDefaultInstance();
            private int varargElementTypeId_;
            private Type varargElementType_ = Type.getDefaultInstance();

            private void maybeForceBuilderInitialization() {
            }

            public Type getType() {
                return this.type_;
            }

            public Type getVarargElementType() {
                return this.varargElementType_;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasName() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasType() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasVarargElementType() {
                if ((this.bitField0_ & 16) == 16) {
                    return true;
                }
                return false;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if ((!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized()) {
                    return true;
                }
                return false;
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                valueParameter.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.type_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.typeId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.varargElementType_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setTypeId(int i) {
                this.bitField0_ |= 8;
                this.typeId_ = i;
                return this;
            }

            public Builder setVarargElementTypeId(int i) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i;
                return this;
            }

            public Builder mergeType(Type type) {
                if ((this.bitField0_ & 4) != 4 || this.type_ == Type.getDefaultInstance()) {
                    this.type_ = type;
                } else {
                    this.type_ = Type.newBuilder(this.type_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.getDefaultInstance()) {
                    this.varargElementType_ = type;
                } else {
                    this.varargElementType_ = Type.newBuilder(this.varargElementType_).mergeFrom(type).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                ValueParameter valueParameter;
                ValueParameter valueParameter2 = null;
                try {
                    ValueParameter parsePartialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    valueParameter = (ValueParameter) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    valueParameter2 = valueParameter;
                }
                if (valueParameter2 != null) {
                    mergeFrom(valueParameter2);
                }
                throw th;
            }
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        public Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public Type getVarargElementType() {
            return this.varargElementType_;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasName() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasType() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasTypeId() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasVarargElementType() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasVarargElementTypeId() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeMessageSize(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeMessageSize(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeInt32Size(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        private ValueParameter(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.varargElementTypeId_);
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag != 16) {
                            Type.Builder builder = null;
                            if (readTag == 26) {
                                builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : builder;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.type_ = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.type_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            } else if (readTag == 34) {
                                builder = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : builder;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.varargElementType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.varargElementType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 16;
                            } else if (readTag == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = codedInputStream.readInt32();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new AbstractParser<VersionRequirement>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.C692201 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirement defaultInstance;
        public int bitField0_;
        public int errorCode_;
        public Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int message_;
        public final ByteString unknownFields;
        public int versionFull_;
        public VersionKind versionKind_;
        public int version_;

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);
            
            private static Internal.EnumLiteMap<Level> internalValueMap = new Internal.EnumLiteMap<Level>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.C692211 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Level findValueByNumber(int i) {
                    return Level.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            private Level(int i, int i2) {
                this.value = i2;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);
            
            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new Internal.EnumLiteMap<VersionKind>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind.C692221 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public VersionKind findValueByNumber(int i) {
                    return VersionKind.valueOf(i);
                }
            };
            private final int value;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            private VersionKind(int i, int i2) {
                this.value = i2;
            }
        }

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public Level getLevel() {
            return this.level_;
        }

        public int getMessage() {
            return this.message_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        public int getVersion() {
            return this.version_;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public VersionKind getVersionKind() {
            return this.versionKind_;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            private int bitField0_;
            private int errorCode_;
            private Level level_ = Level.ERROR;
            private int message_;
            private int versionFull_;
            private VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;
            private int version_;

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                versionRequirement.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.versionFull_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.level_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.errorCode_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.message_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.versionKind_;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            public Builder setErrorCode(int i) {
                this.bitField0_ |= 8;
                this.errorCode_ = i;
                return this;
            }

            public Builder setLevel(Level level) {
                Objects.requireNonNull(level);
                this.bitField0_ |= 4;
                this.level_ = level;
                return this;
            }

            public Builder setMessage(int i) {
                this.bitField0_ |= 16;
                this.message_ = i;
                return this;
            }

            public Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                return this;
            }

            public Builder setVersionFull(int i) {
                this.bitField0_ |= 2;
                this.versionFull_ = i;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                Objects.requireNonNull(versionKind);
                this.bitField0_ |= 32;
                this.versionKind_ = versionKind;
                return this;
            }

            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                VersionRequirement versionRequirement;
                VersionRequirement versionRequirement2 = null;
                try {
                    VersionRequirement parsePartialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirement = (VersionRequirement) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    versionRequirement2 = versionRequirement;
                }
                if (versionRequirement2 != null) {
                    mergeFrom(versionRequirement2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasErrorCode() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasLevel() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasMessage() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasVersion() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasVersionFull() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasVersionKind() {
            if ((this.bitField0_ & 32) == 32) {
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeInt32Size(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.computeInt32Size(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i2 += CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        private VersionRequirement(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.versionFull_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            int readEnum = codedInputStream.readEnum();
                            Level valueOf = Level.valueOf(readEnum);
                            if (valueOf == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum);
                            } else {
                                this.bitField0_ |= 4;
                                this.level_ = valueOf;
                            }
                        } else if (readTag == 32) {
                            this.bitField0_ |= 8;
                            this.errorCode_ = codedInputStream.readInt32();
                        } else if (readTag == 40) {
                            this.bitField0_ |= 16;
                            this.message_ = codedInputStream.readInt32();
                        } else if (readTag == 48) {
                            int readEnum2 = codedInputStream.readEnum();
                            VersionKind valueOf2 = VersionKind.valueOf(readEnum2);
                            if (valueOf2 == null) {
                                newInstance.writeRawVarint32(readTag);
                                newInstance.writeRawVarint32(readEnum2);
                            } else {
                                this.bitField0_ |= 32;
                                this.versionKind_ = valueOf2;
                            }
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new AbstractParser<Annotation>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.C691881 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Annotation defaultInstance;
        public List<Argument> argument_;
        public int bitField0_;
        public int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public final ByteString unknownFields;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AbstractParser<Argument>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.C691891 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Argument defaultInstance;
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            public int nameId_;
            public final ByteString unknownFields;
            public Value value_;

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new AbstractParser<Value>() {
                    /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.C691901 */

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final Value defaultInstance;
                public Annotation annotation_;
                public int arrayDimensionCount_;
                public List<Value> arrayElement_;
                public int bitField0_;
                public int classId_;
                public double doubleValue_;
                public int enumValueId_;
                public int flags_;
                public float floatValue_;
                public long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                public int stringValue_;
                public Type type_;
                public final ByteString unknownFields;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    private Annotation annotation_ = Annotation.getDefaultInstance();
                    private int arrayDimensionCount_;
                    private List<Value> arrayElement_ = Collections.emptyList();
                    private int bitField0_;
                    private int classId_;
                    private double doubleValue_;
                    private int enumValueId_;
                    private int flags_;
                    private float floatValue_;
                    private long intValue_;
                    private int stringValue_;
                    private Type type_ = Type.BYTE;

                    private void maybeForceBuilderInitialization() {
                    }

                    public Annotation getAnnotation() {
                        return this.annotation_;
                    }

                    public static Builder create() {
                        return new Builder();
                    }

                    public int getArrayElementCount() {
                        return this.arrayElement_.size();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    public Builder clone() {
                        return create().mergeFrom(buildPartial());
                    }

                    public boolean hasAnnotation() {
                        if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                            return true;
                        }
                        return false;
                    }

                    private Builder() {
                        maybeForceBuilderInitialization();
                    }

                    private void ensureArrayElementIsMutable() {
                        if ((this.bitField0_ & DynamicModule.f58006b) != 256) {
                            this.arrayElement_ = new ArrayList(this.arrayElement_);
                            this.bitField0_ |= DynamicModule.f58006b;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i = this.bitField0_;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        value.type_ = this.type_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.intValue_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.floatValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.doubleValue_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.stringValue_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.classId_;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.enumValueId_;
                        if ((i & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                            i2 |= SmActions.ACTION_ONTHECALL_EXIT;
                        }
                        value.annotation_ = this.annotation_;
                        if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        value.arrayElement_ = this.arrayElement_;
                        if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                            i2 |= DynamicModule.f58006b;
                        }
                        value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i & 1024) == 1024) {
                            i2 |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                        }
                        value.flags_ = this.flags_;
                        value.bitField0_ = i2;
                        return value;
                    }

                    public Value getArrayElement(int i) {
                        return this.arrayElement_.get(i);
                    }

                    public Builder setArrayDimensionCount(int i) {
                        this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                        this.arrayDimensionCount_ = i;
                        return this;
                    }

                    public Builder setClassId(int i) {
                        this.bitField0_ |= 32;
                        this.classId_ = i;
                        return this;
                    }

                    public Builder setDoubleValue(double d) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d;
                        return this;
                    }

                    public Builder setEnumValueId(int i) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i;
                        return this;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i;
                        return this;
                    }

                    public Builder setFloatValue(float f) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f;
                        return this;
                    }

                    public Builder setIntValue(long j) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j;
                        return this;
                    }

                    public Builder setStringValue(int i) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i;
                        return this;
                    }

                    public Builder setType(Type type) {
                        Objects.requireNonNull(type);
                        this.bitField0_ |= 1;
                        this.type_ = type;
                        return this;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) != 128 || this.annotation_ == Annotation.getDefaultInstance()) {
                            this.annotation_ = annotation;
                        } else {
                            this.annotation_ = Annotation.newBuilder(this.annotation_).mergeFrom(annotation).buildPartial();
                        }
                        this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                        return this;
                    }

                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                ensureArrayElementIsMutable();
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.unknownFields));
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        Throwable th;
                        Value value;
                        Value value2 = null;
                        try {
                            Value parsePartialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            value = (Value) e.getUnfinishedMessage();
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            value2 = value;
                        }
                        if (value2 != null) {
                            mergeFrom(value2);
                        }
                        throw th;
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);
                    
                    private static Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() {
                        /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.C691911 */

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        public Type findValueByNumber(int i) {
                            return Type.valueOf(i);
                        }
                    };
                    private final int value;

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    private Type(int i, int i2) {
                        this.value = i2;
                    }
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                public Annotation getAnnotation() {
                    return this.annotation_;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getClassId() {
                    return this.classId_;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public Type getType() {
                    return this.type_;
                }

                public static Builder newBuilder() {
                    return Builder.create();
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                public boolean hasAnnotation() {
                    if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                        return true;
                    }
                    return false;
                }

                public boolean hasArrayDimensionCount() {
                    if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                        return true;
                    }
                    return false;
                }

                public boolean hasClassId() {
                    if ((this.bitField0_ & 32) == 32) {
                        return true;
                    }
                    return false;
                }

                public boolean hasDoubleValue() {
                    if ((this.bitField0_ & 8) == 8) {
                        return true;
                    }
                    return false;
                }

                public boolean hasEnumValueId() {
                    if ((this.bitField0_ & 64) == 64) {
                        return true;
                    }
                    return false;
                }

                public boolean hasFlags() {
                    if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                        return true;
                    }
                    return false;
                }

                public boolean hasFloatValue() {
                    if ((this.bitField0_ & 4) == 4) {
                        return true;
                    }
                    return false;
                }

                public boolean hasIntValue() {
                    if ((this.bitField0_ & 2) == 2) {
                        return true;
                    }
                    return false;
                }

                public boolean hasStringValue() {
                    if ((this.bitField0_ & 16) == 16) {
                        return true;
                    }
                    return false;
                }

                public boolean hasType() {
                    if ((this.bitField0_ & 1) == 1) {
                        return true;
                    }
                    return false;
                }

                static {
                    Value value = new Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                private void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0;
                    this.floatValue_ = BitmapDescriptorFactory.HUE_RED;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.emptyList();
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (!hasAnnotation() || getAnnotation().isInitialized()) {
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                this.memoizedIsInitialized = 0;
                                return false;
                            }
                        }
                        this.memoizedIsInitialized = 1;
                        return true;
                    }
                    this.memoizedIsInitialized = 0;
                    return false;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i;
                    int i2 = this.memoizedSerializedSize;
                    if (i2 != -1) {
                        return i2;
                    }
                    if ((this.bitField0_ & 1) == 1) {
                        i = CodedOutputStream.computeEnumSize(1, this.type_.getNumber()) + 0;
                    } else {
                        i = 0;
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        i += CodedOutputStream.computeSInt64Size(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        i += CodedOutputStream.computeFloatSize(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i += CodedOutputStream.computeDoubleSize(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i += CodedOutputStream.computeInt32Size(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        i += CodedOutputStream.computeInt32Size(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        i += CodedOutputStream.computeInt32Size(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                        i += CodedOutputStream.computeMessageSize(8, this.annotation_);
                    }
                    for (int i3 = 0; i3 < this.arrayElement_.size(); i3++) {
                        i += CodedOutputStream.computeMessageSize(9, this.arrayElement_.get(i3));
                    }
                    if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                        i += CodedOutputStream.computeInt32Size(10, this.flags_);
                    }
                    if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                        i += CodedOutputStream.computeInt32Size(11, this.arrayDimensionCount_);
                    }
                    int size = i + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public Value getArrayElement(int i) {
                    return this.arrayElement_.get(i);
                }

                private Value(boolean z) {
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                        codedOutputStream.writeMessage(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.writeMessage(9, this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 512) {
                        codedOutputStream.writeInt32(10, this.flags_);
                    }
                    if ((this.bitField0_ & DynamicModule.f58006b) == 256) {
                        codedOutputStream.writeInt32(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r6v29, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> */
                /* JADX WARN: Multi-variable type inference failed */
                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.memoizedIsInitialized = -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    ByteString.Output newOutput = ByteString.newOutput();
                    CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 8:
                                    int readEnum = codedInputStream.readEnum();
                                    Type valueOf = Type.valueOf(readEnum);
                                    if (valueOf == null) {
                                        newInstance.writeRawVarint32(readTag);
                                        newInstance.writeRawVarint32(readEnum);
                                        continue;
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.type_ = valueOf;
                                    }
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.intValue_ = codedInputStream.readSInt64();
                                    continue;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = codedInputStream.readFloat();
                                    continue;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = codedInputStream.readDouble();
                                    continue;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = codedInputStream.readInt32();
                                    continue;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = codedInputStream.readInt32();
                                    continue;
                                case 66:
                                    Builder builder = (this.bitField0_ & SmActions.ACTION_ONTHECALL_EXIT) == 128 ? this.annotation_.toBuilder() : null;
                                    Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                    this.annotation_ = annotation;
                                    if (builder != null) {
                                        builder.mergeFrom(annotation);
                                        this.annotation_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= SmActions.ACTION_ONTHECALL_EXIT;
                                    continue;
                                case 74:
                                    if (!(z2 & true)) {
                                        this.arrayElement_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.arrayElement_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                    continue;
                                case CalendarSearchResultRv.f82651b:
                                    this.bitField0_ |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                                    this.flags_ = codedInputStream.readInt32();
                                    continue;
                                case 88:
                                    this.bitField0_ |= DynamicModule.f58006b;
                                    this.arrayDimensionCount_ = codedInputStream.readInt32();
                                    continue;
                                default:
                                    if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                        continue;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            if (z2 & true) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            }
                            try {
                                newInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.unknownFields = newOutput.toByteString();
                                throw th2;
                            }
                            this.unknownFields = newOutput.toByteString();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 & true) {
                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.unknownFields = newOutput.toByteString();
                        throw th3;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int bitField0_;
                private int nameId_;
                private Value value_ = Value.getDefaultInstance();

                private void maybeForceBuilderInitialization() {
                }

                public Value getValue() {
                    return this.value_;
                }

                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public boolean hasNameId() {
                    if ((this.bitField0_ & 1) == 1) {
                        return true;
                    }
                    return false;
                }

                public boolean hasValue() {
                    if ((this.bitField0_ & 2) == 2) {
                        return true;
                    }
                    return false;
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (hasNameId() && hasValue() && getValue().isInitialized()) {
                        return true;
                    }
                    return false;
                }

                public Builder setNameId(int i) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i;
                    return this;
                }

                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public Builder mergeValue(Value value) {
                    if ((this.bitField0_ & 2) != 2 || this.value_ == Value.getDefaultInstance()) {
                        this.value_ = value;
                    } else {
                        this.value_ = Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Throwable th;
                    Argument argument;
                    Argument argument2 = null;
                    try {
                        Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        argument = (Argument) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        argument2 = argument;
                    }
                    if (argument2 != null) {
                        mergeFrom(argument2);
                    }
                    throw th;
                }
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            public int getNameId() {
                return this.nameId_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Value getValue() {
                return this.value_;
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public boolean hasNameId() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean hasValue() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeInt32Size(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeMessageSize(2, this.value_);
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!hasValue()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!getValue().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            private Argument(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.value_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.nameId_ = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                this.value_ = value;
                                if (builder != null) {
                                    builder.mergeFrom(value);
                                    this.value_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getId() {
            return this.id_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            private List<Argument> argument_ = Collections.emptyList();
            private int bitField0_;
            private int id_;

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public boolean hasId() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            private void ensureArgumentIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                annotation.id_ = this.id_;
                if ((this.bitField0_ & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                annotation.argument_ = this.argument_;
                annotation.bitField0_ = i;
                return annotation;
            }

            public Argument getArgument(int i) {
                return this.argument_.get(i);
            }

            public Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureArgumentIsMutable();
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Annotation annotation;
                Annotation annotation2 = null;
                try {
                    Annotation parsePartialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    annotation = (Annotation) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    annotation2 = annotation;
                }
                if (annotation2 != null) {
                    mergeFrom(annotation2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = Collections.emptyList();
        }

        public boolean hasId() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        static {
            Annotation annotation = new Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.id_) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.argument_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(2, this.argument_.get(i3));
            }
            int size = i + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i) {
            return this.argument_.get(i);
        }

        private Annotation(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, this.argument_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> */
        /* JADX WARN: Multi-variable type inference failed */
        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = codedInputStream.readInt32();
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.argument_ = new ArrayList();
                                z2 |= true;
                            }
                            this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new AbstractParser<Constructor>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.C691941 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Constructor defaultInstance;
        public int bitField0_;
        public int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public final ByteString unknownFields;
        public List<ValueParameter> valueParameter_;
        public List<Integer> versionRequirement_;

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFlags() {
            return this.flags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            private int bitField0_;
            private int flags_ = 6;
            private List<ValueParameter> valueParameter_ = Collections.emptyList();
            private List<Integer> versionRequirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void ensureValueParameterIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.valueParameter_ = new ArrayList(this.valueParameter_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureVersionRequirementIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 4;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                constructor.flags_ = this.flags_;
                if ((this.bitField0_ & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                constructor.versionRequirement_ = this.versionRequirement_;
                constructor.bitField0_ = i;
                return constructor;
            }

            public ValueParameter getValueParameter(int i) {
                return this.valueParameter_.get(i);
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureValueParameterIsMutable();
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureVersionRequirementIsMutable();
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Constructor constructor;
                Constructor constructor2 = null;
                try {
                    Constructor parsePartialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    constructor = (Constructor) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    constructor2 = constructor;
                }
                if (constructor2 != null) {
                    mergeFrom(constructor2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private void initFields() {
            this.flags_ = 6;
            this.valueParameter_ = Collections.emptyList();
            this.versionRequirement_ = Collections.emptyList();
        }

        public boolean hasFlags() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        static {
            Constructor constructor = new Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSerializedSize;
            if (i2 != -1) {
                return i2;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeInt32Size(1, this.flags_) + 0;
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                i += CodedOutputStream.computeMessageSize(2, this.valueParameter_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(this.versionRequirement_.get(i5).intValue());
            }
            int size = i + i4 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public ValueParameter getValueParameter(int i) {
            return this.valueParameter_.get(i);
        }

        private Constructor(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.writeMessage(2, this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
                codedOutputStream.writeInt32(31, this.versionRequirement_.get(i2).intValue());
            }
            newExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> */
        /* JADX WARN: Multi-variable type inference failed */
        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.valueParameter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.valueParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                        } else if (readTag == 248) {
                            if (!(z2 & true)) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                        } else if (readTag == 250) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if (z2 & true) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if (z2 & true) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new AbstractParser<Contract>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.C691951 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        };
        private static final Contract defaultInstance;
        public List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public final ByteString unknownFields;

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            private int bitField0_;
            private List<Effect> effect_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            public int getEffectCount() {
                return this.effect_.size();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private void ensureEffectIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.effect_ = new ArrayList(this.effect_);
                    this.bitField0_ |= 1;
                }
            }

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                contract.effect_ = this.effect_;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Effect getEffect(int i) {
                return this.effect_.get(i);
            }

            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEffectIsMutable();
                        this.effect_.addAll(contract.effect_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                Contract contract;
                Contract contract2 = null;
                try {
                    Contract parsePartialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    contract = (Contract) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    contract2 = contract;
                }
                if (contract2 != null) {
                    mergeFrom(contract2);
                }
                throw th;
            }
        }

        private void initFields() {
            this.effect_ = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        static {
            Contract contract = new Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.effect_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.effect_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public Effect getEffect(int i) {
            return this.effect_.get(i);
        }

        private Contract(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.writeMessage(1, this.effect_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> */
        /* JADX WARN: Multi-variable type inference failed */
        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.effect_ = new ArrayList();
                                z2 |= true;
                            }
                            this.effect_.add(codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new AbstractParser<EnumEntry>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.C691991 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        };
        private static final EnumEntry defaultInstance;
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public int name_;
        public final ByteString unknownFields;

        private void initFields() {
            this.name_ = 0;
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            private int bitField0_;
            private int name_;

            private void maybeForceBuilderInitialization() {
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!extensionsAreInitialized()) {
                    return false;
                }
                return true;
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = 1;
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                enumEntry.name_ = this.name_;
                enumEntry.bitField0_ = i;
                return enumEntry;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                EnumEntry enumEntry;
                EnumEntry enumEntry2 = null;
                try {
                    EnumEntry parsePartialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    enumEntry = (EnumEntry) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    enumEntry2 = enumEntry;
                }
                if (enumEntry2 != null) {
                    mergeFrom(enumEntry2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public boolean hasName() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = extendableBuilder.getUnknownFields();
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        private EnumEntry(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            newExtensionWriter.writeUntil(LocationRequest.PRIORITY_HD_ACCURACY, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);
        
        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new Internal.EnumLiteMap<MemberKind>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.C692031 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public MemberKind findValueByNumber(int i) {
                return MemberKind.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        private MemberKind(int i, int i2) {
            this.value = i2;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);
        
        private static Internal.EnumLiteMap<Modality> internalValueMap = new Internal.EnumLiteMap<Modality>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.C692041 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Modality findValueByNumber(int i) {
                return Modality.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        private Modality(int i, int i2) {
            this.value = i2;
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new AbstractParser<QualifiedNameTable>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.C692081 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public List<QualifiedName> qualifiedName_;
        public final ByteString unknownFields;

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new AbstractParser<QualifiedName>() {
                /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.C692091 */

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            };
            private static final QualifiedName defaultInstance;
            public int bitField0_;
            public Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            public int parentQualifiedName_;
            public int shortName_;
            public final ByteString unknownFields;

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);
                
                private static Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() {
                    /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.C692101 */

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Kind findValueByNumber(int i) {
                        return Kind.valueOf(i);
                    }
                };
                private final int value;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                private Kind(int i, int i2) {
                    this.value = i2;
                }
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            public Kind getKind() {
                return this.kind_;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                private int bitField0_;
                private Kind kind_ = Kind.PACKAGE;
                private int parentQualifiedName_ = -1;
                private int shortName_;

                private void maybeForceBuilderInitialization() {
                }

                public static Builder create() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public boolean hasShortName() {
                    if ((this.bitField0_ & 2) == 2) {
                        return true;
                    }
                    return false;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    if (!hasShortName()) {
                        return false;
                    }
                    return true;
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.shortName_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.kind_;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                public Builder setKind(Kind kind) {
                    Objects.requireNonNull(kind);
                    this.bitField0_ |= 4;
                    this.kind_ = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i;
                    return this;
                }

                public Builder setShortName(int i) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i;
                    return this;
                }

                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Throwable th;
                    QualifiedName qualifiedName;
                    QualifiedName qualifiedName2 = null;
                    try {
                        QualifiedName parsePartialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        qualifiedName = (QualifiedName) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        qualifiedName2 = qualifiedName;
                    }
                    if (qualifiedName2 != null) {
                        mergeFrom(qualifiedName2);
                    }
                    throw th;
                }
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public boolean hasKind() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasParentQualifiedName() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean hasShortName() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasShortName()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeInt32Size(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
                }
                int size = i2 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            private QualifiedName(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.kind_.getNumber());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.parentQualifiedName_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.shortName_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                Kind valueOf = Kind.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = valueOf;
                                }
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            private int bitField0_;
            private List<QualifiedName> qualifiedName_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            public int getQualifiedNameCount() {
                return this.qualifiedName_.size();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private void ensureQualifiedNameIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                    this.bitField0_ |= 1;
                }
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public QualifiedName getQualifiedName(int i) {
                return this.qualifiedName_.get(i);
            }

            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureQualifiedNameIsMutable();
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                QualifiedNameTable qualifiedNameTable;
                QualifiedNameTable qualifiedNameTable2 = null;
                try {
                    QualifiedNameTable parsePartialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedNameTable = (QualifiedNameTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    qualifiedNameTable2 = qualifiedNameTable;
                }
                if (qualifiedNameTable2 != null) {
                    mergeFrom(qualifiedNameTable2);
                }
                throw th;
            }
        }

        private void initFields() {
            this.qualifiedName_ = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.qualifiedName_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        public QualifiedName getQualifiedName(int i) {
            return this.qualifiedName_.get(i);
        }

        private QualifiedNameTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.writeMessage(1, this.qualifiedName_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> */
        /* JADX WARN: Multi-variable type inference failed */
        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.qualifiedName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.qualifiedName_.add(codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new AbstractParser<StringTable>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.C692111 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public LazyStringList string_;
        public final ByteString unknownFields;

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        public ProtocolStringList getStringList() {
            return this.string_;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            private int bitField0_;
            private LazyStringList string_ = LazyStringArrayList.EMPTY;

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private void ensureStringIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.string_ = new LazyStringArrayList(this.string_);
                    this.bitField0_ |= 1;
                }
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                stringTable.string_ = this.string_;
                return stringTable;
            }

            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureStringIsMutable();
                        this.string_.addAll(stringTable.string_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                StringTable stringTable;
                StringTable stringTable2 = null;
                try {
                    StringTable parsePartialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTable = (StringTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    stringTable2 = stringTable;
                }
                if (stringTable2 != null) {
                    mergeFrom(stringTable2);
                }
                throw th;
            }
        }

        private void initFields() {
            this.string_ = LazyStringArrayList.EMPTY;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        static {
            StringTable stringTable = new StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.string_.size(); i3++) {
                i2 += CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i3));
            }
            int size = 0 + i2 + (getStringList().size() * 1) + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        public String getString(int i) {
            return (String) this.string_.get(i);
        }

        private StringTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.writeBytes(1, this.string_.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            ByteString readBytes = codedInputStream.readBytes();
                            if (!z2 || !true) {
                                this.string_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.string_.add(readBytes);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.string_ = this.string_.getUnmodifiableView();
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new AbstractParser<TypeTable>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.C692181 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final TypeTable defaultInstance;
        public int bitField0_;
        public int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public List<Type> type_;
        public final ByteString unknownFields;

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        public List<Type> getTypeList() {
            return this.type_;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            private int bitField0_;
            private int firstNullable_ = -1;
            private List<Type> type_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) == 1) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                typeTable.type_ = this.type_;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                typeTable.firstNullable_ = this.firstNullable_;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            public Type getType(int i) {
                return this.type_.get(i);
            }

            public Builder setFirstNullable(int i) {
                this.bitField0_ |= 2;
                this.firstNullable_ = i;
                return this;
            }

            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                TypeTable typeTable;
                TypeTable typeTable2 = null;
                try {
                    TypeTable parsePartialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    typeTable = (TypeTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    typeTable2 = typeTable;
                }
                if (typeTable2 != null) {
                    mergeFrom(typeTable2);
                }
                throw th;
            }
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private void initFields() {
            this.type_ = Collections.emptyList();
            this.firstNullable_ = -1;
        }

        public boolean hasFirstNullable() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.type_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public Type getType(int i) {
            return this.type_.get(i);
        }

        private TypeTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.writeMessage(1, this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(2, this.firstNullable_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> */
        /* JADX WARN: Multi-variable type inference failed */
        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.type_ = new ArrayList();
                                z2 |= true;
                            }
                            this.type_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                        } else if (readTag == 16) {
                            this.bitField0_ |= 1;
                            this.firstNullable_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new AbstractParser<VersionRequirementTable>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.C692231 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        };
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        public List<VersionRequirement> requirement_;
        public final ByteString unknownFields;

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            private int bitField0_;
            private List<VersionRequirement> requirement_ = Collections.emptyList();

            private void maybeForceBuilderInitialization() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static Builder create() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            @Override // java.lang.Object, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            private void ensureRequirementIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.requirement_ = new ArrayList(this.requirement_);
                    this.bitField0_ |= 1;
                }
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequirementIsMutable();
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Throwable th;
                VersionRequirementTable versionRequirementTable;
                VersionRequirementTable versionRequirementTable2 = null;
                try {
                    VersionRequirementTable parsePartialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (parsePartialFrom != null) {
                        mergeFrom(parsePartialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    versionRequirementTable = (VersionRequirementTable) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    versionRequirementTable2 = versionRequirementTable;
                }
                if (versionRequirementTable2 != null) {
                    mergeFrom(versionRequirementTable2);
                }
                throw th;
            }
        }

        private void initFields() {
            this.requirement_ = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.requirement_.get(i3));
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        private VersionRequirementTable(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.writeMessage(1, this.requirement_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> */
        /* JADX WARN: Multi-variable type inference failed */
        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.requirement_ = new ArrayList();
                                z2 |= true;
                            }
                            this.requirement_.add(codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);
        
        private static Internal.EnumLiteMap<Visibility> internalValueMap = new Internal.EnumLiteMap<Visibility>() {
            /* class kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.C692241 */

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Visibility findValueByNumber(int i) {
                return Visibility.valueOf(i);
            }
        };
        private final int value;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        private Visibility(int i, int i2) {
            this.value = i2;
        }
    }
}
