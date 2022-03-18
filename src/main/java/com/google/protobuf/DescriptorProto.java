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

public final class DescriptorProto extends Message<DescriptorProto, C23047a> {
    public static final ProtoAdapter<DescriptorProto> ADAPTER = new C23048b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final List<EnumDescriptorProto> enum_type;
    public final List<FieldDescriptorProto> extension;
    public final List<ExtensionRange> extension_range;
    public final List<FieldDescriptorProto> field;
    public final String name;
    public final List<DescriptorProto> nested_type;
    public final List<OneofDescriptorProto> oneof_decl;
    public final MessageOptions options;
    public final List<String> reserved_name;
    public final List<ReservedRange> reserved_range;

    public static final class ExtensionRange extends Message<ExtensionRange, C23043a> {
        public static final ProtoAdapter<ExtensionRange> ADAPTER = new C23044b();
        public static final Integer DEFAULT_END = 0;
        public static final Integer DEFAULT_START = 0;
        private static final long serialVersionUID = 0;
        public final Integer end;
        public final Integer start;

        /* renamed from: com.google.protobuf.DescriptorProto$ExtensionRange$b */
        private static final class C23044b extends ProtoAdapter<ExtensionRange> {
            C23044b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtensionRange.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtensionRange extensionRange) {
                int i;
                int i2 = 0;
                if (extensionRange.start != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, extensionRange.start);
                } else {
                    i = 0;
                }
                if (extensionRange.end != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, extensionRange.end);
                }
                return i + i2 + extensionRange.unknownFields().size();
            }

            /* renamed from: a */
            public ExtensionRange decode(ProtoReader protoReader) throws IOException {
                C23043a aVar = new C23043a();
                aVar.f56910a = 0;
                aVar.f56911b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f56910a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f56911b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtensionRange extensionRange) throws IOException {
                if (extensionRange.start != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, extensionRange.start);
                }
                if (extensionRange.end != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, extensionRange.end);
                }
                protoWriter.writeBytes(extensionRange.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProto$ExtensionRange$a */
        public static final class C23043a extends Message.Builder<ExtensionRange, C23043a> {

            /* renamed from: a */
            public Integer f56910a;

            /* renamed from: b */
            public Integer f56911b;

            /* renamed from: a */
            public ExtensionRange build() {
                return new ExtensionRange(this.f56910a, this.f56911b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23043a newBuilder() {
            C23043a aVar = new C23043a();
            aVar.f56910a = this.start;
            aVar.f56911b = this.end;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("google", "ExtensionRange");
            StringBuilder sb = new StringBuilder();
            if (this.start != null) {
                sb.append(", start=");
                sb.append(this.start);
            }
            if (this.end != null) {
                sb.append(", end=");
                sb.append(this.end);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtensionRange{");
            replace.append('}');
            return replace.toString();
        }

        public ExtensionRange(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public ExtensionRange(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start = num;
            this.end = num2;
        }
    }

    public static final class ReservedRange extends Message<ReservedRange, C23045a> {
        public static final ProtoAdapter<ReservedRange> ADAPTER = new C23046b();
        public static final Integer DEFAULT_END = 0;
        public static final Integer DEFAULT_START = 0;
        private static final long serialVersionUID = 0;
        public final Integer end;
        public final Integer start;

        /* renamed from: com.google.protobuf.DescriptorProto$ReservedRange$b */
        private static final class C23046b extends ProtoAdapter<ReservedRange> {
            C23046b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReservedRange.class);
            }

            /* renamed from: a */
            public int encodedSize(ReservedRange reservedRange) {
                int i;
                int i2 = 0;
                if (reservedRange.start != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, reservedRange.start);
                } else {
                    i = 0;
                }
                if (reservedRange.end != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, reservedRange.end);
                }
                return i + i2 + reservedRange.unknownFields().size();
            }

            /* renamed from: a */
            public ReservedRange decode(ProtoReader protoReader) throws IOException {
                C23045a aVar = new C23045a();
                aVar.f56912a = 0;
                aVar.f56913b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f56912a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f56913b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReservedRange reservedRange) throws IOException {
                if (reservedRange.start != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, reservedRange.start);
                }
                if (reservedRange.end != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, reservedRange.end);
                }
                protoWriter.writeBytes(reservedRange.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProto$ReservedRange$a */
        public static final class C23045a extends Message.Builder<ReservedRange, C23045a> {

            /* renamed from: a */
            public Integer f56912a;

            /* renamed from: b */
            public Integer f56913b;

            /* renamed from: a */
            public ReservedRange build() {
                return new ReservedRange(this.f56912a, this.f56913b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23045a newBuilder() {
            C23045a aVar = new C23045a();
            aVar.f56912a = this.start;
            aVar.f56913b = this.end;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("google", "ReservedRange");
            StringBuilder sb = new StringBuilder();
            if (this.start != null) {
                sb.append(", start=");
                sb.append(this.start);
            }
            if (this.end != null) {
                sb.append(", end=");
                sb.append(this.end);
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
            this.start = num;
            this.end = num2;
        }
    }

    /* renamed from: com.google.protobuf.DescriptorProto$b */
    private static final class C23048b extends ProtoAdapter<DescriptorProto> {
        C23048b() {
            super(FieldEncoding.LENGTH_DELIMITED, DescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(DescriptorProto descriptorProto) {
            int i;
            int i2 = 0;
            if (descriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, descriptorProto.name);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, descriptorProto.field) + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, descriptorProto.extension) + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(3, descriptorProto.nested_type) + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, descriptorProto.enum_type) + ExtensionRange.ADAPTER.asRepeated().encodedSizeWithTag(5, descriptorProto.extension_range) + OneofDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(8, descriptorProto.oneof_decl);
            if (descriptorProto.options != null) {
                i2 = MessageOptions.ADAPTER.encodedSizeWithTag(7, descriptorProto.options);
            }
            return encodedSizeWithTag + i2 + ReservedRange.ADAPTER.asRepeated().encodedSizeWithTag(9, descriptorProto.reserved_range) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, descriptorProto.reserved_name) + descriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public DescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23047a aVar = new C23047a();
            aVar.f56914a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f56914a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f56915b.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f56917d.add(DescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f56918e.add(EnumDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f56919f.add(ExtensionRange.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f56916c.add(FieldDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f56921h = MessageOptions.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f56920g.add(OneofDescriptorProto.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f56922i.add(ReservedRange.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f56923j.add(ProtoAdapter.STRING.decode(protoReader));
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
            if (descriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, descriptorProto.name);
            }
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, descriptorProto.field);
            FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, descriptorProto.extension);
            DescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, descriptorProto.nested_type);
            EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, descriptorProto.enum_type);
            ExtensionRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, descriptorProto.extension_range);
            OneofDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, descriptorProto.oneof_decl);
            if (descriptorProto.options != null) {
                MessageOptions.ADAPTER.encodeWithTag(protoWriter, 7, descriptorProto.options);
            }
            ReservedRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, descriptorProto.reserved_range);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, descriptorProto.reserved_name);
            protoWriter.writeBytes(descriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.DescriptorProto$a */
    public static final class C23047a extends Message.Builder<DescriptorProto, C23047a> {

        /* renamed from: a */
        public String f56914a;

        /* renamed from: b */
        public List<FieldDescriptorProto> f56915b = Internal.newMutableList();

        /* renamed from: c */
        public List<FieldDescriptorProto> f56916c = Internal.newMutableList();

        /* renamed from: d */
        public List<DescriptorProto> f56917d = Internal.newMutableList();

        /* renamed from: e */
        public List<EnumDescriptorProto> f56918e = Internal.newMutableList();

        /* renamed from: f */
        public List<ExtensionRange> f56919f = Internal.newMutableList();

        /* renamed from: g */
        public List<OneofDescriptorProto> f56920g = Internal.newMutableList();

        /* renamed from: h */
        public MessageOptions f56921h;

        /* renamed from: i */
        public List<ReservedRange> f56922i = Internal.newMutableList();

        /* renamed from: j */
        public List<String> f56923j = Internal.newMutableList();

        /* renamed from: a */
        public DescriptorProto build() {
            return new DescriptorProto(this.f56914a, this.f56915b, this.f56916c, this.f56917d, this.f56918e, this.f56919f, this.f56920g, this.f56921h, this.f56922i, this.f56923j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23047a newBuilder() {
        C23047a aVar = new C23047a();
        aVar.f56914a = this.name;
        aVar.f56915b = Internal.copyOf("field", this.field);
        aVar.f56916c = Internal.copyOf("extension", this.extension);
        aVar.f56917d = Internal.copyOf("nested_type", this.nested_type);
        aVar.f56918e = Internal.copyOf("enum_type", this.enum_type);
        aVar.f56919f = Internal.copyOf("extension_range", this.extension_range);
        aVar.f56920g = Internal.copyOf("oneof_decl", this.oneof_decl);
        aVar.f56921h = this.options;
        aVar.f56922i = Internal.copyOf("reserved_range", this.reserved_range);
        aVar.f56923j = Internal.copyOf("reserved_name", this.reserved_name);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "DescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.field.isEmpty()) {
            sb.append(", field=");
            sb.append(this.field);
        }
        if (!this.extension.isEmpty()) {
            sb.append(", extension=");
            sb.append(this.extension);
        }
        if (!this.nested_type.isEmpty()) {
            sb.append(", nested_type=");
            sb.append(this.nested_type);
        }
        if (!this.enum_type.isEmpty()) {
            sb.append(", enum_type=");
            sb.append(this.enum_type);
        }
        if (!this.extension_range.isEmpty()) {
            sb.append(", extension_range=");
            sb.append(this.extension_range);
        }
        if (!this.oneof_decl.isEmpty()) {
            sb.append(", oneof_decl=");
            sb.append(this.oneof_decl);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (!this.reserved_range.isEmpty()) {
            sb.append(", reserved_range=");
            sb.append(this.reserved_range);
        }
        if (!this.reserved_name.isEmpty()) {
            sb.append(", reserved_name=");
            sb.append(this.reserved_name);
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
        this.name = str;
        this.field = Internal.immutableCopyOf("field", list);
        this.extension = Internal.immutableCopyOf("extension", list2);
        this.nested_type = Internal.immutableCopyOf("nested_type", list3);
        this.enum_type = Internal.immutableCopyOf("enum_type", list4);
        this.extension_range = Internal.immutableCopyOf("extension_range", list5);
        this.oneof_decl = Internal.immutableCopyOf("oneof_decl", list6);
        this.options = messageOptions;
        this.reserved_range = Internal.immutableCopyOf("reserved_range", list7);
        this.reserved_name = Internal.immutableCopyOf("reserved_name", list8);
    }
}
