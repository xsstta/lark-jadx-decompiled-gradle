package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPromotionRuleResponse extends Message<GetPromotionRuleResponse, C16266a> {
    public static final ProtoAdapter<GetPromotionRuleResponse> ADAPTER = new C16267b();
    private static final long serialVersionUID = 0;
    public final RichText display_content;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPromotionRuleResponse$b */
    private static final class C16267b extends ProtoAdapter<GetPromotionRuleResponse> {
        C16267b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPromotionRuleResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPromotionRuleResponse getPromotionRuleResponse) {
            int i;
            int i2 = 0;
            if (getPromotionRuleResponse.display_content != null) {
                i = RichText.ADAPTER.encodedSizeWithTag(1, getPromotionRuleResponse.display_content);
            } else {
                i = 0;
            }
            if (getPromotionRuleResponse.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getPromotionRuleResponse.text);
            }
            return i + i2 + getPromotionRuleResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPromotionRuleResponse decode(ProtoReader protoReader) throws IOException {
            C16266a aVar = new C16266a();
            aVar.f42465b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42464a = RichText.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42465b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPromotionRuleResponse getPromotionRuleResponse) throws IOException {
            if (getPromotionRuleResponse.display_content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 1, getPromotionRuleResponse.display_content);
            }
            if (getPromotionRuleResponse.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getPromotionRuleResponse.text);
            }
            protoWriter.writeBytes(getPromotionRuleResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPromotionRuleResponse$a */
    public static final class C16266a extends Message.Builder<GetPromotionRuleResponse, C16266a> {

        /* renamed from: a */
        public RichText f42464a;

        /* renamed from: b */
        public String f42465b;

        /* renamed from: a */
        public GetPromotionRuleResponse build() {
            return new GetPromotionRuleResponse(this.f42464a, this.f42465b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16266a newBuilder() {
        C16266a aVar = new C16266a();
        aVar.f42464a = this.display_content;
        aVar.f42465b = this.text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetPromotionRuleResponse");
        StringBuilder sb = new StringBuilder();
        if (this.display_content != null) {
            sb.append(", display_content=");
            sb.append(this.display_content);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPromotionRuleResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPromotionRuleResponse(RichText richText, String str) {
        this(richText, str, ByteString.EMPTY);
    }

    public GetPromotionRuleResponse(RichText richText, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.display_content = richText;
        this.text = str;
    }
}
