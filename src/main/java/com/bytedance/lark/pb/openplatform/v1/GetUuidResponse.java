package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUuidResponse extends Message<GetUuidResponse, C18671a> {
    public static final ProtoAdapter<GetUuidResponse> ADAPTER = new C18672b();
    private static final long serialVersionUID = 0;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetUuidResponse$b */
    private static final class C18672b extends ProtoAdapter<GetUuidResponse> {
        C18672b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUuidResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUuidResponse getUuidResponse) {
            int i;
            if (getUuidResponse.uuid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUuidResponse.uuid);
            } else {
                i = 0;
            }
            return i + getUuidResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUuidResponse decode(ProtoReader protoReader) throws IOException {
            C18671a aVar = new C18671a();
            aVar.f46197a = "";
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
                    aVar.f46197a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUuidResponse getUuidResponse) throws IOException {
            if (getUuidResponse.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUuidResponse.uuid);
            }
            protoWriter.writeBytes(getUuidResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetUuidResponse$a */
    public static final class C18671a extends Message.Builder<GetUuidResponse, C18671a> {

        /* renamed from: a */
        public String f46197a;

        /* renamed from: a */
        public GetUuidResponse build() {
            return new GetUuidResponse(this.f46197a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18671a newBuilder() {
        C18671a aVar = new C18671a();
        aVar.f46197a = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetUuidResponse");
        StringBuilder sb = new StringBuilder();
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUuidResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUuidResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUuidResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uuid = str;
    }
}
