package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailOpenEmlResponse extends Message<MailOpenEmlResponse, C16850a> {
    public static final ProtoAdapter<MailOpenEmlResponse> ADAPTER = new C16851b();
    private static final long serialVersionUID = 0;
    public final Message message;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOpenEmlResponse$b */
    private static final class C16851b extends ProtoAdapter<MailOpenEmlResponse> {
        C16851b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailOpenEmlResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailOpenEmlResponse mailOpenEmlResponse) {
            int i;
            int i2 = 0;
            if (mailOpenEmlResponse.message != null) {
                i = Message.ADAPTER.encodedSizeWithTag(1, mailOpenEmlResponse.message);
            } else {
                i = 0;
            }
            if (mailOpenEmlResponse.token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailOpenEmlResponse.token);
            }
            return i + i2 + mailOpenEmlResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailOpenEmlResponse decode(ProtoReader protoReader) throws IOException {
            C16850a aVar = new C16850a();
            aVar.f43315b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43314a = Message.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43315b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailOpenEmlResponse mailOpenEmlResponse) throws IOException {
            if (mailOpenEmlResponse.message != null) {
                Message.ADAPTER.encodeWithTag(protoWriter, 1, mailOpenEmlResponse.message);
            }
            if (mailOpenEmlResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailOpenEmlResponse.token);
            }
            protoWriter.writeBytes(mailOpenEmlResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOpenEmlResponse$a */
    public static final class C16850a extends Message.Builder<MailOpenEmlResponse, C16850a> {

        /* renamed from: a */
        public Message f43314a;

        /* renamed from: b */
        public String f43315b;

        /* renamed from: a */
        public MailOpenEmlResponse build() {
            return new MailOpenEmlResponse(this.f43314a, this.f43315b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16850a newBuilder() {
        C16850a aVar = new C16850a();
        aVar.f43314a = this.message;
        aVar.f43315b = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailOpenEmlResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "MailOpenEmlResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailOpenEmlResponse(Message message2, String str) {
        this(message2, str, ByteString.EMPTY);
    }

    public MailOpenEmlResponse(Message message2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = message2;
        this.token = str;
    }
}
