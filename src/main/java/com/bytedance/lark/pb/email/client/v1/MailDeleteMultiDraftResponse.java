package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailDeleteMultiDraftResponse extends Message<MailDeleteMultiDraftResponse, C16696a> {
    public static final ProtoAdapter<MailDeleteMultiDraftResponse> ADAPTER = new C16697b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftResponse$b */
    private static final class C16697b extends ProtoAdapter<MailDeleteMultiDraftResponse> {
        C16697b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteMultiDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteMultiDraftResponse mailDeleteMultiDraftResponse) {
            return mailDeleteMultiDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteMultiDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16696a aVar = new C16696a();
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
        public void encode(ProtoWriter protoWriter, MailDeleteMultiDraftResponse mailDeleteMultiDraftResponse) throws IOException {
            protoWriter.writeBytes(mailDeleteMultiDraftResponse.unknownFields());
        }
    }

    public MailDeleteMultiDraftResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftResponse$a */
    public static final class C16696a extends Message.Builder<MailDeleteMultiDraftResponse, C16696a> {
        /* renamed from: a */
        public MailDeleteMultiDraftResponse build() {
            return new MailDeleteMultiDraftResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16696a newBuilder() {
        C16696a aVar = new C16696a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteMultiDraftResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailDeleteMultiDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteMultiDraftResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
