package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateSignatureUsageResponse extends Message<MailUpdateSignatureUsageResponse, C16962a> {
    public static final ProtoAdapter<MailUpdateSignatureUsageResponse> ADAPTER = new C16963b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageResponse$b */
    private static final class C16963b extends ProtoAdapter<MailUpdateSignatureUsageResponse> {
        C16963b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateSignatureUsageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateSignatureUsageResponse mailUpdateSignatureUsageResponse) {
            return mailUpdateSignatureUsageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateSignatureUsageResponse decode(ProtoReader protoReader) throws IOException {
            C16962a aVar = new C16962a();
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
        public void encode(ProtoWriter protoWriter, MailUpdateSignatureUsageResponse mailUpdateSignatureUsageResponse) throws IOException {
            protoWriter.writeBytes(mailUpdateSignatureUsageResponse.unknownFields());
        }
    }

    public MailUpdateSignatureUsageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageResponse$a */
    public static final class C16962a extends Message.Builder<MailUpdateSignatureUsageResponse, C16962a> {
        /* renamed from: a */
        public MailUpdateSignatureUsageResponse build() {
            return new MailUpdateSignatureUsageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16962a newBuilder() {
        C16962a aVar = new C16962a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateSignatureUsageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailUpdateSignatureUsageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateSignatureUsageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
