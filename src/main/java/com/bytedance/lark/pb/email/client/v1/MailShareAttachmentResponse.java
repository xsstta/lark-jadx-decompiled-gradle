package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailShareAttachmentResponse extends Message<MailShareAttachmentResponse, C16892a> {
    public static final ProtoAdapter<MailShareAttachmentResponse> ADAPTER = new C16893b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailShareAttachmentResponse$b */
    private static final class C16893b extends ProtoAdapter<MailShareAttachmentResponse> {
        C16893b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailShareAttachmentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailShareAttachmentResponse mailShareAttachmentResponse) {
            return mailShareAttachmentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailShareAttachmentResponse decode(ProtoReader protoReader) throws IOException {
            C16892a aVar = new C16892a();
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
        public void encode(ProtoWriter protoWriter, MailShareAttachmentResponse mailShareAttachmentResponse) throws IOException {
            protoWriter.writeBytes(mailShareAttachmentResponse.unknownFields());
        }
    }

    public MailShareAttachmentResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailShareAttachmentResponse$a */
    public static final class C16892a extends Message.Builder<MailShareAttachmentResponse, C16892a> {
        /* renamed from: a */
        public MailShareAttachmentResponse build() {
            return new MailShareAttachmentResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16892a newBuilder() {
        C16892a aVar = new C16892a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailShareAttachmentResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailShareAttachmentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailShareAttachmentResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
