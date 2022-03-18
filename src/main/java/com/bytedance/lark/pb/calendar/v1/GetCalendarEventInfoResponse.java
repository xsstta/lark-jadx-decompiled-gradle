package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarEventInfoResponse extends Message<GetCalendarEventInfoResponse, C15654a> {
    public static final ProtoAdapter<GetCalendarEventInfoResponse> ADAPTER = new C15655b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent calendar_event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoResponse$b */
    private static final class C15655b extends ProtoAdapter<GetCalendarEventInfoResponse> {
        C15655b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarEventInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarEventInfoResponse getCalendarEventInfoResponse) {
            int i;
            if (getCalendarEventInfoResponse.calendar_event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getCalendarEventInfoResponse.calendar_event);
            } else {
                i = 0;
            }
            return i + getCalendarEventInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarEventInfoResponse decode(ProtoReader protoReader) throws IOException {
            C15654a aVar = new C15654a();
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
                    aVar.f41419a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarEventInfoResponse getCalendarEventInfoResponse) throws IOException {
            if (getCalendarEventInfoResponse.calendar_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarEventInfoResponse.calendar_event);
            }
            protoWriter.writeBytes(getCalendarEventInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarEventInfoResponse$a */
    public static final class C15654a extends Message.Builder<GetCalendarEventInfoResponse, C15654a> {

        /* renamed from: a */
        public CalendarEvent f41419a;

        /* renamed from: a */
        public GetCalendarEventInfoResponse build() {
            return new GetCalendarEventInfoResponse(this.f41419a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15654a newBuilder() {
        C15654a aVar = new C15654a();
        aVar.f41419a = this.calendar_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarEventInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_event != null) {
            sb.append(", calendar_event=");
            sb.append(this.calendar_event);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarEventInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarEventInfoResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public GetCalendarEventInfoResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_event = calendarEvent;
    }
}
