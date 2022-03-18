package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetGeoInfoRequest extends Message<GetGeoInfoRequest, C16574a> {
    public static final ProtoAdapter<GetGeoInfoRequest> ADAPTER = new C16575b();
    private static final long serialVersionUID = 0;
    public final String ip;

    /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoRequest$b */
    private static final class C16575b extends ProtoAdapter<GetGeoInfoRequest> {
        C16575b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGeoInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGeoInfoRequest getGeoInfoRequest) {
            int i;
            if (getGeoInfoRequest.ip != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getGeoInfoRequest.ip);
            } else {
                i = 0;
            }
            return i + getGeoInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetGeoInfoRequest decode(ProtoReader protoReader) throws IOException {
            C16574a aVar = new C16574a();
            aVar.f42941a = "";
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
                    aVar.f42941a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGeoInfoRequest getGeoInfoRequest) throws IOException {
            if (getGeoInfoRequest.ip != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getGeoInfoRequest.ip);
            }
            protoWriter.writeBytes(getGeoInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoRequest$a */
    public static final class C16574a extends Message.Builder<GetGeoInfoRequest, C16574a> {

        /* renamed from: a */
        public String f42941a;

        /* renamed from: a */
        public GetGeoInfoRequest build() {
            return new GetGeoInfoRequest(this.f42941a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16574a mo58983a(String str) {
            this.f42941a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16574a newBuilder() {
        C16574a aVar = new C16574a();
        aVar.f42941a = this.ip;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetGeoInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.ip != null) {
            sb.append(", ip=");
            sb.append(this.ip);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGeoInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetGeoInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetGeoInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ip = str;
    }
}
