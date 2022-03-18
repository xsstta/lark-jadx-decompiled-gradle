package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailDeleteLabelResponse extends Message<MailDeleteLabelResponse, C16690a> {
    public static final ProtoAdapter<MailDeleteLabelResponse> ADAPTER = new C16691b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLabelResponse$b */
    private static final class C16691b extends ProtoAdapter<MailDeleteLabelResponse> {
        C16691b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteLabelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteLabelResponse mailDeleteLabelResponse) {
            return mailDeleteLabelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteLabelResponse decode(ProtoReader protoReader) throws IOException {
            C16690a aVar = new C16690a();
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
        public void encode(ProtoWriter protoWriter, MailDeleteLabelResponse mailDeleteLabelResponse) throws IOException {
            protoWriter.writeBytes(mailDeleteLabelResponse.unknownFields());
        }
    }

    public MailDeleteLabelResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLabelResponse$a */
    public static final class C16690a extends Message.Builder<MailDeleteLabelResponse, C16690a> {
        /* renamed from: a */
        public MailDeleteLabelResponse build() {
            return new MailDeleteLabelResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16690a newBuilder() {
        C16690a aVar = new C16690a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteLabelResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailDeleteLabelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteLabelResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
