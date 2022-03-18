package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetScheduleMessageCountResponse extends Message<MailGetScheduleMessageCountResponse, C16770a> {
    public static final ProtoAdapter<MailGetScheduleMessageCountResponse> ADAPTER = new C16771b();
    public static final Long DEFAULT_SCHEDULE_SEND_MESSAGE_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long schedule_send_message_count;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountResponse$b */
    private static final class C16771b extends ProtoAdapter<MailGetScheduleMessageCountResponse> {
        C16771b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetScheduleMessageCountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetScheduleMessageCountResponse mailGetScheduleMessageCountResponse) {
            int i;
            if (mailGetScheduleMessageCountResponse.schedule_send_message_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, mailGetScheduleMessageCountResponse.schedule_send_message_count);
            } else {
                i = 0;
            }
            return i + mailGetScheduleMessageCountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetScheduleMessageCountResponse decode(ProtoReader protoReader) throws IOException {
            C16770a aVar = new C16770a();
            aVar.f43244a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43244a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetScheduleMessageCountResponse mailGetScheduleMessageCountResponse) throws IOException {
            if (mailGetScheduleMessageCountResponse.schedule_send_message_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, mailGetScheduleMessageCountResponse.schedule_send_message_count);
            }
            protoWriter.writeBytes(mailGetScheduleMessageCountResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountResponse$a */
    public static final class C16770a extends Message.Builder<MailGetScheduleMessageCountResponse, C16770a> {

        /* renamed from: a */
        public Long f43244a;

        /* renamed from: a */
        public MailGetScheduleMessageCountResponse build() {
            return new MailGetScheduleMessageCountResponse(this.f43244a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16770a newBuilder() {
        C16770a aVar = new C16770a();
        aVar.f43244a = this.schedule_send_message_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetScheduleMessageCountResponse");
        StringBuilder sb = new StringBuilder();
        if (this.schedule_send_message_count != null) {
            sb.append(", schedule_send_message_count=");
            sb.append(this.schedule_send_message_count);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetScheduleMessageCountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetScheduleMessageCountResponse(Long l) {
        this(l, ByteString.EMPTY);
    }

    public MailGetScheduleMessageCountResponse(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schedule_send_message_count = l;
    }
}
