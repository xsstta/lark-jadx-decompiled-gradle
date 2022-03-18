package com.google.protobuf.server;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class FieldDescriptorProto extends Message<FieldDescriptorProto, C23153a> {
    public static final ProtoAdapter<FieldDescriptorProto> ADAPTER = new C23154b();
    public static final String DEFAULT_DEFAULT_VALUE = "";
    public static final String DEFAULT_EXTENDEE = "";
    public static final String DEFAULT_JSON_NAME = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUMBER = 0;
    public static final Integer DEFAULT_ONEOF_INDEX = 0;
    public static final String DEFAULT_TYPE_NAME = "";
    private static final long serialVersionUID = 0;
    public final String mdefault_value;
    public final String mextendee;
    public final String mjson_name;
    public final Label mlabel;
    public final String mname;
    public final Integer mnumber;
    public final Integer moneof_index;
    public final FieldOptions moptions;
    public final Type mtype;
    public final String mtype_name;

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

    /* renamed from: com.google.protobuf.server.FieldDescriptorProto$b */
    private static final class C23154b extends ProtoAdapter<FieldDescriptorProto> {
        C23154b() {
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
            int i9;
            int i10 = 0;
            if (fieldDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fieldDescriptorProto.mname);
            } else {
                i = 0;
            }
            if (fieldDescriptorProto.mnumber != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, fieldDescriptorProto.mnumber);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (fieldDescriptorProto.mlabel != null) {
                i3 = Label.ADAPTER.encodedSizeWithTag(4, fieldDescriptorProto.mlabel);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (fieldDescriptorProto.mtype != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(5, fieldDescriptorProto.mtype);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (fieldDescriptorProto.mtype_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, fieldDescriptorProto.mtype_name);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (fieldDescriptorProto.mextendee != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(2, fieldDescriptorProto.mextendee);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (fieldDescriptorProto.mdefault_value != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, fieldDescriptorProto.mdefault_value);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (fieldDescriptorProto.moneof_index != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, fieldDescriptorProto.moneof_index);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (fieldDescriptorProto.mjson_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, fieldDescriptorProto.mjson_name);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (fieldDescriptorProto.moptions != null) {
                i10 = FieldOptions.ADAPTER.encodedSizeWithTag(8, fieldDescriptorProto.moptions);
            }
            return i18 + i10 + fieldDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public FieldDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23153a aVar = new C23153a();
            aVar.f57113a = "";
            aVar.f57114b = 0;
            aVar.f57117e = "";
            aVar.f57118f = "";
            aVar.f57119g = "";
            aVar.f57120h = 0;
            aVar.f57121i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f57113a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f57118f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f57114b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f57115c = Label.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f57116d = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f57117e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f57119g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f57122j = FieldOptions.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f57120h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f57121i = ProtoAdapter.STRING.decode(protoReader);
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
            if (fieldDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fieldDescriptorProto.mname);
            }
            if (fieldDescriptorProto.mnumber != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, fieldDescriptorProto.mnumber);
            }
            if (fieldDescriptorProto.mlabel != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 4, fieldDescriptorProto.mlabel);
            }
            if (fieldDescriptorProto.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 5, fieldDescriptorProto.mtype);
            }
            if (fieldDescriptorProto.mtype_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, fieldDescriptorProto.mtype_name);
            }
            if (fieldDescriptorProto.mextendee != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fieldDescriptorProto.mextendee);
            }
            if (fieldDescriptorProto.mdefault_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, fieldDescriptorProto.mdefault_value);
            }
            if (fieldDescriptorProto.moneof_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, fieldDescriptorProto.moneof_index);
            }
            if (fieldDescriptorProto.mjson_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, fieldDescriptorProto.mjson_name);
            }
            if (fieldDescriptorProto.moptions != null) {
                FieldOptions.ADAPTER.encodeWithTag(protoWriter, 8, fieldDescriptorProto.moptions);
            }
            protoWriter.writeBytes(fieldDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.FieldDescriptorProto$a */
    public static final class C23153a extends Message.Builder<FieldDescriptorProto, C23153a> {

        /* renamed from: a */
        public String f57113a;

        /* renamed from: b */
        public Integer f57114b;

        /* renamed from: c */
        public Label f57115c;

        /* renamed from: d */
        public Type f57116d;

        /* renamed from: e */
        public String f57117e;

        /* renamed from: f */
        public String f57118f;

        /* renamed from: g */
        public String f57119g;

        /* renamed from: h */
        public Integer f57120h;

        /* renamed from: i */
        public String f57121i;

        /* renamed from: j */
        public FieldOptions f57122j;

        /* renamed from: a */
        public FieldDescriptorProto build() {
            return new FieldDescriptorProto(this.f57113a, this.f57114b, this.f57115c, this.f57116d, this.f57117e, this.f57118f, this.f57119g, this.f57120h, this.f57121i, this.f57122j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23153a newBuilder() {
        C23153a aVar = new C23153a();
        aVar.f57113a = this.mname;
        aVar.f57114b = this.mnumber;
        aVar.f57115c = this.mlabel;
        aVar.f57116d = this.mtype;
        aVar.f57117e = this.mtype_name;
        aVar.f57118f = this.mextendee;
        aVar.f57119g = this.mdefault_value;
        aVar.f57120h = this.moneof_index;
        aVar.f57121i = this.mjson_name;
        aVar.f57122j = this.moptions;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mnumber != null) {
            sb.append(", number=");
            sb.append(this.mnumber);
        }
        if (this.mlabel != null) {
            sb.append(", label=");
            sb.append(this.mlabel);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mtype_name != null) {
            sb.append(", type_name=");
            sb.append(this.mtype_name);
        }
        if (this.mextendee != null) {
            sb.append(", extendee=");
            sb.append(this.mextendee);
        }
        if (this.mdefault_value != null) {
            sb.append(", default_value=");
            sb.append(this.mdefault_value);
        }
        if (this.moneof_index != null) {
            sb.append(", oneof_index=");
            sb.append(this.moneof_index);
        }
        if (this.mjson_name != null) {
            sb.append(", json_name=");
            sb.append(this.mjson_name);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        StringBuilder replace = sb.replace(0, 2, "FieldDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public FieldDescriptorProto(String str, Integer num, Label label, Type type, String str2, String str3, String str4, Integer num2, String str5, FieldOptions fieldOptions) {
        this(str, num, label, type, str2, str3, str4, num2, str5, fieldOptions, ByteString.EMPTY);
    }

    public FieldDescriptorProto(String str, Integer num, Label label, Type type, String str2, String str3, String str4, Integer num2, String str5, FieldOptions fieldOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mnumber = num;
        this.mlabel = label;
        this.mtype = type;
        this.mtype_name = str2;
        this.mextendee = str3;
        this.mdefault_value = str4;
        this.moneof_index = num2;
        this.mjson_name = str5;
        this.moptions = fieldOptions;
    }
}
