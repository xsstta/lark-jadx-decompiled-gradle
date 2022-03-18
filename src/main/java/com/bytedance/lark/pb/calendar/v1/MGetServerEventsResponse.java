package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetServerEventsResponse extends Message<MGetServerEventsResponse, C15850a> {
    public static final ProtoAdapter<MGetServerEventsResponse> ADAPTER = new C15851b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEvent> calendar_events;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsResponse$b */
    private static final class C15851b extends ProtoAdapter<MGetServerEventsResponse> {
        C15851b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerEventsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerEventsResponse mGetServerEventsResponse) {
            return CalendarEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetServerEventsResponse.calendar_events) + mGetServerEventsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerEventsResponse decode(ProtoReader protoReader) throws IOException {
            C15850a aVar = new C15850a();
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
                    aVar.f41664a.add(CalendarEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerEventsResponse mGetServerEventsResponse) throws IOException {
            CalendarEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetServerEventsResponse.calendar_events);
            protoWriter.writeBytes(mGetServerEventsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsResponse$a */
    public static final class C15850a extends Message.Builder<MGetServerEventsResponse, C15850a> {

        /* renamed from: a */
        public List<CalendarEvent> f41664a = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerEventsResponse build() {
            return new MGetServerEventsResponse(this.f41664a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15850a newBuilder() {
        C15850a aVar = new C15850a();
        aVar.f41664a = Internal.copyOf("calendar_events", this.calendar_events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerEventsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_events.isEmpty()) {
            sb.append(", calendar_events=");
            sb.append(this.calendar_events);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerEventsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerEventsResponse(List<CalendarEvent> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetServerEventsResponse(List<CalendarEvent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_events = Internal.immutableCopyOf("calendar_events", list);
    }
}
