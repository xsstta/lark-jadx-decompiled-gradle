package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailReplyCalendarEventResponse extends Message<MailReplyCalendarEventResponse, C16864a> {
    public static final ProtoAdapter<MailReplyCalendarEventResponse> ADAPTER = new C16865b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventResponse$b */
    private static final class C16865b extends ProtoAdapter<MailReplyCalendarEventResponse> {
        C16865b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailReplyCalendarEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailReplyCalendarEventResponse mailReplyCalendarEventResponse) {
            return mailReplyCalendarEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailReplyCalendarEventResponse decode(ProtoReader protoReader) throws IOException {
            C16864a aVar = new C16864a();
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
        public void encode(ProtoWriter protoWriter, MailReplyCalendarEventResponse mailReplyCalendarEventResponse) throws IOException {
            protoWriter.writeBytes(mailReplyCalendarEventResponse.unknownFields());
        }
    }

    public MailReplyCalendarEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventResponse$a */
    public static final class C16864a extends Message.Builder<MailReplyCalendarEventResponse, C16864a> {
        /* renamed from: a */
        public MailReplyCalendarEventResponse build() {
            return new MailReplyCalendarEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16864a newBuilder() {
        C16864a aVar = new C16864a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailReplyCalendarEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailReplyCalendarEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailReplyCalendarEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
