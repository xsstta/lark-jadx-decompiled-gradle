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

public final class EnumDescriptorProto extends Message<EnumDescriptorProto, C23049a> {
    public static final ProtoAdapter<EnumDescriptorProto> ADAPTER = new C23050b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String name;
    public final EnumOptions options;
    public final List<EnumValueDescriptorProto> value;

    /* renamed from: com.google.protobuf.EnumDescriptorProto$b */
    private static final class C23050b extends ProtoAdapter<EnumDescriptorProto> {
        C23050b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumDescriptorProto enumDescriptorProto) {
            int i;
            int i2 = 0;
            if (enumDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, enumDescriptorProto.name);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + EnumValueDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, enumDescriptorProto.value);
            if (enumDescriptorProto.options != null) {
                i2 = EnumOptions.ADAPTER.encodedSizeWithTag(3, enumDescriptorProto.options);
            }
            return encodedSizeWithTag + i2 + enumDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public EnumDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23049a aVar = new C23049a();
            aVar.f56924a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f56924a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f56925b.add(EnumValueDescriptorProto.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56926c = EnumOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumDescriptorProto enumDescriptorProto) throws IOException {
            if (enumDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enumDescriptorProto.name);
            }
            EnumValueDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, enumDescriptorProto.value);
            if (enumDescriptorProto.options != null) {
                EnumOptions.ADAPTER.encodeWithTag(protoWriter, 3, enumDescriptorProto.options);
            }
            protoWriter.writeBytes(enumDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.EnumDescriptorProto$a */
    public static final class C23049a extends Message.Builder<EnumDescriptorProto, C23049a> {

        /* renamed from: a */
        public String f56924a;

        /* renamed from: b */
        public List<EnumValueDescriptorProto> f56925b = Internal.newMutableList();

        /* renamed from: c */
        public EnumOptions f56926c;

        /* renamed from: a */
        public EnumDescriptorProto build() {
            return new EnumDescriptorProto(this.f56924a, this.f56925b, this.f56926c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23049a newBuilder() {
        C23049a aVar = new C23049a();
        aVar.f56924a = this.name;
        aVar.f56925b = Internal.copyOf("value", this.value);
        aVar.f56926c = this.options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "EnumDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.value.isEmpty()) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder replace = sb.replace(0, 2, "EnumDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public EnumDescriptorProto(String str, List<EnumValueDescriptorProto> list, EnumOptions enumOptions) {
        this(str, list, enumOptions, ByteString.EMPTY);
    }

    public EnumDescriptorProto(String str, List<EnumValueDescriptorProto> list, EnumOptions enumOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.value = Internal.immutableCopyOf("value", list);
        this.options = enumOptions;
    }
}
