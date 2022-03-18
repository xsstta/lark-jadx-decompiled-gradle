package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetSmartInboxPreviewCardResponse extends Message<MailGetSmartInboxPreviewCardResponse, C16782a> {
    public static final ProtoAdapter<MailGetSmartInboxPreviewCardResponse> ADAPTER = new C16783b();
    private static final long serialVersionUID = 0;
    public final SmartInboxPreviewCard smart_inbox_preview_card;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardResponse$b */
    private static final class C16783b extends ProtoAdapter<MailGetSmartInboxPreviewCardResponse> {
        C16783b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSmartInboxPreviewCardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSmartInboxPreviewCardResponse mailGetSmartInboxPreviewCardResponse) {
            int i;
            if (mailGetSmartInboxPreviewCardResponse.smart_inbox_preview_card != null) {
                i = SmartInboxPreviewCard.ADAPTER.encodedSizeWithTag(1, mailGetSmartInboxPreviewCardResponse.smart_inbox_preview_card);
            } else {
                i = 0;
            }
            return i + mailGetSmartInboxPreviewCardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSmartInboxPreviewCardResponse decode(ProtoReader protoReader) throws IOException {
            C16782a aVar = new C16782a();
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
                    aVar.f43254a = SmartInboxPreviewCard.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSmartInboxPreviewCardResponse mailGetSmartInboxPreviewCardResponse) throws IOException {
            if (mailGetSmartInboxPreviewCardResponse.smart_inbox_preview_card != null) {
                SmartInboxPreviewCard.ADAPTER.encodeWithTag(protoWriter, 1, mailGetSmartInboxPreviewCardResponse.smart_inbox_preview_card);
            }
            protoWriter.writeBytes(mailGetSmartInboxPreviewCardResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardResponse$a */
    public static final class C16782a extends Message.Builder<MailGetSmartInboxPreviewCardResponse, C16782a> {

        /* renamed from: a */
        public SmartInboxPreviewCard f43254a;

        /* renamed from: a */
        public MailGetSmartInboxPreviewCardResponse build() {
            return new MailGetSmartInboxPreviewCardResponse(this.f43254a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16782a newBuilder() {
        C16782a aVar = new C16782a();
        aVar.f43254a = this.smart_inbox_preview_card;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSmartInboxPreviewCardResponse");
        StringBuilder sb = new StringBuilder();
        if (this.smart_inbox_preview_card != null) {
            sb.append(", smart_inbox_preview_card=");
            sb.append(this.smart_inbox_preview_card);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetSmartInboxPreviewCardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSmartInboxPreviewCardResponse(SmartInboxPreviewCard smartInboxPreviewCard) {
        this(smartInboxPreviewCard, ByteString.EMPTY);
    }

    public MailGetSmartInboxPreviewCardResponse(SmartInboxPreviewCard smartInboxPreviewCard, ByteString byteString) {
        super(ADAPTER, byteString);
        this.smart_inbox_preview_card = smartInboxPreviewCard;
    }
}
