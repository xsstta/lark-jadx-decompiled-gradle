package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateDraftResponse extends Message<MailUpdateDraftResponse, C16946a> {
    public static final ProtoAdapter<MailUpdateDraftResponse> ADAPTER = new C16947b();
    private static final long serialVersionUID = 0;
    public final Draft draft;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftResponse$b */
    private static final class C16947b extends ProtoAdapter<MailUpdateDraftResponse> {
        C16947b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateDraftResponse mailUpdateDraftResponse) {
            int i;
            if (mailUpdateDraftResponse.draft != null) {
                i = Draft.ADAPTER.encodedSizeWithTag(1, mailUpdateDraftResponse.draft);
            } else {
                i = 0;
            }
            return i + mailUpdateDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16946a aVar = new C16946a();
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
                    aVar.f43446a = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateDraftResponse mailUpdateDraftResponse) throws IOException {
            if (mailUpdateDraftResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateDraftResponse.draft);
            }
            protoWriter.writeBytes(mailUpdateDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftResponse$a */
    public static final class C16946a extends Message.Builder<MailUpdateDraftResponse, C16946a> {

        /* renamed from: a */
        public Draft f43446a;

        /* renamed from: a */
        public MailUpdateDraftResponse build() {
            return new MailUpdateDraftResponse(this.f43446a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16946a newBuilder() {
        C16946a aVar = new C16946a();
        aVar.f43446a = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateDraftResponse(Draft draft2) {
        this(draft2, ByteString.EMPTY);
    }

    public MailUpdateDraftResponse(Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft = draft2;
    }
}
