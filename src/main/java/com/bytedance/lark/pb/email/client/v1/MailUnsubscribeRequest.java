package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUnsubscribeRequest extends Message<MailUnsubscribeRequest, C16926a> {
    public static final ProtoAdapter<MailUnsubscribeRequest> ADAPTER = new C16927b();
    public static final Boolean DEFAULT_MOVE_TO_SPAM = false;
    private static final long serialVersionUID = 0;
    public final String message_biz_id;
    public final Boolean move_to_spam;
    public final String thread_biz_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUnsubscribeRequest$b */
    private static final class C16927b extends ProtoAdapter<MailUnsubscribeRequest> {
        C16927b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUnsubscribeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUnsubscribeRequest mailUnsubscribeRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailUnsubscribeRequest.message_biz_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUnsubscribeRequest.message_biz_id);
            } else {
                i = 0;
            }
            if (mailUnsubscribeRequest.thread_biz_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUnsubscribeRequest.thread_biz_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailUnsubscribeRequest.move_to_spam != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailUnsubscribeRequest.move_to_spam);
            }
            return i4 + i3 + mailUnsubscribeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUnsubscribeRequest decode(ProtoReader protoReader) throws IOException {
            C16926a aVar = new C16926a();
            aVar.f43420a = "";
            aVar.f43421b = "";
            aVar.f43422c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43420a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43421b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43422c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUnsubscribeRequest mailUnsubscribeRequest) throws IOException {
            if (mailUnsubscribeRequest.message_biz_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUnsubscribeRequest.message_biz_id);
            }
            if (mailUnsubscribeRequest.thread_biz_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUnsubscribeRequest.thread_biz_id);
            }
            if (mailUnsubscribeRequest.move_to_spam != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailUnsubscribeRequest.move_to_spam);
            }
            protoWriter.writeBytes(mailUnsubscribeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUnsubscribeRequest$a */
    public static final class C16926a extends Message.Builder<MailUnsubscribeRequest, C16926a> {

        /* renamed from: a */
        public String f43420a;

        /* renamed from: b */
        public String f43421b;

        /* renamed from: c */
        public Boolean f43422c;

        /* renamed from: a */
        public MailUnsubscribeRequest build() {
            return new MailUnsubscribeRequest(this.f43420a, this.f43421b, this.f43422c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16926a mo59820a(Boolean bool) {
            this.f43422c = bool;
            return this;
        }

        /* renamed from: b */
        public C16926a mo59823b(String str) {
            this.f43421b = str;
            return this;
        }

        /* renamed from: a */
        public C16926a mo59821a(String str) {
            this.f43420a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16926a newBuilder() {
        C16926a aVar = new C16926a();
        aVar.f43420a = this.message_biz_id;
        aVar.f43421b = this.thread_biz_id;
        aVar.f43422c = this.move_to_spam;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUnsubscribeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_biz_id != null) {
            sb.append(", message_biz_id=");
            sb.append(this.message_biz_id);
        }
        if (this.thread_biz_id != null) {
            sb.append(", thread_biz_id=");
            sb.append(this.thread_biz_id);
        }
        if (this.move_to_spam != null) {
            sb.append(", move_to_spam=");
            sb.append(this.move_to_spam);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUnsubscribeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUnsubscribeRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public MailUnsubscribeRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_biz_id = str;
        this.thread_biz_id = str2;
        this.move_to_spam = bool;
    }
}
