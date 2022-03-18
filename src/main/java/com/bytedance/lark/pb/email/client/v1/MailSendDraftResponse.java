package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSendDraftResponse extends Message<MailSendDraftResponse, C16886a> {
    public static final ProtoAdapter<MailSendDraftResponse> ADAPTER = new C16887b();
    private static final long serialVersionUID = 0;
    public final Message message;
    public final String thread_id;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse$b */
    private static final class C16887b extends ProtoAdapter<MailSendDraftResponse> {
        C16887b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSendDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSendDraftResponse mailSendDraftResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSendDraftResponse.message != null) {
                i = Message.ADAPTER.encodedSizeWithTag(1, mailSendDraftResponse.message);
            } else {
                i = 0;
            }
            if (mailSendDraftResponse.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSendDraftResponse.thread_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSendDraftResponse.uuid != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailSendDraftResponse.uuid);
            }
            return i4 + i3 + mailSendDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSendDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16886a aVar = new C16886a();
            aVar.f43359b = "";
            aVar.f43360c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43358a = Message.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43359b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43360c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSendDraftResponse mailSendDraftResponse) throws IOException {
            if (mailSendDraftResponse.message != null) {
                Message.ADAPTER.encodeWithTag(protoWriter, 1, mailSendDraftResponse.message);
            }
            if (mailSendDraftResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSendDraftResponse.thread_id);
            }
            if (mailSendDraftResponse.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailSendDraftResponse.uuid);
            }
            protoWriter.writeBytes(mailSendDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse$a */
    public static final class C16886a extends Message.Builder<MailSendDraftResponse, C16886a> {

        /* renamed from: a */
        public Message f43358a;

        /* renamed from: b */
        public String f43359b;

        /* renamed from: c */
        public String f43360c;

        /* renamed from: a */
        public MailSendDraftResponse build() {
            return new MailSendDraftResponse(this.f43358a, this.f43359b, this.f43360c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16886a newBuilder() {
        C16886a aVar = new C16886a();
        aVar.f43358a = this.message;
        aVar.f43359b = this.thread_id;
        aVar.f43360c = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSendDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSendDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSendDraftResponse(Message message2, String str, String str2) {
        this(message2, str, str2, ByteString.EMPTY);
    }

    public MailSendDraftResponse(Message message2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = message2;
        this.thread_id = str;
        this.uuid = str2;
    }
}
