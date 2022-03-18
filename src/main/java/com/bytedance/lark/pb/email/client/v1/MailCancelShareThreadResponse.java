package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCancelShareThreadResponse extends Message<MailCancelShareThreadResponse, C16652a> {
    public static final ProtoAdapter<MailCancelShareThreadResponse> ADAPTER = new C16653b();
    private static final long serialVersionUID = 0;
    public final String threadId;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadResponse$b */
    private static final class C16653b extends ProtoAdapter<MailCancelShareThreadResponse> {
        C16653b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCancelShareThreadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCancelShareThreadResponse mailCancelShareThreadResponse) {
            int i;
            if (mailCancelShareThreadResponse.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCancelShareThreadResponse.threadId);
            } else {
                i = 0;
            }
            return i + mailCancelShareThreadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCancelShareThreadResponse decode(ProtoReader protoReader) throws IOException {
            C16652a aVar = new C16652a();
            aVar.f43093a = "";
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
                    aVar.f43093a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCancelShareThreadResponse mailCancelShareThreadResponse) throws IOException {
            if (mailCancelShareThreadResponse.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCancelShareThreadResponse.threadId);
            }
            protoWriter.writeBytes(mailCancelShareThreadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadResponse$a */
    public static final class C16652a extends Message.Builder<MailCancelShareThreadResponse, C16652a> {

        /* renamed from: a */
        public String f43093a;

        /* renamed from: a */
        public MailCancelShareThreadResponse build() {
            return new MailCancelShareThreadResponse(this.f43093a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16652a newBuilder() {
        C16652a aVar = new C16652a();
        aVar.f43093a = this.threadId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCancelShareThreadResponse");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCancelShareThreadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCancelShareThreadResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailCancelShareThreadResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
    }
}
