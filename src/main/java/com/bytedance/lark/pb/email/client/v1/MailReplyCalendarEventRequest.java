package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailReplyCalendarEventRequest extends Message<MailReplyCalendarEventRequest, C16862a> {
    public static final ProtoAdapter<MailReplyCalendarEventRequest> ADAPTER = new C16863b();
    public static final Option DEFAULT_OPERATION = Option.ACCEPT;
    private static final long serialVersionUID = 0;
    public final String event_server_id;
    public final Option operation;

    public enum Option implements WireEnum {
        ACCEPT(2),
        TENTATIVE(3),
        REJECT(4);
        
        public static final ProtoAdapter<Option> ADAPTER = ProtoAdapter.newEnumAdapter(Option.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Option fromValue(int i) {
            if (i == 2) {
                return ACCEPT;
            }
            if (i == 3) {
                return TENTATIVE;
            }
            if (i != 4) {
                return null;
            }
            return REJECT;
        }

        private Option(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventRequest$b */
    private static final class C16863b extends ProtoAdapter<MailReplyCalendarEventRequest> {
        C16863b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailReplyCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailReplyCalendarEventRequest mailReplyCalendarEventRequest) {
            int i;
            int i2 = 0;
            if (mailReplyCalendarEventRequest.event_server_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailReplyCalendarEventRequest.event_server_id);
            } else {
                i = 0;
            }
            if (mailReplyCalendarEventRequest.operation != null) {
                i2 = Option.ADAPTER.encodedSizeWithTag(3, mailReplyCalendarEventRequest.operation);
            }
            return i + i2 + mailReplyCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailReplyCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C16862a aVar = new C16862a();
            aVar.f43328a = "";
            aVar.f43329b = Option.ACCEPT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43328a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43329b = Option.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailReplyCalendarEventRequest mailReplyCalendarEventRequest) throws IOException {
            if (mailReplyCalendarEventRequest.event_server_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailReplyCalendarEventRequest.event_server_id);
            }
            if (mailReplyCalendarEventRequest.operation != null) {
                Option.ADAPTER.encodeWithTag(protoWriter, 3, mailReplyCalendarEventRequest.operation);
            }
            protoWriter.writeBytes(mailReplyCalendarEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventRequest$a */
    public static final class C16862a extends Message.Builder<MailReplyCalendarEventRequest, C16862a> {

        /* renamed from: a */
        public String f43328a;

        /* renamed from: b */
        public Option f43329b;

        /* renamed from: a */
        public MailReplyCalendarEventRequest build() {
            return new MailReplyCalendarEventRequest(this.f43328a, this.f43329b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16862a mo59674a(Option option) {
            this.f43329b = option;
            return this;
        }

        /* renamed from: a */
        public C16862a mo59675a(String str) {
            this.f43328a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16862a newBuilder() {
        C16862a aVar = new C16862a();
        aVar.f43328a = this.event_server_id;
        aVar.f43329b = this.operation;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailReplyCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        if (this.event_server_id != null) {
            sb.append(", event_server_id=");
            sb.append(this.event_server_id);
        }
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        StringBuilder replace = sb.replace(0, 2, "MailReplyCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailReplyCalendarEventRequest(String str, Option option) {
        this(str, option, ByteString.EMPTY);
    }

    public MailReplyCalendarEventRequest(String str, Option option, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_server_id = str;
        this.operation = option;
    }
}
