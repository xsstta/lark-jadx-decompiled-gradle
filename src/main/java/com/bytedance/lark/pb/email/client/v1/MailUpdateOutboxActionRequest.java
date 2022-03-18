package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateOutboxActionRequest extends Message<MailUpdateOutboxActionRequest, C16956a> {
    public static final ProtoAdapter<MailUpdateOutboxActionRequest> ADAPTER = new C16957b();
    public static final OutboxAction DEFAULT_OUTBOX_ACTION = OutboxAction.EDIT;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final OutboxAction outbox_action;
    public final String thread_id;

    public enum OutboxAction implements WireEnum {
        EDIT(1),
        DELETE(2);
        
        public static final ProtoAdapter<OutboxAction> ADAPTER = ProtoAdapter.newEnumAdapter(OutboxAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OutboxAction fromValue(int i) {
            if (i == 1) {
                return EDIT;
            }
            if (i != 2) {
                return null;
            }
            return DELETE;
        }

        private OutboxAction(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionRequest$b */
    private static final class C16957b extends ProtoAdapter<MailUpdateOutboxActionRequest> {
        C16957b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateOutboxActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateOutboxActionRequest mailUpdateOutboxActionRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailUpdateOutboxActionRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateOutboxActionRequest.thread_id);
            } else {
                i = 0;
            }
            if (mailUpdateOutboxActionRequest.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUpdateOutboxActionRequest.message_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailUpdateOutboxActionRequest.outbox_action != null) {
                i3 = OutboxAction.ADAPTER.encodedSizeWithTag(3, mailUpdateOutboxActionRequest.outbox_action);
            }
            return i4 + i3 + mailUpdateOutboxActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateOutboxActionRequest decode(ProtoReader protoReader) throws IOException {
            C16956a aVar = new C16956a();
            aVar.f43461a = "";
            aVar.f43462b = "";
            aVar.f43463c = OutboxAction.EDIT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43461a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43462b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43463c = OutboxAction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateOutboxActionRequest mailUpdateOutboxActionRequest) throws IOException {
            if (mailUpdateOutboxActionRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateOutboxActionRequest.thread_id);
            }
            if (mailUpdateOutboxActionRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUpdateOutboxActionRequest.message_id);
            }
            if (mailUpdateOutboxActionRequest.outbox_action != null) {
                OutboxAction.ADAPTER.encodeWithTag(protoWriter, 3, mailUpdateOutboxActionRequest.outbox_action);
            }
            protoWriter.writeBytes(mailUpdateOutboxActionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionRequest$a */
    public static final class C16956a extends Message.Builder<MailUpdateOutboxActionRequest, C16956a> {

        /* renamed from: a */
        public String f43461a;

        /* renamed from: b */
        public String f43462b;

        /* renamed from: c */
        public OutboxAction f43463c;

        /* renamed from: a */
        public MailUpdateOutboxActionRequest build() {
            return new MailUpdateOutboxActionRequest(this.f43461a, this.f43462b, this.f43463c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16956a mo59890a(OutboxAction outboxAction) {
            this.f43463c = outboxAction;
            return this;
        }

        /* renamed from: b */
        public C16956a mo59893b(String str) {
            this.f43462b = str;
            return this;
        }

        /* renamed from: a */
        public C16956a mo59891a(String str) {
            this.f43461a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16956a newBuilder() {
        C16956a aVar = new C16956a();
        aVar.f43461a = this.thread_id;
        aVar.f43462b = this.message_id;
        aVar.f43463c = this.outbox_action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateOutboxActionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.outbox_action != null) {
            sb.append(", outbox_action=");
            sb.append(this.outbox_action);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateOutboxActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateOutboxActionRequest(String str, String str2, OutboxAction outboxAction) {
        this(str, str2, outboxAction, ByteString.EMPTY);
    }

    public MailUpdateOutboxActionRequest(String str, String str2, OutboxAction outboxAction, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.message_id = str2;
        this.outbox_action = outboxAction;
    }
}
