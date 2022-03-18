package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailNoticeClientEventResponse extends Message<MailNoticeClientEventResponse, C16842a> {
    public static final ProtoAdapter<MailNoticeClientEventResponse> ADAPTER = new C16843b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventResponse$b */
    private static final class C16843b extends ProtoAdapter<MailNoticeClientEventResponse> {
        C16843b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailNoticeClientEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailNoticeClientEventResponse mailNoticeClientEventResponse) {
            return mailNoticeClientEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailNoticeClientEventResponse decode(ProtoReader protoReader) throws IOException {
            C16842a aVar = new C16842a();
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
        public void encode(ProtoWriter protoWriter, MailNoticeClientEventResponse mailNoticeClientEventResponse) throws IOException {
            protoWriter.writeBytes(mailNoticeClientEventResponse.unknownFields());
        }
    }

    public MailNoticeClientEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventResponse$a */
    public static final class C16842a extends Message.Builder<MailNoticeClientEventResponse, C16842a> {
        /* renamed from: a */
        public MailNoticeClientEventResponse build() {
            return new MailNoticeClientEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16842a newBuilder() {
        C16842a aVar = new C16842a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailNoticeClientEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailNoticeClientEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailNoticeClientEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
