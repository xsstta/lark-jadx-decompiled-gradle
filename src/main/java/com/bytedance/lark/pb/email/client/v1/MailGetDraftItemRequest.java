package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetDraftItemRequest extends Message<MailGetDraftItemRequest, C16712a> {
    public static final ProtoAdapter<MailGetDraftItemRequest> ADAPTER = new C16713b();
    private static final long serialVersionUID = 0;
    public final String draft_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDraftItemRequest$b */
    private static final class C16713b extends ProtoAdapter<MailGetDraftItemRequest> {
        C16713b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetDraftItemRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetDraftItemRequest mailGetDraftItemRequest) {
            int i;
            if (mailGetDraftItemRequest.draft_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetDraftItemRequest.draft_id);
            } else {
                i = 0;
            }
            return i + mailGetDraftItemRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetDraftItemRequest decode(ProtoReader protoReader) throws IOException {
            C16712a aVar = new C16712a();
            aVar.f43176a = "";
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
                    aVar.f43176a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetDraftItemRequest mailGetDraftItemRequest) throws IOException {
            if (mailGetDraftItemRequest.draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetDraftItemRequest.draft_id);
            }
            protoWriter.writeBytes(mailGetDraftItemRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDraftItemRequest$a */
    public static final class C16712a extends Message.Builder<MailGetDraftItemRequest, C16712a> {

        /* renamed from: a */
        public String f43176a;

        /* renamed from: a */
        public MailGetDraftItemRequest build() {
            return new MailGetDraftItemRequest(this.f43176a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16712a newBuilder() {
        C16712a aVar = new C16712a();
        aVar.f43176a = this.draft_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetDraftItemRequest");
        StringBuilder sb = new StringBuilder();
        if (this.draft_id != null) {
            sb.append(", draft_id=");
            sb.append(this.draft_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetDraftItemRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetDraftItemRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetDraftItemRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_id = str;
    }
}
