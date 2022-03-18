package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMyPromotionLinkResponse extends Message<GetMyPromotionLinkResponse, C16258a> {
    public static final ProtoAdapter<GetMyPromotionLinkResponse> ADAPTER = new C16259b();
    private static final long serialVersionUID = 0;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkResponse$b */
    private static final class C16259b extends ProtoAdapter<GetMyPromotionLinkResponse> {
        C16259b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyPromotionLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyPromotionLinkResponse getMyPromotionLinkResponse) {
            int i;
            if (getMyPromotionLinkResponse.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getMyPromotionLinkResponse.url);
            } else {
                i = 0;
            }
            return i + getMyPromotionLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyPromotionLinkResponse decode(ProtoReader protoReader) throws IOException {
            C16258a aVar = new C16258a();
            aVar.f42459a = "";
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
                    aVar.f42459a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyPromotionLinkResponse getMyPromotionLinkResponse) throws IOException {
            if (getMyPromotionLinkResponse.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMyPromotionLinkResponse.url);
            }
            protoWriter.writeBytes(getMyPromotionLinkResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkResponse$a */
    public static final class C16258a extends Message.Builder<GetMyPromotionLinkResponse, C16258a> {

        /* renamed from: a */
        public String f42459a;

        /* renamed from: a */
        public GetMyPromotionLinkResponse build() {
            return new GetMyPromotionLinkResponse(this.f42459a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16258a newBuilder() {
        C16258a aVar = new C16258a();
        aVar.f42459a = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetMyPromotionLinkResponse");
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMyPromotionLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyPromotionLinkResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetMyPromotionLinkResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
    }
}
