package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendPhoneQueryQuotaApplyResponse extends Message<SendPhoneQueryQuotaApplyResponse, C16374a> {
    public static final ProtoAdapter<SendPhoneQueryQuotaApplyResponse> ADAPTER = new C16375b();
    private static final long serialVersionUID = 0;
    public final CardContent card_content;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyResponse$b */
    private static final class C16375b extends ProtoAdapter<SendPhoneQueryQuotaApplyResponse> {
        C16375b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendPhoneQueryQuotaApplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendPhoneQueryQuotaApplyResponse sendPhoneQueryQuotaApplyResponse) {
            int i;
            if (sendPhoneQueryQuotaApplyResponse.card_content != null) {
                i = CardContent.ADAPTER.encodedSizeWithTag(1, sendPhoneQueryQuotaApplyResponse.card_content);
            } else {
                i = 0;
            }
            return i + sendPhoneQueryQuotaApplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendPhoneQueryQuotaApplyResponse decode(ProtoReader protoReader) throws IOException {
            C16374a aVar = new C16374a();
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
                    aVar.f42632a = CardContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendPhoneQueryQuotaApplyResponse sendPhoneQueryQuotaApplyResponse) throws IOException {
            if (sendPhoneQueryQuotaApplyResponse.card_content != null) {
                CardContent.ADAPTER.encodeWithTag(protoWriter, 1, sendPhoneQueryQuotaApplyResponse.card_content);
            }
            protoWriter.writeBytes(sendPhoneQueryQuotaApplyResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyResponse$a */
    public static final class C16374a extends Message.Builder<SendPhoneQueryQuotaApplyResponse, C16374a> {

        /* renamed from: a */
        public CardContent f42632a;

        /* renamed from: a */
        public SendPhoneQueryQuotaApplyResponse build() {
            return new SendPhoneQueryQuotaApplyResponse(this.f42632a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16374a newBuilder() {
        C16374a aVar = new C16374a();
        aVar.f42632a = this.card_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendPhoneQueryQuotaApplyResponse");
        StringBuilder sb = new StringBuilder();
        if (this.card_content != null) {
            sb.append(", card_content=");
            sb.append(this.card_content);
        }
        StringBuilder replace = sb.replace(0, 2, "SendPhoneQueryQuotaApplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendPhoneQueryQuotaApplyResponse(CardContent cardContent) {
        this(cardContent, ByteString.EMPTY);
    }

    public SendPhoneQueryQuotaApplyResponse(CardContent cardContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_content = cardContent;
    }
}
