package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OneofDescriptorProto extends Message<OneofDescriptorProto, C23173a> {
    public static final ProtoAdapter<OneofDescriptorProto> ADAPTER = new C23174b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String mname;
    public final OneofOptions moptions;

    /* renamed from: com.google.protobuf.server.OneofDescriptorProto$b */
    private static final class C23174b extends ProtoAdapter<OneofDescriptorProto> {
        C23174b() {
            super(FieldEncoding.LENGTH_DELIMITED, OneofDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(OneofDescriptorProto oneofDescriptorProto) {
            int i;
            int i2 = 0;
            if (oneofDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, oneofDescriptorProto.mname);
            } else {
                i = 0;
            }
            if (oneofDescriptorProto.moptions != null) {
                i2 = OneofOptions.ADAPTER.encodedSizeWithTag(2, oneofDescriptorProto.moptions);
            }
            return i + i2 + oneofDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public OneofDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23173a aVar = new C23173a();
            aVar.f57183a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57183a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57184b = OneofOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OneofDescriptorProto oneofDescriptorProto) throws IOException {
            if (oneofDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oneofDescriptorProto.mname);
            }
            if (oneofDescriptorProto.moptions != null) {
                OneofOptions.ADAPTER.encodeWithTag(protoWriter, 2, oneofDescriptorProto.moptions);
            }
            protoWriter.writeBytes(oneofDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.OneofDescriptorProto$a */
    public static final class C23173a extends Message.Builder<OneofDescriptorProto, C23173a> {

        /* renamed from: a */
        public String f57183a;

        /* renamed from: b */
        public OneofOptions f57184b;

        /* renamed from: a */
        public OneofDescriptorProto build() {
            return new OneofDescriptorProto(this.f57183a, this.f57184b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23173a newBuilder() {
        C23173a aVar = new C23173a();
        aVar.f57183a = this.mname;
        aVar.f57184b = this.moptions;
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
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        StringBuilder replace = sb.replace(0, 2, "OneofDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public OneofDescriptorProto(String str, OneofOptions oneofOptions) {
        this(str, oneofOptions, ByteString.EMPTY);
    }

    public OneofDescriptorProto(String str, OneofOptions oneofOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.moptions = oneofOptions;
    }
}
