package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendInvitationToInactiveResponse extends Message<SendInvitationToInactiveResponse, C16370a> {
    public static final ProtoAdapter<SendInvitationToInactiveResponse> ADAPTER = new C16371b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveResponse$b */
    private static final class C16371b extends ProtoAdapter<SendInvitationToInactiveResponse> {
        C16371b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendInvitationToInactiveResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendInvitationToInactiveResponse sendInvitationToInactiveResponse) {
            return sendInvitationToInactiveResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendInvitationToInactiveResponse decode(ProtoReader protoReader) throws IOException {
            C16370a aVar = new C16370a();
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
        public void encode(ProtoWriter protoWriter, SendInvitationToInactiveResponse sendInvitationToInactiveResponse) throws IOException {
            protoWriter.writeBytes(sendInvitationToInactiveResponse.unknownFields());
        }
    }

    public SendInvitationToInactiveResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveResponse$a */
    public static final class C16370a extends Message.Builder<SendInvitationToInactiveResponse, C16370a> {
        /* renamed from: a */
        public SendInvitationToInactiveResponse build() {
            return new SendInvitationToInactiveResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16370a newBuilder() {
        C16370a aVar = new C16370a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendInvitationToInactiveResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendInvitationToInactiveResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendInvitationToInactiveResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
