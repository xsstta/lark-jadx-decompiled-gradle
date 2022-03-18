package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetSharedCalendarEventResponse extends Message<GetSharedCalendarEventResponse, C15786a> {
    public static final ProtoAdapter<GetSharedCalendarEventResponse> ADAPTER = new C15787b();
    public static final Boolean DEFAULT_IS_JOINABLE = true;
    public static final EventSource DEFAULT_SOURCE = EventSource.Local;
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final Boolean is_joinable;
    public final EventSource source;

    public enum EventSource implements WireEnum {
        Local(1),
        Server(2);
        
        public static final ProtoAdapter<EventSource> ADAPTER = ProtoAdapter.newEnumAdapter(EventSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventSource fromValue(int i) {
            if (i == 1) {
                return Local;
            }
            if (i != 2) {
                return null;
            }
            return Server;
        }

        private EventSource(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventResponse$b */
    private static final class C15787b extends ProtoAdapter<GetSharedCalendarEventResponse> {
        C15787b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSharedCalendarEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSharedCalendarEventResponse getSharedCalendarEventResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getSharedCalendarEventResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getSharedCalendarEventResponse.event);
            } else {
                i = 0;
            }
            if (getSharedCalendarEventResponse.is_joinable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getSharedCalendarEventResponse.is_joinable);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getSharedCalendarEventResponse.source != null) {
                i3 = EventSource.ADAPTER.encodedSizeWithTag(3, getSharedCalendarEventResponse.source);
            }
            return i4 + i3 + getSharedCalendarEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSharedCalendarEventResponse decode(ProtoReader protoReader) throws IOException {
            C15786a aVar = new C15786a();
            aVar.f41564b = true;
            aVar.f41565c = EventSource.Local;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41563a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41564b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41565c = EventSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSharedCalendarEventResponse getSharedCalendarEventResponse) throws IOException {
            if (getSharedCalendarEventResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getSharedCalendarEventResponse.event);
            }
            if (getSharedCalendarEventResponse.is_joinable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getSharedCalendarEventResponse.is_joinable);
            }
            if (getSharedCalendarEventResponse.source != null) {
                EventSource.ADAPTER.encodeWithTag(protoWriter, 3, getSharedCalendarEventResponse.source);
            }
            protoWriter.writeBytes(getSharedCalendarEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetSharedCalendarEventResponse$a */
    public static final class C15786a extends Message.Builder<GetSharedCalendarEventResponse, C15786a> {

        /* renamed from: a */
        public CalendarEvent f41563a;

        /* renamed from: b */
        public Boolean f41564b;

        /* renamed from: c */
        public EventSource f41565c;

        /* renamed from: a */
        public GetSharedCalendarEventResponse build() {
            return new GetSharedCalendarEventResponse(this.f41563a, this.f41564b, this.f41565c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15786a newBuilder() {
        C15786a aVar = new C15786a();
        aVar.f41563a = this.event;
        aVar.f41564b = this.is_joinable;
        aVar.f41565c = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetSharedCalendarEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.is_joinable != null) {
            sb.append(", is_joinable=");
            sb.append(this.is_joinable);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSharedCalendarEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSharedCalendarEventResponse(CalendarEvent calendarEvent, Boolean bool, EventSource eventSource) {
        this(calendarEvent, bool, eventSource, ByteString.EMPTY);
    }

    public GetSharedCalendarEventResponse(CalendarEvent calendarEvent, Boolean bool, EventSource eventSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.is_joinable = bool;
        this.source = eventSource;
    }
}
