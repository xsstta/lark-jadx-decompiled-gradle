package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateOutboxActionResponse extends Message<MailUpdateOutboxActionResponse, C16958a> {
    public static final ProtoAdapter<MailUpdateOutboxActionResponse> ADAPTER = new C16959b();
    private static final long serialVersionUID = 0;
    public final String reply_to_mail_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionResponse$b */
    private static final class C16959b extends ProtoAdapter<MailUpdateOutboxActionResponse> {
        C16959b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateOutboxActionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateOutboxActionResponse mailUpdateOutboxActionResponse) {
            int i;
            int i2 = 0;
            if (mailUpdateOutboxActionResponse.reply_to_mail_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateOutboxActionResponse.reply_to_mail_id);
            } else {
                i = 0;
            }
            if (mailUpdateOutboxActionResponse.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUpdateOutboxActionResponse.thread_id);
            }
            return i + i2 + mailUpdateOutboxActionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateOutboxActionResponse decode(ProtoReader protoReader) throws IOException {
            C16958a aVar = new C16958a();
            aVar.f43464a = "";
            aVar.f43465b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43464a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43465b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateOutboxActionResponse mailUpdateOutboxActionResponse) throws IOException {
            if (mailUpdateOutboxActionResponse.reply_to_mail_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateOutboxActionResponse.reply_to_mail_id);
            }
            if (mailUpdateOutboxActionResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUpdateOutboxActionResponse.thread_id);
            }
            protoWriter.writeBytes(mailUpdateOutboxActionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionResponse$a */
    public static final class C16958a extends Message.Builder<MailUpdateOutboxActionResponse, C16958a> {

        /* renamed from: a */
        public String f43464a;

        /* renamed from: b */
        public String f43465b;

        /* renamed from: a */
        public MailUpdateOutboxActionResponse build() {
            return new MailUpdateOutboxActionResponse(this.f43464a, this.f43465b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16958a newBuilder() {
        C16958a aVar = new C16958a();
        aVar.f43464a = this.reply_to_mail_id;
        aVar.f43465b = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateOutboxActionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.reply_to_mail_id != null) {
            sb.append(", reply_to_mail_id=");
            sb.append(this.reply_to_mail_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateOutboxActionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateOutboxActionResponse(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailUpdateOutboxActionResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reply_to_mail_id = str;
        this.thread_id = str2;
    }
}
