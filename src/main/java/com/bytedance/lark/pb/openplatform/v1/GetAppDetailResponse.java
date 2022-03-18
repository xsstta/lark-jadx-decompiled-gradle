package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAppDetailResponse extends Message<GetAppDetailResponse, C18651a> {
    public static final ProtoAdapter<GetAppDetailResponse> ADAPTER = new C18652b();
    private static final long serialVersionUID = 0;
    public final String json_resp;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetAppDetailResponse$b */
    private static final class C18652b extends ProtoAdapter<GetAppDetailResponse> {
        C18652b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAppDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAppDetailResponse getAppDetailResponse) {
            int i;
            if (getAppDetailResponse.json_resp != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAppDetailResponse.json_resp);
            } else {
                i = 0;
            }
            return i + getAppDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAppDetailResponse decode(ProtoReader protoReader) throws IOException {
            C18651a aVar = new C18651a();
            aVar.f46176a = "";
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
                    aVar.f46176a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAppDetailResponse getAppDetailResponse) throws IOException {
            if (getAppDetailResponse.json_resp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAppDetailResponse.json_resp);
            }
            protoWriter.writeBytes(getAppDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetAppDetailResponse$a */
    public static final class C18651a extends Message.Builder<GetAppDetailResponse, C18651a> {

        /* renamed from: a */
        public String f46176a;

        /* renamed from: a */
        public GetAppDetailResponse build() {
            return new GetAppDetailResponse(this.f46176a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18651a newBuilder() {
        C18651a aVar = new C18651a();
        aVar.f46176a = this.json_resp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetAppDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.json_resp != null) {
            sb.append(", json_resp=");
            sb.append(this.json_resp);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAppDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAppDetailResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetAppDetailResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.json_resp = str;
    }
}
