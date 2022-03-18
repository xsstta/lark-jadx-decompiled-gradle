package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateShareThreadResponse extends Message<MailCreateShareThreadResponse, C16682a> {
    public static final ProtoAdapter<MailCreateShareThreadResponse> ADAPTER = new C16683b();
    private static final long serialVersionUID = 0;
    public final String threadId;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadResponse$b */
    private static final class C16683b extends ProtoAdapter<MailCreateShareThreadResponse> {
        C16683b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareThreadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareThreadResponse mailCreateShareThreadResponse) {
            int i;
            if (mailCreateShareThreadResponse.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareThreadResponse.threadId);
            } else {
                i = 0;
            }
            return i + mailCreateShareThreadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareThreadResponse decode(ProtoReader protoReader) throws IOException {
            C16682a aVar = new C16682a();
            aVar.f43156a = "";
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
                    aVar.f43156a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareThreadResponse mailCreateShareThreadResponse) throws IOException {
            if (mailCreateShareThreadResponse.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareThreadResponse.threadId);
            }
            protoWriter.writeBytes(mailCreateShareThreadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadResponse$a */
    public static final class C16682a extends Message.Builder<MailCreateShareThreadResponse, C16682a> {

        /* renamed from: a */
        public String f43156a;

        /* renamed from: a */
        public MailCreateShareThreadResponse build() {
            return new MailCreateShareThreadResponse(this.f43156a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16682a newBuilder() {
        C16682a aVar = new C16682a();
        aVar.f43156a = this.threadId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareThreadResponse");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareThreadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareThreadResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailCreateShareThreadResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
    }
}
