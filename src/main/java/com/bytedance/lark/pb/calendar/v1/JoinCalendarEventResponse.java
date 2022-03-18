package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class JoinCalendarEventResponse extends Message<JoinCalendarEventResponse, C15822a> {
    public static final ProtoAdapter<JoinCalendarEventResponse> ADAPTER = new C15823b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent calendar_event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JoinCalendarEventResponse$b */
    private static final class C15823b extends ProtoAdapter<JoinCalendarEventResponse> {
        C15823b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinCalendarEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinCalendarEventResponse joinCalendarEventResponse) {
            int i;
            if (joinCalendarEventResponse.calendar_event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, joinCalendarEventResponse.calendar_event);
            } else {
                i = 0;
            }
            return i + joinCalendarEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinCalendarEventResponse decode(ProtoReader protoReader) throws IOException {
            C15822a aVar = new C15822a();
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
                    aVar.f41619a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinCalendarEventResponse joinCalendarEventResponse) throws IOException {
            if (joinCalendarEventResponse.calendar_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, joinCalendarEventResponse.calendar_event);
            }
            protoWriter.writeBytes(joinCalendarEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.JoinCalendarEventResponse$a */
    public static final class C15822a extends Message.Builder<JoinCalendarEventResponse, C15822a> {

        /* renamed from: a */
        public CalendarEvent f41619a;

        /* renamed from: a */
        public JoinCalendarEventResponse build() {
            return new JoinCalendarEventResponse(this.f41619a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15822a newBuilder() {
        C15822a aVar = new C15822a();
        aVar.f41619a = this.calendar_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "JoinCalendarEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_event != null) {
            sb.append(", calendar_event=");
            sb.append(this.calendar_event);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinCalendarEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinCalendarEventResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public JoinCalendarEventResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_event = calendarEvent;
    }
}
