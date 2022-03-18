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

public final class GetAuthorizedEventByUniqueFieldResponse extends Message<GetAuthorizedEventByUniqueFieldResponse, C15646a> {
    public static final ProtoAdapter<GetAuthorizedEventByUniqueFieldResponse> ADAPTER = new C15647b();
    public static final Long DEFAULT_FIXED_START_TIME = 0L;
    public static final EventSource DEFAULT_SOURCE = EventSource.Server;
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final Long fixed_start_time;
    public final EventSource source;

    public enum EventSource implements WireEnum {
        Server(1),
        Local(2);
        
        public static final ProtoAdapter<EventSource> ADAPTER = ProtoAdapter.newEnumAdapter(EventSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventSource fromValue(int i) {
            if (i == 1) {
                return Server;
            }
            if (i != 2) {
                return null;
            }
            return Local;
        }

        private EventSource(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldResponse$b */
    private static final class C15647b extends ProtoAdapter<GetAuthorizedEventByUniqueFieldResponse> {
        C15647b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAuthorizedEventByUniqueFieldResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAuthorizedEventByUniqueFieldResponse getAuthorizedEventByUniqueFieldResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getAuthorizedEventByUniqueFieldResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getAuthorizedEventByUniqueFieldResponse.event);
            } else {
                i = 0;
            }
            if (getAuthorizedEventByUniqueFieldResponse.source != null) {
                i2 = EventSource.ADAPTER.encodedSizeWithTag(2, getAuthorizedEventByUniqueFieldResponse.source);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getAuthorizedEventByUniqueFieldResponse.fixed_start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getAuthorizedEventByUniqueFieldResponse.fixed_start_time);
            }
            return i4 + i3 + getAuthorizedEventByUniqueFieldResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAuthorizedEventByUniqueFieldResponse decode(ProtoReader protoReader) throws IOException {
            C15646a aVar = new C15646a();
            aVar.f41411b = EventSource.Server;
            aVar.f41412c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41410a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f41411b = EventSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41412c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAuthorizedEventByUniqueFieldResponse getAuthorizedEventByUniqueFieldResponse) throws IOException {
            if (getAuthorizedEventByUniqueFieldResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getAuthorizedEventByUniqueFieldResponse.event);
            }
            if (getAuthorizedEventByUniqueFieldResponse.source != null) {
                EventSource.ADAPTER.encodeWithTag(protoWriter, 2, getAuthorizedEventByUniqueFieldResponse.source);
            }
            if (getAuthorizedEventByUniqueFieldResponse.fixed_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getAuthorizedEventByUniqueFieldResponse.fixed_start_time);
            }
            protoWriter.writeBytes(getAuthorizedEventByUniqueFieldResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAuthorizedEventByUniqueFieldResponse$a */
    public static final class C15646a extends Message.Builder<GetAuthorizedEventByUniqueFieldResponse, C15646a> {

        /* renamed from: a */
        public CalendarEvent f41410a;

        /* renamed from: b */
        public EventSource f41411b;

        /* renamed from: c */
        public Long f41412c;

        /* renamed from: a */
        public GetAuthorizedEventByUniqueFieldResponse build() {
            return new GetAuthorizedEventByUniqueFieldResponse(this.f41410a, this.f41411b, this.f41412c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15646a newBuilder() {
        C15646a aVar = new C15646a();
        aVar.f41410a = this.event;
        aVar.f41411b = this.source;
        aVar.f41412c = this.fixed_start_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAuthorizedEventByUniqueFieldResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.fixed_start_time != null) {
            sb.append(", fixed_start_time=");
            sb.append(this.fixed_start_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAuthorizedEventByUniqueFieldResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAuthorizedEventByUniqueFieldResponse(CalendarEvent calendarEvent, EventSource eventSource, Long l) {
        this(calendarEvent, eventSource, l, ByteString.EMPTY);
    }

    public GetAuthorizedEventByUniqueFieldResponse(CalendarEvent calendarEvent, EventSource eventSource, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.source = eventSource;
        this.fixed_start_time = l;
    }
}
