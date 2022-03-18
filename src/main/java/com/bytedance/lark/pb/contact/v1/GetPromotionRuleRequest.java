package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPromotionRuleRequest extends Message<GetPromotionRuleRequest, C16264a> {
    public static final ProtoAdapter<GetPromotionRuleRequest> ADAPTER = new C16265b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPromotionRuleRequest$b */
    private static final class C16265b extends ProtoAdapter<GetPromotionRuleRequest> {
        C16265b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPromotionRuleRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPromotionRuleRequest getPromotionRuleRequest) {
            return getPromotionRuleRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPromotionRuleRequest decode(ProtoReader protoReader) throws IOException {
            C16264a aVar = new C16264a();
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
        public void encode(ProtoWriter protoWriter, GetPromotionRuleRequest getPromotionRuleRequest) throws IOException {
            protoWriter.writeBytes(getPromotionRuleRequest.unknownFields());
        }
    }

    public GetPromotionRuleRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPromotionRuleRequest$a */
    public static final class C16264a extends Message.Builder<GetPromotionRuleRequest, C16264a> {
        /* renamed from: a */
        public GetPromotionRuleRequest build() {
            return new GetPromotionRuleRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16264a newBuilder() {
        C16264a aVar = new C16264a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetPromotionRuleRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetPromotionRuleRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPromotionRuleRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
