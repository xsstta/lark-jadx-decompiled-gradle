package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class NoticeClientEventRequest extends Message<NoticeClientEventRequest, C15097a> {
    public static final ProtoAdapter<NoticeClientEventRequest> ADAPTER = new C15098b();
    public static final Event DEFAULT_EVENT = Event.ENTER_FOREGROUND;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Event event;
    public final Long update_time;

    public enum Event implements WireEnum {
        ENTER_FOREGROUND(1),
        ENTER_BACKGROUND(2),
        TERMINATING(3),
        MEMORY_WARNING(4),
        FIRST_SCREEN_FINISHED(5),
        CHAT_MESSAGE_GOT(6);
        
        public static final ProtoAdapter<Event> ADAPTER = ProtoAdapter.newEnumAdapter(Event.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Event fromValue(int i) {
            switch (i) {
                case 1:
                    return ENTER_FOREGROUND;
                case 2:
                    return ENTER_BACKGROUND;
                case 3:
                    return TERMINATING;
                case 4:
                    return MEMORY_WARNING;
                case 5:
                    return FIRST_SCREEN_FINISHED;
                case 6:
                    return CHAT_MESSAGE_GOT;
                default:
                    return null;
            }
        }

        private Event(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NoticeClientEventRequest$b */
    private static final class C15098b extends ProtoAdapter<NoticeClientEventRequest> {
        C15098b() {
            super(FieldEncoding.LENGTH_DELIMITED, NoticeClientEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(NoticeClientEventRequest noticeClientEventRequest) {
            int i;
            int encodedSizeWithTag = Event.ADAPTER.encodedSizeWithTag(1, noticeClientEventRequest.event);
            if (noticeClientEventRequest.update_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, noticeClientEventRequest.update_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + noticeClientEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public NoticeClientEventRequest decode(ProtoReader protoReader) throws IOException {
            C15097a aVar = new C15097a();
            aVar.f40015a = Event.ENTER_FOREGROUND;
            aVar.f40016b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40015a = Event.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40016b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NoticeClientEventRequest noticeClientEventRequest) throws IOException {
            Event.ADAPTER.encodeWithTag(protoWriter, 1, noticeClientEventRequest.event);
            if (noticeClientEventRequest.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, noticeClientEventRequest.update_time);
            }
            protoWriter.writeBytes(noticeClientEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NoticeClientEventRequest$a */
    public static final class C15097a extends Message.Builder<NoticeClientEventRequest, C15097a> {

        /* renamed from: a */
        public Event f40015a;

        /* renamed from: b */
        public Long f40016b;

        /* renamed from: a */
        public NoticeClientEventRequest build() {
            Event event = this.f40015a;
            if (event != null) {
                return new NoticeClientEventRequest(event, this.f40016b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(event, "event");
        }

        /* renamed from: a */
        public C15097a mo55075a(Event event) {
            this.f40015a = event;
            return this;
        }

        /* renamed from: a */
        public C15097a mo55076a(Long l) {
            this.f40016b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15097a newBuilder() {
        C15097a aVar = new C15097a();
        aVar.f40015a = this.event;
        aVar.f40016b = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NoticeClientEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "NoticeClientEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public NoticeClientEventRequest(Event event2, Long l) {
        this(event2, l, ByteString.EMPTY);
    }

    public NoticeClientEventRequest(Event event2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = event2;
        this.update_time = l;
    }
}
