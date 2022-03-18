package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailEditMessageRequest extends Message<MailEditMessageRequest, C16700a> {
    public static final ProtoAdapter<MailEditMessageRequest> ADAPTER = new C16701b();
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailEditMessageRequest$b */
    private static final class C16701b extends ProtoAdapter<MailEditMessageRequest> {
        C16701b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailEditMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailEditMessageRequest mailEditMessageRequest) {
            int i;
            int i2 = 0;
            if (mailEditMessageRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailEditMessageRequest.message_id);
            } else {
                i = 0;
            }
            if (mailEditMessageRequest.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailEditMessageRequest.thread_id);
            }
            return i + i2 + mailEditMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailEditMessageRequest decode(ProtoReader protoReader) throws IOException {
            C16700a aVar = new C16700a();
            aVar.f43165a = "";
            aVar.f43166b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43165a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43166b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailEditMessageRequest mailEditMessageRequest) throws IOException {
            if (mailEditMessageRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailEditMessageRequest.message_id);
            }
            if (mailEditMessageRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailEditMessageRequest.thread_id);
            }
            protoWriter.writeBytes(mailEditMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailEditMessageRequest$a */
    public static final class C16700a extends Message.Builder<MailEditMessageRequest, C16700a> {

        /* renamed from: a */
        public String f43165a;

        /* renamed from: b */
        public String f43166b;

        /* renamed from: a */
        public MailEditMessageRequest build() {
            return new MailEditMessageRequest(this.f43165a, this.f43166b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16700a mo59320a(String str) {
            this.f43165a = str;
            return this;
        }

        /* renamed from: b */
        public C16700a mo59322b(String str) {
            this.f43166b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16700a newBuilder() {
        C16700a aVar = new C16700a();
        aVar.f43165a = this.message_id;
        aVar.f43166b = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailEditMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailEditMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailEditMessageRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailEditMessageRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.thread_id = str2;
    }
}
