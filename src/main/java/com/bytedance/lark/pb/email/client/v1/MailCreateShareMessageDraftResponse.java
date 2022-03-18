package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateShareMessageDraftResponse extends Message<MailCreateShareMessageDraftResponse, C16678a> {
    public static final ProtoAdapter<MailCreateShareMessageDraftResponse> ADAPTER = new C16679b();
    public static final Boolean DEFAULT_CAN_REPLY = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_reply;
    public final Draft draft;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftResponse$b */
    private static final class C16679b extends ProtoAdapter<MailCreateShareMessageDraftResponse> {
        C16679b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareMessageDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareMessageDraftResponse mailCreateShareMessageDraftResponse) {
            int i;
            int i2 = 0;
            if (mailCreateShareMessageDraftResponse.can_reply != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailCreateShareMessageDraftResponse.can_reply);
            } else {
                i = 0;
            }
            if (mailCreateShareMessageDraftResponse.draft != null) {
                i2 = Draft.ADAPTER.encodedSizeWithTag(2, mailCreateShareMessageDraftResponse.draft);
            }
            return i + i2 + mailCreateShareMessageDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareMessageDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16678a aVar = new C16678a();
            aVar.f43150a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43150a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43151b = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareMessageDraftResponse mailCreateShareMessageDraftResponse) throws IOException {
            if (mailCreateShareMessageDraftResponse.can_reply != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailCreateShareMessageDraftResponse.can_reply);
            }
            if (mailCreateShareMessageDraftResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 2, mailCreateShareMessageDraftResponse.draft);
            }
            protoWriter.writeBytes(mailCreateShareMessageDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftResponse$a */
    public static final class C16678a extends Message.Builder<MailCreateShareMessageDraftResponse, C16678a> {

        /* renamed from: a */
        public Boolean f43150a;

        /* renamed from: b */
        public Draft f43151b;

        /* renamed from: a */
        public MailCreateShareMessageDraftResponse build() {
            return new MailCreateShareMessageDraftResponse(this.f43150a, this.f43151b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16678a newBuilder() {
        C16678a aVar = new C16678a();
        aVar.f43150a = this.can_reply;
        aVar.f43151b = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareMessageDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.can_reply != null) {
            sb.append(", can_reply=");
            sb.append(this.can_reply);
        }
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareMessageDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareMessageDraftResponse(Boolean bool, Draft draft2) {
        this(bool, draft2, ByteString.EMPTY);
    }

    public MailCreateShareMessageDraftResponse(Boolean bool, Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_reply = bool;
        this.draft = draft2;
    }
}
