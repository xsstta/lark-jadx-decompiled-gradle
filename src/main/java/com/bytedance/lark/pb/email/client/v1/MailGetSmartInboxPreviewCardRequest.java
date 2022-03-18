package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetSmartInboxPreviewCardRequest extends Message<MailGetSmartInboxPreviewCardRequest, C16780a> {
    public static final ProtoAdapter<MailGetSmartInboxPreviewCardRequest> ADAPTER = new C16781b();
    private static final long serialVersionUID = 0;
    public final String label_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardRequest$b */
    private static final class C16781b extends ProtoAdapter<MailGetSmartInboxPreviewCardRequest> {
        C16781b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSmartInboxPreviewCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSmartInboxPreviewCardRequest mailGetSmartInboxPreviewCardRequest) {
            int i;
            if (mailGetSmartInboxPreviewCardRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetSmartInboxPreviewCardRequest.label_id);
            } else {
                i = 0;
            }
            return i + mailGetSmartInboxPreviewCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSmartInboxPreviewCardRequest decode(ProtoReader protoReader) throws IOException {
            C16780a aVar = new C16780a();
            aVar.f43253a = "";
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
                    aVar.f43253a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSmartInboxPreviewCardRequest mailGetSmartInboxPreviewCardRequest) throws IOException {
            if (mailGetSmartInboxPreviewCardRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetSmartInboxPreviewCardRequest.label_id);
            }
            protoWriter.writeBytes(mailGetSmartInboxPreviewCardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardRequest$a */
    public static final class C16780a extends Message.Builder<MailGetSmartInboxPreviewCardRequest, C16780a> {

        /* renamed from: a */
        public String f43253a;

        /* renamed from: a */
        public MailGetSmartInboxPreviewCardRequest build() {
            return new MailGetSmartInboxPreviewCardRequest(this.f43253a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16780a newBuilder() {
        C16780a aVar = new C16780a();
        aVar.f43253a = this.label_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSmartInboxPreviewCardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetSmartInboxPreviewCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSmartInboxPreviewCardRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetSmartInboxPreviewCardRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
    }
}
