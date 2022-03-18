package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EnumValueDescriptorProto extends Message<EnumValueDescriptorProto, C23053a> {
    public static final ProtoAdapter<EnumValueDescriptorProto> ADAPTER = new C23054b();
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUMBER = 0;
    private static final long serialVersionUID = 0;
    public final String name;
    public final Integer number;
    public final EnumValueOptions options;

    /* renamed from: com.google.protobuf.EnumValueDescriptorProto$b */
    private static final class C23054b extends ProtoAdapter<EnumValueDescriptorProto> {
        C23054b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumValueDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumValueDescriptorProto enumValueDescriptorProto) {
            int i;
            int i2;
            int i3 = 0;
            if (enumValueDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, enumValueDescriptorProto.name);
            } else {
                i = 0;
            }
            if (enumValueDescriptorProto.number != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, enumValueDescriptorProto.number);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (enumValueDescriptorProto.options != null) {
                i3 = EnumValueOptions.ADAPTER.encodedSizeWithTag(3, enumValueDescriptorProto.options);
            }
            return i4 + i3 + enumValueDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public EnumValueDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23053a aVar = new C23053a();
            aVar.f56930a = "";
            aVar.f56931b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f56930a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f56931b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56932c = EnumValueOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumValueDescriptorProto enumValueDescriptorProto) throws IOException {
            if (enumValueDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enumValueDescriptorProto.name);
            }
            if (enumValueDescriptorProto.number != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, enumValueDescriptorProto.number);
            }
            if (enumValueDescriptorProto.options != null) {
                EnumValueOptions.ADAPTER.encodeWithTag(protoWriter, 3, enumValueDescriptorProto.options);
            }
            protoWriter.writeBytes(enumValueDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.EnumValueDescriptorProto$a */
    public static final class C23053a extends Message.Builder<EnumValueDescriptorProto, C23053a> {

        /* renamed from: a */
        public String f56930a;

        /* renamed from: b */
        public Integer f56931b;

        /* renamed from: c */
        public EnumValueOptions f56932c;

        /* renamed from: a */
        public EnumValueDescriptorProto build() {
            return new EnumValueDescriptorProto(this.f56930a, this.f56931b, this.f56932c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23053a newBuilder() {
        C23053a aVar = new C23053a();
        aVar.f56930a = this.name;
        aVar.f56931b = this.number;
        aVar.f56932c = this.options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "EnumValueDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.number != null) {
            sb.append(", number=");
            sb.append(this.number);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
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
        this.name = str;
        this.number = num;
        this.options = enumValueOptions;
    }
}
