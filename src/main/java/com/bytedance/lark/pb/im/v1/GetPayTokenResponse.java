package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPayTokenResponse extends Message<GetPayTokenResponse, C17662a> {
    public static final ProtoAdapter<GetPayTokenResponse> ADAPTER = new C17663b();
    private static final long serialVersionUID = 0;
    public final String pay_token;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPayTokenResponse$b */
    private static final class C17663b extends ProtoAdapter<GetPayTokenResponse> {
        C17663b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPayTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPayTokenResponse getPayTokenResponse) {
            int i;
            if (getPayTokenResponse.pay_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getPayTokenResponse.pay_token);
            } else {
                i = 0;
            }
            return i + getPayTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPayTokenResponse decode(ProtoReader protoReader) throws IOException {
            C17662a aVar = new C17662a();
            aVar.f44669a = "";
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
                    aVar.f44669a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPayTokenResponse getPayTokenResponse) throws IOException {
            if (getPayTokenResponse.pay_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPayTokenResponse.pay_token);
            }
            protoWriter.writeBytes(getPayTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPayTokenResponse$a */
    public static final class C17662a extends Message.Builder<GetPayTokenResponse, C17662a> {

        /* renamed from: a */
        public String f44669a;

        /* renamed from: a */
        public GetPayTokenResponse build() {
            return new GetPayTokenResponse(this.f44669a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17662a newBuilder() {
        C17662a aVar = new C17662a();
        aVar.f44669a = this.pay_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetPayTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.pay_token != null) {
            sb.append(", pay_token=");
            sb.append(this.pay_token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPayTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPayTokenResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetPayTokenResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pay_token = str;
    }
}
