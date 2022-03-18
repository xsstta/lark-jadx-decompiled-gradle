package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetKeyValueResponse extends Message<GetKeyValueResponse, C18386a> {
    public static final ProtoAdapter<GetKeyValueResponse> ADAPTER = new C18387b();
    private static final long serialVersionUID = 0;
    public final String value;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetKeyValueResponse$b */
    private static final class C18387b extends ProtoAdapter<GetKeyValueResponse> {
        C18387b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetKeyValueResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetKeyValueResponse getKeyValueResponse) {
            int i;
            if (getKeyValueResponse.value != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getKeyValueResponse.value);
            } else {
                i = 0;
            }
            return i + getKeyValueResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetKeyValueResponse decode(ProtoReader protoReader) throws IOException {
            C18386a aVar = new C18386a();
            aVar.f45767a = "";
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
                    aVar.f45767a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetKeyValueResponse getKeyValueResponse) throws IOException {
            if (getKeyValueResponse.value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getKeyValueResponse.value);
            }
            protoWriter.writeBytes(getKeyValueResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetKeyValueResponse$a */
    public static final class C18386a extends Message.Builder<GetKeyValueResponse, C18386a> {

        /* renamed from: a */
        public String f45767a;

        /* renamed from: a */
        public GetKeyValueResponse build() {
            return new GetKeyValueResponse(this.f45767a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18386a newBuilder() {
        C18386a aVar = new C18386a();
        aVar.f45767a = this.value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetKeyValueResponse");
        StringBuilder sb = new StringBuilder();
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "GetKeyValueResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetKeyValueResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetKeyValueResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.value = str;
    }
}
