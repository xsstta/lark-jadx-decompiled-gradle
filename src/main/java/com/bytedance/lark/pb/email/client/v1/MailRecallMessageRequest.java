package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRecallMessageRequest extends Message<MailRecallMessageRequest, C16854a> {
    public static final ProtoAdapter<MailRecallMessageRequest> ADAPTER = new C16855b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRecallMessageRequest$b */
    private static final class C16855b extends ProtoAdapter<MailRecallMessageRequest> {
        C16855b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRecallMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRecallMessageRequest mailRecallMessageRequest) {
            int i;
            if (mailRecallMessageRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailRecallMessageRequest.message_id);
            } else {
                i = 0;
            }
            return i + mailRecallMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailRecallMessageRequest decode(ProtoReader protoReader) throws IOException {
            C16854a aVar = new C16854a();
            aVar.f43321a = "";
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
                    aVar.f43321a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRecallMessageRequest mailRecallMessageRequest) throws IOException {
            if (mailRecallMessageRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailRecallMessageRequest.message_id);
            }
            protoWriter.writeBytes(mailRecallMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRecallMessageRequest$a */
    public static final class C16854a extends Message.Builder<MailRecallMessageRequest, C16854a> {

        /* renamed from: a */
        public String f43321a;

        /* renamed from: a */
        public MailRecallMessageRequest build() {
            return new MailRecallMessageRequest(this.f43321a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16854a newBuilder() {
        C16854a aVar = new C16854a();
        aVar.f43321a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRecallMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRecallMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailRecallMessageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailRecallMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
