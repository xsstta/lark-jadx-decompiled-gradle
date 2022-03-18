package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSIPDomainByUniqueIDResponse extends Message<GetSIPDomainByUniqueIDResponse, C50352a> {
    public static final ProtoAdapter<GetSIPDomainByUniqueIDResponse> ADAPTER = new C50353b();
    private static final long serialVersionUID = 0;
    public final String mdomain;

    /* renamed from: com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDResponse$b */
    private static final class C50353b extends ProtoAdapter<GetSIPDomainByUniqueIDResponse> {
        C50353b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSIPDomainByUniqueIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSIPDomainByUniqueIDResponse getSIPDomainByUniqueIDResponse) {
            int i;
            if (getSIPDomainByUniqueIDResponse.mdomain != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getSIPDomainByUniqueIDResponse.mdomain);
            } else {
                i = 0;
            }
            return i + getSIPDomainByUniqueIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSIPDomainByUniqueIDResponse decode(ProtoReader protoReader) throws IOException {
            C50352a aVar = new C50352a();
            aVar.f125737a = "";
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
                    aVar.f125737a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSIPDomainByUniqueIDResponse getSIPDomainByUniqueIDResponse) throws IOException {
            if (getSIPDomainByUniqueIDResponse.mdomain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSIPDomainByUniqueIDResponse.mdomain);
            }
            protoWriter.writeBytes(getSIPDomainByUniqueIDResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDResponse$a */
    public static final class C50352a extends Message.Builder<GetSIPDomainByUniqueIDResponse, C50352a> {

        /* renamed from: a */
        public String f125737a;

        /* renamed from: a */
        public GetSIPDomainByUniqueIDResponse build() {
            return new GetSIPDomainByUniqueIDResponse(this.f125737a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50352a newBuilder() {
        C50352a aVar = new C50352a();
        aVar.f125737a = this.mdomain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mdomain != null) {
            sb.append(", domain=");
            sb.append(this.mdomain);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSIPDomainByUniqueIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSIPDomainByUniqueIDResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetSIPDomainByUniqueIDResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdomain = str;
    }
}
