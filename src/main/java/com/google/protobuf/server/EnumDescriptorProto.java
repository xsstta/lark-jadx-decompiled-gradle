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

public final class EnumDescriptorProto extends Message<EnumDescriptorProto, C23143a> {
    public static final ProtoAdapter<EnumDescriptorProto> ADAPTER = new C23144b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String mname;
    public final EnumOptions moptions;
    public final List<EnumValueDescriptorProto> mvalue;

    /* renamed from: com.google.protobuf.server.EnumDescriptorProto$b */
    private static final class C23144b extends ProtoAdapter<EnumDescriptorProto> {
        C23144b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumDescriptorProto enumDescriptorProto) {
            int i;
            int i2 = 0;
            if (enumDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, enumDescriptorProto.mname);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + EnumValueDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, enumDescriptorProto.mvalue);
            if (enumDescriptorProto.moptions != null) {
                i2 = EnumOptions.ADAPTER.encodedSizeWithTag(3, enumDescriptorProto.moptions);
            }
            return encodedSizeWithTag + i2 + enumDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public EnumDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23143a aVar = new C23143a();
            aVar.f57101a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57101a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f57102b.add(EnumValueDescriptorProto.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57103c = EnumOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumDescriptorProto enumDescriptorProto) throws IOException {
            if (enumDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enumDescriptorProto.mname);
            }
            EnumValueDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, enumDescriptorProto.mvalue);
            if (enumDescriptorProto.moptions != null) {
                EnumOptions.ADAPTER.encodeWithTag(protoWriter, 3, enumDescriptorProto.moptions);
            }
            protoWriter.writeBytes(enumDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.EnumDescriptorProto$a */
    public static final class C23143a extends Message.Builder<EnumDescriptorProto, C23143a> {

        /* renamed from: a */
        public String f57101a;

        /* renamed from: b */
        public List<EnumValueDescriptorProto> f57102b = Internal.newMutableList();

        /* renamed from: c */
        public EnumOptions f57103c;

        /* renamed from: a */
        public EnumDescriptorProto build() {
            return new EnumDescriptorProto(this.f57101a, this.f57102b, this.f57103c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23143a newBuilder() {
        C23143a aVar = new C23143a();
        aVar.f57101a = this.mname;
        aVar.f57102b = Internal.copyOf("mvalue", this.mvalue);
        aVar.f57103c = this.moptions;
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
        if (!this.mvalue.isEmpty()) {
            sb.append(", value=");
            sb.append(this.mvalue);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
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
        this.mname = str;
        this.mvalue = Internal.immutableCopyOf("mvalue", list);
        this.moptions = enumOptions;
    }
}
