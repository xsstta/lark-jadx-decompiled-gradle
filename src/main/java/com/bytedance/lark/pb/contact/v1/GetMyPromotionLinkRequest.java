package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMyPromotionLinkRequest extends Message<GetMyPromotionLinkRequest, C16256a> {
    public static final ProtoAdapter<GetMyPromotionLinkRequest> ADAPTER = new C16257b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkRequest$b */
    private static final class C16257b extends ProtoAdapter<GetMyPromotionLinkRequest> {
        C16257b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyPromotionLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyPromotionLinkRequest getMyPromotionLinkRequest) {
            return getMyPromotionLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyPromotionLinkRequest decode(ProtoReader protoReader) throws IOException {
            C16256a aVar = new C16256a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyPromotionLinkRequest getMyPromotionLinkRequest) throws IOException {
            protoWriter.writeBytes(getMyPromotionLinkRequest.unknownFields());
        }
    }

    public GetMyPromotionLinkRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkRequest$a */
    public static final class C16256a extends Message.Builder<GetMyPromotionLinkRequest, C16256a> {
        /* renamed from: a */
        public GetMyPromotionLinkRequest build() {
            return new GetMyPromotionLinkRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16256a newBuilder() {
        C16256a aVar = new C16256a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetMyPromotionLinkRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetMyPromotionLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyPromotionLinkRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
