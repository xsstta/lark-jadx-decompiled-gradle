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

public final class DescriptorProto extends Message<DescriptorProto, C23141a> {
    public static final ProtoAdapter<DescriptorProto> ADAPTER = new C23142b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final List<EnumDescriptorProto> menum_type;
    public final List<FieldDescriptorProto> mextension;
    public final List<ExtensionRange> mextension_range;
    public final List<FieldDescriptorProto> mfield;
    public final String mname;
    public final List<DescriptorProto> mnested_type;
    public final List<OneofDescriptorProto> moneof_decl;
    public final MessageOptions moptions;
    public final List<String> mreserved_name;
    public final List<ReservedRange> mreserved_range;

    public static final class ExtensionRange extends Message<ExtensionRange, C23137a> {
        public static final ProtoAdapter<ExtensionRange> ADAPTER = new C23138b();
        public static final Integer DEFAULT_END = 0;
        public static final Integer DEFAULT_START = 0;
        private static final long serialVersionUID = 0;
        public final Integer mend;
        public final ExtensionRangeOptions moptions;
        public final Integer mstart;

        /* renamed from: com.google.protobuf.server.DescriptorProto$ExtensionRange$b */
        private static final class C23138b extends ProtoAdapter<ExtensionRange> {
            C23138b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtensionRange.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtensionRange extensionRange) {
                int i;
                int i2;
                int i3 = 0;
                if (extensionRange.mstart != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, extensionRange.mstart);
                } else {
                    i = 0;
                }
                if (extensionRange.mend != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, extensionRange.mend);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (extensionRange.moptions != null) {
                    i3 = ExtensionRangeOptions.ADAPTER.encodedSizeWithTag(3, extensionRange.moptions);
                }
                return i4 + i3 + extensionRange.unknownFields().size();
            }

