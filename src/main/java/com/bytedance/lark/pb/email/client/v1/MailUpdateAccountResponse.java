package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateAccountResponse extends Message<MailUpdateAccountResponse, C16932a> {
    public static final ProtoAdapter<MailUpdateAccountResponse> ADAPTER = new C16933b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse$b */
    private static final class C16933b extends ProtoAdapter<MailUpdateAccountResponse> {
        C16933b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateAccountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateAccountResponse mailUpdateAccountResponse) {
            return mailUpdateAccountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateAccountResponse decode(ProtoReader protoReader) throws IOException {
            C16932a aVar = new C16932a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateAccountResponse mailUpdateAccountResponse) throws IOException {
            protoWriter.writeBytes(mailUpdateAccountResponse.unknownFields());
        }
    }

    public MailUpdateAccountResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse$a */
    public static final class C16932a extends Message.Builder<MailUpdateAccountResponse, C16932a> {
        /* renamed from: a */
        public MailUpdateAccountResponse build() {
            return new MailUpdateAccountResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16932a newBuilder() {
        C16932a aVar = new C16932a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateAccountResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailUpdateAccountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateAccountResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
