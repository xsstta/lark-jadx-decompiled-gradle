package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EnumValueDescriptorProto extends Message<EnumValueDescriptorProto, C23147a> {
    public static final ProtoAdapter<EnumValueDescriptorProto> ADAPTER = new C23148b();
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUMBER = 0;
    private static final long serialVersionUID = 0;
    public final String mname;
    public final Integer mnumber;
    public final EnumValueOptions moptions;

    /* renamed from: com.google.protobuf.server.EnumValueDescriptorProto$b */
    private static final class C23148b extends ProtoAdapter<EnumValueDescriptorProto> {
        C23148b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumValueDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumValueDescriptorProto enumValueDescriptorProto) {
            int i;
            int i2;
            int i3 = 0;
            if (enumValueDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, enumValueDescriptorProto.mname);
            } else {
                i = 0;
            }
            if (enumValueDescriptorProto.mnumber != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, enumValueDescriptorProto.mnumber);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (enumValueDescriptorProto.moptions != null) {
                i3 = EnumValueOptions.ADAPTER.encodedSizeWithTag(3, enumValueDescriptorProto.moptions);
            }
            return i4 + i3 + enumValueDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public EnumValueDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23147a aVar = new C23147a();
            aVar.f57107a = "";
            aVar.f57108b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57107a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f57108b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57109c = EnumValueOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumValueDescriptorProto enumValueDescriptorProto) throws IOException {
            if (enumValueDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enumValueDescriptorProto.mname);
            }
            if (enumValueDescriptorProto.mnumber != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, enumValueDescriptorProto.mnumber);
            }
            if (enumValueDescriptorProto.moptions != null) {
                EnumValueOptions.ADAPTER.encodeWithTag(protoWriter, 3, enumValueDescriptorProto.moptions);
            }
            protoWriter.writeBytes(enumValueDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.EnumValueDescriptorProto$a */
    public static final class C23147a extends Message.Builder<EnumValueDescriptorProto, C23147a> {

        /* renamed from: a */
        public String f57107a;

        /* renamed from: b */
        public Integer f57108b;

        /* renamed from: c */
        public EnumValueOptions f57109c;

        /* renamed from: a */
        public EnumValueDescriptorProto build() {
            return new EnumValueDescriptorProto(this.f57107a, this.f57108b, this.f57109c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23147a newBuilder() {
        C23147a aVar = new C23147a();
        aVar.f57107a = this.mname;
        aVar.f57108b = this.mnumber;
        aVar.f57109c = this.moptions;
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
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        StringBuilder replace = sb.replace(0, 2, "EnumValueDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public EnumValueDescriptorProto(String str, Integer num, EnumValueOptions enumValueOptions) {
        this(str, num, enumValueOptions, ByteString.EMPTY);
    }

    public EnumValueDescriptorProto(String str, Integer num, EnumValueOptions enumValueOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mnumber = num;
        this.moptions = enumValueOptions;
    }
}
