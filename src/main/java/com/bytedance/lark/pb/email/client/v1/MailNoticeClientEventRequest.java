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

public final class MailNoticeClientEventRequest extends Message<MailNoticeClientEventRequest, C16840a> {
    public static final ProtoAdapter<MailNoticeClientEventRequest> ADAPTER = new C16841b();
    public static final Event DEFAULT_EVENT = Event.MAIL_TAB_SELECTED;
    public static final Long DEFAULT_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final Event event;
    public final Long timestamp;

    public enum Event implements WireEnum {
        MAIL_TAB_SELECTED(1, true),
        APP_DID_ENTER_BACKGROUND(2, null),
        APP_DID_ENTER_FOREGROUND(3, null),
        MAIL_TAB_UNSELECTED(4, true),
        MAIL_PAGE_ACTIVE(5, null),
        MAIL_PAGE_INACTIVE(6, null);
        
        public static final ProtoAdapter<Event> ADAPTER = ProtoAdapter.newEnumAdapter(Event.class);
        public final Boolean deprecated;
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Event fromValue(int i) {
            switch (i) {
                case 1:
                    return MAIL_TAB_SELECTED;
                case 2:
                    return APP_DID_ENTER_BACKGROUND;
                case 3:
                    return APP_DID_ENTER_FOREGROUND;
                case 4:
                    return MAIL_TAB_UNSELECTED;
                case 5:
                    return MAIL_PAGE_ACTIVE;
                case 6:
                    return MAIL_PAGE_INACTIVE;
                default:
                    return null;
            }
        }

        private Event(int i, Boolean bool) {
            this.value = i;
            this.deprecated = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventRequest$b */
    private static final class C16841b extends ProtoAdapter<MailNoticeClientEventRequest> {
        C16841b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailNoticeClientEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailNoticeClientEventRequest mailNoticeClientEventRequest) {
            int i;
            int i2 = 0;
            if (mailNoticeClientEventRequest.event != null) {
                i = Event.ADAPTER.encodedSizeWithTag(1, mailNoticeClientEventRequest.event);
            } else {
                i = 0;
            }
            if (mailNoticeClientEventRequest.timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailNoticeClientEventRequest.timestamp);
            }
            return i + i2 + mailNoticeClientEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailNoticeClientEventRequest decode(ProtoReader protoReader) throws IOException {
            C16840a aVar = new C16840a();
            aVar.f43309a = Event.MAIL_TAB_SELECTED;
            aVar.f43310b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f43309a = Event.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43310b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailNoticeClientEventRequest mailNoticeClientEventRequest) throws IOException {
            if (mailNoticeClientEventRequest.event != null) {
                Event.ADAPTER.encodeWithTag(protoWriter, 1, mailNoticeClientEventRequest.event);
            }
            if (mailNoticeClientEventRequest.timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailNoticeClientEventRequest.timestamp);
            }
            protoWriter.writeBytes(mailNoticeClientEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventRequest$a */
    public static final class C16840a extends Message.Builder<MailNoticeClientEventRequest, C16840a> {

        /* renamed from: a */
        public Event f43309a;

        /* renamed from: b */
        public Long f43310b;

        /* renamed from: a */
        public MailNoticeClientEventRequest build() {
            return new MailNoticeClientEventRequest(this.f43309a, this.f43310b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16840a mo59628a(Event event) {
            this.f43309a = event;
            return this;
        }

        /* renamed from: a */
        public C16840a mo59629a(Long l) {
            this.f43310b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16840a newBuilder() {
        C16840a aVar = new C16840a();
        aVar.f43309a = this.event;
        aVar.f43310b = this.timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailNoticeClientEventRequest");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "MailNoticeClientEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailNoticeClientEventRequest(Event event2, Long l) {
        this(event2, l, ByteString.EMPTY);
    }

    public MailNoticeClientEventRequest(Event event2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = event2;
        this.timestamp = l;
    }
}
