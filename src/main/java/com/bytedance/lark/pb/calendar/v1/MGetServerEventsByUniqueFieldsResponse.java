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

public final class MGetServerEventsByUniqueFieldsResponse extends Message<MGetServerEventsByUniqueFieldsResponse, C15846a> {
    public static final ProtoAdapter<MGetServerEventsByUniqueFieldsResponse> ADAPTER = new C15847b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEvent> calendar_events;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsResponse$b */
    private static final class C15847b extends ProtoAdapter<MGetServerEventsByUniqueFieldsResponse> {
        C15847b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerEventsByUniqueFieldsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerEventsByUniqueFieldsResponse mGetServerEventsByUniqueFieldsResponse) {
            return CalendarEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetServerEventsByUniqueFieldsResponse.calendar_events) + mGetServerEventsByUniqueFieldsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerEventsByUniqueFieldsResponse decode(ProtoReader protoReader) throws IOException {
            C15846a aVar = new C15846a();
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
                    aVar.f41659a.add(CalendarEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerEventsByUniqueFieldsResponse mGetServerEventsByUniqueFieldsResponse) throws IOException {
            CalendarEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetServerEventsByUniqueFieldsResponse.calendar_events);
            protoWriter.writeBytes(mGetServerEventsByUniqueFieldsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsResponse$a */
    public static final class C15846a extends Message.Builder<MGetServerEventsByUniqueFieldsResponse, C15846a> {

        /* renamed from: a */
        public List<CalendarEvent> f41659a = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerEventsByUniqueFieldsResponse build() {
            return new MGetServerEventsByUniqueFieldsResponse(this.f41659a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15846a newBuilder() {
        C15846a aVar = new C15846a();
        aVar.f41659a = Internal.copyOf("calendar_events", this.calendar_events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerEventsByUniqueFieldsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_events.isEmpty()) {
            sb.append(", calendar_events=");
            sb.append(this.calendar_events);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerEventsByUniqueFieldsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerEventsByUniqueFieldsResponse(List<CalendarEvent> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetServerEventsByUniqueFieldsResponse(List<CalendarEvent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_events = Internal.immutableCopyOf("calendar_events", list);
    }
}
