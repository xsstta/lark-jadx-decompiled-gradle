package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCancelShareThreadRequest extends Message<MailCancelShareThreadRequest, C16650a> {
    public static final ProtoAdapter<MailCancelShareThreadRequest> ADAPTER = new C16651b();
    private static final long serialVersionUID = 0;
    public final String threadId;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadRequest$b */
    private static final class C16651b extends ProtoAdapter<MailCancelShareThreadRequest> {
        C16651b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCancelShareThreadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCancelShareThreadRequest mailCancelShareThreadRequest) {
            int i;
            if (mailCancelShareThreadRequest.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCancelShareThreadRequest.threadId);
            } else {
                i = 0;
            }
            return i + mailCancelShareThreadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCancelShareThreadRequest decode(ProtoReader protoReader) throws IOException {
            C16650a aVar = new C16650a();
            aVar.f43092a = "";
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
                    aVar.f43092a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCancelShareThreadRequest mailCancelShareThreadRequest) throws IOException {
            if (mailCancelShareThreadRequest.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCancelShareThreadRequest.threadId);
            }
            protoWriter.writeBytes(mailCancelShareThreadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadRequest$a */
    public static final class C16650a extends Message.Builder<MailCancelShareThreadRequest, C16650a> {

        /* renamed from: a */
        public String f43092a;

        /* renamed from: a */
        public MailCancelShareThreadRequest build() {
            return new MailCancelShareThreadRequest(this.f43092a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16650a mo59191a(String str) {
            this.f43092a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16650a newBuilder() {
        C16650a aVar = new C16650a();
        aVar.f43092a = this.threadId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCancelShareThreadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCancelShareThreadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCancelShareThreadRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailCancelShareThreadRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
    }
}
