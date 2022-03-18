package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSendDraftRequest extends Message<MailSendDraftRequest, C16884a> {
    public static final ProtoAdapter<MailSendDraftRequest> ADAPTER = new C16885b();
    public static final Long DEFAULT_SCHEDULE_SEND_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Draft draft;
    public final String origin_message_id;
    public final Long schedule_send_time;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSendDraftRequest$b */
    private static final class C16885b extends ProtoAdapter<MailSendDraftRequest> {
        C16885b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSendDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSendDraftRequest mailSendDraftRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSendDraftRequest.origin_message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSendDraftRequest.origin_message_id);
            } else {
                i = 0;
            }
            if (mailSendDraftRequest.draft != null) {
                i2 = Draft.ADAPTER.encodedSizeWithTag(3, mailSendDraftRequest.draft);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSendDraftRequest.schedule_send_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, mailSendDraftRequest.schedule_send_time);
            }
            return i4 + i3 + mailSendDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSendDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16884a aVar = new C16884a();
            aVar.f43355a = "";
            aVar.f43357c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f43355a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43356b = Draft.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43357c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSendDraftRequest mailSendDraftRequest) throws IOException {
            if (mailSendDraftRequest.origin_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSendDraftRequest.origin_message_id);
            }
            if (mailSendDraftRequest.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 3, mailSendDraftRequest.draft);
            }
            if (mailSendDraftRequest.schedule_send_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mailSendDraftRequest.schedule_send_time);
            }
            protoWriter.writeBytes(mailSendDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSendDraftRequest$a */
    public static final class C16884a extends Message.Builder<MailSendDraftRequest, C16884a> {

        /* renamed from: a */
        public String f43355a;

        /* renamed from: b */
        public Draft f43356b;

        /* renamed from: c */
        public Long f43357c;

        /* renamed from: a */
        public MailSendDraftRequest build() {
            return new MailSendDraftRequest(this.f43355a, this.f43356b, this.f43357c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16884a mo59725a(Draft draft) {
            this.f43356b = draft;
            return this;
        }

        /* renamed from: a */
        public C16884a mo59726a(Long l) {
            this.f43357c = l;
            return this;
        }

        /* renamed from: a */
        public C16884a mo59727a(String str) {
            this.f43355a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16884a newBuilder() {
        C16884a aVar = new C16884a();
        aVar.f43355a = this.origin_message_id;
        aVar.f43356b = this.draft;
        aVar.f43357c = this.schedule_send_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSendDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.origin_message_id != null) {
            sb.append(", origin_message_id=");
            sb.append(this.origin_message_id);
        }
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        if (this.schedule_send_time != null) {
            sb.append(", schedule_send_time=");
            sb.append(this.schedule_send_time);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSendDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSendDraftRequest(String str, Draft draft2, Long l) {
        this(str, draft2, l, ByteString.EMPTY);
    }

    public MailSendDraftRequest(String str, Draft draft2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.origin_message_id = str;
        this.draft = draft2;
        this.schedule_send_time = l;
    }
}