            /* renamed from: a */
            public ExtensionRange decode(ProtoReader protoReader) throws IOException {
                C23137a aVar = new C23137a();
                aVar.f57086a = 0;
                aVar.f57087b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57086a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f57087b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57088c = ExtensionRangeOptions.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtensionRange extensionRange) throws IOException {
                if (extensionRange.mstart != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, extensionRange.mstart);
                }
                if (extensionRange.mend != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, extensionRange.mend);
                }
                if (extensionRange.moptions != null) {
                    ExtensionRangeOptions.ADAPTER.encodeWithTag(protoWriter, 3, extensionRange.moptions);
                }
                protoWriter.writeBytes(extensionRange.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.server.DescriptorProto$ExtensionRange$a */
        public static final class C23137a extends Message.Builder<ExtensionRange, C23137a> {

            /* renamed from: a */
            public Integer f57086a;

            /* renamed from: b */
            public Integer f57087b;

            /* renamed from: c */
            public ExtensionRangeOptions f57088c;

            /* renamed from: a */
            public ExtensionRange build() {
                return new ExtensionRange(this.f57086a, this.f57087b, this.f57088c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23137a newBuilder() {
            C23137a aVar = new C23137a();
            aVar.f57086a = this.mstart;
            aVar.f57087b = this.mend;
            aVar.f57088c = this.moptions;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mstart != null) {
                sb.append(", start=");
                sb.append(this.mstart);
            }
            if (this.mend != null) {
                sb.append(", end=");
                sb.append(this.mend);
            }
            if (this.moptions != null) {
                sb.append(", options=");
                sb.append(this.moptions);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtensionRange{");
            replace.append('}');
            return replace.toString();
        }

        public ExtensionRange(Integer num, Integer num2, ExtensionRangeOptions extensionRangeOptions) {
            this(num, num2, extensionRangeOptions, ByteString.EMPTY);
        }

        public ExtensionRange(Integer num, Integer num2, ExtensionRangeOptions extensionRangeOptions, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mstart = num;
            this.mend = num2;
            this.moptions = extensionRangeOptions;
        }
    }

    public static final class ReservedRange extends Message<ReservedRange, C23139a> {
        public static final ProtoAdapter<ReservedRange> ADAPTER = new C23140b();
        public static final Integer DEFAULT_END = 0;
        public static final Integer DEFAULT_START = 0;
        private static final long serialVersionUID = 0;
        public final Integer mend;
        public final Integer mstart;

        /* renamed from: com.google.protobuf.server.DescriptorProto$ReservedRange$b */
        private static final class C23140b extends ProtoAdapter<ReservedRange> {
            C23140b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReservedRange.class);
            }

            /* renamed from: a */
            public int encodedSize(ReservedRange reservedRange) {
                int i;
                int i2 = 0;
                if (reservedRange.mstart != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, reservedRange.mstart);
                } else {
                    i = 0;
                }
                if (reservedRange.mend != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, reservedRange.mend);
                }
                return i + i2 + reservedRange.unknownFields().size();
            }

            /* renamed from: a */
            public ReservedRange decode(ProtoReader protoReader) throws IOException {
                C23139a aVar = new C23139a();
                aVar.f57089a = 0;
                aVar.f57090b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57089a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57090b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReservedRange reservedRange) throws IOException {
                if (reservedRange.mstart != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, reservedRange.mstart);
                }
                if (reservedRange.mend != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, reservedRange.mend);
                }
                protoWriter.writeBytes(reservedRange.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.server.DescriptorProto$ReservedRange$a */
        public static final class C23139a extends Message.Builder<ReservedRange, C23139a> {

            /* renamed from: a */
            public Integer f57089a;

            /* renamed from: b */
            public Integer f57090b;

            /* renamed from: a */
            public ReservedRange build() {
                return new ReservedRange(this.f57089a, this.f57090b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23139a newBuilder() {
            C23139a aVar = new C23139a();
            aVar.f57089a = this.mstart;
            aVar.f57090b = this.mend;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mstart != null) {
                sb.append(", start=");
                sb.append(this.mstart);
            }
            if (this.mend != null) {
                sb.append(", end=");
                sb.append(this.mend);
            }
            StringBuilder replace = sb.replace(0, 2, "ReservedRange{");
            replace.append('}');
            return replace.toString();
        }

        public ReservedRange(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public ReservedRange(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mstart = num;
            this.mend = num2;
        }
    }

    /* renamed from: com.google.protobuf.server.DescriptorProto$b */
    private static final class C23142b extends ProtoAdapter<DescriptorProto> {
        C23142b() {
            super(FieldEncoding.LENGTH_DELIMITED, DescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(DescriptorProto descriptorProto) {
            int i;
            int i2 = 0;
            if (descriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, descriptorProto.mname);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, descriptorProto.mfield) + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, descriptorProto.mextension) + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(3, descriptorProto.mnested_type) + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, descriptorProto.menum_type) + ExtensionRange.ADAPTER.asRepeated().encodedSizeWithTag(5, descriptorProto.mextension_range) + OneofDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(8, descriptorProto.moneof_decl);
            if (descriptorProto.moptions != null) {
                i2 = MessageOptions.ADAPTER.encodedSizeWithTag(7, descriptorProto.moptions);
            }
            return encodedSizeWithTag + i2 + ReservedRange.ADAPTER.asRepeated().encodedSizeWithTag(9, descriptorProto.mreserved_range) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, descriptorProto.mreserved_name) + descriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public DescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23141a aVar = new C23141a();
            aVar.f57091a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f57091a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f57092b.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f57094d.add(DescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f57095e.add(EnumDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f57096f.add(ExtensionRange.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f57093c.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f57098h = MessageOptions.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f57097g.add(OneofDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f57099i.add(ReservedRange.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f57100j.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, DescriptorProto descriptorProto) throws IOException {
            if (descriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, descriptorProto.mname);
            }
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, descriptorProto.mfield);
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, descriptorProto.mextension);
            DescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, descriptorProto.mnested_type);
            EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, descriptorProto.menum_type);
            ExtensionRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, descriptorProto.mextension_range);
            OneofDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, descriptorProto.moneof_decl);
            if (descriptorProto.moptions != null) {
                MessageOptions.ADAPTER.encodeWithTag(protoWriter, 7, descriptorProto.moptions);
            }
            ReservedRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, descriptorProto.mreserved_range);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, descriptorProto.mreserved_name);
            protoWriter.writeBytes(descriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.DescriptorProto$a */
    public static final class C23141a extends Message.Builder<DescriptorProto, C23141a> {

        /* renamed from: a */
        public String f57091a;

        /* renamed from: b */
        public List<FieldDescriptorProto> f57092b = Internal.newMutableList();

        /* renamed from: c */
        public List<FieldDescriptorProto> f57093c = Internal.newMutableList();

        /* renamed from: d */
        public List<DescriptorProto> f57094d = Internal.newMutableList();

        /* renamed from: e */
        public List<EnumDescriptorProto> f57095e = Internal.newMutableList();

        /* renamed from: f */
        public List<ExtensionRange> f57096f = Internal.newMutableList();

        /* renamed from: g */
        public List<OneofDescriptorProto> f57097g = Internal.newMutableList();

        /* renamed from: h */
        public MessageOptions f57098h;

        /* renamed from: i */
        public List<ReservedRange> f57099i = Internal.newMutableList();

        /* renamed from: j */
        public List<String> f57100j = Internal.newMutableList();

        /* renamed from: a */
        public DescriptorProto build() {
            return new DescriptorProto(this.f57091a, this.f57092b, this.f57093c, this.f57094d, this.f57095e, this.f57096f, this.f57097g, this.f57098h, this.f57099i, this.f57100j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23141a newBuilder() {
        C23141a aVar = new C23141a();
        aVar.f57091a = this.mname;
        aVar.f57092b = Internal.copyOf("mfield", this.mfield);
        aVar.f57093c = Internal.copyOf("mextension", this.mextension);
        aVar.f57094d = Internal.copyOf("mnested_type", this.mnested_type);
        aVar.f57095e = Internal.copyOf("menum_type", this.menum_type);
        aVar.f57096f = Internal.copyOf("mextension_range", this.mextension_range);
        aVar.f57097g = Internal.copyOf("moneof_decl", this.moneof_decl);
        aVar.f57098h = this.moptions;
        aVar.f57099i = Internal.copyOf("mreserved_range", this.mreserved_range);
        aVar.f57100j = Internal.copyOf("mreserved_name", this.mreserved_name);
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
        if (!this.mfield.isEmpty()) {
            sb.append(", field=");
            sb.append(this.mfield);
        }
        if (!this.mextension.isEmpty()) {
            sb.append(", extension=");
            sb.append(this.mextension);
        }
        if (!this.mnested_type.isEmpty()) {
            sb.append(", nested_type=");
            sb.append(this.mnested_type);
        }
        if (!this.menum_type.isEmpty()) {
            sb.append(", enum_type=");
            sb.append(this.menum_type);
        }
        if (!this.mextension_range.isEmpty()) {
            sb.append(", extension_range=");
            sb.append(this.mextension_range);
        }
        if (!this.moneof_decl.isEmpty()) {
            sb.append(", oneof_decl=");
            sb.append(this.moneof_decl);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        if (!this.mreserved_range.isEmpty()) {
            sb.append(", reserved_range=");
            sb.append(this.mreserved_range);
        }
        if (!this.mreserved_name.isEmpty()) {
            sb.append(", reserved_name=");
            sb.append(this.mreserved_name);
        }
        StringBuilder replace = sb.replace(0, 2, "DescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public DescriptorProto(String str, List<FieldDescriptorProto> list, List<FieldDescriptorProto> list2, List<DescriptorProto> list3, List<EnumDescriptorProto> list4, List<ExtensionRange> list5, List<OneofDescriptorProto> list6, MessageOptions messageOptions, List<ReservedRange> list7, List<String> list8) {
        this(str, list, list2, list3, list4, list5, list6, messageOptions, list7, list8, ByteString.EMPTY);
    }

    public DescriptorProto(String str, List<FieldDescriptorProto> list, List<FieldDescriptorProto> list2, List<DescriptorProto> list3, List<EnumDescriptorProto> list4, List<ExtensionRange> list5, List<OneofDescriptorProto> list6, MessageOptions messageOptions, List<ReservedRange> list7, List<String> list8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mfield = Internal.immutableCopyOf("mfield", list);
        this.mextension = Internal.immutableCopyOf("mextension", list2);
        this.mnested_type = Internal.immutableCopyOf("mnested_type", list3);
        this.menum_type = Internal.immutableCopyOf("menum_type", list4);
        this.mextension_range = Internal.immutableCopyOf("mextension_range", list5);
        this.moneof_decl = Internal.immutableCopyOf("moneof_decl", list6);
        this.moptions = messageOptions;
        this.mreserved_range = Internal.immutableCopyOf("mreserved_range", list7);
        this.mreserved_name = Internal.immutableCopyOf("mreserved_name", list8);
    }
}
