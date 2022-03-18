package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UninterpretedOption extends Message<UninterpretedOption, C23096a> {
    public static final ProtoAdapter<UninterpretedOption> ADAPTER = new C23097b();
    public static final String DEFAULT_AGGREGATE_VALUE = "";
    public static final Double DEFAULT_DOUBLE_VALUE = Double.valueOf(0.0d);
    public static final String DEFAULT_IDENTIFIER_VALUE = "";
    public static final Long DEFAULT_NEGATIVE_INT_VALUE = 0L;
    public static final Long DEFAULT_POSITIVE_INT_VALUE = 0L;
    public static final ByteString DEFAULT_STRING_VALUE = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final String aggregate_value;
    public final Double double_value;
    public final String identifier_value;
    public final List<NamePart> name;
    public final Long negative_int_value;
    public final Long positive_int_value;
    public final ByteString string_value;

    public static final class NamePart extends Message<NamePart, C23094a> {
        public static final ProtoAdapter<NamePart> ADAPTER = new C23095b();
        public static final Boolean DEFAULT_IS_EXTENSION = false;
        public static final String DEFAULT_NAME_PART = "";
        private static final long serialVersionUID = 0;
        public final Boolean is_extension;
        public final String name_part;

        /* renamed from: com.google.protobuf.UninterpretedOption$NamePart$b */
        private static final class C23095b extends ProtoAdapter<NamePart> {
            C23095b() {
                super(FieldEncoding.LENGTH_DELIMITED, NamePart.class);
            }

            /* renamed from: a */
            public int encodedSize(NamePart namePart) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, namePart.name_part) + ProtoAdapter.BOOL.encodedSizeWithTag(2, namePart.is_extension) + namePart.unknownFields().size();
            }

            /* renamed from: a */
            public NamePart decode(ProtoReader protoReader) throws IOException {
                C23094a aVar = new C23094a();
                aVar.f57020a = "";
                aVar.f57021b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57020a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57021b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NamePart namePart) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, namePart.name_part);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, namePart.is_extension);
                protoWriter.writeBytes(namePart.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23094a newBuilder() {
            C23094a aVar = new C23094a();
            aVar.f57020a = this.name_part;
            aVar.f57021b = this.is_extension;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.google.protobuf.UninterpretedOption$NamePart$a */
        public static final class C23094a extends Message.Builder<NamePart, C23094a> {

            /* renamed from: a */
            public String f57020a;

            /* renamed from: b */
            public Boolean f57021b;

            /* renamed from: a */
            public NamePart build() {
                Boolean bool;
                String str = this.f57020a;
                if (str != null && (bool = this.f57021b) != null) {
                    return new NamePart(str, bool, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "name_part", this.f57021b, "is_extension");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("google", "NamePart");
            StringBuilder sb = new StringBuilder();
            sb.append(", name_part=");
            sb.append(this.name_part);
            sb.append(", is_extension=");
            sb.append(this.is_extension);
            StringBuilder replace = sb.replace(0, 2, "NamePart{");
            replace.append('}');
            return replace.toString();
        }

        public NamePart(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public NamePart(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name_part = str;
            this.is_extension = bool;
        }
    }

    /* renamed from: com.google.protobuf.UninterpretedOption$b */
    private static final class C23097b extends ProtoAdapter<UninterpretedOption> {
        C23097b() {
            super(FieldEncoding.LENGTH_DELIMITED, UninterpretedOption.class);
        }

        /* renamed from: a */
        public int encodedSize(UninterpretedOption uninterpretedOption) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = NamePart.ADAPTER.asRepeated().encodedSizeWithTag(2, uninterpretedOption.name);
            int i6 = 0;
            if (uninterpretedOption.identifier_value != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, uninterpretedOption.identifier_value);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (uninterpretedOption.positive_int_value != null) {
                i2 = ProtoAdapter.UINT64.encodedSizeWithTag(4, uninterpretedOption.positive_int_value);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (uninterpretedOption.negative_int_value != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(5, uninterpretedOption.negative_int_value);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (uninterpretedOption.double_value != null) {
                i4 = ProtoAdapter.DOUBLE.encodedSizeWithTag(6, uninterpretedOption.double_value);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (uninterpretedOption.string_value != null) {
                i5 = ProtoAdapter.BYTES.encodedSizeWithTag(7, uninterpretedOption.string_value);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (uninterpretedOption.aggregate_value != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, uninterpretedOption.aggregate_value);
            }
            return i11 + i6 + uninterpretedOption.unknownFields().size();
        }

        /* renamed from: a */
        public UninterpretedOption decode(ProtoReader protoReader) throws IOException {
            C23096a aVar = new C23096a();
            aVar.f57023b = "";
            aVar.f57024c = 0L;
            aVar.f57025d = 0L;
            aVar.f57026e = Double.valueOf(0.0d);
            aVar.f57027f = ByteString.EMPTY;
            aVar.f57028g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            aVar.f57022a.add(NamePart.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f57023b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f57024c = ProtoAdapter.UINT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f57025d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f57026e = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            aVar.f57027f = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 8:
                            aVar.f57028g = ProtoAdapter.STRING.decode(protoReader);
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
            NamePart.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, uninterpretedOption.name);
            if (uninterpretedOption.identifier_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uninterpretedOption.identifier_value);
            }
            if (uninterpretedOption.positive_int_value != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, uninterpretedOption.positive_int_value);
            }
            if (uninterpretedOption.negative_int_value != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, uninterpretedOption.negative_int_value);
            }
            if (uninterpretedOption.double_value != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, uninterpretedOption.double_value);
            }
            if (uninterpretedOption.string_value != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, uninterpretedOption.string_value);
            }
            if (uninterpretedOption.aggregate_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, uninterpretedOption.aggregate_value);
            }
            protoWriter.writeBytes(uninterpretedOption.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.UninterpretedOption$a */
    public static final class C23096a extends Message.Builder<UninterpretedOption, C23096a> {

        /* renamed from: a */
        public List<NamePart> f57022a = Internal.newMutableList();

        /* renamed from: b */
        public String f57023b;

        /* renamed from: c */
        public Long f57024c;

        /* renamed from: d */
        public Long f57025d;

        /* renamed from: e */
        public Double f57026e;

        /* renamed from: f */
        public ByteString f57027f;

        /* renamed from: g */
        public String f57028g;

        /* renamed from: a */
        public UninterpretedOption build() {
            return new UninterpretedOption(this.f57022a, this.f57023b, this.f57024c, this.f57025d, this.f57026e, this.f57027f, this.f57028g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23096a newBuilder() {
        C23096a aVar = new C23096a();
        aVar.f57022a = Internal.copyOf("name", this.name);
        aVar.f57023b = this.identifier_value;
        aVar.f57024c = this.positive_int_value;
        aVar.f57025d = this.negative_int_value;
        aVar.f57026e = this.double_value;
        aVar.f57027f = this.string_value;
        aVar.f57028g = this.aggregate_value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "UninterpretedOption");
        StringBuilder sb = new StringBuilder();
        if (!this.name.isEmpty()) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.identifier_value != null) {
            sb.append(", identifier_value=");
            sb.append(this.identifier_value);
        }
        if (this.positive_int_value != null) {
            sb.append(", positive_int_value=");
            sb.append(this.positive_int_value);
        }
        if (this.negative_int_value != null) {
            sb.append(", negative_int_value=");
            sb.append(this.negative_int_value);
        }
        if (this.double_value != null) {
            sb.append(", double_value=");
            sb.append(this.double_value);
        }
        if (this.string_value != null) {
            sb.append(", string_value=");
            sb.append(this.string_value);
        }
        if (this.aggregate_value != null) {
            sb.append(", aggregate_value=");
            sb.append(this.aggregate_value);
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
        this.name = Internal.immutableCopyOf("name", list);
        this.identifier_value = str;
        this.positive_int_value = l;
        this.negative_int_value = l2;
        this.double_value = d;
        this.string_value = byteString;
        this.aggregate_value = str2;
    }
}
