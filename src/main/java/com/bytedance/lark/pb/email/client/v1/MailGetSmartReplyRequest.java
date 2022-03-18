package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetSmartReplyRequest extends Message<MailGetSmartReplyRequest, C16784a> {
    public static final ProtoAdapter<MailGetSmartReplyRequest> ADAPTER = new C16785b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyRequest$b */
    private static final class C16785b extends ProtoAdapter<MailGetSmartReplyRequest> {
        C16785b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSmartReplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSmartReplyRequest mailGetSmartReplyRequest) {
            int i;
            if (mailGetSmartReplyRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetSmartReplyRequest.message_id);
            } else {
                i = 0;
            }
            return i + mailGetSmartReplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSmartReplyRequest decode(ProtoReader protoReader) throws IOException {
            C16784a aVar = new C16784a();
            aVar.f43255a = "";
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
                    aVar.f43255a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSmartReplyRequest mailGetSmartReplyRequest) throws IOException {
            if (mailGetSmartReplyRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetSmartReplyRequest.message_id);
            }
            protoWriter.writeBytes(mailGetSmartReplyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyRequest$a */
    public static final class C16784a extends Message.Builder<MailGetSmartReplyRequest, C16784a> {

        /* renamed from: a */
        public String f43255a;

        /* renamed from: a */
        public MailGetSmartReplyRequest build() {
            return new MailGetSmartReplyRequest(this.f43255a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16784a newBuilder() {
        C16784a aVar = new C16784a();
        aVar.f43255a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSmartReplyRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetSmartReplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSmartReplyRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetSmartReplyRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
