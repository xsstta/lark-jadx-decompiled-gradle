package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OneofDescriptorProto extends Message<OneofDescriptorProto, C23084a> {
    public static final ProtoAdapter<OneofDescriptorProto> ADAPTER = new C23085b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String name;

    /* renamed from: com.google.protobuf.OneofDescriptorProto$b */
    private static final class C23085b extends ProtoAdapter<OneofDescriptorProto> {
        C23085b() {
            super(FieldEncoding.LENGTH_DELIMITED, OneofDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(OneofDescriptorProto oneofDescriptorProto) {
            int i;
            if (oneofDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, oneofDescriptorProto.name);
            } else {
                i = 0;
            }
            return i + oneofDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public OneofDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23084a aVar = new C23084a();
            aVar.f57008a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57008a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OneofDescriptorProto oneofDescriptorProto) throws IOException {
            if (oneofDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oneofDescriptorProto.name);
            }
            protoWriter.writeBytes(oneofDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.OneofDescriptorProto$a */
    public static final class C23084a extends Message.Builder<OneofDescriptorProto, C23084a> {

        /* renamed from: a */
        public String f57008a;

        /* renamed from: a */
        public OneofDescriptorProto build() {
            return new OneofDescriptorProto(this.f57008a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23084a newBuilder() {
        C23084a aVar = new C23084a();
        aVar.f57008a = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "OneofDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "OneofDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public OneofDescriptorProto(String str) {
        this(str, ByteString.EMPTY);
    }

    public OneofDescriptorProto(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
    }
}
