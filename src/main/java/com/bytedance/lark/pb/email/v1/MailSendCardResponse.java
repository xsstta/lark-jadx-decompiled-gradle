package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSendCardResponse extends Message<MailSendCardResponse, C17040a> {
    public static final ProtoAdapter<MailSendCardResponse> ADAPTER = new C17041b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSendCardResponse$b */
    private static final class C17041b extends ProtoAdapter<MailSendCardResponse> {
        C17041b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSendCardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSendCardResponse mailSendCardResponse) {
            return mailSendCardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSendCardResponse decode(ProtoReader protoReader) throws IOException {
            C17040a aVar = new C17040a();
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
        public void encode(ProtoWriter protoWriter, MailSendCardResponse mailSendCardResponse) throws IOException {
            protoWriter.writeBytes(mailSendCardResponse.unknownFields());
        }
    }

    public MailSendCardResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSendCardResponse$a */
    public static final class C17040a extends Message.Builder<MailSendCardResponse, C17040a> {
        /* renamed from: a */
        public MailSendCardResponse build() {
            return new MailSendCardResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17040a newBuilder() {
        C17040a aVar = new C17040a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSendCardResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailSendCardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSendCardResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
