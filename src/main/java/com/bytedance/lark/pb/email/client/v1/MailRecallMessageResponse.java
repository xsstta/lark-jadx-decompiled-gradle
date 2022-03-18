package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRecallMessageResponse extends Message<MailRecallMessageResponse, C16856a> {
    public static final ProtoAdapter<MailRecallMessageResponse> ADAPTER = new C16857b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRecallMessageResponse$b */
    private static final class C16857b extends ProtoAdapter<MailRecallMessageResponse> {
        C16857b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRecallMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRecallMessageResponse mailRecallMessageResponse) {
            return mailRecallMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailRecallMessageResponse decode(ProtoReader protoReader) throws IOException {
            C16856a aVar = new C16856a();
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
        public void encode(ProtoWriter protoWriter, MailRecallMessageResponse mailRecallMessageResponse) throws IOException {
            protoWriter.writeBytes(mailRecallMessageResponse.unknownFields());
        }
    }

    public MailRecallMessageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRecallMessageResponse$a */
    public static final class C16856a extends Message.Builder<MailRecallMessageResponse, C16856a> {
        /* renamed from: a */
        public MailRecallMessageResponse build() {
            return new MailRecallMessageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16856a newBuilder() {
        C16856a aVar = new C16856a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRecallMessageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailRecallMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailRecallMessageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
