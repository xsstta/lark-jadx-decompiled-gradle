package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCancelScheduleSendResponse extends Message<MailCancelScheduleSendResponse, C16648a> {
    public static final ProtoAdapter<MailCancelScheduleSendResponse> ADAPTER = new C16649b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse$b */
    private static final class C16649b extends ProtoAdapter<MailCancelScheduleSendResponse> {
        C16649b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCancelScheduleSendResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCancelScheduleSendResponse mailCancelScheduleSendResponse) {
            return mailCancelScheduleSendResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCancelScheduleSendResponse decode(ProtoReader protoReader) throws IOException {
            C16648a aVar = new C16648a();
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
        public void encode(ProtoWriter protoWriter, MailCancelScheduleSendResponse mailCancelScheduleSendResponse) throws IOException {
            protoWriter.writeBytes(mailCancelScheduleSendResponse.unknownFields());
        }
    }

    public MailCancelScheduleSendResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse$a */
    public static final class C16648a extends Message.Builder<MailCancelScheduleSendResponse, C16648a> {
        /* renamed from: a */
        public MailCancelScheduleSendResponse build() {
            return new MailCancelScheduleSendResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16648a newBuilder() {
        C16648a aVar = new C16648a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCancelScheduleSendResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailCancelScheduleSendResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCancelScheduleSendResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
