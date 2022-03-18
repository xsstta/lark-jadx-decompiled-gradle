package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailMultiThreadDeletePermanentlyResponse extends Message<MailMultiThreadDeletePermanentlyResponse, C16834a> {
    public static final ProtoAdapter<MailMultiThreadDeletePermanentlyResponse> ADAPTER = new C16835b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse$b */
    private static final class C16835b extends ProtoAdapter<MailMultiThreadDeletePermanentlyResponse> {
        C16835b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMultiThreadDeletePermanentlyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMultiThreadDeletePermanentlyResponse mailMultiThreadDeletePermanentlyResponse) {
            return mailMultiThreadDeletePermanentlyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailMultiThreadDeletePermanentlyResponse decode(ProtoReader protoReader) throws IOException {
            C16834a aVar = new C16834a();
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
        public void encode(ProtoWriter protoWriter, MailMultiThreadDeletePermanentlyResponse mailMultiThreadDeletePermanentlyResponse) throws IOException {
            protoWriter.writeBytes(mailMultiThreadDeletePermanentlyResponse.unknownFields());
        }
    }

    public MailMultiThreadDeletePermanentlyResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse$a */
    public static final class C16834a extends Message.Builder<MailMultiThreadDeletePermanentlyResponse, C16834a> {
        /* renamed from: a */
        public MailMultiThreadDeletePermanentlyResponse build() {
            return new MailMultiThreadDeletePermanentlyResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16834a newBuilder() {
        C16834a aVar = new C16834a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMultiThreadDeletePermanentlyResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailMultiThreadDeletePermanentlyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailMultiThreadDeletePermanentlyResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
