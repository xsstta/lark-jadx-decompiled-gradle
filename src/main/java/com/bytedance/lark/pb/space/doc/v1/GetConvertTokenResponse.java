package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetConvertTokenResponse extends Message<GetConvertTokenResponse, C19249a> {
    public static final ProtoAdapter<GetConvertTokenResponse> ADAPTER = new C19250b();
    private static final long serialVersionUID = 0;
    public final String chat_token;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetConvertTokenResponse$b */
    private static final class C19250b extends ProtoAdapter<GetConvertTokenResponse> {
        C19250b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConvertTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetConvertTokenResponse getConvertTokenResponse) {
            int i;
            int i2 = 0;
            if (getConvertTokenResponse.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getConvertTokenResponse.token);
            } else {
                i = 0;
            }
            if (getConvertTokenResponse.chat_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getConvertTokenResponse.chat_token);
            }
            return i + i2 + getConvertTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetConvertTokenResponse decode(ProtoReader protoReader) throws IOException {
            C19249a aVar = new C19249a();
            aVar.f47437a = "";
            aVar.f47438b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47437a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47438b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetConvertTokenResponse getConvertTokenResponse) throws IOException {
            if (getConvertTokenResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConvertTokenResponse.token);
            }
            if (getConvertTokenResponse.chat_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getConvertTokenResponse.chat_token);
            }
            protoWriter.writeBytes(getConvertTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetConvertTokenResponse$a */
    public static final class C19249a extends Message.Builder<GetConvertTokenResponse, C19249a> {

        /* renamed from: a */
        public String f47437a;

        /* renamed from: b */
        public String f47438b;

        /* renamed from: a */
        public GetConvertTokenResponse build() {
            return new GetConvertTokenResponse(this.f47437a, this.f47438b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19249a newBuilder() {
        C19249a aVar = new C19249a();
        aVar.f47437a = this.token;
        aVar.f47438b = this.chat_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetConvertTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.chat_token != null) {
            sb.append(", chat_token=");
            sb.append(this.chat_token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConvertTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetConvertTokenResponse(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetConvertTokenResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.chat_token = str2;
    }
}
