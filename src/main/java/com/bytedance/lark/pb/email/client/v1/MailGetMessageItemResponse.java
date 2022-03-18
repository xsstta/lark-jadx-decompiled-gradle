package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetMessageItemResponse extends Message<MailGetMessageItemResponse, C16738a> {
    public static final ProtoAdapter<MailGetMessageItemResponse> ADAPTER = new C16739b();
    private static final long serialVersionUID = 0;
    public final Message message;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageItemResponse$b */
    private static final class C16739b extends ProtoAdapter<MailGetMessageItemResponse> {
        C16739b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageItemResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageItemResponse mailGetMessageItemResponse) {
            int i;
            if (mailGetMessageItemResponse.message != null) {
                i = Message.ADAPTER.encodedSizeWithTag(1, mailGetMessageItemResponse.message);
            } else {
                i = 0;
            }
            return i + mailGetMessageItemResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageItemResponse decode(ProtoReader protoReader) throws IOException {
            C16738a aVar = new C16738a();
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
                    aVar.f43200a = Message.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageItemResponse mailGetMessageItemResponse) throws IOException {
            if (mailGetMessageItemResponse.message != null) {
                Message.ADAPTER.encodeWithTag(protoWriter, 1, mailGetMessageItemResponse.message);
            }
            protoWriter.writeBytes(mailGetMessageItemResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageItemResponse$a */
    public static final class C16738a extends Message.Builder<MailGetMessageItemResponse, C16738a> {

        /* renamed from: a */
        public Message f43200a;

        /* renamed from: a */
        public MailGetMessageItemResponse build() {
            return new MailGetMessageItemResponse(this.f43200a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16738a newBuilder() {
        C16738a aVar = new C16738a();
        aVar.f43200a = this.message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageItemResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageItemResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageItemResponse(Message message2) {
        this(message2, ByteString.EMPTY);
    }

    public MailGetMessageItemResponse(Message message2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = message2;
    }
}
