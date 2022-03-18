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

public final class GetExceptionalEventsResponse extends Message<GetExceptionalEventsResponse, C15706a> {
    public static final ProtoAdapter<GetExceptionalEventsResponse> ADAPTER = new C15707b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEvent> exceptional_events;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsResponse$b */
    private static final class C15707b extends ProtoAdapter<GetExceptionalEventsResponse> {
        C15707b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExceptionalEventsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExceptionalEventsResponse getExceptionalEventsResponse) {
            return CalendarEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, getExceptionalEventsResponse.exceptional_events) + getExceptionalEventsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetExceptionalEventsResponse decode(ProtoReader protoReader) throws IOException {
            C15706a aVar = new C15706a();
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
                    aVar.f41465a.add(CalendarEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExceptionalEventsResponse getExceptionalEventsResponse) throws IOException {
            CalendarEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getExceptionalEventsResponse.exceptional_events);
            protoWriter.writeBytes(getExceptionalEventsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetExceptionalEventsResponse$a */
    public static final class C15706a extends Message.Builder<GetExceptionalEventsResponse, C15706a> {

        /* renamed from: a */
        public List<CalendarEvent> f41465a = Internal.newMutableList();

        /* renamed from: a */
        public GetExceptionalEventsResponse build() {
            return new GetExceptionalEventsResponse(this.f41465a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15706a newBuilder() {
        C15706a aVar = new C15706a();
        aVar.f41465a = Internal.copyOf("exceptional_events", this.exceptional_events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetExceptionalEventsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.exceptional_events.isEmpty()) {
            sb.append(", exceptional_events=");
            sb.append(this.exceptional_events);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExceptionalEventsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetExceptionalEventsResponse(List<CalendarEvent> list) {
        this(list, ByteString.EMPTY);
    }

    public GetExceptionalEventsResponse(List<CalendarEvent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.exceptional_events = Internal.immutableCopyOf("exceptional_events", list);
    }
}
