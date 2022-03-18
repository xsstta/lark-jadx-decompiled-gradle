package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class FieldDescriptorProto extends Message<FieldDescriptorProto, C23057a> {
    public static final ProtoAdapter<FieldDescriptorProto> ADAPTER = new C23058b();
    public static final String DEFAULT_DEFAULT_VALUE = "";
    public static final String DEFAULT_EXTENDEE = "";
    public static final Label DEFAULT_LABEL = Label.LABEL_OPTIONAL;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUMBER = 0;
    public static final Integer DEFAULT_ONEOF_INDEX = 0;
    public static final Type DEFAULT_TYPE = Type.TYPE_DOUBLE;
    public static final String DEFAULT_TYPE_NAME = "";
    private static final long serialVersionUID = 0;
    public final String default_value;
    public final String extendee;
    public final Label label;
    public final String name;
    public final Integer number;
    public final Integer oneof_index;
    public final FieldOptions options;
    public final Type type;
    public final String type_name;

    public enum Label implements WireEnum {
        LABEL_OPTIONAL(1),
        LABEL_REQUIRED(2),
        LABEL_REPEATED(3);
        
        public static final ProtoAdapter<Label> ADAPTER = ProtoAdapter.newEnumAdapter(Label.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Label fromValue(int i) {
            if (i == 1) {
                return LABEL_OPTIONAL;
            }
            if (i == 2) {
                return LABEL_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return LABEL_REPEATED;
        }

        private Label(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.protobuf.FieldDescriptorProto$b */
    private static final class C23058b extends ProtoAdapter<FieldDescriptorProto> {
        C23058b() {
            super(FieldEncoding.LENGTH_DELIMITED, FieldDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(FieldDescriptorProto fieldDescriptorProto) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (fieldDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fieldDescriptorProto.name);
            } else {
                i = 0;
            }
            if (fieldDescriptorProto.number != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, fieldDescriptorProto.number);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (fieldDescriptorProto.label != null) {
                i3 = Label.ADAPTER.encodedSizeWithTag(4, fieldDescriptorProto.label);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (fieldDescriptorProto.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(5, fieldDescriptorProto.type);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (fieldDescriptorProto.type_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, fieldDescriptorProto.type_name);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (fieldDescriptorProto.extendee != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(2, fieldDescriptorProto.extendee);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (fieldDescriptorProto.default_value != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, fieldDescriptorProto.default_value);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (fieldDescriptorProto.oneof_index != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, fieldDescriptorProto.oneof_index);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (fieldDescriptorProto.options != null) {
                i9 = FieldOptions.ADAPTER.encodedSizeWithTag(8, fieldDescriptorProto.options);
            }
            return i16 + i9 + fieldDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public FieldDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23057a aVar = new C23057a();
            aVar.f56935a = "";
            aVar.f56936b = 0;
            aVar.f56937c = Label.LABEL_OPTIONAL;
            aVar.f56938d = Type.TYPE_DOUBLE;
            aVar.f56939e = "";
            aVar.f56940f = "";
            aVar.f56941g = "";
            aVar.f56942h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f56935a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f56940f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f56936b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f56937c = Label.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f56938d = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f56939e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f56941g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f56943i = FieldOptions.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f56942h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FieldDescriptorProto fieldDescriptorProto) throws IOException {
            if (fieldDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fieldDescriptorProto.name);
            }
            if (fieldDescriptorProto.number != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, fieldDescriptorProto.number);
            }
            if (fieldDescriptorProto.label != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 4, fieldDescriptorProto.label);
            }
            if (fieldDescriptorProto.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 5, fieldDescriptorProto.type);
            }
            if (fieldDescriptorProto.type_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, fieldDescriptorProto.type_name);
            }
            if (fieldDescriptorProto.extendee != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fieldDescriptorProto.extendee);
            }
            if (fieldDescriptorProto.default_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, fieldDescriptorProto.default_value);
            }
            if (fieldDescriptorProto.oneof_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, fieldDescriptorProto.oneof_index);
            }
            if (fieldDescriptorProto.options != null) {
                FieldOptions.ADAPTER.encodeWithTag(protoWriter, 8, fieldDescriptorProto.options);
            }
            protoWriter.writeBytes(fieldDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.FieldDescriptorProto$a */
    public static final class C23057a extends Message.Builder<FieldDescriptorProto, C23057a> {

        /* renamed from: a */
        public String f56935a;

        /* renamed from: b */
        public Integer f56936b;

        /* renamed from: c */
        public Label f56937c;

        /* renamed from: d */
        public Type f56938d;

        /* renamed from: e */
        public String f56939e;

        /* renamed from: f */
        public String f56940f;

        /* renamed from: g */
        public String f56941g;

        /* renamed from: h */
        public Integer f56942h;

        /* renamed from: i */
        public FieldOptions f56943i;

        /* renamed from: a */
        public FieldDescriptorProto build() {
            return new FieldDescriptorProto(this.f56935a, this.f56936b, this.f56937c, this.f56938d, this.f56939e, this.f56940f, this.f56941g, this.f56942h, this.f56943i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23057a newBuilder() {
        C23057a aVar = new C23057a();
        aVar.f56935a = this.name;
        aVar.f56936b = this.number;
        aVar.f56937c = this.label;
        aVar.f56938d = this.type;
        aVar.f56939e = this.type_name;
        aVar.f56940f = this.extendee;
        aVar.f56941g = this.default_value;
        aVar.f56942h = this.oneof_index;
        aVar.f56943i = this.options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "FieldDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.number != null) {
            sb.append(", number=");
            sb.append(this.number);
        }
        if (this.label != null) {
            sb.append(", label=");
            sb.append(this.label);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.type_name != null) {
            sb.append(", type_name=");
            sb.append(this.type_name);
        }
        if (this.extendee != null) {
            sb.append(", extendee=");
            sb.append(this.extendee);
        }
        if (this.default_value != null) {
            sb.append(", default_value=");
            sb.append(this.default_value);
        }
        if (this.oneof_index != null) {
            sb.append(", oneof_index=");
            sb.append(this.oneof_index);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder replace = sb.replace(0, 2, "FieldDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public FieldDescriptorProto(String str, Integer num, Label label2, Type type2, String str2, String str3, String str4, Integer num2, FieldOptions fieldOptions) {
        this(str, num, label2, type2, str2, str3, str4, num2, fieldOptions, ByteString.EMPTY);
    }

    public FieldDescriptorProto(String str, Integer num, Label label2, Type type2, String str2, String str3, String str4, Integer num2, FieldOptions fieldOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.number = num;
        this.label = label2;
        this.type = type2;
        this.type_name = str2;
        this.extendee = str3;
        this.default_value = str4;
        this.oneof_index = num2;
        this.options = fieldOptions;
    }
}
