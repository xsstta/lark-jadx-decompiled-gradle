package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UninterpretedOption extends Message<UninterpretedOption, C23187a> {
    public static final ProtoAdapter<UninterpretedOption> ADAPTER = new C23188b();
    public static final String DEFAULT_AGGREGATE_VALUE = "";
    public static final Double DEFAULT_DOUBLE_VALUE = Double.valueOf(0.0d);
    public static final String DEFAULT_IDENTIFIER_VALUE = "";
    public static final Long DEFAULT_NEGATIVE_INT_VALUE = 0L;
    public static final Long DEFAULT_POSITIVE_INT_VALUE = 0L;
    public static final ByteString DEFAULT_STRING_VALUE = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final String maggregate_value;
    public final Double mdouble_value;
    public final String midentifier_value;
    public final List<NamePart> mname;
    public final Long mnegative_int_value;
    public final Long mpositive_int_value;
    public final ByteString mstring_value;

    public static final class NamePart extends Message<NamePart, C23185a> {
        public static final ProtoAdapter<NamePart> ADAPTER = new C23186b();
        public static final Boolean DEFAULT_IS_EXTENSION = false;
        public static final String DEFAULT_NAME_PART = "";
        private static final long serialVersionUID = 0;
        public final Boolean mis_extension;
        public final String mname_part;

        /* renamed from: com.google.protobuf.server.UninterpretedOption$NamePart$b */
        private static final class C23186b extends ProtoAdapter<NamePart> {
            C23186b() {
                super(FieldEncoding.LENGTH_DELIMITED, NamePart.class);
            }

            /* renamed from: a */
            public int encodedSize(NamePart namePart) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, namePart.mname_part) + ProtoAdapter.BOOL.encodedSizeWithTag(2, namePart.mis_extension) + namePart.unknownFields().size();
            }

            /* renamed from: a */
            public NamePart decode(ProtoReader protoReader) throws IOException {
                C23185a aVar = new C23185a();
                aVar.f57197a = "";
                aVar.f57198b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57197a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57198b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NamePart namePart) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, namePart.mname_part);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, namePart.mis_extension);
                protoWriter.writeBytes(namePart.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23185a newBuilder() {
            C23185a aVar = new C23185a();
            aVar.f57197a = this.mname_part;
            aVar.f57198b = this.mis_extension;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.google.protobuf.server.UninterpretedOption$NamePart$a */
        public static final class C23185a extends Message.Builder<NamePart, C23185a> {

            /* renamed from: a */
            public String f57197a;

            /* renamed from: b */
            public Boolean f57198b;

            /* renamed from: a */
            public NamePart build() {
                Boolean bool;
                String str = this.f57197a;
                if (str != null && (bool = this.f57198b) != null) {
                    return new NamePart(str, bool, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "mname_part", this.f57198b, "mis_extension");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", name_part=");
            sb.append(this.mname_part);
            sb.append(", is_extension=");
            sb.append(this.mis_extension);
            StringBuilder replace = sb.replace(0, 2, "NamePart{");
            replace.append('}');
            return replace.toString();
        }

        public NamePart(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public NamePart(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mname_part = str;
            this.mis_extension = bool;
        }
    }

    /* renamed from: com.google.protobuf.server.UninterpretedOption$b */
    private static final class C23188b extends ProtoAdapter<UninterpretedOption> {
        C23188b() {
            super(FieldEncoding.LENGTH_DELIMITED, UninterpretedOption.class);
        }

        /* renamed from: a */
        public int encodedSize(UninterpretedOption uninterpretedOption) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = NamePart.ADAPTER.asRepeated().encodedSizeWithTag(2, uninterpretedOption.mname);
            int i6 = 0;
            if (uninterpretedOption.midentifier_value != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, uninterpretedOption.midentifier_value);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (uninterpretedOption.mpositive_int_value != null) {
                i2 = ProtoAdapter.UINT64.encodedSizeWithTag(4, uninterpretedOption.mpositive_int_value);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (uninterpretedOption.mnegative_int_value != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(5, uninterpretedOption.mnegative_int_value);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (uninterpretedOption.mdouble_value != null) {
                i4 = ProtoAdapter.DOUBLE.encodedSizeWithTag(6, uninterpretedOption.mdouble_value);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (uninterpretedOption.mstring_value != null) {
                i5 = ProtoAdapter.BYTES.encodedSizeWithTag(7, uninterpretedOption.mstring_value);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (uninterpretedOption.maggregate_value != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, uninterpretedOption.maggregate_value);
            }
            return i11 + i6 + uninterpretedOption.unknownFields().size();
        }

        /* renamed from: a */
        public UninterpretedOption decode(ProtoReader protoReader) throws IOException {
            C23187a aVar = new C23187a();
            aVar.f57200b = "";
            aVar.f57201c = 0L;
            aVar.f57202d = 0L;
            aVar.f57203e = Double.valueOf(0.0d);
            aVar.f57204f = ByteString.EMPTY;
            aVar.f57205g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            aVar.f57199a.add(NamePart.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f57200b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f57201c = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f57202d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f57203e = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            aVar.f57204f = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 8:
                            aVar.f57205g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UninterpretedOption uninterpretedOption) throws IOException {
            NamePart.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, uninterpretedOption.mname);
            if (uninterpretedOption.midentifier_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uninterpretedOption.midentifier_value);
            }
            if (uninterpretedOption.mpositive_int_value != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, uninterpretedOption.mpositive_int_value);
            }
            if (uninterpretedOption.mnegative_int_value != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, uninterpretedOption.mnegative_int_value);
            }
            if (uninterpretedOption.mdouble_value != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, uninterpretedOption.mdouble_value);
            }
            if (uninterpretedOption.mstring_value != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, uninterpretedOption.mstring_value);
            }
            if (uninterpretedOption.maggregate_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, uninterpretedOption.maggregate_value);
            }
            protoWriter.writeBytes(uninterpretedOption.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.UninterpretedOption$a */
    public static final class C23187a extends Message.Builder<UninterpretedOption, C23187a> {

        /* renamed from: a */
        public List<NamePart> f57199a = Internal.newMutableList();

        /* renamed from: b */
        public String f57200b;

        /* renamed from: c */
        public Long f57201c;

        /* renamed from: d */
        public Long f57202d;

        /* renamed from: e */
        public Double f57203e;

        /* renamed from: f */
        public ByteString f57204f;

        /* renamed from: g */
        public String f57205g;

        /* renamed from: a */
        public UninterpretedOption build() {
            return new UninterpretedOption(this.f57199a, this.f57200b, this.f57201c, this.f57202d, this.f57203e, this.f57204f, this.f57205g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23187a newBuilder() {
        C23187a aVar = new C23187a();
        aVar.f57199a = Internal.copyOf("mname", this.mname);
        aVar.f57200b = this.midentifier_value;
        aVar.f57201c = this.mpositive_int_value;
        aVar.f57202d = this.mnegative_int_value;
        aVar.f57203e = this.mdouble_value;
        aVar.f57204f = this.mstring_value;
        aVar.f57205g = this.maggregate_value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mname.isEmpty()) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.midentifier_value != null) {
            sb.append(", identifier_value=");
            sb.append(this.midentifier_value);
        }
        if (this.mpositive_int_value != null) {
            sb.append(", positive_int_value=");
            sb.append(this.mpositive_int_value);
        }
        if (this.mnegative_int_value != null) {
            sb.append(", negative_int_value=");
            sb.append(this.mnegative_int_value);
        }
        if (this.mdouble_value != null) {
            sb.append(", double_value=");
            sb.append(this.mdouble_value);
        }
        if (this.mstring_value != null) {
            sb.append(", string_value=");
            sb.append(this.mstring_value);
        }
        if (this.maggregate_value != null) {
            sb.append(", aggregate_value=");
            sb.append(this.maggregate_value);
        }
        StringBuilder replace = sb.replace(0, 2, "UninterpretedOption{");
        replace.append('}');
        return replace.toString();
    }

    public UninterpretedOption(List<NamePart> list, String str, Long l, Long l2, Double d, ByteString byteString, String str2) {
        this(list, str, l, l2, d, byteString, str2, ByteString.EMPTY);
    }

    public UninterpretedOption(List<NamePart> list, String str, Long l, Long l2, Double d, ByteString byteString, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mname = Internal.immutableCopyOf("mname", list);
        this.midentifier_value = str;
        this.mpositive_int_value = l;
        this.mnegative_int_value = l2;
        this.mdouble_value = d;
        this.mstring_value = byteString;
        this.maggregate_value = str2;
    }
}
