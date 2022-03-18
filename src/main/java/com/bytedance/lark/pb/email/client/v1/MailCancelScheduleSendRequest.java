package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailCancelScheduleSendRequest extends Message<MailCancelScheduleSendRequest, C16646a> {
    public static final ProtoAdapter<MailCancelScheduleSendRequest> ADAPTER = new C16647b();
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendRequest$b */
    private static final class C16647b extends ProtoAdapter<MailCancelScheduleSendRequest> {
        C16647b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCancelScheduleSendRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCancelScheduleSendRequest mailCancelScheduleSendRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailCancelScheduleSendRequest.thread_ids);
            if (mailCancelScheduleSendRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCancelScheduleSendRequest.message_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mailCancelScheduleSendRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCancelScheduleSendRequest decode(ProtoReader protoReader) throws IOException {
            C16646a aVar = new C16646a();
            aVar.f43091b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43090a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43091b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCancelScheduleSendRequest mailCancelScheduleSendRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailCancelScheduleSendRequest.thread_ids);
            if (mailCancelScheduleSendRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCancelScheduleSendRequest.message_id);
            }
            protoWriter.writeBytes(mailCancelScheduleSendRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendRequest$a */
    public static final class C16646a extends Message.Builder<MailCancelScheduleSendRequest, C16646a> {

        /* renamed from: a */
        public List<String> f43090a = Internal.newMutableList();

        /* renamed from: b */
        public String f43091b;

        /* renamed from: a */
        public MailCancelScheduleSendRequest build() {
            return new MailCancelScheduleSendRequest(this.f43090a, this.f43091b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16646a mo59181a(String str) {
            this.f43091b = str;
            return this;
        }

        /* renamed from: a */
        public C16646a mo59182a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43090a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16646a newBuilder() {
        C16646a aVar = new C16646a();
        aVar.f43090a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43091b = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCancelScheduleSendRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCancelScheduleSendRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCancelScheduleSendRequest(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public MailCancelScheduleSendRequest(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.message_id = str;
    }
}
